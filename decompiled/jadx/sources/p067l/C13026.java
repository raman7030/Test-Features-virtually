package p067l;

import bin.p000mt.plus.Features;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 350S */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13026 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f36645;

    public /* synthetic */ C13026(int i) {
        this.f36645 = i;
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
        switch (this.f36645) {
            case 0:
                return Features.uid2name(((Integer) obj).intValue());
            case 1:
                int i = C8053.f21220;
                return new SharedPreferencesC3371();
            case 2:
                return C20661.m46672((C14677) obj);
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return "#" + ((Integer) obj);
            case 5:
                return ((Map) obj).values().iterator();
            default:
                return C8300.m19127(EnumC21300.f67015, EnumC21300.f67052);
        }
    }
}
