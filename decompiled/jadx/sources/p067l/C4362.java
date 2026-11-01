package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.֫᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C4362 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8205 m9097(InterfaceC8205 interfaceC8205) {
        if ((interfaceC8205 instanceof C15580) || (interfaceC8205 instanceof C13570)) {
            return interfaceC8205;
        }
        if (interfaceC8205 instanceof Serializable) {
            return new C13570(interfaceC8205);
        }
        return new C15580(interfaceC8205);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8205 m9096(Object obj) {
        return new C9546(obj);
    }
}
