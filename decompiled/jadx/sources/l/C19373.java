package l;

import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩵ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19373 implements InterfaceC7961, InterfaceC22798, InterfaceC21013, InterfaceC0300 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62716;

    public /* synthetic */ C19373(int i) {
        this.f62716 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44633(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44634(String str, int i, String str2, String str3, int i2) {
        return str + i + str2 + i2 + str3;
    }

    @Override // l.InterfaceC22798
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7276 mo44635(UUID uuid) {
        return C18025.m42073(uuid);
    }

    @Override // l.InterfaceC0300
    public void accept(Object obj) {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f62716) {
            case 4:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        return new TreeMap();
    }
}
