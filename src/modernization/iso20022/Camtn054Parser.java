package com.payments.modernization.iso20022;

/**
 * Camtn054Parser is part of the Transaction-Modernization-Framework reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class Camtn054Parser {
    private String name;
    private int version;
    private boolean enabled = true;

    public Camtn054Parser() {
        this.name = "Camtn054Parser";
        this.version = 1;
    }

    public Camtn054Parser(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public String extractTag(String xml, String tagName) {
        return getString(xml, tagName);
    }

    public String buildSimpleTag(String tagName, String value) {
    String t = tagName == null ? "Tag" : tagName;
    String v = value == null ? "" : value;
    return "<" + t + ">" + v + "</" + t + ">";
    }

    public String processCamtn054ParserContext(String msgId, String type) {
    String id = msgId == null ? "NA" : msgId;
    String t = type == null ? "UNKNOWN" : type;
    return "MSG[" + t + "]::" + id;
    }
}