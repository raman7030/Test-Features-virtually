package p067l;

import bin.p000mt.json.JSONArray;

/* JADX INFO: renamed from: l.֫ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4281 {
    /* JADX INFO: renamed from: ֫ */
    public static C18362 m8692(C14677 c14677) {
        C18362 c18362 = new C18362(c14677.m33593(), c14677.m33593());
        long position = c14677.getPosition();
        if (c14677.available() > 10 && c14677.m33584(0)) {
            String strM33593 = c14677.m33593();
            if (strM33593.startsWith("[") && C5235.m11298(strM33593, "]", false)) {
                c18362.m41819(new C19033(new JSONArray(strM33593)));
                return c18362;
            }
            c14677.seek(position);
        }
        return c18362;
    }
}
