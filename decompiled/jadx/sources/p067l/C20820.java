package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20820 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f65424;

    public /* synthetic */ C20820(int i) {
        this.f65424 = i;
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
        switch (this.f65424) {
            case 0:
                return C7480.stream(((AbstractC5396) obj).m11844()).filter(new C23154(4));
            case 1:
                return C18524.m42109((String) obj, new String[0]);
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return ((DynamicScheme) obj).primaryPalette;
            case 4:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 5:
                return ((C6805) obj).m15601();
            default:
                return C8300.m19127(EnumC21300.f67015, EnumC21300.f67052);
        }
    }
}
