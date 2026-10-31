package l;

/* JADX INFO: renamed from: l.᩷᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9897 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21181 extends C16614 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC7069 f68259;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12216 f68260;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f68261;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC10930 f68262;

    public C21181(EnumC22094 enumC22094, long j, long j2, EnumC7069 enumC7069, C12216 c12216, EnumC10930 enumC10930, byte[] bArr) {
        super(33, enumC22094, EnumC22799.SMB2_SET_INFO, j, j2);
        this.f68260 = c12216;
        this.f68259 = enumC7069;
        this.f68262 = enumC10930;
        this.f68261 = bArr;
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8728(C0097 c0097) {
        c0097.m26086(this.f51046);
        c0097.m26075((byte) this.f68259.getValue());
        EnumC10930 enumC10930 = this.f68262;
        c0097.m26075(enumC10930 == null ? (byte) 0 : (byte) enumC10930.getValue());
        byte[] bArr = this.f68261;
        c0097.m26088(bArr.length);
        c0097.m26086(96);
        c0097.m1080();
        c0097.m26088(0L);
        this.f68260.m29707(c0097);
        c0097.m26077(bArr.length, bArr);
    }
}
