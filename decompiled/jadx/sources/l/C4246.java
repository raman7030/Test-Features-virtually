package l;

import android.net.Uri;
import android.os.SystemClock;
import com.alipay.sdk.m.c0.c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4246 implements InterfaceC18113 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f13760;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f13761;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public IOException f13762;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8941 f13763 = new C8941("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C4951 f13764;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f13765;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f13766;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19063 f13767;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f13768;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f13769;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f13770;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Uri f13771;

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17407 mo12777(InterfaceC23757 interfaceC23757, long j, long j2, IOException iOException, int i) {
        C17407 c17407M23058;
        C2591 c2591 = (C2591) interfaceC23757;
        long j3 = c2591.f8199;
        int i2 = c2591.f8198;
        c2591.m8207();
        Map mapM8210 = c2591.m8210();
        c2591.m8208();
        C10957 c10957 = new C10957(j2, mapM8210);
        boolean z = c2591.m8207().getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof C6362;
        C17407 c17407 = C8941.f27182;
        C19063 c19063 = this.f13767;
        if (z || z2) {
            int i3 = iOException instanceof C23770 ? ((C23770) iOException).f76941 : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.f13770 = SystemClock.elapsedRealtime();
                m12781(false);
                C8134 c8134 = c19063.f60046;
                String str = C3603.f11424;
                c8134.m21593(c10957, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return c17407;
            }
        }
        C1885 c1885 = new C1885(iOException, i);
        if (C19063.m43919(c19063, this.f13771, c1885, false)) {
            long jMo27441 = c19063.f60041.mo27441(c1885);
            if (jMo27441 != -9223372036854775807L) {
                c17407M23058 = C8941.m23058(jMo27441, false);
            } else {
                c17407M23058 = C8941.f27181;
            }
            c17407 = c17407M23058;
        }
        boolean zM40761 = c17407.m40761();
        c19063.f60046.m21593(c10957, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !zM40761);
        if (!zM40761) {
            c19063.f60041.getClass();
        }
        return c17407;
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12778(InterfaceC23757 interfaceC23757, long j, long j2) {
        C2591 c2591 = (C2591) interfaceC23757;
        AbstractC10596 abstractC10596 = (AbstractC10596) c2591.m8209();
        c2591.m8207();
        Map mapM8210 = c2591.m8210();
        c2591.m8208();
        C10957 c10957 = new C10957(j2, mapM8210);
        boolean z = abstractC10596 instanceof C4951;
        C19063 c19063 = this.f13767;
        if (z) {
            m12769((C4951) abstractC10596, c10957);
            c19063.f60046.m21596(c10957, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            this.f13762 = C9080.m23438("Loaded playlist has unexpected type.");
            c19063.f60046.m21593(c10957, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, this.f13762, true);
        }
        c19063.f60041.getClass();
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12779(InterfaceC23757 interfaceC23757, long j, long j2, int i) {
        C10957 c10957;
        C2591 c2591 = (C2591) interfaceC23757;
        if (i == 0) {
            long j3 = c2591.f8199;
            c10957 = new C10957(c2591.f8197);
        } else {
            long j4 = c2591.f8199;
            c2591.m8207();
            Map mapM8210 = c2591.m8210();
            c2591.m8208();
            c10957 = new C10957(j2, mapM8210);
        }
        this.f13767.f60046.m21592(c10957, c2591.f8198, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12780(InterfaceC23757 interfaceC23757, long j, long j2, boolean z) {
        C2591 c2591 = (C2591) interfaceC23757;
        long j3 = c2591.f8199;
        c2591.m8207();
        Map mapM8210 = c2591.m8210();
        c2591.m8208();
        C10957 c10957 = new C10957(j2, mapM8210);
        C19063 c19063 = this.f13767;
        c19063.f60041.getClass();
        c19063.f60046.m21591(c10957, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public C4246(C19063 c19063, Uri uri) {
        this.f13767 = c19063;
        this.f13771 = uri;
        this.f13765 = c19063.f60045.mo6042(4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4951 m12776() {
        return this.f13764;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m12784() {
        int i;
        if (this.f13764 == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, C3603.m11037(this.f13764.f15605));
        C4951 c4951 = this.f13764;
        return c4951.f15612 || (i = c4951.f15595) == 2 || i == 1 || this.f13760 + jMax > jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12781(boolean z) {
        m12772(z ? m12774() : this.f13771);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m12786() throws IOException {
        this.f13763.m23063(Integer.MIN_VALUE);
        IOException iOException = this.f13762;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m12783() {
        return this.f13769;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12782(boolean z) {
        this.f13769 = z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m12785() {
        this.f13763.m23064((InterfaceC6824) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m12772(final Uri uri) {
        this.f13768 = 0L;
        if (this.f13766) {
            return;
        }
        C8941 c8941 = this.f13763;
        if (c8941.m23068() || c8941.m23067()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < this.f13770) {
            this.f13766 = true;
            this.f13767.f60047.postDelayed(new Runnable() { // from class: l.ۖ᩺֫
                @Override // java.lang.Runnable
                public final void run() {
                    C4246.m12767(this.f9068, uri);
                }
            }, this.f13770 - jElapsedRealtime);
        } else {
            m12766(uri);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12767(C4246 c4246, Uri uri) {
        c4246.f13766 = false;
        c4246.m12766(uri);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12766(Uri uri) {
        C19063 c19063 = this.f13767;
        InterfaceC15995 interfaceC15995Mo23619 = c19063.f60040.mo23619(c19063.f60039, this.f13764);
        C4515 c4515 = new C4515();
        c4515.m13281(uri);
        c4515.m13279(1);
        C2591 c2591 = new C2591(this.f13765, c4515.m13278(), interfaceC15995Mo23619);
        this.f13763.m23065(c2591, this, c19063.f60041.mo27440(c2591.f8198));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m12769(C4951 c4951, C10957 c10957) {
        boolean z;
        C4951 c4952 = this.f13764;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f13760 = jElapsedRealtime;
        C19063 c19063 = this.f13767;
        C4951 c4951M43916 = C19063.m43916(c19063, c4952, c4951);
        this.f13764 = c4951M43916;
        IOException c16673 = null;
        Uri uri = this.f13771;
        if (c4951M43916 != c4952) {
            this.f13762 = null;
            this.f13761 = jElapsedRealtime;
            C19063.m43918(c19063, uri, c4951M43916);
        } else if (!c4951M43916.f15612) {
            long size = c4951.f15600 + ((long) c4951.f15593.size());
            C4951 c4953 = this.f13764;
            if (size < c4953.f15600) {
                c16673 = new C11030();
                z = true;
            } else {
                double d = jElapsedRealtime - this.f13761;
                double dM11037 = C3603.m11037(c4953.f15603) * 3.5d;
                z = false;
                if (d > dM11037) {
                    c16673 = new C16673();
                }
            }
            if (c16673 != null) {
                this.f13762 = c16673;
                C19063.m43919(c19063, uri, new C1885(c16673, 1), z);
            }
        }
        C4951 c4954 = this.f13764;
        C20474 c20474 = c4954.f15597;
        long j = c4954.f15603;
        if (c20474.f65991) {
            if (c4954 == c4952) {
                long j2 = c4954.f15604;
                if (j2 != -9223372036854775807L) {
                    j = j2 / 2;
                } else {
                    j /= 2;
                }
            } else {
                j = 0;
            }
        } else if (c4954 == c4952) {
            j /= 2;
        }
        this.f13770 = (C3603.m11037(j) + jElapsedRealtime) - c10957.f32991;
        if (this.f13764.f15612) {
            return;
        }
        if (uri.equals(c19063.f60038) || this.f13769) {
            m12772(m12774());
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private Uri m12774() {
        C4951 c4951 = this.f13764;
        Uri uri = this.f13771;
        if (c4951 != null) {
            C20474 c20474 = c4951.f15597;
            if (c20474.f65994 != -9223372036854775807L || c20474.f65991) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C4951 c4952 = this.f13764;
                if (c4952.f15597.f65991) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c4952.f15600 + ((long) c4952.f15593.size())));
                    C4951 c4953 = this.f13764;
                    if (c4953.f15604 != -9223372036854775807L) {
                        AbstractC14545 abstractC14545 = c4953.f15610;
                        int size = abstractC14545.size();
                        if (!abstractC14545.isEmpty() && ((C8479) C8882.m22955(abstractC14545)).f25916) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C20474 c20475 = this.f13764.f15597;
                if (c20475.f65994 != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c20475.f65992 ? c.d : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m12770(C4246 c4246, long j) {
        c4246.f13768 = SystemClock.elapsedRealtime() + j;
        Uri uri = c4246.f13771;
        C19063 c19063 = c4246.f13767;
        return uri.equals(c19063.f60038) && !C19063.m43921(c19063);
    }
}
