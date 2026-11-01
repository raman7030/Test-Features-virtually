package p067l;

import java.util.Comparator;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩹' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.֫ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15PL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC4085 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC4085 f9003;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC4085 f9004;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC4085 f9005;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC4085 f9006;

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC4085[] f9007 = m8219();

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC4085 f9008;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo8220(Comparator comparator, Object obj, List list, int i);

    public EnumC4085(String str, int i) {
        super(str, i);
    }

    public static EnumC4085 valueOf(String str) {
        return (EnumC4085) Enum.valueOf(EnumC4085.class, str);
    }

    public static EnumC4085[] values() {
        return (EnumC4085[]) f9007.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC4085[] m8219() {
        return new EnumC4085[]{f9008, f9005, f9004, f9006, f9003};
    }

    static {
        final String str = "ANY_PRESENT";
        final int i = 0;
        f9008 = new EnumC4085(str, i) { // from class: l.ۛۛܺ
            @Override // p067l.EnumC4085
            /* JADX INFO: renamed from: ֫ */
            public int mo8220(Comparator comparator, Object obj, List list, int i2) {
                return i2;
            }
        };
        final String str2 = "LAST_PRESENT";
        final int i2 = 1;
        f9005 = new EnumC4085(str2, i2) { // from class: l.ۨۛܺ
            @Override // p067l.EnumC4085
            /* JADX INFO: renamed from: ֫ */
            public int mo8220(Comparator comparator, Object obj, List list, int i3) {
                int size = list.size() - 1;
                while (i3 < size) {
                    int i4 = ((i3 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i4), obj) > 0) {
                        size = i4 - 1;
                    } else {
                        i3 = i4;
                    }
                }
                return i3;
            }
        };
        final String str3 = "FIRST_PRESENT";
        final int i3 = 2;
        f9004 = new EnumC4085(str3, i3) { // from class: l.᩺ۛܺ
            @Override // p067l.EnumC4085
            /* JADX INFO: renamed from: ֫ */
            public int mo8220(Comparator comparator, Object obj, List list, int i4) {
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = (i5 + i4) >>> 1;
                    if (comparator.compare(list.get(i6), obj) < 0) {
                        i5 = i6 + 1;
                    } else {
                        i4 = i6;
                    }
                }
                return i5;
            }
        };
        final String str4 = "FIRST_AFTER";
        final int i4 = 3;
        f9006 = new EnumC4085(str4, i4) { // from class: l.ܰۛܺ
            @Override // p067l.EnumC4085
            /* JADX INFO: renamed from: ֫ */
            public int mo8220(Comparator comparator, Object obj, List list, int i5) {
                return EnumC4085.f9005.mo8220(comparator, obj, list, i5) + 1;
            }
        };
        final String str5 = "LAST_BEFORE";
        final int i5 = 4;
        f9003 = new EnumC4085(str5, i5) { // from class: l.۟ۛܺ
            @Override // p067l.EnumC4085
            /* JADX INFO: renamed from: ֫ */
            public int mo8220(Comparator comparator, Object obj, List list, int i6) {
                return EnumC4085.f9004.mo8220(comparator, obj, list, i6) - 1;
            }
        };
    }
}
