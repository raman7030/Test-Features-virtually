package l;

import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۚۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09J5 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5326 implements InterfaceC21614 {
    SHA_512(1, XMSSKeyParameters.SHA_512);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f16612;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f16613;

    EnumC5326(long j, String str) {
        this.f16613 = j;
        this.f16612 = str;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f16613;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m15263() {
        return this.f16612;
    }
}
