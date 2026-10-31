package l;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15831 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f48924;

    public C15831(ActivityC7365 activityC7365) {
        this.f48924 = activityC7365;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C16742 c16742;
        ViewOnClickListenerC13714 viewOnClickListenerC13714 = (ViewOnClickListenerC13714) abstractC3255;
        ActivityC7365 activityC7365 = this.f48924;
        if (i >= activityC7365.f22625.size()) {
            c16742 = (C16742) activityC7365.f22617.get(i - activityC7365.f22625.size());
        } else {
            c16742 = (C16742) activityC7365.f22625.get(i);
        }
        viewOnClickListenerC13714.f40919 = c16742;
        TextView textView = viewOnClickListenerC13714.f40920;
        ImageView imageView = viewOnClickListenerC13714.f40925;
        Bitmap bitmap = c16742.f51394;
        if (bitmap == null) {
            imageView.setImageResource(R.drawable.MT_Protector);
        } else {
            imageView.setImageBitmap(bitmap);
        }
        SpannableString spannableString = new SpannableString(c16742.f51395 + EnumC0121.f1143 + c16742.f51397);
        int length = c16742.f51395.length() + 2;
        int length2 = spannableString.length();
        spannableString.setSpan(new ForegroundColorSpan(C21943.f70269), length, length2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.8f), length, length2, 17);
        viewOnClickListenerC13714.f40924.setText(spannableString);
        viewOnClickListenerC13714.f40923.setText(c16742.f51393);
        viewOnClickListenerC13714.f40921.setText(C17324.m40646(c16742.f51389));
        ActivityC7365.m19799(activityC7365, c16742, textView);
        textView.setTag(c16742.f51390);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC13714(this.f48924, viewGroup);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ActivityC7365 activityC7365 = this.f48924;
        return activityC7365.f22617.size() + activityC7365.f22625.size();
    }
}
