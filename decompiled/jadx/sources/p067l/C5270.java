package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5270 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f12398;

    public /* synthetic */ C5270(int i) {
        this.f12398 = i;
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
        switch (this.f12398) {
            case 0:
                return ((EnumC10104) obj).f28036;
            case 1:
                return ((C14259) obj).m32768();
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
                return C7480.stream(((C20391) obj).f63044);
        }
    }
}
