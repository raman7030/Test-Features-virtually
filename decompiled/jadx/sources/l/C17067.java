package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17067 implements Function {
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
        C6169 c6169 = (C6169) obj;
        if (c6169.m17076() == null) {
            return c6169.m17075();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c6169.m17075());
        sb.append(" [");
        return C9045.m23341(sb, c6169.m17076(), "]");
    }
}
