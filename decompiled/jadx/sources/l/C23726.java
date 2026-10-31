package l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23726 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2560 f76833;

    public C23726() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f76833 = new C15964();
        } else if (i >= 29) {
            this.f76833 = new C8910();
        } else {
            this.f76833 = new C6793();
        }
    }

    public C23726(C21610 c21610) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f76833 = new C15964(c21610);
        } else if (i >= 29) {
            this.f76833 = new C8910(c21610);
        } else {
            this.f76833 = new C6793(c21610);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52376(C11007 c11007) {
        this.f76833.mo8106(c11007);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52374(int i, C11007 c11007) {
        this.f76833.mo8100(i, c11007);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52375(C11007 c11007) {
        this.f76833.mo8103(c11007);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21610 m52373() {
        return this.f76833.mo8102();
    }
}
