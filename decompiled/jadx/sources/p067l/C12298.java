package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12298 extends AbstractC13188 {
    @Override // p067l.AbstractC13188
    /* JADX INFO: renamed from: ֨ */
    public final String mo25208() {
        if (this.f37063 == null) {
            this.f37063 = this.f37057.m27977(this.f37054, new Function() { // from class: l.۫ᩳ֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    this.f40900.f37056.getClass();
                    return String.format("%s #%d", AbstractC15242.m34697("??? Invalid constant_pool reference", new Object[0]), (Integer) obj);
                }
            });
        }
        return this.f37063;
    }
}
