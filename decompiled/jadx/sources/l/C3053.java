package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3053 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9597;

    public /* synthetic */ C3053(int i) {
        this.f9597 = i;
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
        switch (this.f9597) {
            case 0:
                return ((EnumC8139) obj).f25123;
            case 1:
                return ((C12511) obj).m30693();
            case 2:
                return ((DynamicScheme) obj).errorPalette;
            case 3:
                return ((DynamicScheme) obj).primaryPalette;
            case 4:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 5:
                return Boolean.valueOf(((String) obj).contains("package-info."));
            case 6:
                return "#" + ((Integer) obj);
            default:
                return C5378.stream(((C18963) obj).f59815);
        }
    }
}
