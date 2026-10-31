package l;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T1A5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f45351 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m35271(View view, String str) {
        HashMap map = this.f45351;
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
