package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23751 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m52404(int[] iArr, int[] iArr2, C4701 c4701) {
        c4701.m13775();
        try {
            return m52403(new C23129(C23045.m51214(iArr, iArr2), iArr.length, iArr2.length));
        } catch (C13872 unused) {
            throw new C15367();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m52402(List list, List list2, C4701 c4701) {
        Object[] array = list.toArray();
        Object[] array2 = list2.toArray();
        c4701.m13775();
        try {
            return m52403(new C23129(C23045.m51216(array, array2), array.length, array2.length));
        } catch (C13872 unused) {
            throw new C15367();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1879 m52399(int i, int i2, List list) {
        return new C9641(new C15989(i, i2, list));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1879 m52400(ArrayList arrayList, int i, int i2) {
        return new C15989(i, i2, arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m52403(InterfaceC1879 interfaceC1879) {
        return interfaceC1879 instanceof InterfaceC6818 ? (InterfaceC6818) interfaceC1879 : new C20930(interfaceC1879);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1879 m52401(InterfaceC6818 interfaceC6818, int i, int i2, int i3, int i4) {
        return new C3996(interfaceC6818, i, i2, i3, i4);
    }
}
