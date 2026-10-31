package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.֡᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0746 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4980 f2795;

    public C0746(ActivityC4980 activityC4980) {
        this.f2795 = activityC4980;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        String string;
        ViewOnClickListenerC20503 viewOnClickListenerC20503 = (ViewOnClickListenerC20503) abstractC3255;
        ActivityC4980 activityC4980 = this.f2795;
        C1452 c1452 = (C1452) activityC4980.f15688.get(i);
        viewOnClickListenerC20503.f66079.setText(c1452.f5187);
        int iM20112 = C7489.m20112(c1452.m4994());
        boolean zM20122 = C7489.m20122(c1452.m4994());
        if (iM20112 == 0) {
            string = activityC4980.getString(R.string.MT_Protector);
        } else if (iM20112 == 1) {
            string = activityC4980.getString(R.string.MT_Protector);
        } else if (iM20112 != 2) {
            string = iM20112 != 3 ? d.O : activityC4980.getString(R.string.MT_Protector);
        } else {
            string = activityC4980.getString(R.string.MT_Protector);
        }
        if (zM20122) {
            StringBuilder sbM19190 = C7166.m19190(string, " (");
            sbM19190.append(activityC4980.getString(R.string.MT_Protector));
            sbM19190.append(MotionUtils.EASING_TYPE_FORMAT_END);
            string = sbM19190.toString();
        }
        viewOnClickListenerC20503.f66080.setText(string);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC4980 activityC4980 = this.f2795;
        return new ViewOnClickListenerC20503(activityC4980, LayoutInflater.from(activityC4980).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f2795.f15688.size();
    }
}
