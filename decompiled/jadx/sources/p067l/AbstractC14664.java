package p067l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14664 {

    /* JADX INFO: renamed from: ۧ */
    public static final List f41849 = C21562.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));

    /* JADX INFO: renamed from: ֫ */
    public AbstractC24266 f41850;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo5682();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo5683(int i, int i2);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo7776() {
        return this instanceof C4409;
    }

    /* JADX INFO: renamed from: ܽ */
    public C25117 mo5684() {
        return null;
    }

    static {
        C5277 c5277 = new C5277();
        c5277.put(C11786.class, 1);
        c5277.put(C8630.class, 2);
        c5277.put(C10642.class, 3);
        c5277.put(C12654.class, 4);
        c5277.put(C18490.class, 5);
        c5277.put(C4409.class, 6);
        c5277.put(C3265.class, 7);
        c5277.put(C14467.class, 8);
        c5277.put(C13994.class, 9);
        c5277.put(C3936.class, 10);
        C21562.unmodifiableMap(c5277);
    }

    public AbstractC14664(AbstractC24266 abstractC24266) {
        if (abstractC24266 == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.f41850 = abstractC24266;
    }
}
