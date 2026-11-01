package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۛۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6X9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7848 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f20581;

    /* JADX INFO: renamed from: ۧ */
    public final Condition f20582;

    /* JADX INFO: renamed from: ܽ */
    public final ReentrantLock f20583;

    public C7848() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.f20583 = reentrantLock;
        this.f20582 = reentrantLock.newCondition();
        this.f20581 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11872 m18139(String str) {
        return m18135((Collection) Collections.singletonList(str), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11872 m18141(List list) {
        return m18135((Collection) list, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11872 m18142(String str) {
        return m18135((Collection) Collections.singletonList(str), true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11872 m18140(Collection collection) {
        return m18135(collection, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private C11872 m18135(Collection collection, boolean z) throws C5276 {
        ArrayList arrayList = new ArrayList(new LinkedHashSet(collection));
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            throw C5276.m11410("FILE_INVALID_PATH", "At least one path claim is required.");
        }
        ReentrantLock reentrantLock = this.f20583;
        reentrantLock.lock();
        while (m18136(arrayList, z)) {
            try {
                try {
                    this.f20582.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw C5276.m11405("FILE_OPERATION_INTERRUPTED", "File operation was interrupted while waiting for a path claim.");
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        C13883 c13883 = new C13883(arrayList, z);
        this.f20581.add(c13883);
        C11872 c11872 = new C11872(this, c13883);
        reentrantLock.unlock();
        return c11872;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m18136(ArrayList arrayList, boolean z) {
        for (C13883 c13883 : this.f20581) {
            if (z || c13883.f39205) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    for (String str2 : c13883.f39204) {
                        if (C14059.m31906(str, str2) || C14059.m31906(str2, str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
