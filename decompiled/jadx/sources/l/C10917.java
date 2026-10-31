package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۧۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final class C10917 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Runnable f32810;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f32811 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f32812;

    public C10917(C16560 c16560, Runnable runnable) {
        this.f32812 = c16560;
        this.f32810 = runnable;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27225() {
        return this.f32811;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m27226() {
        return !this.f32811;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27224() {
        m27223(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27222(C10917 c10917) {
        c10917.m27223(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27223(boolean z) {
        C16989 c16989;
        synchronized (this) {
            if (this.f32811) {
                return;
            }
            this.f32811 = true;
            Runnable runnable = z ? this.f32810 : null;
            this.f32810 = null;
            synchronized (this.f32812.f50883) {
                if (this.f32812.f50883.remove(this)) {
                    boolean zIsEmpty = this.f32812.f50883.isEmpty();
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (zIsEmpty) {
                        C7719 c7719 = this.f32812.f50890;
                        if (c7719.f23858 == null || (c16989 = c7719.f23854) == null || c7719.f23855 == null) {
                            return;
                        }
                        c16989.cancel();
                        c7719.f23855.cancel();
                        C16989 c169810 = c7719.f23857;
                        if (c169810 != null) {
                            c169810.cancel();
                        }
                        if (c7719.f23858.getAlpha() <= 0.07f) {
                            c7719.f23858.setVisibility(4);
                            c7719.f23858 = null;
                            c7719.f23854 = null;
                            c7719.f23855 = null;
                            c7719.f23857 = null;
                            return;
                        }
                        ViewGroup viewGroup = c7719.f23858;
                        C16989 c16989M39820 = C16989.m39820(viewGroup, viewGroup.getAlpha(), 0.0f);
                        c7719.f23859 = c16989M39820;
                        c16989M39820.m51444(new C14068(c7719));
                        c7719.f23859.m28077();
                        c7719.f23854 = null;
                        c7719.f23855 = null;
                        c7719.f23857 = null;
                    }
                }
            }
        }
    }
}
