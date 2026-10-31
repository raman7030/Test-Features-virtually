package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7E7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18167 extends AbstractC11385 {
    @Override // l.AbstractC11385
    /* JADX INFO: renamed from: ֨ */
    public final String mo23264() {
        if (this.f34065 == null) {
            boolean z = this.f29326;
            C10242 c10242 = this.f34059;
            if (z) {
                this.f34065 = c10242.m25955(this.f34056, new Function() { // from class: l.ۧܽ֨
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
                        this.f33346.f34058.getClass();
                        return AbstractC13546.m32594("??? Invalid constant_pool reference", new Object[0]);
                    }
                });
            } else {
                this.f34065 = "\"".concat(c10242.m25955(this.f34056, new Function() { // from class: l.ܽܽ֨
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
                        this.f51447.f34058.getClass();
                        return String.format("%s #%d", AbstractC13546.m32594("??? Invalid constant_pool reference", new Object[0]), (Integer) obj);
                    }
                })).concat("\"");
            }
            if (this.f34061 != 0) {
                this.f34065 += ":" + c10242.m25967(this.f34061);
            }
        }
        return this.f34065;
    }
}
