package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 94TD */
/* JADX INFO: loaded from: classes5.dex */
public class C19536 extends AbstractC8246 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C22357 f63108;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63109;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f63110;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f63111;

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ۧ */
    public double mo1619() {
        return 0.0d;
    }

    public final int hashCode() {
        return this.f25384;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int mo44939() {
        return this.f25384;
    }

    public C19536(C22357 c22357, int i, String str) {
        super(i);
        this.f63108 = c22357;
        this.f63110 = str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m44940() {
        return this.f63111;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44935(String str) {
        this.f63111 = str;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m44936() {
        return this.f63111 != null;
    }

    @Override // l.AbstractC8246, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(AbstractC8246 abstractC8246) {
        int iCompareTo = super.compareTo(abstractC8246);
        if (iCompareTo != 0 || !(abstractC8246 instanceof C19536)) {
            return iCompareTo;
        }
        return this.f63110.compareTo(((C19536) abstractC8246).f63110);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19536) && compareTo((AbstractC8246) obj) == 0;
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) throws IOException {
        c3438.write(58);
        c3438.write(this.f63110);
        if (this.f63108.f72442) {
            c3438.mo10511(this.f63109);
        } else {
            c3438.mo10511(mo44939());
        }
        if (this.f63111 == null) {
            return true;
        }
        c3438.write("  #", 0, 3);
        c3438.write(this.f63111);
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44938(C3438 c3438) throws IOException {
        c3438.write(58);
        c3438.write(this.f63110);
        if (this.f63108.f72442) {
            c3438.mo10511(this.f63109);
        } else {
            c3438.mo10511(mo44939());
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m44937() {
        return this.f63110;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44934(int i) {
        this.f63109 = i;
    }
}
