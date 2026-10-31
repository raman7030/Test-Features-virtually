package l;

import android.graphics.Bitmap;
import android.net.Uri;
import bin.mt.plus.R;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I23M */
/* JADX INFO: loaded from: classes5.dex */
public class C20844 extends C3695 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C20844 f67485 = new C20844();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f67486 = Pattern.compile("/data/user(_de)?/\\d+/");

    @Override // l.C3695
    /* JADX INFO: renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        AbstractC15440 abstractC15440Mo32387 = mo32387(interfaceC17889);
        abstractC15440Mo32387.getClass();
        if ((abstractC15440Mo32387 instanceof C6849) && !m47660()) {
            return null;
        }
        if (i == 1 && interfaceC17889.getSize() > 268435456) {
            return null;
        }
        String path = interfaceC17889.getPath();
        long size = interfaceC17889.getSize();
        long time = interfaceC17889.getTime();
        int i2 = C13110.f39245;
        return C14460.m34530(path + size + time).toLowerCase();
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public final C19883 mo11258(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969()) {
            if (C19025.m43869(interfaceC17889.getSize(), interfaceC17889.getPath())) {
                EnumC21142 enumC21142M43865 = C19025.m43865(m47661(interfaceC17889));
                if (enumC21142M43865 == EnumC21142.NOT_MPEG_TS) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                } else {
                    if (enumC21142M43865 != EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (enumC21142M43865 == EnumC21142.MPEG_TS) {
                            interfaceC17889.mo36965(new C5933(1));
                        }
                        return C19883.f64192;
                    }
                    interfaceC17889.mo36965(new C5933(1));
                    return C19883.f64188;
                }
            }
        }
        C19883 c19883M9975 = C3256.m9975(interfaceC17889);
        if (c19883M9975 == C19883.f64193) {
            String lowerCase = interfaceC17889.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C19883.f64240;
            }
            if ((interfaceC17889 instanceof C9555) && interfaceC17889.getParent().endsWith("/keys/") && (lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc") || lowerCase.endsWith(".pk8") || lowerCase.endsWith(".x509.pem"))) {
                return C19883.f64211;
            }
        }
        return c19883M9975;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:145:0x0201  */
    /* JADX WARN: Code duplicated, block: B:165:0x024b A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        byte b = 9;
        if (interfaceC17889.mo36969()) {
            if (C19025.m43871(interfaceC17889.getPath())) {
                if (!C19025.m43869(interfaceC17889.getSize(), interfaceC17889.getPath())) {
                    interfaceC17889.mo36974(0);
                    return 0;
                }
                EnumC21142 enumC21142M43865 = C19025.m43865(m47661(interfaceC17889));
                if (enumC21142M43865 == EnumC21142.NOT_MPEG_TS) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                    interfaceC17889.mo36974(0);
                    return 0;
                }
                if (enumC21142M43865 != EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (enumC21142M43865 == EnumC21142.MPEG_TS) {
                        interfaceC17889.mo36965(new C5933(1));
                    }
                    return 12;
                }
                interfaceC17889.mo36965(new C5933(1));
                interfaceC17889.mo36974(0);
                return 0;
            }
            String strMo36971 = interfaceC17889.mo36971();
            if (strMo36971.equals("image/svg+xml")) {
                return 2;
            }
            if (strMo36971.equals("text/xml")) {
                return 3;
            }
            if (strMo36971.startsWith("image/")) {
                return 1;
            }
            if (strMo36971.startsWith("video/")) {
                return 4;
            }
            if (strMo36971.equals("application/vnd.android.package-archive")) {
                return 5;
            }
            if (strMo36971.equals("application/vnd.android.package-archives")) {
                return 11;
            }
            if (strMo36971.equals("application/mt-plugin")) {
                return 6;
            }
            String lowerCase = interfaceC17889.getName().toLowerCase();
            if (lowerCase.endsWith(".bak") && !lowerCase.endsWith(".bak.bak")) {
                return 9;
            }
        }
        if (interfaceC17889.isDirectory() && (interfaceC17889 instanceof C9555)) {
            if (((C9555) interfaceC17889).m24435()) {
                return 10;
            }
            String lowerCase2 = interfaceC17889.getParent().toLowerCase();
            lowerCase2.getClass();
            switch (lowerCase2.hashCode()) {
                case -2115682979:
                    if (!lowerCase2.equals("/system_ext/app/")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -2023245916:
                    if (!lowerCase2.equals("/cust/data-app/")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1829200709:
                    if (!lowerCase2.equals("/system/product/priv-app/")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -1088636626:
                    if (!lowerCase2.equals("/product/overlay/")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1054463452:
                    if (!lowerCase2.equals("/data/app/")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -1049563482:
                    if (!lowerCase2.equals("/odm/priv-app/")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -606776186:
                    if (!lowerCase2.equals("/data/user_de/999/")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case -606194528:
                    if (!lowerCase2.equals("/system/product/data-app/")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case -559290289:
                    if (!lowerCase2.equals("/data/user_de/0/")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -394958177:
                    if (!lowerCase2.equals("/system/product/app/")) {
                        b = -1;
                    }
                    break;
                case -340788284:
                    if (!lowerCase2.equals("/data/user/999/")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case -265382627:
                    if (!lowerCase2.equals("/product/priv-app/")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 64634109:
                    if (!lowerCase2.equals("/product/app/")) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case 191892095:
                    if (!lowerCase2.equals("/system/app/")) {
                        b = -1;
                    } else {
                        b = cb.k;
                    }
                    break;
                case 218556635:
                    if (!lowerCase2.equals("/system/priv-app/")) {
                        b = -1;
                    } else {
                        b = cb.f77931l;
                    }
                    break;
                case 518080269:
                    if (!lowerCase2.equals("/data/user/0/")) {
                        b = -1;
                    } else {
                        b = 15;
                    }
                    break;
                case 617926845:
                    if (!lowerCase2.equals("/system_ext/priv-app/")) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 957623554:
                    if (!lowerCase2.equals("/product/data-app/")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 1441562816:
                    if (!lowerCase2.equals("/system/data-app/")) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 1569378259:
                    if (!lowerCase2.equals("/cust/app/customized/")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case 1631864272:
                    if (!lowerCase2.equals("/system/product/overlay/")) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case 1673700495:
                    if (!lowerCase2.equals("/data/data/")) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    return 8;
                case 6:
                case 8:
                case 10:
                case 15:
                case 21:
                    return 7;
                default:
                    if ((!lowerCase2.startsWith("/data/user") || C9679.m24605(lowerCase2, '/') != 4 || !f67486.matcher(lowerCase2).matches()) && !lowerCase2.endsWith("/android/data/") && !lowerCase2.endsWith("/android/obb/") && !lowerCase2.endsWith("/android/media/")) {
                        if (lowerCase2.startsWith("/data/app/") && "/data/app/".equals(C9523.m24406(lowerCase2))) {
                            return 8;
                        }
                    }
                    return 7;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public AbstractC15440 mo32387(InterfaceC17889 interfaceC17889) {
        return interfaceC17889.mo24433();
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        C11813 c11813M28875;
        String path = interfaceC17889.getPath();
        long size = interfaceC17889.getSize();
        long time = interfaceC17889.getTime();
        int i2 = C13110.f39245;
        String lowerCase = C14460.m34530(path + size + time).toLowerCase();
        if (i == 12) {
            lowerCase = C19025.m43859(lowerCase, interfaceC17889, interfaceC17889.getTime());
        }
        final AbstractC15440 abstractC15440Mo32387 = mo32387(interfaceC17889);
        C11813 c11813M28876 = null;
        switch (i) {
            case 1:
                abstractC15440Mo32387.getClass();
                if ((!(abstractC15440Mo32387 instanceof C6849) || m47660()) && interfaceC17889.getSize() <= 268435456) {
                    return C3695.m11250(lowerCase, C19883.f64215, true, new C13970(abstractC15440Mo32387));
                }
                return mo11258(interfaceC17889).f64250;
            case 2:
                abstractC15440Mo32387.getClass();
                return (!(abstractC15440Mo32387 instanceof C6849) || m47660()) ? C3695.m11250(lowerCase, C19883.f64215, true, new C11505(abstractC15440Mo32387)) : mo11258(interfaceC17889).f64250;
            case 3:
                abstractC15440Mo32387.getClass();
                if ((abstractC15440Mo32387 instanceof C6849) && !m47660()) {
                    return mo11258(interfaceC17889).f64250;
                }
                C19883 c19883 = C19883.f64196;
                C11813 c11813M11250 = C3695.m11250(lowerCase, c19883, true, new C17887(abstractC15440Mo32387));
                if (c11813M11250 != c19883.f64250) {
                    interfaceC17889.mo36975(R.id.MT_Protector, Boolean.TRUE);
                }
                return c11813M11250;
            case 4:
                abstractC15440Mo32387.getClass();
                if ((abstractC15440Mo32387 instanceof C6849) && !m47660()) {
                    return mo11258(interfaceC17889).f64250;
                }
                String name = interfaceC17889.getName();
                int i3 = C9459.f28698;
                if (!C10062.m25249(name)) {
                    return C3695.m11250(lowerCase, C19883.f64188, true, new C14492(abstractC15440Mo32387, 0));
                }
                C23569 c23569M24305 = C9459.m24305(abstractC16891 == null ? C2499.f7958 : abstractC16891.mo6020(), interfaceC17889, 5);
                if (c23569M24305.m52038() != EnumC6636.SUCCESS || (c11813M28875 = C11813.m28875(c23569M24305.m52037())) == null) {
                    return c23569M24305.m52038() == EnumC6636.CORRUPT ? C19883.f64188.f64250 : mo11258(interfaceC17889).f64250;
                }
                return c11813M28875;
            case 5:
                abstractC15440Mo32387.getClass();
                return (!(abstractC15440Mo32387 instanceof C6849) || m47660()) ? C3695.m11250(lowerCase, C19883.f64205, false, new C4503(abstractC15440Mo32387)) : mo11258(interfaceC17889).f64250;
            case 6:
                abstractC15440Mo32387.getClass();
                return (!(abstractC15440Mo32387 instanceof C6849) || m47660()) ? C3695.m11250(lowerCase, C19883.f64229, true, new C7385(3, abstractC15440Mo32387)) : mo11258(interfaceC17889).f64250;
            case 7:
                C11813 c11813M28877 = C11813.m28876(RunnableC5974.m16752(interfaceC17889.getName()));
                return c11813M28877 == null ? C19883.f64181.f64250 : c11813M28877;
            case 8:
                C11813 c11813M28878 = C11813.m28876(RunnableC5974.m16756(abstractC15440Mo32387.mo23554()));
                return c11813M28878 == null ? C19883.f64181.f64250 : c11813M28878;
            case 9:
                try {
                    C23411 c23411M36513 = abstractC15440Mo32387.m36513("r");
                    try {
                        int i4 = C6297.f19463;
                        C11813 c11813 = ((c23411M36513.length() > 40 && c23411M36513.readInt() == 1230326093 && c23411M36513.readInt() == 1128350240 && c23411M36513.readInt() == 173036875) ? C19883.f64233 : C19883.f64193).f64250;
                        c23411M36513.close();
                        return c11813;
                    } catch (Throwable th) {
                        try {
                            c23411M36513.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    return C19883.f64193.f64250;
                }
            case 10:
                try {
                    Uri uri = ((C9555) interfaceC17889).m24434().f12779;
                    int i5 = C18844.f59431;
                    if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                        c11813M28876 = C11813.m28876(RunnableC5974.m16752(C18844.m43539(uri)));
                    }
                    break;
                } catch (Exception unused2) {
                }
                return c11813M28876 == null ? C19883.f64181.f64250 : c11813M28876;
            case 11:
                abstractC15440Mo32387.getClass();
                if ((abstractC15440Mo32387 instanceof C6849) && !m47660()) {
                    return mo11258(interfaceC17889).f64250;
                }
                C19883 c19884 = C19883.f64237;
                C11813 c11813M11251 = C3695.m11250(lowerCase, c19884, true, new InterfaceC4644() { // from class: l.᩻ۧ᩻
                    @Override // l.InterfaceC4644
                    /* JADX INFO: renamed from: ֫ */
                    public final Bitmap mo5660() {
                        return C17447.m40790(abstractC15440Mo32387);
                    }
                });
                if (c11813M11251 == c19884.f64250) {
                    return c11813M11251;
                }
                C11813 c11813M28879 = C11813.m28876(RunnableC5974.m16753(c11813M11251, lowerCase));
                C11003.requireNonNull(c11813M28879);
                return c11813M28879;
            case 12:
                C11813 c11813M288710 = C11813.m28875(C13110.m31773(lowerCase));
                if (c11813M288710 != null) {
                    C19025.m43868(m47661(interfaceC17889), EnumC21142.MPEG_TS);
                    interfaceC17889.mo36965(new C5933(1));
                    return c11813M288710;
                }
                EnumC21142 enumC21142M43865 = C19025.m43865(m47661(interfaceC17889));
                EnumC21142 enumC21142 = EnumC21142.NOT_MPEG_TS;
                if (enumC21142M43865 == enumC21142) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                    return C3256.m9975(interfaceC17889).f64250;
                }
                EnumC21142 enumC21143 = EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL;
                if (enumC21142M43865 == enumC21143) {
                    interfaceC17889.mo36965(new C5933(1));
                    return C19883.f64188.f64250;
                }
                if (enumC21142M43865 == null) {
                    try {
                        InputStream inputStreamMo27926 = abstractC15440Mo32387.mo27926();
                        try {
                            EnumC21142 enumC21142M43864 = C19025.m43864(inputStreamMo27926);
                            if (inputStreamMo27926 != null) {
                                inputStreamMo27926.close();
                            }
                            C19025.m43868(m47661(interfaceC17889), enumC21142M43864);
                            if (enumC21142M43864 == enumC21142) {
                                interfaceC17889.mo36965((InterfaceC1629) null);
                                return C3256.m9975(interfaceC17889).f64250;
                            }
                        } catch (Throwable th3) {
                            if (inputStreamMo27926 != null) {
                                try {
                                    inputStreamMo27926.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                break;
                            }
                            throw th3;
                        }
                    } catch (IOException unused3) {
                        return C19883.f64188.f64250;
                    }
                }
                interfaceC17889.mo36965(new C5933(1));
                final AtomicReference atomicReference = new AtomicReference();
                C11813 c11813M11252 = C3695.m11250(lowerCase, C19883.f64188, false, new InterfaceC4644() { // from class: l.ۜۧ᩻
                    @Override // l.InterfaceC4644
                    /* JADX INFO: renamed from: ֫ */
                    public final Bitmap mo5660() {
                        C9853 c9853M40792 = C17447.m40792(abstractC15440Mo32387);
                        atomicReference.set(c9853M40792);
                        return c9853M40792.m24923();
                    }
                });
                C9853 c9853 = (C9853) atomicReference.get();
                if (c9853 != null && c9853.m24924()) {
                    C19025.m43868(m47661(interfaceC17889), enumC21143);
                }
                return c11813M11252;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m47661(InterfaceC17889 interfaceC17889) {
        return C19025.m43859("local:" + interfaceC17889.getPath() + (char) 0 + interfaceC17889.getSize() + (char) 0 + interfaceC17889.getTime(), interfaceC17889, interfaceC17889.getTime());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m47660() {
        return ApplicationC20075.f65010.getBoolean("external_storage_thumb_enable", true);
    }
}
