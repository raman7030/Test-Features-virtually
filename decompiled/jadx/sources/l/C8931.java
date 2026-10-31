package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AT0 */
/* JADX INFO: loaded from: classes4.dex */
public class C8931 extends C19515 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C8931 f27153 = new C8931();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f27154;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f27155;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f27156;

    public C8931() {
        this.f63074 = -1;
    }

    public C8931(int i, C8931 c8931) {
        this.f63075 = c8931;
        this.f63074 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23041(InterfaceC16174 interfaceC16174) {
        if (this.f27154 == null) {
            this.f27154 = new ArrayList();
        }
        this.f27154.add(interfaceC16174);
    }

    @Override // l.C19515, l.InterfaceC16174
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16174 mo23040(int i) {
        ArrayList arrayList = this.f27154;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (InterfaceC16174) this.f27154.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8931 m23039(Class cls, int i) {
        ArrayList arrayList = this.f27154;
        InterfaceC16174 interfaceC16174 = null;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            int i2 = -1;
            for (InterfaceC16174 interfaceC16175 : this.f27154) {
                if (cls.isInstance(interfaceC16175) && (i2 = i2 + 1) == i) {
                    interfaceC16174 = (InterfaceC16174) cls.cast(interfaceC16175);
                    break;
                }
            }
        }
        return (C8931) interfaceC16174;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4181 m23038(int i, int i2) {
        ArrayList arrayList = this.f27154;
        if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
            return null;
        }
        int i3 = -1;
        for (InterfaceC16174 interfaceC16174 : this.f27154) {
            if (interfaceC16174 instanceof InterfaceC4181) {
                InterfaceC4181 interfaceC4181 = (InterfaceC4181) interfaceC16174;
                if (interfaceC4181.mo12628().getType() == i && (i3 = i3 + 1) == i2) {
                    return interfaceC4181;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m23042(int i) {
        ArrayList<InterfaceC16174> arrayList = this.f27154;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = null;
        for (InterfaceC16174 interfaceC16174 : arrayList) {
            if (interfaceC16174 instanceof InterfaceC4181) {
                InterfaceC4181 interfaceC4181 = (InterfaceC4181) interfaceC16174;
                if (interfaceC4181.mo12628().getType() == i) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(interfaceC4181);
                }
            }
        }
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m23037(Class cls) {
        ArrayList<InterfaceC16174> arrayList = this.f27154;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = null;
        for (InterfaceC16174 interfaceC16174 : arrayList) {
            if (cls.isInstance(interfaceC16174)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((C8931) cls.cast(interfaceC16174));
            }
        }
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    @Override // l.C19515, l.InterfaceC16174
    public final int getChildCount() {
        ArrayList arrayList = this.f27154;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
