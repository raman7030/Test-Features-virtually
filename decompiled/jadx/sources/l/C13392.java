package l;

/* JADX INFO: renamed from: l.۬᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C92A */
/* JADX INFO: loaded from: classes4.dex */
public final class C13392 extends C20844 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C13392 f40017 = new C13392();

    @Override // l.C20844
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo32387(InterfaceC17889 interfaceC17889) {
        int iIndexOf;
        AbstractC15440 abstractC15440Mo24433 = interfaceC17889.mo24433();
        String strMo23554 = abstractC15440Mo24433.mo23554();
        return (!strMo23554.startsWith("/data/media/") || (iIndexOf = strMo23554.indexOf(47, 12) + 1) == 0) ? abstractC15440Mo24433 : C16293.f50120.m36526(strMo23554.substring(iIndexOf));
    }
}
