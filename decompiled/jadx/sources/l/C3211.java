package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57D5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3211 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15869 f10099;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public short f10100;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public short f10101;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final short f10102;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15869 f10103;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC23672 f10104;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 10;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C3211(short s, short s2, C15869 c15869, C15869 c158610) {
        this.f10102 = s;
        this.f10101 = s2;
        this.f10099 = c15869;
        this.f10103 = c158610;
    }

    public C3211(short s, short s2, short s3, C15869 c15869, C15869 c158610) {
        this.f10101 = s;
        this.f10100 = s2;
        this.f10102 = s3;
        this.f10099 = c15869;
        this.f10103 = c158610;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC23672 m9853() {
        if (this.f10104 == null) {
            this.f10104 = EnumC23672.m52219(((String) this.f10103.f49042.f7866).charAt(0));
        }
        return this.f10104;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short m9855() {
        return this.f10102;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9854(int i) {
        this.f10100 = (short) (i - this.f10101);
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f10101);
        c6053.m16889(this.f10100);
        c6053.m16889(this.f10099.f20943);
        c6053.m16889(this.f10103.f20943);
        c6053.m16889(this.f10102);
    }
}
