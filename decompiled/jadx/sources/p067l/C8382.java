package p067l;

import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.ۛ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8382 extends AbstractDialogInterfaceOnClickListenerC3930 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ DialogInterfaceC2564 f22486;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ViewOnLayoutChangeListenerC9723 f22487;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ CharSequence[] f22488;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ int f22489;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8382(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9724, int i, CharSequence[] charSequenceArr, DialogInterfaceC2564 dialogInterfaceC2564) {
        super(viewOnLayoutChangeListenerC9724);
        this.f22487 = viewOnLayoutChangeListenerC9723;
        this.f22489 = i;
        this.f22488 = charSequenceArr;
        this.f22486 = dialogInterfaceC2564;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC3930
    /* JADX INFO: renamed from: ܽ */
    public final void mo7754() {
        String strM7751 = m7751();
        if (!strM7751.isEmpty()) {
            BinderC13767 binderC13767 = this.f22487.f26858;
            int i = this.f22489;
            binderC13767.m31363(i, strM7751);
            this.f22488[i] = strM7751;
            ((BaseAdapter) this.f22486.m3856().getAdapter()).notifyDataSetChanged();
        }
        m7748();
    }
}
