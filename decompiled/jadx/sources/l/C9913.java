package l;

import android.text.TextUtils;
import com.umeng.analytics.pro.o;
import java.io.EOFException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAHB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9913 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f29984;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C24023 f29985;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13309 f29986;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9913 m25023(InputStream inputStream) throws EOFException {
        String strM52863;
        C9913 c9913 = new C9913();
        C13309 c13309 = new C13309();
        c9913.f29986 = c13309;
        C24023 c24023 = new C24023(inputStream);
        c9913.f29985 = c24023;
        c24023.m52868();
        c24023.m52868();
        c24023.m52868();
        c24023.m52868();
        int iM52869 = c9913.f29985.m52869();
        c9913.f29985.m52867(6L);
        c9913.f29984 = new HashMap();
        C7090[] c7090Arr = new C7090[iM52869];
        for (int i = 0; i < iM52869; i++) {
            C7090 c7090 = new C7090();
            c7090Arr[i] = c7090;
            c9913.f29984.put(C9207.m23651(c7090.m19086(c9913.f29985)), c7090Arr[i]);
        }
        HashMap map = c9913.f29984;
        c9913.f29985.getClass();
        map.put(C9207.f27891, new C7090(0));
        C24023 c24024 = c9913.f29985;
        C7090 c7091 = (C7090) c9913.f29984.get(C9207.f27890);
        if (c7091 != null) {
            c24024.m52864(c7091.m19085());
            c9913.f29985.m52869();
            c9913.f29985.m52867(2L);
            c9913.f29985.m52869();
        }
        C24023 c24025 = c9913.f29985;
        C7090 c7092 = (C7090) c9913.f29984.get(C9207.f27889);
        if (c7092 == null) {
            return c9913;
        }
        c24025.m52864(c7092.m19085() + 2);
        int iM52862 = c9913.f29985.m52862();
        int iM528610 = c9913.f29985.m52869();
        int iM528611 = (c9913.f29985.m52869() + iM52862) - 2;
        int i2 = iM52862 + 4;
        while (true) {
            int i3 = iM528610 - 1;
            if (iM528610 <= 0) {
                return c9913;
            }
            c9913.f29985.m52864(i2);
            int iM528612 = c9913.f29985.m52869();
            int iM528613 = c9913.f29985.m52869();
            int iM528614 = c9913.f29985.m52869();
            int iM528615 = c9913.f29985.m52869();
            int iM528616 = c9913.f29985.m52869();
            if ((iM528612 == 1 || iM528612 == 3) && (iM528613 == 0 || iM528613 == 1)) {
                C24023 c24026 = c9913.f29985;
                c24026.m52864(c24026.m52869() + iM528611);
                if (iM528612 == 3) {
                    strM52863 = c9913.f29985.m52866(iM528616);
                } else {
                    strM52863 = c9913.f29985.m52863(iM528616);
                }
                C21202 c21202 = (C21202) c13309.m32284(iM528615, (Integer) null);
                if (c21202 == null) {
                    c21202 = new C21202(0);
                    c13309.m32289(iM528615, c21202);
                }
                if (iM528612 != 1) {
                    switch (iM528614) {
                        case 1028:
                        case 3076:
                        case 5124:
                            c21202.f68322 = strM52863;
                            break;
                        case 1033:
                        case 2057:
                        case o.a.i /* 4105 */:
                        case 5129:
                        case 6153:
                        case 7177:
                        case o.a.x /* 8201 */:
                        case 9225:
                        case 10249:
                        case 11273:
                        case 12297:
                        case 13321:
                        case 16393:
                        case 17417:
                        case 18441:
                            c21202.f68326 = strM52863;
                            break;
                        case 1034:
                        case 2058:
                        case 3082:
                        case o.a.j /* 4106 */:
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
                            c21202.f68328 = strM52863;
                            break;
                        case 1049:
                            c21202.f68330 = strM52863;
                            break;
                        case 1055:
                            c21202.f68321 = strM52863;
                            break;
                        case 1057:
                            c21202.f68327 = strM52863;
                            break;
                        case 1058:
                            c21202.f68329 = strM52863;
                            break;
                        case 1059:
                            c21202.f68324 = strM52863;
                            break;
                        case 1068:
                        case 2092:
                            c21202.f68320 = strM52863;
                            break;
                        case 2052:
                        case o.a.d /* 4100 */:
                            c21202.f68323 = strM52863;
                            break;
                        default:
                            if (TextUtils.isEmpty(c21202.f68325)) {
                                c21202.f68325 = strM52863;
                            }
                            break;
                    }
                } else if (iM528614 == 0) {
                    c21202.f68326 = strM52863;
                } else if (iM528614 == 6) {
                    c21202.f68328 = strM52863;
                } else if (iM528614 == 17) {
                    c21202.f68321 = strM52863;
                } else if (iM528614 == 19) {
                    c21202.f68322 = strM52863;
                } else if (iM528614 == 45) {
                    c21202.f68329 = strM52863;
                } else if (iM528614 != 81) {
                    if (iM528614 != 150) {
                        if (iM528614 == 32) {
                            c21202.f68330 = strM52863;
                        } else if (iM528614 == 33) {
                            c21202.f68323 = strM52863;
                        } else if (iM528614 != 49 && iM528614 != 50) {
                            if (TextUtils.isEmpty(c21202.f68325)) {
                                c21202.f68325 = strM52863;
                            }
                        }
                    }
                    c21202.f68320 = strM52863;
                    c21202.f68328 = strM52863;
                } else {
                    c21202.f68327 = strM52863;
                }
            }
            i2 += 12;
            iM528610 = i3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m25024(int i, Locale locale) {
        C21202 c21202 = (C21202) this.f29986.m32284(i, (Integer) null);
        if (c21202 == null) {
            return null;
        }
        String language = locale.getLanguage();
        language.getClass();
        switch (language) {
            case "az":
                if (!TextUtils.isEmpty(c21202.f68320)) {
                    return c21202.f68320;
                }
                break;
            case "be":
                if (!TextUtils.isEmpty(c21202.f68324)) {
                    return c21202.f68324;
                }
                break;
            case "en":
                if (!TextUtils.isEmpty(c21202.f68326)) {
                    return c21202.f68326;
                }
                break;
            case "es":
                if (!TextUtils.isEmpty(c21202.f68328)) {
                    return c21202.f68328;
                }
                break;
            case "in":
                if (!TextUtils.isEmpty(c21202.f68327)) {
                    return c21202.f68327;
                }
                break;
            case "ru":
                if (!TextUtils.isEmpty(c21202.f68330)) {
                    return c21202.f68330;
                }
                break;
            case "tr":
                if (!TextUtils.isEmpty(c21202.f68321)) {
                    return c21202.f68321;
                }
                break;
            case "uk":
                if (!TextUtils.isEmpty(c21202.f68329)) {
                    return c21202.f68329;
                }
                break;
            case "zh":
                if (locale.getCountry().equals("CN")) {
                    if (!TextUtils.isEmpty(c21202.f68323)) {
                        return c21202.f68323;
                    }
                } else if (!TextUtils.isEmpty(c21202.f68322)) {
                    return c21202.f68322;
                }
                break;
        }
        if (!TextUtils.isEmpty(c21202.f68326)) {
            return c21202.f68326;
        }
        return c21202.f68325;
    }
}
