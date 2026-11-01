package p067l;

import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۛ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7811 implements ToIntFunction {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20496;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f20496) {
            case 0:
                return ((C13176) obj).f37029;
            default:
                return ((List) ((C8537) obj).f22917).size();
        }
    }
}
