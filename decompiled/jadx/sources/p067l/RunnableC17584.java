package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.open.TDialog;

/* JADX INFO: renamed from: l.ܺܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17584 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ TDialog f52551;

    public RunnableC17584(TDialog tDialog) {
        this.f52551 = tDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View decorView;
        View childAt;
        Window window = this.f52551.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null || (childAt = ((ViewGroup) decorView).getChildAt(0)) == null) {
            return;
        }
        childAt.setPadding(0, 0, 0, 0);
    }
}
