package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class SearchRequest {
    public String language;
    public String query;

    public SearchRequest() {
        this.language = "davbasic";
        this.query = "";
    }

    public SearchRequest(String str, String str2) {
        this.language = str;
        this.query = str2;
    }

    public final String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public final String getQuery() {
        return this.query;
    }

    public void setQuery(String str) {
        this.query = str;
    }
}
