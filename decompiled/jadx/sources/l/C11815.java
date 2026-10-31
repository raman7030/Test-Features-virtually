package l;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11815 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f35240;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable f35241;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedCallback f35242;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f35243;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedDispatcher f35244;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC0525 f35245;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11586 f35246;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4595 m28891(AbstractC0525 abstractC0525) {
        C11233.m27805(abstractC0525, "onBackPressedCallback");
        this.f35246.addLast(abstractC0525);
        C12520 c12520 = new C12520(this, abstractC0525);
        abstractC0525.m2239(c12520);
        m28886();
        abstractC0525.m2238(new C6170(0, this, C11815.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V"));
        return c12520;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28893(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C11233.m27805(onBackInvokedDispatcher, "invoker");
        this.f35244 = onBackInvokedDispatcher;
        m28884(this.f35243);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28894(InterfaceC23586 interfaceC23586, AbstractC0525 abstractC0525) {
        C11233.m27805(interfaceC23586, "owner");
        C11233.m27805(abstractC0525, "onBackPressedCallback");
        AbstractC7379 lifecycle = interfaceC23586.getLifecycle();
        if (lifecycle.mo19832() == EnumC13728.DESTROYED) {
            return;
        }
        abstractC0525.m2239(new C13225(this, lifecycle, abstractC0525));
        m28886();
        abstractC0525.m2238(new C10404(0, this, C11815.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28892() {
        Object objPrevious;
        C11586 c11586 = this.f35246;
        ListIterator listIterator = c11586.listIterator(c11586.mo25534());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC0525) objPrevious).m2242());
        AbstractC0525 abstractC0525 = (AbstractC0525) objPrevious;
        this.f35245 = null;
        if (abstractC0525 != null) {
            abstractC0525.mo1201();
            return;
        }
        Runnable runnable = this.f35241;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C11815(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackM46540;
        this.f35241 = runnable;
        this.f35246 = new C11586();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackM46540 = C3348.f10609.m10247(new C5465(this), new C1231(this), new C8287(this), new C15341(this));
            } else {
                onBackInvokedCallbackM46540 = C20282.f65530.m46540(new C21693(this));
            }
            this.f35242 = onBackInvokedCallbackM46540;
        }
    }

    public C11815() {
        this(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m28884(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f35244;
        OnBackInvokedCallback onBackInvokedCallback = this.f35242;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C20282 c20282 = C20282.f65530;
        if (z && !this.f35240) {
            c20282.m46541(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f35240 = true;
        } else {
            if (z || !this.f35240) {
                return;
            }
            c20282.m46542(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f35240 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28886() {
        boolean z = this.f35243;
        boolean z2 = false;
        C11586 c11586 = this.f35246;
        if (c11586 == null || !c11586.isEmpty()) {
            Iterator it = c11586.iterator();
            while (it.hasNext()) {
                if (((AbstractC0525) it.next()).m2242()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f35243 = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m28884(z2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m28887(C11815 c11815, C20118 c20118) {
        Object objPrevious;
        C11586 c11586 = c11815.f35246;
        ListIterator listIterator = c11586.listIterator(c11586.mo25534());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC0525) objPrevious).m2242());
        AbstractC0525 abstractC0525 = (AbstractC0525) objPrevious;
        c11815.f35245 = abstractC0525;
        if (abstractC0525 != null) {
            C11233.m27805(c20118, "backEvent");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m28883(C11815 c11815, C20118 c20118) {
        Object objPrevious;
        C11586 c11586 = c11815.f35246;
        ListIterator listIterator = c11586.listIterator(c11586.mo25534());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC0525) objPrevious).m2242());
        if (((AbstractC0525) objPrevious) != null) {
            C11233.m27805(c20118, "backEvent");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final void m28888(C11815 c11815) {
        Object objPrevious;
        C11586 c11586 = c11815.f35246;
        ListIterator listIterator = c11586.listIterator(c11586.mo25534());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (((AbstractC0525) objPrevious).m2242()) {
                c11815.f35245 = null;
            }
        }
        objPrevious = null;
        c11815.f35245 = null;
    }
}
