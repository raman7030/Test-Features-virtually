package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14436 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44251;

    public /* synthetic */ C14436(int i) {
        this.f44251 = i;
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
        switch (this.f44251) {
            case 0:
                return C20094.m46315("ecdsa-sha2-", (String) obj);
            case 1:
                return new C1805((C12951) obj);
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return MaterialDynamicColors.lambda$primary$53((DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
            default:
                return MaterialDynamicColors.lambda$surfaceContainerHighest$30((DynamicScheme) obj);
        }
    }
}
