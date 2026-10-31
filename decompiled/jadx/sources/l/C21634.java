package l;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: renamed from: l.᩸ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K84H */
/* JADX INFO: loaded from: classes5.dex */
public final class C21634 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12524 f69457;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 f69458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Type f69459;

    public C21634(C12524 c12524, AbstractC8333 abstractC8333, Type type) {
        this.f69457 = c12524;
        this.f69458 = abstractC8333;
        this.f69459 = type;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        return this.f69458.mo2844(c17175);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        AbstractC8333 abstractC8333Mo3969;
        Type type = this.f69459;
        Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
        AbstractC8333 abstractC8333 = this.f69458;
        if (type2 != type) {
            AbstractC8333 abstractC8333M30728 = this.f69457.m30728(C16469.m38776(type2));
            if (abstractC8333M30728 instanceof AbstractC2584) {
                AbstractC8333 abstractC8334 = abstractC8333;
                while ((abstractC8334 instanceof AbstractC1172) && (abstractC8333Mo3969 = ((AbstractC1172) abstractC8334).mo3969()) != abstractC8334) {
                    abstractC8334 = abstractC8333Mo3969;
                }
                if (abstractC8334 instanceof AbstractC2584) {
                    abstractC8333 = abstractC8333M30728;
                }
            } else {
                abstractC8333 = abstractC8333M30728;
            }
        }
        abstractC8333.mo2845(c23525, obj);
    }
}
