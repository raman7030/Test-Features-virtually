package p067l;

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
public final class EnumC19932 {
    WHITELIST(0, "whitelist", false),
    GREYLIST(1, "greylist", false),
    BLACKLIST(2, "blacklist", false),
    GREYLIST_MAX_O(3, "greylist-max-o", false),
    GREYLIST_MAX_P(4, "greylist-max-p", false),
    GREYLIST_MAX_Q(5, "greylist-max-q", false),
    GREYLIST_MAX_R(6, "greylist-max-r", false),
    CORE_PLATFORM_API(8, "core-platform-api", true),
    TEST_API(16, "test-api", true);


    /* JADX INFO: renamed from: ܰ */
    public static final int f60518 = 7;

    /* JADX INFO: renamed from: ᩶ */
    public final int f60522;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f60523;

    /* JADX INFO: renamed from: ᩹ */
    public final String f60524;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final Map f60520 = new HashMap();

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC19932[] f60519 = {new EnumC19932(0, "whitelist", false), new EnumC19932(1, "greylist", false), new EnumC19932(2, "blacklist", false), new EnumC19932(3, "greylist-max-o", false), new EnumC19932(4, "greylist-max-p", false), new EnumC19932(5, "greylist-max-q", false), new EnumC19932(6, "greylist-max-r", false)};

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC19932[] f60514 = {new EnumC19932(8, "core-platform-api", true), new EnumC19932(16, "test-api", true)};

    public static EnumC19932 valueOf(String str) {
        return (EnumC19932) Enum.valueOf(EnumC19932.class, str);
    }

    public static EnumC19932[] values() {
        return (EnumC19932[]) f60510.clone();
    }

    static {
        for (EnumC19932 enumC19932 : values()) {
            f60520.put(enumC19932.toString(), enumC19932);
        }
    }

    public EnumC19932(int i, String str, boolean z) {
        super(str, i);
        this.f60522 = i;
        this.f60524 = str;
        this.f60523 = z;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f60524;
    }

    public int getValue() {
        return this.f60522;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m45248(int i) {
        if (this.f60523) {
            return (i & this.f60522) != 0;
        }
        return (i & 7) == this.f60522;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m45247() {
        return this.f60523;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Set m45246(int i) {
        EnumC19932 enumC19932 = f60519[i & 7];
        if ((i & (-8)) == 0) {
            return AbstractC8146.m18921(enumC19932);
        }
        int i2 = AbstractC8146.f21506;
        C14181 c14181 = new C14181();
        c14181.mo8328((Object) enumC19932);
        for (EnumC19932 enumC19933 : f60514) {
            if (enumC19933.m45248(i)) {
                c14181.mo8328((Object) enumC19933);
            }
        }
        return c14181.mo32660();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m45244(int i) {
        StringBuilder sb = new StringBuilder();
        for (EnumC19932 enumC19932 : m45246(i)) {
            if (sb.length() > 0) {
                sb.append('|');
            }
            sb.append(enumC19932.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m45242(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            EnumC19932 enumC19932 = (EnumC19932) it.next();
            if (enumC19932.f60523) {
                i += enumC19932.f60522;
            } else {
                if (z) {
                    throw new IllegalArgumentException("Cannot combine multiple flags for hidden api restrictions");
                }
                i += enumC19932.f60522;
                z = true;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC19932 m45243(String str) {
        return (EnumC19932) f60520.get(str);
    }
}
