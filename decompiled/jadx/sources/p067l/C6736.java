package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۙۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6736 implements Closeable {

    /* JADX INFO: renamed from: ۙ */
    public static final Logger f17486 = Logger.getLogger(C19477.class.getName());

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC8233 f17487;

    /* JADX INFO: renamed from: ᩸ */
    public final C21489 f17488;

    /* JADX INFO: renamed from: ᩹ */
    public final C4054 f17489;

    public C6736(InterfaceC8233 interfaceC8233) {
        this.f17487 = interfaceC8233;
        C21489 c21489 = new C21489(interfaceC8233);
        this.f17488 = c21489;
        this.f17489 = new C4054(c21489);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15397(boolean z, C22830 c22830) throws IOException {
        short s;
        try {
            this.f17487.mo14218(9L);
            int iM15393 = m15393(this.f17487);
            if (iM15393 < 0 || iM15393 > 16384) {
                C19477.m44290("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM15393));
                throw null;
            }
            byte b = (byte) (this.f17487.readByte() & 255);
            if (z && b != 4) {
                C19477.m44290("Expected a SETTINGS frame but was %s", Byte.valueOf(b));
                throw null;
            }
            byte b2 = (byte) (this.f17487.readByte() & 255);
            int i = this.f17487.readInt();
            int i2 = i & Integer.MAX_VALUE;
            Logger logger = f17486;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C19477.m44288(true, i2, iM15393, b, b2));
            }
            switch (b) {
                case 0:
                    InterfaceC8233 interfaceC8233 = this.f17487;
                    if (i2 == 0) {
                        C19477.m44290("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z2 = (b2 & 1) != 0;
                    if ((b2 & UTF8.S_CS3) != 0) {
                        C19477.m44290("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    s = (b2 & 8) != 0 ? (short) (interfaceC8233.readByte() & 255) : (short) 0;
                    int iM15392 = m15392(iM15393, b2, s);
                    C23500 c23500 = c22830.f71910;
                    if (i2 != 0 && (i & 1) == 0) {
                        c23500.m52255(i2, interfaceC8233, iM15392, z2);
                    } else {
                        C12101 c12101M52251 = c23500.m52251(i2);
                        if (c12101M52251 == null) {
                            c23500.m52263(i2, EnumC15197.PROTOCOL_ERROR);
                            long j = iM15392;
                            c23500.m52267(j);
                            interfaceC8233.skip(j);
                        } else {
                            c12101M52251.m27958(interfaceC8233, iM15392);
                            if (z2) {
                                c12101M52251.m27968();
                            }
                        }
                    }
                    interfaceC8233.skip(s);
                    return true;
                case 1:
                    m15394(c22830, iM15393, b2, i2);
                    return true;
                case 2:
                    if (iM15393 != 5) {
                        C19477.m44290("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM15393));
                        throw null;
                    }
                    if (i2 == 0) {
                        C19477.m44290("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    InterfaceC8233 interfaceC8234 = this.f17487;
                    interfaceC8234.readInt();
                    interfaceC8234.readByte();
                    return true;
                case 3:
                    if (iM15393 != 4) {
                        C19477.m44290("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iM15393));
                        throw null;
                    }
                    if (i2 == 0) {
                        C19477.m44290("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i3 = this.f17487.readInt();
                    EnumC15197 enumC15197M34631 = EnumC15197.m34631(i3);
                    if (enumC15197M34631 == null) {
                        C19477.m44290("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
                        throw null;
                    }
                    C23500 c23501 = c22830.f71910;
                    if (i2 != 0 && (i & 1) == 0) {
                        c23501.m52256(i2, enumC15197M34631);
                        return true;
                    }
                    C12101 c12101M52262 = c23501.m52262(i2);
                    if (c12101M52262 != null) {
                        c12101M52262.m27965(enumC15197M34631);
                    }
                    return true;
                case 4:
                    InterfaceC8233 interfaceC8235 = this.f17487;
                    if (i2 != 0) {
                        C19477.m44290("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b2 & 1) == 0) {
                        if (iM15393 % 6 != 0) {
                            C19477.m44290("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iM15393));
                            throw null;
                        }
                        C4210 c4210 = new C4210();
                        for (int i4 = 0; i4 < iM15393; i4 += 6) {
                            int i5 = interfaceC8235.readShort() & HPKE.aead_EXPORT_ONLY;
                            int i6 = interfaceC8235.readInt();
                            if (i5 == 2) {
                                if (i6 != 0 && i6 != 1) {
                                    C19477.m44290("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                            } else if (i5 == 3) {
                                i5 = 4;
                            } else if (i5 != 4) {
                                if (i5 == 5 && (i6 < 16384 || i6 > 16777215)) {
                                    C19477.m44290("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i6));
                                    throw null;
                                }
                            } else {
                                if (i6 < 0) {
                                    C19477.m44290("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                                i5 = 7;
                            }
                            c4210.m8548(i5, i6);
                        }
                        C23500 c23502 = c22830.f71910;
                        try {
                            c23502.f74871.execute(new C10089(c22830, new Object[]{c23502.f74873}, c4210));
                            break;
                        } catch (RejectedExecutionException unused) {
                        }
                    } else if (iM15393 != 0) {
                        C19477.m44290("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    return true;
                case 5:
                    InterfaceC8233 interfaceC8236 = this.f17487;
                    if (i2 == 0) {
                        C19477.m44290("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    s = (b2 & 8) != 0 ? (short) (interfaceC8236.readByte() & 255) : (short) 0;
                    int i7 = interfaceC8236.readInt() & Integer.MAX_VALUE;
                    int iM15394 = m15392(iM15393 - 4, b2, s);
                    C21489 c21489 = this.f17488;
                    c21489.f67798 = iM15394;
                    c21489.f67796 = iM15394;
                    c21489.f67794 = s;
                    c21489.f67797 = b2;
                    c21489.f67795 = i2;
                    C4054 c4054 = this.f17489;
                    c4054.m8120();
                    c22830.f71910.m52258(c4054.m8118(), i7);
                    return true;
                case 6:
                    m15396(c22830, iM15393, b2, i2);
                    return true;
                case 7:
                    m15395(c22830, iM15393, i2);
                    return true;
                case 8:
                    if (iM15393 != 4) {
                        C19477.m44290("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM15393));
                        throw null;
                    }
                    long j2 = ((long) this.f17487.readInt()) & 2147483647L;
                    if (j2 == 0) {
                        C19477.m44290("windowSizeIncrement was 0", Long.valueOf(j2));
                        throw null;
                    }
                    if (i2 == 0) {
                        synchronized (c22830.f71910) {
                            C23500 c23503 = c22830.f71910;
                            c23503.f74886 += j2;
                            c23503.notifyAll();
                            break;
                        }
                        return true;
                    }
                    C12101 c12101M52252 = c22830.f71910.m52251(i2);
                    if (c12101M52252 != null) {
                        synchronized (c12101M52252) {
                            c12101M52252.f33827 += j2;
                            if (j2 > 0) {
                                c12101M52252.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f17487.skip(iM15393);
                    return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15394(C22830 c22830, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            C19477.m44290("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.f17487.readByte() & 255) : (short) 0;
        if ((b & UTF8.S_CS3) != 0) {
            InterfaceC8233 interfaceC8233 = this.f17487;
            interfaceC8233.readInt();
            interfaceC8233.readByte();
            i -= 5;
        }
        int iM15392 = m15392(i, b, s);
        C21489 c21489 = this.f17488;
        c21489.f67798 = iM15392;
        c21489.f67796 = iM15392;
        c21489.f67794 = s;
        c21489.f67797 = b;
        c21489.f67795 = i2;
        C4054 c4054 = this.f17489;
        c4054.m8120();
        ArrayList arrayListM8118 = c4054.m8118();
        C23500 c23500 = c22830.f71910;
        if (i2 != 0 && (i2 & 1) == 0) {
            c23500.m52259(arrayListM8118, i2, z);
            return;
        }
        synchronized (c23500) {
            C12101 c12101M52251 = c22830.f71910.m52251(i2);
            if (c12101M52251 == null) {
                if (c22830.f71910.f74879) {
                    return;
                }
                C23500 c23501 = c22830.f71910;
                if (i2 <= c23501.f74887) {
                    return;
                }
                if (i2 % 2 == c23501.f74870 % 2) {
                    return;
                }
                C12101 c12101 = new C12101(i2, c22830.f71910, false, z, C21407.m48494(arrayListM8118));
                C23500 c23502 = c22830.f71910;
                c23502.f74887 = i2;
                c23502.f74869.put(Integer.valueOf(i2), c12101);
                C23500.f74864.execute(new C3383(c22830, new Object[]{c22830.f71910.f74873, Integer.valueOf(i2)}, c12101));
                return;
            }
            c12101M52251.m27957(arrayListM8118);
            if (z) {
                c12101M52251.m27968();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m15396(C22830 c22830, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            C19477.m44290("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C19477.m44290("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int i3 = this.f17487.readInt();
        int i4 = this.f17487.readInt();
        if ((b & 1) == 0) {
            try {
                c22830.f71910.f74871.execute(new C7407(c22830.f71910, i3, i4));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (c22830.f71910) {
            try {
                if (i3 == 1) {
                    C23500.m52245(c22830.f71910);
                } else if (i3 == 2) {
                    C23500.m52248(c22830.f71910);
                } else if (i3 == 3) {
                    C23500.m52241(c22830.f71910);
                    c22830.f71910.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15395(C22830 c22830, int i, int i2) throws IOException {
        C12101[] c12101Arr;
        if (i < 8) {
            C19477.m44290("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C19477.m44290("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int i3 = this.f17487.readInt();
        int i4 = this.f17487.readInt();
        int i5 = i - 8;
        if (EnumC15197.m34631(i4) == null) {
            C19477.m44290("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
            throw null;
        }
        C13598 c13598Mo14210 = C13598.f38250;
        if (i5 > 0) {
            c13598Mo14210 = this.f17487.mo14210(i5);
        }
        c13598Mo14210.mo4707();
        synchronized (c22830.f71910) {
            c12101Arr = (C12101[]) c22830.f71910.f74869.values().toArray(new C12101[c22830.f71910.f74869.size()]);
            c22830.f71910.f74879 = true;
        }
        for (C12101 c12101 : c12101Arr) {
            if (c12101.f33832 > i3 && c12101.m27966()) {
                c12101.m27965(EnumC15197.REFUSED_STREAM);
                c22830.f71910.m52262(c12101.f33832);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17487.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m15393(InterfaceC8233 interfaceC8233) {
        return (interfaceC8233.readByte() & 255) | ((interfaceC8233.readByte() & 255) << 16) | ((interfaceC8233.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m15392(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C19477.m44290("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
