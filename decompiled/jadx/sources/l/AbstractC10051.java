package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZCAG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10051 implements InterfaceC9893, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // l.InterfaceC9893
    public abstract /* synthetic */ int size();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }
}
