package p067l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13440 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC18686 f37739;

    public C13440(ActivityC18686 activityC18686) {
        this.f37739 = activityC18686;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC19357 viewOnClickListenerC19357 = (ViewOnClickListenerC19357) abstractC5462;
        ActivityC18686 activityC18686 = this.f37739;
        AbstractC16003 abstractC16003 = (AbstractC16003) activityC18686.f55797.get(i);
        Drawable drawableM36371 = abstractC16003.m36371();
        viewOnClickListenerC19357.f57788.setText(abstractC16003.mo16326());
        if (activityC18686.f55799 == i) {
            viewOnClickListenerC19357.f57788.setTextColor(C23223.f72969);
            viewOnClickListenerC19357.f57793.setBackgroundColor(C23223.f72969 & 553648127);
            drawableM36371.setColorFilter(C23223.f72969, PorterDuff.Mode.SRC_IN);
        } else {
            viewOnClickListenerC19357.f57788.setTextColor(C23223.f72986);
            viewOnClickListenerC19357.f57793.setBackgroundColor(0);
            drawableM36371.setColorFilter(C23223.f72995, PorterDuff.Mode.SRC_IN);
        }
        viewOnClickListenerC19357.f57792.setImageDrawable(drawableM36371);
        String strMo16323 = abstractC16003.mo16323();
        if (strMo16323 == null) {
            viewOnClickListenerC19357.f57788.setTextSize(17.0f);
            viewOnClickListenerC19357.f57789.setVisibility(8);
        } else {
            viewOnClickListenerC19357.f57788.setTextSize(15.0f);
            viewOnClickListenerC19357.f57789.setVisibility(0);
            viewOnClickListenerC19357.f57789.setText(strMo16323);
        }
        if (abstractC16003.m36363()) {
            viewOnClickListenerC19357.itemView.setBackgroundColor(C23223.f73014);
        } else {
            viewOnClickListenerC19357.itemView.setBackgroundColor(0);
        }
        activityC18686.f55780.m41175(viewOnClickListenerC19357.f57794, ActivityC18686.m42568(activityC18686, abstractC16003));
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC18686 activityC18686 = this.f37739;
        return new ViewOnClickListenerC19357(activityC18686, LayoutInflater.from(activityC18686).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f37739.f55797.size();
    }
}
