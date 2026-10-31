package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 91K6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5218 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5218 f16339;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16340;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15094 f16341;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f16344;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC0278 f16345;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15800 f16346;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f16338 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f16343 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f16342 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14997(int i, C0483 c0483, ArrayList arrayList) {
        HashSet hashSet = this.f16338;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C6834.m18516(((C5218) it.next()).f16341, i, arrayList, c0483);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet m14995() {
        return this.f16338;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m15011() {
        HashSet hashSet = this.f16338;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m15005() {
        HashSet hashSet = this.f16338;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C5218) it.next()).m15009().m15010()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14996(int i) {
        this.f16340 = i;
        this.f16344 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15004() {
        if (this.f16344) {
            return this.f16340;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m15002() {
        this.f16344 = false;
        this.f16340 = 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m15001() {
        return this.f16344;
    }

    public C5218(C15094 c15094, EnumC0278 enumC0278) {
        this.f16341 = c15094;
        this.f16345 = enumC0278;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15800 m15008() {
        return this.f16346;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m15006() {
        C15800 c15800 = this.f16346;
        if (c15800 == null) {
            this.f16346 = new C15800(EnumC8746.UNRESTRICTED);
        } else {
            c15800.m37436();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m15007() {
        C5218 c5218;
        if (this.f16341.m35735() == 8) {
            return 0;
        }
        if (this.f16342 > -1 && (c5218 = this.f16339) != null && c5218.f16341.m35735() == 8) {
            return this.f16342;
        }
        return this.f16343;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m15003() {
        HashSet hashSet;
        C5218 c5218 = this.f16339;
        if (c5218 != null && (hashSet = c5218.f16338) != null) {
            hashSet.remove(this);
            if (this.f16339.f16338.size() == 0) {
                this.f16339.f16338 = null;
            }
        }
        this.f16338 = null;
        this.f16339 = null;
        this.f16343 = 0;
        this.f16342 = -1;
        this.f16344 = false;
        this.f16340 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15000(C5218 c5218, int i, int i2, boolean z) {
        if (c5218 == null) {
            m15003();
            return true;
        }
        if (!z && !m14999(c5218)) {
            return false;
        }
        this.f16339 = c5218;
        if (c5218.f16338 == null) {
            c5218.f16338 = new HashSet();
        }
        HashSet hashSet = this.f16339.f16338;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f16343 = i;
        } else {
            this.f16343 = 0;
        }
        this.f16342 = i2;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14998(C5218 c5218, int i) {
        m15000(c5218, i, -1, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m15010() {
        return this.f16339 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14999(C5218 c5218) {
        if (c5218 == null) {
            return false;
        }
        C15094 c15094 = c5218.f16341;
        EnumC0278 enumC0278 = c5218.f16345;
        EnumC0278 enumC0279 = this.f16345;
        if (enumC0278 == enumC0279) {
            return enumC0279 != EnumC0278.BASELINE || (c15094.m35771() && this.f16341.m35771());
        }
        switch (C19330.f60780[enumC0279.ordinal()]) {
            case 1:
                return (enumC0278 == EnumC0278.BASELINE || enumC0278 == EnumC0278.CENTER_X || enumC0278 == EnumC0278.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = enumC0278 == EnumC0278.LEFT || enumC0278 == EnumC0278.RIGHT;
                if (c15094 instanceof C3101) {
                    return z || enumC0278 == EnumC0278.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = enumC0278 == EnumC0278.TOP || enumC0278 == EnumC0278.BOTTOM;
                if (c15094 instanceof C3101) {
                    return z2 || enumC0278 == EnumC0278.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(enumC0279.name());
        }
    }

    public final String toString() {
        return this.f16341.m35751() + ":" + this.f16345.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5218 m15009() {
        int[] iArr = C19330.f60780;
        EnumC0278 enumC0278 = this.f16345;
        int i = iArr[enumC0278.ordinal()];
        C15094 c15094 = this.f16341;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return c15094.f46159;
            case 3:
                return c15094.f46141;
            case 4:
                return c15094.f46133;
            case 5:
                return c15094.f46161;
            default:
                throw new AssertionError(enumC0278.name());
        }
    }
}
