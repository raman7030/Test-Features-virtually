package l;

/* JADX INFO: renamed from: l.ܰۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13717 implements InterfaceC0601, Comparable {
    /* JADX INFO: renamed from: ۧ */
    public abstract int mo2228(AbstractC13717 abstractC13717);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo2229();

    /* JADX INFO: renamed from: ᩻ */
    public abstract String mo8292();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC13717 abstractC13717) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC13717.getClass();
        if (cls != cls2) {
            return cls.getName().compareTo(cls2.getName());
        }
        return mo2228(abstractC13717);
    }
}
