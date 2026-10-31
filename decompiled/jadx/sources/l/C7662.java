package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۟ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C7662 extends AbstractC12601 implements InterfaceC14242 {

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f23651 = C11321.m27961(C7662.class);

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f23652;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final String f23653;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f23654;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f23655;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f23656;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public long f23657;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C7662(InterfaceC1023 interfaceC1023, byte[] bArr, String str) {
        super(interfaceC1023);
        this.f23654 = bArr;
        this.f23653 = str;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int m20461() {
        return this.f23656;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ۛ */
    public final long mo7549() {
        return this.f23655;
    }

    @Override // l.InterfaceC14242
    public final long getSize() {
        return this.f23657;
    }

    @Override // l.InterfaceC14242
    public final int getAttributes() {
        return this.f23652;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        if (C1480.m5121(i, bArr) != 60) {
            throw new C17771("Expected structureSize = 60");
        }
        this.f23656 = C1480.m5121(i + 2, bArr);
        C1480.m5127(i + 8, bArr);
        C1480.m5127(i + 16, bArr);
        this.f23655 = C1480.m5127(i + 24, bArr);
        C1480.m5127(i + 32, bArr);
        C1480.m5125(i + 40, bArr);
        this.f23657 = C1480.m5125(i + 48, bArr);
        this.f23652 = C1480.m5123(i + 56, bArr);
        int i2 = i + 60;
        InterfaceC2148 interfaceC2148 = f23651;
        if (interfaceC2148.mo7086()) {
            byte[] bArr2 = this.f23654;
            interfaceC2148.mo7088(C20087.m46306("Closed ", C12085.m29468(bArr2, 0, bArr2.length), " (", this.f23653, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        return i2 - i;
    }
}
