package p067l;

/* JADX INFO: renamed from: l.۬᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C92A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15097 extends C22179 {

    /* JADX INFO: renamed from: ܳ */
    public static final C15097 f43087 = new C15097();

    @Override // p067l.C22179
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 mo34489(InterfaceC19370 interfaceC19370) {
        int iIndexOf;
        AbstractC17043 abstractC17043Mo26445 = interfaceC19370.mo26445();
        String strMo25505 = abstractC17043Mo26445.mo25505();
        return (!strMo25505.startsWith("/data/media/") || (iIndexOf = strMo25505.indexOf(47, 12) + 1) == 0) ? abstractC17043Mo26445 : C17853.f53287.m38684(strMo25505.substring(iIndexOf));
    }
}
