package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8I6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3422 implements InterfaceC13571 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f10801;

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final int mo4658() {
        return 1;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final int mo4659(long j) {
        return j < 0 ? 0 : -1;
    }

    public C3422(List list) {
        this.f10801 = list;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final long mo4660(int i) {
        C22632.m50631(i == 0);
        return 0L;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ܽ */
    public final List mo4661(long j) {
        return j >= 0 ? this.f10801 : Collections.EMPTY_LIST;
    }
}
