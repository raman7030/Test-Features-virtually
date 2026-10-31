package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23147 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74406;

    public /* synthetic */ C23147(int i) {
        this.f74406 = i;
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
        switch (this.f74406) {
            case 0:
                return ((EnumC1960) obj).name();
            case 1:
                return C5031.m14528((C12951) obj);
            case 2:
                return new ArrayList();
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                return ((DynamicScheme) obj).secondaryPalette;
            case 6:
                return ((C12429) obj).mo30595();
            case 7:
                return (C9378) C9378.class.cast((InterfaceC13206) obj);
            case 8:
                return ((StringBuilder) obj).toString();
            case 9:
                return (InterfaceC3350) ((AbstractC9701) obj);
            default:
                return ((C9764) obj).f29541;
        }
    }
}
