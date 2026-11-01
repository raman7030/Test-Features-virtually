package p067l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes5.dex */
public final class SurfaceHolderCallbackC21985 implements InterfaceC18027, InterfaceC7448, InterfaceC10966, InterfaceC12005, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC23392, InterfaceC3701, InterfaceC19064 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17289 f69089;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public SurfaceHolderCallbackC21985(C17289 c17289) {
        this.f69089 = c17289;
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ܽ */
    public final void mo41058(C5713 c5713) {
        this.f69089.f51553.mo47190(c5713);
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ֫ */
    public final void mo41052(String str, long j, long j2) {
        this.f69089.f51553.mo47174(str, j, j2);
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ۧ */
    public final void mo41057(C10307 c10307, C15100 c15100) {
        this.f69089.f51553.mo47187(c10307, c15100);
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ۧ */
    public final void mo41055(int i, long j) {
        this.f69089.f51553.mo47181(i, j);
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ֫ */
    public final void mo41054(final C8454 c8454) {
        C17289 c17289 = this.f69089;
        c17289.f51534 = c8454;
        c17289.f51563.m51997(25, new InterfaceC9934() { // from class: l.ܿۙ֫
            @Override // p067l.InterfaceC9934
            public final void invoke(Object obj) {
                ((InterfaceC2950) obj).mo4855(c8454);
            }
        });
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ֫ */
    public final void mo41050(long j, Object obj) {
        C17289 c17289 = this.f69089;
        c17289.f51553.mo47171(j, obj);
        if (c17289.f51578 == obj) {
            c17289.f51563.m51997(26, new C20458(2));
        }
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ֫ */
    public final void mo41051(String str) {
        this.f69089.f51553.mo47173(str);
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ֫ */
    public final void mo41053(C5713 c5713) {
        this.f69089.f51553.mo47178(c5713);
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ֫ */
    public final void mo41049(int i, long j) {
        this.f69089.f51553.mo47168(i, j);
    }

    @Override // p067l.InterfaceC18027
    /* JADX INFO: renamed from: ۧ */
    public final void mo41056(Exception exc) {
        this.f69089.f51553.mo47182(exc);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ۧ */
    public final void mo17208(C5713 c5713) {
        this.f69089.f51553.mo47186(c5713);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ۧ */
    public final void mo17206(String str, long j, long j2) {
        this.f69089.f51553.mo47184(str, j, j2);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ֫ */
    public final void mo17203(C10307 c10307, C15100 c15100) {
        this.f69089.f51553.mo47179(c10307, c15100);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ֫ */
    public final void mo17199(long j) {
        this.f69089.f51553.mo47169(j);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ֫ */
    public final void mo17200(long j, int i, long j2) {
        this.f69089.f51553.mo47170(j, i, j2);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ۧ */
    public final void mo17205(String str) {
        this.f69089.f51553.mo47183(str);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17210(C5713 c5713) {
        this.f69089.f51553.mo47191(c5713);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ֫ */
    public final void mo17204(final boolean z) {
        C17289 c17289 = this.f69089;
        if (c17289.f51536 == z) {
            return;
        }
        c17289.f51536 = z;
        c17289.f51563.m51997(23, new InterfaceC9934() { // from class: l.ۜۙ֫
            @Override // p067l.InterfaceC9934
            public final void invoke(Object obj) {
                ((InterfaceC2950) obj).mo4864(z);
            }
        });
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ֫ */
    public final void mo17201(Exception exc) {
        this.f69089.f51553.mo47172(exc);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ܽ */
    public final void mo17209(Exception exc) {
        this.f69089.f51553.mo47189(exc);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ֫ */
    public final void mo17202(C3424 c3424) {
        this.f69089.f51553.mo47176(c3424);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ۧ */
    public final void mo17207(C3424 c3424) {
        this.f69089.f51553.mo47185(c3424);
    }

    @Override // p067l.InterfaceC7448
    /* JADX INFO: renamed from: ֫ */
    public final void mo17198(final int i) {
        this.f69089.f51542.m29031(new InterfaceC18263() { // from class: l.ܳۙ֫
            @Override // p067l.InterfaceC18263
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        }, new InterfaceC18263() { // from class: l.᩻ۙ֫
            @Override // p067l.InterfaceC18263
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        });
    }

    @Override // p067l.InterfaceC10966
    /* JADX INFO: renamed from: ֫ */
    public final void mo25288(List list) {
        this.f69089.f51563.m51997(27, new C14417(1, list));
    }

    @Override // p067l.InterfaceC10966
    /* JADX INFO: renamed from: ֫ */
    public final void mo25289(C6443 c6443) {
        C17289 c17289 = this.f69089;
        c17289.f51535 = c6443;
        c17289.f51563.m51997(27, new C22721(c6443));
    }

    @Override // p067l.InterfaceC12005
    /* JADX INFO: renamed from: ֫ */
    public final void mo27502(C25079 c25079) {
        C17289 c17289 = this.f69089;
        C19715 c19715M43272 = c17289.f51576.m43272();
        for (int i = 0; i < c25079.m55048(); i++) {
            c25079.m55049(i).mo3422(c19715M43272);
        }
        c17289.f51576 = c19715M43272.m44826();
        C19044 c19044M39192 = c17289.m39192();
        if (!c19044M39192.equals(c17289.f51537)) {
            c17289.f51537 = c19044M39192;
            c17289.f51563.m51993(14, new InterfaceC9934() { // from class: l.ᩳۙ֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj) {
                    ((InterfaceC2950) obj).mo4860(this.f57657.f69089.f51537);
                }
            });
        }
        c17289.f51563.m51993(28, new C7638(c25079));
        c17289.f51563.m51992();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C17289 c17289 = this.f69089;
        if (c17289.f51540) {
            c17289.m39165(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f69089.m39161(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C17289 c17289 = this.f69089;
        if (c17289.f51540) {
            c17289.m39165((Object) null);
        }
        c17289.m39161(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C17289 c17289 = this.f69089;
        C17289.m39171(c17289, surfaceTexture);
        c17289.m39161(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f69089.m39161(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C17289 c17289 = this.f69089;
        c17289.m39165((Object) null);
        c17289.m39161(0, 0);
        return true;
    }

    @Override // p067l.InterfaceC23392
    /* JADX INFO: renamed from: ֫ */
    public final void mo49553(Surface surface) {
        this.f69089.m39165(surface);
    }

    @Override // p067l.InterfaceC23392
    /* JADX INFO: renamed from: ۧ */
    public final void mo49554() {
        this.f69089.m39165((Object) null);
    }

    @Override // p067l.InterfaceC19064
    /* JADX INFO: renamed from: ֫ */
    public final void mo43301() {
        this.f69089.m39198();
    }
}
