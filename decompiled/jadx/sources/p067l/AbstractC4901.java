package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y660 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4901 implements InterfaceC23676 {

    /* JADX INFO: renamed from: ֫ */
    public List f11165;

    @Override // p067l.InterfaceC23676
    public int getLine() {
        return 0;
    }

    @Override // p067l.InterfaceC23676
    public InterfaceC23676 getParent() {
        return null;
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ֫ */
    public int mo10395() {
        return 0;
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ۧ */
    public int mo10398() {
        return 0;
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ۧ */
    public void mo10399(InterfaceC23676 interfaceC23676) {
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ᩳ */
    public void mo10400(int i) {
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ᩳ */
    public boolean mo10401() {
        return false;
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC23676 mo10396(int i) {
        List list = this.f11165;
        if (list == null || i >= list.size()) {
            return null;
        }
        return (InterfaceC23676) this.f11165.get(i);
    }

    @Override // p067l.InterfaceC23676
    public final int getChildCount() {
        List list = this.f11165;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ֫ */
    public final void mo10397(InterfaceC23676 interfaceC23676) {
        if (interfaceC23676 == null) {
            return;
        }
        AbstractC4901 abstractC4901 = (AbstractC4901) interfaceC23676;
        if (abstractC4901.mo10401()) {
            List list = this.f11165;
            if (list != null && list == abstractC4901.f11165) {
                throw new RuntimeException("attempt to add child list to itself");
            }
            List list2 = abstractC4901.f11165;
            if (list2 != null) {
                int i = 0;
                if (list != null) {
                    int size = list2.size();
                    while (i < size) {
                        InterfaceC23676 interfaceC23677 = (InterfaceC23676) abstractC4901.f11165.get(i);
                        this.f11165.add(interfaceC23677);
                        interfaceC23677.mo10399(this);
                        interfaceC23677.mo10400(this.f11165.size() - 1);
                        i++;
                    }
                    return;
                }
                this.f11165 = list2;
                int childCount = getChildCount();
                while (i < childCount) {
                    InterfaceC23676 interfaceC23676Mo10396 = mo10396(i);
                    interfaceC23676Mo10396.mo10400(i);
                    interfaceC23676Mo10396.mo10399(this);
                    i++;
                }
                return;
            }
            return;
        }
        if (this.f11165 == null) {
            this.f11165 = new ArrayList();
        }
        this.f11165.add(interfaceC23676);
        abstractC4901.mo10399(this);
        abstractC4901.mo10400(this.f11165.size() - 1);
    }
}
