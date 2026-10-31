package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۖܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2669 extends AbstractC18897 {
    @Override // l.AbstractC18897
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo8364(EnumC20224 enumC20224, int i, int i2, C22340 c22340, C22340 c22341) {
        Integer numM8362 = m8362(enumC20224, i, i2, c22341, 0);
        if (numM8362 != null) {
            return numM8362.intValue();
        }
        Integer numM8363 = m8363(enumC20224, i, i2, c22340, c22341, 0);
        if (numM8363 != null) {
            return numM8363.intValue();
        }
        Integer numM8364 = m8362(enumC20224, i, i2, c22341, 3);
        if (numM8364 != null) {
            return numM8364.intValue();
        }
        Integer numM8365 = m8363(enumC20224, i, i2, c22340, c22341, 3);
        if (numM8365 != null) {
            return numM8365.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Integer m8362(EnumC20224 enumC20224, int i, int i2, C22340 c22340, int i3) {
        List list = (List) enumC20224.m46467((Object) this.f59562, (Object) this.f59563);
        C11003.requireNonNull(list);
        int iM46474 = enumC20224.m46474(c22340.f72397, c22340.f72398);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C23150) list.get(iM46474 + i5)).m51331() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = iM46474 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C23150) list.get(i6 - i8)).m51331() <= i3) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Integer m8363(EnumC20224 enumC20224, int i, int i2, C22340 c22340, C22340 c22341, int i3) {
        EnumC20224 enumC20224M46481 = enumC20224.m46481();
        List list = (List) enumC20224M46481.m46467((Object) this.f59562, (Object) this.f59563);
        C11003.requireNonNull(list);
        int iM46474 = enumC20224M46481.m46474(c22340.f72395, c22340.f72396);
        int iM46475 = enumC20224M46481.m46474(c22341.f72397, c22341.f72398);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C23150) list.get(iM46474 + i5)).m51331() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = iM46475 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C23150) list.get(i6 - i8)).m51331() <= i3) {
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
