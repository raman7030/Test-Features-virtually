package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57D5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5420 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ۗ */
    public C17450 f12906;

    /* JADX INFO: renamed from: ۙ */
    public short f12907;

    /* JADX INFO: renamed from: ۬ */
    public short f12908;

    /* JADX INFO: renamed from: ᩶ */
    public final short f12909;

    /* JADX INFO: renamed from: ᩸ */
    public C17450 f12910;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC24866 f12911;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 10;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C5420(short s, short s2, C17450 c17450, C17450 c17451) {
        this.f12909 = s;
        this.f12908 = s2;
        this.f12906 = c17450;
        this.f12910 = c17451;
    }

    public C5420(short s, short s2, short s3, C17450 c17450, C17450 c17451) {
        this.f12908 = s;
        this.f12907 = s2;
        this.f12909 = s3;
        this.f12906 = c17450;
        this.f12910 = c17451;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC24866 m11900() {
        if (this.f12911 == null) {
            this.f12911 = EnumC24866.m54622(((String) this.f12910.f52180.f10654).charAt(0));
        }
        return this.f12911;
    }

    /* JADX INFO: renamed from: ܽ */
    public final short m11902() {
        return this.f12909;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11901(int i) {
        this.f12907 = (short) (i - this.f12908);
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f12908);
        c8121.m18818(this.f12907);
        c8121.m18818(this.f12906.f23817);
        c8121.m18818(this.f12910.f23817);
        c8121.m18818(this.f12909);
    }
}
