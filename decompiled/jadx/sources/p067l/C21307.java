package p067l;

/* JADX INFO: renamed from: l.᩶ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U707 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21307 {

    /* JADX INFO: renamed from: ֫ */
    public final int f67152;

    /* JADX INFO: renamed from: ۧ */
    public final int f67153;

    /* JADX INFO: renamed from: ܳ */
    public final int f67154;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC22648 f67155;

    /* JADX INFO: renamed from: ܿ */
    public final int f67156;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f67157;

    /* JADX INFO: renamed from: ᩻ */
    public final int f67158;

    public C21307(C23318 c23318, EnumC22648 enumC22648) {
        this(c23318.f73381, c23318.f73377, c23318.f73379, c23318.f73376, c23318.f73375, c23318.f73380, enumC22648);
    }

    public C21307(int i, int i2, int i3, int i4, int i5, boolean z, EnumC22648 enumC22648) {
        this.f67158 = i;
        this.f67154 = i2;
        this.f67156 = i3;
        this.f67153 = i4;
        this.f67152 = i5;
        this.f67157 = z;
        this.f67155 = enumC22648;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m48216() {
        return this.f67158;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m48211() {
        return this.f67154;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m48213() {
        return this.f67156;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m48209() {
        return this.f67153;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48204() {
        return this.f67152;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m48214() {
        return this.f67157;
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC22648 m48212() {
        return this.f67155;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48207(C16611 c16611) {
        C12826.requireNonNull(c16611);
        if (c16611.m37663() != this.f67158) {
            throw new IllegalArgumentException("Dependency and change set lengths differ");
        }
        if (c16611.m37662()) {
            return false;
        }
        if (this.f67155 != EnumC22648.COMPLETE) {
            return true;
        }
        if (this.f67157 && c16611.m37656()) {
            return true;
        }
        int iM48215 = m48215();
        if (iM48215 == -1) {
            return false;
        }
        int iM48208 = m48208();
        for (int iM37653 = c16611.m37653(iM48215); iM37653 < c16611.m37660() && c16611.m37664(iM37653) <= iM48208; iM37653++) {
            if (m48206(c16611.m37664(iM37653), c16611.m37666(iM37653))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21307 m48210(C16611 c16611) {
        C12826.requireNonNull(c16611, "changes");
        m48201(c16611);
        if (m48207(c16611)) {
            throw new IllegalArgumentException("Affected dependency cannot be remapped");
        }
        return m48198(c16611);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21307 m48205(C16611 c16611, int i) {
        C12826.requireNonNull(c16611, "changes");
        m48201(c16611);
        int i2 = this.f67158;
        C12826.checkFromToIndex(i, i, i2);
        if (!c16611.m37662()) {
            int iM37660 = c16611.m37660() - 1;
            if (c16611.m37666(iM37660) == i2 || i < c16611.m37666(iM37660)) {
                throw new IllegalArgumentException("Dependency is not in a stable suffix");
            }
        }
        int iM48215 = m48215();
        if (iM48215 != -1) {
            int iM48208 = m48208();
            int iMin = Math.min(i, iM48215);
            int iMax = Math.max(i, iM48208);
            for (int iM37653 = c16611.m37653(iMin); iM37653 < c16611.m37660() && c16611.m37664(iM37653) <= iMax; iM37653++) {
                int iM37664 = c16611.m37664(iM37653);
                int iM37666 = c16611.m37666(iM37653);
                if (m48206(iM37664, iM37666) || (iM37666 - iM37664 != c16611.m37658(iM37653) - c16611.m37661(iM37653) && iMin <= iM37666 && iM37664 <= iMax)) {
                    throw new IllegalArgumentException("Affected suffix dependency cannot be remapped");
                }
            }
        }
        int iM37659 = c16611.m37659(i, EnumC3200.AFTER);
        long jM37665 = ((long) c16611.m37665()) - ((long) i2);
        if (iM37659 < 0 || ((long) iM37659) - ((long) i) != jM37665) {
            throw new IllegalArgumentException("Suffix replay entry does not move with EOF");
        }
        return m48198(c16611);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m48201(C16611 c16611) {
        if (c16611.m37663() != this.f67158) {
            throw new IllegalArgumentException("Dependency and change set lengths differ");
        }
        if (this.f67155 != EnumC22648.COMPLETE) {
            throw new IllegalArgumentException("Only complete dependencies can be remapped");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private C21307 m48198(C16611 c16611) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f67156;
        int i6 = this.f67154;
        if (i6 != -1) {
            int iM48195 = m48195(c16611, i6);
            int iM48196 = m48195(c16611, i5);
            if (iM48196 <= iM48195) {
                throw new IllegalArgumentException("Invalid remapped read range");
            }
            i = iM48195;
            i2 = iM48196;
        } else {
            i = -1;
            i2 = -1;
        }
        int i7 = this.f67152;
        int i8 = this.f67153;
        if (i8 != -1) {
            int iM48197 = m48195(c16611, i8);
            int iM48198 = m48195(c16611, i7);
            if (iM48198 < iM48197) {
                throw new IllegalArgumentException("Invalid remapped boundary range");
            }
            i3 = iM48197;
            i4 = iM48198;
        } else {
            i3 = -1;
            i4 = -1;
        }
        return (c16611.m37665() == this.f67158 && i == i6 && i2 == i5 && i3 == i8 && i4 == i7) ? this : new C21307(c16611.m37665(), i, i2, i3, i4, this.f67157, EnumC22648.COMPLETE);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m48195(C16611 c16611, int i) {
        int iM37659 = c16611.m37659(i, EnumC3200.BEFORE);
        int iM376510 = c16611.m37659(i, EnumC3200.AFTER);
        if (iM37659 < 0 || iM37659 != iM376510) {
            throw new IllegalArgumentException("Dependency endpoint cannot be remapped uniquely");
        }
        return iM37659;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48206(int i, int i2) {
        int i3 = this.f67154;
        if (i3 != -1) {
            int i4 = this.f67156;
            if (i == i2) {
                if (i3 <= i && i <= i4) {
                    return true;
                }
            } else if (i < i4 && i3 < i2) {
                return true;
            }
        }
        int i5 = this.f67153;
        return i5 != -1 && i <= this.f67152 && i5 <= i2;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m48215() {
        int i = this.f67153;
        int i2 = this.f67154;
        if (i2 == -1) {
            return i;
        }
        return i == -1 ? i2 : Math.min(i2, i);
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m48208() {
        return Math.max(this.f67156, this.f67152);
    }
}
