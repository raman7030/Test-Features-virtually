package p067l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۧۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final class C12744 {

    /* JADX INFO: renamed from: ֫ */
    public Runnable f35788;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f35789 = false;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C18107 f35790;

    public C12744(C18107 c18107, Runnable runnable) {
        this.f35790 = c18107;
        this.f35788 = runnable;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m29270() {
        return this.f35789;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m29271() {
        return !this.f35789;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29269() {
        m29268(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29267(C12744 c12744) {
        c12744.m29268(true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29268(boolean z) {
        C18514 c18514;
        synchronized (this) {
            if (this.f35789) {
                return;
            }
            this.f35789 = true;
            Runnable runnable = z ? this.f35788 : null;
            this.f35788 = null;
            synchronized (this.f35790.f54060) {
                if (this.f35790.f54060.remove(this)) {
                    boolean zIsEmpty = this.f35790.f54060.isEmpty();
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (zIsEmpty) {
                        C9705 c9705 = this.f35790.f54067;
                        if (c9705.f26771 == null || (c18514 = c9705.f26767) == null || c9705.f26768 == null) {
                            return;
                        }
                        c18514.cancel();
                        c9705.f26768.cancel();
                        C18514 c18515 = c9705.f26770;
                        if (c18515 != null) {
                            c18515.cancel();
                        }
                        if (c9705.f26771.getAlpha() <= 0.07f) {
                            c9705.f26771.setVisibility(4);
                            c9705.f26771 = null;
                            c9705.f26767 = null;
                            c9705.f26768 = null;
                            c9705.f26770 = null;
                            return;
                        }
                        ViewGroup viewGroup = c9705.f26771;
                        C18514 c18514M42063 = C18514.m42063(viewGroup, viewGroup.getAlpha(), 0.0f);
                        c9705.f26772 = c18514M42063;
                        c18514M42063.m53840(new C15739(c9705));
                        c9705.f26772.m30122();
                        c9705.f26767 = null;
                        c9705.f26768 = null;
                        c9705.f26770 = null;
                    }
                }
            }
        }
    }
}
