package p067l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܶ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17162 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC8446 f51105;

    public C17162(ActivityC8446 activityC8446) {
        this.f51105 = activityC8446;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((AbstractC12470) abstractC5462).mo28698((AbstractC21858) this.f51105.f22665.get(i));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f51105.f22665.size();
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        return ((AbstractC21858) this.f51105.f22665.get(i)).mo16375();
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC8446 activityC8446 = this.f51105;
        if (i == 1) {
            return new C23869(activityC8446, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC14481(activityC8446, viewGroup);
        }
        throw new RuntimeException();
    }
}
