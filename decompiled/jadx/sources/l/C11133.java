package l;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11133 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f33413 = EnumSet.of(EnumC1960.LABELS);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumSet f33410 = EnumSet.of(EnumC1960.CONSTANT_POOL, EnumC1960.PRINT_BCI, EnumC1960.CP_INDEX, EnumC1960.DETAILED_Output);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f33411 = EnumSet.of(EnumC1960.DROP_Source, EnumC1960.DROP_Classes, EnumC1960.DROP_CharacterRange);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f33412 = EnumSet.of(EnumC1960.LINE_NUMBER_TABLE_Numbers, EnumC1960.LINE_NUMBER_TABLE_Lines, EnumC1960.LINE_NUMBER_TABLE_Table);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f33414 = EnumSet.of(EnumC1960.LOCAL_VARIABLE_Vars, EnumC1960.LOCAL_VARIABLE_Types);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m27617() {
        return (String) C5378.stream(f33413).map(new C11859(0)).collect(C22976.joining("\n"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27615(EnumC1960 enumC1960) {
        if (enumC1960 == EnumC1960.PRINT_BCI) {
            AbstractC9701.f29322 = 27;
        }
        f33413.add(enumC1960);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m27620() {
        m27614(f33410);
        EnumC1960 enumC1960 = EnumC1960.LABELS;
        if (enumC1960 == EnumC1960.PRINT_BCI) {
            AbstractC9701.f29322 = 25;
        }
        f33413.remove(enumC1960);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27614(EnumSet enumSet) {
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            m27615((EnumC1960) it.next());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27618(EnumC1960 enumC1960) {
        int iOrdinal = enumC1960.ordinal();
        if (iOrdinal == 8) {
            m27614(f33412);
        } else if (iOrdinal == 11) {
            m27614(f33414);
        } else {
            if (iOrdinal != 22) {
                throw new RuntimeException(C16014.m37867(enumC1960.name(), " ia not group option"));
            }
            m27614(f33411);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27619() {
        f33413.clear();
        m27615(EnumC1960.LABELS);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27616(EnumC1960... enumC1960Arr) {
        for (EnumC1960 enumC1960 : enumC1960Arr) {
            if (f33413.contains(enumC1960)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27613() {
        return String.format("[ %s ]", C5378.stream(f33413).map(new C23147(0)).collect(C22976.joining(", ")));
    }
}
