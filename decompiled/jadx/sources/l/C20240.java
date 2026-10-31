package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes4.dex */
public final class C20240 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13183 f65448;

    public C20240(C13183 c13183) {
        this.f65448 = c13183;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C13183 c13183 = this.f65448;
        int width = c13183.getWidth();
        int height = c13183.getHeight();
        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * c13183.f39410) / 2.0f);
    }
}
