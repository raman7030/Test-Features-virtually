package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16460 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f48343 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final int m37389(StringBuilder sb) {
        String string = sb.toString();
        HashMap map = this.f48343;
        Integer num = (Integer) map.get(string);
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() + 1;
        map.put(string, Integer.valueOf(iIntValue));
        return iIntValue;
    }
}
