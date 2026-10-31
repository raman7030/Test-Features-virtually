package l;

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
public final class C12723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Executor f38276 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Executor m31003() {
        return f38276;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6101 m31004(final C23034 c23034, final C8218 c8218, final boolean z, C18177 c18177, final boolean z2, final boolean z3, final boolean z4, Executor executor) throws Throwable {
        C11003.requireNonNull(c8218, "target");
        C11003.requireNonNull(executor, "executor");
        if (z && !z2) {
            throw new IllegalArgumentException("Direct source does not need a lightweight checkpoint");
        }
        if (z3 && (z || z2 || c18177.m42394() || c18177.length() != Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid partial hex checkpoint");
        }
        final C6101 c6101M51194 = c23034.m51194();
        try {
            try {
                if (z2) {
                    C8841 c8841M42398 = c18177.m42398();
                    try {
                        c6101M51194.m17014(c8841M42398);
                    } catch (IOException | Error | RuntimeException e) {
                        try {
                            c8841M42398.close();
                            throw e;
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                            throw e;
                        }
                    }
                } else {
                    c6101M51194.m17012(c18177.m42387().m47650());
                }
                executor.execute(new Runnable() { // from class: l.۠᩺ܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12723.m31012(c23034, c8218, z, z2, z3, c6101M51194, z4);
                    }
                });
                return c6101M51194;
            } catch (IOException e3) {
                e = e3;
                c6101M51194.m17013(e);
                throw e;
            }
        } catch (Error e4) {
            e = e4;
            c6101M51194.m17013(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            c6101M51194.m17013(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31009(C23034 c23034, C8218 c8218, long j) throws IOException {
        C11003.requireNonNull(c23034);
        C11003.requireNonNull(c8218);
        C6101 c6101M51194 = c23034.m51194();
        try {
            c6101M51194.m17012(j);
            m31012(c23034, c8218, false, false, false, c6101M51194, false);
            if (c6101M51194.m17011(C16360.m38504(null)) != EnumC10335.COMMITTED) {
                throw c6101M51194.m17010();
            }
        } catch (IOException | Error | RuntimeException e) {
            c6101M51194.m17013(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31012(C23034 c23034, C8218 c8218, boolean z, boolean z2, boolean z3, C6101 c6101, boolean z4) {
        C1785 c1785;
        try {
            C1785 c1785M21773 = c8218.m21773();
            if (z) {
                c1785 = c1785M21773;
            } else {
                C15587 c15587M51201 = c23034.m51201();
                if (c15587M51201.mo23119() && !c15587M51201.m36533()) {
                    C1785 c1786 = new C1785(c15587M51201.mo23127(), c15587M51201.mo23117());
                    if (c1786.m5940() > 2147483647L) {
                        throw new IOException("Hex checkpoint base is too large");
                    }
                    c1785 = c1786;
                } else {
                    throw new IOException("Hex checkpoint base is unavailable");
                }
            }
            C4962 c4962 = new C4962(c6101.m17020(), c6101);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(c4962);
                try {
                    if (z2) {
                        C8841 c8841M17017 = c6101.m17017();
                        try {
                            m31007(c4962, dataOutputStream, c8218, z, c1785M21773, c1785, true, z3, c8841M17017);
                            c8841M17017.close();
                        } catch (Throwable th) {
                            try {
                                c8841M17017.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        m31007(c4962, dataOutputStream, c8218, z, c1785M21773, c1785, false, z3, null);
                    }
                    dataOutputStream.close();
                    c4962.close();
                    c6101.m17015(z4);
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
                    c4962.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            c6101.m17013(th7);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31007(C4962 c4962, DataOutputStream dataOutputStream, C8218 c8218, boolean z, C1785 c1785, C1785 c1786, boolean z2, boolean z3, C8841 c8841) throws IOException {
        dataOutputStream.writeInt(1297369176);
        dataOutputStream.writeInt(7);
        String strM21768 = c8218.m21768();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = strM21768.getBytes(charset);
        if (bytes.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        byte[] bytes2 = c8218.m21771().getBytes(charset);
        if (bytes2.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes2.length);
        dataOutputStream.write(bytes2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeLong(c1785.m5940());
        dataOutputStream.writeLong(c1785.m5938());
        dataOutputStream.writeLong(c1786.m5940());
        dataOutputStream.writeLong(c1786.m5938());
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.writeBoolean(z3);
        if (z2) {
            c8841.getClass();
            c8841.m22844(dataOutputStream);
        }
        dataOutputStream.writeInt(1481135181);
        dataOutputStream.flush();
        long jM14400 = c4962.m14400();
        c4962.m14401();
        dataOutputStream.writeLong(jM14400);
        dataOutputStream.flush();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01d2 */
    /* JADX WARN: Code duplicated, block: B:141:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:159:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13428 m31005(C23034 c23034, AbstractC15440 abstractC15440, C16250 c16250) throws Throwable {
        C5477 c5477M15575;
        Throwable th;
        C18177 c18177;
        boolean z;
        Throwable th2;
        C18177 c18178;
        Throwable th3;
        C5477 c5477;
        boolean z2;
        C8218 c8218M21767;
        C11003.requireNonNull(abstractC15440, "target");
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(c16250);
        m31011(interfaceC17066M38504);
        try {
            C20485 c20485 = new C20485(c23034.m51202());
            try {
                DataInputStream dataInputStream = new DataInputStream(c20485);
                try {
                    C22601 c22601 = new C22601(dataInputStream, interfaceC17066M38504);
                    m31006("Invalid hex checkpoint magic", c22601.readInt() == 1297369176);
                    int i = c22601.readInt();
                    m31006("Unsupported hex checkpoint version", i == 6 || i == 7);
                    m31006("Hex checkpoint target mismatch", abstractC15440.mo23554().equals(m31002(c22601)));
                    String strM31002 = m31002(c22601);
                    boolean z3 = c22601.readBoolean();
                    C1785 c1785 = new C1785(c22601.readLong(), c22601.readLong());
                    C1785 c1786 = new C1785(c22601.readLong(), c22601.readLong());
                    boolean z4 = c22601.readBoolean();
                    if (i >= 7) {
                        try {
                            if (c22601.readBoolean()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c5477 = null;
                            c18178 = null;
                            c5477M15575 = c5477;
                            th3 = th;
                            c18177 = c18178;
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
                    m31006("Invalid lightweight direct checkpoint", !z3 || z4);
                    m31006("Hex checkpoint target is too large", (i >= 7 && !z3) || c1785.m5940() <= 2147483647L);
                    m31006("Hex checkpoint base is too large", c1786.m5940() <= 2147483647L);
                    m31006("Invalid partial hex checkpoint", (z2 && (z3 || z4 || c1786.m5940() != 2147483647L)) ? false : true);
                    if (z3) {
                        c8218M21767 = C8218.m21765(abstractC15440, strM31002, c1785);
                    } else {
                        c8218M21767 = C8218.m21767(abstractC15440, strM31002, c1785);
                    }
                    if (z3) {
                        AbstractC15440 abstractC15440M21769 = c8218M21767.m21769();
                        m31006("Hex checkpoint source type mismatch", abstractC15440M21769.mo36530());
                        c5477M15575 = C5477.m15575(abstractC15440M21769.mo36531());
                        try {
                            m31006("Hex checkpoint revision mismatch", c1785.equals(c5477M15575.m15578()));
                            m31006("Hex checkpoint base mismatch", c1786.equals(c5477M15575.m15578()));
                        } catch (Throwable th6) {
                            th = th6;
                            c5477 = c5477M15575;
                            c18178 = null;
                            c5477M15575 = c5477;
                            th3 = th;
                            c18177 = c18178;
                            z = false;
                            dataInputStream.close();
                            throw th3;
                        }
                    } else {
                        C15587 c15587M51201 = c23034.m51201();
                        m31006("Hex checkpoint base is unavailable", c15587M51201.mo23119() && !c15587M51201.m36533());
                        c5477M15575 = C5477.m15575(c15587M51201);
                        try {
                            m31006("Hex checkpoint base mismatch", c1786.equals(c5477M15575.m15578()));
                        } catch (Throwable th7) {
                            th = th7;
                            c18178 = null;
                            th3 = th;
                            c18177 = c18178;
                            z = false;
                            dataInputStream.close();
                            throw th3;
                        }
                    }
                    if (!z4) {
                        try {
                            c18177 = new C18177(c5477M15575, null);
                        } catch (Throwable th8) {
                            th = th8;
                            c18178 = null;
                            th3 = th;
                            c18177 = c18178;
                            z = false;
                            dataInputStream.close();
                            throw th3;
                        }
                    } else {
                        c18177 = C18177.m42316(c5477M15575, c22601, new C21896(c23034, c20485));
                    }
                    try {
                        m31006("Invalid hex checkpoint footer", c22601.readInt() == 1481135181);
                        long jM46936 = c20485.m46936();
                        c20485.m46937();
                        m31006("Hex checkpoint CRC mismatch", jM46936 == c22601.readLong());
                        m31011(interfaceC17066M38504);
                        m31006("Unexpected trailing hex checkpoint data", dataInputStream.read() == -1);
                        m31011(interfaceC17066M38504);
                        c18177.m42396();
                        m31011(interfaceC17066M38504);
                        C13428 c13428 = new C13428(c18177, c8218M21767, z3, z2);
                        try {
                            dataInputStream.close();
                            try {
                                c20485.close();
                                return c13428;
                            } catch (IOException | Error | RuntimeException e) {
                                th = e;
                                z = true;
                                if (c18177 == null) {
                                    try {
                                        c18177.close();
                                        throw th;
                                    } catch (IOException e2) {
                                        th.addSuppressed(e2);
                                        throw th;
                                    }
                                }
                                if (c5477M15575 == null && !z) {
                                    try {
                                        c5477M15575.close();
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
                                c20485.close();
                                throw th2;
                            } catch (Throwable th10) {
                                try {
                                    th2.addSuppressed(th10);
                                    throw th2;
                                } catch (IOException | Error | RuntimeException e4) {
                                    th = e4;
                                    if (c18177 == null) {
                                        c18177.close();
                                        throw th;
                                    }
                                    if (c5477M15575 == null) {
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
                    c18178 = null;
                    c5477M15575 = null;
                }
            } catch (Throwable th13) {
                c5477M15575 = null;
                th2 = th13;
                c18177 = null;
                z = false;
            }
        } catch (IOException | Error | RuntimeException e5) {
            c5477M15575 = null;
            th = e5;
            c18177 = null;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31002(DataInput dataInput) throws IOException {
        C22601 c22601 = (C22601) dataInput;
        int i = c22601.readInt();
        m31006("Invalid hex checkpoint path length", i >= 0 && i <= 1048576);
        byte[] bArr = new byte[i];
        c22601.readFully(bArr, 0, i);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31006(String str, boolean z) throws IOException {
        if (!z) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31011(InterfaceC17066 interfaceC17066) throws C23821 {
        if (interfaceC17066.mo1526()) {
            throw new C23821();
        }
    }
}
