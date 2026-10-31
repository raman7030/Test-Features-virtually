package l;

/* JADX INFO: renamed from: l.ۗܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29AZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3322 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m10173() {
        String name = ((C4733) this).f15019.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m10174() {
        String name = ((C4733) this).f15019.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf);
    }
}
