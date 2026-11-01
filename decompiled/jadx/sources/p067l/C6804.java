package p067l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۙ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7AP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6804 {
    /* JADX INFO: renamed from: ֫ */
    public static void m15599(View view, C23568 c23568, C23568 c23569) {
        View viewFindViewById = view.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        boolean zM52382 = c23568.m52382();
        boolean zM52383 = c23569.m52382();
        if (!zM52382 && !zM52383) {
            viewFindViewById.setVisibility(8);
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(0);
        m15600(textView, R.string.MT_Protector, c23568);
        m15600(textView2, R.string.MT_Protector, c23569);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15600(TextView textView, int i, C23568 c23568) {
        boolean z;
        if (c23568.m52382()) {
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(textView.getContext().getString(i)).append((CharSequence) ": ");
            if (c23568.m52383()) {
                spannableStringBuilderAppend.append((CharSequence) C18794.m42823(c23568.m52381()));
                z = true;
            } else {
                z = false;
            }
            if (c23568.m52384()) {
                if (z) {
                    int length = spannableStringBuilderAppend.length();
                    spannableStringBuilderAppend.append((CharSequence) "·");
                    spannableStringBuilderAppend.setSpan(new C21557(), length, spannableStringBuilderAppend.length(), 33);
                }
                spannableStringBuilderAppend.append((CharSequence) C24158.m53419(c23568.m52380()));
            }
            textView.setText(spannableStringBuilderAppend);
            textView.setVisibility(0);
            return;
        }
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
    }
}
