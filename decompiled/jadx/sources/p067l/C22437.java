package p067l;

/* JADX INFO: renamed from: l.᩷᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22437 extends AbstractC19083 {

    /* JADX INFO: renamed from: ֡ */
    public final C16400 f70788;

    /* JADX INFO: renamed from: ۖ */
    public final C9025 f70789;

    /* JADX INFO: renamed from: ۘ */
    public final C24053 f70790;

    /* JADX INFO: renamed from: ᩴ */
    public final C16400 f70791;

    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC7684 f70792;

    public C22437(C24053 c24053, AbstractC7684 abstractC7684, int i, int i2, int i3) {
        super(i3);
        this.f70791 = new C16400(this);
        this.f70788 = new C16400(this);
        this.f70790 = c24053;
        this.f70792 = abstractC7684;
        this.f70789 = new C9025(this, i, i2);
        mo10616();
    }

    @Override // p067l.AbstractC19083
    /* JADX INFO: renamed from: ֫ */
    public final void mo10616() {
        super.mo10616();
        this.f70789.m20898();
        this.f70791.mo26910();
        this.f70788.mo26910();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m50411() {
        return this.f56940[0] == -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50410() throws C23856 {
        int i;
        int iM37215;
        C24053 c24053 = this.f70790;
        c24053.m53316();
        while (true) {
            boolean zM53314 = c24053.m53314();
            AbstractC7684 abstractC7684 = this.f70792;
            if (zM53314) {
                int iM53305 = c24053.m53305() & this.f56941;
                short[][] sArr = this.f56947;
                C2989 c2989 = this.f56944;
                if (abstractC7684.m17799(sArr[c2989.m5006()], iM53305) == 0) {
                    this.f70789.m20897();
                } else {
                    int iM17799 = abstractC7684.m17799(this.f56946, c2989.m5006());
                    int iM37216 = 1;
                    int[] iArr = this.f56940;
                    if (iM17799 == 0) {
                        c2989.m5009();
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        iM37215 = this.f70791.m37215(iM53305);
                        int iM17800 = abstractC7684.m17800(this.f56942[iM37215 < 6 ? iM37215 - 2 : 3]);
                        if (iM17800 < 4) {
                            iArr[0] = iM17800;
                        } else {
                            int i2 = iM17800 >> 1;
                            int i3 = (2 | (iM17800 & 1)) << (i2 - 1);
                            iArr[0] = i3;
                            if (iM17800 < 14) {
                                short[] sArr2 = this.f56945[iM17800 - 4];
                                int i4 = 1;
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    int iM177910 = abstractC7684.m17799(sArr2, i4);
                                    i4 = (i4 << 1) | iM177910;
                                    int i7 = i6 + 1;
                                    i5 |= iM177910 << i6;
                                    if (i4 >= sArr2.length) {
                                        break;
                                    } else {
                                        i6 = i7;
                                    }
                                }
                                iArr[0] = i3 | i5;
                            } else {
                                int iM17798 = i3 | (abstractC7684.m17798(i2 - 5) << 4);
                                iArr[0] = iM17798;
                                int i8 = 1;
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    short[] sArr3 = this.f56938;
                                    int iM177911 = abstractC7684.m17799(sArr3, i8);
                                    i8 = (i8 << 1) | iM177911;
                                    int i11 = i10 + 1;
                                    i9 |= iM177911 << i10;
                                    if (i8 >= sArr3.length) {
                                        break;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                iArr[0] = iM17798 | i9;
                            }
                        }
                    } else {
                        if (abstractC7684.m17799(this.f56943, c2989.m5006()) == 0) {
                            if (abstractC7684.m17799(this.f56949[c2989.m5006()], iM53305) == 0) {
                                c2989.m5013();
                            }
                            iM37215 = iM37216;
                        } else {
                            if (abstractC7684.m17799(this.f56939, c2989.m5006()) == 0) {
                                i = iArr[1];
                            } else {
                                if (abstractC7684.m17799(this.f56948, c2989.m5006()) == 0) {
                                    i = iArr[2];
                                } else {
                                    i = iArr[3];
                                    iArr[3] = iArr[2];
                                }
                                iArr[2] = iArr[1];
                            }
                            iArr[1] = iArr[0];
                            iArr[0] = i;
                        }
                        c2989.m5011();
                        iM37216 = this.f70788.m37215(iM53305);
                        iM37215 = iM37216;
                    }
                    c24053.m53309(iArr[0], iM37215);
                }
            } else {
                abstractC7684.mo7010();
                return;
            }
        }
    }
}
