package com.tencent.p062mm.opensdk.channel.p063a;

import com.tencent.p062mm.opensdk.utils.C0624b;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0606b {
    /* JADX INFO: renamed from: a */
    public static byte[] m2007a(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return C0624b.m2027c(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
