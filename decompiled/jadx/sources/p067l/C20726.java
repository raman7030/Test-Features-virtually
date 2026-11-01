package p067l;

import java.io.IOException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩵۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final class C20726 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ۙ */
    public C7945 f63964;

    /* JADX INFO: renamed from: ۛ */
    public C7945 f63965;

    /* JADX INFO: renamed from: ۤ */
    public C7945 f63966;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f63969;

    /* JADX INFO: renamed from: ᩹ */
    public final C6091 f63971;

    /* JADX INFO: renamed from: ۫ */
    public long f63967 = 0;

    /* JADX INFO: renamed from: ۬ */
    public int f63968 = -1;

    /* JADX INFO: renamed from: ۗ */
    public int f63963 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public EnumC24233 f63970 = EnumC24233.UNKNOWN_TYPE;

    public C20726(C6091 c6091, boolean z) {
        this.f63971 = c6091;
        this.f63969 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46803(C20726 c20726) {
        this.f63963 = c20726 == null ? this.f63968 : (this.f63968 - c20726.f63968) - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46800(int i) {
        this.f63963 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46804(int i) {
        this.f63968 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46802(String str) {
        C12826.requireNonNull(str, new Supplier() { // from class: l.ܺ۟ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                Object[] objArr = {"String stackFrameType"};
                ((C7196) this.f51841.f63971.m48082()).getClass();
                return AbstractC15242.m34697("Fatal Error: Object reference \"{0}\" is null", objArr);
            }
        });
        EnumC24233 enumC24233M53541 = EnumC24233.m53541(str);
        this.f63970 = enumC24233M53541;
        if (enumC24233M53541 == EnumC24233.UNKNOWN_TYPE) {
            this.f63971.mo11117(this.f63967, "Unknown entry type \"{0}\" of the StackMapTable", str);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46806(int i) {
        EnumC24233 enumC24233M53543 = EnumC24233.m53543(i);
        this.f63970 = enumC24233M53543;
        if (enumC24233M53543 == EnumC24233.SAME_FRAME) {
            this.f63963 = i;
            return;
        }
        EnumC24233 enumC24233 = EnumC24233.SAME_LOCALS_1_STACK_ITEM_FRAME;
        if (enumC24233M53543 == enumC24233) {
            this.f63963 = i - enumC24233.m53545();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46801(long j) {
        this.f63967 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m46808() {
        if (this.f63969) {
            return this.f63970 != EnumC24233.UNKNOWN_TYPE;
        }
        return this.f63968 != -1;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m46807() {
        return this.f63969 && this.f63970 == EnumC24233.EARLY_LARVAL;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5158() {
        return !m46807();
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC16818 m46799() {
        switch (C4632.f10378[this.f63970.ordinal()]) {
            case 2:
                if (m46798(this.f63966)) {
                    return null;
                }
                return EnumC16818.f49630;
            case 3:
                if (m46798(this.f63965)) {
                    return null;
                }
                return EnumC16818.f49602;
            case 4:
                if (this.f63963 == -1) {
                    return EnumC16818.f49631;
                }
                if (m46798(this.f63966)) {
                    return null;
                }
                return EnumC16818.f49630;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f63963 == -1) {
                    return EnumC16818.f49631;
                }
                return null;
            case 9:
                if (this.f63963 == -1) {
                    return EnumC16818.f49631;
                }
                if (m46798(this.f63964)) {
                    return null;
                }
                return EnumC16818.f49720;
            case 10:
                if (this.f63963 == -1) {
                    return EnumC16818.f49631;
                }
                if (!m46798(this.f63964)) {
                    return EnumC16818.f49720;
                }
                if (m46798(this.f63966)) {
                    return null;
                }
                return EnumC16818.f49630;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46798(C7945... c7945Arr) {
        for (C7945 c7945 : c7945Arr) {
            if (c7945 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        int iM18357;
        int iM18358;
        boolean zM46808 = m46808();
        boolean z = this.f63969;
        if (!zM46808 || !z) {
            this.f63970 = EnumC24233.FULL_FRAME;
        }
        int i = 0;
        switch (C4632.f10378[this.f63970.ordinal()]) {
            case 2:
                iM18357 = this.f63966.m18357() - 2;
                return iM18357 + (z ? 1 : 0);
            case 3:
                C7945 c7945 = this.f63965;
                if (c7945 != null) {
                    iM18358 = c7945.m18357();
                    i = iM18358 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 4:
                iM18357 = this.f63966.m18357();
                return iM18357 + (z ? 1 : 0);
            case 5:
            case 6:
            case 7:
            case 8:
                return (z ? 1 : 0) + 2;
            case 9:
                C7945 c7946 = this.f63964;
                if (c7946 != null) {
                    iM18358 = c7946.m18357();
                    i = iM18358 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 10:
                int i2 = (z ? 1 : 0) + 2;
                C7945 c7947 = this.f63964;
                int iM18359 = i2 + (c7947 == null ? 2 : c7947.m18357());
                C7945 c7948 = this.f63966;
                return iM18359 + (c7948 != null ? c7948.m18357() : 2);
            default:
                return z ? 1 : 0;
        }
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        boolean z;
        boolean z2 = this.f63969;
        if (!z2) {
            this.f63970 = EnumC24233.FULL_FRAME;
        }
        int i = C4632.f10378[this.f63970.ordinal()];
        boolean z3 = true;
        C6091 c6091 = this.f63971;
        switch (i) {
            case 1:
                if (!EnumC24233.SAME_FRAME.m53546(this.f63963)) {
                    c6091.mo11117(this.f63967, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(this.f63963), this.f63970.m53550());
                } else {
                    ((C8121) interfaceC2756).m18811(this.f63963);
                }
                break;
            case 2:
                C7945 c7945 = this.f63966;
                if (c7945 == null) {
                    c6091.mo11117(this.f63967, "Stack map element for the \"{0}\" entry type is absent", this.f63970.m53550());
                } else if (c7945.f20859.size() != 1) {
                    c6091.mo11117(this.f63967, "Should be only one stack map element for the \"{0}\" entry type", this.f63970.m53550());
                } else {
                    int i2 = this.f63963;
                    if (i2 >= 64) {
                        c6091.mo11117(this.f63967, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(i2), this.f63970.m53550());
                    } else {
                        C8121 c8121 = (C8121) interfaceC2756;
                        c8121.m18811(this.f63970.m53545() + this.f63963);
                        this.f63966.m18358(c8121);
                    }
                }
                break;
            case 3:
                C8121 c8122 = (C8121) interfaceC2756;
                c8122.m18811(this.f63970.m53545());
                C7945 c7946 = this.f63965;
                if (c7946 == null) {
                    c8122.m18818(0);
                } else {
                    c7946.m18355(c8122);
                }
                break;
            case 4:
                C7945 c7947 = this.f63966;
                if (c7947 == null) {
                    c6091.mo11117(this.f63967, "Locals map element for the \"{0}\" entry type is absent", this.f63970.m53550());
                } else if (c7947.f20859.size() != 1) {
                    c6091.mo11117(this.f63967, "Should be only one stack map element for the \"{0}\" entry type", this.f63970.m53550());
                } else {
                    C8121 c8123 = (C8121) interfaceC2756;
                    c8123.m18811(this.f63970.m53545());
                    c8123.m18818(this.f63963);
                    this.f63966.m18358(c8123);
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f63966 != null) {
                    c6091.mo11117(this.f63967, "There are unexpected stack maps for the \"{0}\" entry type", this.f63970.m53550());
                    z = true;
                } else {
                    z = false;
                }
                if (this.f63964 != null) {
                    c6091.mo11117(this.f63967, "There are unexpected locals maps for the \"{0}\" entry type", this.f63970.m53550());
                } else {
                    z3 = z;
                }
                if (!z3) {
                    C8121 c8124 = (C8121) interfaceC2756;
                    c8124.m18811(this.f63970.m53545());
                    c8124.m18818(this.f63963);
                    break;
                }
                break;
            case 9:
                C7945 c7948 = this.f63964;
                if (c7948 == null) {
                    c6091.mo11117(this.f63967, "Locals map element for the \"{0}\" entry type is absent", this.f63970.m53550());
                } else if (c7948.f20859.size() > 3) {
                    c6091.mo11117(this.f63967, "There are more than locals map elements for the \"append_frame\" entry type", new Object[0]);
                } else {
                    C8121 c8125 = (C8121) interfaceC2756;
                    c8125.m18811((this.f63964.f20859.size() + this.f63970.m53545()) - 1);
                    c8125.m18818(this.f63963);
                    this.f63964.m18358(c8125);
                }
                break;
            case 10:
                if (z2) {
                    C8121 c8126 = (C8121) interfaceC2756;
                    c8126.m18811(this.f63970.m53545());
                    c8126.m18818(this.f63963);
                } else {
                    ((C8121) interfaceC2756).m18818(this.f63968);
                }
                C7945 c7949 = this.f63964;
                if (c7949 == null) {
                    ((C8121) interfaceC2756).m18818(0);
                } else {
                    c7949.m18355(interfaceC2756);
                }
                C7945 c79410 = this.f63966;
                if (c79410 == null) {
                    ((C8121) interfaceC2756).m18818(0);
                } else {
                    c79410.m18355(interfaceC2756);
                }
                break;
            default:
                c6091.mo11117(this.f63967, "StackMap entry type is not set", Integer.valueOf(this.f63970.m53545()));
                break;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC24233 m46805() {
        return this.f63970;
    }
}
