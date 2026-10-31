package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8008 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15062 f24733;

    public C8008(ActivityC15062 activityC15062) {
        this.f24733 = activityC15062;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnClickListenerC3775) abstractC3255).m11431((C2364) this.f24733.f45986.get(i));
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC15062 activityC15062 = this.f24733;
        return new ViewOnClickListenerC3775(activityC15062, activityC15062.f45988, LayoutInflater.from(activityC15062).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f24733.f45986.size();
    }
}
