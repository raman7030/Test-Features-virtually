package l;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܶ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38NX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15561 extends GLSurfaceView implements InterfaceC21913 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f47968 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8507 f47969;

    public C15561(Context context) {
        this(context, null);
    }

    public C15561(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8507 c8507 = new C8507(this);
        this.f47969 = c8507;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c8507);
        setRenderMode(0);
    }

    @Override // l.InterfaceC21913
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo36707(C13375 c13375) {
        this.f47969.m22200(c13375);
    }
}
