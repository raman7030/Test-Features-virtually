package l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7AP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4667 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13724(View view, C22306 c22306, C22306 c22307) {
        View viewFindViewById = view.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        boolean zM50052 = c22306.m50052();
        boolean zM50053 = c22307.m50052();
        if (!zM50052 && !zM50053) {
            viewFindViewById.setVisibility(8);
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(0);
        m13725(textView, R.string.MT_Protector, c22306);
        m13725(textView2, R.string.MT_Protector, c22307);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13725(TextView textView, int i, C22306 c22306) {
        boolean z;
        if (c22306.m50052()) {
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(textView.getContext().getString(i)).append((CharSequence) ": ");
            if (c22306.m50053()) {
                spannableStringBuilderAppend.append((CharSequence) C17283.m40572(c22306.m50051()));
                z = true;
            } else {
                z = false;
            }
            if (c22306.m50054()) {
                if (z) {
                    int length = spannableStringBuilderAppend.length();
                    spannableStringBuilderAppend.append((CharSequence) "·");
                    spannableStringBuilderAppend.setSpan(new C20190(), length, spannableStringBuilderAppend.length(), 33);
                }
                spannableStringBuilderAppend.append((CharSequence) C22927.m51028(c22306.m50050()));
            }
            textView.setText(spannableStringBuilderAppend);
            textView.setVisibility(0);
            return;
        }
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
    }
}
