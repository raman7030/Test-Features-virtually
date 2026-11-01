package p067l;

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
public final class C7574 implements InterfaceC6492, InterfaceC4892 {

    /* JADX INFO: renamed from: ۗ */
    public final AtomicInteger f19849 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۙ */
    public final C17182 f19850;

    /* JADX INFO: renamed from: ۤ */
    public final int f19851;

    /* JADX INFO: renamed from: ۫ */
    public volatile boolean f19852;

    /* JADX INFO: renamed from: ۬ */
    public final C4065 f19853;

    /* JADX INFO: renamed from: ᩶ */
    public final BooleanSupplier f19854;

    /* JADX INFO: renamed from: ᩸ */
    public final FileChannel f19855;

    /* JADX INFO: renamed from: ᩹ */
    public final C18973 f19856;

    public C7574(C17182 c17182, C4065 c4065, FileChannel fileChannel, C18973 c18973, BooleanSupplier booleanSupplier) {
        this.f19850 = c17182;
        this.f19853 = c4065;
        this.f19851 = (int) Math.min(c4065.m8135(), 2147483647L);
        this.f19855 = fileChannel;
        this.f19856 = c18973;
        this.f19854 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7574 m17486(C17182 c17182) {
        return m17487(c17182, new C2879(), false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C7574 m17488(C17182 c17182) {
        return m17487(c17182, new C2879(), true);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x008e A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ֫ */
    public static C7574 m17487(C17182 c17182, BooleanSupplier booleanSupplier, boolean z) throws Throwable {
        C18973 c18973M37085;
        C12826.requireNonNull(c17182);
        if (booleanSupplier.getAsBoolean()) {
            C4065 c4065 = new C4065(c17182.mo25101(), c17182.mo25091());
            if (!z && c4065.m8135() > 2147483647L) {
                throw new IOException("Only files smaller than 2 GB can be opened");
            }
            FileChannel fileChannel = null;
            try {
                c18973M37085 = C16290.m37085();
                try {
                    FileChannel fileChannelMo29983 = c17182.mo29983();
                    C12826.requireNonNull(fileChannelMo29983);
                    try {
                        C4065 c4066 = new C4065(c17182.mo25101(), c17182.mo25091());
                        if (!c4065.equals(c4066) || !booleanSupplier.getAsBoolean()) {
                            throw new C7614();
                        }
                        return new C7574(c17182, c4066, fileChannelMo29983, c18973M37085, booleanSupplier);
                    } catch (IOException | Error | RuntimeException e) {
                        e = e;
                        fileChannel = fileChannelMo29983;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                                if (c18973M37085 != null) {
                                }
                            } catch (Throwable th) {
                                if (th != e) {
                                    try {
                                        e.addSuppressed(th);
                                    } finally {
                                        if (c18973M37085 != null) {
                                            c18973M37085.close();
                                        }
                                    }
                                }
                                throw e;
                            }
                        } else if (c18973M37085 != null) {
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
                c18973M37085 = null;
            }
        } else {
            throw new C7614();
        }
    }

    @Override // p067l.InterfaceC20315
    public final int length() {
        return this.f19851;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ֫ */
    public final void mo12117(int i, byte[] bArr, int i2, int i3) throws IOException {
        C10927.m25190(this.f19851, i, i3);
        C10927.m25189(bArr.length, i2, i3);
        if (this.f19849.get() <= 0) {
            throw new ClosedChannelException();
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, i3);
        long j = i;
        while (byteBufferWrap.hasRemaining()) {
            int i4 = this.f19855.read(byteBufferWrap, j);
            if (i4 < 0) {
                if (!mo12119()) {
                    throw new C7614();
                }
                throw new C7614(new EOFException("Unexpected end of source file"));
            }
            if (i4 == 0) {
                Thread.yield();
            } else {
                j += (long) i4;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4065 m17489() {
        return this.f19853;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo12119() {
        if (this.f19852) {
            return true;
        }
        return this.f19853.m8134(this.f19850) && this.f19854.getAsBoolean();
    }

    @Override // p067l.InterfaceC6492
    /* JADX INFO: renamed from: ۡ֫ */
    public final void mo14903() {
        this.f19852 = true;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ᩺ۧ */
    public final InterfaceC20315 mo12121() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f19849;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C18973 c18973 = this.f19856;
        AtomicInteger atomicInteger = this.f19849;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet == 0) {
            try {
                this.f19855.close();
            } finally {
                c18973.close();
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
