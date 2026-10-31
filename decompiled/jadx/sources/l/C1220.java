package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֨ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W74O */
/* JADX INFO: loaded from: classes2.dex */
public final class C1220 implements InterfaceC8276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f4376;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f4377;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f4378;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f4379;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f4380;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f4381;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f4382;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f4383;

    public C1220(JSONObject jSONObject) {
        this.f4378 = jSONObject.getString("arrayName", "");
        this.f4376 = jSONObject.getInt("arrayIndex", 0);
        this.f4381 = C23407.m51853(jSONObject, "slotVirtualAddress", 0L);
        this.f4382 = C23407.m51853(jSONObject, "slotPhysicalAddress", 0L);
        this.f4377 = C23407.m51853(jSONObject, "targetVirtualAddress", 0L);
        this.f4383 = C23407.m51853(jSONObject, "targetPhysicalAddress", 0L);
        this.f4379 = jSONObject.getString("targetInstructionMode", "");
        this.f4380 = jSONObject.getInt("pointerSize", 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1220 m4058(JSONObject jSONObject) {
        return new C1220(jSONObject);
    }
}
