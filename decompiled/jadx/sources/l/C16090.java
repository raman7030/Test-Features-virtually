package l;

import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܺᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16090 implements InterfaceC10405 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC5508 f49580;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12521 f49581 = new C12521();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49582;

    public C16090(InterfaceC5508 interfaceC5508) {
        if (interfaceC5508 == null) {
            throw new NullPointerException("sink == null");
        }
        this.f49580 = interfaceC5508;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ᩷ */
    public final C12521 mo26253() {
        return this.f49581;
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        this.f49581.mo8911(c12521, j);
        mo26248();
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10405 mo26246(C11816 c11816) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        this.f49581.m30710(c11816);
        mo26248();
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10405 mo26251(String str) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        C12521 c12521 = this.f49581;
        c12521.getClass();
        c12521.m30707(0, str.length(), str);
        mo26248();
        return this;
    }

    @Override // l.InterfaceC10405
    public final InterfaceC10405 write(byte[] bArr) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        C12521 c12521 = this.f49581;
        c12521.getClass();
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        c12521.write(bArr, 0, bArr.length);
        mo26248();
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC10405 mo26252(int i, int i2, byte[] bArr) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        this.f49581.write(bArr, i, i2);
        mo26248();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f49581.write(byteBuffer);
        mo26248();
        return iWrite;
    }

    @Override // l.InterfaceC10405
    public final InterfaceC10405 writeByte(int i) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        this.f49581.m30720writeByte(i);
        mo26248();
        return this;
    }

    @Override // l.InterfaceC10405
    public final InterfaceC10405 writeShort(int i) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        this.f49581.m30722writeShort(i);
        mo26248();
        return this;
    }

    @Override // l.InterfaceC10405
    public final InterfaceC10405 writeInt(int i) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        this.f49581.m30721writeInt(i);
        mo26248();
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC10405 mo26249(long j) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        this.f49581.m30715(j);
        mo26248();
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC10405 mo26247(long j) {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        this.f49581.m30712(j);
        mo26248();
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10405 mo26248() {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        C12521 c12521 = this.f49581;
        long jM30716 = c12521.m30716();
        if (jM30716 > 0) {
            this.f49580.mo8911(c12521, jM30716);
        }
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ܳܽ */
    public final OutputStream mo26250() {
        return new C9036(this);
    }

    @Override // l.InterfaceC10405, l.InterfaceC5508, java.io.Flushable
    public final void flush() {
        if (this.f49582) {
            throw new IllegalStateException("closed");
        }
        C12521 c12521 = this.f49581;
        long j = c12521.f37625;
        InterfaceC5508 interfaceC5508 = this.f49580;
        if (j > 0) {
            interfaceC5508.mo8911(c12521, j);
        }
        interfaceC5508.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f49582;
    }

    @Override // l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC5508 interfaceC5508 = this.f49580;
        if (this.f49582) {
            return;
        }
        C12521 c12521 = this.f49581;
        long j = c12521.f37625;
        if (j > 0) {
            interfaceC5508.mo8911(c12521, j);
        }
        th = null;
        try {
            interfaceC5508.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f49582 = true;
        if (th == null) {
            return;
        }
        Charset charset = C21736.f69703;
        throw th;
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo8912() {
        return this.f49580.mo8912();
    }

    public final String toString() {
        return "buffer(" + this.f49580 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
