package l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20528 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66140;

    public /* synthetic */ C20528(int i) {
        this.f66140 = i;
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
        switch (this.f66140) {
            case 0:
                Object objM39866 = C16999.m39866((String) obj, new String[0]);
                return objM39866 instanceof InterfaceC21855 ? ((InterfaceC21855) objM39866).mo27913() : objM39866;
            case 1:
                return new C21965((C12951) obj);
            case 2:
                return ((PackageInfo) obj).applicationInfo.sourceDir;
            case 3:
                return ((C12182) obj).m29658();
            case 4:
                return ((DynamicScheme) obj).secondaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$scrim$49((DynamicScheme) obj);
            default:
                return ((DynamicScheme) obj).neutralVariantPalette;
        }
    }
}
