package l;

/* JADX INFO: renamed from: l.ۛ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 565E */
/* JADX INFO: loaded from: classes3.dex */
public class C6276 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f19420 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC16404[] f19421;

    public C6276(C3454 c3454, C10720 c10720) {
        int i = 0;
        this.f19421 = new AbstractC16404[c10720.m26903()];
        while (true) {
            AbstractC16404[] abstractC16404Arr = this.f19421;
            if (i >= abstractC16404Arr.length) {
                return;
            }
            abstractC16404Arr[i] = AbstractC16404.m38657(c3454, c10720);
            i++;
        }
    }

    public C6276(AbstractC16404[] abstractC16404Arr) {
        this.f19421 = abstractC16404Arr;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public void mo5434(C1547 c1547) {
        c1547.m5301(this.f19421.length);
        for (AbstractC16404 abstractC16404 : this.f19421) {
            abstractC16404.mo5434(c1547);
        }
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public int mo5433(int i) {
        int iM27697 = C11166.m27697(this.f19421.length) + i;
        for (AbstractC16404 abstractC16404 : this.f19421) {
            iM27697 = abstractC16404.mo5433(iM27697);
        }
        return iM27697;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        C6276 c6276 = (C6276) abstractC16404;
        int length = this.f19421.length - c6276.f19421.length;
        if (length != 0) {
            return length;
        }
        int i = 0;
        while (true) {
            AbstractC16404[] abstractC16404Arr = this.f19421;
            if (i >= abstractC16404Arr.length) {
                return length;
            }
            length = abstractC16404Arr[i].compareTo(c6276.f19421[i]);
            if (length != 0) {
                return length;
            }
            i++;
        }
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_ARRAY;
    }

    public final int hashCode() {
        if (this.f19420 == 0) {
            this.f19420 = 0;
            for (AbstractC16404 abstractC16404 : this.f19421) {
                this.f19420 = abstractC16404.hashCode() + (this.f19420 * 31);
            }
        }
        return this.f19420;
    }
}
