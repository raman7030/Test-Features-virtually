package p067l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13503 {

    /* JADX INFO: renamed from: ۖ */
    public static HashMap f37962;

    /* JADX INFO: renamed from: ۜ */
    public static final AbstractC13503 f37963;

    /* JADX INFO: renamed from: ۡ */
    public static final AbstractC13503 f37964;

    /* JADX INFO: renamed from: ۢ */
    public static final AbstractC13503 f37965;

    /* JADX INFO: renamed from: ܳ */
    public static final AbstractC13503 f37966;

    /* JADX INFO: renamed from: ܺ */
    public static final AbstractC13503 f37967;

    /* JADX INFO: renamed from: ܿ */
    public static final AbstractC13503 f37968;

    /* JADX INFO: renamed from: ᩷ */
    public static final AbstractC13503 f37969;

    /* JADX INFO: renamed from: ᩻ */
    public static final AbstractC13503 f37970;

    /* JADX INFO: renamed from: ֫ */
    public final EnumC2773 f37971;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC24231 f37972;

    /* JADX INFO: renamed from: ܽ */
    public final Set f37973;

    /* JADX INFO: renamed from: ᩳ */
    public final int f37974;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC6127 mo6110(C15322 c15322);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC20209 mo6111(C10330 c10330);

    public /* synthetic */ AbstractC13503(EnumC24231 enumC24231, int i, EnumC2773 enumC2773, Set set, int i2) {
        this(enumC24231, i, enumC2773, set);
    }

    static {
        HashMap map = new HashMap();
        f37962 = map;
        EnumC24231 enumC24231 = EnumC24231.UNIVERSAL;
        EnumC2773 enumC2773 = EnumC2773.PRIMITIVE;
        C22891 c22891 = new C22891(enumC24231, 1, enumC2773);
        f37968 = c22891;
        C23561 c23561 = new C23561(enumC24231, 2, enumC2773);
        f37970 = c23561;
        EnumC2773 enumC2774 = EnumC2773.CONSTRUCTED;
        C21550 c21550 = new C21550(enumC24231, 3, enumC2773, EnumSet.of(enumC2773, enumC2774));
        C6797 c6797 = new C6797(enumC24231, 4, EnumSet.of(enumC2773, enumC2774));
        f37965 = c6797;
        C5456 c5456 = new C5456(enumC24231, 5, enumC2773);
        f37963 = c5456;
        C14843 c14843 = new C14843(enumC24231, 6, enumC2773);
        f37969 = c14843;
        C14173 c14173 = new C14173(enumC24231, 10, enumC2773);
        f37966 = c14173;
        C12162 c12162 = new C12162(enumC24231, 17, enumC2774);
        f37967 = c12162;
        C8138 c8138 = new C8138(enumC24231, 16, enumC2774);
        f37964 = c8138;
        map.put(1, c22891);
        map.put(2, c23561);
        map.put(3, c21550);
        map.put(4, c6797);
        map.put(5, c5456);
        map.put(6, c14843);
        map.put(10, c14173);
        map.put(17, c12162);
        map.put(16, c8138);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC13503(EnumC24231 enumC24231, int i, EnumSet enumSet) {
        EnumC2773 enumC2773 = EnumC2773.PRIMITIVE;
        this(enumC24231, i, enumSet.contains(enumC2773) ? enumC2773 : EnumC2773.CONSTRUCTED, enumSet);
    }

    public AbstractC13503(EnumC24231 enumC24231, int i, EnumC2773 enumC2773) {
        this(enumC24231, i, enumC2773, EnumSet.of(enumC2773));
    }

    public AbstractC13503(EnumC24231 enumC24231, int i, EnumC2773 enumC2773, Set set) {
        this.f37972 = enumC24231;
        this.f37974 = i;
        this.f37973 = set;
        this.f37971 = enumC2773;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13503 m30658(EnumC2773 enumC2773) {
        if (this.f37971 == enumC2773) {
            return this;
        }
        if (!this.f37973.contains(enumC2773)) {
            throw new IllegalArgumentException(String.format("The ASN.1 tag %s does not support encoding as %s", this, enumC2773));
        }
        return new C3444(this, this.f37972, this.f37974, enumC2773, this.f37973);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC13503 m30656(EnumC24231 enumC24231, int i) {
        int i2 = C16854.f49916[enumC24231.ordinal()];
        HashMap map = f37962;
        if (i2 == 1) {
            for (AbstractC13503 abstractC13503 : map.values()) {
                if (abstractC13503.f37974 == i && enumC24231 == abstractC13503.f37972) {
                    return abstractC13503;
                }
            }
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            return new C10150(enumC24231, i, EnumSet.of(EnumC2773.PRIMITIVE, EnumC2773.CONSTRUCTED));
        }
        throw new C4786(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", enumC24231, Integer.valueOf(i), map));
    }

    public final int hashCode() {
        return C12826.hash(this.f37972, Integer.valueOf(this.f37974), this.f37971);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m30660() {
        return this.f37974;
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC24231 m30659() {
        return this.f37972;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC2773 m30657() {
        return this.f37971;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m30661() {
        return this.f37971 == EnumC2773.CONSTRUCTED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC13503 abstractC13503 = (AbstractC13503) obj;
            if (this.f37974 == abstractC13503.f37974 && this.f37972 == abstractC13503.f37972 && this.f37971 == abstractC13503.f37971) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "ASN1Tag[" + this.f37972 + "," + this.f37971 + "," + this.f37974 + ']';
    }
}
