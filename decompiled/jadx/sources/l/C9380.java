package l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۢۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7AP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9380 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f28494 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m24219(C15996 c15996) {
        EnumC1180 enumC1180;
        String strM14306;
        EnumC1180 enumC1181;
        String strM14307;
        int i;
        EnumC4003 enumC4003M37807 = c15996.m37807();
        if (EnumC4003.GET.equals(enumC4003M37807)) {
            String strM40234 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
            if (!TextUtils.isEmpty(strM40234)) {
                C23490 c23490M24214 = m24214(strM40234, true);
                C8236 c8236 = c23490M24214.f75421;
                if (c8236 != null) {
                    return c8236;
                }
                try {
                    C11273 c11273M41185 = C17622.m41185(new C4733(c23490M24214.f75422.mo24433()), -1, new C11461());
                    if (c11273M41185 == null) {
                        return C2884.m8818(EnumC1180.INTERNAL_ERROR, C4925.m14306(R.string.MT_Protector, new Object[0]));
                    }
                    if (c11273M41185.f33777 != null) {
                        m24215(c11273M41185);
                        return C2884.m8818(EnumC1180.PAYLOAD_TOO_LARGE, C4925.m14306(R.string.MT_Protector, new Object[0]));
                    }
                    CharSequence charSequence = c11273M41185.f33779;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    return m24212(m24211(c23490M24214, c11273M41185), charSequence);
                } catch (C1637 e) {
                    e = e;
                    return C2884.m8818(EnumC1180.INTERNAL_ERROR, e.getMessage());
                } catch (C19401 e2) {
                    e = e2;
                    return C2884.m8818(EnumC1180.INTERNAL_ERROR, e.getMessage());
                } catch (Exception unused) {
                    return C2884.m8818(EnumC1180.INTERNAL_ERROR, C4925.m14306(R.string.MT_Protector, new Object[0]));
                }
            }
            enumC1181 = EnumC1180.BAD_REQUEST;
            strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        } else if (EnumC4003.PUT.equals(enumC4003M37807)) {
            try {
                C6557 c6557M24218 = m24218(c15996);
                if (TextUtils.isEmpty(c6557M24218.f20235)) {
                    enumC1181 = EnumC1180.BAD_REQUEST;
                    strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                } else if (c6557M24218.f20233 == null) {
                    enumC1181 = EnumC1180.BAD_REQUEST;
                    strM14307 = C4925.m14306(R.string.MT_Protector, TextBundle.TEXT_ENTRY);
                } else if (TextUtils.isEmpty(c6557M24218.f20234)) {
                    enumC1181 = EnumC1180.BAD_REQUEST;
                    strM14307 = C4925.m14306(R.string.MT_Protector, "lineBreak");
                } else if (TextUtils.isEmpty(c6557M24218.f20236)) {
                    enumC1181 = EnumC1180.BAD_REQUEST;
                    strM14307 = C4925.m14306(R.string.MT_Protector, "parametersToken");
                } else {
                    String str = c6557M24218.f20234;
                    if ("\n".equals(str) || "\r\n".equals(str) || "\r".equals(str)) {
                        String strM43784 = C18965.m43784(c6557M24218.f20235);
                        try {
                            C20669 c20669M24213 = m24213(c6557M24218.f20236);
                            if (strM43784.equals(c20669M24213.f66565)) {
                                if (c6557M24218.f20232) {
                                    if (c20669M24213.f66564.f74226 != 0 || (i = c6557M24218.f20231) < 0 || i >= C14776.f45125) {
                                        enumC1181 = EnumC1180.BAD_REQUEST;
                                        strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                                    } else {
                                        c20669M24213.f66564.f74223 = c6557M24218.f20231;
                                    }
                                }
                                C23490 c23490M24215 = m24214(strM43784, false);
                                C8236 c8237 = c23490M24215.f75421;
                                if (c8237 != null) {
                                    return c8237;
                                }
                                try {
                                    C1394.m4881(new C4733(c23490M24215.f75422.mo24433()), c6557M24218.f20233, c6557M24218.f20234, c20669M24213.f66564);
                                    AbstractC15440 abstractC15440M39866 = C16999.m39866(strM43784, new String[0]);
                                    HashMap map = new HashMap();
                                    map.put("item", C21082.m47981(new C9555(abstractC15440M39866)));
                                    return C2884.m8817(map);
                                } catch (Exception unused2) {
                                    enumC1180 = EnumC1180.INTERNAL_ERROR;
                                    strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                                    return C2884.m8818(enumC1180, strM14306);
                                }
                            }
                            enumC1181 = EnumC1180.BAD_REQUEST;
                            strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                        } catch (RuntimeException unused3) {
                            enumC1180 = EnumC1180.BAD_REQUEST;
                            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                        }
                    } else {
                        enumC1181 = EnumC1180.BAD_REQUEST;
                        strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                    }
                }
            } catch (RuntimeException | C10791 | C16434 unused4) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC1181 = EnumC1180.METHOD_NOT_ALLOWED;
            strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        }
        return C2884.m8818(enumC1181, strM14307);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m24211(C23490 c23490, C11273 c11273) {
        int i;
        ?? arrayList;
        HashMap map = new HashMap();
        String str = c23490.f75423;
        map.put(MotionUtils.EASING_TYPE_PATH, str);
        InterfaceC17889 interfaceC17889 = c23490.f75422;
        map.put("name", interfaceC17889.getName());
        map.put("lineBreak", c11273.f33776);
        C23077 c23077 = c11273.f33778;
        String strM35153 = "?";
        if (c23077 != null) {
            if (c23077.m51241()) {
                strM35153 = "AXML";
            } else if (c23077.m51240()) {
                strM35153 = "ABX";
            } else if (c23077.m51242()) {
                strM35153 = "Class";
            } else {
                int i2 = c23077.f74223;
                if (i2 >= 0 && i2 < C14776.f45125) {
                    strM35153 = C14776.m35153(i2);
                }
            }
        }
        map.put("textFormatName", strM35153);
        String str2 = "unknown";
        if (c23077 != null) {
            if (c23077.f74226 == 0) {
                str2 = TextBundle.TEXT_ENTRY;
            } else if (c23077.m51241()) {
                str2 = "axml";
            } else if (c23077.m51240()) {
                str2 = "abx";
            } else if (c23077.m51242()) {
                str2 = Name.LABEL;
            }
        }
        map.put("textFormatType", str2);
        if (c23077 == null || c23077.f74226 != 0 || (i = c23077.f74223) < 0 || i >= C14776.f45125) {
            i = -1;
        }
        map.put("charsetIndex", Integer.valueOf(i));
        if (c23077 == null || c23077.f74226 != 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(C14776.f45125);
            for (int i3 = 0; i3 < C14776.f45125; i3++) {
                HashMap map2 = new HashMap();
                map2.put("index", Integer.valueOf(i3));
                map2.put("name", C14776.m35153(i3));
                arrayList.add(map2);
            }
        }
        map.put("availableCharsets", arrayList);
        C10130 c10130 = new C10130();
        c10130.writeInt(1297373268);
        c10130.writeInt(1);
        c10130.m25439(str);
        c23077.m51239(c10130);
        byte[] bArrM25427 = c10130.m25427();
        map.put("parametersToken", Base64.encodeToString(bArrM25427, 11) + "." + Base64.encodeToString(m24217(bArrM25427), 11));
        map.put("size", Long.valueOf(interfaceC17889.getSize()));
        map.put("time", C17283.m40576(interfaceC17889.getTime()));
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m24212(HashMap map, CharSequence charSequence) {
        byte[] bytes = C6411.m17735((Map) map).toString().getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = C3200.m9831(bytes.length, "\n", new StringBuilder("MTTEXTREAD/1\n")).getBytes(StandardCharsets.US_ASCII);
        int length = bytes2.length + bytes.length;
        byte[] bArr = new byte[length];
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        System.arraycopy(bytes, 0, bArr, bytes2.length, bytes.length);
        return AbstractC4708.m13783(EnumC1180.OK, "application/vnd.mt.text-file+raw; charset=UTF-8", new C14317(bArr, charSequence), ((long) length) + ((long) C5773.m16233(charSequence)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23490 m24214(String str, boolean z) {
        String strM43784 = C18965.m43784(str);
        C9555 c9555M18837 = C6970.m18837(strM43784);
        if (c9555M18837 == null || !c9555M18837.mo24433().mo23120()) {
            return C23490.m51941(strM43784, C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0])));
        }
        if (c9555M18837.isDirectory()) {
            return C23490.m51941(strM43784, C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0])));
        }
        if (z && c9555M18837.getSize() > 5242880) {
            return C23490.m51941(strM43784, C2884.m8818(EnumC1180.PAYLOAD_TOO_LARGE, C4925.m14306(R.string.MT_Protector, new Object[0])));
        }
        return C23490.m51942(strM43784, c9555M18837);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24215(C11273 c11273) {
        ArrayList arrayList = c11273.f33777;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC15440) it.next()).mo23552();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C6557 m24218(C15996 c15996) {
        String strM37809;
        C6557 c6557 = new C6557();
        c6557.f20235 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
        if (c15996.m37808()) {
            strM37809 = c15996.m37809();
        } else {
            if (C17140.m40235(c15996)) {
                throw new IllegalArgumentException("Transfer-Encoding is not supported");
            }
            strM37809 = C17140.m40232(c15996, C17140.m40236(c15996)).f54518;
        }
        c6557.f20233 = strM37809;
        c6557.f20234 = C17140.m40234(c15996, "lineBreak");
        c6557.f20236 = C17140.m40231(c15996, "X-MT-Text-Parameters-Token");
        String strM40234 = C17140.m40234(c15996, "charsetIndex");
        if (TextUtils.isEmpty(strM40234)) {
            return c6557;
        }
        c6557.f20232 = true;
        try {
            c6557.f20231 = Integer.parseInt(strM40234);
            return c6557;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("charsetIndex is invalid", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20669 m24213(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(46);
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46) || iIndexOf >= str.length() - 1) {
            throw new IllegalArgumentException("Invalid token");
        }
        byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
        if (!MessageDigest.isEqual(m24217(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
            throw new IllegalArgumentException("Invalid token signature");
        }
        C12951 c12951M31485 = C12951.m31485(bArrDecode);
        if (c12951M31485.readInt() != 1297373268 || c12951M31485.readInt() != 1) {
            throw new IllegalArgumentException("Invalid token version");
        }
        String strM31506 = c12951M31485.m31506();
        C23077 c23077 = new C23077(c12951M31485);
        if (c12951M31485.available() != 0) {
            throw new IllegalArgumentException("Unexpected token tail");
        }
        return new C20669(strM31506, c23077);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24216() {
        synchronized (f28494) {
            SharedPreferences sharedPreferences = C4925.m14335().getSharedPreferences("remote_text", 0);
            String string = sharedPreferences.getString("parameters_hmac_key", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    byte[] bArrDecode = Base64.decode(string, 11);
                    if (bArrDecode.length == 32) {
                        return bArrDecode;
                    }
                } catch (RuntimeException unused) {
                }
            }
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            sharedPreferences.edit().putString("parameters_hmac_key", Base64.encodeToString(bArr, 11)).commit();
            return bArr;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24217(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(m24216(), "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
