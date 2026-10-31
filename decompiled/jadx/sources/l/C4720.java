package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C4720 implements InterfaceC8043 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f14963;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f14964;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f14965;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9849 f14966;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f14967;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21654 f14968;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f14969;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3104 f14970;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public OutputStream f14971;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public File f14972;

    public C4720(InterfaceC21654 interfaceC21654) {
        interfaceC21654.getClass();
        this.f14968 = interfaceC21654;
        this.f14964 = 5242880L;
        this.f14963 = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
    }

    @Override // l.InterfaceC8043
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13821(C3104 c3104) throws C22359 {
        int i = c3104.f9710;
        c3104.f9715.getClass();
        if (c3104.f9713 == -1 && (i & 2) == 2) {
            this.f14970 = null;
            return;
        }
        this.f14970 = c3104;
        this.f14967 = (i & 4) == 4 ? this.f14964 : C13132.FOREVER_NS;
        this.f14969 = 0L;
        try {
            m13820(c3104);
        } catch (IOException e) {
            throw new C22359(e);
        }
    }

    @Override // l.InterfaceC8043
    public final void write(byte[] bArr, int i, int i2) throws C22359 {
        C3104 c3104 = this.f14970;
        if (c3104 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f14965 == this.f14967) {
                    m13819();
                    m13820(c3104);
                }
                int iMin = (int) Math.min(i2 - i3, this.f14967 - this.f14965);
                OutputStream outputStream = this.f14971;
                String str = C3603.f11424;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f14965 += j;
                this.f14969 += j;
            } catch (IOException e) {
                throw new C22359(e);
            }
        }
    }

    @Override // l.InterfaceC8043
    public final void close() throws C22359 {
        if (this.f14970 == null) {
            return;
        }
        try {
            m13819();
        } catch (IOException e) {
            throw new C22359(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13820(C3104 c3104) {
        long j = c3104.f9713;
        long jMin = j != -1 ? Math.min(j - this.f14969, this.f14967) : -1L;
        String str = c3104.f9715;
        String str2 = C3603.f11424;
        this.f14972 = this.f14968.mo38138(str, c3104.f9718 + this.f14969, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f14972);
        int i = this.f14963;
        if (i > 0) {
            C9849 c9849 = this.f14966;
            if (c9849 == null) {
                this.f14966 = new C9849(fileOutputStream, i);
            } else {
                c9849.m24920(fileOutputStream);
            }
            this.f14971 = this.f14966;
        } else {
            this.f14971 = fileOutputStream;
        }
        this.f14965 = 0L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13819() {
        OutputStream outputStream = this.f14971;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            C3603.m11024(this.f14971);
            this.f14971 = null;
            File file = this.f14972;
            this.f14972 = null;
            this.f14968.mo38141(file, this.f14965);
        } catch (Throwable th) {
            C3603.m11024(this.f14971);
            this.f14971 = null;
            File file2 = this.f14972;
            this.f14972 = null;
            file2.delete();
            throw th;
        }
    }
}
