package p067l;

import android.os.Message;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10050 implements InterfaceC9934, InterfaceC7259, InterfaceC15125, InterfaceC2653 {
    /* JADX INFO: renamed from: ֫ */
    public static long m23418(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23419(int i, String str) {
        C21334.m48351(str + i);
    }

    @Override // p067l.InterfaceC7259
    /* JADX INFO: renamed from: ֫ */
    public void mo9163(Object obj, Message message) {
        ((C17143) obj).m38821();
    }

    @Override // p067l.InterfaceC15125
    /* JADX INFO: renamed from: ֫ */
    public boolean mo23420(byte[] bArr) {
        return Arrays.equals(bArr, C13186.f37044);
    }

    @Override // p067l.InterfaceC2653
    public void accept(Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        if (closeable != null) {
            closeable.close();
        }
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }
}
