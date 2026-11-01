package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܺᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17660 implements InterfaceC12257 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC7603 f52743;

    /* JADX INFO: renamed from: ᩸ */
    public final C14268 f52744 = new C14268();

    /* JADX INFO: renamed from: ᩹ */
    public boolean f52745;

    public C17660(InterfaceC7603 interfaceC7603) {
        if (interfaceC7603 == null) {
            throw new NullPointerException("sink == null");
        }
        this.f52743 = interfaceC7603;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ᩷ */
    public final C14268 mo28282() {
        return this.f52744;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        this.f52744.mo10979(c14268, j);
        mo28277();
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12257 mo28275(C13598 c13598) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        this.f52744.m32784(c13598);
        mo28277();
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12257 mo28280(String str) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        C14268 c14268 = this.f52744;
        c14268.getClass();
        c14268.m32781(0, str.length(), str);
        mo28277();
        return this;
    }

    @Override // p067l.InterfaceC12257
    public final InterfaceC12257 write(byte[] bArr) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        C14268 c14268 = this.f52744;
        c14268.getClass();
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        c14268.write(bArr, 0, bArr.length);
        mo28277();
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC12257 mo28281(int i, int i2, byte[] bArr) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        this.f52744.write(bArr, i, i2);
        mo28277();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f52744.write(byteBuffer);
        mo28277();
        return iWrite;
    }

    @Override // p067l.InterfaceC12257
    public final InterfaceC12257 writeByte(int i) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        this.f52744.m56480writeByte(i);
        mo28277();
        return this;
    }

    @Override // p067l.InterfaceC12257
    public final InterfaceC12257 writeShort(int i) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        this.f52744.m56482writeShort(i);
        mo28277();
        return this;
    }

    @Override // p067l.InterfaceC12257
    public final InterfaceC12257 writeInt(int i) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        this.f52744.m56481writeInt(i);
        mo28277();
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC12257 mo28278(long j) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        this.f52744.m32789(j);
        mo28277();
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC12257 mo28276(long j) {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        this.f52744.m32786(j);
        mo28277();
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC12257 mo28277() {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        C14268 c14268 = this.f52744;
        long jM32790 = c14268.m32790();
        if (jM32790 > 0) {
            this.f52743.mo10979(c14268, jM32790);
        }
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ܳܽ */
    public final OutputStream mo28279() {
        return new C10956(this);
    }

    @Override // p067l.InterfaceC12257, p067l.InterfaceC7603, java.io.Flushable
    public final void flush() {
        if (this.f52745) {
            throw new IllegalStateException("closed");
        }
        C14268 c14268 = this.f52744;
        long j = c14268.f40649;
        InterfaceC7603 interfaceC7603 = this.f52743;
        if (j > 0) {
            interfaceC7603.mo10979(c14268, j);
        }
        interfaceC7603.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f52745;
    }

    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC7603 interfaceC7603 = this.f52743;
        if (this.f52745) {
            return;
        }
        C14268 c14268 = this.f52744;
        long j = c14268.f40649;
        if (j > 0) {
            interfaceC7603.mo10979(c14268, j);
        }
        th = null;
        try {
            interfaceC7603.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f52745 = true;
        if (th == null) {
            return;
        }
        Charset charset = C23026.f72410;
        throw th;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return this.f52743.mo10980();
    }

    public final String toString() {
        return "buffer(" + this.f52743 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
