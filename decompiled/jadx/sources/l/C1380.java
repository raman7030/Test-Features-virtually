package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֨᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public class C1380 extends C2086 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public /* bridge */ /* synthetic */ Object mo2143(C15014 c15014, Object obj) {
        return mo2143(c15014, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m4861(final Object obj, C2609 c2609) {
        return c2609.m8243(new Function() { // from class: l.ۚ᩸֨
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
            public final Object apply(Object obj2) {
                return (AbstractC4308) ((AbstractC4308) obj2).mo2962(this.f17370, obj);
            }
        });
    }
}
