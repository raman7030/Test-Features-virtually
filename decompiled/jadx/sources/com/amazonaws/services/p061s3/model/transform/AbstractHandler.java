package com.amazonaws.services.p061s3.model.transform;

import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractHandler extends DefaultHandler {

    /* JADX INFO: renamed from: ᩹ */
    public final StringBuilder f1847 = new StringBuilder();

    /* JADX INFO: renamed from: ᩸ */
    public final LinkedList f1846 = new LinkedList();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1861(String str, Attributes attributes);

    /* JADX INFO: renamed from: ܳ */
    public abstract void mo1865(String str);

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f1847.setLength(0);
        mo1861(str2, attributes);
        this.f1846.add(str2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f1846.removeLast();
        mo1865(str2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f1847.append(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m1864() {
        return this.f1847.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m1862() {
        return this.f1846.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m1863(String... strArr) {
        int length = strArr.length;
        LinkedList<String> linkedList = this.f1846;
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
