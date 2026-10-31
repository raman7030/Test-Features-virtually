package l;

/* JADX INFO: renamed from: l.᩻۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes.dex */
public final class C23718 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f76791;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f76792;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f76793;

    public C23718(Object obj, Object obj2, Object obj3) {
        this.f76791 = obj;
        this.f76792 = obj2;
        this.f76793 = obj3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IllegalArgumentException m52291() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f76791;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f76792);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f76793);
        return new IllegalArgumentException(sb.toString());
    }
}
