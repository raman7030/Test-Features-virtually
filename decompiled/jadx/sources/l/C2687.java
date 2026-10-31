package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2687 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8413;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8414;

    public /* synthetic */ C2687(int i, Object obj) {
        this.f8413 = i;
        this.f8414 = obj;
    }

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
        int i = this.f8413;
        Object obj2 = this.f8414;
        switch (i) {
            case 0:
                return ((C3392) obj2).m24643(9, "uses").concat(String.format("%s;%n", (C20326) obj));
            default:
                C5931 c5931 = (C5931) obj2;
                if (obj instanceof C11576) {
                    return c5931.m16617((C11576) obj);
                }
                c5931.getClass();
                return obj;
        }
    }
}
