package p067l;

import android.text.TextUtils;
import com.umeng.analytics.pro.C0719o;
import java.io.EOFException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAHB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11790 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f32942;

    /* JADX INFO: renamed from: ۧ */
    public C25200 f32943;

    /* JADX INFO: renamed from: ܽ */
    public C1502 f32944;

    /* JADX INFO: renamed from: ֫ */
    public static C11790 m27040(InputStream inputStream) throws EOFException {
        String strM55269;
        C11790 c11790 = new C11790();
        C1502 c1502 = new C1502();
        c11790.f32944 = c1502;
        C25200 c25200 = new C25200(inputStream);
        c11790.f32943 = c25200;
        c25200.m55274();
        c25200.m55274();
        c25200.m55274();
        c25200.m55274();
        int iM55275 = c11790.f32943.m55275();
        c11790.f32943.m55273(6L);
        c11790.f32942 = new HashMap();
        C9107[] c9107Arr = new C9107[iM55275];
        for (int i = 0; i < iM55275; i++) {
            C9107 c9107 = new C9107();
            c9107Arr[i] = c9107;
            c11790.f32942.put(C11119.m25650(c9107.m21044(c11790.f32943)), c9107Arr[i]);
        }
        HashMap map = c11790.f32942;
        c11790.f32943.getClass();
        map.put(C11119.f30837, new C9107(0));
        C25200 c25201 = c11790.f32943;
        C9107 c9108 = (C9107) c11790.f32942.get(C11119.f30836);
        if (c9108 != null) {
            c25201.m55270(c9108.m21043());
            c11790.f32943.m55275();
            c11790.f32943.m55273(2L);
            c11790.f32943.m55275();
        }
        C25200 c25202 = c11790.f32943;
        C9107 c9109 = (C9107) c11790.f32942.get(C11119.f30835);
        if (c9109 == null) {
            return c11790;
        }
        c25202.m55270(c9109.m21043() + 2);
        int iM55268 = c11790.f32943.m55268();
        int iM55276 = c11790.f32943.m55275();
        int iM55277 = (c11790.f32943.m55275() + iM55268) - 2;
        int i2 = iM55268 + 4;
        while (true) {
            int i3 = iM55276 - 1;
            if (iM55276 <= 0) {
                return c11790;
            }
            c11790.f32943.m55270(i2);
            int iM55278 = c11790.f32943.m55275();
            int iM55279 = c11790.f32943.m55275();
            int iM552710 = c11790.f32943.m55275();
            int iM552711 = c11790.f32943.m55275();
            int iM552712 = c11790.f32943.m55275();
            if ((iM55278 == 1 || iM55278 == 3) && (iM55279 == 0 || iM55279 == 1)) {
                C25200 c25203 = c11790.f32943;
                c25203.m55270(c25203.m55275() + iM55277);
                if (iM55278 == 3) {
                    strM55269 = c11790.f32943.m55272(iM552712);
                } else {
                    strM55269 = c11790.f32943.m55269(iM552712);
                }
                C22519 c22519 = (C22519) c1502.m34385(iM552711, (Integer) null);
                if (c22519 == null) {
                    c22519 = new C22519(0);
                    c1502.m34390(iM552711, c22519);
                }
                if (iM55278 != 1) {
                    switch (iM552710) {
                        case 1028:
                        case 3076:
                        case 5124:
                            c22519.f71005 = strM55269;
                            break;
                        case 1033:
                        case 2057:
                        case C0719o.a.f2903i /* 4105 */:
                        case 5129:
                        case 6153:
                        case 7177:
                        case C0719o.a.f2918x /* 8201 */:
                        case 9225:
                        case 10249:
                        case 11273:
                        case 12297:
                        case 13321:
                        case 16393:
                        case 17417:
                        case 18441:
                            c22519.f71009 = strM55269;
                            break;
                        case 1034:
                        case 2058:
                        case 3082:
                        case C0719o.a.f2904j /* 4106 */:
                        case 5130:
                        case 6154:
                        case 7178:
                        case 8202:
                        case 9226:
                        case 10250:
                        case 11274:
                        case 12298:
                        case 13322:
                        case 14346:
                        case 15370:
                        case 16394:
                        case 17418:
                        case 18442:
                        case 19466:
                        case 20490:
                        case 21514:
                            c22519.f71011 = strM55269;
                            break;
                        case 1049:
                            c22519.f71013 = strM55269;
                            break;
                        case 1055:
                            c22519.f71004 = strM55269;
                            break;
                        case 1057:
                            c22519.f71010 = strM55269;
                            break;
                        case 1058:
                            c22519.f71012 = strM55269;
                            break;
                        case 1059:
                            c22519.f71007 = strM55269;
                            break;
                        case 1068:
                        case 2092:
                            c22519.f71003 = strM55269;
                            break;
                        case 2052:
                        case C0719o.a.f2898d /* 4100 */:
                            c22519.f71006 = strM55269;
                            break;
                        default:
                            if (TextUtils.isEmpty(c22519.f71008)) {
                                c22519.f71008 = strM55269;
                            }
                            break;
                    }
                } else if (iM552710 == 0) {
                    c22519.f71009 = strM55269;
                } else if (iM552710 == 6) {
                    c22519.f71011 = strM55269;
                } else if (iM552710 == 17) {
                    c22519.f71004 = strM55269;
                } else if (iM552710 == 19) {
                    c22519.f71005 = strM55269;
                } else if (iM552710 == 45) {
                    c22519.f71012 = strM55269;
                } else if (iM552710 != 81) {
                    if (iM552710 != 150) {
                        if (iM552710 == 32) {
                            c22519.f71013 = strM55269;
                        } else if (iM552710 == 33) {
                            c22519.f71006 = strM55269;
                        } else if (iM552710 != 49 && iM552710 != 50) {
                            if (TextUtils.isEmpty(c22519.f71008)) {
                                c22519.f71008 = strM55269;
                            }
                        }
                    }
                    c22519.f71003 = strM55269;
                    c22519.f71011 = strM55269;
                } else {
                    c22519.f71010 = strM55269;
                }
            }
            i2 += 12;
            iM55276 = i3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m27041(int i, Locale locale) {
        C22519 c22519 = (C22519) this.f32944.m34385(i, (Integer) null);
        if (c22519 == null) {
            return null;
        }
        String language = locale.getLanguage();
        language.getClass();
        switch (language) {
            case "az":
                if (!TextUtils.isEmpty(c22519.f71003)) {
                    return c22519.f71003;
                }
                break;
            case "be":
                if (!TextUtils.isEmpty(c22519.f71007)) {
                    return c22519.f71007;
                }
                break;
            case "en":
                if (!TextUtils.isEmpty(c22519.f71009)) {
                    return c22519.f71009;
                }
                break;
            case "es":
                if (!TextUtils.isEmpty(c22519.f71011)) {
                    return c22519.f71011;
                }
                break;
            case "in":
                if (!TextUtils.isEmpty(c22519.f71010)) {
                    return c22519.f71010;
                }
                break;
            case "ru":
                if (!TextUtils.isEmpty(c22519.f71013)) {
                    return c22519.f71013;
                }
                break;
            case "tr":
                if (!TextUtils.isEmpty(c22519.f71004)) {
                    return c22519.f71004;
                }
                break;
            case "uk":
                if (!TextUtils.isEmpty(c22519.f71012)) {
                    return c22519.f71012;
                }
                break;
            case "zh":
                if (locale.getCountry().equals("CN")) {
                    if (!TextUtils.isEmpty(c22519.f71006)) {
                        return c22519.f71006;
                    }
                } else if (!TextUtils.isEmpty(c22519.f71005)) {
                    return c22519.f71005;
                }
                break;
        }
        if (!TextUtils.isEmpty(c22519.f71009)) {
            return c22519.f71009;
        }
        return c22519.f71008;
    }
}
