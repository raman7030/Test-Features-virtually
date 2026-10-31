package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15299 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22356 f46938;

    public C15299(C22356 c22356) {
        this.f46938 = c22356;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C22356 c22356 = this.f46938;
        int width = c22356.getWidth();
        int height = c22356.getHeight();
        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * c22356.f72427) / 2.0f);
    }
}
