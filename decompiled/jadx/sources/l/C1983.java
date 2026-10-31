package l;

import java.util.Set;

/* JADX INFO: renamed from: l.֫ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1983 extends AbstractC23107 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23834 f6639 = new C23834(false);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6497(String str, AbstractC23107 abstractC23107) {
        if (abstractC23107 == null) {
            abstractC23107 = C7585.f23459;
        }
        this.f6639.put(str, abstractC23107);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Set m6498() {
        return this.f6639.entrySet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18211 m6496(String str) {
        return (C18211) this.f6639.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1983) && ((C1983) obj).f6639.equals(this.f6639);
        }
        return true;
    }

    public final int hashCode() {
        return this.f6639.hashCode();
    }
}
