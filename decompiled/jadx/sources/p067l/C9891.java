package p067l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B784 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9891 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f27420;

    public /* synthetic */ C9891(int i) {
        this.f27420 = i;
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
        switch (this.f27420) {
            case 0:
                return ((C4613) obj).f10341;
            case 1:
                return new C13315(((C14677) obj).m33593());
            case 2:
                return ((PackageInfo) obj).packageName;
            case 3:
                return ((C4302) obj).f9571;
            case 4:
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$inversePrimary$65((DynamicScheme) obj);
            default:
                return (String) ((C24552) obj).m54150();
        }
    }
}
