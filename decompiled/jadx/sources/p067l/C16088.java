package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16088 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f47345;

    public /* synthetic */ C16088(int i) {
        this.f47345 = i;
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
        switch (this.f47345) {
            case 0:
                return C21466.m48631("ecdsa-sha2-", (String) obj);
            case 1:
                return new C4084((C14677) obj);
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
