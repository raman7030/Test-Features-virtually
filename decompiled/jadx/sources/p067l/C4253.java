package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.֫ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4253 extends AbstractC24329 {

    /* JADX INFO: renamed from: ֫ */
    public final C25020 f9419 = new C25020(false);

    /* JADX INFO: renamed from: ֫ */
    public final void m8639(String str, AbstractC24329 abstractC24329) {
        if (abstractC24329 == null) {
            abstractC24329 = C9577.f26370;
        }
        this.f9419.put(str, abstractC24329);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Set m8640() {
        return this.f9419.entrySet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19676 m8638(String str) {
        return (C19676) this.f9419.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C4253) && ((C4253) obj).f9419.equals(this.f9419);
        }
        return true;
    }

    public final int hashCode() {
        return this.f9419.hashCode();
    }
}
