package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4541 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10175;

    public /* synthetic */ C4541(int i) {
        this.f10175 = i;
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
        switch (this.f10175) {
            case 0:
                return ((AbstractC10576) obj).m24369();
            case 1:
                return ((EnumC17248) obj).m39031();
            case 2:
                return new ArrayList();
            case 3:
                return MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$surfaceVariant$34((DynamicScheme) obj);
            case 7:
                return ((EnumC6799) obj).m15521();
            case 8:
                int i = C19003.f56656;
                return "???";
            case 9:
                return ((C13818) obj).f20408;
            case 10:
                C3626 c3626 = (C3626) obj;
                if (c3626.m6851() != null) {
                    return C9268.m21418(c3626.m6851().f27115);
                }
                return null;
            default:
                return (C11281) ((AbstractC7257) obj);
        }
    }
}
