package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16201 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f47681;

    public /* synthetic */ C16201(int i) {
        this.f47681 = i;
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
        switch (this.f47681) {
            case 0:
                return ((C2417) obj).f20408.toString();
            default:
                return ((C22004) obj).f69204;
        }
    }
}
