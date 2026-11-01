package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7UG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21659 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f68227;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f68228;

    public /* synthetic */ C21659(int i, Object obj) {
        this.f68227 = i;
        this.f68228 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f68227) {
            case 0:
                return C5565.m12312((C5565) this.f68228, (C12271) obj);
            default:
                return super/*l.ۖܿ۠*/.mo10413((InterfaceC22097) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }
}
