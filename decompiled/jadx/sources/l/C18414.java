package l;

/* JADX INFO: renamed from: l.ᩴ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18414 extends AbstractC8536 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15590 f57161;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f57162;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f57163;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15590[] f57164;

    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ᩳ */
    public final int mo10996(int i, byte[] bArr) {
        return 0;
    }

    public C18414(InterfaceC1023 interfaceC1023, C15590 c15590) {
        super(interfaceC1023);
        this.f57161 = c15590;
        this.f26094 = new C16296(interfaceC1023);
        this.f57163 = new byte[6];
    }

    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ֫ */
    public final int mo10994(int i, byte[] bArr) {
        return m22222(i, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ۧ */
    public final int mo10995(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = i2 * 18;
        ?? r5 = 1;
        int i4 = (this.f26079 - i3) - 1;
        int i5 = i + 1;
        this.f57162 = i2;
        System.arraycopy(bArr, i3 + i5, this.f57163, 0, 6);
        this.f57164 = new C15590[this.f57162];
        C15590 c15590 = this.f57161;
        String str = c15590.f48031.f50127;
        int i6 = 0;
        boolean z = false;
        int i7 = i5;
        while (i6 < this.f57162) {
            int i8 = i7 + 14;
            while (bArr[i8] == 32) {
                i8--;
            }
            InterfaceC1023 interfaceC1023 = this.f26095;
            String strM25126 = C9969.m25126(bArr, i7, (i8 - i7) + r5, interfaceC1023);
            int i9 = bArr[i7 + 15] & 255;
            byte b = bArr[i7 + 16];
            if (!z) {
                C16296 c16296 = c15590.f48031;
                if (c16296.f50124 == i9 && (c16296.m38332() || c15590.f48031.f50125.equals(strM25126))) {
                    if (c15590.f48031.m38332()) {
                        c15590.f48031 = new C16296(interfaceC1023, strM25126, i9, str);
                    }
                    c15590.f48032 = r5;
                    this.f57164[i6] = c15590;
                    z = true;
                } else {
                    this.f57164[i6] = new C15590(new C16296(interfaceC1023, strM25126, i9, str), c15590.f48029, 0);
                }
            } else {
                this.f57164[i6] = new C15590(new C16296(interfaceC1023, strM25126, i9, str), c15590.f48029, 0);
            }
            i7 += 18;
            i6++;
            r5 = 1;
        }
        int i10 = (i7 - i5) + i5;
        System.arraycopy(bArr, i10, new byte[i4], 0, i4);
        return (i10 + i4) - i;
    }

    @Override // l.AbstractC8536
    public final String toString() {
        return new String(C9045.m23341(new StringBuilder("NodeStatusResponse["), super.toString(), "]"));
    }
}
