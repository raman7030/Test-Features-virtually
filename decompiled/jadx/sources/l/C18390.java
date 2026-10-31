package l;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ᩳ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final class C18390 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42816(InterfaceC11606 interfaceC11606, InterfaceC13883 interfaceC13883) {
        m42815(null, C5378.stream(interfaceC11606).mapToInt(new C12473()).toArray(), interfaceC13883);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42815(AbstractActivityC3346 abstractActivityC3346, int[] iArr, InterfaceC13883 interfaceC13883) {
        ISequentialOutStream iSequentialOutStream;
        ISequentialOutStream iSequentialOutStream2;
        IInArchive iInArchive = null;
        ISequentialOutStream[] iSequentialOutStreamArr = {null};
        IInArchive iInArchiveMo7143 = interfaceC13883.mo7143();
        C11768 c11768 = new C11768(abstractActivityC3346, interfaceC13883, iInArchiveMo7143, iSequentialOutStreamArr);
        c11768.m4001(interfaceC13883.mo7144());
        c11768.m3998(new C10357(interfaceC13883));
        while (true) {
            try {
                try {
                    interfaceC13883.mo7141();
                    iInArchiveMo7143.extract(iArr, false, c11768);
                    if (c11768.m4004()) {
                        C22523.m50501(c11768.m4000(), interfaceC13883.mo7137());
                    }
                    if (c11768.m4003()) {
                        String strM4000 = c11768.m4000();
                        if (!TextUtils.isEmpty(strM4000)) {
                            interfaceC13883.mo7136(strM4000);
                        }
                    }
                    interfaceC13883.mo7140(iInArchiveMo7143);
                    iSequentialOutStream = iSequentialOutStreamArr[0];
                    if (iSequentialOutStream instanceof Closeable) {
                        break;
                    } else {
                        return;
                    }
                } catch (SevenZipException e) {
                    if (c11768.mo4002()) {
                        ISequentialOutStream iSequentialOutStream3 = iSequentialOutStreamArr[0];
                        if (iSequentialOutStream3 != null) {
                            if (iSequentialOutStream3 instanceof Closeable) {
                                C0349.m1793((Closeable) iSequentialOutStream3);
                            }
                            iSequentialOutStreamArr[0] = null;
                            interfaceC13883.mo7139();
                        }
                        interfaceC13883.mo7140(iInArchiveMo7143);
                        try {
                            interfaceC13883.mo14154();
                            iSequentialOutStream = iSequentialOutStreamArr[0];
                            if (iSequentialOutStream instanceof Closeable) {
                                break;
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            iSequentialOutStream2 = iSequentialOutStreamArr[0];
                            if (iSequentialOutStream2 instanceof Closeable) {
                                C0349.m1793((Closeable) iSequentialOutStream2);
                            }
                            C0349.m1793(iInArchive);
                            throw th;
                        }
                    }
                    if (interfaceC13883.mo1526()) {
                        ISequentialOutStream iSequentialOutStream4 = iSequentialOutStreamArr[0];
                        if (iSequentialOutStream4 instanceof Closeable) {
                            C0349.m1793((Closeable) iSequentialOutStream4);
                        }
                        C0349.m1793(iInArchiveMo7143);
                        return;
                    }
                    IOException iOExceptionM42814 = m42814(e);
                    if (iOExceptionM42814 != null) {
                        throw iOExceptionM42814;
                    }
                    if (!interfaceC13883.mo7145()) {
                        throw e;
                    }
                    if (!c11768.m4003()) {
                        throw e;
                    }
                    if (c11768.m3999()) {
                        C22523.m50500();
                    }
                    c11768.m4001(null);
                }
            } catch (Throwable th2) {
                th = th2;
                iInArchive = iInArchiveMo7143;
                iSequentialOutStream2 = iSequentialOutStreamArr[0];
                if (iSequentialOutStream2 instanceof Closeable) {
                    C0349.m1793((Closeable) iSequentialOutStream2);
                }
                C0349.m1793(iInArchive);
                throw th;
            }
        }
        C0349.m1793((Closeable) iSequentialOutStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42817(InterfaceC13883 interfaceC13883) {
        ExtractOperationResult extractOperationResultM39810;
        IInArchive iInArchiveMo7143 = interfaceC13883.mo7143();
        ArchiveFormat archiveFormat = iInArchiveMo7143.getArchiveFormat();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        AtomicReference atomicReference = new AtomicReference();
        C23056 c23056 = new C23056(interfaceC13883, atomicBoolean, atomicBoolean2, atomicReference);
        c23056.m4001(interfaceC13883.mo7144());
        c23056.m3998(new C10357(interfaceC13883));
        while (!interfaceC13883.mo1526()) {
            try {
                boolean z = true;
                try {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    atomicReference.set(null);
                    iInArchiveMo7143.extract(null, true, c23056);
                    if (!interfaceC13883.mo1526()) {
                        if (c23056.m4004()) {
                            C22523.m50501(c23056.m4000(), interfaceC13883.mo7137());
                        }
                        if (c23056.m4003()) {
                            String strM4000 = c23056.m4000();
                            if (!TextUtils.isEmpty(strM4000)) {
                                interfaceC13883.mo7136(strM4000);
                            }
                        }
                        interfaceC13883.mo7140(iInArchiveMo7143);
                        return;
                    }
                    C0349.m1793(iInArchiveMo7143);
                    return;
                } catch (SevenZipException e) {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    if (c23056.mo4002()) {
                        interfaceC13883.mo7140(iInArchiveMo7143);
                        try {
                            interfaceC13883.mo14154();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            iInArchiveMo7143 = null;
                            C0349.m1793(iInArchiveMo7143);
                            throw th;
                        }
                    }
                    if (!interfaceC13883.mo1526()) {
                        IOException iOExceptionM42814 = m42814(e);
                        if (iOExceptionM42814 != null) {
                            throw iOExceptionM42814;
                        }
                        C16978 c16978 = (C16978) atomicReference.getAndSet(null);
                        if (c16978 == null || ((extractOperationResultM39810 = c16978.m39810()) != ExtractOperationResult.WRONG_PASSWORD && ((archiveFormat != ArchiveFormat.SEVEN_ZIP && archiveFormat != ArchiveFormat.RAR) || (extractOperationResultM39810 != ExtractOperationResult.CRCERROR && extractOperationResultM39810 != ExtractOperationResult.DATAERROR)))) {
                            z = false;
                        }
                        if (c23056.m4003() && c16978 != null && c16978.m39809() && z) {
                            if (c23056.m3999()) {
                                C22523.m50500();
                            }
                            c23056.m4001(null);
                        } else {
                            throw e;
                        }
                    } else {
                        C0349.m1793(iInArchiveMo7143);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        C0349.m1793(iInArchiveMo7143);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m42814(SevenZipException sevenZipException) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        arrayDeque.add(sevenZipException);
        while (!arrayDeque.isEmpty()) {
            Throwable th = (Throwable) arrayDeque.removeFirst();
            if (hashSet.add(th)) {
                if ((th instanceof IOException) && !(th instanceof SevenZipException)) {
                    return (IOException) th;
                }
                if (th.getCause() != null) {
                    arrayDeque.add(th.getCause());
                }
                if (th instanceof SevenZipException) {
                    SevenZipException sevenZipException2 = (SevenZipException) th;
                    if (sevenZipException2.getCauseLastThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastThrown());
                    }
                    if (sevenZipException2.getCauseFirstPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseFirstPotentialThrown());
                    }
                    if (sevenZipException2.getCauseLastPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastPotentialThrown());
                    }
                }
            }
        }
        return null;
    }
}
