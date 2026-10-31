package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7UG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20297 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65552;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65553;

    public /* synthetic */ C20297(int i, Object obj) {
        this.f65552 = i;
        this.f65553 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f65552) {
            case 0:
                return C3363.m10275((C3363) this.f65553, (C10419) obj);
            default:
                return super/*l.ۖܿ۠*/.mo8367((InterfaceC20758) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
