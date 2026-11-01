package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16030 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f46407;

    public /* synthetic */ C16030(int i) {
        this.f46407 = i;
    }

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
        switch (this.f46407) {
            case 0:
                return C6988.m16053("\"", ((EnumC16818) obj).m38127(), "\"");
            default:
                return ((C19345) ((C17450) obj).f52180).m44084();
        }
    }
}
