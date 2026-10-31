package l;

import android.util.Base64;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ᩳۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P3YK */
/* JADX INFO: loaded from: classes4.dex */
public final class C18017 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] f56188;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] f56189;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f56190;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String f56191;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42071(String str, String str2, String str3) throws IOException {
        String str4 = str2;
        if (str4.equals("zh")) {
            str4 = "zh-CHS";
        }
        if (str3.equals("zh")) {
            str3 = "zh-CHS";
        }
        if (f56190 == null) {
            String headerField = new C14488("https://fanyi.youdao.com/", false).m34583().getHeaderField("Set-Cookie");
            if (headerField == null) {
                throw new IOException("Can not get cookie");
            }
            int iIndexOf = headerField.indexOf(59);
            if (iIndexOf != -1) {
                headerField = headerField.substring(0, iIndexOf);
            }
            f56190 = headerField;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C14488 c14488 = new C14488("https://dict.youdao.com/webtranslate/key?keyid=webfanyi-key-getter-2025&sign=" + C14460.m34524("client=fanyideskweb&mysticTime=" + jCurrentTimeMillis + "&product=webfanyi&key=yU5nT5dK3eZ1pI4j") + "&client=fanyideskweb&product=webfanyi&appVersion=1.0.0&vendor=web&pointParam=client,mysticTime,product&mysticTime=" + jCurrentTimeMillis + "&keyfrom=fanyi.web&mid=1&screen=1&model=1&network=wifi&abtest=0&yduuid=abcdefg", false);
            c14488.m34586("Cookie", f56190);
            c14488.m34586("Referer", "https://fanyi.youdao.com/");
            JSONObject jSONObject = new JSONObject(c14488.m34585());
            if (jSONObject.getInt("code") != 0) {
                throw new IOException(jSONObject.getString("msg"));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(e.m);
            f56191 = jSONObject2.getString("secretKey");
            f56189 = C14460.m34526().digest(jSONObject2.getString("aesKey").getBytes());
            f56188 = C14460.m34526().digest(jSONObject2.getString("aesIv").getBytes());
        }
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C14488 c14489 = new C14488("https://dict.youdao.com/webtranslate", true);
            c14489.m34586("Cookie", f56190);
            c14489.m34586("Referer", "https://fanyi.youdao.com/");
            c14489.m34584(am.aC, str);
            c14489.m34584("from", str4);
            c14489.m34584("to", str3);
            c14489.m34584("useTerm", "false");
            c14489.m34584("domain", "0");
            c14489.m34584("dictResult", "true");
            c14489.m34584("keyid", "webfanyi");
            c14489.m34584("sign", C14460.m34524("client=fanyideskweb&mysticTime=" + jCurrentTimeMillis2 + "&product=webfanyi&key=" + f56191));
            c14489.m34584("client", "fanyideskweb");
            c14489.m34584("product", "webfanyi");
            c14489.m34584("appVersion", "1.0.0");
            c14489.m34584("vendor", "web");
            c14489.m34584("pointParam", "client,mysticTime,product");
            c14489.m34584("mysticTime", String.valueOf(jCurrentTimeMillis2));
            c14489.m34584("keyfrom", "fanyi.web");
            c14489.m34584("mid", "1");
            c14489.m34584("screen", "1");
            c14489.m34584("model", "1");
            c14489.m34584("network", "wifi");
            c14489.m34584("abtest", "0");
            c14489.m34584("yduuid", "abcdefg");
            byte[] bArrDecode = Base64.decode(c14489.m34585().replace('_', '/').replace('-', '+'), 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(f56189, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f56188);
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
                f56190 = null;
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
