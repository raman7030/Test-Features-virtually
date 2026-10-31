package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ANL */
/* JADX INFO: loaded from: classes.dex */
public final class C23261 extends AbstractC0525 implements InterfaceC10936 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC7739 f74736;

    @Override // l.InterfaceC10936
    /* JADX INFO: renamed from: ֫ */
    public final void mo27259(View view) {
        C11233.m27805(view, "panel");
    }

    @Override // l.InterfaceC10936
    /* JADX INFO: renamed from: ۧ */
    public final void mo27260(View view) {
        C11233.m27805(view, "panel");
        m2240(true);
    }

    @Override // l.InterfaceC10936
    /* JADX INFO: renamed from: ܽ */
    public final void mo27261(View view) {
        C11233.m27805(view, "panel");
        m2240(false);
    }

    public C23261(AbstractC7739 abstractC7739) {
        super(true);
        this.f74736 = abstractC7739;
        ((C14462) abstractC7739.requireView()).m34540(this);
    }

    @Override // l.AbstractC0525
    /* JADX INFO: renamed from: ۧ */
    public final void mo1201() {
        ((C14462) this.f74736.requireView()).m34537();
    }
}
