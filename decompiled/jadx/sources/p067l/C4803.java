package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4803 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10894;

    public /* synthetic */ C4803(int i) {
        this.f10894 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f10894) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m10140or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f10894) {
            case 0:
                return ((C19023) obj).f56713 == null;
            default:
                C18258 c18258 = (C18258) obj;
                return (c18258.mo31352() == EnumC8400.ERROR && c18258.m41582(EnumC21417.RECOVERABLE) && !c18258.m41582(EnumC21417.API)) ? false : true;
        }
    }
}
