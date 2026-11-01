package p067l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6854 implements InterfaceC10012 {

    /* JADX INFO: renamed from: ֫ */
    public final int f17794;

    /* JADX INFO: renamed from: ۜ */
    public final long f17795;

    /* JADX INFO: renamed from: ۢ */
    public long f17796;

    /* JADX INFO: renamed from: ۧ */
    public C11729 f17797;

    /* JADX INFO: renamed from: ܳ */
    public long f17798;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC22948 f17799;

    /* JADX INFO: renamed from: ܿ */
    public long f17800;

    /* JADX INFO: renamed from: ᩳ */
    public C5318 f17801;

    /* JADX INFO: renamed from: ᩷ */
    public OutputStream f17802;

    /* JADX INFO: renamed from: ᩻ */
    public File f17803;

    public C6854(InterfaceC22948 interfaceC22948) {
        interfaceC22948.getClass();
        this.f17799 = interfaceC22948;
        this.f17795 = 5242880L;
        this.f17794 = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
    }

    @Override // p067l.InterfaceC10012
    /* JADX INFO: renamed from: ֫ */
    public final void mo15697(C5318 c5318) throws C23618 {
        int i = c5318.f12513;
        c5318.f12518.getClass();
        if (c5318.f12516 == -1 && (i & 2) == 2) {
            this.f17801 = null;
            return;
        }
        this.f17801 = c5318;
        this.f17798 = (i & 4) == 4 ? this.f17795 : C14849.FOREVER_NS;
        this.f17800 = 0L;
        try {
            m15696(c5318);
        } catch (IOException e) {
            throw new C23618(e);
        }
    }

    @Override // p067l.InterfaceC10012
    public final void write(byte[] bArr, int i, int i2) throws C23618 {
        C5318 c5318 = this.f17801;
        if (c5318 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f17796 == this.f17798) {
                    m15695();
                    m15696(c5318);
                }
                int iMin = (int) Math.min(i2 - i3, this.f17798 - this.f17796);
                OutputStream outputStream = this.f17802;
                String str = C5792.f14228;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f17796 += j;
                this.f17800 += j;
            } catch (IOException e) {
                throw new C23618(e);
            }
        }
    }

    @Override // p067l.InterfaceC10012
    public final void close() throws C23618 {
        if (this.f17801 == null) {
            return;
        }
        try {
            m15695();
        } catch (IOException e) {
            throw new C23618(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m15696(C5318 c5318) {
        long j = c5318.f12516;
        long jMin = j != -1 ? Math.min(j - this.f17800, this.f17798) : -1L;
        String str = c5318.f12518;
        String str2 = C5792.f14228;
        this.f17803 = this.f17799.mo40350(str, c5318.f12521 + this.f17800, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f17803);
        int i = this.f17794;
        if (i > 0) {
            C11729 c11729 = this.f17797;
            if (c11729 == null) {
                this.f17797 = new C11729(fileOutputStream, i);
            } else {
                c11729.m26935(fileOutputStream);
            }
            this.f17802 = this.f17797;
        } else {
            this.f17802 = fileOutputStream;
        }
        this.f17796 = 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15695() {
        OutputStream outputStream = this.f17802;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            C5792.m13000(this.f17802);
            this.f17802 = null;
            File file = this.f17803;
            this.f17803 = null;
            this.f17799.mo40353(file, this.f17796);
        } catch (Throwable th) {
            C5792.m13000(this.f17802);
            this.f17802 = null;
            File file2 = this.f17803;
            this.f17803 = null;
            file2.delete();
            throw th;
        }
    }
}
