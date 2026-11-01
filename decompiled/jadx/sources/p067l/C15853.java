package p067l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15853 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public C15570 f45915;

    /* JADX INFO: renamed from: ۜ */
    public volatile boolean f45917;

    /* JADX INFO: renamed from: ۡ */
    public C7137 f45918;

    /* JADX INFO: renamed from: ۢ */
    public C17762 f45919;

    /* JADX INFO: renamed from: ܳ */
    public int f45921;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C24571 f45922;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC22753 f45923;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f45924;

    /* JADX INFO: renamed from: ᩳ */
    public C11950 f45925;

    /* JADX INFO: renamed from: ᩻ */
    public Uri f45927;

    /* JADX INFO: renamed from: ۖ */
    public final ArrayList f45916 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public Map f45926 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ۧ */
    public List f45920 = Collections.EMPTY_LIST;

    public C15853(C24571 c24571) {
        this.f45922 = c24571;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        ArrayList arrayList = this.f45916;
        if (arrayList.contains(interfaceC2830)) {
            return;
        }
        arrayList.add(interfaceC2830);
        InterfaceC22753 interfaceC22753 = this.f45923;
        if (interfaceC22753 != null) {
            interfaceC22753.mo8132(interfaceC2830);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws Throwable {
        long length;
        String str;
        String strM48631;
        C2442 c2442;
        if (this.f45923 != null || this.f45924 != null) {
            throw new IOException("Data source is already open");
        }
        this.f45917 = false;
        this.f45927 = c5318.f12514;
        this.f45926 = Collections.EMPTY_MAP;
        if (c5318.f12521 != 0 || c5318.f12516 != -1) {
            return m35990(c5318);
        }
        C16524 c16524 = this.f45922.f77793;
        if (this.f45922.f77791 == EnumC17865.f53335 && c16524 != null) {
            EnumC9819 enumC9819M37499 = c16524.m37499();
            EnumC9819 enumC9819 = EnumC9819.LIVE;
            if (enumC9819M37499 == enumC9819) {
                return m35990(c5318);
            }
            if (enumC9819M37499 == EnumC9819.UNKNOWN) {
                C17762 c17762M54691 = this.f45922.f77790.m54691();
                if (c17762M54691 != null) {
                    String strMo12962 = this.f45922.f77794.mo12962(c5318);
                    if (this.f45922.f77791.mo7402(strMo12962)) {
                        strM48631 = C21466.m48631("hls-playlist:", strMo12962);
                        str = strMo12962;
                    } else {
                        str = null;
                        strM48631 = null;
                    }
                } else {
                    str = null;
                    strM48631 = null;
                }
                if (c17762M54691 != null && str != null && strM48631 != null) {
                    C11950 c11950M30365 = this.f45922.f77796.m30365(str);
                    this.f45925 = c11950M30365;
                    try {
                        c11950M30365.m27354();
                        C9267 c9267M35983 = m35983(c17762M54691, strM48631, c5318, true);
                        c11950M30365.m27356();
                        c11950M30365.close();
                        if (this.f45925 == c11950M30365) {
                            this.f45925 = null;
                        }
                        if (c9267M35983 != null) {
                            if (!c16524.m37495()) {
                                return m35990(c5318);
                            }
                            this.f45924 = c9267M35983.f25163;
                            this.f45927 = c9267M35983.f25164;
                            this.f45921 = 0;
                            m35986(c17762M54691, c16524.m37498());
                            return c9267M35983.f25163.length;
                        }
                        if (c16524.m37499() == enumC9819) {
                            return m35990(c5318);
                        }
                    } catch (Throwable th) {
                        c11950M30365.close();
                        if (this.f45925 == c11950M30365) {
                            this.f45925 = null;
                        }
                        throw th;
                    }
                }
                InterfaceC22753 interfaceC22753Mo8449 = this.f45922.f77792.mo8449();
                this.f45923 = interfaceC22753Mo8449;
                m35987(interfaceC22753Mo8449);
                C7137 c7137 = new C7137();
                try {
                    long jMo4020 = interfaceC22753Mo8449.mo4020(c5318);
                    m35988(interfaceC22753Mo8449, c5318.f12514);
                    if (jMo4020 > 2097152) {
                        this.f45918 = c7137;
                        this.f45919 = c17762M54691;
                        return jMo4020;
                    }
                    int i = 2097153;
                    byte[] bArrCopyOf = new byte[Math.min(8192, 2097153)];
                    int i2 = 0;
                    while (!this.f45917 && !Thread.currentThread().isInterrupted()) {
                        if (i2 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, Math.min(i, bArrCopyOf.length * 2));
                        }
                        int i3 = interfaceC22753Mo8449.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                        if (i3 == -1) {
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i2);
                            m35988(interfaceC22753Mo8449, c5318.f12514);
                            this.f45923 = null;
                            C10685.m24613(interfaceC22753Mo8449);
                            this.f45924 = bArrCopyOf2;
                            this.f45921 = 0;
                            if (c17762M54691 == null || str == null || strM48631 == null || bArrCopyOf2.length <= 0) {
                                c2442 = null;
                            } else {
                                Uri uri = this.f45927;
                                if (uri == null) {
                                    uri = c5318.f12514;
                                }
                                c2442 = new C2442(str, strM48631, bArrCopyOf2, uri, c5318);
                            }
                            List listM37493 = c16524.m37493(c7137.m16415(), c2442);
                            if (c17762M54691 != null) {
                                m35986(c17762M54691, listM37493);
                            }
                            return bArrCopyOf2.length;
                        }
                        if (i3 == 0) {
                            throw new IOException("HLS playlist upstream returned no data");
                        }
                        c7137.m16416(i2, i3, bArrCopyOf);
                        i2 += i3;
                        if (i2 > 2097152) {
                            this.f45924 = Arrays.copyOf(bArrCopyOf, i2);
                            this.f45921 = 0;
                            this.f45918 = c7137;
                            this.f45919 = c17762M54691;
                            return jMo4020;
                        }
                        i = 2097153;
                    }
                    throw new InterruptedIOException("Interrupted while loading HLS playlist");
                } catch (IOException e) {
                    e = e;
                    m35988(interfaceC22753Mo8449, c5318.f12514);
                    InterfaceC22753 interfaceC22753 = this.f45923;
                    this.f45923 = null;
                    C10685.m24613(interfaceC22753);
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    m35988(interfaceC22753Mo8449, c5318.f12514);
                    InterfaceC22753 interfaceC22754 = this.f45923;
                    this.f45923 = null;
                    C10685.m24613(interfaceC22754);
                    throw e;
                }
            }
        }
        C17762 c17762M54692 = this.f45922.f77790.m54691();
        if (c17762M54692 == null) {
            return m35990(c5318);
        }
        String strMo12963 = this.f45922.f77794.mo12962(c5318);
        if (!this.f45922.f77791.mo7402(strMo12963)) {
            return m35990(c5318);
        }
        String strM48632 = C21466.m48631("hls-playlist:", strMo12963);
        C11950 c11950M30366 = this.f45922.f77796.m30365(strMo12963);
        this.f45925 = c11950M30366;
        try {
            try {
                c11950M30366.m27354();
                do {
                    C9267 c9267M35984 = m35983(c17762M54692, strM48632, c5318, true);
                    if (c9267M35984 != null) {
                        c11950M30366.m27356();
                        C16524 c16525 = this.f45922.f77793;
                        if (c16525 != null) {
                            this.f45920 = c16525.m37498();
                        }
                        this.f45924 = c9267M35984.f25163;
                        this.f45927 = c9267M35984.f25164;
                        this.f45921 = 0;
                        length = c9267M35984.f25163.length;
                    }
                    c11950M30366.m27357();
                    c11950M30366.close();
                    this.f45925 = null;
                    List list = this.f45920;
                    this.f45920 = Collections.EMPTY_LIST;
                    m35986(c17762M54692, list);
                    return length;
                } while (!c11950M30366.m27355());
                length = m35982(c5318, c17762M54692, strM48632, m35989(c17762M54692, strM48632), c11950M30366);
                c11950M30366.m27357();
                c11950M30366.close();
                this.f45925 = null;
                List list2 = this.f45920;
                this.f45920 = Collections.EMPTY_LIST;
                m35986(c17762M54692, list2);
                return length;
            } catch (Throwable th2) {
                c11950M30366.m27357();
                c11950M30366.close();
                this.f45925 = null;
                List list3 = this.f45920;
                this.f45920 = Collections.EMPTY_LIST;
                m35986(c17762M54692, list3);
                throw th2;
            }
        } catch (IOException | RuntimeException e3) {
            InterfaceC22753 interfaceC22755 = this.f45923;
            this.f45923 = null;
            C10685.m24613(interfaceC22755);
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private long m35990(C5318 c5318) {
        InterfaceC22753 interfaceC22753Mo8449 = this.f45922.f77792.mo8449();
        this.f45923 = interfaceC22753Mo8449;
        m35987(interfaceC22753Mo8449);
        try {
            long jMo4020 = interfaceC22753Mo8449.mo4020(c5318);
            m35988(interfaceC22753Mo8449, c5318.f12514);
            return jMo4020;
        } catch (IOException | RuntimeException e) {
            m35988(interfaceC22753Mo8449, c5318.f12514);
            InterfaceC22753 interfaceC22753 = this.f45923;
            this.f45923 = null;
            C10685.m24613(interfaceC22753);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private long m35982(C5318 c5318, C17762 c17762, String str, boolean z, C11950 c11950) {
        C24571 c24571 = this.f45922;
        InterfaceC22753 interfaceC22753Mo8449 = c24571.f77792.mo8449();
        this.f45923 = interfaceC22753Mo8449;
        m35987(interfaceC22753Mo8449);
        C16524 c16524 = c24571.f77793;
        InterfaceC22753 interfaceC22753 = null;
        C7137 c7137 = c16524 == null ? null : new C7137();
        try {
            c11950.m27358();
            long jMo4020 = interfaceC22753Mo8449.mo4020(c5318);
            Uri uri = c5318.f12514;
            m35988(interfaceC22753Mo8449, uri);
            if (jMo4020 <= 2097152) {
                int i = 2097153;
                byte[] bArrCopyOf = new byte[Math.min(8192, 2097153)];
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    c11950.m27358();
                    if (i2 == bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, Math.min(i, bArrCopyOf.length * 2));
                    }
                    int i3 = interfaceC22753Mo8449.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                    if (i3 == -1) {
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i2);
                        m35988(interfaceC22753Mo8449, uri);
                        this.f45923 = interfaceC22753;
                        C10685.m24613(interfaceC22753Mo8449);
                        this.f45924 = bArrCopyOf2;
                        this.f45921 = 0;
                        boolean z3 = z && bArrCopyOf2.length > 0;
                        if (c16524 != null) {
                            String strMo12962 = c24571.f77794.mo12962(c5318);
                            Uri uri2 = this.f45927;
                            C2442 c2442 = new C2442(strMo12962, str, bArrCopyOf2, uri2 == null ? uri : uri2, c5318);
                            List<C2442> listM37493 = c16524.m37493(c7137.m16415(), c2442);
                            ArrayList arrayList = new ArrayList();
                            for (C2442 c2443 : listM37493) {
                                if (c2443 == c2442) {
                                    z2 = z;
                                } else {
                                    arrayList.add(c2443);
                                }
                            }
                            this.f45920 = arrayList;
                            z3 = z2;
                        }
                        if (z3) {
                            Uri uri3 = this.f45927;
                            m35985(c17762, str, bArrCopyOf2, uri3 == null ? uri : uri3, c11950);
                        }
                        return bArrCopyOf2.length;
                    }
                    if (i3 == 0) {
                        throw new IOException("HLS playlist upstream returned no data");
                    }
                    if (c7137 != null) {
                        c7137.m16416(i2, i3, bArrCopyOf);
                    }
                    i2 += i3;
                    if (i2 > 2097152) {
                        this.f45924 = Arrays.copyOf(bArrCopyOf, i2);
                        this.f45921 = 0;
                        if (c7137 == null) {
                            break;
                        }
                        this.f45918 = c7137;
                        this.f45919 = c17762;
                        break;
                    }
                    i = 2097153;
                    interfaceC22753 = null;
                }
            } else if (c7137 != null) {
                this.f45918 = c7137;
                this.f45919 = c17762;
                return jMo4020;
            }
            return jMo4020;
        } catch (IOException | RuntimeException e) {
            m35988(interfaceC22753Mo8449, c5318.f12514);
            InterfaceC22753 interfaceC22754 = this.f45923;
            this.f45923 = null;
            C10685.m24613(interfaceC22754);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C9267 m35983(C17762 c17762, String str, C5318 c5318, boolean z) {
        try {
            C15301 c15301M35984 = m35984(c17762.mo40351(str));
            if (c15301M35984 != null && c17762.m40360(str, 0L, c15301M35984.f43678)) {
                C5513 c5513 = new C5513();
                c5513.m12150(c17762);
                c5513.m12149((InterfaceC16716) null);
                c5513.m12151((C21607) null);
                c5513.m12148(new C19207(str));
                int i = 0;
                c5513.m12147(0);
                c5513.m12152();
                C14900 c14900Mo8449 = c5513.mo8449();
                if (z) {
                    m35987(c14900Mo8449);
                }
                int i2 = (int) c15301M35984.f43678;
                byte[] bArr = new byte[i2];
                try {
                    C6659 c6659M11510 = c5318.m11510();
                    c6659M11510.m15165(str);
                    c6659M11510.m15163(c15301M35984.f43678);
                    c14900Mo8449.mo4020(c6659M11510.m15161());
                    while (i < i2) {
                        int i3 = c14900Mo8449.read(bArr, i, i2 - i);
                        if (i3 == -1 || i3 == 0) {
                            C10685.m24613(c14900Mo8449);
                            return null;
                        }
                        i += i3;
                    }
                    C10685.m24613(c14900Mo8449);
                    if (c15301M35984.f43680.equals(C16111.m36665(C16111.m36668().digest(bArr)))) {
                        return new C9267(c15301M35984.f43679, bArr);
                    }
                } catch (Throwable th) {
                    C10685.m24613(c14900Mo8449);
                    throw th;
                }
            }
        } catch (IOException | RuntimeException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private C15301 m35984(C9046 c9046) {
        long jM20950 = c9046.m20950(Long.MIN_VALUE, "mt.hls.schema");
        C24571 c24571 = this.f45922;
        if (jM20950 != c24571.f77791.mo7400() || c9046.m20950(Long.MIN_VALUE, "mt.hls.complete") != 1) {
            return null;
        }
        long jM20951 = c9046.m20950(Long.MIN_VALUE, "mt.hls.body_length");
        String strM20954 = c9046.m20954("mt.hls.sha256");
        String strM20955 = c9046.m20954("mt.hls.final_uri");
        if (jM20951 <= 0 || jM20951 > 2097152 || strM20954 == null || strM20955 == null) {
            return null;
        }
        Uri uri = Uri.parse(strM20955);
        if (!c24571.f77791.mo7401(uri)) {
            return null;
        }
        boolean zM20953 = c9046.m20953("mt.hls.created_at_ms");
        boolean zM20954 = c9046.m20953("mt.hls.expires_at_ms");
        String strM20956 = c9046.m20954("mt.hls.stream_type");
        if (c24571.f77791 == EnumC17865.f53335) {
            if (!zM20953 || !zM20954 || !"vod".equals(strM20956)) {
                return null;
            }
            long jM20952 = c9046.m20950(Long.MIN_VALUE, "mt.hls.created_at_ms");
            long jM20953 = c9046.m20950(Long.MIN_VALUE, "mt.hls.expires_at_ms");
            long asLong = c24571.f77795.getAsLong();
            if (jM20952 < 0 || jM20953 <= jM20952 || asLong < jM20952 || asLong >= jM20953) {
                return null;
            }
        } else if (zM20953 || zM20954 || strM20956 != null) {
            return null;
        }
        return new C15301(jM20951, uri, strM20954);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35989(C17762 c17762, String str) {
        try {
            c17762.mo40354(str, m35991());
            if (c17762.mo40351(str).m20953("mt.hls.complete")) {
                return false;
            }
            c17762.m40362(str);
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX INFO: renamed from: ֫ */
    private void m35985(C17762 c17762, String str, final byte[] bArr, Uri uri, C11950 c11950) {
        C17762 c17763;
        String str2;
        long j;
        long j2;
        long jM37497;
        long j3;
        try {
            EnumC17865 enumC17865 = this.f45922.f77791;
            EnumC17865 enumC17866 = EnumC17865.f53335;
            c17763 = null;
            str2 = 0;
            if (enumC17865 == enumC17866) {
                long asLong = this.f45922.f77795.getAsLong();
                j2 = asLong + 300000;
                boolean z = true;
                boolean z2 = (300000 ^ asLong) < 0;
                if ((asLong ^ j2) < 0) {
                    z = false;
                }
                if (!z && !z2) {
                    throw new ArithmeticException();
                }
                j = asLong;
            } else {
                j = 0;
                j2 = 0;
            }
            C16524 c16524 = this.f45922.f77793;
            try {
                if (c16524 == null) {
                    jM37497 = -1;
                } else {
                    jM37497 = c16524.m37497();
                    if (jM37497 < 0) {
                        throw new IOException("HLS playlist cache was disabled for this stream");
                    }
                }
                c11950.m27358();
                C21607 c21607 = new C21607();
                c21607.m48809(c17762);
                C5513 c5513 = new C5513();
                c5513.m12150(c17762);
                c5513.m12149(new InterfaceC16716() { // from class: l.ܿ֨ۜ
                    @Override // p067l.InterfaceC16716
                    /* JADX INFO: renamed from: ֫ */
                    public final InterfaceC22753 mo8449() {
                        return new C20071(bArr);
                    }
                });
                c5513.m12151(c21607);
                c5513.m12148(new C19207(str));
                c5513.m12147(0);
                c5513.m12152();
                C14900 c14900Mo8449 = c5513.mo8449();
                C6659 c6659 = new C6659();
                c6659.m15164(C24571.f77789);
                c6659.m15165(str);
                c6659.m15163(bArr.length);
                C15570 c15570 = new C15570(c14900Mo8449, c6659.m15161());
                this.f45915 = c15570;
                try {
                    c15570.m35420();
                    this.f45915 = null;
                    c11950.m27358();
                    long j4 = jM37497;
                    try {
                        if (!c17762.m40360(str, 0L, bArr.length)) {
                            throw new IOException("HLS playlist cache write was incomplete");
                        }
                        C16524 c16525 = this.f45922.f77793;
                        if (c16525 != null && !c16525.m37496(j4)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        C25139 c25139 = new C25139();
                        c25139.m55194(this.f45922.f77791.mo7400(), "mt.hls.schema");
                        c25139.m55194(1L, "mt.hls.complete");
                        c25139.m55194(bArr.length, "mt.hls.body_length");
                        c25139.m55196("mt.hls.sha256", C16111.m36665(C16111.m36668().digest(bArr)));
                        c25139.m55196("mt.hls.final_uri", uri.toString());
                        if (this.f45922.f77791 == enumC17866) {
                            c25139.m55194(j, "mt.hls.created_at_ms");
                            c25139.m55194(j2, "mt.hls.expires_at_ms");
                            c25139.m55196("mt.hls.stream_type", "vod");
                        } else {
                            c25139.m55195("mt.hls.created_at_ms");
                            c25139.m55195("mt.hls.expires_at_ms");
                            c25139.m55195("mt.hls.stream_type");
                        }
                        C16524 c16526 = this.f45922.f77793;
                        if (c16526 == null) {
                            j3 = j4;
                            c17762.mo40354(str, c25139);
                        } else {
                            j3 = j4;
                            synchronized (c16526) {
                                if (!c16526.m37496(j3)) {
                                    throw new IOException("HLS playlist cache state changed before publishing");
                                }
                                c17762.mo40354(str, c25139);
                            }
                        }
                        C16524 c16527 = this.f45922.f77793;
                        if (c16527 != null && !c16527.m37496(j3)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        if (m35984(c17762.mo40351(str)) == null) {
                            throw new IOException("HLS playlist cache metadata was not published");
                        }
                    } catch (IOException | RuntimeException unused) {
                        c17763 = c17762;
                        str2 = str;
                        try {
                            c17763.mo40354(str2, m35991());
                        } catch (IOException | RuntimeException unused2) {
                        }
                        try {
                            c17762.m40362(str);
                        } catch (RuntimeException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    this.f45915 = null;
                    throw th;
                }
            } catch (IOException | RuntimeException unused4) {
            }
        } catch (IOException | RuntimeException unused5) {
            c17763 = c17762;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35986(C17762 c17762, List list) throws Throwable {
        C11950 c11950M30365;
        C16524 c16524 = this.f45922.f77793;
        if (c16524 == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2442 c2442 = (C2442) it.next();
            if (this.f45917 || c16524.m37499() != EnumC9819.VOD) {
                return;
            }
            try {
                c11950M30365 = this.f45922.f77796.m30365(c2442.m3432());
                try {
                    this.f45925 = c11950M30365;
                    c11950M30365.m27354();
                    while (true) {
                        C9267 c9267M35983 = m35983(c17762, c2442.m3433(), c2442.m3430(), false);
                        if (c9267M35983 != null && Arrays.equals(c9267M35983.m21393(), c2442.m3429()) && c9267M35983.m21394().equals(c2442.m3431())) {
                            c11950M30365.m27356();
                            break;
                        } else if (c11950M30365.m27355()) {
                            if (!m35989(c17762, c2442.m3433()) || c16524.m37499() != EnumC9819.VOD) {
                                break;
                                break;
                            } else {
                                m35985(c17762, c2442.m3433(), c2442.m3429(), c2442.m3431(), c11950M30365);
                                break;
                            }
                        }
                    }
                    c11950M30365.m27357();
                    c11950M30365.close();
                    if (this.f45925 == c11950M30365) {
                        this.f45925 = null;
                    }
                } catch (IOException | RuntimeException unused) {
                    if (c11950M30365 != null) {
                        c11950M30365.m27357();
                        c11950M30365.close();
                    }
                    if (this.f45925 == c11950M30365) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c11950M30365 != null) {
                        c11950M30365.m27357();
                        c11950M30365.close();
                    }
                    if (this.f45925 == c11950M30365) {
                        this.f45925 = null;
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused2) {
                c11950M30365 = null;
            } catch (Throwable th2) {
                th = th2;
                c11950M30365 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static C25139 m35991() {
        C25139 c25139 = new C25139();
        c25139.m55195("mt.hls.schema");
        c25139.m55195("mt.hls.complete");
        c25139.m55195("mt.hls.body_length");
        c25139.m55195("mt.hls.sha256");
        c25139.m55195("mt.hls.final_uri");
        c25139.m55195("mt.hls.created_at_ms");
        c25139.m55195("mt.hls.expires_at_ms");
        c25139.m55195("mt.hls.stream_type");
        C25139.m55191(c25139, -1L);
        C25139.m55192(c25139, (Uri) null);
        return c25139;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35987(InterfaceC22753 interfaceC22753) {
        Iterator it = this.f45916.iterator();
        while (it.hasNext()) {
            interfaceC22753.mo8132((InterfaceC2830) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35988(InterfaceC22753 interfaceC22753, Uri uri) {
        Map mapUnmodifiableMap;
        Uri uriMo4021 = interfaceC22753.mo4021();
        if (uriMo4021 != null) {
            uri = uriMo4021;
        }
        this.f45927 = uri;
        Map mapMo8131 = interfaceC22753.mo8131();
        if (mapMo8131.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            HashMap map = new HashMap();
            for (Map.Entry entry : mapMo8131.entrySet()) {
                map.put((String) entry.getKey(), C21562.unmodifiableList(new ArrayList((Collection) entry.getValue())));
            }
            mapUnmodifiableMap = C21562.unmodifiableMap(map);
        }
        this.f45926 = mapUnmodifiableMap;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.f45924;
        if (bArr2 != null && (i3 = this.f45921) < bArr2.length) {
            int iMin = Math.min(i2, bArr2.length - i3);
            System.arraycopy(bArr2, this.f45921, bArr, i, iMin);
            this.f45921 += iMin;
            return iMin;
        }
        InterfaceC22753 interfaceC22753 = this.f45923;
        if (interfaceC22753 == null) {
            return -1;
        }
        int i4 = interfaceC22753.read(bArr, i, i2);
        C7137 c7137 = this.f45918;
        if (c7137 != null) {
            if (i4 == -1) {
                this.f45918 = null;
                C17762 c17762 = this.f45919;
                this.f45919 = null;
                C16524 c16524 = this.f45922.f77793;
                if (c16524 != null) {
                    List listM37493 = c16524.m37493(c7137.m16415(), null);
                    if (c17762 != null) {
                        m35986(c17762, listM37493);
                        return i4;
                    }
                }
            } else if (i4 > 0) {
                c7137.m16416(i, i4, bArr);
            }
        }
        return i4;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        InterfaceC22753 interfaceC22753 = this.f45923;
        Uri uriMo4021 = interfaceC22753 == null ? null : interfaceC22753.mo4021();
        return uriMo4021 == null ? this.f45927 : uriMo4021;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        InterfaceC22753 interfaceC22753 = this.f45923;
        return interfaceC22753 == null ? this.f45926 : interfaceC22753.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        this.f45917 = true;
        C15570 c15570 = this.f45915;
        if (c15570 != null) {
            c15570.m35421();
        }
        C11950 c11950 = this.f45925;
        this.f45925 = null;
        if (c11950 != null) {
            c11950.close();
        }
        InterfaceC22753 interfaceC22753 = this.f45923;
        this.f45923 = null;
        this.f45924 = null;
        this.f45921 = 0;
        this.f45918 = null;
        this.f45919 = null;
        this.f45920 = Collections.EMPTY_LIST;
        this.f45927 = null;
        this.f45926 = Collections.EMPTY_MAP;
        if (interfaceC22753 != null) {
            interfaceC22753.close();
        }
    }
}
