package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֨᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public class C3680 extends C4351 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public /* bridge */ /* synthetic */ Object mo4510(C16637 c16637, Object obj) {
        return mo4510(c16637, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m7099(final Object obj, C4848 c4848) {
        return c4848.m10287(new Function() { // from class: l.ۚ᩸֨
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
            public final Object apply(Object obj2) {
                return (AbstractC6462) ((AbstractC6462) obj2).mo5291(this.f20214, obj);
            }
        });
    }
}
