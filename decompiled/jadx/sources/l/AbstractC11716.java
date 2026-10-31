package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11716 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static HashMap f34962;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11716 f34963;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11716 f34964;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11716 f34965;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11716 f34966;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11716 f34967;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11716 f34968;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC11716 f34969;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final AbstractC11716 f34970;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC0426 f34971;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC23004 f34972;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set f34973;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f34974;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC3955 mo3869(C13630 c13630);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC18772 mo3870(C8377 c8377);

    public /* synthetic */ AbstractC11716(EnumC23004 enumC23004, int i, EnumC0426 enumC0426, Set set, int i2) {
        this(enumC23004, i, enumC0426, set);
    }

    static {
        HashMap map = new HashMap();
        f34962 = map;
        EnumC23004 enumC23004 = EnumC23004.UNIVERSAL;
        EnumC0426 enumC0426 = EnumC0426.PRIMITIVE;
        C21594 c21594 = new C21594(enumC23004, 1, enumC0426);
        f34968 = c21594;
        C22299 c22299 = new C22299(enumC23004, 2, enumC0426);
        f34970 = c22299;
        EnumC0426 enumC0427 = EnumC0426.CONSTRUCTED;
        C20183 c20183 = new C20183(enumC23004, 3, enumC0426, EnumSet.of(enumC0426, enumC0427));
        C4660 c4660 = new C4660(enumC23004, 4, EnumSet.of(enumC0426, enumC0427));
        f34965 = c4660;
        C3249 c3249 = new C3249(enumC23004, 5, enumC0426);
        f34963 = c3249;
        C13126 c13126 = new C13126(enumC23004, 6, enumC0426);
        f34969 = c13126;
        C12421 c12421 = new C12421(enumC23004, 10, enumC0426);
        f34966 = c12421;
        C10305 c10305 = new C10305(enumC23004, 17, enumC0427);
        f34967 = c10305;
        C6071 c6071 = new C6071(enumC23004, 16, enumC0427);
        f34964 = c6071;
        map.put(1, c21594);
        map.put(2, c22299);
        map.put(3, c20183);
        map.put(4, c4660);
        map.put(5, c3249);
        map.put(6, c13126);
        map.put(10, c12421);
        map.put(17, c10305);
        map.put(16, c6071);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC11716(EnumC23004 enumC23004, int i, EnumSet enumSet) {
        EnumC0426 enumC0426 = EnumC0426.PRIMITIVE;
        this(enumC23004, i, enumSet.contains(enumC0426) ? enumC0426 : EnumC0426.CONSTRUCTED, enumSet);
    }

    public AbstractC11716(EnumC23004 enumC23004, int i, EnumC0426 enumC0426) {
        this(enumC23004, i, enumC0426, EnumSet.of(enumC0426));
    }

    public AbstractC11716(EnumC23004 enumC23004, int i, EnumC0426 enumC0426, Set set) {
        this.f34972 = enumC23004;
        this.f34974 = i;
        this.f34973 = set;
        this.f34971 = enumC0426;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11716 m28610(EnumC0426 enumC0426) {
        if (this.f34971 == enumC0426) {
            return this;
        }
        if (!this.f34973.contains(enumC0426)) {
            throw new IllegalArgumentException(String.format("The ASN.1 tag %s does not support encoding as %s", this, enumC0426));
        }
        return new C1132(this, this.f34972, this.f34974, enumC0426, this.f34973);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC11716 m28608(EnumC23004 enumC23004, int i) {
        int i2 = C15242.f46792[enumC23004.ordinal()];
        HashMap map = f34962;
        if (i2 == 1) {
            for (AbstractC11716 abstractC11716 : map.values()) {
                if (abstractC11716.f34974 == i && enumC23004 == abstractC11716.f34972) {
                    return abstractC11716;
                }
            }
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            return new C8188(enumC23004, i, EnumSet.of(EnumC0426.PRIMITIVE, EnumC0426.CONSTRUCTED));
        }
        throw new C2544(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", enumC23004, Integer.valueOf(i), map));
    }

    public final int hashCode() {
        return C11003.hash(this.f34972, Integer.valueOf(this.f34974), this.f34971);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m28612() {
        return this.f34974;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC23004 m28611() {
        return this.f34972;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC0426 m28609() {
        return this.f34971;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m28613() {
        return this.f34971 == EnumC0426.CONSTRUCTED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC11716 abstractC11716 = (AbstractC11716) obj;
            if (this.f34974 == abstractC11716.f34974 && this.f34972 == abstractC11716.f34972 && this.f34971 == abstractC11716.f34971) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "ASN1Tag[" + this.f34972 + "," + this.f34971 + "," + this.f34974 + ']';
    }
}
