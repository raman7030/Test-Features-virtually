package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C22246 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 f72188;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9047 f72189;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ InterfaceC18883 m49952(C22246 c22246) {
        return c22246.f72188;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C9047 m49953(C22246 c22246) {
        return c22246.f72189;
    }

    public C22246(C9047 c9047, InterfaceC18883 interfaceC18883) {
        this.f72189 = c9047;
        this.f72188 = interfaceC18883;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22246)) {
            return false;
        }
        C22246 c22246 = (C22246) obj;
        return C11003.equals(this.f72189, c22246.f72189) && C11003.equals(this.f72188, c22246.f72188);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f72188) + (C11003.hashCode(this.f72189) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f72189, this.f72188};
        String[] strArrSplit = "spans;creatorLease".length() == 0 ? new String[0] : "spans;creatorLease".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C22246.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
