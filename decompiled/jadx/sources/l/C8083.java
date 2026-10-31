package l;

import android.os.Message;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8083 implements InterfaceC7961, InterfaceC5146, InterfaceC13422, InterfaceC0300 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m21450(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21451(int i, String str) {
        C19956.m46037(str + i);
    }

    @Override // l.InterfaceC5146
    /* JADX INFO: renamed from: ֫ */
    public void mo7068(Object obj, Message message) {
        ((C15545) obj).m36660();
    }

    @Override // l.InterfaceC13422
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo21452(byte[] bArr) {
        return Arrays.equals(bArr, C11382.f34046);
    }

    @Override // l.InterfaceC0300
    public void accept(Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        if (closeable != null) {
            closeable.close();
        }
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }
}
