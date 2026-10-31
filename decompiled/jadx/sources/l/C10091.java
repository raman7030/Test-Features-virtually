package l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10091 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f30381;

    public C10091(ActivityC16315 activityC16315) {
        this.f30381 = activityC16315;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        String strM18061;
        ViewOnClickListenerC10672 viewOnClickListenerC10672 = (ViewOnClickListenerC10672) abstractC3255;
        ActivityC16315 activityC16315 = this.f30381;
        C22372 c22372 = (C22372) activityC16315.f50241.get(i);
        Drawable drawableM5422 = c22372.m5422();
        CharSequence charSequenceM50238 = c22372.m50238();
        if (c22372.mo5419()) {
            SpannableString spannableString = new SpannableString(charSequenceM50238);
            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 17);
            charSequenceM50238 = spannableString;
        }
        viewOnClickListenerC10672.f32093.setText(charSequenceM50238);
        if (activityC16315.f50246 == i) {
            viewOnClickListenerC10672.f32093.setTextColor(C21943.f70257);
            viewOnClickListenerC10672.f32098.setBackgroundColor(C21943.f70257 & 553648127);
            drawableM5422.setColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
        } else {
            viewOnClickListenerC10672.f32093.setTextColor(C21943.f70275);
            viewOnClickListenerC10672.f32098.setBackgroundColor(0);
            drawableM5422.setColorFilter(C21943.f70284, PorterDuff.Mode.SRC_IN);
        }
        viewOnClickListenerC10672.f32097.setImageDrawable(drawableM5422);
        try {
            strM18061 = C6554.m18061(150, c22372.m5420().f15019.mo23554());
        } catch (Exception unused) {
            strM18061 = null;
        }
        if (strM18061 == null) {
            viewOnClickListenerC10672.f32093.setTextSize(17.0f);
            viewOnClickListenerC10672.f32094.setVisibility(8);
        } else {
            viewOnClickListenerC10672.f32093.setTextSize(15.0f);
            viewOnClickListenerC10672.f32094.setVisibility(0);
            viewOnClickListenerC10672.f32094.setText(strM18061);
        }
        if (c22372.m5413()) {
            viewOnClickListenerC10672.itemView.setBackgroundColor(C21943.f70303);
        } else {
            viewOnClickListenerC10672.itemView.setBackgroundColor(0);
        }
        activityC16315.f50244.m38949(viewOnClickListenerC10672.f32099, true);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC16315 activityC16315 = this.f30381;
        return new ViewOnClickListenerC10672(activityC16315, LayoutInflater.from(activityC16315).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f30381.f50241.size();
    }
}
