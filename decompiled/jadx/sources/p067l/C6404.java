package p067l;

import android.net.Uri;
import android.os.SystemClock;
import com.alipay.sdk.p010m.p016c0.AbstractC0093c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6404 implements InterfaceC19583 {

    /* JADX INFO: renamed from: ۗ */
    public long f16577;

    /* JADX INFO: renamed from: ۙ */
    public long f16578;

    /* JADX INFO: renamed from: ۛ */
    public IOException f16579;

    /* JADX INFO: renamed from: ۤ */
    public final C10866 f16580 = new C10866("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: ۨ */
    public C7074 f16581;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC22753 f16582;

    /* JADX INFO: renamed from: ۬ */
    public boolean f16583;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C20486 f16584;

    /* JADX INFO: renamed from: ᩶ */
    public long f16585;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f16586;

    /* JADX INFO: renamed from: ᩹ */
    public long f16587;

    /* JADX INFO: renamed from: ᩺ */
    public final Uri f16588;

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final C18912 mo14657(InterfaceC24947 interfaceC24947, long j, long j2, IOException iOException, int i) {
        C18912 c18912M25032;
        C4831 c4831 = (C4831) interfaceC24947;
        long j3 = c4831.f10991;
        int i2 = c4831.f10990;
        c4831.m10246();
        Map mapM10249 = c4831.m10249();
        c4831.m10247();
        C12782 c12782 = new C12782(j2, mapM10249);
        boolean z = c4831.m10246().getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof C8415;
        C18912 c18912 = C10866.f30117;
        C20486 c20486 = this.f16584;
        if (z || z2) {
            int i3 = iOException instanceof C24959 ? ((C24959) iOException).f79694 : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.f16587 = SystemClock.elapsedRealtime();
                m14661(false);
                C10099 c10099 = c20486.f63280;
                String str = C5792.f14228;
                c10099.m23561(c12782, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return c18912;
            }
        }
        C4160 c4160 = new C4160(iOException, i);
        if (C20486.m46213(c20486, this.f16588, c4160, false)) {
            long jMo29503 = c20486.f63275.mo29503(c4160);
            if (jMo29503 != -9223372036854775807L) {
                c18912M25032 = C10866.m25032(jMo29503, false);
            } else {
                c18912M25032 = C10866.f30116;
            }
            c18912 = c18912M25032;
        }
        boolean zM43018 = c18912.m43018();
        c20486.f63280.m23561(c12782, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !zM43018);
        if (!zM43018) {
            c20486.f63275.getClass();
        }
        return c18912;
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14658(InterfaceC24947 interfaceC24947, long j, long j2) {
        C4831 c4831 = (C4831) interfaceC24947;
        AbstractC12439 abstractC12439 = (AbstractC12439) c4831.m10248();
        c4831.m10246();
        Map mapM10249 = c4831.m10249();
        c4831.m10247();
        C12782 c12782 = new C12782(j2, mapM10249);
        boolean z = abstractC12439 instanceof C7074;
        C20486 c20486 = this.f16584;
        if (z) {
            m14649((C7074) abstractC12439, c12782);
            c20486.f63280.m23564(c12782, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            this.f16579 = C10998.m25385("Loaded playlist has unexpected type.");
            c20486.f63280.m23561(c12782, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, this.f16579, true);
        }
        c20486.f63275.getClass();
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14659(InterfaceC24947 interfaceC24947, long j, long j2, int i) {
        C12782 c12782;
        C4831 c4831 = (C4831) interfaceC24947;
        if (i == 0) {
            long j3 = c4831.f10991;
            c12782 = new C12782(c4831.f10989);
        } else {
            long j4 = c4831.f10991;
            c4831.m10246();
            Map mapM10249 = c4831.m10249();
            c4831.m10247();
            c12782 = new C12782(j2, mapM10249);
        }
        this.f16584.f63280.m23560(c12782, c4831.f10990, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14660(InterfaceC24947 interfaceC24947, long j, long j2, boolean z) {
        C4831 c4831 = (C4831) interfaceC24947;
        long j3 = c4831.f10991;
        c4831.m10246();
        Map mapM10249 = c4831.m10249();
        c4831.m10247();
        C12782 c12782 = new C12782(j2, mapM10249);
        C20486 c20486 = this.f16584;
        c20486.f63275.getClass();
        c20486.f63280.m23559(c12782, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public C6404(C20486 c20486, Uri uri) {
        this.f16584 = c20486;
        this.f16588 = uri;
        this.f16582 = c20486.f63279.mo8240(4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7074 m14656() {
        return this.f16581;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m14664() {
        int i;
        if (this.f16581 == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, C5792.m13013(this.f16581.f18439));
        C7074 c7074 = this.f16581;
        return c7074.f18446 || (i = c7074.f18429) == 2 || i == 1 || this.f16577 + jMax > jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14661(boolean z) {
        m14652(z ? m14654() : this.f16588);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m14666() throws IOException {
        this.f16580.m25037(Integer.MIN_VALUE);
        IOException iOException = this.f16579;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m14663() {
        return this.f16586;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14662(boolean z) {
        this.f16586 = z;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m14665() {
        this.f16580.m25038((InterfaceC8854) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m14652(final Uri uri) {
        this.f16585 = 0L;
        if (this.f16583) {
            return;
        }
        C10866 c10866 = this.f16580;
        if (c10866.m25042() || c10866.m25041()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < this.f16587) {
            this.f16583 = true;
            this.f16584.f63281.postDelayed(new Runnable() { // from class: l.ۖ᩺֫
                @Override // java.lang.Runnable
                public final void run() {
                    C6404.m14647(this.f11865, uri);
                }
            }, this.f16587 - jElapsedRealtime);
        } else {
            m14646(uri);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m14647(C6404 c6404, Uri uri) {
        c6404.f16583 = false;
        c6404.m14646(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14646(Uri uri) {
        C20486 c20486 = this.f16584;
        InterfaceC17570 interfaceC17570Mo25571 = c20486.f63274.mo25571(c20486.f63273, this.f16581);
        C6659 c6659 = new C6659();
        c6659.m15164(uri);
        c6659.m15162(1);
        C4831 c4831 = new C4831(this.f16582, c6659.m15161(), interfaceC17570Mo25571);
        this.f16580.m25039(c4831, this, c20486.f63275.mo29502(c4831.f10990));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m14649(C7074 c7074, C12782 c12782) {
        boolean z;
        C7074 c7075 = this.f16581;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f16577 = jElapsedRealtime;
        C20486 c20486 = this.f16584;
        C7074 c7074M46210 = C20486.m46210(c20486, c7075, c7074);
        this.f16581 = c7074M46210;
        IOException c18214 = null;
        Uri uri = this.f16588;
        if (c7074M46210 != c7075) {
            this.f16579 = null;
            this.f16578 = jElapsedRealtime;
            C20486.m46212(c20486, uri, c7074M46210);
        } else if (!c7074M46210.f18446) {
            long size = c7074.f18434 + ((long) c7074.f18427.size());
            C7074 c7076 = this.f16581;
            if (size < c7076.f18434) {
                c18214 = new C12851();
                z = true;
            } else {
                double d = jElapsedRealtime - this.f16578;
                double dM13013 = C5792.m13013(c7076.f18437) * 3.5d;
                z = false;
                if (d > dM13013) {
                    c18214 = new C18214();
                }
            }
            if (c18214 != null) {
                this.f16579 = c18214;
                C20486.m46213(c20486, uri, new C4160(c18214, 1), z);
            }
        }
        C7074 c7077 = this.f16581;
        C21827 c21827 = c7077.f18431;
        long j = c7077.f18437;
        if (c21827.f68668) {
            if (c7077 == c7075) {
                long j2 = c7077.f18438;
                if (j2 != -9223372036854775807L) {
                    j = j2 / 2;
                } else {
                    j /= 2;
                }
            } else {
                j = 0;
            }
        } else if (c7077 == c7075) {
            j /= 2;
        }
        this.f16587 = (C5792.m13013(j) + jElapsedRealtime) - c12782.f35983;
        if (this.f16581.f18446) {
            return;
        }
        if (uri.equals(c20486.f63272) || this.f16586) {
            m14652(m14654());
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private Uri m14654() {
        C7074 c7074 = this.f16581;
        Uri uri = this.f16588;
        if (c7074 != null) {
            C21827 c21827 = c7074.f18431;
            if (c21827.f68671 != -9223372036854775807L || c21827.f68668) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C7074 c7075 = this.f16581;
                if (c7075.f18431.f68668) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c7075.f18434 + ((long) c7075.f18427.size())));
                    C7074 c7076 = this.f16581;
                    if (c7076.f18438 != -9223372036854775807L) {
                        AbstractC16192 abstractC16192 = c7076.f18444;
                        int size = abstractC16192.size();
                        if (!abstractC16192.isEmpty() && ((C10427) C10810.m24926(abstractC16192)).f28831) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C21827 c21828 = this.f16581.f18431;
                if (c21828.f68671 != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c21828.f68669 ? AbstractC0093c.f364d : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m14650(C6404 c6404, long j) {
        c6404.f16585 = SystemClock.elapsedRealtime() + j;
        Uri uri = c6404.f16588;
        C20486 c20486 = c6404.f16584;
        return uri.equals(c20486.f63272) && !C20486.m46215(c20486);
    }
}
