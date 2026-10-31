package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۠ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: RAHU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8102 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f24978;

    public C8102(AbstractC3163 abstractC3163) {
        this.f24978 = abstractC3163;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21534(String str, AbstractC15440 abstractC15440, InterfaceC5627 interfaceC5627) throws IOException {
        InterfaceC17889 interfaceC17889Mo7638 = this.f24978.mo7638(str);
        if (interfaceC17889Mo7638 == null) {
            throw new FileNotFoundException(str);
        }
        m21536(interfaceC17889Mo7638, abstractC15440, true, interfaceC5627);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21536(InterfaceC17889 interfaceC17889, AbstractC15440 abstractC15440, boolean z, InterfaceC5627 interfaceC5627) throws IOException {
        String path = interfaceC17889.getPath();
        if (interfaceC17889.isDirectory()) {
            throw new IOException(C4860.m14172("File ", path, " is a directory"));
        }
        long size = interfaceC17889.getSize();
        C21217 c21217 = new C21217(this.f24978, interfaceC5627);
        c21217.m48165(interfaceC17889.getName(), path, abstractC15440, size, interfaceC17889.getTime(), null, null, false, false);
        final AtomicReference atomicReference = new AtomicReference();
        c21217.m48166(new InterfaceC24038() { // from class: l.֨ۢ᩻
            @Override // l.InterfaceC24038
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo3587(C2872 c2872, boolean z2) {
                Exception exc;
                AtomicReference atomicReference2;
                if (z2 || (exc = (Exception) c2872.f9162.get()) == null) {
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
            c21217.m48169();
            Exception exc = (Exception) atomicReference.get();
            if (exc != null) {
                if (!(exc instanceof IOException)) {
                    throw new IOException(exc);
                }
                throw ((IOException) exc);
            }
            if (interfaceC5627.mo1526()) {
                abstractC15440.mo27929();
            } else if (!z && abstractC15440.mo27912() && C4925.m14321()) {
                abstractC15440.mo18537(interfaceC17889.getTime());
            }
        } catch (Exception e) {
            if (!(e instanceof IOException)) {
                throw new IOException(e);
            }
            throw ((IOException) e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21535(AbstractC13921 abstractC13921, String str, String str2, boolean z, InterfaceC5627 interfaceC5627) throws IOException {
        String str3;
        InterfaceC17889 interfaceC17889Mo7638 = this.f24978.mo7638(str2);
        InterfaceC17889 interfaceC17889M33351 = abstractC13921.m33351(str);
        if (interfaceC17889Mo7638 != null) {
            C15688 c15688 = (C15688) interfaceC17889Mo7638;
            if (c15688.isDirectory()) {
                throw new IOException(C4860.m14172("File ", str2, " is a directory"));
            }
            String strM24406 = C9523.m24406(str2);
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
            if (strM24406 != null) {
                string = C16014.m37867(strM24406, string);
            }
            synchronized (this) {
                if (interfaceC5627.mo1526()) {
                    return;
                }
                final InputStream inputStreamMo7636 = abstractC13921.mo7636((AbstractActivityC3346) null, interfaceC17889M33351);
                if (inputStreamMo7636 == null) {
                    if (interfaceC5627 instanceof InterfaceC14243) {
                        ((InterfaceC14243) interfaceC5627).cancel();
                    }
                    return;
                }
                if (abstractC13921 instanceof AbstractC3163) {
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    final AtomicReference atomicReference = new AtomicReference();
                    final C9742 c9742 = new C9742(5242880L);
                    C1802.f6208.submit(new Runnable() { // from class: l.ۚۢ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8102.m21531(inputStreamMo7636, c9742, atomicBoolean, atomicReference);
                        }
                    });
                    try {
                        InputStream inputStreamMo12307 = C23852.m52567(c9742.m24729()).mo12307();
                        try {
                            m21529(inputStreamMo12307, this.f24978.mo9693(((C15688) interfaceC17889M33351).getSize(), string), interfaceC17889M33351, interfaceC5627);
                            inputStreamMo12307.close();
                            atomicBoolean.set(true);
                            IOException iOException = (IOException) atomicReference.get();
                            if (iOException != null) {
                                throw iOException;
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamMo12307.close();
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
                        m21529(inputStreamMo7636, this.f24978.mo9693(((C15688) interfaceC17889M33351).getSize(), string), interfaceC17889M33351, interfaceC5627);
                        inputStreamMo7636.close();
                    } catch (Throwable th4) {
                        try {
                            inputStreamMo7636.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                }
                if (interfaceC5627.mo1526()) {
                    this.f24978.m9697(string, false);
                } else {
                    if (!z || c15688.getSize() <= 0) {
                        m21532(this.f24978, str2);
                    } else {
                        String strConcat = str2.concat(".bak");
                        InterfaceC17889 interfaceC17889Mo7639 = this.f24978.mo7638(strConcat);
                        if (interfaceC17889Mo7639 == null) {
                            m21533(this.f24978, str2, strConcat);
                        } else if (((C15688) interfaceC17889Mo7639).isDirectory()) {
                            m21532(this.f24978, str2);
                        } else {
                            m21532(this.f24978, strConcat);
                            m21533(this.f24978, str2, strConcat);
                        }
                    }
                    this.f24978.mo9684(string, str2);
                    if (interfaceC5627.mo1526()) {
                        return;
                    }
                    if (interfaceC17889Mo7638.mo24428() != null) {
                        AbstractC3163 abstractC3163 = this.f24978;
                        int iM38843 = interfaceC17889Mo7638.mo24428().m38843();
                        if (abstractC3163.mo9708()) {
                            try {
                                abstractC3163.mo9694(iM38843, str2);
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            }
        } else {
            synchronized (this) {
                if (interfaceC5627.mo1526()) {
                    return;
                }
                InputStream inputStreamMo7637 = abstractC13921.mo7636((AbstractActivityC3346) null, interfaceC17889M33351);
                if (inputStreamMo7637 == null) {
                    if (interfaceC5627 instanceof InterfaceC14243) {
                        ((InterfaceC14243) interfaceC5627).cancel();
                    }
                    return;
                }
                try {
                    m21529(inputStreamMo7637, this.f24978.mo9693(((C15688) interfaceC17889M33351).getSize(), str2), interfaceC17889M33351, interfaceC5627);
                    inputStreamMo7637.close();
                    if (interfaceC5627.mo1526()) {
                        this.f24978.m9697(str2, false);
                    }
                } catch (Throwable th6) {
                    try {
                        inputStreamMo7637.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            }
        }
        if (!interfaceC5627.mo1526() && C4925.m14321() && this.f24978.mo9687()) {
            try {
                this.f24978.mo9700(((C15688) interfaceC17889M33351).getTime(), str2);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21531(InputStream inputStream, C9742 c9742, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        try {
            try {
                m21530(inputStream, c9742.m24728(), atomicBoolean);
                C0349.m1793(c9742.m24728());
            } catch (Throwable th) {
                C0349.m1793(c9742.m24728());
                throw th;
            }
        } catch (IOException e) {
            atomicReference.set(e);
            C0349.m1793(c9742.m24728());
        } catch (Throwable th2) {
            atomicReference.set(new IOException(th2));
            C0349.m1793(c9742.m24728());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21529(InputStream inputStream, OutputStream outputStream, InterfaceC17889 interfaceC17889, InterfaceC5627 interfaceC5627) throws Throwable {
        Throwable th;
        Throwable e;
        Throwable th2 = null;
        try {
            C14176.m33825(inputStream, outputStream, interfaceC17889.getSize(), interfaceC5627);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21530(InputStream inputStream, InterfaceC5508 interfaceC5508, AtomicBoolean atomicBoolean) throws IOException {
        InterfaceC6171 interfaceC6171M52567 = C23852.m52567(C23852.m52563(inputStream));
        try {
            InterfaceC10405 interfaceC10405M52568 = C23852.m52568(interfaceC5508);
            while (!interfaceC6171M52567.mo12308() && !atomicBoolean.get() && interfaceC6171M52567.mo4334(interfaceC10405M52568.mo26253(), 8192L) != -1) {
                try {
                    interfaceC10405M52568.flush();
                } catch (Throwable th) {
                    try {
                        interfaceC10405M52568.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            interfaceC10405M52568.close();
            interfaceC6171M52567.close();
        } catch (Throwable th3) {
            try {
                interfaceC6171M52567.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21532(AbstractC3163 abstractC3163, String str) throws IOException {
        try {
            abstractC3163.mo9701(str, false);
        } catch (IOException e) {
            try {
                String strM24406 = C9523.m24406(str);
                if (strM24406 != null) {
                    abstractC3163.mo9692(strM24406);
                }
                if (abstractC3163.mo9703(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21533(AbstractC3163 abstractC3163, String str, String str2) throws IOException {
        try {
            abstractC3163.mo9684(str, str2);
        } catch (IOException e) {
            try {
                String strM24406 = C9523.m24406(str);
                if (strM24406 != null) {
                    abstractC3163.mo9692(strM24406);
                }
                if (abstractC3163.mo9703(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }
}
