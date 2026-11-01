package com.amazonaws.services.p061s3.internal;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import p067l.C21545;
import p067l.C6406;

/* JADX INFO: loaded from: classes.dex */
public class XmlWriter {

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f1675 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public StringBuilder f1674 = new StringBuilder();

    /* JADX INFO: renamed from: ֫ */
    public final void m1655(String str) {
        C21545.m48729(this.f1674, "<", str, ">");
        this.f1675.add(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1654() {
        C21545.m48729(this.f1674, "</", (String) C6406.m14670(this.f1675, 1), ">");
    }

    public final String toString() {
        return this.f1674.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m1657() {
        return this.f1674.toString().getBytes(StringUtils.f2004);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1656(String str) {
        StringBuilder sb;
        String str2;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            sb = this.f1674;
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
