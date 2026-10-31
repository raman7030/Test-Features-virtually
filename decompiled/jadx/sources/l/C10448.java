package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10448 extends AbstractC11385 {
    @Override // l.AbstractC11385
    /* JADX INFO: renamed from: ֨ */
    public final String mo23264() {
        if (this.f34065 == null) {
            this.f34065 = this.f34059.m25955(this.f34056, new Function() { // from class: l.۫ᩳ֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    this.f37874.f34058.getClass();
                    return String.format("%s #%d", AbstractC13546.m32594("??? Invalid constant_pool reference", new Object[0]), (Integer) obj);
                }
            });
        }
        return this.f34065;
    }
}
