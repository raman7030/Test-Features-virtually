package p067l;

import bin.p000mt.plus.R;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U7JF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16102 implements InterfaceC23062 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C24820 f47387;

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // p067l.InterfaceC11771
    public final /* synthetic */ boolean containsKey(Object obj) {
        return true;
    }

    @Override // p067l.InterfaceC11771
    public final /* synthetic */ Integer get(Object obj) {
        return C17025.m38624(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public final /* synthetic */ int size() {
        return -1;
    }

    @Override // p067l.InterfaceC23062
    /* JADX INFO: renamed from: ֫ */
    public final int mo23936(int i, Object obj) {
        throw null;
    }

    @Override // p067l.InterfaceC23062
    /* JADX INFO: renamed from: ֫ */
    public final int mo23937(Object obj) {
        throw null;
    }

    @Override // p067l.InterfaceC23062
    /* JADX INFO: renamed from: ۧ */
    public final int mo23939(Object obj) {
        return this.f47387.f79297.size() + R.anim.MT_Protector;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return mo23939(obj);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo56417andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
