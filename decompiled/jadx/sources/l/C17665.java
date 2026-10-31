package l;

import android.content.pm.ShortcutManager;
import java.io.InputStream;
import net.sf.sevenzipjbinding.NativeXZInputStream;

/* JADX INFO: renamed from: l.ܿ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17665 implements InterfaceC7961, InterfaceC16724, InterfaceC21013, InterfaceC0390 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54029;

    public /* synthetic */ C17665(int i) {
        this.f54029 = i;
    }

    public /* synthetic */ C17665(C0425 c0425, int i) {
        this.f54029 = 3;
    }

    public /* synthetic */ C17665(C0425 c0425, C18958 c18958) {
        this.f54029 = 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m41385() {
        return ShortcutManager.class;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m41386(long j) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 16);
        }
        int i = 64;
        char[] cArr = new char[64];
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(16);
        do {
            i--;
            cArr[i] = Character.forDigit(((int) j) & 15, 16);
            j >>>= iNumberOfTrailingZeros;
        } while (j != 0);
        return new String(cArr, i, 64 - i);
    }

    @Override // l.InterfaceC0390
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo1886(InputStream inputStream) {
        return new NativeXZInputStream(inputStream);
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        return ((InterfaceC9546) obj).mo11126().m17103();
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f54029) {
            case 3:
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
        return new ConcurrentMapC10942();
    }
}
