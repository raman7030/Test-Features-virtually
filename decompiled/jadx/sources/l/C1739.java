package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.֫ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 377O */
/* JADX INFO: loaded from: classes2.dex */
public final class C1739 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f6012;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f6013;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f6014;

    public C1739(int i, int i2, int i3) {
        this.f6012 = i;
        this.f6014 = i2;
        this.f6013 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1739 m5814(JSONObject jSONObject, JSONValue jSONValue) throws C3059 {
        int i = jSONObject.getInt("classIndex", 0);
        int i2 = jSONObject.getInt("memberIndex", 0);
        int i3 = jSONObject.getInt("instructionIndex", 0);
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw C3059.m9364("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C1739(i, i2, i3);
    }
}
