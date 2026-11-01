package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۟ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9651 extends AbstractC14345 implements InterfaceC15904 {

    /* JADX INFO: renamed from: ܶ֫ */
    public static final InterfaceC4410 f26565 = C13128.m30022(C9651.class);

    /* JADX INFO: renamed from: ֡֫ */
    public int f26566;

    /* JADX INFO: renamed from: ֨֫ */
    public final String f26567;

    /* JADX INFO: renamed from: ۚ֫ */
    public final byte[] f26568;

    /* JADX INFO: renamed from: ۠֫ */
    public long f26569;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f26570;

    /* JADX INFO: renamed from: ᩵֫ */
    public long f26571;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    public C9651(InterfaceC3341 interfaceC3341, byte[] bArr, String str) {
        super(interfaceC3341);
        this.f26568 = bArr;
        this.f26567 = str;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final int m22441() {
        return this.f26570;
    }

    @Override // p067l.InterfaceC15904
    /* JADX INFO: renamed from: ۛ */
    public final long mo9617() {
        return this.f26569;
    }

    @Override // p067l.InterfaceC15904
    public final long getSize() {
        return this.f26571;
    }

    @Override // p067l.InterfaceC15904
    public final int getAttributes() {
        return this.f26566;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        if (C3775.m7363(i, bArr) != 60) {
            throw new C19258("Expected structureSize = 60");
        }
        this.f26570 = C3775.m7363(i + 2, bArr);
        C3775.m7369(i + 8, bArr);
        C3775.m7369(i + 16, bArr);
        this.f26569 = C3775.m7369(i + 24, bArr);
        C3775.m7369(i + 32, bArr);
        C3775.m7367(i + 40, bArr);
        this.f26571 = C3775.m7367(i + 48, bArr);
        this.f26566 = C3775.m7365(i + 56, bArr);
        int i2 = i + 60;
        InterfaceC4410 interfaceC4410 = f26565;
        if (interfaceC4410.mo9181()) {
            byte[] bArr2 = this.f26568;
            interfaceC4410.mo9183(C21459.m48622("Closed ", C13854.m31530(bArr2, 0, bArr2.length), " (", this.f26567, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        return i2 - i;
    }
}
