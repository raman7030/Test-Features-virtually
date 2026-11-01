package p067l;

/* JADX INFO: renamed from: l.ۗ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: LCAX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5301 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static Object m11476(AbstractC19558 abstractC19558, Character ch, Object obj) {
        char cCharValue = ch.charValue();
        boolean zMo15130 = abstractC19558.mo15130(cCharValue);
        Object objMo15129 = abstractC19558.mo15129(cCharValue, obj);
        if (zMo15130) {
            return objMo15129;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static Object m11477(AbstractC19558 abstractC19558, Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        Object objMo15132 = abstractC19558.mo15132(cCharValue);
        if (objMo15132 != abstractC19558.mo27503() || abstractC19558.mo15130(cCharValue)) {
            return objMo15132;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static Object m11478(AbstractC19558 abstractC19558, Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        if (abstractC19558.mo15130(cCharValue)) {
            return abstractC19558.mo15134(cCharValue);
        }
        return null;
    }
}
