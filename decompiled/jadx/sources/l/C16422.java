package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes4.dex */
public final class C16422 extends AbstractC19902 {
    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C17834 c17834 = (C17834) abstractC3255;
        C9260 c9260M23782 = C9260.m23782(DialogInterfaceOnDismissListenerC17128.f52477[i]);
        c17834.f54484.setText(c9260M23782.m23785());
        c17834.f54483.setImageDrawable(c9260M23782.m23783().f64252.m28878());
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C17834(C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return DialogInterfaceOnDismissListenerC17128.f52477.length;
    }
}
