package com.amazonaws.services.s3.model.transform;

import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractHandler extends DefaultHandler {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final StringBuilder f687 = new StringBuilder();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedList f686 = new LinkedList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo696(String str, Attributes attributes);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract void mo700(String str);

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f687.setLength(0);
        mo696(str2, attributes);
        this.f686.add(str2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f686.removeLast();
        mo700(str2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f687.append(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m699() {
        return this.f687.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m697() {
        return this.f686.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m698(String... strArr) {
        int length = strArr.length;
        LinkedList<String> linkedList = this.f686;
        if (length == linkedList.size()) {
            int i = 0;
            for (String str : linkedList) {
                String str2 = strArr[i];
                if (str2.equals("*") || str2.equals(str)) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
