package p067l;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ᩴ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20486 implements InterfaceC18885, InterfaceC19583 {

    /* JADX INFO: renamed from: ۧ֫ */
    public static final C18426 f63267 = new C18426();

    /* JADX INFO: renamed from: ֫֫ */
    public InterfaceC19556 f63268;

    /* JADX INFO: renamed from: ۗ */
    public boolean f63269;

    /* JADX INFO: renamed from: ۟ */
    public Uri f63272;

    /* JADX INFO: renamed from: ۤ */
    public C14450 f63273;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC15790 f63274;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC12878 f63275;

    /* JADX INFO: renamed from: ܰ */
    public C7074 f63277;

    /* JADX INFO: renamed from: ᩶ */
    public C10866 f63278;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC22852 f63279;

    /* JADX INFO: renamed from: ᩹ */
    public C10099 f63280;

    /* JADX INFO: renamed from: ᩺ */
    public Handler f63281;

    /* JADX INFO: renamed from: ۬ */
    public final CopyOnWriteArrayList f63276 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۛ */
    public final HashMap f63271 = new HashMap();

    /* JADX INFO: renamed from: ۙ */
    public long f63270 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫ */
    public static C7074 m46210(C20486 c20486, C7074 c7074, C7074 c7075) {
        long j;
        long j2;
        int i;
        int size;
        int size2;
        int size3;
        boolean z = c7075.f18446;
        long j3 = c7075.f18434;
        boolean z2 = true;
        if (c7074 != null) {
            long j4 = c7074.f18434;
            if (j3 <= j4 && (j3 < j4 || ((size = c7075.f18427.size() - c7074.f18427.size()) == 0 ? !((size2 = c7075.f18444.size()) > (size3 = c7074.f18444.size()) || (size2 == size3 && z && !c7074.f18446)) : size <= 0))) {
                z2 = false;
            }
        }
        AbstractC16192 abstractC16192 = c7075.f18427;
        if (!z2) {
            return (!z || c7074.f18446) ? c7074 : new C7074(c7074.f18429, c7074.f34777, c7074.f34779, c7074.f18428, c7074.f18430, c7074.f18433, c7074.f18436, c7074.f18440, c7074.f18434, c7074.f18445, c7074.f18437, c7074.f18438, c7074.f34778, true, c7074.f18443, c7074.f18441, c7074.f18427, c7074.f18444, c7074.f18431, c7074.f18442, c7074.f18435);
        }
        if (c7075.f18443) {
            j2 = c7075.f18433;
        } else {
            C7074 c7076 = c20486.f63277;
            long j5 = c7076 != null ? c7076.f18433 : 0L;
            if (c7074 != null) {
                long j6 = c7074.f18433;
                long j7 = c7074.f18434;
                AbstractC16192 abstractC16193 = c7074.f18427;
                int size4 = abstractC16193.size();
                int i2 = (int) (j3 - j7);
                C23168 c23168 = i2 < abstractC16193.size() ? (C23168) abstractC16193.get(i2) : null;
                if (c23168 != null) {
                    j = c23168.f75743;
                } else if (size4 == j3 - j7) {
                    j = c7074.f18439;
                }
                j2 = j6 + j;
            }
            j2 = j5;
        }
        if (c7075.f18436) {
            i = c7075.f18440;
        } else {
            C7074 c7077 = c20486.f63277;
            i = c7077 != null ? c7077.f18440 : 0;
            if (c7074 != null) {
                int i3 = (int) (j3 - c7074.f18434);
                AbstractC16192 abstractC16194 = c7074.f18427;
                C23168 c23169 = i3 < abstractC16194.size() ? (C23168) abstractC16194.get(i3) : null;
                if (c23169 != null) {
                    i = (c7074.f18440 + c23169.f75741) - ((C23168) abstractC16192.get(0)).f75741;
                }
            }
        }
        return new C7074(c7075.f18429, c7075.f34777, c7075.f34779, c7075.f18428, c7075.f18430, j2, true, i, c7075.f18434, c7075.f18445, c7075.f18437, c7075.f18438, c7075.f34778, c7075.f18446, c7075.f18443, c7075.f18441, abstractC16192, c7075.f18444, c7075.f18431, c7075.f18442, c7075.f18435);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final C18912 mo14657(InterfaceC24947 interfaceC24947, long j, long j2, IOException iOException, int i) {
        C4831 c4831 = (C4831) interfaceC24947;
        long j3 = c4831.f10991;
        c4831.m10246();
        Map mapM10249 = c4831.m10249();
        c4831.m10247();
        C12782 c12782 = new C12782(j2, mapM10249);
        int i2 = c4831.f10990;
        long jMo29503 = this.f63275.mo29503(new C4160(iOException, i));
        boolean z = jMo29503 == -9223372036854775807L;
        this.f63280.m23561(c12782, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        if (z) {
            return C10866.f30116;
        }
        return C10866.m25032(jMo29503, false);
    }

    @Override // p067l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ */
    public final void mo14658(InterfaceC24947 interfaceC24947, long j, long j2) {
        C14450 c14450;
        HashMap map;
        C4831 c4831 = (C4831) interfaceC24947;
        AbstractC12439 abstractC12439 = (AbstractC12439) c4831.m10248();
        boolean z = abstractC12439 instanceof C7074;
        if (z) {
            String str = abstractC12439.f34777;
            C14450 c14451 = C14450.f41281;
            Uri uri = Uri.parse(str);
            C3601 c3601 = new C3601();
            c3601.m6701("0");
            c3601.m6694("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new C15120(uri, c3601.m6672(), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            c14450 = new C14450("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            c14450 = (C14450) abstractC12439;
        }
        this.f63273 = c14450;
        this.f63272 = ((C15120) c14450.f41287.get(0)).f43174;
        this.f63276.add(new C17802(this));
        List list2 = c14450.f41286;
        int size = list2.size();
        int i = 0;
        while (true) {
            map = this.f63271;
            if (i >= size) {
                break;
            }
            Uri uri2 = (Uri) list2.get(i);
            map.put(uri2, new C6404(this, uri2));
            i++;
        }
        c4831.m10246();
        Map mapM10249 = c4831.m10249();
        c4831.m10247();
        C12782 c12782 = new C12782(j2, mapM10249);
        C6404 c6404 = (C6404) map.get(this.f63272);
        if (z) {
            c6404.m14649((C7074) abstractC12439, c12782);
        } else {
            c6404.m14661(false);
        }
        this.f63275.getClass();
        this.f63280.m23564(c12782, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
        this.f63280.m23560(c12782, c4831.f10990, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
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
        this.f63275.getClass();
        this.f63280.m23559(c12782, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public C20486(InterfaceC22852 interfaceC22852, InterfaceC12878 interfaceC12878, InterfaceC15790 interfaceC15790) {
        this.f63279 = interfaceC22852;
        this.f63274 = interfaceC15790;
        this.f63275 = interfaceC12878;
    }

    @Override // p067l.InterfaceC18885
    public final void stop() {
        this.f63272 = null;
        this.f63277 = null;
        this.f63273 = null;
        this.f63270 = -9223372036854775807L;
        this.f63278.m25038((InterfaceC8854) null);
        this.f63278 = null;
        HashMap map = this.f63271;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C6404) it.next()).m14665();
        }
        this.f63281.removeCallbacksAndMessages(null);
        this.f63281 = null;
        map.clear();
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ۧ */
    public final void mo11232(InterfaceC4133 interfaceC4133) {
        this.f63276.add(interfaceC4133);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final void mo11228(InterfaceC4133 interfaceC4133) {
        this.f63276.remove(interfaceC4133);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ۧ */
    public final C14450 mo11230() {
        return this.f63273;
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final C7074 mo11225(Uri uri, boolean z) {
        HashMap map = this.f63271;
        C7074 c7074M14656 = ((C6404) map.get(uri)).m14656();
        if (c7074M14656 != null && z) {
            if (!uri.equals(this.f63272)) {
                List list = this.f63273.f41287;
                for (int i = 0; i < list.size(); i++) {
                    if (uri.equals(((C15120) list.get(i)).f43174)) {
                        C7074 c7074 = this.f63277;
                        if (c7074 != null && c7074.f18446) {
                            break;
                        }
                        this.f63272 = uri;
                        C6404 c6404 = (C6404) map.get(uri);
                        C7074 c7075 = c6404.f16581;
                        if (c7075 != null && c7075.f18446) {
                            this.f63277 = c7075;
                            this.f63268.mo18800(c7075);
                            break;
                        }
                        c6404.m14652(m46220(uri));
                        break;
                    }
                }
            }
            C6404 c6405 = (C6404) map.get(uri);
            C7074 c7074M14657 = c6405.m14656();
            if (!c6405.m14663()) {
                c6405.m14662(true);
                if (c7074M14657 != null && !c7074M14657.f18446) {
                    c6405.m14661(true);
                }
            }
        }
        return c7074M14656;
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final long mo11224() {
        return this.f63270;
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo11236(Uri uri) {
        return ((C6404) this.f63271.get(uri)).m14664();
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11235() throws IOException {
        C10866 c10866 = this.f63278;
        if (c10866 != null) {
            c10866.m25037(Integer.MIN_VALUE);
        }
        Uri uri = this.f63272;
        if (uri != null) {
            mo11231(uri);
        }
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ۧ */
    public final void mo11231(Uri uri) throws IOException {
        ((C6404) this.f63271.get(uri)).m14666();
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ܽ */
    public final void mo11233(Uri uri) {
        ((C6404) this.f63271.get(uri)).m14661(true);
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo11234() {
        return this.f63269;
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11229(Uri uri, long j) {
        C6404 c6404 = (C6404) this.f63271.get(uri);
        if (c6404 != null) {
            return !C6404.m14650(c6404, j);
        }
        return false;
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final void mo11226(Uri uri) {
        C6404 c6404 = (C6404) this.f63271.get(uri);
        if (c6404 != null) {
            c6404.m14662(false);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public static boolean m46215(C20486 c20486) {
        List list = c20486.f63273.f41287;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C6404 c6404 = (C6404) c20486.f63271.get(((C15120) list.get(i)).f43174);
            c6404.getClass();
            if (jElapsedRealtime > c6404.f16585) {
                Uri uri = c6404.f16588;
                c20486.f63272 = uri;
                c6404.m14652(c20486.m46220(uri));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    private Uri m46220(Uri uri) {
        C17131 c17131;
        C7074 c7074 = this.f63277;
        if (c7074 == null || !c7074.f18431.f68668 || (c17131 = (C17131) c7074.f18442.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c17131.f50597));
        int i = c17131.f50598;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46212(C20486 c20486, Uri uri, C7074 c7074) {
        if (uri.equals(c20486.f63272)) {
            if (c20486.f63277 == null) {
                c20486.f63269 = !c7074.f18446;
                c20486.f63270 = c7074.f18433;
            }
            c20486.f63277 = c7074;
            c20486.f63268.mo18800(c7074);
        }
        Iterator it = c20486.f63276.iterator();
        while (it.hasNext()) {
            ((InterfaceC4133) it.next()).mo8373();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46213(C20486 c20486, Uri uri, C4160 c4160, boolean z) {
        Iterator it = c20486.f63276.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !((InterfaceC4133) it.next()).mo8372(uri, c4160, z);
        }
        return z2;
    }

    @Override // p067l.InterfaceC18885
    /* JADX INFO: renamed from: ֫ */
    public final void mo11227(Uri uri, C10099 c10099, InterfaceC19556 interfaceC19556) {
        this.f63281 = C5792.m12995((Handler.Callback) null);
        this.f63280 = c10099;
        this.f63268 = interfaceC19556;
        C6659 c6659 = new C6659();
        c6659.m15164(uri);
        c6659.m15162(1);
        C4831 c4831 = new C4831(this.f63279.mo8240(4), c6659.m15161(), this.f63274.mo25570());
        C23877.m52960(this.f63278 == null);
        C10866 c10866 = new C10866("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f63278 = c10866;
        c10866.m25039(c4831, this, this.f63275.mo29502(c4831.f10990));
    }
}
