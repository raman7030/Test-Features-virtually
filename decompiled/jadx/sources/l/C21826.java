package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩸᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T77G */
/* JADX INFO: loaded from: classes.dex */
public final class C21826 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f69912;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f69913;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f69914;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f69915;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69916;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f69917;

    public C21826(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f69914 = i;
        this.f69913 = i2;
        this.f69912 = i3;
        this.f69916 = i4;
        this.f69917 = i5;
        this.f69915 = i6;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21826 m49191(JSONObject jSONObject, JSONValue jSONValue) throws C3059 {
        int i = jSONObject.getInt("scopeIndex", 0);
        int i2 = jSONObject.getInt("entryIndex", 0);
        int i3 = jSONObject.getInt("classIndex", 0);
        int i4 = jSONObject.getInt("memberIndex", 0);
        int i5 = jSONObject.getInt("instructionIndex", 0);
        int i6 = jSONObject.getInt("innerIndex", 0);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0 || i6 < 0) {
            throw C3059.m9364("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C21826(i, i2, i3, i4, i5, i6);
    }
}
