package p067l;

import bin.p000mt.json.JSONObject;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: renamed from: l.ᩴۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D73Y */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20175 implements InterfaceC9934, InterfaceC2739 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m45657(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        return C3935.m7762(jSONObject.add(str3, C3935.m7775(str, str2)), str4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m45658(ASN1Sequence aSN1Sequence, int i) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets();
    }

    @Override // p067l.InterfaceC2739
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo4278(InputStream inputStream) {
        return new C5949(inputStream);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }
}
