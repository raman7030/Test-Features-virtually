package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4717 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13183 f14960;

    public C4717(C13183 c13183) {
        this.f14960 = c13183;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C13183 c13183 = this.f14960;
        outline.setRoundRect(0, 0, c13183.getWidth(), c13183.getHeight(), c13183.f39411);
    }
}
