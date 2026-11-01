package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15895 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC11203 f46002;

    public C15895(ActivityC11203 activityC11203) {
        this.f46002 = activityC11203;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC21932 viewOnClickListenerC21932 = (ViewOnClickListenerC21932) abstractC5462;
        viewOnClickListenerC21932.f68952.setVisibility(0);
        viewOnClickListenerC21932.f68950.setText(((C9562) ((ArrayList) this.f46002.f31126).get(i)).m22266());
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC11203 activityC11203 = this.f46002;
        return new ViewOnClickListenerC21932(activityC11203, LayoutInflater.from(activityC11203).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return ((ArrayList) this.f46002.f31126).size();
    }
}
