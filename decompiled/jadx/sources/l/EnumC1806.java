package l;

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
public abstract class EnumC1806 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC1806 f6224;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1806 f6225;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC1806 f6226;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC1806 f6227;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC1806[] f6228 = m6022();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC1806 f6229;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo6023(Comparator comparator, Object obj, List list, int i);

    public EnumC1806(String str, int i) {
        super(str, i);
    }

    public static EnumC1806 valueOf(String str) {
        return (EnumC1806) Enum.valueOf(EnumC1806.class, str);
    }

    public static EnumC1806[] values() {
        return (EnumC1806[]) f6228.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC1806[] m6022() {
        return new EnumC1806[]{f6229, f6226, f6225, f6227, f6224};
    }

    static {
        final String str = "ANY_PRESENT";
        final int i = 0;
        f6229 = new EnumC1806(str, i) { // from class: l.ۛۛܺ
            @Override // l.EnumC1806
            /* JADX INFO: renamed from: ֫ */
            public int mo6023(Comparator comparator, Object obj, List list, int i2) {
                return i2;
            }
        };
        final String str2 = "LAST_PRESENT";
        final int i2 = 1;
        f6226 = new EnumC1806(str2, i2) { // from class: l.ۨۛܺ
            @Override // l.EnumC1806
            /* JADX INFO: renamed from: ֫ */
            public int mo6023(Comparator comparator, Object obj, List list, int i3) {
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
        f6225 = new EnumC1806(str3, i3) { // from class: l.᩺ۛܺ
            @Override // l.EnumC1806
            /* JADX INFO: renamed from: ֫ */
            public int mo6023(Comparator comparator, Object obj, List list, int i4) {
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
        f6227 = new EnumC1806(str4, i4) { // from class: l.ܰۛܺ
            @Override // l.EnumC1806
            /* JADX INFO: renamed from: ֫ */
            public int mo6023(Comparator comparator, Object obj, List list, int i5) {
                return EnumC1806.f6226.mo6023(comparator, obj, list, i5) + 1;
            }
        };
        final String str5 = "LAST_BEFORE";
        final int i5 = 4;
        f6224 = new EnumC1806(str5, i5) { // from class: l.۟ۛܺ
            @Override // l.EnumC1806
            /* JADX INFO: renamed from: ֫ */
            public int mo6023(Comparator comparator, Object obj, List list, int i6) {
                return EnumC1806.f6225.mo6023(comparator, obj, list, i6) - 1;
            }
        };
    }
}
