package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14233 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9296 f42909;

    public C14233(ActivityC9296 activityC9296) {
        this.f42909 = activityC9296;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ViewOnClickListenerC20585 viewOnClickListenerC20585 = (ViewOnClickListenerC20585) abstractC3255;
        viewOnClickListenerC20585.f66271.setVisibility(0);
        viewOnClickListenerC20585.f66269.setText(((C7569) ((ArrayList) this.f42909.f28177).get(i)).m20289());
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC9296 activityC9296 = this.f42909;
        return new ViewOnClickListenerC20585(activityC9296, LayoutInflater.from(activityC9296).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return ((ArrayList) this.f42909.f28177).size();
    }
}
