package p067l;

import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۚۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09J5 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7430 implements InterfaceC22910 {
    SHA_512(1, XMSSKeyParameters.SHA_512);


    /* JADX INFO: renamed from: ᩸ */
    public String f19451;

    /* JADX INFO: renamed from: ᩹ */
    public long f19452;

    EnumC7430(long j, String str) {
        this.f19452 = j;
        this.f19451 = str;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f19452;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m17169() {
        return this.f19451;
    }
}
