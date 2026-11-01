package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AT0 */
/* JADX INFO: loaded from: classes4.dex */
public class C10856 extends C20915 {

    /* JADX INFO: renamed from: ܳ */
    public static final C10856 f30088 = new C10856();

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f30089;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC2808 f30090;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC2808 f30091;

    public C10856() {
        this.f65694 = -1;
    }

    public C10856(int i, C10856 c10856) {
        this.f65695 = c10856;
        this.f65694 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25015(InterfaceC17740 interfaceC17740) {
        if (this.f30089 == null) {
            this.f30089 = new ArrayList();
        }
        this.f30089.add(interfaceC17740);
    }

    @Override // p067l.C20915, p067l.InterfaceC17740
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17740 mo25014(int i) {
        ArrayList arrayList = this.f30089;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (InterfaceC17740) this.f30089.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10856 m25013(Class cls, int i) {
        ArrayList arrayList = this.f30089;
        InterfaceC17740 interfaceC17740 = null;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            int i2 = -1;
            for (InterfaceC17740 interfaceC17741 : this.f30089) {
                if (cls.isInstance(interfaceC17741) && (i2 = i2 + 1) == i) {
                    interfaceC17740 = (InterfaceC17740) cls.cast(interfaceC17741);
                    break;
                }
            }
        }
        return (C10856) interfaceC17740;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6342 m25012(int i, int i2) {
        ArrayList arrayList = this.f30089;
        if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
            return null;
        }
        int i3 = -1;
        for (InterfaceC17740 interfaceC17740 : this.f30089) {
            if (interfaceC17740 instanceof InterfaceC6342) {
                InterfaceC6342 interfaceC6342 = (InterfaceC6342) interfaceC17740;
                if (interfaceC6342.mo14503().getType() == i && (i3 = i3 + 1) == i2) {
                    return interfaceC6342;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m25016(int i) {
        ArrayList<InterfaceC17740> arrayList = this.f30089;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = null;
        for (InterfaceC17740 interfaceC17740 : arrayList) {
            if (interfaceC17740 instanceof InterfaceC6342) {
                InterfaceC6342 interfaceC6342 = (InterfaceC6342) interfaceC17740;
                if (interfaceC6342.mo14503().getType() == i) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(interfaceC6342);
                }
            }
        }
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m25011(Class cls) {
        ArrayList<InterfaceC17740> arrayList = this.f30089;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = null;
        for (InterfaceC17740 interfaceC17740 : arrayList) {
            if (cls.isInstance(interfaceC17740)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((C10856) cls.cast(interfaceC17740));
            }
        }
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    @Override // p067l.C20915, p067l.InterfaceC17740
    public final int getChildCount() {
        ArrayList arrayList = this.f30089;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
