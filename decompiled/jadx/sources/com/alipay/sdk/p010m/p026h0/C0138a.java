package com.alipay.sdk.p010m.p026h0;

import com.alipay.sdk.p010m.p018d0.C0106a;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: renamed from: com.alipay.sdk.m.h0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0138a {

    /* JADX INFO: renamed from: a */
    public String f470a;

    /* JADX INFO: renamed from: b */
    public String f471b;

    /* JADX INFO: renamed from: c */
    public String f472c;

    /* JADX INFO: renamed from: d */
    public String f473d;

    /* JADX INFO: renamed from: e */
    public String f474e;

    /* JADX INFO: renamed from: f */
    public String f475f;

    /* JADX INFO: renamed from: g */
    public String f476g;

    public C0138a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f470a = str;
        this.f471b = str2;
        this.f472c = str3;
        this.f473d = str4;
        this.f474e = str5;
        this.f475f = str6;
        this.f476g = str7;
    }

    public String toString() {
        StringBuilder sb;
        String strSubstring;
        StringBuilder sb2;
        String strSubstring2;
        StringBuilder sb3;
        String strSubstring3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f470a);
        stringBuffer.append("," + this.f471b);
        stringBuffer.append("," + this.f472c);
        stringBuffer.append("," + this.f473d);
        if (C0106a.m564a(this.f474e) || this.f474e.length() < 20) {
            sb = new StringBuilder(",");
            strSubstring = this.f474e;
        } else {
            sb = new StringBuilder(",");
            strSubstring = this.f474e.substring(0, 20);
        }
        sb.append(strSubstring);
        stringBuffer.append(sb.toString());
        if (C0106a.m564a(this.f475f) || this.f475f.length() < 20) {
            sb2 = new StringBuilder(",");
            strSubstring2 = this.f475f;
        } else {
            sb2 = new StringBuilder(",");
            strSubstring2 = this.f475f.substring(0, 20);
        }
        sb2.append(strSubstring2);
        stringBuffer.append(sb2.toString());
        if (C0106a.m564a(this.f476g) || this.f476g.length() < 20) {
            sb3 = new StringBuilder(",");
            strSubstring3 = this.f476g;
        } else {
            sb3 = new StringBuilder(",");
            strSubstring3 = this.f476g.substring(0, 20);
        }
        sb3.append(strSubstring3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}
