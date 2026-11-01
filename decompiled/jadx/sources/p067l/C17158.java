package p067l;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܶ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38NX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17158 extends GLSurfaceView implements InterfaceC23195 {

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f51100 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final C10454 f51101;

    public C17158(Context context) {
        this(context, null);
    }

    public C17158(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C10454 c10454 = new C10454(this);
        this.f51101 = c10454;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c10454);
        setRenderMode(0);
    }

    @Override // p067l.InterfaceC23195
    /* JADX INFO: renamed from: ֫ */
    public final void mo38868(C15080 c15080) {
        this.f51101.m24168(c15080);
    }
}
