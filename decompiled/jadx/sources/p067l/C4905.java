package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۖܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4905 extends AbstractC20328 {
    @Override // p067l.AbstractC20328
    /* JADX INFO: renamed from: ֫ */
    public final int mo10410(EnumC21589 enumC21589, int i, int i2, C23600 c23600, C23600 c23601) {
        Integer numM10408 = m10408(enumC21589, i, i2, c23601, 0);
        if (numM10408 != null) {
            return numM10408.intValue();
        }
        Integer numM10409 = m10409(enumC21589, i, i2, c23600, c23601, 0);
        if (numM10409 != null) {
            return numM10409.intValue();
        }
        Integer numM104010 = m10408(enumC21589, i, i2, c23601, 3);
        if (numM104010 != null) {
            return numM104010.intValue();
        }
        Integer numM104011 = m10409(enumC21589, i, i2, c23600, c23601, 3);
        if (numM104011 != null) {
            return numM104011.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private Integer m10408(EnumC21589 enumC21589, int i, int i2, C23600 c23600, int i3) {
        List list = (List) enumC21589.m48787((Object) this.f62792, (Object) this.f62793);
        C12826.requireNonNull(list);
        int iM48794 = enumC21589.m48794(c23600.f75123, c23600.f75124);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C24370) list.get(iM48794 + i5)).m53726() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = iM48794 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C24370) list.get(i6 - i8)).m53726() <= i3) {
                break;
            }
            i8++;
        }
        if (i5 == -1 && i8 == -1) {
            return null;
        }
        if (i5 == 0 || i8 == 0) {
            return 0;
        }
        if (i5 == -1) {
            i5 = -i8;
        }
        return Integer.valueOf(i5);
    }

    /* JADX INFO: renamed from: ֫ */
    private Integer m10409(EnumC21589 enumC21589, int i, int i2, C23600 c23600, C23600 c23601, int i3) {
        EnumC21589 enumC21589M48801 = enumC21589.m48801();
        List list = (List) enumC21589M48801.m48787((Object) this.f62792, (Object) this.f62793);
        C12826.requireNonNull(list);
        int iM48794 = enumC21589M48801.m48794(c23600.f75121, c23600.f75122);
        int iM48795 = enumC21589M48801.m48794(c23601.f75123, c23601.f75124);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C24370) list.get(iM48794 + i5)).m53726() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = iM48795 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C24370) list.get(i6 - i8)).m53726() <= i3) {
                break;
            }
            i8++;
        }
        if (i5 == -1 && i8 == -1) {
            return null;
        }
        if (i5 == 0 || i8 == 0) {
            return 0;
        }
        if (i5 == -1) {
            i5 = -i8;
        }
        return Integer.valueOf(i5);
    }
}
