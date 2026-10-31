package l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11649 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f34740;

    public C11649(ActivityC17169 activityC17169) {
        this.f34740 = activityC17169;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ViewOnClickListenerC17875 viewOnClickListenerC17875 = (ViewOnClickListenerC17875) abstractC3255;
        ActivityC17169 activityC17169 = this.f34740;
        AbstractC14346 abstractC14346 = (AbstractC14346) activityC17169.f52616.get(i);
        Drawable drawableM34238 = abstractC14346.m34238();
        viewOnClickListenerC17875.f54591.setText(abstractC14346.mo14422());
        if (activityC17169.f52618 == i) {
            viewOnClickListenerC17875.f54591.setTextColor(C21943.f70257);
            viewOnClickListenerC17875.f54596.setBackgroundColor(C21943.f70257 & 553648127);
            drawableM34238.setColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
        } else {
            viewOnClickListenerC17875.f54591.setTextColor(C21943.f70275);
            viewOnClickListenerC17875.f54596.setBackgroundColor(0);
            drawableM34238.setColorFilter(C21943.f70284, PorterDuff.Mode.SRC_IN);
        }
        viewOnClickListenerC17875.f54595.setImageDrawable(drawableM34238);
        String strMo14419 = abstractC14346.mo14419();
        if (strMo14419 == null) {
            viewOnClickListenerC17875.f54591.setTextSize(17.0f);
            viewOnClickListenerC17875.f54592.setVisibility(8);
        } else {
            viewOnClickListenerC17875.f54591.setTextSize(15.0f);
            viewOnClickListenerC17875.f54592.setVisibility(0);
            viewOnClickListenerC17875.f54592.setText(strMo14419);
        }
        if (abstractC14346.m34230()) {
            viewOnClickListenerC17875.itemView.setBackgroundColor(C21943.f70303);
        } else {
            viewOnClickListenerC17875.itemView.setBackgroundColor(0);
        }
        activityC17169.f52599.m38949(viewOnClickListenerC17875.f54597, ActivityC17169.m40323(activityC17169, abstractC14346));
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC17169 activityC17169 = this.f34740;
        return new ViewOnClickListenerC17875(activityC17169, LayoutInflater.from(activityC17169).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f34740.f52616.size();
    }
}
