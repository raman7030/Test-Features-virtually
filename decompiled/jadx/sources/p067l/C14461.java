package p067l;

import android.os.AsyncTask;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.۫᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes3.dex */
public final class C14461 {

    /* JADX INFO: renamed from: ֫ */
    public static final Executor f41305 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ֫ */
    public static Executor m33083() {
        return f41305;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8167 m33084(final C24260 c24260, final C10179 c10179, final boolean z, C19644 c19644, final boolean z2, final boolean z3, final boolean z4, Executor executor) throws Throwable {
        C12826.requireNonNull(c10179, "target");
        C12826.requireNonNull(executor, "executor");
        if (z && !z2) {
            throw new IllegalArgumentException("Direct source does not need a lightweight checkpoint");
        }
        if (z3 && (z || z2 || c19644.m44655() || c19644.length() != Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid partial hex checkpoint");
        }
        final C8167 c8167M53587 = c24260.m53587();
        try {
            try {
                if (z2) {
                    C10771 c10771M44659 = c19644.m44659();
                    try {
                        c8167M53587.m18945(c10771M44659);
                    } catch (IOException | Error | RuntimeException e) {
                        try {
                            c10771M44659.close();
                            throw e;
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                            throw e;
                        }
                    }
                } else {
                    c8167M53587.m18943(c19644.m44648().m49978());
                }
                executor.execute(new Runnable() { // from class: l.۠᩺ܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14461.m33092(c24260, c10179, z, z2, z3, c8167M53587, z4);
                    }
                });
                return c8167M53587;
            } catch (IOException e3) {
                e = e3;
                c8167M53587.m18944(e);
                throw e;
            }
        } catch (Error e4) {
            e = e4;
            c8167M53587.m18944(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            c8167M53587.m18944(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33089(C24260 c24260, C10179 c10179, long j) throws IOException {
        C12826.requireNonNull(c24260);
        C12826.requireNonNull(c10179);
        C8167 c8167M53587 = c24260.m53587();
        try {
            c8167M53587.m18943(j);
            m33092(c24260, c10179, false, false, false, c8167M53587, false);
            if (c8167M53587.m18942(C17917.m40721(null)) != EnumC12191.COMMITTED) {
                throw c8167M53587.m18941();
            }
        } catch (IOException | Error | RuntimeException e) {
            c8167M53587.m18944(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33092(C24260 c24260, C10179 c10179, boolean z, boolean z2, boolean z3, C8167 c8167, boolean z4) {
        C4065 c4065;
        try {
            C4065 c4065M23742 = c10179.m23742();
            if (z) {
                c4065 = c4065M23742;
            } else {
                C17182 c17182M53594 = c24260.m53594();
                if (c17182M53594.mo25093() && !c17182M53594.m38691()) {
                    C4065 c4066 = new C4065(c17182M53594.mo25101(), c17182M53594.mo25091());
                    if (c4066.m8135() > 2147483647L) {
                        throw new IOException("Hex checkpoint base is too large");
                    }
                    c4065 = c4066;
                } else {
                    throw new IOException("Hex checkpoint base is unavailable");
                }
            }
            C7085 c7085 = new C7085(c8167.m18951(), c8167);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(c7085);
                try {
                    if (z2) {
                        C10771 c10771M18948 = c8167.m18948();
                        try {
                            m33087(c7085, dataOutputStream, c10179, z, c4065M23742, c4065, true, z3, c10771M18948);
                            c10771M18948.close();
                        } catch (Throwable th) {
                            try {
                                c10771M18948.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        m33087(c7085, dataOutputStream, c10179, z, c4065M23742, c4065, false, z3, null);
                    }
                    dataOutputStream.close();
                    c7085.close();
                    c8167.m18946(z4);
                } catch (Throwable th3) {
                    try {
                        dataOutputStream.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c7085.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            c8167.m18944(th7);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33087(C7085 c7085, DataOutputStream dataOutputStream, C10179 c10179, boolean z, C4065 c4065, C4065 c4066, boolean z2, boolean z3, C10771 c10771) throws IOException {
        dataOutputStream.writeInt(1297369176);
        dataOutputStream.writeInt(7);
        String strM23737 = c10179.m23737();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = strM23737.getBytes(charset);
        if (bytes.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        byte[] bytes2 = c10179.m23740().getBytes(charset);
        if (bytes2.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes2.length);
        dataOutputStream.write(bytes2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeLong(c4065.m8135());
        dataOutputStream.writeLong(c4065.m8133());
        dataOutputStream.writeLong(c4066.m8135());
        dataOutputStream.writeLong(c4066.m8133());
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.writeBoolean(z3);
        if (z2) {
            c10771.getClass();
            c10771.m24814(dataOutputStream);
        }
        dataOutputStream.writeInt(1481135181);
        dataOutputStream.flush();
        long jM16303 = c7085.m16303();
        c7085.m16304();
        dataOutputStream.writeLong(jM16303);
        dataOutputStream.flush();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01d2 */
    /* JADX WARN: Code duplicated, block: B:141:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:159:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C15131 m33085(C24260 c24260, AbstractC17043 abstractC17043, C17813 c17813) throws Throwable {
        C7574 c7574M17486;
        Throwable th;
        C19644 c19644;
        boolean z;
        Throwable th2;
        C19644 c19645;
        Throwable th3;
        C7574 c7574;
        boolean z2;
        C10179 c10179M23736;
        C12826.requireNonNull(abstractC17043, "target");
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(c17813);
        m33091(interfaceC18588M40721);
        try {
            C21838 c21838 = new C21838(c24260.m53595());
            try {
                DataInputStream dataInputStream = new DataInputStream(c21838);
                try {
                    C23849 c23849 = new C23849(dataInputStream, interfaceC18588M40721);
                    m33086("Invalid hex checkpoint magic", c23849.readInt() == 1297369176);
                    int i = c23849.readInt();
                    m33086("Unsupported hex checkpoint version", i == 6 || i == 7);
                    m33086("Hex checkpoint target mismatch", abstractC17043.mo25505().equals(m33082(c23849)));
                    String strM33082 = m33082(c23849);
                    boolean z3 = c23849.readBoolean();
                    C4065 c4065 = new C4065(c23849.readLong(), c23849.readLong());
                    C4065 c4066 = new C4065(c23849.readLong(), c23849.readLong());
                    boolean z4 = c23849.readBoolean();
                    if (i >= 7) {
                        try {
                            if (c23849.readBoolean()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c7574 = null;
                            c19645 = null;
                            c7574M17486 = c7574;
                            th3 = th;
                            c19644 = c19645;
                            z = false;
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th5) {
                                th3.addSuppressed(th5);
                                throw th3;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    m33086("Invalid lightweight direct checkpoint", !z3 || z4);
                    m33086("Hex checkpoint target is too large", (i >= 7 && !z3) || c4065.m8135() <= 2147483647L);
                    m33086("Hex checkpoint base is too large", c4066.m8135() <= 2147483647L);
                    m33086("Invalid partial hex checkpoint", (z2 && (z3 || z4 || c4066.m8135() != 2147483647L)) ? false : true);
                    if (z3) {
                        c10179M23736 = C10179.m23734(abstractC17043, strM33082, c4065);
                    } else {
                        c10179M23736 = C10179.m23736(abstractC17043, strM33082, c4065);
                    }
                    if (z3) {
                        AbstractC17043 abstractC17043M23738 = c10179M23736.m23738();
                        m33086("Hex checkpoint source type mismatch", abstractC17043M23738.mo38688());
                        c7574M17486 = C7574.m17486(abstractC17043M23738.mo38689());
                        try {
                            m33086("Hex checkpoint revision mismatch", c4065.equals(c7574M17486.m17489()));
                            m33086("Hex checkpoint base mismatch", c4066.equals(c7574M17486.m17489()));
                        } catch (Throwable th6) {
                            th = th6;
                            c7574 = c7574M17486;
                            c19645 = null;
                            c7574M17486 = c7574;
                            th3 = th;
                            c19644 = c19645;
                            z = false;
                            dataInputStream.close();
                            throw th3;
                        }
                    } else {
                        C17182 c17182M53594 = c24260.m53594();
                        m33086("Hex checkpoint base is unavailable", c17182M53594.mo25093() && !c17182M53594.m38691());
                        c7574M17486 = C7574.m17486(c17182M53594);
                        try {
                            m33086("Hex checkpoint base mismatch", c4066.equals(c7574M17486.m17489()));
                        } catch (Throwable th7) {
                            th = th7;
                            c19645 = null;
                            th3 = th;
                            c19644 = c19645;
                            z = false;
                            dataInputStream.close();
                            throw th3;
                        }
                    }
                    if (!z4) {
                        try {
                            c19644 = new C19644(c7574M17486, null);
                        } catch (Throwable th8) {
                            th = th8;
                            c19645 = null;
                            th3 = th;
                            c19644 = c19645;
                            z = false;
                            dataInputStream.close();
                            throw th3;
                        }
                    } else {
                        c19644 = C19644.m44577(c7574M17486, c23849, new C23179(c24260, c21838));
                    }
                    try {
                        m33086("Invalid hex checkpoint footer", c23849.readInt() == 1481135181);
                        long jM49259 = c21838.m49259();
                        c21838.m49260();
                        m33086("Hex checkpoint CRC mismatch", jM49259 == c23849.readLong());
                        m33091(interfaceC18588M40721);
                        m33086("Unexpected trailing hex checkpoint data", dataInputStream.read() == -1);
                        m33091(interfaceC18588M40721);
                        c19644.m44657();
                        m33091(interfaceC18588M40721);
                        C15131 c15131 = new C15131(c19644, c10179M23736, z3, z2);
                        try {
                            dataInputStream.close();
                            try {
                                c21838.close();
                                return c15131;
                            } catch (IOException | Error | RuntimeException e) {
                                th = e;
                                z = true;
                                if (c19644 == null) {
                                    try {
                                        c19644.close();
                                        throw th;
                                    } catch (IOException e2) {
                                        th.addSuppressed(e2);
                                        throw th;
                                    }
                                }
                                if (c7574M17486 == null && !z) {
                                    try {
                                        c7574M17486.close();
                                        throw th;
                                    } catch (IOException e3) {
                                        th.addSuppressed(e3);
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th2 = th9;
                            z = true;
                            try {
                                c21838.close();
                                throw th2;
                            } catch (Throwable th10) {
                                try {
                                    th2.addSuppressed(th10);
                                    throw th2;
                                } catch (IOException | Error | RuntimeException e4) {
                                    th = e4;
                                    if (c19644 == null) {
                                        c19644.close();
                                        throw th;
                                    }
                                    if (c7574M17486 == null) {
                                        throw th;
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th11) {
                        th3 = th11;
                        z = true;
                        dataInputStream.close();
                        throw th3;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    c19645 = null;
                    c7574M17486 = null;
                }
            } catch (Throwable th13) {
                c7574M17486 = null;
                th2 = th13;
                c19644 = null;
                z = false;
            }
        } catch (IOException | Error | RuntimeException e5) {
            c7574M17486 = null;
            th = e5;
            c19644 = null;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33082(DataInput dataInput) throws IOException {
        C23849 c23849 = (C23849) dataInput;
        int i = c23849.readInt();
        m33086("Invalid hex checkpoint path length", i >= 0 && i <= 1048576);
        byte[] bArr = new byte[i];
        c23849.readFully(bArr, 0, i);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33086(String str, boolean z) throws IOException {
        if (!z) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33091(InterfaceC18588 interfaceC18588) throws C25008 {
        if (interfaceC18588.mo3924()) {
            throw new C25008();
        }
    }
}
