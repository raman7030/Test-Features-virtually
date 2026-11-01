package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20002 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f60812;

    public /* synthetic */ C20002(int i) {
        this.f60812 = i;
    }

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
        switch (this.f60812) {
            case 0:
                String strMo39137 = ((InterfaceC19370) obj).mo39137();
                return (strMo39137.equals("application/vnd.android.package-archive") && C5623.m12437()) ? "application/octet-stream" : strMo39137;
            case 1:
                return ((C8739) obj).m20211();
            case 2:
                return (C14387) ((InterfaceC19370) obj);
            case 3:
                return ((C25209) obj).f80616;
            case 4:
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) obj;
                if (!interfaceC19370.isDirectory()) {
                    return interfaceC19370.getPath();
                }
                return interfaceC19370.getPath() + "/";
            case 5:
                return MaterialDynamicColors.lambda$inverseSurface$38((DynamicScheme) obj);
            case 6:
                return ((C20882) obj).toString();
            case 7:
                return "#" + ((Integer) obj);
            case 8:
                return C4848.m10283();
            case 9:
                return Boolean.valueOf(((InterfaceC16730) obj).isRegularFile());
            default:
                return (AbstractC14355) ((AbstractC21062) obj);
        }
    }
}
