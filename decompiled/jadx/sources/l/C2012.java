package l;

import bin.mt.json.JSONArray;

/* JADX INFO: renamed from: l.֫ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2012 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16828 m6550(C12951 c12951) {
        C16828 c16828 = new C16828(c12951.m31506(), c12951.m31506());
        long position = c12951.getPosition();
        if (c12951.available() > 10 && c12951.m31497(0)) {
            String strM31506 = c12951.m31506();
            if (strM31506.startsWith("[") && C3016.m9240(strM31506, "]", false)) {
                c16828.m39583(new C17534(new JSONArray(strM31506)));
                return c16828;
            }
            c12951.seek(position);
        }
        return c16828;
    }
}
