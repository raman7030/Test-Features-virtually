package l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes5.dex */
public final class SurfaceHolderCallbackC20641 implements InterfaceC16476, InterfaceC5345, InterfaceC9046, InterfaceC10140, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC22121, InterfaceC1402, InterfaceC17567 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15700 f66409;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public SurfaceHolderCallbackC20641(C15700 c15700) {
        this.f66409 = c15700;
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ܽ */
    public final void mo38832(C3519 c3519) {
        this.f66409.f48415.mo44893(c3519);
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ֫ */
    public final void mo38826(String str, long j, long j2) {
        this.f66409.f48415.mo44877(str, j, j2);
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ۧ */
    public final void mo38831(C8353 c8353, C13396 c13396) {
        this.f66409.f48415.mo44890(c8353, c13396);
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ۧ */
    public final void mo38829(int i, long j) {
        this.f66409.f48415.mo44884(i, j);
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ֫ */
    public final void mo38828(final C6404 c6404) {
        C15700 c15700 = this.f66409;
        c15700.f48396 = c6404;
        c15700.f48425.m49659(25, new InterfaceC7961() { // from class: l.ܿۙ֫
            @Override // l.InterfaceC7961
            public final void invoke(Object obj) {
                ((InterfaceC0612) obj).mo2499(c6404);
            }
        });
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ֫ */
    public final void mo38824(long j, Object obj) {
        C15700 c15700 = this.f66409;
        c15700.f48415.mo44874(j, obj);
        if (c15700.f48440 == obj) {
            c15700.f48425.m49659(26, new C19033(2));
        }
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ֫ */
    public final void mo38825(String str) {
        this.f66409.f48415.mo44876(str);
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ֫ */
    public final void mo38827(C3519 c3519) {
        this.f66409.f48415.mo44881(c3519);
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ֫ */
    public final void mo38823(int i, long j) {
        this.f66409.f48415.mo44871(i, j);
    }

    @Override // l.InterfaceC16476
    /* JADX INFO: renamed from: ۧ */
    public final void mo38830(Exception exc) {
        this.f66409.f48415.mo44885(exc);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ۧ */
    public final void mo15300(C3519 c3519) {
        this.f66409.f48415.mo44889(c3519);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ۧ */
    public final void mo15298(String str, long j, long j2) {
        this.f66409.f48415.mo44887(str, j, j2);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ֫ */
    public final void mo15295(C8353 c8353, C13396 c13396) {
        this.f66409.f48415.mo44882(c8353, c13396);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ֫ */
    public final void mo15291(long j) {
        this.f66409.f48415.mo44872(j);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ֫ */
    public final void mo15292(long j, int i, long j2) {
        this.f66409.f48415.mo44873(j, i, j2);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ۧ */
    public final void mo15297(String str) {
        this.f66409.f48415.mo44886(str);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15302(C3519 c3519) {
        this.f66409.f48415.mo44894(c3519);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ֫ */
    public final void mo15296(final boolean z) {
        C15700 c15700 = this.f66409;
        if (c15700.f48398 == z) {
            return;
        }
        c15700.f48398 = z;
        c15700.f48425.m49659(23, new InterfaceC7961() { // from class: l.ۜۙ֫
            @Override // l.InterfaceC7961
            public final void invoke(Object obj) {
                ((InterfaceC0612) obj).mo2508(z);
            }
        });
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ֫ */
    public final void mo15293(Exception exc) {
        this.f66409.f48415.mo44875(exc);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ܽ */
    public final void mo15301(Exception exc) {
        this.f66409.f48415.mo44892(exc);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ֫ */
    public final void mo15294(C1111 c1111) {
        this.f66409.f48415.mo44879(c1111);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ۧ */
    public final void mo15299(C1111 c1111) {
        this.f66409.f48415.mo44888(c1111);
    }

    @Override // l.InterfaceC5345
    /* JADX INFO: renamed from: ֫ */
    public final void mo15290(final int i) {
        this.f66409.f48404.m26986(new InterfaceC16724() { // from class: l.ܳۙ֫
            @Override // l.InterfaceC16724
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        }, new InterfaceC16724() { // from class: l.᩻ۙ֫
            @Override // l.InterfaceC16724
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        });
    }

    @Override // l.InterfaceC9046
    /* JADX INFO: renamed from: ֫ */
    public final void mo23343(List list) {
        this.f66409.f48425.m49659(27, new C12677(1, list));
    }

    @Override // l.InterfaceC9046
    /* JADX INFO: renamed from: ֫ */
    public final void mo23344(C4288 c4288) {
        C15700 c15700 = this.f66409;
        c15700.f48397 = c4288;
        c15700.f48425.m49659(27, new C21415(c4288));
    }

    @Override // l.InterfaceC10140
    /* JADX INFO: renamed from: ֫ */
    public final void mo25483(C23896 c23896) {
        C15700 c15700 = this.f66409;
        C18252 c18252M41027 = c15700.f48438.m41027();
        for (int i = 0; i < c23896.m52639(); i++) {
            c23896.m52640(i).mo1026(c18252M41027);
        }
        c15700.f48438 = c18252M41027.m42567();
        C17546 c17546M37025 = c15700.m37025();
        if (!c17546M37025.equals(c15700.f48399)) {
            c15700.f48399 = c17546M37025;
            c15700.f48425.m49655(14, new InterfaceC7961() { // from class: l.ᩳۙ֫
                @Override // l.InterfaceC7961
                public final void invoke(Object obj) {
                    ((InterfaceC0612) obj).mo2504(this.f54461.f66409.f48399);
                }
            });
        }
        c15700.f48425.m49655(28, new C5544(c23896));
        c15700.f48425.m49654();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C15700 c15700 = this.f66409;
        if (c15700.f48402) {
            c15700.m36998(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f66409.m36994(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C15700 c15700 = this.f66409;
        if (c15700.f48402) {
            c15700.m36998((Object) null);
        }
        c15700.m36994(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C15700 c15700 = this.f66409;
        C15700.m37004(c15700, surfaceTexture);
        c15700.m36994(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f66409.m36994(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C15700 c15700 = this.f66409;
        c15700.m36998((Object) null);
        c15700.m36994(0, 0);
        return true;
    }

    @Override // l.InterfaceC22121
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo47226(Surface surface) {
        this.f66409.m36998(surface);
    }

    @Override // l.InterfaceC22121
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo47227() {
        this.f66409.m36998((Object) null);
    }

    @Override // l.InterfaceC17567
    /* JADX INFO: renamed from: ֫ */
    public final void mo41055() {
        this.f66409.m37031();
    }
}
