package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10622 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6388 f31903;

    public C10622(ActivityC6388 activityC6388) {
        this.f31903 = activityC6388;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnClickListenerC3775) abstractC3255).m11431((C2364) this.f31903.f19758.get(i));
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC6388 activityC6388 = this.f31903;
        return new ViewOnClickListenerC3775(activityC6388, activityC6388.f19760, LayoutInflater.from(activityC6388).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f31903.f19758.size();
    }
}
