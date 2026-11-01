package p067l;

import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۗ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46OI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5311 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5390 f12482;

    /* JADX INFO: renamed from: ۜ */
    public final C22921 f12483;

    /* JADX INFO: renamed from: ۡ */
    public final int f12484;

    /* JADX INFO: renamed from: ۢ */
    public final int f12485;

    /* JADX INFO: renamed from: ۧ */
    public final int f12486;

    /* JADX INFO: renamed from: ܳ */
    public final int f12487;

    /* JADX INFO: renamed from: ܺ */
    public final int f12488;

    /* JADX INFO: renamed from: ܽ */
    public final int f12489;

    /* JADX INFO: renamed from: ܿ */
    public final int f12490;

    /* JADX INFO: renamed from: ᩳ */
    public final int f12491;

    /* JADX INFO: renamed from: ᩷ */
    public final C22076 f12492;

    /* JADX INFO: renamed from: ᩻ */
    public final int f12493;

    public C5311(AbstractC5390 abstractC5390, int i, int i2, int i3, int i4, int i5) {
        this.f12482 = abstractC5390;
        C22076 c22076 = abstractC5390.f12798;
        this.f12492 = c22076;
        this.f12483 = abstractC5390.f12833;
        this.f12485 = i2;
        this.f12487 = i3;
        this.f12484 = i4;
        this.f12488 = i5;
        this.f12490 = abstractC5390.mo10197();
        int iM49693 = c22076.m49693(abstractC5390.m11806(i, true));
        this.f12491 = iM49693;
        int iM49692 = c22076.m49692(abstractC5390.m11806(i + i2, false));
        this.f12493 = iM49692;
        this.f12489 = c22076.m49682(iM49693);
        this.f12486 = (c22076.m49685(iM49692) + i3) - i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m11490(AbstractC5390 abstractC5390, int i, int i2) {
        AbstractC5390 abstractC5391 = this.f12482;
        return abstractC5390 == abstractC5391 && abstractC5391.f12798 == this.f12492 && abstractC5391.f12833 == this.f12483 && !abstractC5391.mo11814() && !this.f12482.f12819 && this.f12482.mo10204() == null && this.f12482.mo10197() == this.f12490 && i == this.f12484 && i2 == this.f12488 && this.f12482.f12818.equals(this.f12482.f12821.m32608());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6652 m11489(AbstractC5390 abstractC5390, BooleanSupplier booleanSupplier) {
        C22921 c22921;
        int i;
        int i2;
        int i3 = this.f12489;
        int i4 = this.f12486;
        C22076 c22076 = this.f12492;
        int i5 = this.f12491;
        int iM49684 = c22076.m49684(i5);
        int i6 = this.f12493;
        int iM49685 = c22076.m49684(i6);
        Math.max(16, c22076.size() - ((i6 - i5) + 1));
        C22076 c22077 = new C22076(0);
        C22921 c22922 = new C22921();
        int i7 = 0;
        while (i7 < i5) {
            m11488(booleanSupplier);
            int iMin = Math.min(i5 - i7, 16384) + i7;
            c22077.m49678(i7, iMin, c22076);
            i7 = iMin;
        }
        m11488(booleanSupplier);
        int i8 = 0;
        while (true) {
            c22921 = this.f12483;
            if (i8 >= iM49684) {
                break;
            }
            m11488(booleanSupplier);
            int iMin2 = Math.min(iM49684 - i8, 16384) + i8;
            c22922.m51210(c22921, i8, iMin2);
            i8 = iMin2;
        }
        m11488(booleanSupplier);
        C9729 c9729M11841 = abstractC5390.m11841();
        try {
            C24481 c24481M11808 = abstractC5390.m11808(c9729M11841, i3, i4);
            try {
                C13533 c13533 = new C13533();
                int i9 = iM49684;
                while (true) {
                    m11488(booleanSupplier);
                    i = i5;
                    c22922.add(C20910.m47222(abstractC5390, c9729M11841, i3, abstractC5390.f12837.m26497()));
                    int iM53980 = c24481M11808.m53980();
                    boolean z = iM53980 < 0 || iM53980 >= i4;
                    if (z) {
                        iM53980 = i4;
                    }
                    int i10 = i4;
                    i2 = i9 + 1;
                    c13533.m30799(i3, iM53980, i9);
                    c13533.m30800(c9729M11841);
                    c22077.m49680(c13533);
                    if (z) {
                        break;
                    }
                    i3 = iM53980 + 1;
                    i5 = i;
                    i9 = i2;
                    i4 = i10;
                }
                c24481M11808.close();
                c9729M11841.close();
                int size = c22077.size();
                int i11 = (i2 - iM49685) - 1;
                int i12 = i6 + 1;
                int size2 = c22076.size();
                while (i12 < size2) {
                    m11488(booleanSupplier);
                    int iMin3 = Math.min(size2 - i12, 16384) + i12;
                    c22077.m49678(i12, iMin3, c22076);
                    i12 = iMin3;
                }
                m11488(booleanSupplier);
                c22077.m49677(size, c22077.size(), this.f12487 - this.f12485, i11);
                int i13 = iM49685 + 1;
                int size3 = c22921.size();
                while (i13 < size3) {
                    m11488(booleanSupplier);
                    int iMin4 = Math.min(size3 - i13, 16384) + i13;
                    c22922.m51210(c22921, i13, iMin4);
                    i13 = iMin4;
                }
                m11488(booleanSupplier);
                c22922.m51214(iM49684, i2);
                abstractC5390.f12798 = c22077;
                abstractC5390.f12833 = c22922;
                return new C6652(i, size);
            } catch (Throwable th) {
                try {
                    c24481M11808.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c9729M11841.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11488(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Layout preparation canceled");
        }
    }
}
