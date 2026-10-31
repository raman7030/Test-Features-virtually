package l;

/* JADX INFO: renamed from: l.ۘۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3912 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0225 f12488 = new C0225();

    public abstract int length();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract byte mo11933(int i);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo11937(int i);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract long mo11940(int i);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract int mo11943(int i);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int mo11935(int i) {
        int iMo11937 = mo11937(i);
        if (iMo11937 >= 0) {
            return iMo11937;
        }
        throw new C15431(null, "Encountered small uint that is out of range at offset 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m11938(int i) {
        int iMo11937 = mo11937(i);
        if (iMo11937 >= -1) {
            return iMo11937;
        }
        throw new C15431(null, "Encountered optional uint that is out of range at offset 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m11936(int i) {
        return mo11943(i) & 65535;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m11942(int i) {
        return mo11933(i) & 255;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m11941(int i) {
        long jMo11940 = mo11940(i);
        if (jMo11940 < 0 || jMo11940 > 2147483647L) {
            throw new C15431(null, "Encountered out-of-range ulong at offset 0x%x", Integer.valueOf(i));
        }
        return (int) jMo11940;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18729 m11939(int i) {
        C18729 c18729 = (C18729) this.f12488.m1479();
        if (c18729 != null) {
            c18729.m43378(i);
            c18729.m43375();
            return c18729;
        }
        return new C18729(this, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11934(C18729 c18729) {
        this.f12488.m1477(c18729);
    }
}
