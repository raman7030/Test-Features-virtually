package l;

import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 57IT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22173 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        num.intValue();
        IOException iOException = (IOException) obj2;
        return new C18667(String.format("%s #%,d: %s", iOException == null ? "Null" : iOException.getClass().getSimpleName(), num, iOException != null ? iOException.getMessage() : "Null"), iOException);
    }
}
