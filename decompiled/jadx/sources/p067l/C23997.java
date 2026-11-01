package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23997 implements InterfaceC2538 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f76210 = false;

    /* JADX INFO: renamed from: ۧ */
    public C21808 f76211 = new C13269(this);

    /* JADX INFO: renamed from: ܽ */
    public C9245[] f76212;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ int f76213;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ HashMap f76214;

    public C23997(int i, HashMap map) {
        this.f76213 = i;
        this.f76214 = map;
        this.f76212 = new C9245[i];
    }

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3727(Object obj, Object obj2, AbstractC3880 abstractC3880, AbstractC3880 abstractC3881) {
        ArrayList arrayList;
        C15279 c15279;
        C15279 c152710;
        C9245[] c9245Arr = (C9245[]) obj;
        C9245[] c9245Arr2 = (C9245[]) obj2;
        int i = this.f76213;
        if (c9245Arr2 == null) {
            c9245Arr2 = new C9245[i];
            System.arraycopy(c9245Arr, 0, c9245Arr2, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                C9245 c9245 = c9245Arr[i2];
                C9245 c9246 = c9245Arr2[i2];
                if (c9245 != null) {
                    if (c9246 == null) {
                        c9245Arr2[i2] = c9245;
                    } else if (c9245 != c9246) {
                        C15279 c152711 = c9245.f25070;
                        if (c152711 != null) {
                            c152711.f43605 = true;
                        }
                        C15279 c152712 = c9246.f25070;
                        if (c152712 != null) {
                            c152712.f43605 = true;
                        }
                    }
                }
            }
        }
        if (abstractC3881.f8417 == EnumC9677.LABEL && (arrayList = ((C15041) abstractC3881).f42963) != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (AbstractC10348 abstractC10348 : ((C23089) it.next()).f45528.mo17753()) {
                    int i3 = ((C19736) abstractC10348).f60034;
                    C9245 c9247 = c9245Arr[i3];
                    C9245 c9248 = c9245Arr2[i3];
                    if (c9248 != null) {
                        if (!c9248.f25069 && (c152710 = c9248.f25070) != null) {
                            c152710.f43605 = true;
                        }
                    } else if (c9247 != null && !c9247.f25069 && (c15279 = c9247.f25070) != null) {
                        c15279.f43605 = true;
                    }
                }
            }
        }
        return c9245Arr2;
    }

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3728(Object obj, AbstractC3880 abstractC3880) {
        this.f76210 = false;
        int i = this.f76213;
        C9245[] c9245Arr = this.f76212;
        System.arraycopy((C9245[]) obj, 0, c9245Arr, 0, i);
        this.f76211.mo30320(abstractC3880);
        if (abstractC3880.f8409.size() > 1) {
            this.f76210 = true;
        }
        if (!this.f76210) {
            abstractC3880.f8416 = null;
        }
        return c9245Arr;
    }

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3726() {
        return new C9245[this.f76213];
    }
}
