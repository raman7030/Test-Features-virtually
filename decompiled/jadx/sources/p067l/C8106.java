package p067l;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: l.ۛۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01O7 */
/* JADX INFO: loaded from: classes3.dex */
public class C8106 extends C14141 {

    /* JADX INFO: renamed from: ᩷ */
    public static boolean f21373 = true;

    @Override // p067l.C21518
    /* JADX INFO: renamed from: ֫ */
    public void mo18801(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo18801(view, i);
        } else if (f21373) {
            try {
                C12130.m28046(view, i);
            } catch (NoSuchMethodError unused) {
                f21373 = false;
            }
        }
    }
}
