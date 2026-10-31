package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14827 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f45227 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35234(StringBuilder sb) {
        String string = sb.toString();
        HashMap map = this.f45227;
        Integer num = (Integer) map.get(string);
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() + 1;
        map.put(string, Integer.valueOf(iIntValue));
        return iIntValue;
    }
}
