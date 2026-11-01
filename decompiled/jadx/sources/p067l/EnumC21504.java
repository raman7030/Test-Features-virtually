package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21504 {
    SUCCESS(R.string.MT_Protector, new Object[0]),
    FAIL(R.string.MT_Protector, new Object[0]),
    FAIL_DIFFERENT_V1_V2(R.string.MT_Protector, "V1", "V2"),
    FAIL_DIFFERENT_V1_V3(R.string.MT_Protector, "V1", "V3"),
    FAIL_DIFFERENT_V1_V31(R.string.MT_Protector, "V1", "V3.1"),
    FAIL_DIFFERENT_V2_V3(R.string.MT_Protector, "V2", "V3"),
    FAIL_DIFFERENT_V2_V31(R.string.MT_Protector, "V2", "V3.1"),
    FAIL_DIFFERENT_V3_V31(R.string.MT_Protector, "V3", "V3.1"),
    FAIL_V1(R.string.MT_Protector, "V1"),
    FAIL_V2(R.string.MT_Protector, "V2"),
    FAIL_V3(R.string.MT_Protector, "V3"),
    FAIL_V31(R.string.MT_Protector, "V3.1"),
    FAIL_MISSING_V1(R.string.MT_Protector, "V1"),
    FAIL_MISSING_V2(R.string.MT_Protector, "V2"),
    FAIL_MISSING_V3(R.string.MT_Protector, "V3"),
    FAIL_MISSING_V31(R.string.MT_Protector, "V3.1");


    /* JADX INFO: renamed from: ᩸ */
    public final Object[] f67833;

    /* JADX INFO: renamed from: ᩹ */
    public final int f67834;

    EnumC21504(int i, Object... objArr) {
        this.f67834 = i;
        this.f67833 = objArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m48697() {
        return this == SUCCESS;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m48696() {
        return C7050.m16203(this.f67834, this.f67833);
    }
}
