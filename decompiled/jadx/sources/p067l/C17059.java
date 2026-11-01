package p067l;

/* JADX INFO: renamed from: l.ܶ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17059 {

    /* JADX INFO: renamed from: ᩳ */
    public final C10355 f50448;

    /* JADX INFO: renamed from: ܽ */
    public int f50447 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f50446 = -1;

    /* JADX INFO: renamed from: ֫ */
    public int f50445 = -1;

    public C17059(C10355 c10355) {
        this.f50448 = c10355;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38705() {
        int i = this.f50447;
        if (i == 0) {
            return;
        }
        C10355 c10355 = this.f50448;
        if (i == 1) {
            c10355.m23982(this.f50446, this.f50445);
        } else if (i == 2) {
            c10355.m23984(this.f50446, this.f50445);
        } else if (i == 3) {
            c10355.m23981(this.f50446, this.f50445);
        }
        this.f50447 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38707(int i, int i2) {
        m38705();
        this.f50448.m23983(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38706(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f50447 == 3 && i <= (i4 = this.f50445 + (i3 = this.f50446)) && (i5 = i + i2) >= i3) {
            this.f50446 = Math.min(i, i3);
            this.f50445 = Math.max(i4, i5) - this.f50446;
        } else {
            m38705();
            this.f50446 = i;
            this.f50445 = i2;
            this.f50447 = 3;
        }
    }
}
