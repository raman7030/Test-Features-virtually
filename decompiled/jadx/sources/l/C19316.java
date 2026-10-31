package l;

import java.io.IOException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩵۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final class C19316 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5868 f60734;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C5868 f60735;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C5868 f60736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f60739;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3917 f60741;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f60737 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f60738 = -1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f60733 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC23006 f60740 = EnumC23006.UNKNOWN_TYPE;

    public C19316(C3917 c3917, boolean z) {
        this.f60741 = c3917;
        this.f60739 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44509(C19316 c19316) {
        this.f60733 = c19316 == null ? this.f60738 : (this.f60738 - c19316.f60738) - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44506(int i) {
        this.f60733 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44510(int i) {
        this.f60738 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44508(String str) {
        C11003.requireNonNull(str, new Supplier() { // from class: l.ܺ۟ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                Object[] objArr = {"String stackFrameType"};
                ((C5080) this.f48702.f60741.m45770()).getClass();
                return AbstractC13546.m32594("Fatal Error: Object reference \"{0}\" is null", objArr);
            }
        });
        EnumC23006 enumC23006M51148 = EnumC23006.m51148(str);
        this.f60740 = enumC23006M51148;
        if (enumC23006M51148 == EnumC23006.UNKNOWN_TYPE) {
            this.f60741.mo9065(this.f60737, "Unknown entry type \"{0}\" of the StackMapTable", str);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44512(int i) {
        EnumC23006 enumC23006M51150 = EnumC23006.m51150(i);
        this.f60740 = enumC23006M51150;
        if (enumC23006M51150 == EnumC23006.SAME_FRAME) {
            this.f60733 = i;
            return;
        }
        EnumC23006 enumC23006 = EnumC23006.SAME_LOCALS_1_STACK_ITEM_FRAME;
        if (enumC23006M51150 == enumC23006) {
            this.f60733 = i - enumC23006.m51152();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44507(long j) {
        this.f60737 = j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m44514() {
        if (this.f60739) {
            return this.f60740 != EnumC23006.UNKNOWN_TYPE;
        }
        return this.f60738 != -1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m44513() {
        return this.f60739 && this.f60740 == EnumC23006.EARLY_LARVAL;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2829() {
        return !m44513();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC15204 m44505() {
        switch (C2382.f7587[this.f60740.ordinal()]) {
            case 2:
                if (m44504(this.f60736)) {
                    return null;
                }
                return EnumC15204.f46505;
            case 3:
                if (m44504(this.f60735)) {
                    return null;
                }
                return EnumC15204.f46477;
            case 4:
                if (this.f60733 == -1) {
                    return EnumC15204.f46506;
                }
                if (m44504(this.f60736)) {
                    return null;
                }
                return EnumC15204.f46505;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f60733 == -1) {
                    return EnumC15204.f46506;
                }
                return null;
            case 9:
                if (this.f60733 == -1) {
                    return EnumC15204.f46506;
                }
                if (m44504(this.f60734)) {
                    return null;
                }
                return EnumC15204.f46595;
            case 10:
                if (this.f60733 == -1) {
                    return EnumC15204.f46506;
                }
                if (!m44504(this.f60734)) {
                    return EnumC15204.f46595;
                }
                if (m44504(this.f60736)) {
                    return null;
                }
                return EnumC15204.f46505;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44504(C5868... c5868Arr) {
        for (C5868 c5868 : c5868Arr) {
            if (c5868 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        int iM16431;
        int iM16432;
        boolean zM44514 = m44514();
        boolean z = this.f60739;
        if (!zM44514 || !z) {
            this.f60740 = EnumC23006.FULL_FRAME;
        }
        int i = 0;
        switch (C2382.f7587[this.f60740.ordinal()]) {
            case 2:
                iM16431 = this.f60736.m16431() - 2;
                return iM16431 + (z ? 1 : 0);
            case 3:
                C5868 c5868 = this.f60735;
                if (c5868 != null) {
                    iM16432 = c5868.m16431();
                    i = iM16432 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 4:
                iM16431 = this.f60736.m16431();
                return iM16431 + (z ? 1 : 0);
            case 5:
            case 6:
            case 7:
            case 8:
                return (z ? 1 : 0) + 2;
            case 9:
                C5868 c5869 = this.f60734;
                if (c5869 != null) {
                    iM16432 = c5869.m16431();
                    i = iM16432 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 10:
                int i2 = (z ? 1 : 0) + 2;
                C5868 c58610 = this.f60734;
                int iM16433 = i2 + (c58610 == null ? 2 : c58610.m16431());
                C5868 c58611 = this.f60736;
                return iM16433 + (c58611 != null ? c58611.m16431() : 2);
            default:
                return z ? 1 : 0;
        }
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        boolean z;
        boolean z2 = this.f60739;
        if (!z2) {
            this.f60740 = EnumC23006.FULL_FRAME;
        }
        int i = C2382.f7587[this.f60740.ordinal()];
        boolean z3 = true;
        C3917 c3917 = this.f60741;
        switch (i) {
            case 1:
                if (!EnumC23006.SAME_FRAME.m51153(this.f60733)) {
                    c3917.mo9065(this.f60737, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(this.f60733), this.f60740.m51157());
                } else {
                    ((C6053) interfaceC0408).m16882(this.f60733);
                }
                break;
            case 2:
                C5868 c5868 = this.f60736;
                if (c5868 == null) {
                    c3917.mo9065(this.f60737, "Stack map element for the \"{0}\" entry type is absent", this.f60740.m51157());
                } else if (c5868.f18006.size() != 1) {
                    c3917.mo9065(this.f60737, "Should be only one stack map element for the \"{0}\" entry type", this.f60740.m51157());
                } else {
                    int i2 = this.f60733;
                    if (i2 >= 64) {
                        c3917.mo9065(this.f60737, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(i2), this.f60740.m51157());
                    } else {
                        C6053 c6053 = (C6053) interfaceC0408;
                        c6053.m16882(this.f60740.m51152() + this.f60733);
                        this.f60736.m16432(c6053);
                    }
                }
                break;
            case 3:
                C6053 c6054 = (C6053) interfaceC0408;
                c6054.m16882(this.f60740.m51152());
                C5868 c5869 = this.f60735;
                if (c5869 == null) {
                    c6054.m16889(0);
                } else {
                    c5869.m16429(c6054);
                }
                break;
            case 4:
                C5868 c58610 = this.f60736;
                if (c58610 == null) {
                    c3917.mo9065(this.f60737, "Locals map element for the \"{0}\" entry type is absent", this.f60740.m51157());
                } else if (c58610.f18006.size() != 1) {
                    c3917.mo9065(this.f60737, "Should be only one stack map element for the \"{0}\" entry type", this.f60740.m51157());
                } else {
                    C6053 c6055 = (C6053) interfaceC0408;
                    c6055.m16882(this.f60740.m51152());
                    c6055.m16889(this.f60733);
                    this.f60736.m16432(c6055);
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f60736 != null) {
                    c3917.mo9065(this.f60737, "There are unexpected stack maps for the \"{0}\" entry type", this.f60740.m51157());
                    z = true;
                } else {
                    z = false;
                }
                if (this.f60734 != null) {
                    c3917.mo9065(this.f60737, "There are unexpected locals maps for the \"{0}\" entry type", this.f60740.m51157());
                } else {
                    z3 = z;
                }
                if (!z3) {
                    C6053 c6056 = (C6053) interfaceC0408;
                    c6056.m16882(this.f60740.m51152());
                    c6056.m16889(this.f60733);
                    break;
                }
                break;
            case 9:
                C5868 c58611 = this.f60734;
                if (c58611 == null) {
                    c3917.mo9065(this.f60737, "Locals map element for the \"{0}\" entry type is absent", this.f60740.m51157());
                } else if (c58611.f18006.size() > 3) {
                    c3917.mo9065(this.f60737, "There are more than locals map elements for the \"append_frame\" entry type", new Object[0]);
                } else {
                    C6053 c6057 = (C6053) interfaceC0408;
                    c6057.m16882((this.f60734.f18006.size() + this.f60740.m51152()) - 1);
                    c6057.m16889(this.f60733);
                    this.f60734.m16432(c6057);
                }
                break;
            case 10:
                if (z2) {
                    C6053 c6058 = (C6053) interfaceC0408;
                    c6058.m16882(this.f60740.m51152());
                    c6058.m16889(this.f60733);
                } else {
                    ((C6053) interfaceC0408).m16889(this.f60738);
                }
                C5868 c58612 = this.f60734;
                if (c58612 == null) {
                    ((C6053) interfaceC0408).m16889(0);
                } else {
                    c58612.m16429(interfaceC0408);
                }
                C5868 c58613 = this.f60736;
                if (c58613 == null) {
                    ((C6053) interfaceC0408).m16889(0);
                } else {
                    c58613.m16429(interfaceC0408);
                }
                break;
            default:
                c3917.mo9065(this.f60737, "StackMap entry type is not set", Integer.valueOf(this.f60740.m51152()));
                break;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC23006 m44511() {
        return this.f60740;
    }
}
