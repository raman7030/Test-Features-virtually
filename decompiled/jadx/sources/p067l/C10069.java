package p067l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۠ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: RAHU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10069 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 f27887;

    public C10069(AbstractC5375 abstractC5375) {
        this.f27887 = abstractC5375;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23502(String str, AbstractC17043 abstractC17043, InterfaceC7717 interfaceC7717) throws IOException {
        InterfaceC19370 interfaceC19370Mo9709 = this.f27887.mo9709(str);
        if (interfaceC19370Mo9709 == null) {
            throw new FileNotFoundException(str);
        }
        m23504(interfaceC19370Mo9709, abstractC17043, true, interfaceC7717);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23504(InterfaceC19370 interfaceC19370, AbstractC17043 abstractC17043, boolean z, InterfaceC7717 interfaceC7717) throws IOException {
        String path = interfaceC19370.getPath();
        if (interfaceC19370.isDirectory()) {
            throw new IOException(C6988.m16053("File ", path, " is a directory"));
        }
        long size = interfaceC19370.getSize();
        C22534 c22534 = new C22534(this.f27887, interfaceC7717);
        c22534.m50496(interfaceC19370.getName(), path, abstractC17043, size, interfaceC19370.getTime(), null, null, false, false);
        final AtomicReference atomicReference = new AtomicReference();
        c22534.m50497(new InterfaceC25215() { // from class: l.֨ۢ᩻
            @Override // p067l.InterfaceC25215
            /* JADX INFO: renamed from: ֫ */
            public final void mo5874(C5099 c5099, boolean z2) {
                Exception exc;
                AtomicReference atomicReference2;
                if (z2 || (exc = (Exception) c5099.f11960.get()) == null) {
                    return;
                }
                do {
                    atomicReference2 = atomicReference;
                    if (atomicReference2.compareAndSet(null, exc)) {
                        return;
                    }
                } while (atomicReference2.get() == null);
            }
        });
        try {
            c22534.m50500();
            Exception exc = (Exception) atomicReference.get();
            if (exc != null) {
                if (!(exc instanceof IOException)) {
                    throw new IOException(exc);
                }
                throw ((IOException) exc);
            }
            if (interfaceC7717.mo3924()) {
                abstractC17043.mo29990();
            } else if (!z && abstractC17043.mo29973() && C7050.m16218()) {
                abstractC17043.mo20486(interfaceC19370.getTime());
            }
        } catch (Exception e) {
            if (!(e instanceof IOException)) {
                throw new IOException(e);
            }
            throw ((IOException) e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23503(AbstractC15599 abstractC15599, String str, String str2, boolean z, InterfaceC7717 interfaceC7717) throws IOException {
        String str3;
        InterfaceC19370 interfaceC19370Mo9709 = this.f27887.mo9709(str2);
        InterfaceC19370 interfaceC19370M35470 = abstractC15599.m35470(str);
        if (interfaceC19370Mo9709 != null) {
            C17278 c17278 = (C17278) interfaceC19370Mo9709;
            if (c17278.isDirectory()) {
                throw new IOException(C6988.m16053("File ", str2, " is a directory"));
            }
            String strM26416 = C11419.m26416(str2);
            StringBuilder sb = new StringBuilder();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis == 0) {
                str3 = "0";
            } else if (jCurrentTimeMillis > 0) {
                str3 = Long.toString(jCurrentTimeMillis, 16);
            } else {
                int i = 64;
                char[] cArr = new char[64];
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(16);
                do {
                    i--;
                    cArr[i] = Character.forDigit(((int) jCurrentTimeMillis) & 15, 16);
                    jCurrentTimeMillis >>>= iNumberOfTrailingZeros;
                } while (jCurrentTimeMillis != 0);
                str3 = new String(cArr, i, 64 - i);
            }
            sb.append(str3);
            sb.append(Long.toString(((long) str2.hashCode()) & 4294967295L, 16));
            sb.append(".tmp");
            String string = sb.toString();
            if (strM26416 != null) {
                string = C17588.m40053(strM26416, string);
            }
            synchronized (this) {
                if (interfaceC7717.mo3924()) {
                    return;
                }
                final InputStream inputStreamMo9707 = abstractC15599.mo9707((AbstractActivityC5549) null, interfaceC19370M35470);
                if (inputStreamMo9707 == null) {
                    if (interfaceC7717 instanceof InterfaceC15905) {
                        ((InterfaceC15905) interfaceC7717).cancel();
                    }
                    return;
                }
                if (abstractC15599 instanceof AbstractC5375) {
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    final AtomicReference atomicReference = new AtomicReference();
                    final C11627 c11627 = new C11627(5242880L);
                    C4081.f8987.submit(new Runnable() { // from class: l.ۚۢ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10069.m23499(inputStreamMo9707, c11627, atomicBoolean, atomicReference);
                        }
                    });
                    try {
                        InputStream inputStreamMo14212 = C25037.m54976(c11627.m26743()).mo14212();
                        try {
                            m23497(inputStreamMo14212, this.f27887.mo11737(((C17278) interfaceC19370M35470).getSize(), string), interfaceC19370M35470, interfaceC7717);
                            inputStreamMo14212.close();
                            atomicBoolean.set(true);
                            IOException iOException = (IOException) atomicReference.get();
                            if (iOException != null) {
                                throw iOException;
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamMo14212.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        atomicBoolean.set(true);
                        throw th3;
                    }
                } else {
                    try {
                        m23497(inputStreamMo9707, this.f27887.mo11737(((C17278) interfaceC19370M35470).getSize(), string), interfaceC19370M35470, interfaceC7717);
                        inputStreamMo9707.close();
                    } catch (Throwable th4) {
                        try {
                            inputStreamMo9707.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                }
                if (interfaceC7717.mo3924()) {
                    this.f27887.m11741(string, false);
                } else {
                    if (!z || c17278.getSize() <= 0) {
                        m23500(this.f27887, str2);
                    } else {
                        String strConcat = str2.concat(".bak");
                        InterfaceC19370 interfaceC19370Mo97010 = this.f27887.mo9709(strConcat);
                        if (interfaceC19370Mo97010 == null) {
                            m23501(this.f27887, str2, strConcat);
                        } else if (((C17278) interfaceC19370Mo97010).isDirectory()) {
                            m23500(this.f27887, str2);
                        } else {
                            m23500(this.f27887, strConcat);
                            m23501(this.f27887, str2, strConcat);
                        }
                    }
                    this.f27887.mo11728(string, str2);
                    if (interfaceC7717.mo3924()) {
                        return;
                    }
                    if (interfaceC19370Mo9709.mo26440() != null) {
                        AbstractC5375 abstractC5375 = this.f27887;
                        int iM41069 = interfaceC19370Mo9709.mo26440().m41069();
                        if (abstractC5375.mo11752()) {
                            try {
                                abstractC5375.mo11738(iM41069, str2);
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            }
        } else {
            synchronized (this) {
                if (interfaceC7717.mo3924()) {
                    return;
                }
                InputStream inputStreamMo9708 = abstractC15599.mo9707((AbstractActivityC5549) null, interfaceC19370M35470);
                if (inputStreamMo9708 == null) {
                    if (interfaceC7717 instanceof InterfaceC15905) {
                        ((InterfaceC15905) interfaceC7717).cancel();
                    }
                    return;
                }
                try {
                    m23497(inputStreamMo9708, this.f27887.mo11737(((C17278) interfaceC19370M35470).getSize(), str2), interfaceC19370M35470, interfaceC7717);
                    inputStreamMo9708.close();
                    if (interfaceC7717.mo3924()) {
                        this.f27887.m11741(str2, false);
                    }
                } catch (Throwable th6) {
                    try {
                        inputStreamMo9708.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            }
        }
        if (!interfaceC7717.mo3924() && C7050.m16218() && this.f27887.mo11731()) {
            try {
                this.f27887.mo11744(((C17278) interfaceC19370M35470).getTime(), str2);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m23499(InputStream inputStream, C11627 c11627, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        try {
            try {
                m23498(inputStream, c11627.m26742(), atomicBoolean);
                C2700.m4192(c11627.m26742());
            } catch (Throwable th) {
                C2700.m4192(c11627.m26742());
                throw th;
            }
        } catch (IOException e) {
            atomicReference.set(e);
            C2700.m4192(c11627.m26742());
        } catch (Throwable th2) {
            atomicReference.set(new IOException(th2));
            C2700.m4192(c11627.m26742());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23497(InputStream inputStream, OutputStream outputStream, InterfaceC19370 interfaceC19370, InterfaceC7717 interfaceC7717) throws Throwable {
        Throwable th;
        Throwable e;
        Throwable th2 = null;
        try {
            C15841.m35957(inputStream, outputStream, interfaceC19370.getSize(), interfaceC7717);
            try {
                outputStream.close();
            } catch (IOException | Error | RuntimeException e2) {
                th2 = e2;
            }
            if (th2 != null) {
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            }
        } catch (IOException e3) {
            e = e3;
            try {
                throw e;
            } catch (Throwable th3) {
                th = th3;
                try {
                    outputStream.close();
                } catch (IOException | Error | RuntimeException e4) {
                    th2 = e4;
                    if (e != null) {
                        e.addSuppressed(th2);
                    }
                }
                if (e != null || th2 == null) {
                    throw th;
                }
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            }
        } catch (Error e5) {
            e = e5;
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            throw e;
        } catch (Throwable th4) {
            th = th4;
            e = null;
            outputStream.close();
            if (e != null) {
                throw th;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23498(InputStream inputStream, InterfaceC7603 interfaceC7603, AtomicBoolean atomicBoolean) throws IOException {
        InterfaceC8233 interfaceC8233M54976 = C25037.m54976(C25037.m54972(inputStream));
        try {
            InterfaceC12257 interfaceC12257M54977 = C25037.m54977(interfaceC7603);
            while (!interfaceC8233M54976.mo14213() && !atomicBoolean.get() && interfaceC8233M54976.mo6580(interfaceC12257M54977.mo28282(), 8192L) != -1) {
                try {
                    interfaceC12257M54977.flush();
                } catch (Throwable th) {
                    try {
                        interfaceC12257M54977.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            interfaceC12257M54977.close();
            interfaceC8233M54976.close();
        } catch (Throwable th3) {
            try {
                interfaceC8233M54976.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23500(AbstractC5375 abstractC5375, String str) throws IOException {
        try {
            abstractC5375.mo11745(str, false);
        } catch (IOException e) {
            try {
                String strM26416 = C11419.m26416(str);
                if (strM26416 != null) {
                    abstractC5375.mo11736(strM26416);
                }
                if (abstractC5375.mo11747(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23501(AbstractC5375 abstractC5375, String str, String str2) throws IOException {
        try {
            abstractC5375.mo11728(str, str2);
        } catch (IOException e) {
            try {
                String strM26416 = C11419.m26416(str);
                if (strM26416 != null) {
                    abstractC5375.mo11736(strM26416);
                }
                if (abstractC5375.mo11747(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }
}
