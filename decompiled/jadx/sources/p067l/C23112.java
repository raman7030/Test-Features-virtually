package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩸᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T77G */
/* JADX INFO: loaded from: classes.dex */
public final class C23112 {

    /* JADX INFO: renamed from: ֫ */
    public final int f72621;

    /* JADX INFO: renamed from: ۧ */
    public final int f72622;

    /* JADX INFO: renamed from: ܳ */
    public final int f72623;

    /* JADX INFO: renamed from: ܽ */
    public final int f72624;

    /* JADX INFO: renamed from: ܿ */
    public final int f72625;

    /* JADX INFO: renamed from: ᩳ */
    public final int f72626;

    public C23112(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f72623 = i;
        this.f72622 = i2;
        this.f72621 = i3;
        this.f72625 = i4;
        this.f72626 = i5;
        this.f72624 = i6;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23112 m51541(JSONObject jSONObject, JSONValue jSONValue) throws C5276 {
        int i = jSONObject.getInt("scopeIndex", 0);
        int i2 = jSONObject.getInt("entryIndex", 0);
        int i3 = jSONObject.getInt("classIndex", 0);
        int i4 = jSONObject.getInt("memberIndex", 0);
        int i5 = jSONObject.getInt("instructionIndex", 0);
        int i6 = jSONObject.getInt("innerIndex", 0);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0 || i6 < 0) {
            throw C5276.m11406("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C23112(i, i2, i3, i4, i5, i6);
    }
}
