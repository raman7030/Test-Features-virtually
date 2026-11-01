package p067l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import bin.p000mt.plus.R;
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
public final class C11283 {

    /* JADX INFO: renamed from: ֫ */
    public static final Object f31443 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m26229(C17571 c17571) {
        EnumC3490 enumC3490;
        String strM16203;
        EnumC3490 enumC3491;
        String strM16204;
        int i;
        EnumC6173 enumC6173M39993 = c17571.m39993();
        if (EnumC6173.GET.equals(enumC6173M39993)) {
            String strM42479 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
            if (!TextUtils.isEmpty(strM42479)) {
                C24693 c24693M26224 = m26224(strM42479, true);
                C10196 c10196 = c24693M26224.f78168;
                if (c10196 != null) {
                    return c10196;
                }
                try {
                    C13083 c13083M43431 = C19117.m43431(new C6867(c24693M26224.f78169.mo26445()), -1, new C13261());
                    if (c13083M43431 == null) {
                        return C5109.m10885(EnumC3490.INTERNAL_ERROR, C7050.m16203(R.string.MT_Protector, new Object[0]));
                    }
                    if (c13083M43431.f36777 != null) {
                        m26225(c13083M43431);
                        return C5109.m10885(EnumC3490.PAYLOAD_TOO_LARGE, C7050.m16203(R.string.MT_Protector, new Object[0]));
                    }
                    CharSequence charSequence = c13083M43431.f36779;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    return m26222(m26221(c24693M26224, c13083M43431), charSequence);
                } catch (C3924 e) {
                    e = e;
                    return C5109.m10885(EnumC3490.INTERNAL_ERROR, e.getMessage());
                } catch (C20807 e2) {
                    e = e2;
                    return C5109.m10885(EnumC3490.INTERNAL_ERROR, e.getMessage());
                } catch (Exception unused) {
                    return C5109.m10885(EnumC3490.INTERNAL_ERROR, C7050.m16203(R.string.MT_Protector, new Object[0]));
                }
            }
            enumC3491 = EnumC3490.BAD_REQUEST;
            strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        } else if (EnumC6173.PUT.equals(enumC6173M39993)) {
            try {
                C8600 c8600M26228 = m26228(c17571);
                if (TextUtils.isEmpty(c8600M26228.f23113)) {
                    enumC3491 = EnumC3490.BAD_REQUEST;
                    strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                } else if (c8600M26228.f23111 == null) {
                    enumC3491 = EnumC3490.BAD_REQUEST;
                    strM16204 = C7050.m16203(R.string.MT_Protector, TextBundle.TEXT_ENTRY);
                } else if (TextUtils.isEmpty(c8600M26228.f23112)) {
                    enumC3491 = EnumC3490.BAD_REQUEST;
                    strM16204 = C7050.m16203(R.string.MT_Protector, "lineBreak");
                } else if (TextUtils.isEmpty(c8600M26228.f23114)) {
                    enumC3491 = EnumC3490.BAD_REQUEST;
                    strM16204 = C7050.m16203(R.string.MT_Protector, "parametersToken");
                } else {
                    String str = c8600M26228.f23112;
                    if ("\n".equals(str) || "\r\n".equals(str) || "\r".equals(str)) {
                        String strM46051 = C20393.m46051(c8600M26228.f23113);
                        try {
                            C22012 c22012M26223 = m26223(c8600M26228.f23114);
                            if (strM46051.equals(c22012M26223.f69247)) {
                                if (c8600M26228.f23110) {
                                    if (c22012M26223.f69246.f76971 != 0 || (i = c8600M26228.f23109) < 0 || i >= C16412.f48239) {
                                        enumC3491 = EnumC3490.BAD_REQUEST;
                                        strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                                    } else {
                                        c22012M26223.f69246.f76968 = c8600M26228.f23109;
                                    }
                                }
                                C24693 c24693M26225 = m26224(strM46051, false);
                                C10196 c10197 = c24693M26225.f78168;
                                if (c10197 != null) {
                                    return c10197;
                                }
                                try {
                                    C3694.m7119(new C6867(c24693M26225.f78169.mo26445()), c8600M26228.f23111, c8600M26228.f23112, c22012M26223.f69246);
                                    AbstractC17043 abstractC17043M42109 = C18524.m42109(strM46051, new String[0]);
                                    HashMap map = new HashMap();
                                    map.put("item", C22405.m50311(new C11450(abstractC17043M42109)));
                                    return C5109.m10884(map);
                                } catch (Exception unused2) {
                                    enumC3490 = EnumC3490.INTERNAL_ERROR;
                                    strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                                    return C5109.m10885(enumC3490, strM16203);
                                }
                            }
                            enumC3491 = EnumC3490.BAD_REQUEST;
                            strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                        } catch (RuntimeException unused3) {
                            enumC3490 = EnumC3490.BAD_REQUEST;
                            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                        }
                    } else {
                        enumC3491 = EnumC3490.BAD_REQUEST;
                        strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                    }
                }
            } catch (RuntimeException | C12624 | C17987 unused4) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC3491 = EnumC3490.METHOD_NOT_ALLOWED;
            strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        }
        return C5109.m10885(enumC3491, strM16204);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ֫ */
    public static HashMap m26221(C24693 c24693, C13083 c13083) {
        int i;
        ?? arrayList;
        HashMap map = new HashMap();
        String str = c24693.f78170;
        map.put(MotionUtils.EASING_TYPE_PATH, str);
        InterfaceC19370 interfaceC19370 = c24693.f78169;
        map.put("name", interfaceC19370.getName());
        map.put("lineBreak", c13083.f36776);
        C24301 c24301 = c13083.f36778;
        String strM37300 = "?";
        if (c24301 != null) {
            if (c24301.m53634()) {
                strM37300 = "AXML";
            } else if (c24301.m53633()) {
                strM37300 = "ABX";
            } else if (c24301.m53635()) {
                strM37300 = "Class";
            } else {
                int i2 = c24301.f76968;
                if (i2 >= 0 && i2 < C16412.f48239) {
                    strM37300 = C16412.m37300(i2);
                }
            }
        }
        map.put("textFormatName", strM37300);
        String str2 = "unknown";
        if (c24301 != null) {
            if (c24301.f76971 == 0) {
                str2 = TextBundle.TEXT_ENTRY;
            } else if (c24301.m53634()) {
                str2 = "axml";
            } else if (c24301.m53633()) {
                str2 = "abx";
            } else if (c24301.m53635()) {
                str2 = Name.LABEL;
            }
        }
        map.put("textFormatType", str2);
        if (c24301 == null || c24301.f76971 != 0 || (i = c24301.f76968) < 0 || i >= C16412.f48239) {
            i = -1;
        }
        map.put("charsetIndex", Integer.valueOf(i));
        if (c24301 == null || c24301.f76971 != 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(C16412.f48239);
            for (int i3 = 0; i3 < C16412.f48239; i3++) {
                HashMap map2 = new HashMap();
                map2.put("index", Integer.valueOf(i3));
                map2.put("name", C16412.m37300(i3));
                arrayList.add(map2);
            }
        }
        map.put("availableCharsets", arrayList);
        C11996 c11996 = new C11996();
        c11996.writeInt(1297373268);
        c11996.writeInt(1);
        c11996.m27459(str);
        c24301.m53632(c11996);
        byte[] bArrM27447 = c11996.m27447();
        map.put("parametersToken", Base64.encodeToString(bArrM27447, 11) + "." + Base64.encodeToString(m26227(bArrM27447), 11));
        map.put("size", Long.valueOf(interfaceC19370.getSize()));
        map.put("time", C18794.m42827(interfaceC19370.getTime()));
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10196 m26222(HashMap map, CharSequence charSequence) {
        byte[] bytes = C8461.m19682((Map) map).toString().getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = C5410.m11876(bytes.length, "\n", new StringBuilder("MTTEXTREAD/1\n")).getBytes(StandardCharsets.US_ASCII);
        int length = bytes2.length + bytes.length;
        byte[] bArr = new byte[length];
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        System.arraycopy(bytes, 0, bArr, bytes2.length, bytes.length);
        return AbstractC6843.m15659(EnumC3490.OK, "application/vnd.mt.text-file+raw; charset=UTF-8", new C15975(bArr, charSequence), ((long) length) + ((long) C7855.m18152(charSequence)));
    }

    /* JADX INFO: renamed from: ֫ */
    private C24693 m26224(String str, boolean z) {
        String strM46051 = C20393.m46051(str);
        C11450 c11450M20791 = C8993.m20791(strM46051);
        if (c11450M20791 == null || !c11450M20791.mo26445().mo25094()) {
            return C24693.m54343(strM46051, C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0])));
        }
        if (c11450M20791.isDirectory()) {
            return C24693.m54343(strM46051, C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0])));
        }
        if (z && c11450M20791.getSize() > 5242880) {
            return C24693.m54343(strM46051, C5109.m10885(EnumC3490.PAYLOAD_TOO_LARGE, C7050.m16203(R.string.MT_Protector, new Object[0])));
        }
        return C24693.m54344(strM46051, c11450M20791);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26225(C13083 c13083) {
        ArrayList arrayList = c13083.f36777;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC17043) it.next()).mo25503();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C8600 m26228(C17571 c17571) {
        String strM39995;
        C8600 c8600 = new C8600();
        c8600.f23113 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
        if (c17571.m39994()) {
            strM39995 = c17571.m39995();
        } else {
            if (C18658.m42480(c17571)) {
                throw new IllegalArgumentException("Transfer-Encoding is not supported");
            }
            strM39995 = C18658.m42477(c17571, C18658.m42481(c17571)).f57716;
        }
        c8600.f23111 = strM39995;
        c8600.f23112 = C18658.m42479(c17571, "lineBreak");
        c8600.f23114 = C18658.m42476(c17571, "X-MT-Text-Parameters-Token");
        String strM42479 = C18658.m42479(c17571, "charsetIndex");
        if (TextUtils.isEmpty(strM42479)) {
            return c8600;
        }
        c8600.f23110 = true;
        try {
            c8600.f23109 = Integer.parseInt(strM42479);
            return c8600;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("charsetIndex is invalid", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22012 m26223(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(46);
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46) || iIndexOf >= str.length() - 1) {
            throw new IllegalArgumentException("Invalid token");
        }
        byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
        if (!MessageDigest.isEqual(m26227(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
            throw new IllegalArgumentException("Invalid token signature");
        }
        C14677 c14677M33572 = C14677.m33572(bArrDecode);
        if (c14677M33572.readInt() != 1297373268 || c14677M33572.readInt() != 1) {
            throw new IllegalArgumentException("Invalid token version");
        }
        String strM33593 = c14677M33572.m33593();
        C24301 c24301 = new C24301(c14677M33572);
        if (c14677M33572.available() != 0) {
            throw new IllegalArgumentException("Unexpected token tail");
        }
        return new C22012(strM33593, c24301);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26226() {
        synchronized (f31443) {
            SharedPreferences sharedPreferences = C7050.m16232().getSharedPreferences("remote_text", 0);
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26227(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(m26226(), "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
