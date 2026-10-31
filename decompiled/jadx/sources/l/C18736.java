package l;

import bin.mt.json.JSONObject;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: renamed from: l.ᩴۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D73Y */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18736 implements InterfaceC7961, InterfaceC0390 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m43390(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        return C1648.m5532(jSONObject.add(str3, C1648.m5545(str, str2)), str4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m43391(ASN1Sequence aSN1Sequence, int i) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets();
    }

    @Override // l.InterfaceC0390
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo1886(InputStream inputStream) {
        return new C3768(inputStream);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }
}
