package p067l;

/* JADX INFO: renamed from: l.۬ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B9F */
/* JADX INFO: loaded from: classes3.dex */
public final class C14735 {

    /* JADX INFO: renamed from: ֫ */
    public final C18759 f41999;

    /* JADX INFO: renamed from: ۧ */
    public C22388 f42000;

    /* JADX INFO: renamed from: ܽ */
    public final int f42001;

    /* JADX INFO: renamed from: ᩳ */
    public C22388[] f42002;

    public C14735(C18759 c18759, int i) {
        if (c18759 == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.f41999 = c18759;
        this.f42001 = i;
        this.f42002 = null;
        this.f42000 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18759 m33676() {
        return this.f41999;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33678() {
        return this.f42001;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22388 m33677(int i) {
        if (this.f42000 == null) {
            C18759 c18759 = this.f41999;
            int iM40215 = c18759.m40215();
            C22388[] c22388Arr = new C22388[iM40215];
            C22388 c22388 = new C22388(10);
            int size = c18759.size();
            for (int i2 = 0; i2 < size; i2++) {
                C18088 c18088M56522get = c18759.m56522get(i2);
                int iMo4636 = c18088M56522get.mo4636();
                C22388 c22388M41137 = c18088M56522get.m41137();
                int size2 = c22388M41137.size();
                if (size2 == 0) {
                    c22388.add(iMo4636);
                } else {
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = c22388M41137.get(i3);
                        C22388 c22389 = c22388Arr[i4];
                        if (c22389 == null) {
                            c22389 = new C22388(10);
                            c22388Arr[i4] = c22389;
                        }
                        c22389.add(iMo4636);
                    }
                }
            }
            for (int i5 = 0; i5 < iM40215; i5++) {
                C22388 c223810 = c22388Arr[i5];
                if (c223810 != null) {
                    c223810.m50244();
                    c223810.mo22326();
                }
            }
            c22388.m50244();
            c22388.mo22326();
            int i6 = this.f42001;
            if (c22388Arr[i6] == null) {
                c22388Arr[i6] = C22388.f70620;
            }
            this.f42002 = c22388Arr;
            this.f42000 = c22388;
        }
        C22388 c223811 = this.f42002[i];
        if (c223811 != null) {
            return c223811;
        }
        throw new RuntimeException("no such block: ".concat(C16351.m37153(i)));
    }
}
