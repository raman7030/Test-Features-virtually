package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11859 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35381;

    public /* synthetic */ C11859(int i) {
        this.f35381 = i;
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
        switch (this.f35381) {
            case 0:
                EnumC1960 enumC1960 = (EnumC1960) obj;
                return String.format("%-26s: \"%s\"", enumC1960.name(), enumC1960.f6561);
            default:
                return "#" + ((Integer) obj);
        }
    }
}
