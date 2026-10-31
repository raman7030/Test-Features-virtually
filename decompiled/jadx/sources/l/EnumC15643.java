package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15643 {
    DIAGS("diags"),
    DEBUG("debug"),
    SHOULDSTOP("should-stop");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f48147;

    EnumC15643(String str) {
        this.f48147 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m36835(AbstractC0827 abstractC0827, String str, String str2) {
        for (String str3 : str2.split(l.b)) {
            String str4 = this.f48147 + "." + str3.trim();
            EnumC0121.f1174.mo1179(abstractC0827, str4, str4);
        }
    }
}
