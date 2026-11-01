package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8466 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f22722;

    public /* synthetic */ C8466(int i) {
        this.f22722 = i;
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
        switch (this.f22722) {
            case 0:
                return ((File) obj).getPath();
            case 1:
                return new C7367((C14677) obj);
            case 2:
                int i = C15128.f43179;
                return C3787.m7403((String) obj, EnumC17868.MODIFY_DIRECTORY);
            case 3:
                return MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 6:
                return MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
            case 7:
                return "#" + ((Integer) obj);
            default:
                return C7480.stream(((C20391) obj).f63044);
        }
    }
}
