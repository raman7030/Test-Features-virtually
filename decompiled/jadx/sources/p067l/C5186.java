package p067l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5186 implements InterfaceC14573 {

    /* JADX INFO: renamed from: ֫ */
    public C6527 f12210;

    /* JADX INFO: renamed from: ۧ */
    public final C12680 f12211;

    /* JADX INFO: renamed from: ܽ */
    public final C13823 f12212;

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo11122() {
        return false;
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo11123() {
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ֫ */
    public final Bitmap mo11120(long j, int i, int i2, InterfaceC21280 interfaceC21280) {
        interfaceC21280.mo23161();
        C12680 c12680 = this.f12211;
        int iM29157 = c12680.m29157(j);
        try {
            return C13903.m31630(m11119(iM29157).f16872, c12680.m29161(iM29157), i, i2);
        } catch (Throwable unused) {
            C6527 c6527 = this.f12210;
            this.f12210 = null;
            if (c6527 != null) {
                C6527.m14964(c6527);
            }
            return null;
        }
    }

    public C5186(C13823 c13823, C12680 c12680) {
        this.f12212 = c13823;
        this.f12211 = c12680;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5186 m11118(C13823 c13823) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            InterfaceC9501 interfaceC9501M31495 = c13823.m31495();
            if (interfaceC9501M31495 != null) {
                try {
                    C12680 c12680M3935 = C2620.m3935(interfaceC9501M31495);
                    if (c12680M3935 != null && c12680M3935.m29156() != 0) {
                        C5186 c5186 = new C5186(c13823, c12680M3935);
                        interfaceC9501M31495.close();
                        return c5186;
                    }
                    interfaceC9501M31495.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        interfaceC9501M31495.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (interfaceC9501M31495 != null) {
                interfaceC9501M31495.close();
            }
        }
        return null;
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ᩳ */
    public final C15243 mo11124() {
        try {
            C6527 c6527 = this.f12210;
            if (c6527 == null) {
                return null;
            }
            return C13903.m31631(c6527.f16872);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C6527 m11119(int i) throws IOException {
        C12680 c12680 = this.f12211;
        C6527 c6527 = this.f12210;
        if (c6527 != null && c6527.f16870 == i) {
            return c6527;
        }
        C6527 c6528 = this.f12210;
        C18655 c18655 = null;
        this.f12210 = null;
        if (c6528 != null) {
            C6527.m14964(c6528);
        }
        InterfaceC9501 interfaceC9501M31495 = this.f12212.m31495();
        if (interfaceC9501M31495 == null) {
            throw new IOException("Missing fragmented MP4 preview metadata handle");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            C18655 c18656 = new C18655(interfaceC9501M31495, c12680.m29160(), c12680.m29158(i), c12680.m29159(i));
            try {
                mediaMetadataRetriever.setDataSource(c18656);
                C6527 c6529 = new C6527(i, mediaMetadataRetriever, c18656);
                this.f12210 = c6529;
                return c6529;
            } catch (Throwable th) {
                th = th;
                c18655 = c18656;
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                C2700.m4192(c18655);
                if (c18655 == null) {
                    C2700.m4192(interfaceC9501M31495);
                }
                if (th instanceof IOException) {
                    throw th;
                }
                throw new IOException("Failed to open fragmented MP4 preview chunk", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ֫ */
    public final void mo11121() {
        C6527 c6527 = this.f12210;
        this.f12210 = null;
        if (c6527 != null) {
            C6527.m14964(c6527);
        }
    }
}
