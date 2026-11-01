package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧᩳ */
/* JADX INFO: compiled from: B9BJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C1395 extends AbstractC18408 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C1395 f36479 = new C1395(1);

    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C13045.m29867(view, "it");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
