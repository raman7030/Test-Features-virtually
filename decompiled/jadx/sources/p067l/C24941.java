package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24941 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8848 m54813(int[] iArr, int[] iArr2, C6836 c6836) {
        c6836.m15650();
        try {
            return m54812(new C24350(C24270.m53607(iArr, iArr2), iArr.length, iArr2.length));
        } catch (C15552 unused) {
            throw new C16973();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8848 m54811(List list, List list2, C6836 c6836) {
        Object[] array = list.toArray();
        Object[] array2 = list2.toArray();
        c6836.m15650();
        try {
            return m54812(new C24350(C24270.m53609(array, array2), array.length, array2.length));
        } catch (C15552 unused) {
            throw new C16973();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC4154 m54808(int i, int i2, List list) {
        return new C11531(new C17564(i, i2, list));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC4154 m54809(ArrayList arrayList, int i, int i2) {
        return new C17564(i, i2, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8848 m54812(InterfaceC4154 interfaceC4154) {
        return interfaceC4154 instanceof InterfaceC8848 ? (InterfaceC8848) interfaceC4154 : new C22260(interfaceC4154);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC4154 m54810(InterfaceC8848 interfaceC8848, int i, int i2, int i3, int i4) {
        return new C6166(interfaceC8848, i, i2, i3, i4);
    }
}
