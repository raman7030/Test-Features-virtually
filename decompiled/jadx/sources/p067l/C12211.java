package p067l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۤܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12211 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC11800 f34133;

    public C12211(ActivityC11800 activityC11800) {
        this.f34133 = activityC11800;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((AbstractC22529) abstractC5462).mo21060((AbstractC15562) this.f34133.f32955.get(i));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f34133.f32955.size();
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        return ((AbstractC15562) this.f34133.f32955.get(i)).mo18967();
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC11800 activityC11800 = this.f34133;
        if (i == 0) {
            return new ViewOnClickListenerC9117(activityC11800, viewGroup);
        }
        if (i == 1) {
            return new C24280(activityC11800, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC19846(activityC11800, viewGroup);
        }
        throw new RuntimeException();
    }
}
