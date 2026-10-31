package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14011 extends AbstractC13306 implements InterfaceC4840 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f42377 = C11321.m27961(C14011.class);

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public byte[] f42378;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f42379;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final String f42380;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C14011(InterfaceC1023 interfaceC1023, byte[] bArr, String str) {
        super(interfaceC1023, 6);
        this.f42378 = bArr;
        this.f42380 = str;
    }

    public C14011(InterfaceC1023 interfaceC1023, byte[] bArr) {
        this(interfaceC1023, bArr, "");
    }

    @Override // l.InterfaceC4840
    /* JADX INFO: renamed from: ֫ */
    public final void mo8489(byte[] bArr) {
        this.f42378 = bArr;
    }

    public C14011(String str, InterfaceC1023 interfaceC1023) {
        this(interfaceC1023, C10485.f31453, str);
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C7662(interfaceC18663.mo27540(), this.f42378, this.f42380);
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final void m33605() {
        this.f42379 = 1;
    }

    @Override // l.InterfaceC7578
    public final int size() {
        return AbstractC3429.m10428(88);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(24L, i, bArr);
        C1480.m5122(this.f42379, i + 2, bArr);
        System.arraycopy(this.f42378, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        InterfaceC2148 interfaceC2148 = f42377;
        if (interfaceC2148.mo7086()) {
            byte[] bArr2 = this.f42378;
            interfaceC2148.mo7088(C20087.m46306("Closing ", C12085.m29468(bArr2, 0, bArr2.length), " (", this.f42380, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        return i2 - i;
    }
}
