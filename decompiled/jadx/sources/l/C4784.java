package l;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۙܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O878 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4784 implements InterfaceC15387 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20328 f15172;

    public C4784(C20328 c20328) {
        this.f15172 = c20328;
    }

    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Type typeM38779 = c16469.m38779();
        Class clsM38778 = c16469.m38778();
        if (!Collection.class.isAssignableFrom(clsM38778)) {
            return null;
        }
        Type typeM17129 = C6216.m17129(clsM38778, typeM38779);
        return new C20307(new C21634(c12524, c12524.m30728(C16469.m38776(typeM17129)), typeM17129), this.f15172.m46639(c16469, false));
    }
}
