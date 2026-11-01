package p067l;

/* JADX INFO: renamed from: l.ᩴ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19869 extends AbstractC10481 {

    /* JADX INFO: renamed from: ۛ */
    public C17185 f60380;

    /* JADX INFO: renamed from: ۤ */
    public int f60381;

    /* JADX INFO: renamed from: ۫ */
    public byte[] f60382;

    /* JADX INFO: renamed from: ۬ */
    public C17185[] f60383;

    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ᩳ */
    public final int mo12972(int i, byte[] bArr) {
        return 0;
    }

    public C19869(InterfaceC3341 interfaceC3341, C17185 c17185) {
        super(interfaceC3341);
        this.f60380 = c17185;
        this.f29009 = new C17856(interfaceC3341);
        this.f60382 = new byte[6];
    }

    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ֫ */
    public final int mo12970(int i, byte[] bArr) {
        return m24190(i, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ۧ */
    public final int mo12971(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = i2 * 18;
        ?? r5 = 1;
        int i4 = (this.f28994 - i3) - 1;
        int i5 = i + 1;
        this.f60381 = i2;
        System.arraycopy(bArr, i3 + i5, this.f60382, 0, 6);
        this.f60383 = new C17185[this.f60381];
        C17185 c17185 = this.f60380;
        String str = c17185.f51163.f53294;
        int i6 = 0;
        boolean z = false;
        int i7 = i5;
        while (i6 < this.f60381) {
            int i8 = i7 + 14;
            while (bArr[i8] == 32) {
                i8--;
            }
            InterfaceC3341 interfaceC3341 = this.f29010;
            String strM27143 = C11843.m27143(bArr, i7, (i8 - i7) + r5, interfaceC3341);
            int i9 = bArr[i7 + 15] & 255;
            byte b = bArr[i7 + 16];
            if (!z) {
                C17856 c17856 = c17185.f51163;
                if (c17856.f53291 == i9 && (c17856.m40547() || c17185.f51163.f53292.equals(strM27143))) {
                    if (c17185.f51163.m40547()) {
                        c17185.f51163 = new C17856(interfaceC3341, strM27143, i9, str);
                    }
                    c17185.f51164 = r5;
                    this.f60383[i6] = c17185;
                    z = true;
                } else {
                    this.f60383[i6] = new C17185(new C17856(interfaceC3341, strM27143, i9, str), c17185.f51161, 0);
                }
            } else {
                this.f60383[i6] = new C17185(new C17856(interfaceC3341, strM27143, i9, str), c17185.f51161, 0);
            }
            i7 += 18;
            i6++;
            r5 = 1;
        }
        int i10 = (i7 - i5) + i5;
        System.arraycopy(bArr, i10, new byte[i4], 0, i4);
        return (i10 + i4) - i;
    }

    @Override // p067l.AbstractC10481
    public final String toString() {
        return new String(C10965.m25286(new StringBuilder("NodeStatusResponse["), super.toString(), "]"));
    }
}
