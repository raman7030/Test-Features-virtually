package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayDeque;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7680 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23724;

    public /* synthetic */ C7680(int i) {
        this.f23724 = i;
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
        switch (this.f23724) {
            case 0:
                return ((AbstractC15440) obj).getName();
            case 1:
                return ((InterfaceC7099) obj).mo18742();
            case 2:
                return new C10738((C12951) obj);
            case 3:
                return ((C8712) obj).f26516;
            case 4:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 5:
                return MaterialDynamicColors.lambda$surfaceContainerHigh$28((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralPalette;
            case 7:
                return ((EnumC13833) obj).m33191();
            default:
                return new ArrayDeque();
        }
    }
}
