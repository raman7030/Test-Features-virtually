package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17576 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53722;

    public /* synthetic */ C17576(int i) {
        this.f53722 = i;
    }

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
        switch (this.f53722) {
            case 0:
                return ((InterfaceC17889) obj).getName() + "/";
            case 1:
                return (C0732) ((Map.Entry) obj).getValue();
            case 2:
                return ((C18011) obj).f56170;
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
                return ((C9268) obj).toString();
            case 8:
                return String.format("#%d?", (Integer) obj);
            default:
                return ((EnumC2113) obj).toString();
        }
    }
}
