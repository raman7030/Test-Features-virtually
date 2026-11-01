package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.ᩳܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87B0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19659 {

    /* JADX INFO: renamed from: ֫ */
    public final int f59782;

    /* JADX INFO: renamed from: ۧ */
    public final int f59783;

    /* JADX INFO: renamed from: ܳ */
    public final int f59784;

    /* JADX INFO: renamed from: ܽ */
    public final int f59785;

    /* JADX INFO: renamed from: ܿ */
    public final long f59786;

    /* JADX INFO: renamed from: ᩳ */
    public final int f59787;

    /* JADX INFO: renamed from: ᩻ */
    public final int f59788;

    public C19659(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, -1L, -1);
    }

    public C19659(int i, int i2, int i3, int i4, int i5, long j, int i6) {
        this.f59788 = i;
        this.f59785 = i2;
        this.f59783 = i3;
        this.f59787 = i4;
        this.f59782 = i5;
        this.f59786 = j;
        this.f59784 = i6;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19659 m44676(int i, int i2, int i3, int i4, long j) {
        return new C19659(i, i2, 0, i3, 0, j, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19659 m44675(int i, int i2, int i3) {
        return new C19659(i, 0, i2, i3, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19659 m44677(JSONObject jSONObject, JSONValue jSONValue) throws C5276 {
        int i = jSONObject.getInt("scopeIndex", 0);
        int i2 = jSONObject.getInt("entryIndex", 0);
        int i3 = jSONObject.getInt("classIndex", 0);
        int i4 = jSONObject.getInt("memberIndex", -1);
        int i5 = jSONObject.getInt("classCharOffset", 0);
        long j = jSONObject.getLong("nativeStringScanOffset", -1L);
        int i6 = jSONObject.getInt("nativeStringTotalCount", -1);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < -1 || i5 < 0 || j < -1 || i6 < -1 || ((j >= 0 && i6 < 0) || (i6 >= 0 && (i4 < 0 || i4 > i6)))) {
            throw C5276.m11406("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C19659(i, i2, i3, i4, i5, j, i6);
    }
}
