package p067l;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 898C */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8307 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f22190;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Serializable f22191;

    public /* synthetic */ C8307(int i, Serializable serializable) {
        this.f22190 = i;
        this.f22191 = serializable;
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
        switch (this.f22190) {
            case 0:
                return C13672.m31066((File) obj, (String) this.f22191);
            default:
                return new ArrayList((ArrayList) this.f22191);
        }
    }
}
