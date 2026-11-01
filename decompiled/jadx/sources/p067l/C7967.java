package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7967 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC13332 f20943;

    public C7967(ActivityC13332 activityC13332) {
        this.f20943 = activityC13332;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((ViewOnClickListenerC5956) abstractC5462).m13367((C4615) this.f20943.f37440.get(i));
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC13332 activityC13332 = this.f20943;
        return new ViewOnClickListenerC5956(activityC13332, activityC13332.f37441, LayoutInflater.from(activityC13332).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f20943.f37440.size();
    }
}
