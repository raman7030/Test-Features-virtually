package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15685 extends AbstractC15015 implements InterfaceC6969 {

    /* JADX INFO: renamed from: ۖ֫ */
    public static final InterfaceC4410 f45460 = C13128.m30022(C15685.class);

    /* JADX INFO: renamed from: ۡ֫ */
    public byte[] f45461;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f45462;

    /* JADX INFO: renamed from: ܺ֫ */
    public final String f45463;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C15685(InterfaceC3341 interfaceC3341, byte[] bArr, String str) {
        super(interfaceC3341, 6);
        this.f45461 = bArr;
        this.f45463 = str;
    }

    public C15685(InterfaceC3341 interfaceC3341, byte[] bArr) {
        this(interfaceC3341, bArr, "");
    }

    @Override // p067l.InterfaceC6969
    /* JADX INFO: renamed from: ֫ */
    public final void mo10536(byte[] bArr) {
        this.f45461 = bArr;
    }

    public C15685(String str, InterfaceC3341 interfaceC3341) {
        this(interfaceC3341, C12334.f34417, str);
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C9651(interfaceC20106.mo29602(), this.f45461, this.f45463);
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final void m35725() {
        this.f45462 = 1;
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        return AbstractC5628.m12467(88);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(24L, i, bArr);
        C3775.m7364(this.f45462, i + 2, bArr);
        System.arraycopy(this.f45461, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        InterfaceC4410 interfaceC4410 = f45460;
        if (interfaceC4410.mo9181()) {
            byte[] bArr2 = this.f45461;
            interfaceC4410.mo9183(C21459.m48622("Closing ", C13854.m31530(bArr2, 0, bArr2.length), " (", this.f45463, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        return i2 - i;
    }
}
