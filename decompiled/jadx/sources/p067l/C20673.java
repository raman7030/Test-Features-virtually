package p067l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20673 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str.equals(str2)) {
            return str;
        }
        int iIndexOf = str.indexOf(47);
        int iIndexOf2 = str2.indexOf(47);
        if (iIndexOf != iIndexOf2 || iIndexOf == -1) {
            return "*/*";
        }
        String strSubstring = str.substring(0, iIndexOf + 1);
        return strSubstring.equals(str2.substring(0, iIndexOf2 + 1)) ? strSubstring.concat("*") : "*/*";
    }
}
