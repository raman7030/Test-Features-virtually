package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 7428 */
/* JADX INFO: loaded from: classes2.dex */
public class C1755 implements Iterable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f6073;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f6074;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f6078 = false;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C1755 f6072 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1755 f6076 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1323 f6075 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5557 f6079 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8526 f6077 = null;

    public C1755(AbstractC5144 abstractC5144, Object obj) {
        this.f6074 = abstractC5144;
        this.f6073 = obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1755 m5877(AbstractC5144 abstractC5144, Object obj) {
        C1755 c1755 = new C1755(abstractC5144, obj);
        c1755.f6072 = this;
        c1755.f6076 = this.f6076;
        c1755.f6075 = this.f6075;
        c1755.f6079 = this.f6079;
        c1755.f6077 = this.f6077;
        return c1755;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Env[");
        sb.append(this.f6073);
        if (this.f6076 != null) {
            sb.append(",outer=");
            sb.append(this.f6076);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C7460 c7460 = new C7460();
        c7460.f22890 = this;
        return c7460;
    }
}
