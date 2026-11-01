package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: TASN */
/* JADX INFO: loaded from: classes4.dex */
public final class C21174 {

    /* JADX INFO: renamed from: ֫ */
    public final int f66541;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20503[] f66542;

    public C21174(InterfaceC20503[] interfaceC20503Arr) {
        this.f66542 = interfaceC20503Arr;
        int iM9000 = 0;
        for (InterfaceC20503 interfaceC20503 : interfaceC20503Arr) {
            iM9000 = C4358.m9000(iM9000, interfaceC20503);
        }
        this.f66541 = C4358.m8999(iM9000, interfaceC20503Arr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21174 m47793(C21174 c21174, InterfaceC20503 interfaceC20503) {
        if (c21174 == null) {
            return new C21174(new InterfaceC20503[]{interfaceC20503});
        }
        InterfaceC20503[] interfaceC20503Arr = c21174.f66542;
        InterfaceC20503[] interfaceC20503Arr2 = (InterfaceC20503[]) Arrays.copyOf(interfaceC20503Arr, interfaceC20503Arr.length + 1);
        interfaceC20503Arr2[interfaceC20503Arr2.length - 1] = interfaceC20503;
        return new C21174(interfaceC20503Arr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21174 m47794(int i) {
        InterfaceC20503[] interfaceC20503Arr = null;
        int i2 = 0;
        while (true) {
            InterfaceC20503[] interfaceC20503Arr2 = this.f66542;
            if (i2 >= interfaceC20503Arr2.length) {
                break;
            }
            if (interfaceC20503Arr2[i2].mo7194() && !(interfaceC20503Arr2[i2] instanceof C10444)) {
                if (interfaceC20503Arr == null) {
                    interfaceC20503Arr = (InterfaceC20503[]) interfaceC20503Arr2.clone();
                }
                interfaceC20503Arr[i2] = new C10444(i, interfaceC20503Arr2[i2]);
            }
            i2++;
        }
        return interfaceC20503Arr == null ? this : new C21174(interfaceC20503Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47795(AbstractC24937 abstractC24937, InterfaceC24346 interfaceC24346, int i) throws Throwable {
        int iIndex = interfaceC24346.index();
        boolean z = false;
        try {
            InterfaceC20503[] interfaceC20503Arr = this.f66542;
            int length = interfaceC20503Arr.length;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    InterfaceC20503 interfaceC20503M24160 = interfaceC20503Arr[i2];
                    if (interfaceC20503M24160 instanceof C10444) {
                        int iM24161 = ((C10444) interfaceC20503M24160).m24161() + i;
                        interfaceC24346.mo8403(iM24161);
                        interfaceC20503M24160 = ((C10444) interfaceC20503M24160).m24160();
                        z2 = iM24161 != iIndex;
                    } else if (interfaceC20503M24160.mo7194()) {
                        interfaceC24346.mo8403(iIndex);
                    }
                    interfaceC20503M24160.mo7193(abstractC24937);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC24346.mo8403(iIndex);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC24346.mo8403(iIndex);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int hashCode() {
        return this.f66541;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21174)) {
            return false;
        }
        C21174 c21174 = (C21174) obj;
        return this.f66541 == c21174.f66541 && Arrays.equals(this.f66542, c21174.f66542);
    }
}
