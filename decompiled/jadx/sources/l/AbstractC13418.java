package l;

/* JADX INFO: renamed from: l.۬᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9WP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13418 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC3541 f40107;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f40108;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6172(C12441 c12441);

    public AbstractC13418(EnumC3541 enumC3541) {
        this.f40107 = enumC3541;
    }

    public AbstractC13418(EnumC3541 enumC3541, Object obj) {
        this.f40107 = enumC3541;
        this.f40108 = obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC3541 m32434() {
        return this.f40107;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m32435() {
        return this.f40108;
    }

    public final String toString() {
        return "AvPair{avId=" + this.f40107.name() + ", value=" + this.f40108 + '}';
    }
}
