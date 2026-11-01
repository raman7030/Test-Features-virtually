package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.֫ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 377O */
/* JADX INFO: loaded from: classes2.dex */
public final class C4021 {

    /* JADX INFO: renamed from: ֫ */
    public final int f8789;

    /* JADX INFO: renamed from: ۧ */
    public final int f8790;

    /* JADX INFO: renamed from: ܽ */
    public final int f8791;

    public C4021(int i, int i2, int i3) {
        this.f8789 = i;
        this.f8791 = i2;
        this.f8790 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4021 m8024(JSONObject jSONObject, JSONValue jSONValue) throws C5276 {
        int i = jSONObject.getInt("classIndex", 0);
        int i2 = jSONObject.getInt("memberIndex", 0);
        int i3 = jSONObject.getInt("instructionIndex", 0);
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw C5276.m11406("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C4021(i, i2, i3);
    }
}
