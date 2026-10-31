package l;

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
public final class C19063 implements InterfaceC17379, InterfaceC18113 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final C16895 f60033 = new C16895();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18085 f60034;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f60035;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Uri f60038;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C12712 f60039;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14122 f60040;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f60041;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4951 f60043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8941 f60044;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC21553 f60045;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C8134 f60046;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Handler f60047;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f60042 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashMap f60037 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f60036 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4951 m43916(C19063 c19063, C4951 c4951, C4951 c4952) {
        long j;
        long j2;
        int i;
        int size;
        int size2;
        int size3;
        boolean z = c4952.f15612;
        long j3 = c4952.f15600;
        boolean z2 = true;
        if (c4951 != null) {
            long j4 = c4951.f15600;
            if (j3 <= j4 && (j3 < j4 || ((size = c4952.f15593.size() - c4951.f15593.size()) == 0 ? !((size2 = c4952.f15610.size()) > (size3 = c4951.f15610.size()) || (size2 == size3 && z && !c4951.f15612)) : size <= 0))) {
                z2 = false;
            }
        }
        AbstractC14545 abstractC14545 = c4952.f15593;
        if (!z2) {
            return (!z || c4951.f15612) ? c4951 : new C4951(c4951.f15595, c4951.f31806, c4951.f31808, c4951.f15594, c4951.f15596, c4951.f15599, c4951.f15602, c4951.f15606, c4951.f15600, c4951.f15611, c4951.f15603, c4951.f15604, c4951.f31807, true, c4951.f15609, c4951.f15607, c4951.f15593, c4951.f15610, c4951.f15597, c4951.f15608, c4951.f15601);
        }
        if (c4952.f15609) {
            j2 = c4952.f15599;
        } else {
            C4951 c4953 = c19063.f60043;
            long j5 = c4953 != null ? c4953.f15599 : 0L;
            if (c4951 != null) {
                long j6 = c4951.f15599;
                long j7 = c4951.f15600;
                AbstractC14545 abstractC14546 = c4951.f15593;
                int size4 = abstractC14546.size();
                int i2 = (int) (j3 - j7);
                C21885 c21885 = i2 < abstractC14546.size() ? (C21885) abstractC14546.get(i2) : null;
                if (c21885 != null) {
                    j = c21885.f73016;
                } else if (size4 == j3 - j7) {
                    j = c4951.f15605;
                }
                j2 = j6 + j;
            }
            j2 = j5;
        }
        if (c4952.f15602) {
            i = c4952.f15606;
        } else {
            C4951 c4954 = c19063.f60043;
            i = c4954 != null ? c4954.f15606 : 0;
            if (c4951 != null) {
                int i3 = (int) (j3 - c4951.f15600);
                AbstractC14545 abstractC14547 = c4951.f15593;
                C21885 c21886 = i3 < abstractC14547.size() ? (C21885) abstractC14547.get(i3) : null;
                if (c21886 != null) {
                    i = (c4951.f15606 + c21886.f73014) - ((C21885) abstractC14545.get(0)).f73014;
                }
            }
        }
        return new C4951(c4952.f15595, c4952.f31806, c4952.f31808, c4952.f15594, c4952.f15596, j2, true, i, c4952.f15600, c4952.f15611, c4952.f15603, c4952.f15604, c4952.f31807, c4952.f15612, c4952.f15609, c4952.f15607, abstractC14545, c4952.f15610, c4952.f15597, c4952.f15608, c4952.f15601);
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫ */
    public final C17407 mo12777(InterfaceC23757 interfaceC23757, long j, long j2, IOException iOException, int i) {
        C2591 c2591 = (C2591) interfaceC23757;
        long j3 = c2591.f8199;
        c2591.m8207();
        Map mapM8210 = c2591.m8210();
        c2591.m8208();
        C10957 c10957 = new C10957(j2, mapM8210);
        int i2 = c2591.f8198;
        long jMo27441 = this.f60041.mo27441(new C1885(iOException, i));
        boolean z = jMo27441 == -9223372036854775807L;
        this.f60046.m21593(c10957, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        if (z) {
            return C8941.f27181;
        }
        return C8941.m23058(jMo27441, false);
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫ */
    public final void mo12778(InterfaceC23757 interfaceC23757, long j, long j2) {
        C12712 c12712;
        HashMap map;
        C2591 c2591 = (C2591) interfaceC23757;
        AbstractC10596 abstractC10596 = (AbstractC10596) c2591.m8209();
        boolean z = abstractC10596 instanceof C4951;
        if (z) {
            String str = abstractC10596.f31806;
            C12712 c12713 = C12712.f38252;
            Uri uri = Uri.parse(str);
            C1297 c1297 = new C1297();
            c1297.m4469("0");
            c1297.m4462("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new C13417(uri, c1297.m4440(), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            c12712 = new C12712("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            c12712 = (C12712) abstractC10596;
        }
        this.f60039 = c12712;
        this.f60038 = ((C13417) c12712.f38258.get(0)).f40105;
        this.f60042.add(new C16239(this));
        List list2 = c12712.f38257;
        int size = list2.size();
        int i = 0;
        while (true) {
            map = this.f60037;
            if (i >= size) {
                break;
            }
            Uri uri2 = (Uri) list2.get(i);
            map.put(uri2, new C4246(this, uri2));
            i++;
        }
        c2591.m8207();
        Map mapM8210 = c2591.m8210();
        c2591.m8208();
        C10957 c10957 = new C10957(j2, mapM8210);
        C4246 c4246 = (C4246) map.get(this.f60038);
        if (z) {
            c4246.m12769((C4951) abstractC10596, c10957);
        } else {
            c4246.m12781(false);
        }
        this.f60041.getClass();
        this.f60046.m21596(c10957, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫ */
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
        this.f60046.m21592(c10957, c2591.f8198, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // l.InterfaceC18113
    /* JADX INFO: renamed from: ֫ */
    public final void mo12780(InterfaceC23757 interfaceC23757, long j, long j2, boolean z) {
        C2591 c2591 = (C2591) interfaceC23757;
        long j3 = c2591.f8199;
        c2591.m8207();
        Map mapM8210 = c2591.m8210();
        c2591.m8208();
        C10957 c10957 = new C10957(j2, mapM8210);
        this.f60041.getClass();
        this.f60046.m21591(c10957, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public C19063(InterfaceC21553 interfaceC21553, InterfaceC11058 interfaceC11058, InterfaceC14122 interfaceC14122) {
        this.f60045 = interfaceC21553;
        this.f60040 = interfaceC14122;
        this.f60041 = interfaceC11058;
    }

    @Override // l.InterfaceC17379
    public final void stop() {
        this.f60038 = null;
        this.f60043 = null;
        this.f60039 = null;
        this.f60036 = -9223372036854775807L;
        this.f60044.m23064((InterfaceC6824) null);
        this.f60044 = null;
        HashMap map = this.f60037;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C4246) it.next()).m12785();
        }
        this.f60047.removeCallbacksAndMessages(null);
        this.f60047 = null;
        map.clear();
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ۧ */
    public final void mo9181(InterfaceC1857 interfaceC1857) {
        this.f60042.add(interfaceC1857);
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ֫ */
    public final void mo9177(InterfaceC1857 interfaceC1857) {
        this.f60042.remove(interfaceC1857);
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ۧ */
    public final C12712 mo9179() {
        return this.f60039;
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ֫ */
    public final C4951 mo9174(Uri uri, boolean z) {
        HashMap map = this.f60037;
        C4951 c4951M12776 = ((C4246) map.get(uri)).m12776();
        if (c4951M12776 != null && z) {
            if (!uri.equals(this.f60038)) {
                List list = this.f60039.f38258;
                for (int i = 0; i < list.size(); i++) {
                    if (uri.equals(((C13417) list.get(i)).f40105)) {
                        C4951 c4951 = this.f60043;
                        if (c4951 != null && c4951.f15612) {
                            break;
                        }
                        this.f60038 = uri;
                        C4246 c4246 = (C4246) map.get(uri);
                        C4951 c4952 = c4246.f13764;
                        if (c4952 != null && c4952.f15612) {
                            this.f60043 = c4952;
                            this.f60034.mo16872(c4952);
                            break;
                        }
                        c4246.m12772(m43926(uri));
                        break;
                    }
                }
            }
            C4246 c4247 = (C4246) map.get(uri);
            C4951 c4951M12777 = c4247.m12776();
            if (!c4247.m12783()) {
                c4247.m12782(true);
                if (c4951M12777 != null && !c4951M12777.f15612) {
                    c4247.m12781(true);
                }
            }
        }
        return c4951M12776;
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ֫ */
    public final long mo9173() {
        return this.f60036;
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo9185(Uri uri) {
        return ((C4246) this.f60037.get(uri)).m12784();
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9184() throws IOException {
        C8941 c8941 = this.f60044;
        if (c8941 != null) {
            c8941.m23063(Integer.MIN_VALUE);
        }
        Uri uri = this.f60038;
        if (uri != null) {
            mo9180(uri);
        }
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ۧ */
    public final void mo9180(Uri uri) throws IOException {
        ((C4246) this.f60037.get(uri)).m12786();
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ܽ */
    public final void mo9182(Uri uri) {
        ((C4246) this.f60037.get(uri)).m12781(true);
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9183() {
        return this.f60035;
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9178(Uri uri, long j) {
        C4246 c4246 = (C4246) this.f60037.get(uri);
        if (c4246 != null) {
            return !C4246.m12770(c4246, j);
        }
        return false;
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ֫ */
    public final void mo9175(Uri uri) {
        C4246 c4246 = (C4246) this.f60037.get(uri);
        if (c4246 != null) {
            c4246.m12782(false);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m43921(C19063 c19063) {
        List list = c19063.f60039.f38258;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C4246 c4246 = (C4246) c19063.f60037.get(((C13417) list.get(i)).f40105);
            c4246.getClass();
            if (jElapsedRealtime > c4246.f13768) {
                Uri uri = c4246.f13771;
                c19063.f60038 = uri;
                c4246.m12772(c19063.m43926(uri));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private Uri m43926(Uri uri) {
        C15533 c15533;
        C4951 c4951 = this.f60043;
        if (c4951 == null || !c4951.f15597.f65991 || (c15533 = (C15533) c4951.f15608.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c15533.f47465));
        int i = c15533.f47466;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43918(C19063 c19063, Uri uri, C4951 c4951) {
        if (uri.equals(c19063.f60038)) {
            if (c19063.f60043 == null) {
                c19063.f60035 = !c4951.f15612;
                c19063.f60036 = c4951.f15599;
            }
            c19063.f60043 = c4951;
            c19063.f60034.mo16872(c4951);
        }
        Iterator it = c19063.f60042.iterator();
        while (it.hasNext()) {
            ((InterfaceC1857) it.next()).mo6171();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43919(C19063 c19063, Uri uri, C1885 c1885, boolean z) {
        Iterator it = c19063.f60042.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !((InterfaceC1857) it.next()).mo6170(uri, c1885, z);
        }
        return z2;
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ֫ */
    public final void mo9176(Uri uri, C8134 c8134, InterfaceC18085 interfaceC18085) {
        this.f60047 = C3603.m11019((Handler.Callback) null);
        this.f60046 = c8134;
        this.f60034 = interfaceC18085;
        C4515 c4515 = new C4515();
        c4515.m13281(uri);
        c4515.m13279(1);
        C2591 c2591 = new C2591(this.f60045.mo6042(4), c4515.m13278(), this.f60040.mo23618());
        C22632.m50634(this.f60044 == null);
        C8941 c8941 = new C8941("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f60044 = c8941;
        c8941.m23065(c2591, this, this.f60041.mo27440(c2591.f8198));
    }
}
