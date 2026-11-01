package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.֡᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3078 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC7102 f5568;

    public C3078(ActivityC7102 activityC7102) {
        this.f5568 = activityC7102;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        String string;
        ViewOnClickListenerC21855 viewOnClickListenerC21855 = (ViewOnClickListenerC21855) abstractC5462;
        ActivityC7102 activityC7102 = this.f5568;
        C3749 c3749 = (C3749) activityC7102.f18522.get(i);
        viewOnClickListenerC21855.f68758.setText(c3749.f7960);
        int iM22088 = C9486.m22088(c3749.m7237());
        boolean zM22098 = C9486.m22098(c3749.m7237());
        if (iM22088 == 0) {
            string = activityC7102.getString(R.string.MT_Protector);
        } else if (iM22088 == 1) {
            string = activityC7102.getString(R.string.MT_Protector);
        } else if (iM22088 != 2) {
            string = iM22088 != 3 ? C0708d.f2599O : activityC7102.getString(R.string.MT_Protector);
        } else {
            string = activityC7102.getString(R.string.MT_Protector);
        }
        if (zM22098) {
            StringBuilder sbM21133 = C9179.m21133(string, " (");
            sbM21133.append(activityC7102.getString(R.string.MT_Protector));
            sbM21133.append(MotionUtils.EASING_TYPE_FORMAT_END);
            string = sbM21133.toString();
        }
        viewOnClickListenerC21855.f68759.setText(string);
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC7102 activityC7102 = this.f5568;
        return new ViewOnClickListenerC21855(activityC7102, LayoutInflater.from(activityC7102).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f5568.f18522.size();
    }
}
