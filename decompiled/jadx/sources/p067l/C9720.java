package p067l;

import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۟᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9720 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C19799 f26847;

    public C9720(C19799 c19799) {
        this.f26847 = c19799;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((ViewOnClickListenerC18457) abstractC5462).m42013(i);
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC18457(this.f26847, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f26847.size();
    }
}
