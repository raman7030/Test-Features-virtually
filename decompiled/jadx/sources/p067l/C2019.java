package p067l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩻ܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2019 {

    /* JADX INFO: renamed from: ֫ */
    public final C0969 f79584;

    public C2019() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f79584 = new C1634();
        } else if (i >= 29) {
            this.f79584 = new C1284();
        } else {
            this.f79584 = new C1179();
        }
    }

    public C2019(C1914 c1914) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f79584 = new C1634(c1914);
        } else if (i >= 29) {
            this.f79584 = new C1284(c1914);
        } else {
            this.f79584 = new C1179(c1914);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final void m54783(C1388 c1388) {
        this.f79584.mo10138(c1388);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54781(int i, C1388 c1388) {
        this.f79584.mo10132(i, c1388);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m54782(C1388 c1388) {
        this.f79584.mo10135(c1388);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1914 m54780() {
        return this.f79584.mo10134();
    }
}
