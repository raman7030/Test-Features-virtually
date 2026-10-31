package l;

import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.ۛ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6327 extends AbstractDialogInterfaceOnClickListenerC1643 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f19615;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC7738 f19616;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f19617;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19618;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6327(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7739, int i, CharSequence[] charSequenceArr, DialogInterfaceC0206 dialogInterfaceC0206) {
        super(viewOnLayoutChangeListenerC7739);
        this.f19616 = viewOnLayoutChangeListenerC7738;
        this.f19618 = i;
        this.f19617 = charSequenceArr;
        this.f19615 = dialogInterfaceC0206;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1643
    /* JADX INFO: renamed from: ܽ */
    public final void mo5524() {
        String strM5521 = m5521();
        if (!strM5521.isEmpty()) {
            BinderC11993 binderC11993 = this.f19616.f23945;
            int i = this.f19618;
            binderC11993.m29308(i, strM5521);
            this.f19617[i] = strM5521;
            ((BaseAdapter) this.f19615.m1443().getAdapter()).notifyDataSetChanged();
        }
        m5518();
    }
}
