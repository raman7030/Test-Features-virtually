package p067l;

import android.os.ParcelFileDescriptor;
import bin.p000mt.plus.R;
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
public final class C21696 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final boolean f68322;

    /* JADX INFO: renamed from: ۙ */
    public final HashSet f68323;

    /* JADX INFO: renamed from: ۛ */
    public final Object f68324;

    /* JADX INFO: renamed from: ۤ */
    public final AbstractC17043 f68325;

    /* JADX INFO: renamed from: ۨ */
    public final AbstractC15599 f68326;

    /* JADX INFO: renamed from: ۫ */
    public final Object f68327;

    /* JADX INFO: renamed from: ۬ */
    public final Semaphore f68328;

    /* JADX INFO: renamed from: ܰ */
    public final C4050 f68329;

    /* JADX INFO: renamed from: ᩶ */
    public volatile int f68330;

    /* JADX INFO: renamed from: ᩸ */
    public final WeakReference f68331;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f68332;

    /* JADX INFO: renamed from: ᩺ */
    public final String f68333;

    public C21696(ActivityC3244 activityC3244, AbstractC15599 abstractC15599, String str, boolean z) {
        this.f68329 = ConcurrentMapC12768.newKeySet();
        this.f68324 = new Object();
        this.f68323 = new HashSet();
        this.f68328 = new Semaphore(2, true);
        this.f68331 = new WeakReference(activityC3244);
        this.f68326 = abstractC15599;
        this.f68327 = abstractC15599 instanceof C4598 ? new Object() : abstractC15599;
        this.f68333 = str;
        this.f68322 = z;
        this.f68325 = null;
    }

    public C21696(ActivityC3244 activityC3244, AbstractC17043 abstractC17043) {
        this.f68329 = ConcurrentMapC12768.newKeySet();
        this.f68324 = new Object();
        this.f68323 = new HashSet();
        this.f68328 = new Semaphore(2, true);
        this.f68331 = new WeakReference(activityC3244);
        this.f68326 = null;
        this.f68327 = new Object();
        this.f68333 = null;
        this.f68322 = true;
        this.f68325 = abstractC17043;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0071  */
    /* JADX WARN: Code duplicated, block: B:64:0x0081  */
    /* JADX WARN: Code duplicated, block: B:77:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x006c: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:53:0x006c */
    /* JADX INFO: renamed from: ۧ */
    public static ParcelFileDescriptor m48987(final C21696 c21696) throws Throwable {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        final ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        boolean z2;
        ParcelFileDescriptor parcelFileDescriptor2;
        final int i = c21696.f68330;
        if (c21696.f68332) {
            throw new FileNotFoundException("HTML preview session is closed");
        }
        if (!c21696.f68328.tryAcquire()) {
            throw new FileNotFoundException("Too many open HTML preview streams");
        }
        try {
            try {
                parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                try {
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[1];
                    try {
                        synchronized (c21696.f68324) {
                            if (c21696.f68332 || i != c21696.f68330) {
                                throw new FileNotFoundException("HTML preview session is closed");
                            }
                            c21696.f68329.add(parcelFileDescriptor);
                        }
                        C4081.f8988.submit(new Runnable() { // from class: l.۠ᩳܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C21696.m48984(this.f28477, parcelFileDescriptor, i);
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
                                c21696.f68329.remove(parcelFileDescriptor);
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
                            c21696.f68328.release();
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
                        c21696.f68329.remove(parcelFileDescriptor);
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    if (parcelFileDescriptorArrCreatePipe != null) {
                    }
                    if (parcelFileDescriptor2 != null) {
                        parcelFileDescriptor2.close();
                    }
                    c21696.f68328.release();
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

    /* JADX INFO: renamed from: ֫ */
    public static void m48984(final C21696 c21696, ParcelFileDescriptor parcelFileDescriptor, final int i) {
        final AbstractActivityC5549 abstractActivityC5549;
        try {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    C24377 c24377M48988 = c21696.m48988(i);
                    try {
                        byte[] bArr = new byte[65536];
                        while (!c21696.f68332 && i == c21696.f68330) {
                            try {
                                int i2 = c24377M48988.read(bArr);
                                if (i2 == -1) {
                                    break;
                                } else {
                                    autoCloseOutputStream.write(bArr, 0, i2);
                                }
                            } catch (IOException e) {
                                e = e;
                                if ((c21696.f68326 instanceof AbstractC5375) && (abstractActivityC5549 = (AbstractActivityC5549) c21696.f68331.get()) != null) {
                                    abstractActivityC5549.runOnUiThread(new Runnable() { // from class: l.᩹ᩳܳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C21696.m48983(this.f75442, i, abstractActivityC5549);
                                        }
                                    });
                                }
                                throw e;
                            } catch (RuntimeException e2) {
                                e = e2;
                                if (c21696.f68326 instanceof AbstractC5375) {
                                    abstractActivityC5549.runOnUiThread(new Runnable() { // from class: l.᩹ᩳܳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C21696.m48983(this.f75442, i, abstractActivityC5549);
                                        }
                                    });
                                }
                                throw e;
                            }
                        }
                        c24377M48988.close();
                        autoCloseOutputStream.close();
                        c21696.f68329.remove(parcelFileDescriptor);
                        c21696.f68328.release();
                    } catch (Throwable th) {
                        try {
                            c24377M48988.close();
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
            c21696.f68329.remove(parcelFileDescriptor);
            c21696.f68328.release();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48983(C21696 c21696, int i, AbstractActivityC5549 abstractActivityC5549) {
        if (c21696.f68332 || i != c21696.f68330 || abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۧ */
    private C24377 m48988(final int i) throws IOException {
        C24377 c24377;
        if (this.f68326 instanceof AbstractC5375) {
            c24377 = new C24377(new InterfaceC13649() { // from class: l.ܶᩳܳ
                @Override // p067l.InterfaceC13649
                /* JADX INFO: renamed from: ֫ */
                public final InputStream mo31046() {
                    return this.f50269.m48980(i);
                }
            }, new Consumer() { // from class: l.᩸ᩳܳ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    C21696.m48985(this.f72422, (C24377) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
        } else {
            c24377 = new C24377(m48980(i), new Consumer() { // from class: l.᩸ᩳܳ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    C21696.m48985(this.f72422, (C24377) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
        }
        C24377 c24378 = c24377;
        synchronized (this.f68324) {
            if (!this.f68332 && i == this.f68330) {
                this.f68323.add(c24378);
                return c24378;
            }
            c24378.close();
            throw new IOException("HTML preview request was cancelled");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48985(C21696 c21696, C24377 c24377) {
        synchronized (c21696.f68324) {
            c21696.f68323.remove(c24377);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public InputStream m48980(int i) throws IOException {
        InterfaceC19370 interfaceC19370Mo9709;
        InputStream inputStreamMo9707;
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f68331.get();
        if (this.f68332 || i != this.f68330 || abstractActivityC5549 == null || abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
            throw new IOException("HTML preview owner is unavailable");
        }
        AbstractC17043 abstractC17043 = this.f68325;
        if (abstractC17043 != null) {
            return abstractC17043.mo29987();
        }
        if (this.f68326 == null || this.f68333 == null) {
            throw new IOException("MHTML source is unavailable");
        }
        synchronized (this.f68327) {
            synchronized (this.f68326) {
                if (this.f68332 || i != this.f68330 || abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
                    throw new IOException("HTML preview owner is unavailable");
                }
                AbstractC15599 abstractC15599 = this.f68326;
                boolean z = abstractC15599 instanceof AbstractC5375;
                if (z) {
                    abstractC15599.mo9717(false);
                }
                interfaceC19370Mo9709 = this.f68326.mo9709(this.f68333);
                if (interfaceC19370Mo9709 != null) {
                    C17278 c17278 = (C17278) interfaceC19370Mo9709;
                    if (c17278.mo39135() && ((!this.f68322 && !z) || !c17278.mo39144())) {
                    }
                }
                throw new IOException("MHTML source is unavailable");
            }
            inputStreamMo9707 = this.f68326.mo9707(abstractActivityC5549, interfaceC19370Mo9709);
            if (inputStreamMo9707 == null) {
                throw new IOException("MHTML source was not opened");
            }
        }
        return inputStreamMo9707;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m48986(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m48986(boolean z) {
        int i;
        C24377[] c24377Arr;
        ParcelFileDescriptor[] parcelFileDescriptorArr;
        synchronized (this.f68324) {
            this.f68332 = z | this.f68332;
            this.f68330++;
            c24377Arr = (C24377[]) this.f68323.toArray(new C24377[0]);
            this.f68323.clear();
            parcelFileDescriptorArr = (ParcelFileDescriptor[]) this.f68329.toArray(new ParcelFileDescriptor[0]);
        }
        for (C24377 c24377 : c24377Arr) {
            c24377.close();
        }
        for (ParcelFileDescriptor parcelFileDescriptor : parcelFileDescriptorArr) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            this.f68329.remove(parcelFileDescriptor);
        }
    }
}
