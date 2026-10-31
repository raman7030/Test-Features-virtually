package l;

/* JADX INFO: renamed from: l.ۗ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: LCAX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3086 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m9433(AbstractC18087 abstractC18087, Character ch, Object obj) {
        char cCharValue = ch.charValue();
        boolean zMo13247 = abstractC18087.mo13247(cCharValue);
        Object objMo13246 = abstractC18087.mo13246(cCharValue, obj);
        if (zMo13247) {
            return objMo13246;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m9434(AbstractC18087 abstractC18087, Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        Object objMo13249 = abstractC18087.mo13249(cCharValue);
        if (objMo13249 != abstractC18087.mo25484() || abstractC18087.mo13247(cCharValue)) {
            return objMo13249;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9435(AbstractC18087 abstractC18087, Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        if (abstractC18087.mo13247(cCharValue)) {
            return abstractC18087.mo13251(cCharValue);
        }
        return null;
    }
}
