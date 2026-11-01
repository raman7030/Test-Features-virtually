package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۙ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7UY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7016 extends C14392 {
    public static final long serialVersionUID = -1;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7016(int i, String str, String str2) {
        String str3;
        Locale locale = Locale.ROOT;
        switch (i) {
            case 0:
                str3 = "kex";
                break;
            case 1:
                str3 = "server_host_key";
                break;
            case 2:
                str3 = "cipher.c2s";
                break;
            case 3:
                str3 = "cipher.s2c";
                break;
            case 4:
                str3 = "mac.c2s";
                break;
            case 5:
                str3 = "mac.s2c";
                break;
            case 6:
                str3 = "compression.c2s";
                break;
            case 7:
                str3 = "compression.s2c";
                break;
            case 8:
                str3 = "lang.c2s";
                break;
            case 9:
                str3 = "lang.s2c";
                break;
            default:
                str3 = "";
                break;
        }
        super(C10965.m25286(C5633.m12525("Algorithm negotiation fail: algorithmName=\"", str3, "\" jschProposal=\"", str, "\" serverProposal=\""), str2, "\""));
    }
}
