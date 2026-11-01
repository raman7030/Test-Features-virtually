package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C8XW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21725 extends AbstractC10484 {

    /* JADX INFO: renamed from: ֫ */
    public final C17307 f68418 = new C17307();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f68419 = new ArrayList();

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f68418;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        if (interfaceC20543.mo46445() >= 4) {
            return new C16359(-1, interfaceC20543.mo46444() + 4, false);
        }
        if (interfaceC20543.mo46443()) {
            return C16359.m37169(interfaceC20543.mo46447());
        }
        return null;
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9297(C17859 c17859) {
        this.f68419.add(c17859.m40550());
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ۜ */
    public final void mo9300() {
        int i;
        CharSequence charSequence;
        ArrayList arrayList = this.f68419;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                break;
            } else {
                charSequence = (CharSequence) arrayList.get(size);
            }
        } while (C10685.m24606(0, charSequence.length(), charSequence) == charSequence.length());
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb.append((CharSequence) arrayList.get(i));
            sb.append('\n');
        }
        this.f68418.m39261(sb.toString());
    }
}
