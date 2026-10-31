package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۙܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4704 extends AbstractC12465 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f14934;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6115 f14935;

    public /* synthetic */ C4704(AbstractC21017 abstractC21017, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, C6115 c6115, int i) {
        this(abstractC21017, interfaceC20758, interfaceC20759, c6115);
    }

    public C4704(AbstractC21017 abstractC21017, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, C6115 c6115) {
        super(abstractC21017, interfaceC20758);
        C11003.requireNonNull(interfaceC20759);
        this.f14934 = interfaceC20759;
        this.f14935 = c6115;
    }

    @Override // l.InterfaceC7757
    public final String getName() {
        return this.f14935.m28786(this.f14934).toString();
    }

    @Override // l.AbstractC12465
    /* JADX INFO: renamed from: ֫ */
    public final String mo10092(Collection collection) {
        String strSubstring = this.f14935.f35100;
        int iLastIndexOf = strSubstring.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        return strSubstring.replace("/", ".");
    }

    @Override // l.AbstractC12465
    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryFileObject[");
        sb.append(this.f14934);
        sb.append(":");
        return C9045.m23341(sb, this.f14935.f35100, "]");
    }

    @Override // l.AbstractC12465
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12465 mo10093(String str) {
        return new C4704(this.f37475, this.f37477.resolveSibling(str), this.f14934, new C6115(this.f14935.m17028(), str));
    }
}
