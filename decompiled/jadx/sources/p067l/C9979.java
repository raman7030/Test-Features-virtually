package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes3.dex */
public final class C9979 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC16683 f27647;

    public C9979(ActivityC16683 activityC16683) {
        this.f27647 = activityC16683;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((ViewOnClickListenerC5956) abstractC5462).m13367((C4615) this.f27647.f49104.get(i));
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC16683 activityC16683 = this.f27647;
        return new ViewOnClickListenerC5956(activityC16683, activityC16683.f49106, LayoutInflater.from(activityC16683).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f27647.f49104.size();
    }
}
