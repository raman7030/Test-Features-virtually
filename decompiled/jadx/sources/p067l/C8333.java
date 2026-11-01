package p067l;

/* JADX INFO: renamed from: l.ۛ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 565E */
/* JADX INFO: loaded from: classes3.dex */
public class C8333 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public int f22283 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC17958[] f22284;

    public C8333(C5651 c5651, C12556 c12556) {
        int i = 0;
        this.f22284 = new AbstractC17958[c12556.m28943()];
        while (true) {
            AbstractC17958[] abstractC17958Arr = this.f22284;
            if (i >= abstractC17958Arr.length) {
                return;
            }
            abstractC17958Arr[i] = AbstractC17958.m40873(c5651, c12556);
            i++;
        }
    }

    public C8333(AbstractC17958[] abstractC17958Arr) {
        this.f22284 = abstractC17958Arr;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public void mo7663(C3838 c3838) {
        c3838.m7530(this.f22284.length);
        for (AbstractC17958 abstractC17958 : this.f22284) {
            abstractC17958.mo7663(c3838);
        }
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public int mo7662(int i) {
        int iM29759 = C12981.m29759(this.f22284.length) + i;
        for (AbstractC17958 abstractC17958 : this.f22284) {
            iM29759 = abstractC17958.mo7662(iM29759);
        }
        return iM29759;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        C8333 c8333 = (C8333) abstractC17958;
        int length = this.f22284.length - c8333.f22284.length;
        if (length != 0) {
            return length;
        }
        int i = 0;
        while (true) {
            AbstractC17958[] abstractC17958Arr = this.f22284;
            if (i >= abstractC17958Arr.length) {
                return length;
            }
            length = abstractC17958Arr[i].compareTo(c8333.f22284[i]);
            if (length != 0) {
                return length;
            }
            i++;
        }
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_ARRAY;
    }

    public final int hashCode() {
        if (this.f22283 == 0) {
            this.f22283 = 0;
            for (AbstractC17958 abstractC17958 : this.f22284) {
                this.f22283 = abstractC17958.hashCode() + (this.f22283 * 31);
            }
        }
        return this.f22283;
    }
}
