package l;

import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۗ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46OI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3096 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3179 f9680;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21625 f9681;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f9682;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f9683;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f9684;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f9685;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f9686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f9687;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f9688;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f9689;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20736 f9690;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f9691;

    public C3096(AbstractC3179 abstractC3179, int i, int i2, int i3, int i4, int i5) {
        this.f9680 = abstractC3179;
        C20736 c20736 = abstractC3179.f9998;
        this.f9690 = c20736;
        this.f9681 = abstractC3179.f10033;
        this.f9683 = i2;
        this.f9685 = i3;
        this.f9682 = i4;
        this.f9686 = i5;
        this.f9688 = abstractC3179.mo8164();
        int iM47366 = c20736.m47366(abstractC3179.m9762(i, true));
        this.f9689 = iM47366;
        int iM47365 = c20736.m47365(abstractC3179.m9762(i + i2, false));
        this.f9691 = iM47365;
        this.f9687 = c20736.m47355(iM47366);
        this.f9684 = (c20736.m47358(iM47365) + i3) - i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9447(AbstractC3179 abstractC3179, int i, int i2) {
        AbstractC3179 abstractC31710 = this.f9680;
        return abstractC3179 == abstractC31710 && abstractC31710.f9998 == this.f9690 && abstractC31710.f10033 == this.f9681 && !abstractC31710.mo9770() && !this.f9680.f10019 && this.f9680.mo8171() == null && this.f9680.mo8164() == this.f9688 && i == this.f9682 && i2 == this.f9686 && this.f9680.f10018.equals(this.f9680.f10021.m30544());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4507 m9446(AbstractC3179 abstractC3179, BooleanSupplier booleanSupplier) {
        C21625 c21625;
        int i;
        int i2;
        int i3 = this.f9687;
        int i4 = this.f9684;
        C20736 c20736 = this.f9690;
        int i5 = this.f9689;
        int iM47357 = c20736.m47357(i5);
        int i6 = this.f9691;
        int iM47358 = c20736.m47357(i6);
        Math.max(16, c20736.size() - ((i6 - i5) + 1));
        C20736 c20737 = new C20736(0);
        C21625 c21626 = new C21625();
        int i7 = 0;
        while (i7 < i5) {
            m9445(booleanSupplier);
            int iMin = Math.min(i5 - i7, 16384) + i7;
            c20737.m47351(i7, iMin, c20736);
            i7 = iMin;
        }
        m9445(booleanSupplier);
        int i8 = 0;
        while (true) {
            c21625 = this.f9681;
            if (i8 >= iM47357) {
                break;
            }
            m9445(booleanSupplier);
            int iMin2 = Math.min(iM47357 - i8, 16384) + i8;
            c21626.m48862(c21625, i8, iMin2);
            i8 = iMin2;
        }
        m9445(booleanSupplier);
        C7744 c7744M9797 = abstractC3179.m9797();
        try {
            C23266 c23266M9764 = abstractC3179.m9764(c7744M9797, i3, i4);
            try {
                C11747 c11747 = new C11747();
                int i9 = iM47357;
                while (true) {
                    m9445(booleanSupplier);
                    i = i5;
                    c21626.add(C19509.m44924(abstractC3179, c7744M9797, i3, abstractC3179.f10037.m24485()));
                    int iM51584 = c23266M9764.m51584();
                    boolean z = iM51584 < 0 || iM51584 >= i4;
                    if (z) {
                        iM51584 = i4;
                    }
                    int i10 = i4;
                    i2 = i9 + 1;
                    c11747.m28751(i3, iM51584, i9);
                    c11747.m28752(c7744M9797);
                    c20737.m47353(c11747);
                    if (z) {
                        break;
                    }
                    i3 = iM51584 + 1;
                    i5 = i;
                    i9 = i2;
                    i4 = i10;
                }
                c23266M9764.close();
                c7744M9797.close();
                int size = c20737.size();
                int i11 = (i2 - iM47358) - 1;
                int i12 = i6 + 1;
                int size2 = c20736.size();
                while (i12 < size2) {
                    m9445(booleanSupplier);
                    int iMin3 = Math.min(size2 - i12, 16384) + i12;
                    c20737.m47351(i12, iMin3, c20736);
                    i12 = iMin3;
                }
                m9445(booleanSupplier);
                c20737.m47350(size, c20737.size(), this.f9685 - this.f9683, i11);
                int i13 = iM47358 + 1;
                int size3 = c21625.size();
                while (i13 < size3) {
                    m9445(booleanSupplier);
                    int iMin4 = Math.min(size3 - i13, 16384) + i13;
                    c21626.m48862(c21625, i13, iMin4);
                    i13 = iMin4;
                }
                m9445(booleanSupplier);
                c21626.m48866(iM47357, i2);
                abstractC3179.f9998 = c20737;
                abstractC3179.f10033 = c21626;
                return new C4507(i, size);
            } catch (Throwable th) {
                try {
                    c23266M9764.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c7744M9797.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9445(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Layout preparation canceled");
        }
    }
}
