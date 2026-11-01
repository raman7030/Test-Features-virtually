package p067l;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: l.ᩴᩴ */
/* JADX INFO: compiled from: R54E */
/* JADX INFO: loaded from: classes4.dex */
public final class C1781 {
    /* JADX INFO: renamed from: ֫ */
    public static void m45965(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1046.m14253(view, charSequence);
        } else {
            ViewOnLongClickListenerC1116.m17584(view, charSequence);
        }
    }
}
