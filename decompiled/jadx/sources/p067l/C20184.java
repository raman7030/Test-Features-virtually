package p067l;

/* JADX INFO: renamed from: l.ᩴۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F8BR */
/* JADX INFO: loaded from: classes4.dex */
public final class C20184 {

    /* JADX INFO: renamed from: ܽ */
    public static C20184 f62466 = new C20184();

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5208[] f62467;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC5050 f62468;

    public C20184() {
        AbstractC5208 abstractC5208 = C21525.f67910;
        this.f62468 = C5431.f12957;
        AbstractC5208[] abstractC5208Arr = new AbstractC5208[18];
        this.f62467 = abstractC5208Arr;
        abstractC5208Arr[9] = abstractC5208;
        for (int i = 1; i <= 17; i++) {
            if (i != 9) {
                this.f62467[i] = new C21525(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C20184 m45660() {
        return f62466;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5208 m45662(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.f62467[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5050 m45661() {
        return this.f62468;
    }
}
