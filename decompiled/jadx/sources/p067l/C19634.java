package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7E7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19634 extends AbstractC13188 {
    @Override // p067l.AbstractC13188
    /* JADX INFO: renamed from: ֨ */
    public final String mo25208() {
        if (this.f37063 == null) {
            boolean z = this.f32275;
            C12102 c12102 = this.f37057;
            if (z) {
                this.f37063 = c12102.m27977(this.f37054, new Function() { // from class: l.ۧܽ֨
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
                        this.f36346.f37056.getClass();
                        return AbstractC15242.m34697("??? Invalid constant_pool reference", new Object[0]);
                    }
                });
            } else {
                this.f37063 = "\"".concat(c12102.m27977(this.f37054, new Function() { // from class: l.ܽܽ֨
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
                        this.f54629.f37056.getClass();
                        return String.format("%s #%d", AbstractC15242.m34697("??? Invalid constant_pool reference", new Object[0]), (Integer) obj);
                    }
                })).concat("\"");
            }
            if (this.f37059 != 0) {
                this.f37063 += ":" + c12102.m27989(this.f37059);
            }
        }
        return this.f37063;
    }
}
