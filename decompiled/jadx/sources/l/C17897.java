package l;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.sdk.m.m.b;
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
public final class C17897 extends C3695 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f54652;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int f54654;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean f54655;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long f54657;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8102 f54658;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f54659;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC3577 f54660;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f54661;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final ConnectivityManager f54653 = (ConnectivityManager) C4925.m14326("connectivity");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f54656 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static synchronized void m41876() {
        if (f54656) {
            f54656 = false;
            f54655 = ApplicationC20075.f65010.getBoolean("network_thumb_enable", true);
            f54652 = ApplicationC20075.f65010.getBoolean("network_thumb_only_load_on_wifi", true);
            f54654 = ApplicationC20075.f65010.getInt("network_thumb_time_limit", 10);
            f54657 = AbstractC3577.m10932(ApplicationC20075.f65010.getString("network_thumb_image_file_size_limit", "10MB"));
        }
    }

    public C17897(AbstractC3163 abstractC3163) {
        this.f54661 = abstractC3163;
        this.f54658 = new C8102(abstractC3163);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m41874() {
        f54656 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m41872() {
        AbstractC3577 abstractC3577 = this.f54661.f9955;
        if (abstractC3577.f11357) {
            return f54655;
        }
        return abstractC3577.f11353;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public final C19883 mo11258(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969()) {
            if (C19025.m43869(interfaceC17889.getSize(), interfaceC17889.getPath())) {
                EnumC21142 enumC21142M43865 = C19025.m43865(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()));
                if (enumC21142M43865 == EnumC21142.NOT_MPEG_TS) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                } else {
                    if (enumC21142M43865 != EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (enumC21142M43865 == EnumC21142.MPEG_TS) {
                            interfaceC17889.mo36965(new C7810());
                        }
                        return C19883.f64192;
                    }
                    interfaceC17889.mo36965(new C7810());
                    return C19883.f64188;
                }
            }
        }
        return C3256.m9975(interfaceC17889);
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        long j;
        long j2;
        m41876();
        if (m41872() && interfaceC17889.mo36969()) {
            if (C19025.m43871(interfaceC17889.getPath())) {
                if (!C19025.m43869(interfaceC17889.getSize(), interfaceC17889.getPath()) || Build.VERSION.SDK_INT < 23) {
                    interfaceC17889.mo36974(0);
                    return 0;
                }
                EnumC21142 enumC21142M43865 = C19025.m43865(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()));
                if (enumC21142M43865 == EnumC21142.NOT_MPEG_TS) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                    interfaceC17889.mo36974(0);
                    return 0;
                }
                if (enumC21142M43865 != EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (enumC21142M43865 != EnumC21142.MPEG_TS) {
                        return 12;
                    }
                    interfaceC17889.mo36965(new C7810());
                    return 12;
                }
                interfaceC17889.mo36965(new C7810());
                interfaceC17889.mo36974(0);
                return 0;
            }
            String strMo36971 = interfaceC17889.mo36971();
            boolean zEquals = strMo36971.equals("image/svg+xml");
            AbstractC3163 abstractC3163 = this.f54661;
            if (zEquals) {
                long size = interfaceC17889.getSize();
                AbstractC3577 abstractC3577 = abstractC3163.f9955;
                if (abstractC3577.f11357) {
                    j2 = f54657;
                } else {
                    j2 = abstractC3577.f11347;
                }
                if (size < j2) {
                    return 2;
                }
            }
            if (strMo36971.startsWith("image/")) {
                long size2 = interfaceC17889.getSize();
                AbstractC3577 abstractC3578 = abstractC3163.f9955;
                if (abstractC3578.f11357) {
                    j = f54657;
                } else {
                    j = abstractC3578.f11347;
                }
                if (size2 < j) {
                    return 1;
                }
            }
            String name = interfaceC17889.getName();
            int i = C9459.f28698;
            if (C10062.m25249(name)) {
                return 4;
            }
            if (Build.VERSION.SDK_INT >= 23 && strMo36971.startsWith("video/")) {
                return 4;
            }
        }
        return 0;
    }

    @Override // l.C3695
    /* JADX INFO: renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        m41876();
        if (m41872()) {
            return m41873(interfaceC17889);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11813 m41871(String str, C19883 c19883, C19883 c19884, InterfaceC4644 interfaceC4644) {
        boolean z;
        int i;
        m41876();
        if (!m41872()) {
            return c19884.f64250;
        }
        if (C3695.m11253(str)) {
            return c19883.f64250;
        }
        if (C3695.m11254(str)) {
            return c19884.f64250;
        }
        ConnectivityManager connectivityManager = f54653;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            AbstractC3163 abstractC3163 = this.f54661;
            AbstractC3577 abstractC3577 = abstractC3163.f9955;
            if (abstractC3577.f11357) {
                z = f54652;
            } else {
                z = abstractC3577.f11352;
            }
            if (!z || (activeNetworkInfo.getType() & 9) != 0) {
                try {
                    AbstractC3577 abstractC3578 = abstractC3163.f9955;
                    if (abstractC3578.f11357) {
                        i = f54654;
                    } else {
                        i = abstractC3578.f11351;
                    }
                    C11813 c11813M28875 = C11813.m28875(C13110.m31774(str, interfaceC4644, i));
                    if (c11813M28875 != null) {
                        return c11813M28875;
                    }
                    C11813 c11813 = c19883.f64250;
                    C3695.m11256(str);
                    return c11813;
                } catch (TimeoutException unused) {
                    C3695.m11255(str);
                    return c19884.f64250;
                }
            }
        }
        Bitmap bitmapM31773 = C13110.m31773(str);
        if (bitmapM31773 != null) {
            return C11813.m28875(bitmapM31773);
        }
        return c19884.f64250;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m41868(C17897 c17897, InterfaceC17889 interfaceC17889) {
        return C17447.m40787(new C6399(new C14159(new C19755(c17897.f54661, interfaceC17889), interfaceC17889.getName(), interfaceC17889.getSize())));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m41869(C17897 c17897, InterfaceC17889 interfaceC17889, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C6399 c6399 = new C6399(new C14159(new C19755(c17897.f54661, interfaceC17889), interfaceC17889.getName(), interfaceC17889.getSize()));
        boolean z = false;
        try {
            try {
                if (((EnumC21142) atomicReference.get()) == null) {
                    EnumC21142 enumC21142M43863 = C19025.m43863(c6399);
                    atomicReference.set(enumC21142M43863);
                    C19025.m43868(C19025.m43859("network:" + c17897.m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()), enumC21142M43863);
                    if (enumC21142M43863 == EnumC21142.NOT_MPEG_TS) {
                        C0349.m1793(c6399);
                        return null;
                    }
                }
                interfaceC17889.mo36965(new C7810());
                z = true;
                try {
                    C9853 c9853M40784 = C17447.m40784(c6399);
                    atomicReference2.set(c9853M40784);
                    return c9853M40784.m24923();
                } catch (IOException unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (!z) {
                    C0349.m1793(c6399);
                }
                throw th;
            }
        } catch (IOException unused2) {
            C0349.m1793(c6399);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private String m41873(InterfaceC17889 interfaceC17889) {
        return C14460.m34530(this.f54661.mo9688() + interfaceC17889.getPath() + interfaceC17889.getSize() + interfaceC17889.getTime()).toLowerCase();
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, final InterfaceC17889 interfaceC17889, int i) {
        String strM41873;
        C11813 c11813M28875;
        C19883 c19883M9975;
        if (i == 12) {
            MessageDigest messageDigestM34534 = C14460.m34534();
            C14460.m34528(messageDigestM34534, m41875(interfaceC17889));
            strM41873 = C14460.m34531(messageDigestM34534.digest());
        } else {
            strM41873 = m41873(interfaceC17889);
        }
        if (i == 12) {
            strM41873 = C19025.m43859(strM41873, interfaceC17889, interfaceC17889.getTime());
        }
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                AbstractC3163 abstractC3163 = this.f54661;
                ConnectivityManager connectivityManager = f54653;
                if (i == 4) {
                    String name = interfaceC17889.getName();
                    int i3 = C9459.f28698;
                    if (C10062.m25249(name)) {
                        m41876();
                        C19883 c19883Mo11258 = mo11258(interfaceC17889);
                        if (!m41872() || C3695.m11254(strM41873)) {
                            return c19883Mo11258.f64250;
                        }
                        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            AbstractC3577 abstractC3577 = abstractC3163.f9955;
                            if (!(abstractC3577.f11357 ? f54652 : abstractC3577.f11352) || (activeNetworkInfo.getType() & 9) != 0) {
                                AbstractC3577 abstractC3578 = abstractC3163.f9955;
                                C23569 c23569M24305 = C9459.m24305(abstractC3163, interfaceC17889, abstractC3578.f11357 ? f54654 : abstractC3578.f11351);
                                if (c23569M24305.m52038() == EnumC6636.SUCCESS && (c11813M28875 = C11813.m28875(c23569M24305.m52037())) != null) {
                                    return c11813M28875;
                                }
                                if (c23569M24305.m52038() == EnumC6636.TIMEOUT) {
                                    C3695.m11255(strM41873);
                                } else if (c23569M24305.m52038() == EnumC6636.CORRUPT) {
                                    return C19883.f64188.f64250;
                                }
                                return c19883Mo11258.f64250;
                            }
                        }
                        return c19883Mo11258.f64250;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        C19883 c19883 = C19883.f64192;
                        return m41871(strM41873, c19883, c19883, new C8779(i2, this, interfaceC17889));
                    }
                } else if (i == 12 && Build.VERSION.SDK_INT >= 23) {
                    C11813 c11813M28876 = C11813.m28875(C13110.m31773(strM41873));
                    if (c11813M28876 != null) {
                        C19025.m43868(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()), EnumC21142.MPEG_TS);
                        interfaceC17889.mo36965(new C7810());
                        return c11813M28876;
                    }
                    EnumC21142 enumC21142M43865 = C19025.m43865(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()));
                    EnumC21142 enumC21142 = EnumC21142.NOT_MPEG_TS;
                    if (enumC21142M43865 == enumC21142) {
                        interfaceC17889.mo36965((InterfaceC1629) null);
                        return C3256.m9975(interfaceC17889).f64250;
                    }
                    EnumC21142 enumC21143 = EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL;
                    if (enumC21142M43865 == enumC21143) {
                        interfaceC17889.mo36965(new C7810());
                        return C19883.f64188.f64250;
                    }
                    if (C3695.m11254(strM41873)) {
                        return C19883.f64188.f64250;
                    }
                    NetworkInfo activeNetworkInfo2 = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (m41872() && activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
                        AbstractC3577 abstractC3579 = abstractC3163.f9955;
                        if (!(abstractC3579.f11357 ? f54652 : abstractC3579.f11352) || (activeNetworkInfo2.getType() & 9) != 0) {
                            AtomicReference atomicReference = new AtomicReference(enumC21142M43865);
                            AtomicReference atomicReference2 = new AtomicReference();
                            try {
                                C22641 c22641 = new C22641(this, interfaceC17889, atomicReference, atomicReference2);
                                AbstractC3577 abstractC35710 = abstractC3163.f9955;
                                Bitmap bitmapM31774 = C13110.m31774(strM41873, c22641, abstractC35710.f11357 ? f54654 : abstractC35710.f11351);
                                EnumC21142 enumC21144 = (EnumC21142) atomicReference.get();
                                if (bitmapM31774 != null) {
                                    C19025.m43868(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()), EnumC21142.MPEG_TS);
                                    interfaceC17889.mo36965(new C7810());
                                    C11813 c11813M28877 = C11813.m28875(bitmapM31774);
                                    return c11813M28877 != null ? c11813M28877 : C19883.f64188.f64250;
                                }
                                if (enumC21144 == enumC21142) {
                                    interfaceC17889.mo36965((InterfaceC1629) null);
                                    return C3256.m9975(interfaceC17889).f64250;
                                }
                                if (enumC21144 == EnumC21142.MPEG_TS) {
                                    interfaceC17889.mo36965(new C7810());
                                }
                                C9853 c9853 = (C9853) atomicReference2.get();
                                if (c9853 != null && c9853.m24924()) {
                                    C19025.m43868(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()), enumC21143);
                                }
                                return C19883.f64188.f64250;
                            } catch (TimeoutException unused) {
                                EnumC21142 enumC21145 = (EnumC21142) atomicReference.get();
                                if (enumC21145 == EnumC21142.NOT_MPEG_TS) {
                                    interfaceC17889.mo36965((InterfaceC1629) null);
                                    c19883M9975 = C3256.m9975(interfaceC17889);
                                } else {
                                    if (enumC21145 == EnumC21142.MPEG_TS) {
                                        interfaceC17889.mo36965(new C7810());
                                    }
                                    C3695.m11255(strM41873);
                                    c19883M9975 = C19883.f64188;
                                }
                                return c19883M9975.f64250;
                            }
                        }
                    }
                    return C19883.f64188.f64250;
                }
                throw new RuntimeException();
            }
        }
        C19883 c19884 = C19883.f64187;
        return m41871(strM41873, c19884, c19884, new InterfaceC4644() { // from class: l.֫ۜ᩻
            @Override // l.InterfaceC4644
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final Bitmap mo5660() {
                C17897 c17897 = this.f5840;
                InterfaceC17889 interfaceC178810 = interfaceC17889;
                AbstractC15440 abstractC15440M36527 = C16293.f50111.m36527();
                ArrayList arrayList = new ArrayList();
                try {
                    return C17447.m40782(new C16485(c17897, arrayList, interfaceC178810, abstractC15440M36527));
                } finally {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0349.m1793((InputStream) it.next());
                    }
                    abstractC15440M36527.mo23552();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m41875(InterfaceC17889 interfaceC17889) {
        String str;
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            AbstractC3577 abstractC3577 = this.f54661.f9955;
            if (this.f54659 == null || !abstractC3577.equals(this.f54660)) {
                AbstractC3577 abstractC3577Clone = abstractC3577.clone();
                MessageDigest messageDigestM34534 = C14460.m34534();
                messageDigestM34534.update(b.k.getBytes());
                C14460.m34528(messageDigestM34534, abstractC3577Clone.mo6369().toString());
                String strM34531 = C14460.m34531(messageDigestM34534.digest());
                this.f54659 = strM34531;
                this.f54660 = abstractC3577Clone;
                str = strM34531;
            } else {
                str = this.f54659;
            }
        }
        sb.append(str);
        sb.append((char) 0);
        sb.append(interfaceC17889.getPath());
        sb.append((char) 0);
        sb.append(interfaceC17889.getSize());
        sb.append((char) 0);
        sb.append(interfaceC17889.getTime());
        return sb.toString();
    }
}
