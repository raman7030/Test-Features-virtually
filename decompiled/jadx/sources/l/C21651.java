package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21651 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22356 f69485;

    public C21651(C22356 c22356) {
        this.f69485 = c22356;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C22356 c22356 = this.f69485;
        outline.setRoundRect(0, 0, c22356.getWidth(), c22356.getHeight(), c22356.f72428);
    }
}
