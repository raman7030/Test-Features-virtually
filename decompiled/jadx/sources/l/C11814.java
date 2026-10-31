package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۨܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R811 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11814 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28880(String str, String str2, HashMap map) {
        String string;
        String string2;
        String str3;
        String str4;
        Iterator it;
        String str5 = "=";
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String str6 = (jCurrentTimeMillis - 60) + l.b + (jCurrentTimeMillis - (-3540));
            Mac mac = Mac.getInstance("HmacSHA1");
            Charset charset = StandardCharsets.UTF_8;
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA1"));
            String strM28881 = m28881(mac.doFinal(str6.getBytes(charset)));
            if (map.isEmpty()) {
                string = "";
                string2 = string;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(((String) it2.next()).toLowerCase());
                }
                Collections.sort(arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str7 = (String) it3.next();
                    Iterator it4 = map.keySet().iterator();
                    do {
                        if (!it4.hasNext()) {
                            str3 = str7;
                            break;
                        }
                        str3 = (String) it4.next();
                    } while (!str3.toLowerCase().equals(str7));
                    StringBuilder sb = new StringBuilder();
                    sb.append(str7);
                    sb.append(str5);
                    String strReplace = (String) map.get(str3);
                    try {
                        str4 = str5;
                        it = it3;
                        try {
                            strReplace = C12789.encode(strReplace, a.D).replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20").replace("*", "%2A").replace("%7E", "~");
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        str4 = str5;
                        it = it3;
                    }
                    sb.append(strReplace);
                    arrayList2.add(sb.toString());
                    it3 = it;
                    str5 = str4;
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it5 = arrayList.iterator();
                if (it5.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it5.next());
                        if (!it5.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) l.b);
                    }
                }
                string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                Iterator it6 = arrayList2.iterator();
                if (it6.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it6.next());
                        if (!it6.hasNext()) {
                            break;
                        }
                        sb3.append((CharSequence) a.p);
                    }
                }
                string2 = sb3.toString();
            }
            String str8 = "GET".toLowerCase() + "\n/\n\n" + string2 + "\n";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("sha1\n");
            sb4.append(str6);
            sb4.append("\n");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            Charset charset2 = StandardCharsets.UTF_8;
            sb4.append(m28881(messageDigest.digest(str8.getBytes(charset2))));
            sb4.append("\n");
            String string3 = sb4.toString();
            Mac mac2 = Mac.getInstance("HmacSHA1");
            mac2.init(new SecretKeySpec(strM28881.getBytes(charset2), "HmacSHA1"));
            return "q-sign-algorithm=sha1&q-ak=" + str + "&q-sign-time=" + str6 + "&q-key-time=" + str6 + "&q-header-list=" + string + "&q-url-param-list=&q-signature=" + m28881(mac2.doFinal(string3.getBytes(charset2)));
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28881(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
