package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۙܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6839 extends AbstractC14215 {

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC22097 f17764;

    /* JADX INFO: renamed from: ᩻ */
    public final C8180 f17765;

    public /* synthetic */ C6839(AbstractC22343 abstractC22343, InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, C8180 c8180, int i) {
        this(abstractC22343, interfaceC22097, interfaceC22098, c8180);
    }

    public C6839(AbstractC22343 abstractC22343, InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, C8180 c8180) {
        super(abstractC22343, interfaceC22097);
        C12826.requireNonNull(interfaceC22098);
        this.f17764 = interfaceC22098;
        this.f17765 = c8180;
    }

    @Override // p067l.InterfaceC9741
    public final String getName() {
        return this.f17765.m30833(this.f17764).toString();
    }

    @Override // p067l.AbstractC14215
    /* JADX INFO: renamed from: ֫ */
    public final String mo12127(Collection collection) {
        String strSubstring = this.f17765.f38099;
        int iLastIndexOf = strSubstring.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        return strSubstring.replace("/", ".");
    }

    @Override // p067l.AbstractC14215
    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryFileObject[");
        sb.append(this.f17764);
        sb.append(":");
        return C10965.m25286(sb, this.f17765.f38099, "]");
    }

    @Override // p067l.AbstractC14215
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14215 mo12128(String str) {
        return new C6839(this.f40495, this.f40497.resolveSibling(str), this.f17764, new C8180(this.f17765.m18959(), str));
    }
}
