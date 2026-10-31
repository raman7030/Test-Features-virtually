package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12938 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final List f38805 = C20195.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC23041 f38806;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo3363();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo3364(int i, int i2);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo5546() {
        return this instanceof C2147;
    }

    /* JADX INFO: renamed from: ܽ */
    public C23936 mo3365() {
        return null;
    }

    static {
        C3061 c3061 = new C3061();
        c3061.put(C9909.class, 1);
        c3061.put(C6589.class, 2);
        c3061.put(C8706.class, 3);
        c3061.put(C10823.class, 4);
        c3061.put(C16963.class, 5);
        c3061.put(C2147.class, 6);
        c3061.put(C0944.class, 7);
        c3061.put(C12730.class, 8);
        c3061.put(C12233.class, 9);
        c3061.put(C1650.class, 10);
        C20195.unmodifiableMap(c3061);
    }

    public AbstractC12938(AbstractC23041 abstractC23041) {
        if (abstractC23041 == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.f38806 = abstractC23041;
    }
}
