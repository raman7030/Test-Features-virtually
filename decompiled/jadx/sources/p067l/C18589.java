package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18589 implements Function {
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
        C8232 c8232 = (C8232) obj;
        if (c8232.m19008() == null) {
            return c8232.m19007();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c8232.m19007());
        sb.append(" [");
        return C10965.m25286(sb, c8232.m19008(), "]");
    }
}
