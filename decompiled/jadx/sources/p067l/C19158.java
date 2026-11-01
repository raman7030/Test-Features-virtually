package p067l;

import android.content.pm.ShortcutManager;
import java.io.InputStream;
import net.p069sf.sevenzipjbinding.NativeXZInputStream;

/* JADX INFO: renamed from: l.ܿ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19158 implements InterfaceC9934, InterfaceC18263, InterfaceC22339, InterfaceC2739 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57222;

    public /* synthetic */ C19158(int i) {
        this.f57222 = i;
    }

    public /* synthetic */ C19158(C2772 c2772, int i) {
        this.f57222 = 3;
    }

    public /* synthetic */ C19158(C2772 c2772, C20386 c20386) {
        this.f57222 = 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ Class m43631() {
        return ShortcutManager.class;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ String m43632(long j) {
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

    @Override // p067l.InterfaceC2739
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo4278(InputStream inputStream) {
        return new NativeXZInputStream(inputStream);
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        return ((InterfaceC11441) obj).mo13102().m19035();
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f57222) {
            case 3:
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
        return new ConcurrentMapC12768();
    }
}
