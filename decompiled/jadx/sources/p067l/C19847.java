package p067l;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.p069sf.sevenzipjbinding.ArchiveFormat;
import net.p069sf.sevenzipjbinding.ExtractOperationResult;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ᩳ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final class C19847 {
    /* JADX INFO: renamed from: ֫ */
    public static void m45088(InterfaceC13399 interfaceC13399, InterfaceC15563 interfaceC15563) {
        m45087(null, C7480.stream(interfaceC13399).mapToInt(new C14223()).toArray(), interfaceC15563);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX INFO: renamed from: ֫ */
    public static void m45087(AbstractActivityC5549 abstractActivityC5549, int[] iArr, InterfaceC15563 interfaceC15563) {
        ISequentialOutStream iSequentialOutStream;
        ISequentialOutStream iSequentialOutStream2;
        IInArchive iInArchive = null;
        ISequentialOutStream[] iSequentialOutStreamArr = {null};
        IInArchive iInArchiveMo9238 = interfaceC15563.mo9238();
        C13553 c13553 = new C13553(abstractActivityC5549, interfaceC15563, iInArchiveMo9238, iSequentialOutStreamArr);
        c13553.m6243(interfaceC15563.mo9239());
        c13553.m6240(new C12212(interfaceC15563));
        while (true) {
            try {
                try {
                    interfaceC15563.mo9236();
                    iInArchiveMo9238.extract(iArr, false, c13553);
                    if (c13553.m6246()) {
                        C23775.m52843(c13553.m6242(), interfaceC15563.mo9232());
                    }
                    if (c13553.m6245()) {
                        String strM6242 = c13553.m6242();
                        if (!TextUtils.isEmpty(strM6242)) {
                            interfaceC15563.mo9231(strM6242);
                        }
                    }
                    interfaceC15563.mo9235(iInArchiveMo9238);
                    iSequentialOutStream = iSequentialOutStreamArr[0];
                    if (iSequentialOutStream instanceof Closeable) {
                        break;
                    } else {
                        return;
                    }
                } catch (SevenZipException e) {
                    if (c13553.mo6244()) {
                        ISequentialOutStream iSequentialOutStream3 = iSequentialOutStreamArr[0];
                        if (iSequentialOutStream3 != null) {
                            if (iSequentialOutStream3 instanceof Closeable) {
                                C2700.m4192((Closeable) iSequentialOutStream3);
                            }
                            iSequentialOutStreamArr[0] = null;
                            interfaceC15563.mo9234();
                        }
                        interfaceC15563.mo9235(iInArchiveMo9238);
                        try {
                            interfaceC15563.mo16035();
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
                                C2700.m4192((Closeable) iSequentialOutStream2);
                            }
                            C2700.m4192(iInArchive);
                            throw th;
                        }
                    }
                    if (interfaceC15563.mo3924()) {
                        ISequentialOutStream iSequentialOutStream4 = iSequentialOutStreamArr[0];
                        if (iSequentialOutStream4 instanceof Closeable) {
                            C2700.m4192((Closeable) iSequentialOutStream4);
                        }
                        C2700.m4192(iInArchiveMo9238);
                        return;
                    }
                    IOException iOExceptionM45086 = m45086(e);
                    if (iOExceptionM45086 != null) {
                        throw iOExceptionM45086;
                    }
                    if (!interfaceC15563.mo9240()) {
                        throw e;
                    }
                    if (!c13553.m6245()) {
                        throw e;
                    }
                    if (c13553.m6241()) {
                        C23775.m52842();
                    }
                    c13553.m6243(null);
                }
            } catch (Throwable th2) {
                th = th2;
                iInArchive = iInArchiveMo9238;
                iSequentialOutStream2 = iSequentialOutStreamArr[0];
                if (iSequentialOutStream2 instanceof Closeable) {
                    C2700.m4192((Closeable) iSequentialOutStream2);
                }
                C2700.m4192(iInArchive);
                throw th;
            }
        }
        C2700.m4192((Closeable) iSequentialOutStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45089(InterfaceC15563 interfaceC15563) {
        ExtractOperationResult extractOperationResultM42053;
        IInArchive iInArchiveMo9238 = interfaceC15563.mo9238();
        ArchiveFormat archiveFormat = iInArchiveMo9238.getArchiveFormat();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        AtomicReference atomicReference = new AtomicReference();
        C24281 c24281 = new C24281(interfaceC15563, atomicBoolean, atomicBoolean2, atomicReference);
        c24281.m6243(interfaceC15563.mo9239());
        c24281.m6240(new C12212(interfaceC15563));
        while (!interfaceC15563.mo3924()) {
            try {
                boolean z = true;
                try {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    atomicReference.set(null);
                    iInArchiveMo9238.extract(null, true, c24281);
                    if (!interfaceC15563.mo3924()) {
                        if (c24281.m6246()) {
                            C23775.m52843(c24281.m6242(), interfaceC15563.mo9232());
                        }
                        if (c24281.m6245()) {
                            String strM6242 = c24281.m6242();
                            if (!TextUtils.isEmpty(strM6242)) {
                                interfaceC15563.mo9231(strM6242);
                            }
                        }
                        interfaceC15563.mo9235(iInArchiveMo9238);
                        return;
                    }
                    C2700.m4192(iInArchiveMo9238);
                    return;
                } catch (SevenZipException e) {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    if (c24281.mo6244()) {
                        interfaceC15563.mo9235(iInArchiveMo9238);
                        try {
                            interfaceC15563.mo16035();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            iInArchiveMo9238 = null;
                            C2700.m4192(iInArchiveMo9238);
                            throw th;
                        }
                    }
                    if (!interfaceC15563.mo3924()) {
                        IOException iOExceptionM45086 = m45086(e);
                        if (iOExceptionM45086 != null) {
                            throw iOExceptionM45086;
                        }
                        C18505 c18505 = (C18505) atomicReference.getAndSet(null);
                        if (c18505 == null || ((extractOperationResultM42053 = c18505.m42053()) != ExtractOperationResult.WRONG_PASSWORD && ((archiveFormat != ArchiveFormat.SEVEN_ZIP && archiveFormat != ArchiveFormat.RAR) || (extractOperationResultM42053 != ExtractOperationResult.CRCERROR && extractOperationResultM42053 != ExtractOperationResult.DATAERROR)))) {
                            z = false;
                        }
                        if (c24281.m6245() && c18505 != null && c18505.m42052() && z) {
                            if (c24281.m6241()) {
                                C23775.m52842();
                            }
                            c24281.m6243(null);
                        } else {
                            throw e;
                        }
                    } else {
                        C2700.m4192(iInArchiveMo9238);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        C2700.m4192(iInArchiveMo9238);
    }

    /* JADX INFO: renamed from: ֫ */
    public static IOException m45086(SevenZipException sevenZipException) {
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
