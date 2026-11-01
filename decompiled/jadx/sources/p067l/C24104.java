package p067l;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: renamed from: l.᩺۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24104 implements InterfaceC9934, InterfaceC18263 {
    /* JADX INFO: renamed from: ֫ */
    public static String m53357(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ List m53358(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int iM25047 = 0;
        while (iM25047 < length) {
            Object obj = objArr[iM25047];
            iM25047 = C10878.m25047(obj, arrayList, obj, iM25047, 1);
        }
        return C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ASN1ObjectIdentifier m53359(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53360(InterfaceC14100 interfaceC14100, String str, boolean z) {
        interfaceC14100.edit().putBoolean(str, z).apply();
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        return C16010.m36384((InterfaceC20309) obj, true);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }
}
