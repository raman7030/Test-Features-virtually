package l;

import bin.mt.json.JSONValue;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11539 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34456;

    public /* synthetic */ C11539(int i) {
        this.f34456 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f34456) {
            case 0:
                return new C5168((C12951) obj);
            case 1:
                return C5378.stream(((C20317) obj).f65617);
            case 2:
                return C9523.m24406((String) obj);
            case 3:
                return (CharSequence) obj;
            case 4:
                return ((JSONValue) obj).asString();
            case 5:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return ((DynamicScheme) obj).primaryPalette;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
