package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2794 implements Function {
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
        C3724 c3724 = (C3724) obj;
        EnumC14113 enumC14113 = EnumC14113.CONSTANT_NULL;
        return new C23697(c3724.m7172(), (String) c3724.f22917);
    }
}
