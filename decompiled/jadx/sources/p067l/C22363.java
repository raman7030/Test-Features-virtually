package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22363 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f70569;

    public /* synthetic */ C22363(int i) {
        this.f70569 = i;
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
        switch (this.f70569) {
            case 0:
                return (C22403) ((AbstractC14355) obj);
            default:
                return ((C22004) obj).f69134;
        }
    }
}
