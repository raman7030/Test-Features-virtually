package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBBY */
/* JADX INFO: loaded from: classes5.dex */
public final class C14628 extends C11102 {
    @Override // l.C11102, l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return "call site";
    }

    @Override // l.C11102
    public final boolean equals(Object obj) {
        if (obj instanceof C14628) {
            return m27534().equals(((C14628) obj).m27534());
        }
        return false;
    }

    @Override // l.C11102
    public final int hashCode() {
        return m27534().hashCode();
    }

    @Override // l.C11102, l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        return m27534().compareTo(((C14628) abstractC13717).m27534());
    }

    @Override // l.C11102
    public final String toString() {
        return m27534().m40979("call site{");
    }

    @Override // l.C11102, l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return m27534().m40980("{", l.d);
    }
}
