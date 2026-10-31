package l;

import android.os.ParcelFileDescriptor;
import bin.mt.plus.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J72H */
/* JADX INFO: loaded from: classes4.dex */
public final class C20336 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f65648;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f65649;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Object f65650;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f65651;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f65652;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f65653;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Semaphore f65654;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1769 f65655;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f65656;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f65657;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f65658;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f65659;

    public C20336(ActivityC0921 activityC0921, AbstractC13921 abstractC13921, String str, boolean z) {
        this.f65655 = ConcurrentMapC10942.newKeySet();
        this.f65650 = new Object();
        this.f65649 = new HashSet();
        this.f65654 = new Semaphore(2, true);
        this.f65657 = new WeakReference(activityC0921);
        this.f65652 = abstractC13921;
        this.f65653 = abstractC13921 instanceof C2346 ? new Object() : abstractC13921;
        this.f65659 = str;
        this.f65648 = z;
        this.f65651 = null;
    }

    public C20336(ActivityC0921 activityC0921, AbstractC15440 abstractC15440) {
        this.f65655 = ConcurrentMapC10942.newKeySet();
        this.f65650 = new Object();
        this.f65649 = new HashSet();
        this.f65654 = new Semaphore(2, true);
        this.f65657 = new WeakReference(activityC0921);
        this.f65652 = null;
        this.f65653 = new Object();
        this.f65659 = null;
        this.f65648 = true;
        this.f65651 = abstractC15440;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0071  */
    /* JADX WARN: Code duplicated, block: B:64:0x0081  */
    /* JADX WARN: Code duplicated, block: B:77:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x006c: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:53:0x006c */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m46664(final C20336 c20336) throws Throwable {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        final ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        boolean z2;
        ParcelFileDescriptor parcelFileDescriptor2;
        final int i = c20336.f65656;
        if (c20336.f65658) {
            throw new FileNotFoundException("HTML preview session is closed");
        }
        if (!c20336.f65654.tryAcquire()) {
            throw new FileNotFoundException("Too many open HTML preview streams");
        }
        try {
            try {
                parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                try {
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[1];
                    try {
                        synchronized (c20336.f65650) {
                            if (c20336.f65658 || i != c20336.f65656) {
                                throw new FileNotFoundException("HTML preview session is closed");
                            }
                            c20336.f65655.add(parcelFileDescriptor);
                        }
                        C1802.f6209.submit(new Runnable() { // from class: l.۠ᩳܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20336.m46661(this.f25563, parcelFileDescriptor, i);
                            }
                        });
                        try {
                            return parcelFileDescriptorArrCreatePipe[0];
                        } catch (IOException e) {
                            e = e;
                            FileNotFoundException fileNotFoundException = new FileNotFoundException(e.getMessage());
                            fileNotFoundException.initCause(e);
                            throw fileNotFoundException;
                        } catch (RuntimeException e2) {
                            e = e2;
                            FileNotFoundException fileNotFoundException2 = new FileNotFoundException(e.getMessage());
                            fileNotFoundException2.initCause(e);
                            throw fileNotFoundException2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        FileNotFoundException fileNotFoundException3 = new FileNotFoundException(e.getMessage());
                        fileNotFoundException3.initCause(e);
                        throw fileNotFoundException3;
                    } catch (RuntimeException e4) {
                        e = e4;
                        FileNotFoundException fileNotFoundException4 = new FileNotFoundException(e.getMessage());
                        fileNotFoundException4.initCause(e);
                        throw fileNotFoundException4;
                    } catch (Throwable th) {
                        th = th;
                        z2 = false;
                        if (!z2) {
                            if (parcelFileDescriptor != null) {
                                c20336.f65655.remove(parcelFileDescriptor);
                            }
                            if (parcelFileDescriptor != null) {
                                try {
                                    parcelFileDescriptor.close();
                                } catch (IOException unused) {
                                }
                            }
                            parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe != null ? parcelFileDescriptorArrCreatePipe[0] : null;
                            if (parcelFileDescriptor2 != null) {
                                try {
                                    parcelFileDescriptor2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            c20336.f65654.release();
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    FileNotFoundException fileNotFoundException5 = new FileNotFoundException(e.getMessage());
                    fileNotFoundException5.initCause(e);
                    throw fileNotFoundException5;
                } catch (RuntimeException e6) {
                    e = e6;
                    FileNotFoundException fileNotFoundException6 = new FileNotFoundException(e.getMessage());
                    fileNotFoundException6.initCause(e);
                    throw fileNotFoundException6;
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptor = null;
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = z;
                if (!z2) {
                    if (parcelFileDescriptor != null) {
                        c20336.f65655.remove(parcelFileDescriptor);
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    if (parcelFileDescriptorArrCreatePipe != null) {
                    }
                    if (parcelFileDescriptor2 != null) {
                        parcelFileDescriptor2.close();
                    }
                    c20336.f65654.release();
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            FileNotFoundException fileNotFoundException7 = new FileNotFoundException(e.getMessage());
            fileNotFoundException7.initCause(e);
            throw fileNotFoundException7;
        } catch (RuntimeException e8) {
            e = e8;
            FileNotFoundException fileNotFoundException8 = new FileNotFoundException(e.getMessage());
            fileNotFoundException8.initCause(e);
            throw fileNotFoundException8;
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptorArrCreatePipe = null;
            parcelFileDescriptor = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46661(final C20336 c20336, ParcelFileDescriptor parcelFileDescriptor, final int i) {
        final AbstractActivityC3346 abstractActivityC3346;
        try {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    C23157 c23157M46665 = c20336.m46665(i);
                    try {
                        byte[] bArr = new byte[65536];
                        while (!c20336.f65658 && i == c20336.f65656) {
                            try {
                                int i2 = c23157M46665.read(bArr);
                                if (i2 == -1) {
                                    break;
                                } else {
                                    autoCloseOutputStream.write(bArr, 0, i2);
                                }
                            } catch (IOException e) {
                                e = e;
                                if ((c20336.f65652 instanceof AbstractC3163) && (abstractActivityC3346 = (AbstractActivityC3346) c20336.f65657.get()) != null) {
                                    abstractActivityC3346.runOnUiThread(new Runnable() { // from class: l.᩹ᩳܳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C20336.m46660(this.f72716, i, abstractActivityC3346);
                                        }
                                    });
                                }
                                throw e;
                            } catch (RuntimeException e2) {
                                e = e2;
                                if (c20336.f65652 instanceof AbstractC3163) {
                                    abstractActivityC3346.runOnUiThread(new Runnable() { // from class: l.᩹ᩳܳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C20336.m46660(this.f72716, i, abstractActivityC3346);
                                        }
                                    });
                                }
                                throw e;
                            }
                        }
                        c23157M46665.close();
                        autoCloseOutputStream.close();
                        c20336.f65655.remove(parcelFileDescriptor);
                        c20336.f65654.release();
                    } catch (Throwable th) {
                        try {
                            c23157M46665.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        autoCloseOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException | RuntimeException unused) {
            }
        } catch (Throwable th5) {
            c20336.f65655.remove(parcelFileDescriptor);
            c20336.f65654.release();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46660(C20336 c20336, int i, AbstractActivityC3346 abstractActivityC3346) {
        if (c20336.f65658 || i != c20336.f65656 || abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
            return;
        }
        C21374.m48457(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23157 m46665(final int i) throws IOException {
        C23157 c23157;
        if (this.f65652 instanceof AbstractC3163) {
            c23157 = new C23157(new InterfaceC11869() { // from class: l.ܶᩳܳ
                @Override // l.InterfaceC11869
                /* JADX INFO: renamed from: ֫ */
                public final InputStream mo28995() {
                    return this.f47139.m46657(i);
                }
            }, new Consumer() { // from class: l.᩸ᩳܳ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C20336.m46662(this.f69715, (C23157) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        } else {
            c23157 = new C23157(m46657(i), new Consumer() { // from class: l.᩸ᩳܳ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C20336.m46662(this.f69715, (C23157) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        }
        C23157 c23158 = c23157;
        synchronized (this.f65650) {
            if (!this.f65658 && i == this.f65656) {
                this.f65649.add(c23158);
                return c23158;
            }
            c23158.close();
            throw new IOException("HTML preview request was cancelled");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46662(C20336 c20336, C23157 c23157) {
        synchronized (c20336.f65650) {
            c20336.f65649.remove(c23157);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputStream m46657(int i) throws IOException {
        InterfaceC17889 interfaceC17889Mo7638;
        InputStream inputStreamMo7636;
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f65657.get();
        if (this.f65658 || i != this.f65656 || abstractActivityC3346 == null || abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
            throw new IOException("HTML preview owner is unavailable");
        }
        AbstractC15440 abstractC15440 = this.f65651;
        if (abstractC15440 != null) {
            return abstractC15440.mo27926();
        }
        if (this.f65652 == null || this.f65659 == null) {
            throw new IOException("MHTML source is unavailable");
        }
        synchronized (this.f65653) {
            synchronized (this.f65652) {
                if (this.f65658 || i != this.f65656 || abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
                    throw new IOException("HTML preview owner is unavailable");
                }
                AbstractC13921 abstractC13921 = this.f65652;
                boolean z = abstractC13921 instanceof AbstractC3163;
                if (z) {
                    abstractC13921.mo7646(false);
                }
                interfaceC17889Mo7638 = this.f65652.mo7638(this.f65659);
                if (interfaceC17889Mo7638 != null) {
                    C15688 c15688 = (C15688) interfaceC17889Mo7638;
                    if (c15688.mo36969() && ((!this.f65648 && !z) || !c15688.mo36978())) {
                    }
                }
                throw new IOException("MHTML source is unavailable");
            }
            inputStreamMo7636 = this.f65652.mo7636(abstractActivityC3346, interfaceC17889Mo7638);
            if (inputStreamMo7636 == null) {
                throw new IOException("MHTML source was not opened");
            }
        }
        return inputStreamMo7636;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m46663(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m46663(boolean z) {
        int i;
        C23157[] c23157Arr;
        ParcelFileDescriptor[] parcelFileDescriptorArr;
        synchronized (this.f65650) {
            this.f65658 = z | this.f65658;
            this.f65656++;
            c23157Arr = (C23157[]) this.f65649.toArray(new C23157[0]);
            this.f65649.clear();
            parcelFileDescriptorArr = (ParcelFileDescriptor[]) this.f65655.toArray(new ParcelFileDescriptor[0]);
        }
        for (C23157 c23157 : c23157Arr) {
            c23157.close();
        }
        for (ParcelFileDescriptor parcelFileDescriptor : parcelFileDescriptorArr) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            this.f65655.remove(parcelFileDescriptor);
        }
    }
}
