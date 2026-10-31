package l;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۡܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6MY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9008 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f27366 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f27367 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27368;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23251(C7744 c7744, C20736 c20736, C4507 c4507, BooleanSupplier booleanSupplier) {
        int i;
        int i2;
        C9008 c9008 = new C9008();
        int i3 = 0;
        while (i3 < c20736.size()) {
            m23254(booleanSupplier);
            int iM47365 = c20736.m47365(i3);
            int i4 = iM47365 + 1;
            int iM47355 = c20736.m47355(i3);
            int iM47358 = c20736.m47358(iM47365);
            if (c4507 == null || (i4 > c4507.m13254() && i3 < c4507.m13253())) {
                int i5 = iM47355;
                int i6 = i5;
                while (true) {
                    m23254(booleanSupplier);
                    int iM23250 = m23250(c7744, i6, iM47358, booleanSupplier);
                    int i7 = i5;
                    i5 = i7;
                    c9008.m23253(i6, iM23250, i3, i4, i6 == i7, iM23250 == iM47358, false);
                    if (iM23250 >= iM47358) {
                        break;
                    }
                    i6 = iM23250;
                }
            } else {
                int i8 = i3;
                while (i8 < i4) {
                    m23254(booleanSupplier);
                    int i9 = i8 + 1;
                    int iM47356 = c20736.m47355(i8);
                    int iM47359 = c20736.m47358(i8);
                    if (iM47359 - iM47356 > 100000) {
                        while (true) {
                            m23254(booleanSupplier);
                            int iM23251 = m23250(c7744, iM47356, iM47359, booleanSupplier);
                            boolean z = i8 == i3 && iM47356 == iM47355;
                            boolean z2 = i9 == i4 && iM23251 == iM47358;
                            int i10 = i9;
                            int i11 = iM47359;
                            boolean z3 = z;
                            i2 = i9;
                            boolean z4 = z2;
                            i = iM47355;
                            int i12 = i8;
                            c9008.m23253(iM47356, iM23251, i8, i10, z3, z4, true);
                            iM47356 = iM23251;
                            if (iM47356 >= i11) {
                                break;
                            }
                            iM47359 = i11;
                            i8 = i12;
                            i9 = i2;
                            iM47355 = i;
                        }
                        i8 = i2;
                    } else {
                        i = iM47355;
                        int i13 = i8;
                        int i14 = i9;
                        while (i14 < i4 && i14 - i13 < 500 && c20736.m47358(i14) - iM47356 <= 100000) {
                            i14++;
                        }
                        c9008.m23253(iM47356, c20736.m47358(i14 - 1), i13, i14, i13 == i3, i14 == i4, true);
                        i8 = i14;
                    }
                    iM47355 = i;
                }
            }
            i3 = i4;
        }
        c9008.m23252();
        return c9008.f27366;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23253(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        int i5 = z3 ? i4 - i3 : 1;
        if (!this.f27367.isEmpty() && (this.f27368 + i5 > 500 || i2 - ((C9714) this.f27367.get(0)).f29409 > 100000)) {
            m23252();
        }
        C9714 c9714 = this.f27367.isEmpty() ? null : (C9714) C18566.m43105(this.f27367, 1);
        if (c9714 != null && c9714.f29410 == z3 && c9714.f29412 == i3 && c9714.f29413 && z) {
            c9714.f29407 = i2;
            c9714.f29412 = i4;
            c9714.f29413 = z2;
        } else {
            this.f27367.add(new C9714(i, i2, i3, i4, z, z2, z3));
        }
        this.f27368 += i5;
        if (i2 - i >= 100000) {
            m23252();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23252() {
        if (this.f27367.isEmpty()) {
            return;
        }
        this.f27366.add(new C21003(this.f27367, this.f27368));
        this.f27367 = new ArrayList();
        this.f27368 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23250(CharSequence charSequence, int i, int i2, BooleanSupplier booleanSupplier) {
        if (i2 - i <= 100000) {
            return i2;
        }
        int i3 = 100000 + i;
        int i4 = i3;
        while (i4 > i && charSequence.charAt(i4) > 127) {
            if ((i4 & 1023) == 0) {
                m23254(booleanSupplier);
            }
            i4--;
        }
        while (i4 < i3) {
            m23254(booleanSupplier);
            int iM50336 = C22412.m50336(i4, i2, charSequence);
            while (iM50336 < i2) {
                int iCodePointAt = Character.codePointAt(charSequence, iM50336);
                int type = Character.getType(iCodePointAt);
                if (type != 6 && type != 8 && type != 7) {
                    break;
                }
                m23254(booleanSupplier);
                iM50336 += Character.charCount(iCodePointAt);
            }
            if (iM50336 <= i3) {
                i4 = iM50336;
            } else if (i4 == i) {
                return iM50336;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23254(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Wrap planning canceled");
        }
    }
}
