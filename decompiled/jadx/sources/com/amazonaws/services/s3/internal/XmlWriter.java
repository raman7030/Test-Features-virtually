package com.amazonaws.services.s3.internal;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import l.C20177;
import l.C4248;

/* JADX INFO: loaded from: classes.dex */
public class XmlWriter {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f515 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public StringBuilder f514 = new StringBuilder();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m489(String str) {
        C20177.m46410(this.f514, "<", str, ">");
        this.f515.add(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m488() {
        C20177.m46410(this.f514, "</", (String) C4248.m12790(this.f515, 1), ">");
    }

    public final String toString() {
        return this.f514.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m491() {
        return this.f514.toString().getBytes(StringUtils.f844);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m490(String str) {
        StringBuilder sb;
        String str2;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            sb = this.f514;
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                str2 = "&#9;";
            } else if (cCharAt == '\n') {
                str2 = "&#10;";
            } else if (cCharAt == '\r') {
                str2 = "&#13;";
            } else if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt != '<') {
                str2 = cCharAt != '>' ? null : "&gt;";
            } else {
                str2 = "&lt;";
            }
            if (str2 != null) {
                if (i2 < i) {
                    sb.append((CharSequence) str, i2, i);
                }
                sb.append(str2);
                i2 = i + 1;
            }
            i++;
        }
        if (i2 < i) {
            sb.append((CharSequence) str, i2, i);
        }
    }
}
