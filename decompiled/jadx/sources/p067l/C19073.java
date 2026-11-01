package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19073 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f56912;

    public /* synthetic */ C19073(int i) {
        this.f56912 = i;
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
        switch (this.f56912) {
            case 0:
                return ((InterfaceC19370) obj).getName() + "/";
            case 1:
                return (C3065) ((Map.Entry) obj).getValue();
            case 2:
                return ((C19486) obj).f59367;
            case 3:
                String str = (String) obj;
                return str.startsWith("/") ? str.substring(1) : str;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((DynamicScheme) obj).secondaryPalette;
            case 6:
                return ((DynamicScheme) obj).errorPalette;
            case 7:
                return ((C11176) obj).toString();
            case 8:
                return String.format("#%d?", (Integer) obj);
            default:
                return ((EnumC4377) obj).toString();
        }
    }
}
