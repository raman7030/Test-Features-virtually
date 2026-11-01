package p067l;

/* JADX INFO: renamed from: l.֨ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3474 {

    /* JADX INFO: renamed from: ֫ */
    public C7498 f6969;

    /* JADX INFO: renamed from: ۧ */
    public int f6970;

    /* JADX INFO: renamed from: ܳ */
    public int f6971;

    /* JADX INFO: renamed from: ܽ */
    public int f6972;

    /* JADX INFO: renamed from: ܿ */
    public int f6973 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public int f6974;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C22921 f6975;

    public C3474(C22921 c22921) {
        this.f6975 = c22921;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m6205(int i) {
        if (i < 0) {
            return false;
        }
        C22921 c22921 = this.f6975;
        if (i >= c22921.f72121) {
            return false;
        }
        if (this.f6973 != c22921.f72120 || i < this.f6971 || i >= this.f6972) {
            this.f6970 = c22921.m51199(i);
            this.f6969 = (C7498) c22921.f72122.get(this.f6970);
            int iM51195 = c22921.m51195(this.f6970);
            this.f6971 = iM51195;
            this.f6972 = iM51195 + this.f6969.f19641;
            this.f6973 = c22921.f72120;
        }
        this.f6974 = i - this.f6971;
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m6204() {
        return this.f6969.f19638[this.f6974] & 65535;
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m6200() {
        return (char) (this.f6969.f19638[this.f6974] >>> 16);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m6202() {
        return this.f6969.m17314(this.f6974) - this.f6969.m17316(this.f6974);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m6203(int i) {
        C7498 c7498 = this.f6969;
        return c7498.f19639[C12826.checkIndex(i, m6202()) + c7498.m17316(this.f6974)];
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6201(int i) {
        int iM17314 = this.f6969.m17314(this.f6974);
        for (int iM17316 = this.f6969.m17316(this.f6974); iM17316 < iM17314; iM17316++) {
            if (this.f6969.f19639[iM17316] == i) {
                return true;
            }
        }
        return false;
    }
}
