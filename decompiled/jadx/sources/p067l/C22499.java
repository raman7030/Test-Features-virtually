package p067l;

/* JADX INFO: renamed from: l.᩷᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9897 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22499 extends C18158 {

    /* JADX INFO: renamed from: ۜ */
    public final EnumC9087 f70941;

    /* JADX INFO: renamed from: ܳ */
    public final C13978 f70942;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f70943;

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC12756 f70944;

    public C22499(EnumC23366 enumC23366, long j, long j2, EnumC9087 enumC9087, C13978 c13978, EnumC12756 enumC12756, byte[] bArr) {
        super(33, enumC23366, EnumC24036.SMB2_SET_INFO, j, j2);
        this.f70942 = c13978;
        this.f70941 = enumC9087;
        this.f70944 = enumC12756;
        this.f70943 = bArr;
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10795(C2460 c2460) {
        c2460.m28111(this.f54223);
        c2460.m28100((byte) this.f70941.getValue());
        EnumC12756 enumC12756 = this.f70944;
        c2460.m28100(enumC12756 == null ? (byte) 0 : (byte) enumC12756.getValue());
        byte[] bArr = this.f70943;
        c2460.m28113(bArr.length);
        c2460.m28111(96);
        c2460.m3476();
        c2460.m28113(0L);
        this.f70942.m31769(c2460);
        c2460.m28102(bArr.length, bArr);
    }
}
