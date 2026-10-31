package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩻᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FL */
/* JADX INFO: loaded from: classes2.dex */
public final class C24002 extends C16614 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte f77793;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC22094 f77794;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f77795;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumSet f77796;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f77797;

    public C24002() {
    }

    public C24002(EnumC22094 enumC22094, EnumSet enumSet, EnumSet enumSet2) {
        super(enumC22094, EnumC22799.SMB2_SESSION_SETUP);
        this.f77794 = enumC22094;
        this.f77793 = (byte) C15262.m36277(enumSet);
        this.f77795 = C15262.m36277(enumSet2);
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8728(C0097 c0097) {
        c0097.m26086(this.f51046);
        this.f77794.m49681();
        c0097.m26075((byte) 0);
        c0097.m26075(this.f77793);
        c0097.m26088(this.f77795 & 255);
        c0097.m1081();
        c0097.m26086(88);
        byte[] bArr = this.f77797;
        c0097.m26086(bArr != null ? bArr.length : 0);
        c0097.m26093(0L);
        byte[] bArr2 = this.f77797;
        if (bArr2 != null) {
            c0097.m26077(bArr2.length, bArr2);
        }
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ۧ */
    public final void mo7050(C0097 c0097) throws C13146 {
        byte[] bArr;
        c0097.m26100();
        this.f77796 = C15262.m36278(c0097.m26100(), EnumC14829.class);
        int iM26100 = c0097.m26100();
        int iM26101 = c0097.m26100();
        if (iM26101 > 0) {
            c0097.m26097(iM26100);
            bArr = new byte[iM26101];
            c0097.m26087(iM26101, bArr);
        } else {
            bArr = new byte[0];
        }
        this.f77797 = bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumSet m52840() {
        return this.f77796;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52838(byte[] bArr) {
        this.f77797 = bArr;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] m52839() {
        return this.f77797;
    }
}
