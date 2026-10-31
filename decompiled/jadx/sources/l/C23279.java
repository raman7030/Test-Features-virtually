package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩺᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q398 */
/* JADX INFO: loaded from: classes.dex */
public final class C23279 implements InterfaceC14106 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f74753 = C16895.m39756();

    @Override // l.InterfaceC14106
    /* JADX INFO: renamed from: ֫ */
    public final void mo33719(C16719 c16719) {
        C11003.requireNonNull(c16719);
        this.f74753.add(c16719);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m51594() {
        return C20195.unmodifiableList(this.f74753);
    }
}
