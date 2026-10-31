package l;

import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q886 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18106 implements InterfaceC15387 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20328 f56361;

    public C18106(C20328 c20328) {
        this.f56361 = c20328;
    }

    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        AbstractC8333 abstractC8333M30728;
        Type typeM38779 = c16469.m38779();
        Class clsM38778 = c16469.m38778();
        if (!Map.class.isAssignableFrom(clsM38778)) {
            return null;
        }
        Type[] typeArrM17137 = C6216.m17137(clsM38778, typeM38779);
        Type type = typeArrM17137[0];
        Type type2 = typeArrM17137[1];
        if (type == Boolean.TYPE || type == Boolean.class) {
            abstractC8333M30728 = C21906.f70149;
        } else {
            abstractC8333M30728 = c12524.m30728(C16469.m38776(type));
        }
        return new C16694(this, new C21634(c12524, abstractC8333M30728, type), new C21634(c12524, c12524.m30728(C16469.m38776(type2)), type2), this.f56361.m46639(c16469, false));
    }
}
