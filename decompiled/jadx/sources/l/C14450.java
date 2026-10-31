package l;

import bin.mt.plus.R;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U7JF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14450 implements InterfaceC21773 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23623 f44293;

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // l.InterfaceC9893
    public final /* synthetic */ boolean containsKey(Object obj) {
        return true;
    }

    @Override // l.InterfaceC9893
    public final /* synthetic */ Integer get(Object obj) {
        return C15421.m36466(this, obj);
    }

    @Override // l.InterfaceC9893
    public final /* synthetic */ int size() {
        return -1;
    }

    @Override // l.InterfaceC21773
    /* JADX INFO: renamed from: ֫ */
    public final int mo21965(int i, Object obj) {
        throw null;
    }

    @Override // l.InterfaceC21773
    /* JADX INFO: renamed from: ֫ */
    public final int mo21966(Object obj) {
        throw null;
    }

    @Override // l.InterfaceC21773
    /* JADX INFO: renamed from: ۧ */
    public final int mo21968(Object obj) {
        return this.f44293.f76553.size() + R.anim.MT_Protector;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return mo21968(obj);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo22274andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
