package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22827 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73698;

    public /* synthetic */ C22827(int i) {
        this.f73698 = i;
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
        switch (this.f73698) {
            case 0:
                return new C14824((C12951) obj);
            case 1:
                return MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).secondaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$outlineVariant$45((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                C5851 c5851 = C10242.f30878;
                return null;
            default:
                return ((AbstractC5698) obj).f17560;
        }
    }
}
