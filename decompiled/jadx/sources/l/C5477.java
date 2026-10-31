package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۚܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70O */
/* JADX INFO: loaded from: classes3.dex */
public final class C5477 implements InterfaceC4339, InterfaceC2655 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f17008 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15587 f17009;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f17010;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f17011;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1785 f17012;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f17013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FileChannel f17014;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17471 f17015;

    public C5477(C15587 c15587, C1785 c1785, FileChannel fileChannel, C17471 c17471, BooleanSupplier booleanSupplier) {
        this.f17009 = c15587;
        this.f17012 = c1785;
        this.f17010 = (int) Math.min(c1785.m5940(), 2147483647L);
        this.f17014 = fileChannel;
        this.f17015 = c17471;
        this.f17013 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5477 m15575(C15587 c15587) {
        return m15576(c15587, new C0537(), false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5477 m15577(C15587 c15587) {
        return m15576(c15587, new C0537(), true);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x008e A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5477 m15576(C15587 c15587, BooleanSupplier booleanSupplier, boolean z) throws Throwable {
        C17471 c17471M34938;
        C11003.requireNonNull(c15587);
        if (booleanSupplier.getAsBoolean()) {
            C1785 c1785 = new C1785(c15587.mo23127(), c15587.mo23117());
            if (!z && c1785.m5940() > 2147483647L) {
                throw new IOException("Only files smaller than 2 GB can be opened");
            }
            FileChannel fileChannel = null;
            try {
                c17471M34938 = C14648.m34938();
                try {
                    FileChannel fileChannelMo27922 = c15587.mo27922();
                    C11003.requireNonNull(fileChannelMo27922);
                    try {
                        C1785 c1786 = new C1785(c15587.mo23127(), c15587.mo23117());
                        if (!c1785.equals(c1786) || !booleanSupplier.getAsBoolean()) {
                            throw new C5519();
                        }
                        return new C5477(c15587, c1786, fileChannelMo27922, c17471M34938, booleanSupplier);
                    } catch (IOException | Error | RuntimeException e) {
                        e = e;
                        fileChannel = fileChannelMo27922;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                                if (c17471M34938 != null) {
                                }
                            } catch (Throwable th) {
                                if (th != e) {
                                    try {
                                        e.addSuppressed(th);
                                    } finally {
                                        if (c17471M34938 != null) {
                                            c17471M34938.close();
                                        }
                                    }
                                }
                                throw e;
                            }
                        } else if (c17471M34938 != null) {
                        }
                        throw e;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Error e3) {
                    e = e3;
                } catch (RuntimeException e4) {
                    e = e4;
                }
            } catch (IOException | Error | RuntimeException e5) {
                e = e5;
                c17471M34938 = null;
            }
        } else {
            throw new C5519();
        }
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f17010;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ֫ */
    public final void mo10084(int i, byte[] bArr, int i2, int i3) throws IOException {
        C9005.m23246(this.f17010, i, i3);
        C9005.m23245(bArr.length, i2, i3);
        if (this.f17008.get() <= 0) {
            throw new ClosedChannelException();
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, i3);
        long j = i;
        while (byteBufferWrap.hasRemaining()) {
            int i4 = this.f17014.read(byteBufferWrap, j);
            if (i4 < 0) {
                if (!mo10086()) {
                    throw new C5519();
                }
                throw new C5519(new EOFException("Unexpected end of source file"));
            }
            if (i4 == 0) {
                Thread.yield();
            } else {
                j += (long) i4;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1785 m15578() {
        return this.f17012;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo10086() {
        if (this.f17011) {
            return true;
        }
        return this.f17012.m5939(this.f17009) && this.f17013.getAsBoolean();
    }

    @Override // l.InterfaceC4339
    /* JADX INFO: renamed from: ۡ֫ */
    public final void mo13039() {
        this.f17011 = true;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ᩺ۧ */
    public final InterfaceC18883 mo10088() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f17008;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C17471 c17471 = this.f17015;
        AtomicInteger atomicInteger = this.f17008;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet == 0) {
            try {
                this.f17014.close();
            } finally {
                c17471.close();
            }
        } else {
            if (iDecrementAndGet >= 0) {
                return;
            }
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("NormalFileSource already closed");
        }
    }
}
