package l;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19439 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44780(TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.MT_Protector);
        int iHashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            textView.setTag(R.id.MT_Protector, Integer.valueOf(iHashCode));
            C0387[] c0387ArrM44779 = m44779(textView);
            if (c0387ArrM44779 == null || c0387ArrM44779.length <= 0) {
                return;
            }
            if (textView.getTag(R.id.MT_Protector) == null) {
                ViewOnAttachStateChangeListenerC15909 viewOnAttachStateChangeListenerC15909 = new ViewOnAttachStateChangeListenerC15909(textView);
                textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC15909);
                textView.setTag(R.id.MT_Protector, viewOnAttachStateChangeListenerC15909);
            }
            RunnableC18733 runnableC18733 = new RunnableC18733(textView);
            for (C0387 c0387 : c0387ArrM44779) {
                C17321 c17321M1882 = c0387.m1882();
                c17321M1882.m40641(new C3916(textView, runnableC18733, c17321M1882.getBounds()));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m44781(TextView textView) {
        if (textView.getTag(R.id.MT_Protector) == null) {
            return;
        }
        textView.setTag(R.id.MT_Protector, null);
        C0387[] c0387ArrM44779 = m44779(textView);
        if (c0387ArrM44779 == null || c0387ArrM44779.length <= 0) {
            return;
        }
        for (C0387 c0387 : c0387ArrM44779) {
            c0387.m1882().m40641((Drawable.Callback) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0387[] m44779(TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (C0387[]) ((Spanned) text).getSpans(0, length, C0387.class);
    }
}
