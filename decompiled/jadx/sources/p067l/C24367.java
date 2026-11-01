package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24367 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f77152;

    public /* synthetic */ C24367(int i) {
        this.f77152 = i;
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
        switch (this.f77152) {
            case 0:
                return ((EnumC4231) obj).name();
            case 1:
                return C7150.m16432((C14677) obj);
            case 2:
                return new ArrayList();
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                return ((DynamicScheme) obj).secondaryPalette;
            case 6:
                return ((C14181) obj).mo32660();
            case 7:
                return (C11281) C11281.class.cast((InterfaceC14919) obj);
            case 8:
                return ((StringBuilder) obj).toString();
            case 9:
                return (InterfaceC5552) ((AbstractC11588) obj);
            default:
                return ((C11648) obj).f32494;
        }
    }
}
