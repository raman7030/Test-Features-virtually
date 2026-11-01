package p067l;

import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17976 extends AbstractC21283 {
    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C19318 c19318 = (C19318) abstractC5462;
        C11169 c11169M25783 = C11169.m25783(DialogInterfaceOnDismissListenerC18647.f55660[i]);
        c19318.f57682.setText(c11169M25783.m25786());
        c19318.f57681.setImageDrawable(c11169M25783.m25784().f66888.m30927());
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C19318(C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return DialogInterfaceOnDismissListenerC18647.f55660.length;
    }
}
