package p067l;

/* JADX INFO: renamed from: l.᩻۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes.dex */
public final class C24910 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f79541;

    /* JADX INFO: renamed from: ۧ */
    public final Object f79542;

    /* JADX INFO: renamed from: ܽ */
    public final Object f79543;

    public C24910(Object obj, Object obj2, Object obj3) {
        this.f79541 = obj;
        this.f79542 = obj2;
        this.f79543 = obj3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final IllegalArgumentException m54694() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f79541;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f79542);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f79543);
        return new IllegalArgumentException(sb.toString());
    }
}
