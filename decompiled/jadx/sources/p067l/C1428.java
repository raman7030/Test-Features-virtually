package p067l;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۨܽ */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1428 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f38242;

    /* JADX INFO: renamed from: ۧ */
    public final Runnable f38243;

    /* JADX INFO: renamed from: ܳ */
    public OnBackInvokedCallback f38244;

    /* JADX INFO: renamed from: ܽ */
    public boolean f38245;

    /* JADX INFO: renamed from: ܿ */
    public OnBackInvokedDispatcher f38246;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC0868 f38247;

    /* JADX INFO: renamed from: ᩻ */
    public final C13380 f38248;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1070 m30940(AbstractC0868 abstractC0868) {
        C13045.m29867(abstractC0868, "onBackPressedCallback");
        this.f38248.addLast(abstractC0868);
        C1463 c1463 = new C1463(this, abstractC0868);
        abstractC0868.m4606(c1463);
        m30935();
        abstractC0868.m4605(new C1148(0, this, C1428.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V"));
        return c1463;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30942(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C13045.m29867(onBackInvokedDispatcher, "invoker");
        this.f38246 = onBackInvokedDispatcher;
        m30933(this.f38245);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30943(InterfaceC24784 interfaceC24784, AbstractC0868 abstractC0868) {
        C13045.m29867(interfaceC24784, "owner");
        C13045.m29867(abstractC0868, "onBackPressedCallback");
        AbstractC9381 lifecycle = interfaceC24784.getLifecycle();
        if (lifecycle.mo21805() == EnumC15415.DESTROYED) {
            return;
        }
        abstractC0868.m4606(new C1498(this, lifecycle, abstractC0868));
        m30935();
        abstractC0868.m4605(new C1358(0, this, C1428.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30941() {
        Object objPrevious;
        C13380 c13380 = this.f38248;
        ListIterator listIterator = c13380.listIterator(c13380.mo27554());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC0868) objPrevious).m4609());
        AbstractC0868 abstractC0868 = (AbstractC0868) objPrevious;
        this.f38247 = null;
        if (abstractC0868 != null) {
            abstractC0868.mo3603();
            return;
        }
        Runnable runnable = this.f38243;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C1428(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackM48862;
        this.f38243 = runnable;
        this.f38248 = new C13380();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackM48862 = C1008.f13417.m12283(new C1113(this), new C0903(this), new C1253(this), new C1603(this));
            } else {
                onBackInvokedCallbackM48862 = C1848.f68205.m48862(new C1918(this));
            }
            this.f38244 = onBackInvokedCallbackM48862;
        }
    }

    public C1428() {
        this(null);
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m30933(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f38246;
        OnBackInvokedCallback onBackInvokedCallback = this.f38244;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C1848 c1848 = C1848.f68205;
        if (z && !this.f38242) {
            c1848.m48863(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f38242 = true;
        } else {
            if (z || !this.f38242) {
                return;
            }
            c1848.m48864(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f38242 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public final void m30935() {
        boolean z = this.f38245;
        boolean z2 = false;
        C13380 c13380 = this.f38248;
        if (c13380 == null || !c13380.isEmpty()) {
            Iterator it = c13380.iterator();
            while (it.hasNext()) {
                if (((AbstractC0868) it.next()).m4609()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f38245 = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m30933(z2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m30936(C1428 c1428, C1840 c1840) {
        Object objPrevious;
        C13380 c13380 = c1428.f38248;
        ListIterator listIterator = c13380.listIterator(c13380.mo27554());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC0868) objPrevious).m4609());
        AbstractC0868 abstractC0868 = (AbstractC0868) objPrevious;
        c1428.f38247 = abstractC0868;
        if (abstractC0868 != null) {
            C13045.m29867(c1840, "backEvent");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m30932(C1428 c1428, C1840 c1840) {
        Object objPrevious;
        C13380 c13380 = c1428.f38248;
        ListIterator listIterator = c13380.listIterator(c13380.mo27554());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC0868) objPrevious).m4609());
        if (((AbstractC0868) objPrevious) != null) {
            C13045.m29867(c1840, "backEvent");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static final void m30937(C1428 c1428) {
        Object objPrevious;
        C13380 c13380 = c1428.f38248;
        ListIterator listIterator = c13380.listIterator(c13380.mo27554());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (((AbstractC0868) objPrevious).m4609()) {
                c1428.f38247 = null;
            }
        }
        objPrevious = null;
        c1428.f38247 = null;
    }
}
