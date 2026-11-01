package p067l;

import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩵ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20780 implements InterfaceC9934, InterfaceC24035, InterfaceC22339, InterfaceC2653 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f65327;

    public /* synthetic */ C20780(int i) {
        this.f65327 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m46927(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46928(String str, int i, String str2, String str3, int i2) {
        return str + i + str2 + i2 + str3;
    }

    @Override // p067l.InterfaceC24035
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9283 mo46929(UUID uuid) {
        return C19499.m44324(uuid);
    }

    @Override // p067l.InterfaceC2653
    public void accept(Object obj) {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f65327) {
            case 4:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        return new TreeMap();
    }
}
