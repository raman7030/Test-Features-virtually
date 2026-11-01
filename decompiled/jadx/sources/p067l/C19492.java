package p067l;

import android.util.Base64;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.umeng.analytics.pro.C0655am;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ᩳۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P3YK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19492 {

    /* JADX INFO: renamed from: ֫ */
    public static byte[] f59385;

    /* JADX INFO: renamed from: ۧ */
    public static byte[] f59386;

    /* JADX INFO: renamed from: ܽ */
    public static String f59387;

    /* JADX INFO: renamed from: ᩳ */
    public static String f59388;

    /* JADX INFO: renamed from: ֫ */
    public static String m44321(String str, String str2, String str3) throws IOException {
        String str4 = str2;
        if (str4.equals("zh")) {
            str4 = "zh-CHS";
        }
        if (str3.equals("zh")) {
            str3 = "zh-CHS";
        }
        if (f59387 == null) {
            String headerField = new C16138("https://fanyi.youdao.com/", false).m36724().getHeaderField("Set-Cookie");
            if (headerField == null) {
                throw new IOException("Can not get cookie");
            }
            int iIndexOf = headerField.indexOf(59);
            if (iIndexOf != -1) {
                headerField = headerField.substring(0, iIndexOf);
            }
            f59387 = headerField;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C16138 c16138 = new C16138("https://dict.youdao.com/webtranslate/key?keyid=webfanyi-key-getter-2025&sign=" + C16111.m36658("client=fanyideskweb&mysticTime=" + jCurrentTimeMillis + "&product=webfanyi&key=yU5nT5dK3eZ1pI4j") + "&client=fanyideskweb&product=webfanyi&appVersion=1.0.0&vendor=web&pointParam=client,mysticTime,product&mysticTime=" + jCurrentTimeMillis + "&keyfrom=fanyi.web&mid=1&screen=1&model=1&network=wifi&abtest=0&yduuid=abcdefg", false);
            c16138.m36727("Cookie", f59387);
            c16138.m36727("Referer", "https://fanyi.youdao.com/");
            JSONObject jSONObject = new JSONObject(c16138.m36726());
            if (jSONObject.getInt("code") != 0) {
                throw new IOException(jSONObject.getString("msg"));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractC0213e.f989m);
            f59388 = jSONObject2.getString("secretKey");
            f59386 = C16111.m36660().digest(jSONObject2.getString("aesKey").getBytes());
            f59385 = C16111.m36660().digest(jSONObject2.getString("aesIv").getBytes());
        }
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C16138 c16139 = new C16138("https://dict.youdao.com/webtranslate", true);
            c16139.m36727("Cookie", f59387);
            c16139.m36727("Referer", "https://fanyi.youdao.com/");
            c16139.m36725(C0655am.f2275aC, str);
            c16139.m36725("from", str4);
            c16139.m36725("to", str3);
            c16139.m36725("useTerm", "false");
            c16139.m36725("domain", "0");
            c16139.m36725("dictResult", "true");
            c16139.m36725("keyid", "webfanyi");
            c16139.m36725("sign", C16111.m36658("client=fanyideskweb&mysticTime=" + jCurrentTimeMillis2 + "&product=webfanyi&key=" + f59388));
            c16139.m36725("client", "fanyideskweb");
            c16139.m36725("product", "webfanyi");
            c16139.m36725("appVersion", "1.0.0");
            c16139.m36725("vendor", "web");
            c16139.m36725("pointParam", "client,mysticTime,product");
            c16139.m36725("mysticTime", String.valueOf(jCurrentTimeMillis2));
            c16139.m36725("keyfrom", "fanyi.web");
            c16139.m36725("mid", "1");
            c16139.m36725("screen", "1");
            c16139.m36725("model", "1");
            c16139.m36725("network", "wifi");
            c16139.m36725("abtest", "0");
            c16139.m36725("yduuid", "abcdefg");
            byte[] bArrDecode = Base64.decode(c16139.m36726().replace('_', '/').replace('-', '+'), 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(f59386, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f59385);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            JSONObject jSONObject3 = new JSONObject(new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8));
            int i = jSONObject3.getInt("code");
            if (i == 0) {
                JSONArray jSONArray = jSONObject3.getJSONArray("translateResult");
                StringBuilder sb = new StringBuilder();
                int size = jSONArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append(jSONArray.getJSONArray(i2).getJSONObject(0).getString("tgt"));
                }
                return sb.toString();
            }
            if (i == 50) {
                f59387 = null;
            }
            throw new IOException(jSONObject3.toString());
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
