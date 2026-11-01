package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16940 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC5542 f50117;

    public C16940(ActivityC5542 activityC5542) {
        this.f50117 = activityC5542;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC6883 viewOnClickListenerC6883 = (ViewOnClickListenerC6883) abstractC5462;
        viewOnClickListenerC6883.f17895.setVisibility(0);
        viewOnClickListenerC6883.f17893.setText(((C14259) this.f50117.f13365.get(i)).m32768());
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC5542 activityC5542 = this.f50117;
        return new ViewOnClickListenerC6883(activityC5542, LayoutInflater.from(activityC5542).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f50117.f13365.size();
    }
}
