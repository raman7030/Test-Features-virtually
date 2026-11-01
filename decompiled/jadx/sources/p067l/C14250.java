package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O9NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14250 extends AbstractC18408 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C14250 f40571 = new C14250(1);

    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C13045.m29867(view, "currentView");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
