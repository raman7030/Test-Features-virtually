package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19415 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62811;

    public /* synthetic */ C19415(int i) {
        this.f62811 = i;
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
        switch (this.f62811) {
            case 0:
                return C5378.stream(((AbstractC3186) obj).m9799()).filter(new C21870(4));
            case 1:
                return C16999.m39866((String) obj, new String[0]);
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return ((DynamicScheme) obj).primaryPalette;
            case 4:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 5:
                return ((C4668) obj).m13726();
            default:
                return C6241.m17189(EnumC19920.f64377, EnumC19920.f64414);
        }
    }
}
