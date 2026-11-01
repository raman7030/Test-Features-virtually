package p067l;

/* JADX INFO: renamed from: l.ۗܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29AZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5526 {
    /* JADX INFO: renamed from: ֫ */
    public final String m12209() {
        String name = ((C6867) this).f17850.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m12210() {
        String name = ((C6867) this).f17850.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf);
    }
}
