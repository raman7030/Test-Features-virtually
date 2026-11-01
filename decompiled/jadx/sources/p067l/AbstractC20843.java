package p067l;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20843 {
    /* JADX INFO: renamed from: ۧ */
    public static void m47075(TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.MT_Protector);
        int iHashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            textView.setTag(R.id.MT_Protector, Integer.valueOf(iHashCode));
            C2736[] c2736ArrM47074 = m47074(textView);
            if (c2736ArrM47074 == null || c2736ArrM47074.length <= 0) {
                return;
            }
            if (textView.getTag(R.id.MT_Protector) == null) {
                ViewOnAttachStateChangeListenerC17488 viewOnAttachStateChangeListenerC17488 = new ViewOnAttachStateChangeListenerC17488(textView);
                textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC17488);
                textView.setTag(R.id.MT_Protector, viewOnAttachStateChangeListenerC17488);
            }
            RunnableC20172 runnableC20172 = new RunnableC20172(textView);
            for (C2736 c2736 : c2736ArrM47074) {
                C18830 c18830M4273 = c2736.m4273();
                c18830M4273.m42892(new C6090(textView, runnableC20172, c18830M4273.getBounds()));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m47076(TextView textView) {
        if (textView.getTag(R.id.MT_Protector) == null) {
            return;
        }
        textView.setTag(R.id.MT_Protector, null);
        C2736[] c2736ArrM47074 = m47074(textView);
        if (c2736ArrM47074 == null || c2736ArrM47074.length <= 0) {
            return;
        }
        for (C2736 c2736 : c2736ArrM47074) {
            c2736.m4273().m42892((Drawable.Callback) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2736[] m47074(TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (C2736[]) ((Spanned) text).getSpans(0, length, C2736.class);
    }
}
