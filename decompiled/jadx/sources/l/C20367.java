package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C8XW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20367 extends AbstractC8540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15719 f65742 = new C15719();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65743 = new ArrayList();

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f65742;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        if (interfaceC19124.mo44151() >= 4) {
            return new C14721(-1, interfaceC19124.mo44150() + 4, false);
        }
        if (interfaceC19124.mo44149()) {
            return C14721.m35022(interfaceC19124.mo44153());
        }
        return null;
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7218(C16300 c16300) {
        this.f65743.add(c16300.m38335());
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ۜ */
    public final void mo7221() {
        int i;
        CharSequence charSequence;
        ArrayList arrayList = this.f65743;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                break;
            } else {
                charSequence = (CharSequence) arrayList.get(size);
            }
        } while (C8751.m22636(0, charSequence.length(), charSequence) == charSequence.length());
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb.append((CharSequence) arrayList.get(i));
            sb.append('\n');
        }
        this.f65742.m37092(sb.toString());
    }
}
