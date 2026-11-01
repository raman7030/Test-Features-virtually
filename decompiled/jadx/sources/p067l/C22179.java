package p067l;

import android.graphics.Bitmap;
import android.net.Uri;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0698cb;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I23M */
/* JADX INFO: loaded from: classes5.dex */
public class C22179 extends C5880 {

    /* JADX INFO: renamed from: ܿ */
    public static final C22179 f70167 = new C22179();

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f70168 = Pattern.compile("/data/user(_de)?/\\d+/");

    @Override // p067l.C5880
    /* JADX INFO: renamed from: ֫ */
    public final String mo11391(InterfaceC19370 interfaceC19370, int i) {
        AbstractC17043 abstractC17043Mo34489 = mo34489(interfaceC19370);
        abstractC17043Mo34489.getClass();
        if ((abstractC17043Mo34489 instanceof C8878) && !m49988()) {
            return null;
        }
        if (i == 1 && interfaceC19370.getSize() > 268435456) {
            return null;
        }
        String path = interfaceC19370.getPath();
        long size = interfaceC19370.getSize();
        long time = interfaceC19370.getTime();
        int i2 = C14828.f42297;
        return C16111.m36664(path + size + time).toLowerCase();
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C21265 mo13204(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.mo39135()) {
            if (C20450.m46137(interfaceC19370.getSize(), interfaceC19370.getPath())) {
                EnumC22462 enumC22462M46133 = C20450.m46133(m49989(interfaceC19370));
                if (enumC22462M46133 == EnumC22462.NOT_MPEG_TS) {
                    interfaceC19370.mo39131((InterfaceC0923) null);
                } else {
                    if (enumC22462M46133 != EnumC22462.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (enumC22462M46133 == EnumC22462.MPEG_TS) {
                            interfaceC19370.mo39131(new C8007(1));
                        }
                        return C21265.f66828;
                    }
                    interfaceC19370.mo39131(new C8007(1));
                    return C21265.f66824;
                }
            }
        }
        C21265 c21265M12008 = C5463.m12008(interfaceC19370);
        if (c21265M12008 == C21265.f66829) {
            String lowerCase = interfaceC19370.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C21265.f66876;
            }
            if ((interfaceC19370 instanceof C11450) && interfaceC19370.getParent().endsWith("/keys/") && (lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc") || lowerCase.endsWith(".pk8") || lowerCase.endsWith(".x509.pem"))) {
                return C21265.f66847;
            }
        }
        return c21265M12008;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:145:0x0201  */
    /* JADX WARN: Code duplicated, block: B:165:0x024b A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ۧ */
    public final int mo11393(InterfaceC19370 interfaceC19370) {
        byte b = 9;
        if (interfaceC19370.mo39135()) {
            if (C20450.m46139(interfaceC19370.getPath())) {
                if (!C20450.m46137(interfaceC19370.getSize(), interfaceC19370.getPath())) {
                    interfaceC19370.mo39140(0);
                    return 0;
                }
                EnumC22462 enumC22462M46133 = C20450.m46133(m49989(interfaceC19370));
                if (enumC22462M46133 == EnumC22462.NOT_MPEG_TS) {
                    interfaceC19370.mo39131((InterfaceC0923) null);
                    interfaceC19370.mo39140(0);
                    return 0;
                }
                if (enumC22462M46133 != EnumC22462.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (enumC22462M46133 == EnumC22462.MPEG_TS) {
                        interfaceC19370.mo39131(new C8007(1));
                    }
                    return 12;
                }
                interfaceC19370.mo39131(new C8007(1));
                interfaceC19370.mo39140(0);
                return 0;
            }
            String strMo39137 = interfaceC19370.mo39137();
            if (strMo39137.equals("image/svg+xml")) {
                return 2;
            }
            if (strMo39137.equals("text/xml")) {
                return 3;
            }
            if (strMo39137.startsWith("image/")) {
                return 1;
            }
            if (strMo39137.startsWith("video/")) {
                return 4;
            }
            if (strMo39137.equals("application/vnd.android.package-archive")) {
                return 5;
            }
            if (strMo39137.equals("application/vnd.android.package-archives")) {
                return 11;
            }
            if (strMo39137.equals("application/mt-plugin")) {
                return 6;
            }
            String lowerCase = interfaceC19370.getName().toLowerCase();
            if (lowerCase.endsWith(".bak") && !lowerCase.endsWith(".bak.bak")) {
                return 9;
            }
        }
        if (interfaceC19370.isDirectory() && (interfaceC19370 instanceof C11450)) {
            if (((C11450) interfaceC19370).m26447()) {
                return 10;
            }
            String lowerCase2 = interfaceC19370.getParent().toLowerCase();
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
                        b = C0698cb.f2569k;
                    }
                    break;
                case 218556635:
                    if (!lowerCase2.equals("/system/priv-app/")) {
                        b = -1;
                    } else {
                        b = C0698cb.f2570l;
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
                    if ((!lowerCase2.startsWith("/data/user") || C11567.m26619(lowerCase2, '/') != 4 || !f70168.matcher(lowerCase2).matches()) && !lowerCase2.endsWith("/android/data/") && !lowerCase2.endsWith("/android/obb/") && !lowerCase2.endsWith("/android/media/")) {
                        if (lowerCase2.startsWith("/data/app/") && "/data/app/".equals(C11419.m26416(lowerCase2))) {
                            return 8;
                        }
                    }
                    return 7;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public AbstractC17043 mo34489(InterfaceC19370 interfaceC19370) {
        return interfaceC19370.mo26445();
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C13596 mo11392(AbstractC18422 abstractC18422, InterfaceC19370 interfaceC19370, int i) {
        C13596 c13596M30924;
        String path = interfaceC19370.getPath();
        long size = interfaceC19370.getSize();
        long time = interfaceC19370.getTime();
        int i2 = C14828.f42297;
        String lowerCase = C16111.m36664(path + size + time).toLowerCase();
        if (i == 12) {
            lowerCase = C20450.m46127(lowerCase, interfaceC19370, interfaceC19370.getTime());
        }
        final AbstractC17043 abstractC17043Mo34489 = mo34489(interfaceC19370);
        C13596 c13596M30925 = null;
        switch (i) {
            case 1:
                abstractC17043Mo34489.getClass();
                if ((!(abstractC17043Mo34489 instanceof C8878) || m49988()) && interfaceC19370.getSize() <= 268435456) {
                    return C5880.m13196(lowerCase, C21265.f66851, true, new C15646(abstractC17043Mo34489));
                }
                return mo13204(interfaceC19370).f66886;
            case 2:
                abstractC17043Mo34489.getClass();
                return (!(abstractC17043Mo34489 instanceof C8878) || m49988()) ? C5880.m13196(lowerCase, C21265.f66851, true, new C13303(abstractC17043Mo34489)) : mo13204(interfaceC19370).f66886;
            case 3:
                abstractC17043Mo34489.getClass();
                if ((abstractC17043Mo34489 instanceof C8878) && !m49988()) {
                    return mo13204(interfaceC19370).f66886;
                }
                C21265 c21265 = C21265.f66832;
                C13596 c13596M13196 = C5880.m13196(lowerCase, c21265, true, new C19368(abstractC17043Mo34489));
                if (c13596M13196 != c21265.f66886) {
                    interfaceC19370.mo39141(R.id.MT_Protector, Boolean.TRUE);
                }
                return c13596M13196;
            case 4:
                abstractC17043Mo34489.getClass();
                if ((abstractC17043Mo34489 instanceof C8878) && !m49988()) {
                    return mo13204(interfaceC19370).f66886;
                }
                String name = interfaceC19370.getName();
                int i3 = C11358.f31647;
                if (!C11931.m27266(name)) {
                    return C5880.m13196(lowerCase, C21265.f66824, true, new C16142(abstractC17043Mo34489, 0));
                }
                C24768 c24768M26315 = C11358.m26315(abstractC18422 == null ? C4744.f10749 : abstractC18422.mo8217(), interfaceC19370, 5);
                if (c24768M26315.m54440() != EnumC8675.SUCCESS || (c13596M30924 = C13596.m30924(c24768M26315.m54439())) == null) {
                    return c24768M26315.m54440() == EnumC8675.CORRUPT ? C21265.f66824.f66886 : mo13204(interfaceC19370).f66886;
                }
                return c13596M30924;
            case 5:
                abstractC17043Mo34489.getClass();
                return (!(abstractC17043Mo34489 instanceof C8878) || m49988()) ? C5880.m13196(lowerCase, C21265.f66841, false, new C6648(abstractC17043Mo34489)) : mo13204(interfaceC19370).f66886;
            case 6:
                abstractC17043Mo34489.getClass();
                return (!(abstractC17043Mo34489 instanceof C8878) || m49988()) ? C5880.m13196(lowerCase, C21265.f66865, true, new C9387(3, abstractC17043Mo34489)) : mo13204(interfaceC19370).f66886;
            case 7:
                C13596 c13596M30926 = C13596.m30925(RunnableC8046.m18678(interfaceC19370.getName()));
                return c13596M30926 == null ? C21265.f66817.f66886 : c13596M30926;
            case 8:
                C13596 c13596M30927 = C13596.m30925(RunnableC8046.m18682(abstractC17043Mo34489.mo25505()));
                return c13596M30927 == null ? C21265.f66817.f66886 : c13596M30927;
            case 9:
                try {
                    C24618 c24618M38671 = abstractC17043Mo34489.m38671("r");
                    try {
                        int i4 = C8353.f22334;
                        C13596 c13596 = ((c24618M38671.length() > 40 && c24618M38671.readInt() == 1230326093 && c24618M38671.readInt() == 1128350240 && c24618M38671.readInt() == 173036875) ? C21265.f66869 : C21265.f66829).f66886;
                        c24618M38671.close();
                        return c13596;
                    } catch (Throwable th) {
                        try {
                            c24618M38671.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    return C21265.f66829.f66886;
                }
            case 10:
                try {
                    Uri uri = ((C11450) interfaceC19370).m26446().f15594;
                    int i5 = C20278.f62659;
                    if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                        c13596M30925 = C13596.m30925(RunnableC8046.m18678(C20278.m45805(uri)));
                    }
                    break;
                } catch (Exception unused2) {
                }
                return c13596M30925 == null ? C21265.f66817.f66886 : c13596M30925;
            case 11:
                abstractC17043Mo34489.getClass();
                if ((abstractC17043Mo34489 instanceof C8878) && !m49988()) {
                    return mo13204(interfaceC19370).f66886;
                }
                C21265 c21266 = C21265.f66873;
                C13596 c13596M13197 = C5880.m13196(lowerCase, c21266, true, new InterfaceC6782() { // from class: l.᩻ۧ᩻
                    @Override // p067l.InterfaceC6782
                    /* JADX INFO: renamed from: ֫ */
                    public final Bitmap mo7890() {
                        return C18950.m43048(abstractC17043Mo34489);
                    }
                });
                if (c13596M13197 == c21266.f66886) {
                    return c13596M13197;
                }
                C13596 c13596M30928 = C13596.m30925(RunnableC8046.m18679(c13596M13197, lowerCase));
                C12826.requireNonNull(c13596M30928);
                return c13596M30928;
            case 12:
                C13596 c13596M30929 = C13596.m30924(C14828.m33864(lowerCase));
                if (c13596M30929 != null) {
                    C20450.m46136(m49989(interfaceC19370), EnumC22462.MPEG_TS);
                    interfaceC19370.mo39131(new C8007(1));
                    return c13596M30929;
                }
                EnumC22462 enumC22462M46133 = C20450.m46133(m49989(interfaceC19370));
                EnumC22462 enumC22462 = EnumC22462.NOT_MPEG_TS;
                if (enumC22462M46133 == enumC22462) {
                    interfaceC19370.mo39131((InterfaceC0923) null);
                    return C5463.m12008(interfaceC19370).f66886;
                }
                EnumC22462 enumC22463 = EnumC22462.MPEG_TS_WITHOUT_THUMBNAIL;
                if (enumC22462M46133 == enumC22463) {
                    interfaceC19370.mo39131(new C8007(1));
                    return C21265.f66824.f66886;
                }
                if (enumC22462M46133 == null) {
                    try {
                        InputStream inputStreamMo29987 = abstractC17043Mo34489.mo29987();
                        try {
                            EnumC22462 enumC22462M46132 = C20450.m46132(inputStreamMo29987);
                            if (inputStreamMo29987 != null) {
                                inputStreamMo29987.close();
                            }
                            C20450.m46136(m49989(interfaceC19370), enumC22462M46132);
                            if (enumC22462M46132 == enumC22462) {
                                interfaceC19370.mo39131((InterfaceC0923) null);
                                return C5463.m12008(interfaceC19370).f66886;
                            }
                        } catch (Throwable th3) {
                            if (inputStreamMo29987 != null) {
                                try {
                                    inputStreamMo29987.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                break;
                            }
                            throw th3;
                        }
                    } catch (IOException unused3) {
                        return C21265.f66824.f66886;
                    }
                }
                interfaceC19370.mo39131(new C8007(1));
                final AtomicReference atomicReference = new AtomicReference();
                C13596 c13596M13198 = C5880.m13196(lowerCase, C21265.f66824, false, new InterfaceC6782() { // from class: l.ۜۧ᩻
                    @Override // p067l.InterfaceC6782
                    /* JADX INFO: renamed from: ֫ */
                    public final Bitmap mo7890() {
                        C11733 c11733M43050 = C18950.m43050(abstractC17043Mo34489);
                        atomicReference.set(c11733M43050);
                        return c11733M43050.m26938();
                    }
                });
                C11733 c11733 = (C11733) atomicReference.get();
                if (c11733 != null && c11733.m26939()) {
                    C20450.m46136(m49989(interfaceC19370), enumC22463);
                }
                return c13596M13198;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m49989(InterfaceC19370 interfaceC19370) {
        return C20450.m46127("local:" + interfaceC19370.getPath() + (char) 0 + interfaceC19370.getSize() + (char) 0 + interfaceC19370.getTime(), interfaceC19370, interfaceC19370.getTime());
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m49988() {
        return ApplicationC21448.f67650.getBoolean("external_storage_thumb_enable", true);
    }
}
