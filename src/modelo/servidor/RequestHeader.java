/*
 * To change this license headerchoose License Headers in Project Properties
 * To change this template filechoose Tools  Templates
 * and open the template in the editor
 */
package modelo.servidor;

/**
 *
 * @author ignoi
 */
public class RequestHeader {

    private String accept;
    private String accept_charset;
    private String accept_encoding;
    private String accept_language;
    private String authorization;
    private String expect;
    private String from;
    private String if_match;
    private String if_modified_since;
    private String if_none_match;
    private String if_range;
    private String if_unmodified_since;
    private String max_forwards;
    private String proxy_authorization;
    private String range;
    private String referer;
    private String te;
    private String user_agent;

    public RequestHeader() {
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getAccept_charset() {
        return accept_charset;
    }

    public void setAccept_charset(String accept_charset) {
        this.accept_charset = accept_charset;
    }

    public String getAccept_encoding() {
        return accept_encoding;
    }

    public void setAccept_encoding(String accept_encoding) {
        this.accept_encoding = accept_encoding;
    }

    public String getAccept_language() {
        return accept_language;
    }

    public void setAccept_language(String accept_language) {
        this.accept_language = accept_language;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getIf_match() {
        return if_match;
    }

    public void setIf_match(String if_match) {
        this.if_match = if_match;
    }

    public String getIf_modified_since() {
        return if_modified_since;
    }

    public void setIf_modified_since(String if_modified_since) {
        this.if_modified_since = if_modified_since;
    }

    public String getIf_none_match() {
        return if_none_match;
    }

    public void setIf_none_match(String if_none_match) {
        this.if_none_match = if_none_match;
    }

    public String getIf_range() {
        return if_range;
    }

    public void setIf_range(String if_range) {
        this.if_range = if_range;
    }

    public String getIf_unmodified_since() {
        return if_unmodified_since;
    }

    public void setIf_unmodified_since(String if_unmodified_since) {
        this.if_unmodified_since = if_unmodified_since;
    }

    public String getMax_forwards() {
        return max_forwards;
    }

    public void setMax_forwards(String max_forwards) {
        this.max_forwards = max_forwards;
    }

    public String getProxy_authorization() {
        return proxy_authorization;
    }

    public void setProxy_authorization(String proxy_authorization) {
        this.proxy_authorization = proxy_authorization;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    @Override
    public String toString() {
        return "accept: " + accept
                + "\naccept_encoding: " + accept_encoding
                + "\naccept_language: " + accept_language
                + "\nuser_agent: " + user_agent;

    }

}
