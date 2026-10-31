package l;

import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۨ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12011 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Thread f35959;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f35961;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35964;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final File f35965;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f35963 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f35960 = 268435456;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f35962 = 536870912;

    public C12011(File file) {
        this.f35965 = new File(file, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6366 m29378(AbstractC22967 abstractC22967, boolean z, InterfaceC17066 interfaceC17066) {
        m29376();
        if (this.f35964) {
            throw new IOException("Image source store is closed");
        }
        C11003.requireNonNull(abstractC22967);
        AbstractC22967.m51107(interfaceC17066);
        if (!z && !abstractC22967.mo6174()) {
            throw new C10268("Image source requires foreground preparation");
        }
        C11679 c11679Mo6179 = abstractC22967.mo6179();
        AbstractC22967.m51107(interfaceC17066);
        if (c11679Mo6179.f34804 > this.f35960) {
            throw new IOException("Image source exceeds the preparation byte limit");
        }
        File fileMo12024 = abstractC22967.mo12024();
        if (!abstractC22967.mo6176() || fileMo12024 != null) {
            return new C6366(this, abstractC22967, c11679Mo6179, fileMo12024, null);
        }
        m29372();
        File file = this.f35965;
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Could not create image source directory");
        }
        File fileCreateTempFile = File.createTempFile("source-", ".part", file);
        C10600 c10600 = new C10600();
        c10600.f31813 = fileCreateTempFile;
        this.f35963.add(c10600);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(c10600.f31813);
            try {
                abstractC22967.mo6173(new C12716(this, c10600, interfaceC17066, fileOutputStream), z, interfaceC17066);
                AbstractC22967.m51107(interfaceC17066);
                fileOutputStream.flush();
                fileOutputStream.close();
                long j = c11679Mo6179.f34804;
                if (j >= 0 && c10600.f31812 != j) {
                    throw new IOException("Image source ended with a different length than its metadata");
                }
                abstractC22967.m51108(c11679Mo6179);
                AbstractC22967.m51107(interfaceC17066);
                File file2 = new File(file, c10600.f31813.getName().replace(".part", ".image"));
                if (!c10600.f31813.renameTo(file2)) {
                    throw new IOException("Could not publish prepared image source");
                }
                c10600.f31813 = file2;
                return new C6366(this, abstractC22967, c11679Mo6179, file2, c10600);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c10600.f31814 = true;
            m29372();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29373(C12011 c12011, C10600 c10600, int i, InterfaceC17066 interfaceC17066) {
        AbstractC22967.m51107(interfaceC17066);
        long j = i;
        long j2 = c12011.f35960;
        long j3 = c10600.f31812;
        if (j <= j2 - j3) {
            long j4 = c12011.f35962;
            long j5 = c12011.f35961;
            if (j <= j4 - j5) {
                c10600.f31812 = j3 + j;
                c12011.f35961 = j5 + j;
                return;
            }
        }
        throw new IOException("Image source preparation budget exhausted");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m29372() {
        ArrayList arrayList = this.f35963;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C10600 c10600 = (C10600) arrayList.get(size);
            if (c10600.f31814 && (!c10600.f31813.exists() || c10600.f31813.delete())) {
                this.f35961 -= c10600.f31812;
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m29376() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Image source store requires a worker thread");
        }
        Thread thread = this.f35959;
        if (thread == null) {
            this.f35959 = Thread.currentThread();
        } else if (thread != Thread.currentThread()) {
            throw new IllegalStateException("Image source store accessed from another worker");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m29376();
        this.f35964 = true;
        ArrayList arrayList = this.f35963;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C10600) it.next()).f31814 = true;
        }
        m29372();
        if (arrayList.isEmpty()) {
            File file = this.f35965;
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
