package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܶ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15565 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6394 f47973;

    public C15565(ActivityC6394 activityC6394) {
        this.f47973 = activityC6394;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((AbstractC10628) abstractC3255).mo26658((AbstractC20506) this.f47973.f19792.get(i));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f47973.f19792.size();
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        return ((AbstractC20506) this.f47973.f19792.get(i)).mo14471();
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC6394 activityC6394 = this.f47973;
        if (i == 1) {
            return new C22622(activityC6394, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC12744(activityC6394, viewGroup);
        }
        throw new RuntimeException();
    }
}
