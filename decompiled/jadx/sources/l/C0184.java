package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41UK */
/* JADX INFO: loaded from: classes2.dex */
public final class C0184 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1326(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, boolean z, boolean z2, InterfaceC22057 interfaceC22057) {
        AbstractC15440 abstractC15440M36527 = C16293.f50111.m36527();
        abstractC15440M36527.m36508();
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                C3545 c3545M1324 = m1324(c18090);
                if (c3545M1324 == null) {
                    throw new C19401(R.string.MT_Protector);
                }
                C22016 c22016 = new C22016();
                C19941.m46021(c18090, c22016, null, abstractC15440M36527, interfaceC22057);
                if (interfaceC22057.mo35997()) {
                    c18090.close();
                    abstractC15440M36527.mo23552();
                    return;
                }
                interfaceC22057.mo35998();
                C3671 c3671M1325 = m1325(c18090.m42189(c3545M1324), c22016);
                if (interfaceC22057.mo35997()) {
                    c18090.close();
                    abstractC15440M36527.mo23552();
                } else {
                    C19941.m46020(abstractC15441, z, z2, interfaceC22057, c18090, abstractC15440M36527, c22016, c3671M1325, c3545M1324);
                    c18090.close();
                    abstractC15440M36527.mo23552();
                }
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC15440M36527.mo23552();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3545 m1324(C18090 c18090) {
        for (C3545 c3545 : c18090.m42210()) {
            if (!c3545.isDirectory()) {
                String lowerCase = c3545.getName().toLowerCase();
                if (!lowerCase.contains("/") && lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                    return c3545;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3671 m1325(InputStream inputStream, C22016 c22016) throws IOException {
        c22016.m49537(new C5788(c22016));
        c22016.m49537(new C6781(new C15706()));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            C12951 c12951 = new C12951(bufferedInputStream);
            ArrayList<C3713> arrayList = new ArrayList();
            C11929.m29107(c12951, new C2302(arrayList));
            bufferedInputStream.close();
            C3671 c3671 = new C3671(0);
            for (C3713 c3713 : arrayList) {
                c3671.m11181(new C2260(C9045.m23341(new StringBuilder("L"), c3713.f11716, l.b), C9045.m23341(new StringBuilder("L"), c3713.f11715, l.b)));
            }
            for (C3713 c3714 : arrayList) {
                C2966 c2966 = (C2966) c22016.m49539(c3714.f11715);
                if (c2966 != null) {
                    c2966.mo13103((Object) c3714.f11716);
                    for (C18530 c18530 : c3714.f11713) {
                        String str = c18530.f57431;
                        C10769 c10769 = new C10769(c22016.m49540(c3671.m11180(str, str)));
                        String str2 = c18530.f57432;
                        String str3 = c18530.f57433;
                        for (C12843 c12843 : c2966.m45795()) {
                            if (c12843.m13109().equals(str2) && c12843.m13108().equals(c10769)) {
                                C15706.m37039(c12843).mo13103(str3);
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (C19236 c19236 : c3714.f11714) {
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_START);
                        C18070 c18070 = new C18070(c19236.f60544);
                        while (c18070.m42135()) {
                            String strM42136 = c18070.m42136();
                            arrayList2.add(c22016.m49540(c3671.m11180(strM42136, strM42136)));
                        }
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_END);
                        String str4 = c19236.f60544;
                        String strSubstring = str4.substring(str4.indexOf(41) + 1);
                        arrayList2.add(c22016.m49540(c3671.m11180(strSubstring, strSubstring)));
                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                        C1596 c1596 = new C1596(strArr, strArr.length);
                        arrayList2.clear();
                        String str5 = c19236.f60545;
                        String str6 = c19236.f60546;
                        for (C10022 c10022 : c2966.m45797()) {
                            if (c10022.m13109().equals(str5) && c10022.m13108().equals(c1596)) {
                                C15706.m37039(c10022).mo13103(str6);
                                break;
                            }
                        }
                    }
                }
            }
            C3671 c3672 = new C3671(0);
            c22016.m49537(new C14959(c3672));
            return c3672;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
