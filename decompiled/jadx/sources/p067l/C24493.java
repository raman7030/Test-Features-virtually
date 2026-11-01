package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.᩺᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q398 */
/* JADX INFO: loaded from: classes.dex */
public final class C24493 implements InterfaceC15775 {

    /* JADX INFO: renamed from: ֫ */
    public List f77497 = C18426.m41997();

    @Override // p067l.InterfaceC15775
    /* JADX INFO: renamed from: ֫ */
    public final void mo35845(C18258 c18258) {
        C12826.requireNonNull(c18258);
        this.f77497.add(c18258);
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m53990() {
        return C21562.unmodifiableList(this.f77497);
    }
}
