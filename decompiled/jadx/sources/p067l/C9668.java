package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayDeque;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9668 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f26637;

    public /* synthetic */ C9668(int i) {
        this.f26637 = i;
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
        switch (this.f26637) {
            case 0:
                return ((AbstractC17043) obj).getName();
            case 1:
                return ((InterfaceC9116) obj).mo20692();
            case 2:
                return new C12574((C14677) obj);
            case 3:
                return ((C10648) obj).f29441;
            case 4:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 5:
                return MaterialDynamicColors.lambda$surfaceContainerHigh$28((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralPalette;
            case 7:
                return ((EnumC15515) obj).m35309();
            default:
                return new ArrayDeque();
        }
    }
}
