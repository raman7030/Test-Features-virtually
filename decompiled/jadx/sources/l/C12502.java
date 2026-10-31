package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O9NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12502 extends AbstractC16876 implements InterfaceC16233 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C12502 f37547 = new C12502(1);

    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C11233.m27805(view, "currentView");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
