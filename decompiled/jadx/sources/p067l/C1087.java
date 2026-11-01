package p067l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.ۙ᩺ */
/* JADX INFO: compiled from: 63SN */
/* JADX INFO: loaded from: classes2.dex */
public final class C1087 {
    /* JADX INFO: renamed from: ֫ */
    public static void m16291(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C1857.m49187(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | Params.POLY_BYTES);
    }
}
