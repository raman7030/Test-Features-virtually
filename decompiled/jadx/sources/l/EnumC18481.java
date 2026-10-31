package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v0 l.ᩴۗ֡, still in use, count: 1, list:
  (r6v0 l.ᩴۗ֡) from 0x0092: FILLED_NEW_ARRAY (r6v0 l.ᩴۗ֡), (r0v1 l.ᩴۗ֡), (r1v1 l.ᩴۗ֡), (r2v1 l.ᩴۗ֡), (r3v1 l.ᩴۗ֡), (r4v1 l.ᩴۗ֡), (r5v1 l.ᩴۗ֡) A[WRAPPED] elemType: l.ᩴۗ֡
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ᩴۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C9TP */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18481 {
    WHITELIST(0, "whitelist", false),
    GREYLIST(1, "greylist", false),
    BLACKLIST(2, "blacklist", false),
    GREYLIST_MAX_O(3, "greylist-max-o", false),
    GREYLIST_MAX_P(4, "greylist-max-p", false),
    GREYLIST_MAX_Q(5, "greylist-max-q", false),
    GREYLIST_MAX_R(6, "greylist-max-r", false),
    CORE_PLATFORM_API(8, "core-platform-api", true),
    TEST_API(16, "test-api", true);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f57299 = 7;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f57303;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f57304;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f57305;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final Map f57301 = new HashMap();

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC18481[] f57300 = {new EnumC18481(0, "whitelist", false), new EnumC18481(1, "greylist", false), new EnumC18481(2, "blacklist", false), new EnumC18481(3, "greylist-max-o", false), new EnumC18481(4, "greylist-max-p", false), new EnumC18481(5, "greylist-max-q", false), new EnumC18481(6, "greylist-max-r", false)};

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC18481[] f57295 = {new EnumC18481(8, "core-platform-api", true), new EnumC18481(16, "test-api", true)};

    public static EnumC18481 valueOf(String str) {
        return (EnumC18481) Enum.valueOf(EnumC18481.class, str);
    }

    public static EnumC18481[] values() {
        return (EnumC18481[]) f57291.clone();
    }

    static {
        for (EnumC18481 enumC18481 : values()) {
            f57301.put(enumC18481.toString(), enumC18481);
        }
    }

    public EnumC18481(int i, String str, boolean z) {
        super(str, i);
        this.f57303 = i;
        this.f57305 = str;
        this.f57304 = z;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f57305;
    }

    public int getValue() {
        return this.f57303;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m42972(int i) {
        if (this.f57304) {
            return (i & this.f57303) != 0;
        }
        return (i & 7) == this.f57303;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m42971() {
        return this.f57304;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Set m42970(int i) {
        EnumC18481 enumC18481 = f57300[i & 7];
        if ((i & (-8)) == 0) {
            return AbstractC6079.m16990(enumC18481);
        }
        int i2 = AbstractC6079.f18650;
        C12429 c12429 = new C12429();
        c12429.mo6130((Object) enumC18481);
        for (EnumC18481 enumC18482 : f57295) {
            if (enumC18482.m42972(i)) {
                c12429.mo6130((Object) enumC18482);
            }
        }
        return c12429.mo30595();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42968(int i) {
        StringBuilder sb = new StringBuilder();
        for (EnumC18481 enumC18481 : m42970(i)) {
            if (sb.length() > 0) {
                sb.append('|');
            }
            sb.append(enumC18481.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42966(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            EnumC18481 enumC18481 = (EnumC18481) it.next();
            if (enumC18481.f57304) {
                i += enumC18481.f57303;
            } else {
                if (z) {
                    throw new IllegalArgumentException("Cannot combine multiple flags for hidden api restrictions");
                }
                i += enumC18481.f57303;
                z = true;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC18481 m42967(String str) {
        return (EnumC18481) f57301.get(str);
    }
}
