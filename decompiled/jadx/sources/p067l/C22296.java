package p067l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩷ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C22296 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public transient String f70427;

    /* JADX INFO: renamed from: ۙ */
    public final Integer f70428;

    /* JADX INFO: renamed from: ᩶ */
    public final Integer f70429;

    /* JADX INFO: renamed from: ᩸ */
    public final Comparator f70430;

    /* JADX INFO: renamed from: ᩹ */
    public transient int f70431;

    /* JADX INFO: renamed from: ֫ */
    public static C22296 m50114(Integer num, Integer num2) {
        return new C22296(num, num2);
    }

    public C22296(Integer num, Integer num2) {
        EnumC8884 enumC8884 = EnumC8884.INSTANCE;
        this.f70430 = enumC8884;
        if (enumC8884.compare(num, num2) < 1) {
            this.f70428 = num;
            this.f70429 = num2;
        } else {
            this.f70428 = num2;
            this.f70429 = num;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50115(Integer num) {
        Integer num2 = this.f70428;
        Comparator comparator = this.f70430;
        return comparator.compare(num, num2) > -1 && comparator.compare(num, this.f70429) < 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C22296.class) {
            return false;
        }
        C22296 c22296 = (C22296) obj;
        return this.f70428.equals(c22296.f70428) && this.f70429.equals(c22296.f70429);
    }

    public final int hashCode() {
        int i = this.f70431;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f70429.hashCode() + ((this.f70428.hashCode() + ((C22296.class.hashCode() + 629) * 37)) * 37);
        this.f70431 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        if (this.f70427 == null) {
            this.f70427 = "[" + this.f70428 + ".." + this.f70429 + "]";
        }
        return this.f70427;
    }
}
