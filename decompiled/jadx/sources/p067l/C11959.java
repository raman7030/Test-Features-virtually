package p067l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11959 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC17874 f33341;

    public C11959(ActivityC17874 activityC17874) {
        this.f33341 = activityC17874;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        String strM20011;
        ViewOnClickListenerC12511 viewOnClickListenerC12511 = (ViewOnClickListenerC12511) abstractC5462;
        ActivityC17874 activityC17874 = this.f33341;
        C23631 c23631 = (C23631) activityC17874.f53408.get(i);
        Drawable drawableM7651 = c23631.m7651();
        CharSequence charSequenceM52578 = c23631.m52578();
        if (c23631.mo7648()) {
            SpannableString spannableString = new SpannableString(charSequenceM52578);
            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 17);
            charSequenceM52578 = spannableString;
        }
        viewOnClickListenerC12511.f35064.setText(charSequenceM52578);
        if (activityC17874.f53413 == i) {
            viewOnClickListenerC12511.f35064.setTextColor(C23223.f72969);
            viewOnClickListenerC12511.f35069.setBackgroundColor(C23223.f72969 & 553648127);
            drawableM7651.setColorFilter(C23223.f72969, PorterDuff.Mode.SRC_IN);
        } else {
            viewOnClickListenerC12511.f35064.setTextColor(C23223.f72986);
            viewOnClickListenerC12511.f35069.setBackgroundColor(0);
            drawableM7651.setColorFilter(C23223.f72995, PorterDuff.Mode.SRC_IN);
        }
        viewOnClickListenerC12511.f35068.setImageDrawable(drawableM7651);
        try {
            strM20011 = C8597.m20011(150, c23631.m7649().f17850.mo25505());
        } catch (Exception unused) {
            strM20011 = null;
        }
        if (strM20011 == null) {
            viewOnClickListenerC12511.f35064.setTextSize(17.0f);
            viewOnClickListenerC12511.f35065.setVisibility(8);
        } else {
            viewOnClickListenerC12511.f35064.setTextSize(15.0f);
            viewOnClickListenerC12511.f35065.setVisibility(0);
            viewOnClickListenerC12511.f35065.setText(strM20011);
        }
        if (c23631.m7642()) {
            viewOnClickListenerC12511.itemView.setBackgroundColor(C23223.f73014);
        } else {
            viewOnClickListenerC12511.itemView.setBackgroundColor(0);
        }
        activityC17874.f53411.m41175(viewOnClickListenerC12511.f35070, true);
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC17874 activityC17874 = this.f33341;
        return new ViewOnClickListenerC12511(activityC17874, LayoutInflater.from(activityC17874).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f33341.f53408.size();
    }
}
