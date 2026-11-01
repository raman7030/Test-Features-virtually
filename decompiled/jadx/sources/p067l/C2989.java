package p067l;

/* JADX INFO: renamed from: l.֡᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F575 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2989 {

    /* JADX INFO: renamed from: ֫ */
    public int f5277;

    /* JADX INFO: renamed from: ܽ */
    public final void m5010() {
        this.f5277 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m5006() {
        return this.f5277;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5007(C2989 c2989) {
        this.f5277 = c2989.f5277;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m5012() {
        int i = this.f5277;
        if (i <= 3) {
            this.f5277 = 0;
        } else if (i <= 9) {
            this.f5277 = i - 3;
        } else {
            this.f5277 = i - 6;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m5009() {
        this.f5277 = this.f5277 >= 7 ? 10 : 7;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m5011() {
        this.f5277 = this.f5277 < 7 ? 8 : 11;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m5013() {
        this.f5277 = this.f5277 < 7 ? 9 : 11;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m5008() {
        return this.f5277 < 7;
    }
}
