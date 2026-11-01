package p067l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZCAG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11921 implements InterfaceC11771, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // p067l.InterfaceC11771
    public abstract /* synthetic */ int size();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }
}
