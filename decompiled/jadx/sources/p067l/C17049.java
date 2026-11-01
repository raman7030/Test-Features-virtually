package p067l;

/* JADX INFO: renamed from: l.ܶ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17049 extends C20404 {

    /* JADX INFO: renamed from: ֫ */
    public int f50431 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23086 f50432;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C3838 f50433;

    public C17049(C23086 c23086, C3838 c3838) {
        this.f50432 = c23086;
        this.f50433 = c3838;
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo23967(int i, int i2) {
        this.f50433.m7527(this.f50432.f72529, i, i2);
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17731(int i, int i2, int i3, boolean z) {
        byte b = EnumC2968.DBG_START_LOCAL.f5196;
        C3838 c3838 = this.f50433;
        c3838.m7529(b);
        C23086 c23086 = this.f50432;
        if (c23086.f18865.m12588() && z) {
            c3838.m7532(i);
        } else {
            c3838.m7530(i);
        }
        if (i2 != -1) {
            AbstractC7230[] abstractC7230Arr = c23086.f72530;
            int i4 = this.f50431;
            this.f50431 = i4 + 1;
            c3838.m7530(abstractC7230Arr[i4].f18866 + 1);
        } else {
            c3838.m7529(0);
        }
        if (i3 != -1) {
            AbstractC7230[] abstractC7230Arr2 = c23086.f72530;
            int i5 = this.f50431;
            this.f50431 = i5 + 1;
            c3838.m7530(abstractC7230Arr2[i5].f18866 + 1);
            return;
        }
        c3838.m7529(0);
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17730(int i, int i2, int i3, int i4, boolean z) {
        byte b = EnumC2968.DBG_START_LOCAL_EXTENDED.f5196;
        C3838 c3838 = this.f50433;
        c3838.m7529(b);
        C23086 c23086 = this.f50432;
        if (c23086.f18865.m12588() && z) {
            c3838.m7532(i);
        } else {
            c3838.m7530(i);
        }
        if (i2 != -1) {
            AbstractC7230[] abstractC7230Arr = c23086.f72530;
            int i5 = this.f50431;
            this.f50431 = i5 + 1;
            c3838.m7530(abstractC7230Arr[i5].f18866 + 1);
        } else {
            c3838.m7529(0);
        }
        if (i3 != -1) {
            AbstractC7230[] abstractC7230Arr2 = c23086.f72530;
            int i6 = this.f50431;
            this.f50431 = i6 + 1;
            c3838.m7530(abstractC7230Arr2[i6].f18866 + 1);
        } else {
            c3838.m7529(0);
        }
        if (i4 != -1) {
            AbstractC7230[] abstractC7230Arr3 = c23086.f72530;
            int i7 = this.f50431;
            this.f50431 = i7 + 1;
            c3838.m7530(abstractC7230Arr3[i7].f18866 + 1);
            return;
        }
        c3838.m7529(0);
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17729(int i) {
        byte b = EnumC2968.DBG_SET_FILE.f5196;
        C3838 c3838 = this.f50433;
        c3838.m7529(b);
        if (i != -1) {
            AbstractC7230[] abstractC7230Arr = this.f50432.f72530;
            int i2 = this.f50431;
            this.f50431 = i2 + 1;
            c3838.m7530(abstractC7230Arr[i2].f18866 + 1);
            return;
        }
        c3838.m7529(0);
    }
}
