package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ᩳܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87B0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18193 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56570;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f56571;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f56572;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f56573;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f56574;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f56575;

    public C18193(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, -1L, -1);
    }

    public C18193(int i, int i2, int i3, int i4, int i5, long j, int i6) {
        this.f56575 = i;
        this.f56572 = i2;
        this.f56570 = i3;
        this.f56574 = i4;
        this.f56569 = i5;
        this.f56573 = j;
        this.f56571 = i6;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18193 m42415(int i, int i2, int i3, int i4, long j) {
        return new C18193(i, i2, 0, i3, 0, j, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18193 m42414(int i, int i2, int i3) {
        return new C18193(i, 0, i2, i3, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18193 m42416(JSONObject jSONObject, JSONValue jSONValue) throws C3059 {
        int i = jSONObject.getInt("scopeIndex", 0);
        int i2 = jSONObject.getInt("entryIndex", 0);
        int i3 = jSONObject.getInt("classIndex", 0);
        int i4 = jSONObject.getInt("memberIndex", -1);
        int i5 = jSONObject.getInt("classCharOffset", 0);
        long j = jSONObject.getLong("nativeStringScanOffset", -1L);
        int i6 = jSONObject.getInt("nativeStringTotalCount", -1);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < -1 || i5 < 0 || j < -1 || i6 < -1 || ((j >= 0 && i6 < 0) || (i6 >= 0 && (i4 < 0 || i4 > i6)))) {
            throw C3059.m9364("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C18193(i, i2, i3, i4, i5, j, i6);
    }
}
