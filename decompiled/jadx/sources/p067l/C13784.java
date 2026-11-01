package p067l;

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
public final class C13784 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public Thread f38969;

    /* JADX INFO: renamed from: ۫ */
    public long f38971;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f38974;

    /* JADX INFO: renamed from: ᩹ */
    public final File f38975;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f38973 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public final long f38970 = 268435456;

    /* JADX INFO: renamed from: ۬ */
    public final long f38972 = 536870912;

    public C13784(File file) {
        this.f38975 = new File(file, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8419 m31438(AbstractC24196 abstractC24196, boolean z, InterfaceC18588 interfaceC18588) {
        m31436();
        if (this.f38974) {
            throw new IOException("Image source store is closed");
        }
        C12826.requireNonNull(abstractC24196);
        AbstractC24196.m53499(interfaceC18588);
        if (!z && !abstractC24196.mo8376()) {
            throw new C12127("Image source requires foreground preparation");
        }
        C13468 c13468Mo8381 = abstractC24196.mo8381();
        AbstractC24196.m53499(interfaceC18588);
        if (c13468Mo8381.f37803 > this.f38970) {
            throw new IOException("Image source exceeds the preparation byte limit");
        }
        File fileMo13948 = abstractC24196.mo13948();
        if (!abstractC24196.mo8378() || fileMo13948 != null) {
            return new C8419(this, abstractC24196, c13468Mo8381, fileMo13948, null);
        }
        m31432();
        File file = this.f38975;
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Could not create image source directory");
        }
        File fileCreateTempFile = File.createTempFile("source-", ".part", file);
        C12443 c12443 = new C12443();
        c12443.f34784 = fileCreateTempFile;
        this.f38973.add(c12443);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(c12443.f34784);
            try {
                abstractC24196.mo8375(new C14454(this, c12443, interfaceC18588, fileOutputStream), z, interfaceC18588);
                AbstractC24196.m53499(interfaceC18588);
                fileOutputStream.flush();
                fileOutputStream.close();
                long j = c13468Mo8381.f37803;
                if (j >= 0 && c12443.f34783 != j) {
                    throw new IOException("Image source ended with a different length than its metadata");
                }
                abstractC24196.m53500(c13468Mo8381);
                AbstractC24196.m53499(interfaceC18588);
                File file2 = new File(file, c12443.f34784.getName().replace(".part", ".image"));
                if (!c12443.f34784.renameTo(file2)) {
                    throw new IOException("Could not publish prepared image source");
                }
                c12443.f34784 = file2;
                return new C8419(this, abstractC24196, c13468Mo8381, file2, c12443);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c12443.f34785 = true;
            m31432();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31433(C13784 c13784, C12443 c12443, int i, InterfaceC18588 interfaceC18588) {
        AbstractC24196.m53499(interfaceC18588);
        long j = i;
        long j2 = c13784.f38970;
        long j3 = c12443.f34783;
        if (j <= j2 - j3) {
            long j4 = c13784.f38972;
            long j5 = c13784.f38971;
            if (j <= j4 - j5) {
                c12443.f34783 = j3 + j;
                c13784.f38971 = j5 + j;
                return;
            }
        }
        throw new IOException("Image source preparation budget exhausted");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m31432() {
        ArrayList arrayList = this.f38973;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C12443 c12443 = (C12443) arrayList.get(size);
            if (c12443.f34785 && (!c12443.f34784.exists() || c12443.f34784.delete())) {
                this.f38971 -= c12443.f34783;
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m31436() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Image source store requires a worker thread");
        }
        Thread thread = this.f38969;
        if (thread == null) {
            this.f38969 = Thread.currentThread();
        } else if (thread != Thread.currentThread()) {
            throw new IllegalStateException("Image source store accessed from another worker");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m31436();
        this.f38974 = true;
        ArrayList arrayList = this.f38973;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C12443) it.next()).f34785 = true;
        }
        m31432();
        if (arrayList.isEmpty()) {
            File file = this.f38975;
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
