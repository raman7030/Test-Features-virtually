package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2965 implements InterfaceC12842 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4376 f9411;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10850 f9412;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12053 f9413;

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo9070() {
        return false;
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo9071() {
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap mo9068(long j, int i, int i2, InterfaceC19899 interfaceC19899) {
        interfaceC19899.mo21195();
        C10850 c10850 = this.f9412;
        int iM27112 = c10850.m27112(j);
        try {
            return C12137.m29565(m9067(iM27112).f14057, c10850.m27116(iM27112), i, i2);
        } catch (Throwable unused) {
            C4376 c4376 = this.f9411;
            this.f9411 = null;
            if (c4376 != null) {
                C4376.m13100(c4376);
            }
            return null;
        }
    }

    public C2965(C12053 c12053, C10850 c10850) {
        this.f9413 = c12053;
        this.f9412 = c10850;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2965 m9066(C12053 c12053) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            InterfaceC7505 interfaceC7505M29433 = c12053.m29433();
            if (interfaceC7505M29433 != null) {
                try {
                    C10850 c10850M1537 = C0265.m1537(interfaceC7505M29433);
                    if (c10850M1537 != null && c10850M1537.m27111() != 0) {
                        C2965 c2965 = new C2965(c12053, c10850M1537);
                        interfaceC7505M29433.close();
                        return c2965;
                    }
                    interfaceC7505M29433.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        interfaceC7505M29433.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (interfaceC7505M29433 != null) {
                interfaceC7505M29433.close();
            }
        }
        return null;
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13547 mo9072() {
        try {
            C4376 c4376 = this.f9411;
            if (c4376 == null) {
                return null;
            }
            return C12137.m29566(c4376.f14057);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4376 m9067(int i) throws IOException {
        C10850 c10850 = this.f9412;
        C4376 c4376 = this.f9411;
        if (c4376 != null && c4376.f14055 == i) {
            return c4376;
        }
        C4376 c4377 = this.f9411;
        C17137 c17137 = null;
        this.f9411 = null;
        if (c4377 != null) {
            C4376.m13100(c4377);
        }
        InterfaceC7505 interfaceC7505M29433 = this.f9413.m29433();
        if (interfaceC7505M29433 == null) {
            throw new IOException("Missing fragmented MP4 preview metadata handle");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            C17137 c17138 = new C17137(interfaceC7505M29433, c10850.m27115(), c10850.m27113(i), c10850.m27114(i));
            try {
                mediaMetadataRetriever.setDataSource(c17138);
                C4376 c4378 = new C4376(i, mediaMetadataRetriever, c17138);
                this.f9411 = c4378;
                return c4378;
            } catch (Throwable th) {
                th = th;
                c17137 = c17138;
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                C0349.m1793(c17137);
                if (c17137 == null) {
                    C0349.m1793(interfaceC7505M29433);
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

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9069() {
        C4376 c4376 = this.f9411;
        this.f9411 = null;
        if (c4376 != null) {
            C4376.m13100(c4376);
        }
    }
}
