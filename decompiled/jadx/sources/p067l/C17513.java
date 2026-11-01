package p067l;

import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17513 {
    /* JADX INFO: renamed from: ֫ */
    public static void m39888(TextView textView, long j) {
        if (j == -1) {
            textView.setText("");
            textView.setOnClickListener(null);
            textView.setOnLongClickListener(null);
            return;
        }
        textView.setTag(R.id.MT_Protector, Long.valueOf(j));
        String strM53411 = C24158.m53411(j);
        if (j == 0) {
            textView.setText(strM53411);
        } else {
            textView.setText(strM53411 + " (" + String.valueOf(j) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        C21272.m48052(textView);
        textView.setOnClickListener(new ViewOnClickListenerC11480());
        textView.setOnLongClickListener(new ViewOnLongClickListenerC10809());
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39889(TextView textView, long j) {
        if (j == -1) {
            textView.setText("");
            return;
        }
        textView.setText(C24158.m53411(j) + " (" + String.valueOf(j) + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(R.id.MT_Protector, Long.valueOf(j));
    }
}
