package l;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: l.ۛۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01O7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6037 extends C12387 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f18517 = true;

    @Override // l.C20149
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo16873(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo16873(view, i);
        } else if (f18517) {
            try {
                C10271.m26024(view, i);
            } catch (NoSuchMethodError unused) {
                f18517 = false;
            }
        }
    }
}
