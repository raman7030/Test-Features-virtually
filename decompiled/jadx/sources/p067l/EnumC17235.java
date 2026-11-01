package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܺۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC17235 {
    DIAGS("diags"),
    DEBUG("debug"),
    SHOULDSTOP("should-stop");


    /* JADX INFO: renamed from: ᩸ */
    public final String f51287;

    EnumC17235(String str) {
        this.f51287 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m39001(AbstractC3154 abstractC3154, String str, String str2) {
        for (String str3 : str2.split(C0249l.f1196b)) {
            String str4 = this.f51287 + "." + str3.trim();
            EnumC2483.f3950.mo3580(abstractC3154, str4, str4);
        }
    }
}
