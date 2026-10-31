package l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B784 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7915 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24505;

    public /* synthetic */ C7915(int i) {
        this.f24505 = i;
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
        switch (this.f24505) {
            case 0:
                return ((C2362) obj).f7550;
            case 1:
                return new C11518(((C12951) obj).m31506());
            case 2:
                return ((PackageInfo) obj).packageName;
            case 3:
                return ((C2034) obj).f6787;
            case 4:
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$inversePrimary$65((DynamicScheme) obj);
            default:
                return (String) ((C23342) obj).m51753();
        }
    }
}
