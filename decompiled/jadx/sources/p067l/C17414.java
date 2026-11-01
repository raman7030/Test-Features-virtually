package p067l;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܺۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17414 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC9368 f52062;

    public C17414(ActivityC9368 activityC9368) {
        this.f52062 = activityC9368;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C18280 c18280;
        ViewOnClickListenerC15402 viewOnClickListenerC15402 = (ViewOnClickListenerC15402) abstractC5462;
        ActivityC9368 activityC9368 = this.f52062;
        if (i >= activityC9368.f25538.size()) {
            c18280 = (C18280) activityC9368.f25530.get(i - activityC9368.f25538.size());
        } else {
            c18280 = (C18280) activityC9368.f25538.get(i);
        }
        viewOnClickListenerC15402.f44000 = c18280;
        TextView textView = viewOnClickListenerC15402.f44001;
        ImageView imageView = viewOnClickListenerC15402.f44006;
        Bitmap bitmap = c18280.f54577;
        if (bitmap == null) {
            imageView.setImageResource(R.drawable.MT_Protector);
        } else {
            imageView.setImageBitmap(bitmap);
        }
        SpannableString spannableString = new SpannableString(c18280.f54578 + EnumC2483.f3919 + c18280.f54580);
        int length = c18280.f54578.length() + 2;
        int length2 = spannableString.length();
        spannableString.setSpan(new ForegroundColorSpan(C23223.f72980), length, length2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.8f), length, length2, 17);
        viewOnClickListenerC15402.f44005.setText(spannableString);
        viewOnClickListenerC15402.f44004.setText(c18280.f54576);
        viewOnClickListenerC15402.f44002.setText(C18833.m42897(c18280.f54572));
        ActivityC9368.m21772(activityC9368, c18280, textView);
        textView.setTag(c18280.f54573);
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC15402(this.f52062, viewGroup);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        ActivityC9368 activityC9368 = this.f52062;
        return activityC9368.f25530.size() + activityC9368.f25538.size();
    }
}
