package l;

import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15935 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37713(TextView textView, long j) {
        if (j == -1) {
            textView.setText("");
            textView.setOnClickListener(null);
            textView.setOnLongClickListener(null);
            return;
        }
        textView.setTag(R.id.MT_Protector, Long.valueOf(j));
        String strM51020 = C22927.m51020(j);
        if (j == 0) {
            textView.setText(strM51020);
        } else {
            textView.setText(strM51020 + " (" + String.valueOf(j) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        C19890.m45741(textView);
        textView.setOnClickListener(new ViewOnClickListenerC9587());
        textView.setOnLongClickListener(new ViewOnLongClickListenerC8881());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37714(TextView textView, long j) {
        if (j == -1) {
            textView.setText("");
            return;
        }
        textView.setText(C22927.m51020(j) + " (" + String.valueOf(j) + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(R.id.MT_Protector, Long.valueOf(j));
    }
}
