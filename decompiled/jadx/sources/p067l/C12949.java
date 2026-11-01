package p067l;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12949 {

    /* JADX INFO: renamed from: ܿ */
    public static final EnumSet f36413 = EnumSet.of(EnumC4231.LABELS);

    /* JADX INFO: renamed from: ֫ */
    public static final EnumSet f36410 = EnumSet.of(EnumC4231.CONSTANT_POOL, EnumC4231.PRINT_BCI, EnumC4231.CP_INDEX, EnumC4231.DETAILED_Output);

    /* JADX INFO: renamed from: ۧ */
    public static final EnumSet f36411 = EnumSet.of(EnumC4231.DROP_Source, EnumC4231.DROP_Classes, EnumC4231.DROP_CharacterRange);

    /* JADX INFO: renamed from: ܽ */
    public static final EnumSet f36412 = EnumSet.of(EnumC4231.LINE_NUMBER_TABLE_Numbers, EnumC4231.LINE_NUMBER_TABLE_Lines, EnumC4231.LINE_NUMBER_TABLE_Table);

    /* JADX INFO: renamed from: ᩳ */
    public static final EnumSet f36414 = EnumSet.of(EnumC4231.LOCAL_VARIABLE_Vars, EnumC4231.LOCAL_VARIABLE_Types);

    /* JADX INFO: renamed from: ۧ */
    public static String m29679() {
        return (String) C7480.stream(f36413).map(new C13639(0)).collect(C24205.joining("\n"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29677(EnumC4231 enumC4231) {
        if (enumC4231 == EnumC4231.PRINT_BCI) {
            AbstractC11588.f32271 = 27;
        }
        f36413.add(enumC4231);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m29682() {
        m29676(f36410);
        EnumC4231 enumC4231 = EnumC4231.LABELS;
        if (enumC4231 == EnumC4231.PRINT_BCI) {
            AbstractC11588.f32271 = 25;
        }
        f36413.remove(enumC4231);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29676(EnumSet enumSet) {
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            m29677((EnumC4231) it.next());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29680(EnumC4231 enumC4231) {
        int iOrdinal = enumC4231.ordinal();
        if (iOrdinal == 8) {
            m29676(f36412);
        } else if (iOrdinal == 11) {
            m29676(f36414);
        } else {
            if (iOrdinal != 22) {
                throw new RuntimeException(C17588.m40053(enumC4231.name(), " ia not group option"));
            }
            m29676(f36411);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29681() {
        f36413.clear();
        m29677(EnumC4231.LABELS);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29678(EnumC4231... enumC4231Arr) {
        for (EnumC4231 enumC4231 : enumC4231Arr) {
            if (f36413.contains(enumC4231)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m29675() {
        return String.format("[ %s ]", C7480.stream(f36413).map(new C24367(0)).collect(C24205.joining(", ")));
    }
}
