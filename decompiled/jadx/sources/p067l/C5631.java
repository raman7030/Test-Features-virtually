package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5631 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f13656;

    public /* synthetic */ C5631(int i) {
        this.f13656 = i;
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
        switch (this.f13656) {
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
                return C7480.stream((Set) obj);
            default:
                return new HashMap();
        }
    }
}
