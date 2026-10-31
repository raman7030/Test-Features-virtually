package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class ErrorMessage {

    @Element
    public String exception;

    @Element
    public String message;

    public String getException() {
        return this.exception;
    }

    public void setException(String str) {
        this.exception = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
