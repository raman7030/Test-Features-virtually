package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: KAG4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19660 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f63480;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f63481;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f63482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f63483;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f63484;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f63485;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f63486;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f63487;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f63488;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f63489;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19660 m45194(int i, AbstractC3577 abstractC3577) {
        if (abstractC3577 instanceof C14719) {
            return new C19660(i, (C14719) abstractC3577);
        }
        throw new RuntimeException();
    }

    public C19660(int i, C14719 c14719) {
        this.f63482 = i;
        this.f63483 = c14719.f44950;
        this.f63481 = c14719.f44955;
        this.f63488 = c14719.f44949;
        boolean z = c14719.f44956;
        this.f63484 = z;
        if (z) {
            this.f63489 = c14719.f44953;
            this.f63486 = c14719.f44951;
        } else {
            this.f63489 = c14719.f44948;
            this.f63486 = "";
        }
        this.f63480 = c14719.f44947;
        int i2 = c14719.f44954;
        this.f63487 = i2;
        if (i2 != -1) {
            this.f63485 = c14719.f44952;
        } else {
            this.f63485 = "";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2292 m45193(int i, String str) {
        C2292 c2292M31050 = C12749.m31050(i);
        if (c2292M31050 == null) {
            c2292M31050 = C12749.m31042(str);
        }
        if (c2292M31050 != null) {
            return c2292M31050;
        }
        if (str.startsWith("sshj://")) {
            str = str.substring(7);
        }
        throw new C19401(C4925.m14306(R.string.MT_Protector, str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19660.class == obj.getClass()) {
            C19660 c19660 = (C19660) obj;
            if (this.f63482 == c19660.f63482 && this.f63481 == c19660.f63481 && this.f63484 == c19660.f63484 && this.f63483.equals(c19660.f63483) && this.f63488.equals(c19660.f63488) && this.f63489.equals(c19660.f63489) && this.f63486.equals(c19660.f63486) && this.f63480.equals(c19660.f63480) && this.f63487 == c19660.f63487 && this.f63485.equals(c19660.f63485)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f63482), this.f63483, Integer.valueOf(this.f63481), this.f63488, this.f63489, this.f63486, Boolean.valueOf(this.f63484), this.f63480, Integer.valueOf(this.f63487), this.f63485);
    }
}
