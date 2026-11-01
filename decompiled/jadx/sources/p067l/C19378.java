package p067l;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩳۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D9TI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19378 extends C5880 {

    /* JADX INFO: renamed from: ۖ */
    public static boolean f57849;

    /* JADX INFO: renamed from: ۡ */
    public static int f57851;

    /* JADX INFO: renamed from: ۢ */
    public static boolean f57852;

    /* JADX INFO: renamed from: ᩷ */
    public static long f57854;

    /* JADX INFO: renamed from: ܳ */
    public final C10069 f57855;

    /* JADX INFO: renamed from: ܿ */
    public String f57856;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC5769 f57857;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC5375 f57858;

    /* JADX INFO: renamed from: ۜ */
    public static final ConnectivityManager f57850 = (ConnectivityManager) C7050.m16223("connectivity");

    /* JADX INFO: renamed from: ܺ */
    public static boolean f57853 = true;

    /* JADX INFO: renamed from: ᩳ */
    public static synchronized void m44123() {
        if (f57853) {
            f57853 = false;
            f57852 = ApplicationC21448.f67650.getBoolean("network_thumb_enable", true);
            f57849 = ApplicationC21448.f67650.getBoolean("network_thumb_only_load_on_wifi", true);
            f57851 = ApplicationC21448.f67650.getInt("network_thumb_time_limit", 10);
            f57854 = AbstractC5769.m12909(ApplicationC21448.f67650.getString("network_thumb_image_file_size_limit", "10MB"));
        }
    }

    public C19378(AbstractC5375 abstractC5375) {
        this.f57858 = abstractC5375;
        this.f57855 = new C10069(abstractC5375);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m44121() {
        f57853 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m44119() {
        AbstractC5769 abstractC5769 = this.f57858.f12758;
        if (abstractC5769.f14162) {
            return f57852;
        }
        return abstractC5769.f14158;
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C21265 mo13204(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.mo39135()) {
            if (C20450.m46137(interfaceC19370.getSize(), interfaceC19370.getPath())) {
                EnumC22462 enumC22462M46133 = C20450.m46133(C20450.m46127("network:" + m44122(interfaceC19370), interfaceC19370, interfaceC19370.getTime()));
                if (enumC22462M46133 == EnumC22462.NOT_MPEG_TS) {
                    interfaceC19370.mo39131((InterfaceC0923) null);
                } else {
                    if (enumC22462M46133 != EnumC22462.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (enumC22462M46133 == EnumC22462.MPEG_TS) {
                            interfaceC19370.mo39131(new C9792());
                        }
                        return C21265.f66828;
                    }
                    interfaceC19370.mo39131(new C9792());
                    return C21265.f66824;
                }
            }
        }
        return C5463.m12008(interfaceC19370);
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ۧ */
    public final int mo11393(InterfaceC19370 interfaceC19370) {
        long j;
        long j2;
        m44123();
        if (m44119() && interfaceC19370.mo39135()) {
            if (C20450.m46139(interfaceC19370.getPath())) {
                if (!C20450.m46137(interfaceC19370.getSize(), interfaceC19370.getPath()) || Build.VERSION.SDK_INT < 23) {
                    interfaceC19370.mo39140(0);
                    return 0;
                }
                EnumC22462 enumC22462M46133 = C20450.m46133(C20450.m46127("network:" + m44122(interfaceC19370), interfaceC19370, interfaceC19370.getTime()));
                if (enumC22462M46133 == EnumC22462.NOT_MPEG_TS) {
                    interfaceC19370.mo39131((InterfaceC0923) null);
                    interfaceC19370.mo39140(0);
                    return 0;
                }
                if (enumC22462M46133 != EnumC22462.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (enumC22462M46133 != EnumC22462.MPEG_TS) {
                        return 12;
                    }
                    interfaceC19370.mo39131(new C9792());
                    return 12;
                }
                interfaceC19370.mo39131(new C9792());
                interfaceC19370.mo39140(0);
                return 0;
            }
            String strMo39137 = interfaceC19370.mo39137();
            boolean zEquals = strMo39137.equals("image/svg+xml");
            AbstractC5375 abstractC5375 = this.f57858;
            if (zEquals) {
                long size = interfaceC19370.getSize();
                AbstractC5769 abstractC5769 = abstractC5375.f12758;
                if (abstractC5769.f14162) {
                    j2 = f57854;
                } else {
                    j2 = abstractC5769.f14152;
                }
                if (size < j2) {
                    return 2;
                }
            }
            if (strMo39137.startsWith("image/")) {
                long size2 = interfaceC19370.getSize();
                AbstractC5769 abstractC57610 = abstractC5375.f12758;
                if (abstractC57610.f14162) {
                    j = f57854;
                } else {
                    j = abstractC57610.f14152;
                }
                if (size2 < j) {
                    return 1;
                }
            }
            String name = interfaceC19370.getName();
            int i = C11358.f31647;
            if (C11931.m27266(name)) {
                return 4;
            }
            if (Build.VERSION.SDK_INT >= 23 && strMo39137.startsWith("video/")) {
                return 4;
            }
        }
        return 0;
    }

    @Override // p067l.C5880
    /* JADX INFO: renamed from: ֫ */
    public final String mo11391(InterfaceC19370 interfaceC19370, int i) {
        m44123();
        if (m44119()) {
            return m44120(interfaceC19370);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private C13596 m44118(String str, C21265 c21265, C21265 c21266, InterfaceC6782 interfaceC6782) {
        boolean z;
        int i;
        m44123();
        if (!m44119()) {
            return c21266.f66886;
        }
        if (C5880.m13199(str)) {
            return c21265.f66886;
        }
        if (C5880.m13200(str)) {
            return c21266.f66886;
        }
        ConnectivityManager connectivityManager = f57850;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            AbstractC5375 abstractC5375 = this.f57858;
            AbstractC5769 abstractC5769 = abstractC5375.f12758;
            if (abstractC5769.f14162) {
                z = f57849;
            } else {
                z = abstractC5769.f14157;
            }
            if (!z || (activeNetworkInfo.getType() & 9) != 0) {
                try {
                    AbstractC5769 abstractC57610 = abstractC5375.f12758;
                    if (abstractC57610.f14162) {
                        i = f57851;
                    } else {
                        i = abstractC57610.f14156;
                    }
                    C13596 c13596M30924 = C13596.m30924(C14828.m33865(str, interfaceC6782, i));
                    if (c13596M30924 != null) {
                        return c13596M30924;
                    }
                    C13596 c13596 = c21265.f66886;
                    C5880.m13202(str);
                    return c13596;
                } catch (TimeoutException unused) {
                    C5880.m13201(str);
                    return c21266.f66886;
                }
            }
        }
        Bitmap bitmapM33864 = C14828.m33864(str);
        if (bitmapM33864 != null) {
            return C13596.m30924(bitmapM33864);
        }
        return c21266.f66886;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m44115(C19378 c19378, InterfaceC19370 interfaceC19370) {
        return C18950.m43045(new C8451(new C15826(new C21144(c19378.f57858, interfaceC19370), interfaceC19370.getName(), interfaceC19370.getSize())));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m44116(C19378 c19378, InterfaceC19370 interfaceC19370, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C8451 c8451 = new C8451(new C15826(new C21144(c19378.f57858, interfaceC19370), interfaceC19370.getName(), interfaceC19370.getSize()));
        boolean z = false;
        try {
            try {
                if (((EnumC22462) atomicReference.get()) == null) {
                    EnumC22462 enumC22462M46131 = C20450.m46131(c8451);
                    atomicReference.set(enumC22462M46131);
                    C20450.m46136(C20450.m46127("network:" + c19378.m44122(interfaceC19370), interfaceC19370, interfaceC19370.getTime()), enumC22462M46131);
                    if (enumC22462M46131 == EnumC22462.NOT_MPEG_TS) {
                        C2700.m4192(c8451);
                        return null;
                    }
                }
                interfaceC19370.mo39131(new C9792());
                z = true;
                try {
                    C11733 c11733M43042 = C18950.m43042(c8451);
                    atomicReference2.set(c11733M43042);
                    return c11733M43042.m26938();
                } catch (IOException unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (!z) {
                    C2700.m4192(c8451);
                }
                throw th;
            }
        } catch (IOException unused2) {
            C2700.m4192(c8451);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private String m44120(InterfaceC19370 interfaceC19370) {
        return C16111.m36664(this.f57858.mo11732() + interfaceC19370.getPath() + interfaceC19370.getSize() + interfaceC19370.getTime()).toLowerCase();
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C13596 mo11392(AbstractC18422 abstractC18422, final InterfaceC19370 interfaceC19370, int i) {
        String strM44120;
        C13596 c13596M30924;
        C21265 c21265M12008;
        if (i == 12) {
            MessageDigest messageDigestM36668 = C16111.m36668();
            C16111.m36662(messageDigestM36668, m44122(interfaceC19370));
            strM44120 = C16111.m36665(messageDigestM36668.digest());
        } else {
            strM44120 = m44120(interfaceC19370);
        }
        if (i == 12) {
            strM44120 = C20450.m46127(strM44120, interfaceC19370, interfaceC19370.getTime());
        }
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                AbstractC5375 abstractC5375 = this.f57858;
                ConnectivityManager connectivityManager = f57850;
                if (i == 4) {
                    String name = interfaceC19370.getName();
                    int i3 = C11358.f31647;
                    if (C11931.m27266(name)) {
                        m44123();
                        C21265 c21265Mo13204 = mo13204(interfaceC19370);
                        if (!m44119() || C5880.m13200(strM44120)) {
                            return c21265Mo13204.f66886;
                        }
                        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            AbstractC5769 abstractC5769 = abstractC5375.f12758;
                            if (!(abstractC5769.f14162 ? f57849 : abstractC5769.f14157) || (activeNetworkInfo.getType() & 9) != 0) {
                                AbstractC5769 abstractC57610 = abstractC5375.f12758;
                                C24768 c24768M26315 = C11358.m26315(abstractC5375, interfaceC19370, abstractC57610.f14162 ? f57851 : abstractC57610.f14156);
                                if (c24768M26315.m54440() == EnumC8675.SUCCESS && (c13596M30924 = C13596.m30924(c24768M26315.m54439())) != null) {
                                    return c13596M30924;
                                }
                                if (c24768M26315.m54440() == EnumC8675.TIMEOUT) {
                                    C5880.m13201(strM44120);
                                } else if (c24768M26315.m54440() == EnumC8675.CORRUPT) {
                                    return C21265.f66824.f66886;
                                }
                                return c21265Mo13204.f66886;
                            }
                        }
                        return c21265Mo13204.f66886;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        C21265 c21265 = C21265.f66828;
                        return m44118(strM44120, c21265, c21265, new C10712(i2, this, interfaceC19370));
                    }
                } else if (i == 12 && Build.VERSION.SDK_INT >= 23) {
                    C13596 c13596M30925 = C13596.m30924(C14828.m33864(strM44120));
                    if (c13596M30925 != null) {
                        C20450.m46136(C20450.m46127("network:" + m44122(interfaceC19370), interfaceC19370, interfaceC19370.getTime()), EnumC22462.MPEG_TS);
                        interfaceC19370.mo39131(new C9792());
                        return c13596M30925;
                    }
                    EnumC22462 enumC22462M46133 = C20450.m46133(C20450.m46127("network:" + m44122(interfaceC19370), interfaceC19370, interfaceC19370.getTime()));
                    EnumC22462 enumC22462 = EnumC22462.NOT_MPEG_TS;
                    if (enumC22462M46133 == enumC22462) {
                        interfaceC19370.mo39131((InterfaceC0923) null);
                        return C5463.m12008(interfaceC19370).f66886;
                    }
                    EnumC22462 enumC22463 = EnumC22462.MPEG_TS_WITHOUT_THUMBNAIL;
                    if (enumC22462M46133 == enumC22463) {
                        interfaceC19370.mo39131(new C9792());
                        return C21265.f66824.f66886;
                    }
                    if (C5880.m13200(strM44120)) {
                        return C21265.f66824.f66886;
                    }
                    NetworkInfo activeNetworkInfo2 = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (m44119() && activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
                        AbstractC5769 abstractC57611 = abstractC5375.f12758;
                        if (!(abstractC57611.f14162 ? f57849 : abstractC57611.f14157) || (activeNetworkInfo2.getType() & 9) != 0) {
                            AtomicReference atomicReference = new AtomicReference(enumC22462M46133);
                            AtomicReference atomicReference2 = new AtomicReference();
                            try {
                                C23886 c23886 = new C23886(this, interfaceC19370, atomicReference, atomicReference2);
                                AbstractC5769 abstractC57612 = abstractC5375.f12758;
                                Bitmap bitmapM33865 = C14828.m33865(strM44120, c23886, abstractC57612.f14162 ? f57851 : abstractC57612.f14156);
                                EnumC22462 enumC22464 = (EnumC22462) atomicReference.get();
                                if (bitmapM33865 != null) {
                                    C20450.m46136(C20450.m46127("network:" + m44122(interfaceC19370), interfaceC19370, interfaceC19370.getTime()), EnumC22462.MPEG_TS);
                                    interfaceC19370.mo39131(new C9792());
                                    C13596 c13596M30926 = C13596.m30924(bitmapM33865);
                                    return c13596M30926 != null ? c13596M30926 : C21265.f66824.f66886;
                                }
                                if (enumC22464 == enumC22462) {
                                    interfaceC19370.mo39131((InterfaceC0923) null);
                                    return C5463.m12008(interfaceC19370).f66886;
                                }
                                if (enumC22464 == EnumC22462.MPEG_TS) {
                                    interfaceC19370.mo39131(new C9792());
                                }
                                C11733 c11733 = (C11733) atomicReference2.get();
                                if (c11733 != null && c11733.m26939()) {
                                    C20450.m46136(C20450.m46127("network:" + m44122(interfaceC19370), interfaceC19370, interfaceC19370.getTime()), enumC22463);
                                }
                                return C21265.f66824.f66886;
                            } catch (TimeoutException unused) {
                                EnumC22462 enumC22465 = (EnumC22462) atomicReference.get();
                                if (enumC22465 == EnumC22462.NOT_MPEG_TS) {
                                    interfaceC19370.mo39131((InterfaceC0923) null);
                                    c21265M12008 = C5463.m12008(interfaceC19370);
                                } else {
                                    if (enumC22465 == EnumC22462.MPEG_TS) {
                                        interfaceC19370.mo39131(new C9792());
                                    }
                                    C5880.m13201(strM44120);
                                    c21265M12008 = C21265.f66824;
                                }
                                return c21265M12008.f66886;
                            }
                        }
                    }
                    return C21265.f66824.f66886;
                }
                throw new RuntimeException();
            }
        }
        C21265 c21266 = C21265.f66823;
        return m44118(strM44120, c21266, c21266, new InterfaceC6782() { // from class: l.֫ۜ᩻
            @Override // p067l.InterfaceC6782
            /* JADX INFO: renamed from: ֫ */
            public final Bitmap mo7890() {
                C19378 c19378 = this.f8619;
                InterfaceC19370 interfaceC19371 = interfaceC19370;
                AbstractC17043 abstractC17043M38685 = C17853.f53278.m38685();
                ArrayList arrayList = new ArrayList();
                try {
                    return C18950.m43040(new C18036(c19378, arrayList, interfaceC19371, abstractC17043M38685));
                } finally {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C2700.m4192((InputStream) it.next());
                    }
                    abstractC17043M38685.mo25503();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ */
    private String m44122(InterfaceC19370 interfaceC19370) {
        String str;
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            AbstractC5769 abstractC5769 = this.f57858.f12758;
            if (this.f57856 == null || !abstractC5769.equals(this.f57857)) {
                AbstractC5769 abstractC5769Clone = abstractC5769.clone();
                MessageDigest messageDigestM36668 = C16111.m36668();
                messageDigestM36668.update(C0168b.f616k.getBytes());
                C16111.m36662(messageDigestM36668, abstractC5769Clone.mo8542().toString());
                String strM36665 = C16111.m36665(messageDigestM36668.digest());
                this.f57856 = strM36665;
                this.f57857 = abstractC5769Clone;
                str = strM36665;
            } else {
                str = this.f57856;
            }
        }
        sb.append(str);
        sb.append((char) 0);
        sb.append(interfaceC19370.getPath());
        sb.append((char) 0);
        sb.append(interfaceC19370.getSize());
        sb.append((char) 0);
        sb.append(interfaceC19370.getTime());
        return sb.toString();
    }
}
