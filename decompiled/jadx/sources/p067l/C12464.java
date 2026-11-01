package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12464 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC8440 f34875;

    public C12464(ActivityC8440 activityC8440) {
        this.f34875 = activityC8440;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((ViewOnClickListenerC5956) abstractC5462).m13367((C4615) this.f34875.f22631.get(i));
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC8440 activityC8440 = this.f34875;
        return new ViewOnClickListenerC5956(activityC8440, activityC8440.f22633, LayoutInflater.from(activityC8440).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f34875.f22631.size();
    }
}
