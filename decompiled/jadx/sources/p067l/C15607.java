package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܰܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I81B */
/* JADX INFO: loaded from: classes3.dex */
public final class C15607 {

    /* JADX INFO: renamed from: ֫ */
    public final String f44684;

    /* JADX INFO: renamed from: ۧ */
    public final String f44685;

    public C15607(String str, String str2) {
        this.f44684 = str;
        this.f44685 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m35483() throws IOException {
        ArrayList arrayList = new ArrayList();
        String strM35482 = m35482("/buckets");
        C11349 c11349 = new C11349();
        c11349.m26292("https://uc.qiniuapi.com/buckets");
        c11349.m26286("Authorization", "Qiniu " + strM35482);
        c11349.m26291();
        try {
            C20066 c20066Execute = C7050.m16220().m42716(c11349.m26284()).execute();
            try {
                if (!c20066Execute.m45439()) {
                    if (c20066Execute.m45443() != 401 && c20066Execute.m45443() != 403) {
                        throw new IOException("Request failed: " + c20066Execute.m45443() + " " + c20066Execute.m45437());
                    }
                    throw new C20807(R.string.MT_Protector);
                }
                AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
                C12826.requireNonNull(abstractC2630M45436);
                String strM4012 = abstractC2630M45436.m4012();
                ArrayList<String> arrayList2 = new ArrayList();
                JSONArray jSONArray = new JSONArray(strM4012);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList2.add(jSONArray.getString(i));
                }
                c20066Execute.close();
                for (String str : arrayList2) {
                    String strM48631 = C21466.m48631("/v2/bucketInfo?bucket=", str);
                    String strM48632 = C21466.m48631("https://uc.qiniuapi.com", strM48631);
                    String strM35483 = m35482(strM48631);
                    C11349 c113410 = new C11349();
                    c113410.m26292(strM48632);
                    c113410.m26286("Authorization", "Qiniu " + strM35483);
                    c113410.m26291();
                    try {
                        C20066 c20066Execute2 = C7050.m16220().m42716(c113410.m26284()).execute();
                        try {
                            if (!c20066Execute2.m45439()) {
                                throw new IOException("Request failed: " + c20066Execute2.m45443() + " " + c20066Execute2.m45437());
                            }
                            AbstractC2630 abstractC2630M45437 = c20066Execute2.m45436();
                            C12826.requireNonNull(abstractC2630M45437);
                            String string = new JSONObject(abstractC2630M45437.m4012()).getString("region");
                            c20066Execute2.close();
                            string.getClass();
                            switch (string) {
                                case "z0":
                                    string = "cn-east-1";
                                    break;
                                case "z1":
                                    string = "cn-north-1";
                                    break;
                                case "z2":
                                    string = "cn-south-1";
                                    break;
                                case "as0":
                                    string = "ap-southeast-1";
                                    break;
                                case "na0":
                                    string = "us-north-1";
                                    break;
                            }
                            arrayList.add(new C8232(str, string, C6988.m16053("s3.", string, ".qiniucs.com")));
                        } catch (Throwable th) {
                            try {
                                c20066Execute2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (JSONException e) {
                        throw new IOException(e);
                    }
                    throw new IOException(e);
                }
                return arrayList;
            } catch (Throwable th3) {
                try {
                    c20066Execute.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m35482(String str) {
        String strM47154 = C20865.m47154("GET ", str, "\nHost: uc.qiniuapi.com", "\n\n");
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = strM47154.getBytes(charset);
        String str2 = this.f44685;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA1"));
            return C24420.m53894(new StringBuilder(), this.f44684, ":", C20892.getEncoder().encodeToString(mac.doFinal(bytes)).replace('+', '-').replace('/', '_'));
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }
}
