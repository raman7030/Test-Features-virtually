package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15332 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3339 f46991;

    public C15332(ActivityC3339 activityC3339) {
        this.f46991 = activityC3339;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ViewOnClickListenerC4750 viewOnClickListenerC4750 = (ViewOnClickListenerC4750) abstractC3255;
        viewOnClickListenerC4750.f15064.setVisibility(0);
        viewOnClickListenerC4750.f15062.setText(((C12511) this.f46991.f10555.get(i)).m30693());
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC3339 activityC3339 = this.f46991;
        return new ViewOnClickListenerC4750(activityC3339, LayoutInflater.from(activityC3339).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f46991.f10555.size();
    }
}
