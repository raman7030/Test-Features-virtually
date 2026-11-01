package p067l;

/* JADX INFO: renamed from: l.ܰۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15405 implements InterfaceC2940, Comparable {
    /* JADX INFO: renamed from: ۧ */
    public abstract int mo4595(AbstractC15405 abstractC15405);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo4596();

    /* JADX INFO: renamed from: ᩻ */
    public abstract String mo10336();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC15405 abstractC15405) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC15405.getClass();
        if (cls != cls2) {
            return cls.getName().compareTo(cls2.getName());
        }
        return mo4595(abstractC15405);
    }
}
