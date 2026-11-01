package p067l;

/* JADX INFO: renamed from: l.ۘᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBI6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6294 implements InterfaceC11659 {

    /* JADX INFO: renamed from: ֫ */
    public final C22388 f15906;

    public C6294() {
        C22388 c22388 = new C22388();
        this.f15906 = c22388;
        c22388.m50244();
    }

    @Override // p067l.InterfaceC11659
    public final void add(int i) {
        C22388 c22388 = this.f15906;
        int iM50242 = c22388.m50242(i);
        if (iM50242 < 0) {
            c22388.m50246(-(iM50242 + 1), i);
        }
    }

    @Override // p067l.InterfaceC11659
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14296(int i) {
        int iM50242 = this.f15906.m50242(i);
        if (iM50242 < 0) {
            iM50242 = -1;
        }
        return iM50242 >= 0;
    }

    @Override // p067l.InterfaceC11659
    /* JADX INFO: renamed from: ֫ */
    public final void mo14295(InterfaceC11659 interfaceC11659) {
        boolean z = interfaceC11659 instanceof C6294;
        int iM34735 = 0;
        C22388 c22388 = this.f15906;
        if (z) {
            C22388 c22389 = ((C6294) interfaceC11659).f15906;
            int size = c22388.size();
            int size2 = c22389.size();
            int i = 0;
            while (iM34735 < size2 && i < size) {
                while (iM34735 < size2 && c22389.get(iM34735) < c22388.get(i)) {
                    add(c22389.get(iM34735));
                    iM34735++;
                }
                if (iM34735 == size2) {
                    break;
                }
                while (i < size && c22389.get(iM34735) >= c22388.get(i)) {
                    i++;
                }
            }
            while (iM34735 < size2) {
                add(c22389.get(iM34735));
                iM34735++;
            }
            c22388.m50244();
            return;
        }
        if (interfaceC11659 instanceof C23986) {
            C23986 c23986 = (C23986) interfaceC11659;
            while (iM34735 >= 0) {
                c22388.add(iM34735);
                iM34735 = C15268.m34735(iM34735 + 1, c23986.f76188);
            }
            c22388.m50244();
            return;
        }
        InterfaceC8976 it = interfaceC11659.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // p067l.InterfaceC11659
    public final int elements() {
        return this.f15906.size();
    }

    @Override // p067l.InterfaceC11659
    public final InterfaceC8976 iterator() {
        return new C4953(this);
    }

    public final String toString() {
        return this.f15906.toString();
    }
}
