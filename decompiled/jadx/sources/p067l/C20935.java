package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 94TD */
/* JADX INFO: loaded from: classes5.dex */
public class C20935 extends AbstractC10205 {

    /* JADX INFO: renamed from: ۗ */
    public final C23616 f65728;

    /* JADX INFO: renamed from: ۙ */
    public int f65729;

    /* JADX INFO: renamed from: ᩶ */
    public final String f65730;

    /* JADX INFO: renamed from: ᩹ */
    public String f65731;

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ۧ */
    public double mo4019() {
        return 0.0d;
    }

    public final int hashCode() {
        return this.f28294;
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo47239() {
        return this.f28294;
    }

    public C20935(C23616 c23616, int i, String str) {
        super(i);
        this.f65728 = c23616;
        this.f65730 = str;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m47240() {
        return this.f65731;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47235(String str) {
        this.f65731 = str;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m47236() {
        return this.f65731 != null;
    }

    @Override // p067l.AbstractC10205, java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(AbstractC10205 abstractC10205) {
        int iCompareTo = super.compareTo(abstractC10205);
        if (iCompareTo != 0 || !(abstractC10205 instanceof C20935)) {
            return iCompareTo;
        }
        return this.f65730.compareTo(((C20935) abstractC10205).f65730);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C20935) && compareTo((AbstractC10205) obj) == 0;
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        c5636.write(58);
        c5636.write(this.f65730);
        if (this.f65728.f75168) {
            c5636.mo12535(this.f65729);
        } else {
            c5636.mo12535(mo47239());
        }
        if (this.f65731 == null) {
            return true;
        }
        c5636.write("  #", 0, 3);
        c5636.write(this.f65731);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47238(C5636 c5636) throws IOException {
        c5636.write(58);
        c5636.write(this.f65730);
        if (this.f65728.f75168) {
            c5636.mo12535(this.f65729);
        } else {
            c5636.mo12535(mo47239());
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m47237() {
        return this.f65730;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47234(int i) {
        this.f65729 = i;
    }
}
