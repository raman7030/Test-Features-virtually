package p067l;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶ֡ */
/* JADX INFO: compiled from: T1A5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1580 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f48466 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final float m37424(View view, String str) {
        HashMap map = this.f48466;
        if (!map.containsKey(view)) {
            return Float.NaN;
        }
        HashMap map2 = (HashMap) map.get(view);
        if (!map2.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) map2.get(str);
        if (fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
