package p067l;

/* JADX INFO: renamed from: l.ܺᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBEV */
/* JADX INFO: loaded from: classes5.dex */
public class C17692 extends C19034 {

    /* JADX INFO: renamed from: ᩶ */
    public final C22388 f52834;

    public C17692(int i) {
        super(i);
        this.f52834 = new C22388(i);
    }

    public C17692(C18759 c18759) {
        super(c18759.size());
        this.f52834 = c18759.f52834.m50243();
        int size = c18759.size();
        for (int i = 0; i < size; i++) {
            m43241(i, c18759.m43238(i));
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m40215() {
        C22388 c22388 = this.f52834;
        int size = c22388.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
        } while (c22388.get(size) < 0);
        int i = size + 1;
        c22388.m50248(i);
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m40216(int i, C2880 c2880) {
        m40217(i, (InterfaceC10988) c2880);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m40219(int i) {
        C22388 c22388 = this.f52834;
        if (i >= c22388.size()) {
            return -1;
        }
        return c22388.get(i);
    }

    @Override // p067l.C19034
    /* JADX INFO: renamed from: ۚ */
    public final void mo40218() {
        super.mo40218();
        int size = size();
        for (int i = 0; i < size; i++) {
            this.f52834.set(((InterfaceC10988) m43238(i)).mo4636(), i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40217(int i, InterfaceC10988 interfaceC10988) {
        InterfaceC10988 interfaceC10989 = (InterfaceC10988) m43250(i);
        m43241(i, (Object) interfaceC10988);
        C22388 c22388 = this.f52834;
        if (interfaceC10989 != null) {
            c22388.set(interfaceC10989.mo4636(), -1);
        }
        if (interfaceC10988 != null) {
            int iMo4636 = interfaceC10988.mo4636();
            int size = c22388.size();
            for (int i2 = 0; i2 <= iMo4636 - size; i2++) {
                c22388.add(-1);
            }
            c22388.set(iMo4636, i);
        }
    }
}
