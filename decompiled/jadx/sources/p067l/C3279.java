package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5ATX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3279 extends C23082 {
    /* JADX INFO: renamed from: ֫ */
    public final String m5712() {
        ArrayList arrayList = new ArrayList(values());
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            return "";
        }
        if (arrayList.size() == 1) {
            return ((C7303) arrayList.get(0)).m16871();
        }
        StringBuilder sb = new StringBuilder("(?:");
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = true;
        while (it.hasNext()) {
            String strM16871 = ((C7303) it.next()).m16871();
            if (strM16871.isEmpty()) {
                z = true;
            } else {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append('|');
                }
                sb.append(strM16871);
            }
        }
        sb.append(z ? ")?" : MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
