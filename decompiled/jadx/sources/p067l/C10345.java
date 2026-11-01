package p067l;

/* JADX INFO: renamed from: l.۠᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10345 extends C3639 {

    /* JADX INFO: renamed from: ۧ */
    public int f28649;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C23086 f28650;

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo23967(int i, int i2) {
        this.f7584 += i2;
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17731(int i, int i2, int i3, boolean z) {
        this.f7584++;
        C23086 c23086 = this.f28650;
        if (c23086.f18865.m12588() && z) {
            this.f7584 = C12981.m29773(i) + this.f7584;
        } else {
            this.f7584 = C12981.m29759(i) + this.f7584;
        }
        if (i2 != -1) {
            int i4 = this.f7584;
            AbstractC7230[] abstractC7230Arr = c23086.f72530;
            int i5 = this.f28649;
            this.f28649 = i5 + 1;
            this.f7584 = C12981.m29759(abstractC7230Arr[i5].f18866 + 1) + i4;
        } else {
            this.f7584++;
        }
        if (i3 != -1) {
            int i6 = this.f7584;
            AbstractC7230[] abstractC7230Arr2 = c23086.f72530;
            int i7 = this.f28649;
            this.f28649 = i7 + 1;
            this.f7584 = C12981.m29759(abstractC7230Arr2[i7].f18866 + 1) + i6;
            return;
        }
        this.f7584++;
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17730(int i, int i2, int i3, int i4, boolean z) {
        this.f7584++;
        C23086 c23086 = this.f28650;
        if (c23086.f18865.m12588() && z) {
            this.f7584 = C12981.m29773(i) + this.f7584;
        } else {
            this.f7584 = C12981.m29759(i) + this.f7584;
        }
        if (i2 != -1) {
            int i5 = this.f7584;
            AbstractC7230[] abstractC7230Arr = c23086.f72530;
            int i6 = this.f28649;
            this.f28649 = i6 + 1;
            this.f7584 = C12981.m29759(abstractC7230Arr[i6].f18866 + 1) + i5;
        } else {
            this.f7584++;
        }
        if (i3 != -1) {
            int i7 = this.f7584;
            AbstractC7230[] abstractC7230Arr2 = c23086.f72530;
            int i8 = this.f28649;
            this.f28649 = i8 + 1;
            this.f7584 = C12981.m29759(abstractC7230Arr2[i8].f18866 + 1) + i7;
        } else {
            this.f7584++;
        }
        if (i4 != -1) {
            int i9 = this.f7584;
            AbstractC7230[] abstractC7230Arr3 = c23086.f72530;
            int i10 = this.f28649;
            this.f28649 = i10 + 1;
            this.f7584 = C12981.m29759(abstractC7230Arr3[i10].f18866 + 1) + i9;
            return;
        }
        this.f7584++;
    }

    public C10345(C23086 c23086) {
        this.f28650 = c23086;
        this.f7584 = 0;
        this.f28649 = 0;
    }

    @Override // p067l.C20404
    /* JADX INFO: renamed from: ֫ */
    public final void mo17729(int i) {
        int i2 = this.f7584;
        int i3 = i2 + 1;
        this.f7584 = i3;
        if (i != -1) {
            AbstractC7230[] abstractC7230Arr = this.f28650.f72530;
            int i4 = this.f28649;
            this.f28649 = i4 + 1;
            this.f7584 = C12981.m29759(abstractC7230Arr[i4].f18866 + 1) + i3;
            return;
        }
        this.f7584 = i2 + 2;
    }
}
