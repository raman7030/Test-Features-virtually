package l;

import bin.mt.plus.R;
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
public final class C13929 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f41603;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f41604;

    public C13929(String str, String str2) {
        this.f41603 = str;
        this.f41604 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m33364() throws IOException {
        ArrayList arrayList = new ArrayList();
        String strM33363 = m33363("/buckets");
        C9449 c9449 = new C9449();
        c9449.m24282("https://uc.qiniuapi.com/buckets");
        c9449.m24276("Authorization", "Qiniu " + strM33363);
        c9449.m24281();
        try {
            C18621 c18621Execute = C4925.m14323().m40469(c9449.m24274()).execute();
            try {
                if (!c18621Execute.m43173()) {
                    if (c18621Execute.m43177() != 401 && c18621Execute.m43177() != 403) {
                        throw new IOException("Request failed: " + c18621Execute.m43177() + " " + c18621Execute.m43171());
                    }
                    throw new C19401(R.string.MT_Protector);
                }
                AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
                C11003.requireNonNull(abstractC0275M43170);
                String strM1612 = abstractC0275M43170.m1612();
                ArrayList<String> arrayList2 = new ArrayList();
                JSONArray jSONArray = new JSONArray(strM1612);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList2.add(jSONArray.getString(i));
                }
                c18621Execute.close();
                for (String str : arrayList2) {
                    String strM46315 = C20094.m46315("/v2/bucketInfo?bucket=", str);
                    String strM46316 = C20094.m46315("https://uc.qiniuapi.com", strM46315);
                    String strM33364 = m33363(strM46315);
                    C9449 c94410 = new C9449();
                    c94410.m24282(strM46316);
                    c94410.m24276("Authorization", "Qiniu " + strM33364);
                    c94410.m24281();
                    try {
                        C18621 c18621Execute2 = C4925.m14323().m40469(c94410.m24274()).execute();
                        try {
                            if (!c18621Execute2.m43173()) {
                                throw new IOException("Request failed: " + c18621Execute2.m43177() + " " + c18621Execute2.m43171());
                            }
                            AbstractC0275 abstractC0275M43171 = c18621Execute2.m43170();
                            C11003.requireNonNull(abstractC0275M43171);
                            String string = new JSONObject(abstractC0275M43171.m1612()).getString("region");
                            c18621Execute2.close();
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
                            arrayList.add(new C6169(str, string, C4860.m14172("s3.", string, ".qiniucs.com")));
                        } catch (Throwable th) {
                            try {
                                c18621Execute2.close();
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
                    c18621Execute.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m33363(String str) {
        String strM44858 = C19462.m44858("GET ", str, "\nHost: uc.qiniuapi.com", "\n\n");
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = strM44858.getBytes(charset);
        String str2 = this.f41604;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA1"));
            return C23202.m51498(new StringBuilder(), this.f41603, ":", C19490.getEncoder().encodeToString(mac.doFinal(bytes)).replace('+', '-').replace('/', '_'));
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }
}
