package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3433 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10853;

    public /* synthetic */ C3433(int i) {
        this.f10853 = i;
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
        switch (this.f10853) {
            case 0:
                return new ArrayList();
            case 1:
                return ((String) obj).replace('/', '.');
            case 2:
                return MaterialDynamicColors.lambda$onPrimaryFixed$110((DynamicScheme) obj);
            case 3:
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$142((DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$114((DynamicScheme) obj);
            case 5:
                return C5378.stream((Set) obj);
            default:
                return new HashMap();
        }
    }
}
