package l;

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
public final class C4596 implements Closeable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Logger f14658 = Logger.getLogger(C18002.class.getName());

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f14659;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20119 f14660;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1774 f14661;

    public C4596(InterfaceC6171 interfaceC6171) {
        this.f14659 = interfaceC6171;
        C20119 c20119 = new C20119(interfaceC6171);
        this.f14660 = c20119;
        this.f14661 = new C1774(c20119);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13508(boolean z, C21530 c21530) throws IOException {
        short s;
        try {
            this.f14659.mo12313(9L);
            int iM13504 = m13504(this.f14659);
            if (iM13504 < 0 || iM13504 > 16384) {
                C18002.m42040("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM13504));
                throw null;
            }
            byte b = (byte) (this.f14659.readByte() & 255);
            if (z && b != 4) {
                C18002.m42040("Expected a SETTINGS frame but was %s", Byte.valueOf(b));
                throw null;
            }
            byte b2 = (byte) (this.f14659.readByte() & 255);
            int i = this.f14659.readInt();
            int i2 = i & Integer.MAX_VALUE;
            Logger logger = f14658;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C18002.m42038(true, i2, iM13504, b, b2));
            }
            switch (b) {
                case 0:
                    InterfaceC6171 interfaceC6171 = this.f14659;
                    if (i2 == 0) {
                        C18002.m42040("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z2 = (b2 & 1) != 0;
                    if ((b2 & UTF8.S_CS3) != 0) {
                        C18002.m42040("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    s = (b2 & 8) != 0 ? (short) (interfaceC6171.readByte() & 255) : (short) 0;
                    int iM13503 = m13503(iM13504, b2, s);
                    C22235 c22235 = c21530.f69210;
                    if (i2 != 0 && (i & 1) == 0) {
                        c22235.m49927(i2, interfaceC6171, iM13503, z2);
                    } else {
                        C10241 c10241M49923 = c22235.m49923(i2);
                        if (c10241M49923 == null) {
                            c22235.m49935(i2, EnumC13499.PROTOCOL_ERROR);
                            long j = iM13503;
                            c22235.m49939(j);
                            interfaceC6171.skip(j);
                        } else {
                            c10241M49923.m25936(interfaceC6171, iM13503);
                            if (z2) {
                                c10241M49923.m25946();
                            }
                        }
                    }
                    interfaceC6171.skip(s);
                    return true;
                case 1:
                    m13505(c21530, iM13504, b2, i2);
                    return true;
                case 2:
                    if (iM13504 != 5) {
                        C18002.m42040("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM13504));
                        throw null;
                    }
                    if (i2 == 0) {
                        C18002.m42040("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    InterfaceC6171 interfaceC6172 = this.f14659;
                    interfaceC6172.readInt();
                    interfaceC6172.readByte();
                    return true;
                case 3:
                    if (iM13504 != 4) {
                        C18002.m42040("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iM13504));
                        throw null;
                    }
                    if (i2 == 0) {
                        C18002.m42040("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i3 = this.f14659.readInt();
                    EnumC13499 enumC13499M32529 = EnumC13499.m32529(i3);
                    if (enumC13499M32529 == null) {
                        C18002.m42040("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
                        throw null;
                    }
                    C22235 c22236 = c21530.f69210;
                    if (i2 != 0 && (i & 1) == 0) {
                        c22236.m49928(i2, enumC13499M32529);
                        return true;
                    }
                    C10241 c10241M49934 = c22236.m49934(i2);
                    if (c10241M49934 != null) {
                        c10241M49934.m25943(enumC13499M32529);
                    }
                    return true;
                case 4:
                    InterfaceC6171 interfaceC6173 = this.f14659;
                    if (i2 != 0) {
                        C18002.m42040("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b2 & 1) == 0) {
                        if (iM13504 % 6 != 0) {
                            C18002.m42040("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iM13504));
                            throw null;
                        }
                        C1938 c1938 = new C1938();
                        for (int i4 = 0; i4 < iM13504; i4 += 6) {
                            int i5 = interfaceC6173.readShort() & HPKE.aead_EXPORT_ONLY;
                            int i6 = interfaceC6173.readInt();
                            if (i5 == 2) {
                                if (i6 != 0 && i6 != 1) {
                                    C18002.m42040("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                            } else if (i5 == 3) {
                                i5 = 4;
                            } else if (i5 != 4) {
                                if (i5 == 5 && (i6 < 16384 || i6 > 16777215)) {
                                    C18002.m42040("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i6));
                                    throw null;
                                }
                            } else {
                                if (i6 < 0) {
                                    C18002.m42040("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                                i5 = 7;
                            }
                            c1938.m6391(i5, i6);
                        }
                        C22235 c22237 = c21530.f69210;
                        try {
                            c22237.f72146.execute(new C8124(c21530, new Object[]{c22237.f72148}, c1938));
                            break;
                        } catch (RejectedExecutionException unused) {
                        }
                    } else if (iM13504 != 0) {
                        C18002.m42040("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    return true;
                case 5:
                    InterfaceC6171 interfaceC6174 = this.f14659;
                    if (i2 == 0) {
                        C18002.m42040("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    s = (b2 & 8) != 0 ? (short) (interfaceC6174.readByte() & 255) : (short) 0;
                    int i7 = interfaceC6174.readInt() & Integer.MAX_VALUE;
                    int iM13505 = m13503(iM13504 - 4, b2, s);
                    C20119 c20119 = this.f14660;
                    c20119.f65159 = iM13505;
                    c20119.f65157 = iM13505;
                    c20119.f65155 = s;
                    c20119.f65158 = b2;
                    c20119.f65156 = i2;
                    C1774 c1774 = this.f14661;
                    c1774.m5925();
                    c21530.f69210.m49930(c1774.m5923(), i7);
                    return true;
                case 6:
                    m13507(c21530, iM13504, b2, i2);
                    return true;
                case 7:
                    m13506(c21530, iM13504, i2);
                    return true;
                case 8:
                    if (iM13504 != 4) {
                        C18002.m42040("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM13504));
                        throw null;
                    }
                    long j2 = ((long) this.f14659.readInt()) & 2147483647L;
                    if (j2 == 0) {
                        C18002.m42040("windowSizeIncrement was 0", Long.valueOf(j2));
                        throw null;
                    }
                    if (i2 == 0) {
                        synchronized (c21530.f69210) {
                            C22235 c22238 = c21530.f69210;
                            c22238.f72161 += j2;
                            c22238.notifyAll();
                            break;
                        }
                        return true;
                    }
                    C10241 c10241M49924 = c21530.f69210.m49923(i2);
                    if (c10241M49924 != null) {
                        synchronized (c10241M49924) {
                            c10241M49924.f30866 += j2;
                            if (j2 > 0) {
                                c10241M49924.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f14659.skip(iM13504);
                    return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13505(C21530 c21530, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            C18002.m42040("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.f14659.readByte() & 255) : (short) 0;
        if ((b & UTF8.S_CS3) != 0) {
            InterfaceC6171 interfaceC6171 = this.f14659;
            interfaceC6171.readInt();
            interfaceC6171.readByte();
            i -= 5;
        }
        int iM13503 = m13503(i, b, s);
        C20119 c20119 = this.f14660;
        c20119.f65159 = iM13503;
        c20119.f65157 = iM13503;
        c20119.f65155 = s;
        c20119.f65158 = b;
        c20119.f65156 = i2;
        C1774 c1774 = this.f14661;
        c1774.m5925();
        ArrayList arrayListM5923 = c1774.m5923();
        C22235 c22235 = c21530.f69210;
        if (i2 != 0 && (i2 & 1) == 0) {
            c22235.m49931(arrayListM5923, i2, z);
            return;
        }
        synchronized (c22235) {
            C10241 c10241M49923 = c21530.f69210.m49923(i2);
            if (c10241M49923 == null) {
                if (c21530.f69210.f72154) {
                    return;
                }
                C22235 c22236 = c21530.f69210;
                if (i2 <= c22236.f72162) {
                    return;
                }
                if (i2 % 2 == c22236.f72145 % 2) {
                    return;
                }
                C10241 c10241 = new C10241(i2, c21530.f69210, false, z, C20032.m46178(arrayListM5923));
                C22235 c22237 = c21530.f69210;
                c22237.f72162 = i2;
                c22237.f72144.put(Integer.valueOf(i2), c10241);
                C22235.f72139.execute(new C1068(c21530, new Object[]{c21530.f69210.f72148, Integer.valueOf(i2)}, c10241));
                return;
            }
            c10241M49923.m25935(arrayListM5923);
            if (z) {
                c10241M49923.m25946();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13507(C21530 c21530, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            C18002.m42040("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C18002.m42040("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int i3 = this.f14659.readInt();
        int i4 = this.f14659.readInt();
        if ((b & 1) == 0) {
            try {
                c21530.f69210.f72146.execute(new C5302(c21530.f69210, i3, i4));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (c21530.f69210) {
            try {
                if (i3 == 1) {
                    C22235.m49917(c21530.f69210);
                } else if (i3 == 2) {
                    C22235.m49920(c21530.f69210);
                } else if (i3 == 3) {
                    C22235.m49913(c21530.f69210);
                    c21530.f69210.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13506(C21530 c21530, int i, int i2) throws IOException {
        C10241[] c10241Arr;
        if (i < 8) {
            C18002.m42040("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C18002.m42040("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int i3 = this.f14659.readInt();
        int i4 = this.f14659.readInt();
        int i5 = i - 8;
        if (EnumC13499.m32529(i4) == null) {
            C18002.m42040("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
            throw null;
        }
        C11816 c11816Mo12305 = C11816.f35248;
        if (i5 > 0) {
            c11816Mo12305 = this.f14659.mo12305(i5);
        }
        c11816Mo12305.mo2336();
        synchronized (c21530.f69210) {
            c10241Arr = (C10241[]) c21530.f69210.f72144.values().toArray(new C10241[c21530.f69210.f72144.size()]);
            c21530.f69210.f72154 = true;
        }
        for (C10241 c10241 : c10241Arr) {
            if (c10241.f30871 > i3 && c10241.m25944()) {
                c10241.m25943(EnumC13499.REFUSED_STREAM);
                c21530.f69210.m49934(c10241.f30871);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f14659.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13504(InterfaceC6171 interfaceC6171) {
        return (interfaceC6171.readByte() & 255) | ((interfaceC6171.readByte() & 255) << 16) | ((interfaceC6171.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13503(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C18002.m42040("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
