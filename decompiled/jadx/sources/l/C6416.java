package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6416 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19850;

    public /* synthetic */ C6416(int i) {
        this.f19850 = i;
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
        switch (this.f19850) {
            case 0:
                return ((File) obj).getPath();
            case 1:
                return new C5259((C12951) obj);
            case 2:
                int i = C13425.f40110;
                return C1493.m5161((String) obj, EnumC16309.MODIFY_DIRECTORY);
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
                return C5378.stream(((C18963) obj).f59815);
        }
    }
}
