package p067l;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۡܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6MY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10930 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f30300 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f30301 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public int f30302;

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m25195(C9729 c9729, C22076 c22076, C6652 c6652, BooleanSupplier booleanSupplier) {
        int i;
        int i2;
        C10930 c10930 = new C10930();
        int i3 = 0;
        while (i3 < c22076.size()) {
            m25198(booleanSupplier);
            int iM49692 = c22076.m49692(i3);
            int i4 = iM49692 + 1;
            int iM49682 = c22076.m49682(i3);
            int iM49685 = c22076.m49685(iM49692);
            if (c6652 == null || (i4 > c6652.m15137() && i3 < c6652.m15136())) {
                int i5 = iM49682;
                int i6 = i5;
                while (true) {
                    m25198(booleanSupplier);
                    int iM25194 = m25194(c9729, i6, iM49685, booleanSupplier);
                    int i7 = i5;
                    i5 = i7;
                    c10930.m25197(i6, iM25194, i3, i4, i6 == i7, iM25194 == iM49685, false);
                    if (iM25194 >= iM49685) {
                        break;
                    }
                    i6 = iM25194;
                }
            } else {
                int i8 = i3;
                while (i8 < i4) {
                    m25198(booleanSupplier);
                    int i9 = i8 + 1;
                    int iM49683 = c22076.m49682(i8);
                    int iM49686 = c22076.m49685(i8);
                    if (iM49686 - iM49683 > 100000) {
                        while (true) {
                            m25198(booleanSupplier);
                            int iM25195 = m25194(c9729, iM49683, iM49686, booleanSupplier);
                            boolean z = i8 == i3 && iM49683 == iM49682;
                            boolean z2 = i9 == i4 && iM25195 == iM49685;
                            int i10 = i9;
                            int i11 = iM49686;
                            boolean z3 = z;
                            i2 = i9;
                            boolean z4 = z2;
                            i = iM49682;
                            int i12 = i8;
                            c10930.m25197(iM49683, iM25195, i8, i10, z3, z4, true);
                            iM49683 = iM25195;
                            if (iM49683 >= i11) {
                                break;
                            }
                            iM49686 = i11;
                            i8 = i12;
                            i9 = i2;
                            iM49682 = i;
                        }
                        i8 = i2;
                    } else {
                        i = iM49682;
                        int i13 = i8;
                        int i14 = i9;
                        while (i14 < i4 && i14 - i13 < 500 && c22076.m49685(i14) - iM49683 <= 100000) {
                            i14++;
                        }
                        c10930.m25197(iM49683, c22076.m49685(i14 - 1), i13, i14, i13 == i3, i14 == i4, true);
                        i8 = i14;
                    }
                    iM49682 = i;
                }
            }
            i3 = i4;
        }
        c10930.m25196();
        return c10930.f30300;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25197(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        int i5 = z3 ? i4 - i3 : 1;
        if (!this.f30301.isEmpty() && (this.f30302 + i5 > 500 || i2 - ((C11601) this.f30301.get(0)).f32358 > 100000)) {
            m25196();
        }
        C11601 c11601 = this.f30301.isEmpty() ? null : (C11601) C20013.m45383(this.f30301, 1);
        if (c11601 != null && c11601.f32359 == z3 && c11601.f32361 == i3 && c11601.f32362 && z) {
            c11601.f32356 = i2;
            c11601.f32361 = i4;
            c11601.f32362 = z2;
        } else {
            this.f30301.add(new C11601(i, i2, i3, i4, z, z2, z3));
        }
        this.f30302 += i5;
        if (i2 - i >= 100000) {
            m25196();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25196() {
        if (this.f30301.isEmpty()) {
            return;
        }
        this.f30300.add(new C22330(this.f30301, this.f30302));
        this.f30301 = new ArrayList();
        this.f30302 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25194(CharSequence charSequence, int i, int i2, BooleanSupplier booleanSupplier) {
        if (i2 - i <= 100000) {
            return i2;
        }
        int i3 = 100000 + i;
        int i4 = i3;
        while (i4 > i && charSequence.charAt(i4) > 127) {
            if ((i4 & 1023) == 0) {
                m25198(booleanSupplier);
            }
            i4--;
        }
        while (i4 < i3) {
            m25198(booleanSupplier);
            int iM52676 = C23669.m52676(i4, i2, charSequence);
            while (iM52676 < i2) {
                int iCodePointAt = Character.codePointAt(charSequence, iM52676);
                int type = Character.getType(iCodePointAt);
                if (type != 6 && type != 8 && type != 7) {
                    break;
                }
                m25198(booleanSupplier);
                iM52676 += Character.charCount(iCodePointAt);
            }
            if (iM52676 <= i3) {
                i4 = iM52676;
            } else if (i4 == i) {
                return iM52676;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25198(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Wrap planning canceled");
        }
    }
}
