package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10420 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31323;

    public /* synthetic */ C10420(int i) {
        this.f31323 = i;
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
        switch (this.f31323) {
            case 0:
                C1953 c1953 = (C1953) obj;
                return c1953.m6421() + ": " + c1953.m6422();
            case 1:
                int i = AbstractActivityC12266.f36524;
                return ((C8739) obj).f26609;
            case 2:
                return ((InterfaceC20758) obj).toString();
            case 3:
                return new ArrayList(((Integer) obj).intValue());
            case 4:
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
        }
    }
}
