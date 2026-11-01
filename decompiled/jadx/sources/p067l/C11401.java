package p067l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11401 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f31821 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ActivityC10059 f31822;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC10730 viewOnClickListenerC10730 = (ViewOnClickListenerC10730) abstractC5462;
        C19447 c19447 = (C19447) this.f31821.get(i);
        viewOnClickListenerC10730.f29725 = c19447;
        viewOnClickListenerC10730.f29724.setImageDrawable(c19447.f59241);
        c19447.f59239 = true;
        viewOnClickListenerC10730.f29726.setText(c19447.f59238);
        viewOnClickListenerC10730.f29721.setText(c19447.f59240);
        viewOnClickListenerC10730.f29722.setText(c19447.f59243);
    }

    public C11401(ActivityC10059 activityC10059) {
        this.f31822 = activityC10059;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC10730(this.f31822, viewGroup);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f31821.size();
    }
}
