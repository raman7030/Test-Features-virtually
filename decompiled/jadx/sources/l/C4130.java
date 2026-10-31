package l;

/* JADX INFO: renamed from: l.ۘᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBI6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4130 implements InterfaceC9775 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21064 f13092;

    public C4130() {
        C21064 c21064 = new C21064();
        this.f13092 = c21064;
        c21064.m47914();
    }

    @Override // l.InterfaceC9775
    public final void add(int i) {
        C21064 c21064 = this.f13092;
        int iM47912 = c21064.m47912(i);
        if (iM47912 < 0) {
            c21064.m47916(-(iM47912 + 1), i);
        }
    }

    @Override // l.InterfaceC9775
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo12406(int i) {
        int iM47912 = this.f13092.m47912(i);
        if (iM47912 < 0) {
            iM47912 = -1;
        }
        return iM47912 >= 0;
    }

    @Override // l.InterfaceC9775
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12405(InterfaceC9775 interfaceC9775) {
        boolean z = interfaceC9775 instanceof C4130;
        int iM32623 = 0;
        C21064 c21064 = this.f13092;
        if (z) {
            C21064 c21065 = ((C4130) interfaceC9775).f13092;
            int size = c21064.size();
            int size2 = c21065.size();
            int i = 0;
            while (iM32623 < size2 && i < size) {
                while (iM32623 < size2 && c21065.get(iM32623) < c21064.get(i)) {
                    add(c21065.get(iM32623));
                    iM32623++;
                }
                if (iM32623 == size2) {
                    break;
                }
                while (i < size && c21065.get(iM32623) >= c21064.get(i)) {
                    i++;
                }
            }
            while (iM32623 < size2) {
                add(c21065.get(iM32623));
                iM32623++;
            }
            c21064.m47914();
            return;
        }
        if (interfaceC9775 instanceof C22746) {
            C22746 c22746 = (C22746) interfaceC9775;
            while (iM32623 >= 0) {
                c21064.add(iM32623);
                iM32623 = C13573.m32623(iM32623 + 1, c22746.f73462);
            }
            c21064.m47914();
            return;
        }
        InterfaceC6952 it = interfaceC9775.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // l.InterfaceC9775
    public final int elements() {
        return this.f13092.size();
    }

    @Override // l.InterfaceC9775
    public final InterfaceC6952 iterator() {
        return new C2719(this);
    }

    public final String toString() {
        return this.f13092.toString();
    }
}
