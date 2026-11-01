package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13639 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f38390;

    public /* synthetic */ C13639(int i) {
        this.f38390 = i;
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
        switch (this.f38390) {
            case 0:
                EnumC4231 enumC4231 = (EnumC4231) obj;
                return String.format("%-26s: \"%s\"", enumC4231.name(), enumC4231.f9340);
            default:
                return "#" + ((Integer) obj);
        }
    }
}
