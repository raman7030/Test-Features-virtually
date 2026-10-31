package l;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: renamed from: l.᩺۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22870 implements InterfaceC7961, InterfaceC16724 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50967(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ List m50968(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int iM23073 = 0;
        while (iM23073 < length) {
            Object obj = objArr[iM23073];
            iM23073 = C8954.m23073(obj, arrayList, obj, iM23073, 1);
        }
        return C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ASN1ObjectIdentifier m50969(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50970(InterfaceC12344 interfaceC12344, String str, boolean z) {
        interfaceC12344.edit().putBoolean(str, z).apply();
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        return C14354.m34251((InterfaceC18877) obj, true);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }
}
