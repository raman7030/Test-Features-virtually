package l;

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
public final class C14189 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13891 f42828;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile boolean f42830;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C5018 f42831;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16197 f42832;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f42834;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23362 f42835;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f42836;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f42837;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10082 f42838;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Uri f42840;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42829 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Map f42839 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f42833 = Collections.EMPTY_LIST;

    public C14189(C23362 c23362) {
        this.f42835 = c23362;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f42829;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
        InterfaceC21449 interfaceC21449 = this.f42836;
        if (interfaceC21449 != null) {
            interfaceC21449.mo5937(interfaceC0486);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws Throwable {
        long length;
        String str;
        String strM46315;
        C0078 c0078;
        if (this.f42836 != null || this.f42837 != null) {
            throw new IOException("Data source is already open");
        }
        this.f42830 = false;
        this.f42840 = c3104.f9711;
        this.f42839 = Collections.EMPTY_MAP;
        if (c3104.f9718 != 0 || c3104.f9713 != -1) {
            return m33858(c3104);
        }
        C14895 c14895 = this.f42835.f75047;
        if (this.f42835.f75045 == EnumC16306.f50168 && c14895 != null) {
            EnumC7840 enumC7840M35347 = c14895.m35347();
            EnumC7840 enumC7840 = EnumC7840.LIVE;
            if (enumC7840M35347 == enumC7840) {
                return m33858(c3104);
            }
            if (enumC7840M35347 == EnumC7840.UNKNOWN) {
                C16197 c16197M52288 = this.f42835.f75044.m52288();
                if (c16197M52288 != null) {
                    String strMo10986 = this.f42835.f75048.mo10986(c3104);
                    if (this.f42835.f75045.mo5160(strMo10986)) {
                        strM46315 = C20094.m46315("hls-playlist:", strMo10986);
                        str = strMo10986;
                    } else {
                        str = null;
                        strM46315 = null;
                    }
                } else {
                    str = null;
                    strM46315 = null;
                }
                if (c16197M52288 != null && str != null && strM46315 != null) {
                    C10082 c10082M28321 = this.f42835.f75050.m28321(str);
                    this.f42838 = c10082M28321;
                    try {
                        c10082M28321.m25335();
                        C7259 c7259M33851 = m33851(c16197M52288, strM46315, c3104, true);
                        c10082M28321.m25337();
                        c10082M28321.close();
                        if (this.f42838 == c10082M28321) {
                            this.f42838 = null;
                        }
                        if (c7259M33851 != null) {
                            if (!c14895.m35343()) {
                                return m33858(c3104);
                            }
                            this.f42837 = c7259M33851.f22273;
                            this.f42840 = c7259M33851.f22274;
                            this.f42834 = 0;
                            m33854(c16197M52288, c14895.m35346());
                            return c7259M33851.f22273.length;
                        }
                        if (c14895.m35347() == enumC7840) {
                            return m33858(c3104);
                        }
                    } catch (Throwable th) {
                        c10082M28321.close();
                        if (this.f42838 == c10082M28321) {
                            this.f42838 = null;
                        }
                        throw th;
                    }
                }
                InterfaceC21449 interfaceC21449Mo6247 = this.f42835.f75046.mo6247();
                this.f42836 = interfaceC21449Mo6247;
                m33855(interfaceC21449Mo6247);
                C5018 c5018 = new C5018();
                try {
                    long jMo1620 = interfaceC21449Mo6247.mo1620(c3104);
                    m33856(interfaceC21449Mo6247, c3104.f9711);
                    if (jMo1620 > 2097152) {
                        this.f42831 = c5018;
                        this.f42832 = c16197M52288;
                        return jMo1620;
                    }
                    int i = 2097153;
                    byte[] bArrCopyOf = new byte[Math.min(8192, 2097153)];
                    int i2 = 0;
                    while (!this.f42830 && !Thread.currentThread().isInterrupted()) {
                        if (i2 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, Math.min(i, bArrCopyOf.length * 2));
                        }
                        int i3 = interfaceC21449Mo6247.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                        if (i3 == -1) {
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i2);
                            m33856(interfaceC21449Mo6247, c3104.f9711);
                            this.f42836 = null;
                            C8751.m22643(interfaceC21449Mo6247);
                            this.f42837 = bArrCopyOf2;
                            this.f42834 = 0;
                            if (c16197M52288 == null || str == null || strM46315 == null || bArrCopyOf2.length <= 0) {
                                c0078 = null;
                            } else {
                                Uri uri = this.f42840;
                                if (uri == null) {
                                    uri = c3104.f9711;
                                }
                                c0078 = new C0078(str, strM46315, bArrCopyOf2, uri, c3104);
                            }
                            List listM35341 = c14895.m35341(c5018.m14511(), c0078);
                            if (c16197M52288 != null) {
                                m33854(c16197M52288, listM35341);
                            }
                            return bArrCopyOf2.length;
                        }
                        if (i3 == 0) {
                            throw new IOException("HLS playlist upstream returned no data");
                        }
                        c5018.m14512(i2, i3, bArrCopyOf);
                        i2 += i3;
                        if (i2 > 2097152) {
                            this.f42837 = Arrays.copyOf(bArrCopyOf, i2);
                            this.f42834 = 0;
                            this.f42831 = c5018;
                            this.f42832 = c16197M52288;
                            return jMo1620;
                        }
                        i = 2097153;
                    }
                    throw new InterruptedIOException("Interrupted while loading HLS playlist");
                } catch (IOException e) {
                    e = e;
                    m33856(interfaceC21449Mo6247, c3104.f9711);
                    InterfaceC21449 interfaceC21449 = this.f42836;
                    this.f42836 = null;
                    C8751.m22643(interfaceC21449);
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    m33856(interfaceC21449Mo6247, c3104.f9711);
                    InterfaceC21449 interfaceC214410 = this.f42836;
                    this.f42836 = null;
                    C8751.m22643(interfaceC214410);
                    throw e;
                }
            }
        }
        C16197 c16197M52289 = this.f42835.f75044.m52288();
        if (c16197M52289 == null) {
            return m33858(c3104);
        }
        String strMo10987 = this.f42835.f75048.mo10986(c3104);
        if (!this.f42835.f75045.mo5160(strMo10987)) {
            return m33858(c3104);
        }
        String strM46316 = C20094.m46315("hls-playlist:", strMo10987);
        C10082 c10082M28322 = this.f42835.f75050.m28321(strMo10987);
        this.f42838 = c10082M28322;
        try {
            try {
                c10082M28322.m25335();
                do {
                    C7259 c7259M33852 = m33851(c16197M52289, strM46316, c3104, true);
                    if (c7259M33852 != null) {
                        c10082M28322.m25337();
                        C14895 c14896 = this.f42835.f75047;
                        if (c14896 != null) {
                            this.f42833 = c14896.m35346();
                        }
                        this.f42837 = c7259M33852.f22273;
                        this.f42840 = c7259M33852.f22274;
                        this.f42834 = 0;
                        length = c7259M33852.f22273.length;
                    }
                    c10082M28322.m25338();
                    c10082M28322.close();
                    this.f42838 = null;
                    List list = this.f42833;
                    this.f42833 = Collections.EMPTY_LIST;
                    m33854(c16197M52289, list);
                    return length;
                } while (!c10082M28322.m25336());
                length = m33850(c3104, c16197M52289, strM46316, m33857(c16197M52289, strM46316), c10082M28322);
                c10082M28322.m25338();
                c10082M28322.close();
                this.f42838 = null;
                List list2 = this.f42833;
                this.f42833 = Collections.EMPTY_LIST;
                m33854(c16197M52289, list2);
                return length;
            } catch (Throwable th2) {
                c10082M28322.m25338();
                c10082M28322.close();
                this.f42838 = null;
                List list3 = this.f42833;
                this.f42833 = Collections.EMPTY_LIST;
                m33854(c16197M52289, list3);
                throw th2;
            }
        } catch (IOException | RuntimeException e3) {
            InterfaceC21449 interfaceC214411 = this.f42836;
            this.f42836 = null;
            C8751.m22643(interfaceC214411);
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private long m33858(C3104 c3104) {
        InterfaceC21449 interfaceC21449Mo6247 = this.f42835.f75046.mo6247();
        this.f42836 = interfaceC21449Mo6247;
        m33855(interfaceC21449Mo6247);
        try {
            long jMo1620 = interfaceC21449Mo6247.mo1620(c3104);
            m33856(interfaceC21449Mo6247, c3104.f9711);
            return jMo1620;
        } catch (IOException | RuntimeException e) {
            m33856(interfaceC21449Mo6247, c3104.f9711);
            InterfaceC21449 interfaceC21449 = this.f42836;
            this.f42836 = null;
            C8751.m22643(interfaceC21449);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33850(C3104 c3104, C16197 c16197, String str, boolean z, C10082 c10082) {
        C23362 c23362 = this.f42835;
        InterfaceC21449 interfaceC21449Mo6247 = c23362.f75046.mo6247();
        this.f42836 = interfaceC21449Mo6247;
        m33855(interfaceC21449Mo6247);
        C14895 c14895 = c23362.f75047;
        InterfaceC21449 interfaceC21449 = null;
        C5018 c5018 = c14895 == null ? null : new C5018();
        try {
            c10082.m25339();
            long jMo1620 = interfaceC21449Mo6247.mo1620(c3104);
            Uri uri = c3104.f9711;
            m33856(interfaceC21449Mo6247, uri);
            if (jMo1620 <= 2097152) {
                int i = 2097153;
                byte[] bArrCopyOf = new byte[Math.min(8192, 2097153)];
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    c10082.m25339();
                    if (i2 == bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, Math.min(i, bArrCopyOf.length * 2));
                    }
                    int i3 = interfaceC21449Mo6247.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                    if (i3 == -1) {
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i2);
                        m33856(interfaceC21449Mo6247, uri);
                        this.f42836 = interfaceC21449;
                        C8751.m22643(interfaceC21449Mo6247);
                        this.f42837 = bArrCopyOf2;
                        this.f42834 = 0;
                        boolean z3 = z && bArrCopyOf2.length > 0;
                        if (c14895 != null) {
                            String strMo10986 = c23362.f75048.mo10986(c3104);
                            Uri uri2 = this.f42840;
                            C0078 c0078 = new C0078(strMo10986, str, bArrCopyOf2, uri2 == null ? uri : uri2, c3104);
                            List<C0078> listM35341 = c14895.m35341(c5018.m14511(), c0078);
                            ArrayList arrayList = new ArrayList();
                            for (C0078 c0079 : listM35341) {
                                if (c0079 == c0078) {
                                    z2 = z;
                                } else {
                                    arrayList.add(c0079);
                                }
                            }
                            this.f42833 = arrayList;
                            z3 = z2;
                        }
                        if (z3) {
                            Uri uri3 = this.f42840;
                            m33853(c16197, str, bArrCopyOf2, uri3 == null ? uri : uri3, c10082);
                        }
                        return bArrCopyOf2.length;
                    }
                    if (i3 == 0) {
                        throw new IOException("HLS playlist upstream returned no data");
                    }
                    if (c5018 != null) {
                        c5018.m14512(i2, i3, bArrCopyOf);
                    }
                    i2 += i3;
                    if (i2 > 2097152) {
                        this.f42837 = Arrays.copyOf(bArrCopyOf, i2);
                        this.f42834 = 0;
                        if (c5018 == null) {
                            break;
                        }
                        this.f42831 = c5018;
                        this.f42832 = c16197;
                        break;
                    }
                    i = 2097153;
                    interfaceC21449 = null;
                }
            } else if (c5018 != null) {
                this.f42831 = c5018;
                this.f42832 = c16197;
                return jMo1620;
            }
            return jMo1620;
        } catch (IOException | RuntimeException e) {
            m33856(interfaceC21449Mo6247, c3104.f9711);
            InterfaceC21449 interfaceC214410 = this.f42836;
            this.f42836 = null;
            C8751.m22643(interfaceC214410);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7259 m33851(C16197 c16197, String str, C3104 c3104, boolean z) {
        try {
            C13608 c13608M33852 = m33852(c16197.mo38139(str));
            if (c13608M33852 != null && c16197.m38148(str, 0L, c13608M33852.f40600)) {
                C3309 c3309 = new C3309();
                c3309.m10114(c16197);
                c3309.m10113((InterfaceC15097) null);
                c3309.m10115((C20243) null);
                c3309.m10112(new C17718(str));
                int i = 0;
                c3309.m10111(0);
                c3309.m10116();
                C13186 c13186Mo6247 = c3309.mo6247();
                if (z) {
                    m33855(c13186Mo6247);
                }
                int i2 = (int) c13608M33852.f40600;
                byte[] bArr = new byte[i2];
                try {
                    C4515 c4515M9467 = c3104.m9467();
                    c4515M9467.m13282(str);
                    c4515M9467.m13280(c13608M33852.f40600);
                    c13186Mo6247.mo1620(c4515M9467.m13278());
                    while (i < i2) {
                        int i3 = c13186Mo6247.read(bArr, i, i2 - i);
                        if (i3 == -1 || i3 == 0) {
                            C8751.m22643(c13186Mo6247);
                            return null;
                        }
                        i += i3;
                    }
                    C8751.m22643(c13186Mo6247);
                    if (c13608M33852.f40602.equals(C14460.m34531(C14460.m34534().digest(bArr)))) {
                        return new C7259(c13608M33852.f40601, bArr);
                    }
                } catch (Throwable th) {
                    C8751.m22643(c13186Mo6247);
                    throw th;
                }
            }
        } catch (IOException | RuntimeException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13608 m33852(C7026 c7026) {
        long jM18993 = c7026.m18993(Long.MIN_VALUE, "mt.hls.schema");
        C23362 c23362 = this.f42835;
        if (jM18993 != c23362.f75045.mo5158() || c7026.m18993(Long.MIN_VALUE, "mt.hls.complete") != 1) {
            return null;
        }
        long jM18994 = c7026.m18993(Long.MIN_VALUE, "mt.hls.body_length");
        String strM18997 = c7026.m18997("mt.hls.sha256");
        String strM18998 = c7026.m18997("mt.hls.final_uri");
        if (jM18994 <= 0 || jM18994 > 2097152 || strM18997 == null || strM18998 == null) {
            return null;
        }
        Uri uri = Uri.parse(strM18998);
        if (!c23362.f75045.mo5159(uri)) {
            return null;
        }
        boolean zM18996 = c7026.m18996("mt.hls.created_at_ms");
        boolean zM18997 = c7026.m18996("mt.hls.expires_at_ms");
        String strM18999 = c7026.m18997("mt.hls.stream_type");
        if (c23362.f75045 == EnumC16306.f50168) {
            if (!zM18996 || !zM18997 || !"vod".equals(strM18999)) {
                return null;
            }
            long jM18995 = c7026.m18993(Long.MIN_VALUE, "mt.hls.created_at_ms");
            long jM18996 = c7026.m18993(Long.MIN_VALUE, "mt.hls.expires_at_ms");
            long asLong = c23362.f75049.getAsLong();
            if (jM18995 < 0 || jM18996 <= jM18995 || asLong < jM18995 || asLong >= jM18996) {
                return null;
            }
        } else if (zM18996 || zM18997 || strM18999 != null) {
            return null;
        }
        return new C13608(jM18994, uri, strM18997);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33857(C16197 c16197, String str) {
        try {
            c16197.mo38142(str, m33859());
            if (c16197.mo38139(str).m18996("mt.hls.complete")) {
                return false;
            }
            c16197.m38150(str);
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33853(C16197 c16197, String str, final byte[] bArr, Uri uri, C10082 c10082) {
        C16197 c16198;
        String str2;
        long j;
        long j2;
        long jM35345;
        long j3;
        try {
            EnumC16306 enumC16306 = this.f42835.f75045;
            EnumC16306 enumC16307 = EnumC16306.f50168;
            c16198 = null;
            str2 = 0;
            if (enumC16306 == enumC16307) {
                long asLong = this.f42835.f75049.getAsLong();
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
            C14895 c14895 = this.f42835.f75047;
            try {
                if (c14895 == null) {
                    jM35345 = -1;
                } else {
                    jM35345 = c14895.m35345();
                    if (jM35345 < 0) {
                        throw new IOException("HLS playlist cache was disabled for this stream");
                    }
                }
                c10082.m25339();
                C20243 c20243 = new C20243();
                c20243.m46488(c16197);
                C3309 c3309 = new C3309();
                c3309.m10114(c16197);
                c3309.m10113(new InterfaceC15097() { // from class: l.ܿ֨ۜ
                    @Override // l.InterfaceC15097
                    /* JADX INFO: renamed from: ֫ */
                    public final InterfaceC21449 mo6247() {
                        return new C18627(bArr);
                    }
                });
                c3309.m10115(c20243);
                c3309.m10112(new C17718(str));
                c3309.m10111(0);
                c3309.m10116();
                C13186 c13186Mo6247 = c3309.mo6247();
                C4515 c4515 = new C4515();
                c4515.m13281(C23362.f75043);
                c4515.m13282(str);
                c4515.m13280(bArr.length);
                C13891 c13891 = new C13891(c13186Mo6247, c4515.m13278());
                this.f42828 = c13891;
                try {
                    c13891.m33301();
                    this.f42828 = null;
                    c10082.m25339();
                    long j4 = jM35345;
                    try {
                        if (!c16197.m38148(str, 0L, bArr.length)) {
                            throw new IOException("HLS playlist cache write was incomplete");
                        }
                        C14895 c14896 = this.f42835.f75047;
                        if (c14896 != null && !c14896.m35344(j4)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        C23959 c23959 = new C23959();
                        c23959.m52788(this.f42835.f75045.mo5158(), "mt.hls.schema");
                        c23959.m52788(1L, "mt.hls.complete");
                        c23959.m52788(bArr.length, "mt.hls.body_length");
                        c23959.m52790("mt.hls.sha256", C14460.m34531(C14460.m34534().digest(bArr)));
                        c23959.m52790("mt.hls.final_uri", uri.toString());
                        if (this.f42835.f75045 == enumC16307) {
                            c23959.m52788(j, "mt.hls.created_at_ms");
                            c23959.m52788(j2, "mt.hls.expires_at_ms");
                            c23959.m52790("mt.hls.stream_type", "vod");
                        } else {
                            c23959.m52789("mt.hls.created_at_ms");
                            c23959.m52789("mt.hls.expires_at_ms");
                            c23959.m52789("mt.hls.stream_type");
                        }
                        C14895 c14897 = this.f42835.f75047;
                        if (c14897 == null) {
                            j3 = j4;
                            c16197.mo38142(str, c23959);
                        } else {
                            j3 = j4;
                            synchronized (c14897) {
                                if (!c14897.m35344(j3)) {
                                    throw new IOException("HLS playlist cache state changed before publishing");
                                }
                                c16197.mo38142(str, c23959);
                            }
                        }
                        C14895 c14898 = this.f42835.f75047;
                        if (c14898 != null && !c14898.m35344(j3)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        if (m33852(c16197.mo38139(str)) == null) {
                            throw new IOException("HLS playlist cache metadata was not published");
                        }
                    } catch (IOException | RuntimeException unused) {
                        c16198 = c16197;
                        str2 = str;
                        try {
                            c16198.mo38142(str2, m33859());
                        } catch (IOException | RuntimeException unused2) {
                        }
                        try {
                            c16197.m38150(str);
                        } catch (RuntimeException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    this.f42828 = null;
                    throw th;
                }
            } catch (IOException | RuntimeException unused4) {
            }
        } catch (IOException | RuntimeException unused5) {
            c16198 = c16197;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33854(C16197 c16197, List list) throws Throwable {
        C10082 c10082M28321;
        C14895 c14895 = this.f42835.f75047;
        if (c14895 == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0078 c0078 = (C0078) it.next();
            if (this.f42830 || c14895.m35347() != EnumC7840.VOD) {
                return;
            }
            try {
                c10082M28321 = this.f42835.f75050.m28321(c0078.m1036());
                try {
                    this.f42838 = c10082M28321;
                    c10082M28321.m25335();
                    while (true) {
                        C7259 c7259M33851 = m33851(c16197, c0078.m1037(), c0078.m1034(), false);
                        if (c7259M33851 != null && Arrays.equals(c7259M33851.m19427(), c0078.m1033()) && c7259M33851.m19428().equals(c0078.m1035())) {
                            c10082M28321.m25337();
                            break;
                        } else if (c10082M28321.m25336()) {
                            if (!m33857(c16197, c0078.m1037()) || c14895.m35347() != EnumC7840.VOD) {
                                break;
                                break;
                            } else {
                                m33853(c16197, c0078.m1037(), c0078.m1033(), c0078.m1035(), c10082M28321);
                                break;
                            }
                        }
                    }
                    c10082M28321.m25338();
                    c10082M28321.close();
                    if (this.f42838 == c10082M28321) {
                        this.f42838 = null;
                    }
                } catch (IOException | RuntimeException unused) {
                    if (c10082M28321 != null) {
                        c10082M28321.m25338();
                        c10082M28321.close();
                    }
                    if (this.f42838 == c10082M28321) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c10082M28321 != null) {
                        c10082M28321.m25338();
                        c10082M28321.close();
                    }
                    if (this.f42838 == c10082M28321) {
                        this.f42838 = null;
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused2) {
                c10082M28321 = null;
            } catch (Throwable th2) {
                th = th2;
                c10082M28321 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C23959 m33859() {
        C23959 c23959 = new C23959();
        c23959.m52789("mt.hls.schema");
        c23959.m52789("mt.hls.complete");
        c23959.m52789("mt.hls.body_length");
        c23959.m52789("mt.hls.sha256");
        c23959.m52789("mt.hls.final_uri");
        c23959.m52789("mt.hls.created_at_ms");
        c23959.m52789("mt.hls.expires_at_ms");
        c23959.m52789("mt.hls.stream_type");
        C23959.m52785(c23959, -1L);
        C23959.m52786(c23959, (Uri) null);
        return c23959;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33855(InterfaceC21449 interfaceC21449) {
        Iterator it = this.f42829.iterator();
        while (it.hasNext()) {
            interfaceC21449.mo5937((InterfaceC0486) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33856(InterfaceC21449 interfaceC21449, Uri uri) {
        Map mapUnmodifiableMap;
        Uri uriMo1621 = interfaceC21449.mo1621();
        if (uriMo1621 != null) {
            uri = uriMo1621;
        }
        this.f42840 = uri;
        Map mapMo5936 = interfaceC21449.mo5936();
        if (mapMo5936.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            HashMap map = new HashMap();
            for (Map.Entry entry : mapMo5936.entrySet()) {
                map.put((String) entry.getKey(), C20195.unmodifiableList(new ArrayList((Collection) entry.getValue())));
            }
            mapUnmodifiableMap = C20195.unmodifiableMap(map);
        }
        this.f42839 = mapUnmodifiableMap;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.f42837;
        if (bArr2 != null && (i3 = this.f42834) < bArr2.length) {
            int iMin = Math.min(i2, bArr2.length - i3);
            System.arraycopy(bArr2, this.f42834, bArr, i, iMin);
            this.f42834 += iMin;
            return iMin;
        }
        InterfaceC21449 interfaceC21449 = this.f42836;
        if (interfaceC21449 == null) {
            return -1;
        }
        int i4 = interfaceC21449.read(bArr, i, i2);
        C5018 c5018 = this.f42831;
        if (c5018 != null) {
            if (i4 == -1) {
                this.f42831 = null;
                C16197 c16197 = this.f42832;
                this.f42832 = null;
                C14895 c14895 = this.f42835.f75047;
                if (c14895 != null) {
                    List listM35341 = c14895.m35341(c5018.m14511(), null);
                    if (c16197 != null) {
                        m33854(c16197, listM35341);
                        return i4;
                    }
                }
            } else if (i4 > 0) {
                c5018.m14512(i, i4, bArr);
            }
        }
        return i4;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f42836;
        Uri uriMo1621 = interfaceC21449 == null ? null : interfaceC21449.mo1621();
        return uriMo1621 == null ? this.f42840 : uriMo1621;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f42836;
        return interfaceC21449 == null ? this.f42839 : interfaceC21449.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f42830 = true;
        C13891 c13891 = this.f42828;
        if (c13891 != null) {
            c13891.m33302();
        }
        C10082 c10082 = this.f42838;
        this.f42838 = null;
        if (c10082 != null) {
            c10082.close();
        }
        InterfaceC21449 interfaceC21449 = this.f42836;
        this.f42836 = null;
        this.f42837 = null;
        this.f42834 = 0;
        this.f42831 = null;
        this.f42832 = null;
        this.f42833 = Collections.EMPTY_LIST;
        this.f42840 = null;
        this.f42839 = Collections.EMPTY_MAP;
        if (interfaceC21449 != null) {
            interfaceC21449.close();
        }
    }
}
