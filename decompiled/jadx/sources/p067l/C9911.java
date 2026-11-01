package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9911 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC21312 f27474;

    public C9911(ActivityC21312 activityC21312) {
        this.f27474 = activityC21312;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC23323 viewOnClickListenerC23323 = (ViewOnClickListenerC23323) abstractC5462;
        viewOnClickListenerC23323.f73387.setVisibility(0);
        viewOnClickListenerC23323.f73386.setText(((C4547) this.f27474.f67168.get(i)).f14164);
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC21312 activityC21312 = this.f27474;
        return new ViewOnClickListenerC23323(activityC21312, LayoutInflater.from(activityC21312).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f27474.f67168.size();
    }
}
