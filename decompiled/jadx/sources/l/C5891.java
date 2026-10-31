package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5891 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11536 f18088;

    public C5891(ActivityC11536 activityC11536) {
        this.f18088 = activityC11536;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnClickListenerC3775) abstractC3255).m11431((C2364) this.f18088.f34443.get(i));
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC11536 activityC11536 = this.f18088;
        return new ViewOnClickListenerC3775(activityC11536, activityC11536.f34444, LayoutInflater.from(activityC11536).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f18088.f34443.size();
    }
}
