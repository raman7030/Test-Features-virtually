package p067l;

import android.os.SystemClock;
import android.util.Log;
import android.util.SparseLongArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֡ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2917 {

    /* JADX INFO: renamed from: ֫ */
    public final C2582 f5046;

    /* JADX INFO: renamed from: ۖ */
    public final C12828 f5047;

    /* JADX INFO: renamed from: ۜ */
    public final C12828 f5049;

    /* JADX INFO: renamed from: ۢ */
    public volatile boolean f5051;

    /* JADX INFO: renamed from: ۧ */
    public C20353 f5052;

    /* JADX INFO: renamed from: ܳ */
    public final C12828 f5053;

    /* JADX INFO: renamed from: ܽ */
    public final ConcurrentMapC12768 f5055;

    /* JADX INFO: renamed from: ܿ */
    public final C12828 f5056;

    /* JADX INFO: renamed from: ᩳ */
    public final C14121 f5057;

    /* JADX INFO: renamed from: ᩷ */
    public final ConcurrentMapC12768 f5058;

    /* JADX INFO: renamed from: ᩻ */
    public final C4050 f5059;

    /* JADX INFO: renamed from: ۘ */
    public final AtomicInteger f5048 = new AtomicInteger();

    /* JADX INFO: renamed from: ܺ */
    public final AtomicInteger f5054 = new AtomicInteger();

    /* JADX INFO: renamed from: ۡ */
    public final AtomicInteger f5050 = new AtomicInteger();

    public C2917(C14121 c14121) throws IOException {
        ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
        this.f5058 = concurrentMapC12768;
        C4050 c4050NewKeySet = ConcurrentMapC12768.newKeySet();
        this.f5059 = c4050NewKeySet;
        this.f5055 = new ConcurrentMapC12768();
        this.f5046 = new C2582();
        this.f5057 = c14121;
        C12828 c12828 = new C12828(c14121.m38424(), "smali");
        this.f5056 = c12828;
        if (c12828.m29402().mo25093()) {
            c12828.m29395();
        }
        c12828.m29402().m38666();
        C12828 c12829 = new C12828(c12828, "x");
        this.f5047 = c12829;
        C12828 c128210 = new C12828(c12828, "y");
        this.f5049 = c128210;
        this.f5053 = new C12828(c12828, "f");
        if (!C14009.m31809(c12828.m29402())) {
            m4738();
        } else {
            try {
                SparseLongArray sparseLongArray = new SparseLongArray();
                m4727(c12829, true, sparseLongArray);
                m4727(c128210, false, sparseLongArray);
                m4734();
                if (concurrentMapC12768.isEmpty() && c4050NewKeySet.isEmpty()) {
                    m4738();
                }
            } catch (IOException unused) {
                m4738();
            }
        }
        this.f5052 = new C20353(this);
    }

    /* JADX INFO: renamed from: ܳ */
    private void m4734() throws IOException {
        C12828 c12828 = this.f5053;
        if (c12828.m29398()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c12828.m29396()));
            while (dataInputStream.available() > 0) {
                try {
                    this.f5059.add(C14009.m31807(dataInputStream));
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dataInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4727(C12828 c12828, boolean z, SparseLongArray sparseLongArray) throws IOException {
        String strM31807;
        long jMo25101;
        if (c12828.m29398()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c12828.m29396()));
            while (dataInputStream.available() > 0) {
                try {
                    if (!z) {
                        strM31807 = C14009.m31807(dataInputStream);
                    } else {
                        strM31807 = dataInputStream.readUTF();
                    }
                    int unsignedShort = dataInputStream.readUnsignedShort();
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    int iIndexOfKey = sparseLongArray.indexOfKey(unsignedShort);
                    if (iIndexOfKey >= 0) {
                        jMo25101 = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        AbstractC17043 abstractC17043M29392 = this.f5056.m29392(String.valueOf(unsignedShort));
                        if (!abstractC17043M29392.mo25093()) {
                            throw new IOException("Missing smali cache data file");
                        }
                        jMo25101 = abstractC17043M29392.mo25101();
                        sparseLongArray.put(unsignedShort, jMo25101);
                    }
                    if (i >= 0 && i2 > 0 && ((long) i) + ((long) i2) <= jMo25101) {
                        this.f5058.put(strM31807, new C21024(unsignedShort, i, i2));
                    } else {
                        throw new IOException("Invalid smali cache offset");
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dataInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m4738() throws IOException {
        this.f5058.clear();
        this.f5059.clear();
        this.f5055.clear();
        C12828 c12828 = this.f5056;
        C12828[] c12828ArrM29397 = c12828.m29397();
        if (c12828ArrM29397 != null) {
            for (C12828 c12829 : c12828ArrM29397) {
                if (c12829.m29398() && !c12829.m29395()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C14009.m31812(c12828.m29402());
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m4731(String str) {
        return (this.f5058.containsKey(str) || this.f5059.contains(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4740(ActivityC18686 activityC18686) {
        AbstractC9381 lifecycle = activityC18686.getLifecycle();
        final AtomicReference atomicReference = activityC18686.f55795;
        if (lifecycle.mo21805() == EnumC15415.DESTROYED) {
            return;
        }
        lifecycle.mo21806(new C6271(this));
        this.f5052.m45929();
        this.f5051 = false;
        final int iIncrementAndGet = this.f5048.incrementAndGet();
        final C22103 c22103 = (C22103) lifecycle;
        Thread thread = new Thread(new Runnable() { // from class: l.ۢᩳۢ
            @Override // java.lang.Runnable
            public final void run() {
                C2917.m4724(this.f32469, iIncrementAndGet, c22103, atomicReference);
            }
        });
        thread.setName("SmaliCache-1");
        thread.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4724(final C2917 c2917, int i, C22103 c22103, AtomicReference atomicReference) {
        C20353 c20353 = c2917.f5052;
        System.out.println("SmaliCache prepare");
        AtomicInteger atomicInteger = c2917.f5054;
        atomicInteger.incrementAndGet();
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (C19486 c19486 : c2917.f5057.m32124()) {
                if (c19486.f59365 != null) {
                    i2++;
                    if (c19486.f59368 == null && c2917.m4731(c19486.f59366)) {
                        arrayList.add(c19486);
                    }
                }
            }
            Collections.sort(arrayList, C19486.f59363);
            C20689 c20689 = new C20689(i2);
            c20689.m46753(new C10965());
            c20689.m46754(i2 - arrayList.size());
            final C17669 c17669 = new C17669(c2917, new AtomicInteger(), arrayList, i, c22103, atomicReference, c20689);
            int i3 = C19110.f57020 >= 4 ? 3 : 2;
            for (int i4 = 2; i4 <= i3; i4++) {
                final int i5 = i4 - 1;
                Thread thread = new Thread(new Runnable() { // from class: l.ۖᩳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2917.m4726(this.f11229, c17669, i5);
                    }
                });
                thread.setName("SmaliCache-" + i4);
                thread.start();
            }
            c17669.accept(0);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c20353.m45929();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4725(C2917 c2917, AtomicInteger atomicInteger, ArrayList arrayList, int i, C22103 c22103, AtomicReference atomicReference, C20689 c20689, int i2) {
        System.out.println(Thread.currentThread().getName() + " start");
        C14679 c14679 = new C14679();
        while (true) {
            int andIncrement = atomicInteger.getAndIncrement();
            if (andIncrement >= arrayList.size()) {
                System.out.println(Thread.currentThread().getName() + " finish");
                return;
            }
            C19486 c19486 = (C19486) arrayList.get(andIncrement);
            if (c2917.f5048.get() != i || c22103.mo21805() == EnumC15415.DESTROYED) {
                System.out.println(Thread.currentThread().getName() + " canceled");
                return;
            }
            if (c2917.f5051 || !c22103.mo21805().m35142(EnumC15415.RESUMED) || (i2 > 0 && atomicReference.get() != C25026.class)) {
                System.out.println(Thread.currentThread().getName() + " paused");
                c2917.f5050.incrementAndGet();
                while (true) {
                    if (!c2917.f5051 && c22103.mo21805().m35142(EnumC15415.RESUMED) && (i2 <= 0 || atomicReference.get() == C25026.class)) {
                        break;
                    }
                    if (c2917.f5048.get() != i || c22103.mo21805() == EnumC15415.DESTROYED) {
                        System.out.println(Thread.currentThread().getName() + " canceled");
                        return;
                    }
                    SystemClock.sleep(500L);
                }
                c2917.f5050.decrementAndGet();
                System.out.println(Thread.currentThread().getName() + " resumed");
            }
            if (i2 == 0 && atomicReference.get() != C25026.class) {
                long jFreeMemory = Runtime.getRuntime().freeMemory();
                if (jFreeMemory < 262144) {
                    SystemClock.sleep(250L);
                } else if (jFreeMemory < 524288) {
                    SystemClock.sleep(100L);
                } else if (jFreeMemory < 1048576) {
                    SystemClock.sleep(50L);
                } else if (jFreeMemory < 2097152) {
                    SystemClock.sleep(10L);
                }
            }
            if (c2917.m4731(c19486.f59366)) {
                try {
                    c2917.m4729(c19486, c14679);
                } catch (Throwable unused) {
                }
            }
            c20689.m46754(1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4726(C2917 c2917, C17669 c17669, int i) {
        C20353 c20353 = c2917.f5052;
        AtomicInteger atomicInteger = c2917.f5054;
        atomicInteger.incrementAndGet();
        try {
            c17669.accept(i);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c20353.m45929();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4729(C19486 c19486, C14679 c14679) throws IOException {
        C15230 c15230M33606 = c14679.m33606();
        try {
            m4728(c19486, c15230M33606);
            c15230M33606.close();
            String str = c19486.f59366;
            if (m4731(str)) {
                if (!c14679.m33607()) {
                    c14679.m33601();
                    if (m4731(str)) {
                        this.f5052.m45928(str, c14679);
                        return;
                    }
                    return;
                }
                C20353 c20353 = this.f5052;
                synchronized (c20353) {
                    try {
                        if (c20353.f62842.f5058.containsKey(str) || c20353.f62842.f5059.contains(str)) {
                            return;
                        }
                        try {
                            if (c20353.f62847 == null) {
                                c20353.f62847 = new C5173(c20353.f62842.f5053.m29402().mo25506(true));
                            }
                            C5173 c5173 = c20353.f62847;
                            C14009.m31808(c5173, C7855.m18152(str));
                            C7855.m18155(c5173, str);
                            c20353.f62847.flush();
                            c20353.f62842.f5059.add(str);
                        } catch (IOException e) {
                            c20353.m45929();
                            throw e;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                c15230M33606.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4741(C19486 c19486, C23948 c23948) {
        try {
            C21024 c21024 = (C21024) this.f5058.get(c19486.f59366);
            if (c21024 != null) {
                m4730(c19486, c21024, c23948);
                return;
            }
        } catch (IOException unused) {
        }
        try {
            m4728(c19486, (Writer) c23948);
        } catch (Throwable th) {
            c23948.m53044();
            c23948.append((CharSequence) Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4730(C19486 c19486, C21024 c21024, C23948 c23948) throws IOException {
        int i;
        byte[] bArrM38664;
        String str = c19486.f59366;
        int i2 = c21024.f65993;
        Reference reference = (Reference) this.f5055.get(Integer.valueOf(i2));
        byte[] bArr = reference != null ? (byte[]) reference.get() : null;
        if (bArr == null) {
            synchronized (this.f5055) {
                try {
                    Reference reference2 = (Reference) this.f5055.get(Integer.valueOf(i2));
                    bArrM38664 = reference2 != null ? (byte[]) reference2.get() : null;
                    if (bArrM38664 == null) {
                        try {
                            bArrM38664 = this.f5056.m29392(String.valueOf(i2)).m38664();
                            this.f5055.put(Integer.valueOf(i2), new SoftReference(bArrM38664));
                        } catch (IOException unused) {
                            bArr = new byte[0];
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bArr = bArrM38664;
        }
        int i3 = c21024.f65995;
        if (i3 < 0 || (i = c21024.f65994) <= 0 || ((long) i3) + ((long) i) > bArr.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        C14679 c14679 = (C14679) this.f5046.m3892();
        if (c14679 == null) {
            c14679 = new C14679();
        }
        try {
            c14679.m33602(c21024.f65995, c21024.f65994, bArr);
            C7855.m18158(c14679.m33604(), c14679.m33608(), c23948);
        } finally {
            this.f5046.m3890(c14679);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4728(C19486 c19486, Writer writer) throws IOException {
        String name = c19486.f59365.getName();
        C14121 c14121 = this.f5057;
        C9952 c9952 = new C9952(c14121.m32126(name), c19486.f59364, c19486.f59369);
        if (c14121.m32109()) {
            writer.write("# ");
            writer.write(c19486.f59367);
            writer.write(".dex\n\n");
        }
        C22946.m51262(writer, c9952, c14121.m32125(c19486.f59367));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m4733(C2917 c2917, int i) {
        c2917.f5055.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m4722(C2917 c2917, int i) {
        return c2917.f5056.m29392(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4743() {
        this.f5048.incrementAndGet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4739() {
        this.f5051 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4742() {
        this.f5052.m45927();
        this.f5051 = false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m4745() {
        while (true) {
            AtomicInteger atomicInteger = this.f5054;
            if (atomicInteger.get() <= 0 || this.f5050.get() >= atomicInteger.get()) {
                return;
            } else {
                SystemClock.sleep(100L);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m4744() {
        if (this.f5054.get() > 0) {
            SystemClock.sleep(100L);
        }
    }
}
