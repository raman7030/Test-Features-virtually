package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16020 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49423;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f49424;

    public /* synthetic */ C16020(String str, int i) {
        this.f49423 = i;
        this.f49424 = str;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f49423) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f49423) {
            case 0:
                return ((C4027) obj).f12783.equals(this.f49424);
            default:
                return C16999.m39872((String) obj, this.f49424);
        }
    }
}
