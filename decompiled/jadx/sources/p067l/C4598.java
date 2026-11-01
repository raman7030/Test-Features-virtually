package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.ۖۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4598 extends AbstractC15599 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final AtomicLong f10322;

    /* JADX INFO: renamed from: ۙ */
    public volatile C17337 f10323;

    /* JADX INFO: renamed from: ۛ */
    public C14773 f10324;

    /* JADX INFO: renamed from: ۤ */
    public long f10325;

    /* JADX INFO: renamed from: ۨ */
    public boolean f10326;

    /* JADX INFO: renamed from: ۫ */
    public Map f10327;

    /* JADX INFO: renamed from: ۬ */
    public List f10328;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC17043 f10329;

    /* JADX INFO: renamed from: ᩹ */
    public IInArchive f10330;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m9722(IInArchive iInArchive) {
        if (iInArchive == null) {
            return;
        }
        IInArchive iInArchive2 = this.f10330;
        if (iInArchive2 == null) {
            this.f10330 = iInArchive;
        } else if (iInArchive2 != iInArchive) {
            C2700.m4192(iInArchive);
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return "archive";
    }

    /* JADX INFO: renamed from: ᩹ */
    public final synchronized IInArchive m9730() {
        IInArchive iInArchive = this.f10330;
        if (iInArchive != null) {
            this.f10330 = null;
            return iInArchive;
        }
        return m9729();
    }

    public C4598(String str, Collection collection) {
        AtomicLong atomicLong = new AtomicLong();
        this.f10322 = atomicLong;
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        this.f10329 = abstractC17043M42109;
        this.f10323 = new C17337(abstractC17043M42109, collection, atomicLong);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4598 m9702(C14677 c14677) {
        C4598 c4598M9705 = m9705(c14677);
        if (c14677.available() == 0) {
            return c4598M9705;
        }
        throw new IllegalArgumentException("Trailing archive source files metadata");
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4598 m9705(C14677 c14677) {
        C4598 c4598 = new C4598(c14677.m33593(), Collections.EMPTY_LIST);
        String strM33593 = c14677.m33593();
        if (!strM33593.isEmpty()) {
            C12248.m28246(c4598.f10329.mo25505(), strM33593);
        }
        if (c14677.available() < 4 || c14677.m33587() != 1397117505) {
            return c4598;
        }
        if (c14677.available() < 8) {
            throw new IllegalArgumentException("Truncated archive source files metadata");
        }
        c14677.readInt();
        int i = c14677.readInt();
        if (i <= 0 || i > 10000) {
            throw new IllegalArgumentException(C20778.m46922(i, "Invalid archive source file count: "));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayList.add(C18524.m42109(c14677.m33593(), new String[0]));
            } catch (IndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Truncated archive source files metadata", e);
            }
        }
        c4598.f10323 = new C17337(c4598.f10329, arrayList, c4598.f10322);
        return c4598;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9715(AbstractC17043 abstractC17043) {
        this.f10323.m39317(abstractC17043);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        List list = Collections.EMPTY_LIST;
        AtomicLong atomicLong = this.f10322;
        AbstractC17043 abstractC17043 = this.f10329;
        C17337 c17337 = new C17337(abstractC17043, list, atomicLong);
        IInArchive iInArchiveM27051 = C11801.m27051(abstractC17043, new C12645(c17337));
        try {
            m9704(iInArchiveM27051, c17337);
        } catch (Throwable th) {
            C2700.m4192(iInArchiveM27051);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9718(C10336 c10336) {
        List list = Collections.EMPTY_LIST;
        AbstractC17043 abstractC17043 = this.f10329;
        C17337 c17337 = new C17337(abstractC17043, list, this.f10322);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C11801.m27052(null, abstractC17043, new C18008(this, c17337, atomicBoolean, c10336));
        return !atomicBoolean.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9716(IInArchive iInArchive) {
        m9704(iInArchive, (C17337) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m9704(IInArchive iInArchive, C17337 c17337) {
        int numberOfItems = iInArchive.getNumberOfItems();
        ArrayList arrayList = new ArrayList(numberOfItems);
        HashMap map = new HashMap(numberOfItems);
        boolean z = false;
        for (int i = 0; i < numberOfItems; i++) {
            C6177 c6177M13991 = C6177.m13991(iInArchive, i);
            arrayList.add(c6177M13991);
            map.put(c6177M13991.m14002(), c6177M13991);
        }
        List listUnmodifiableList = C21562.unmodifiableList(arrayList);
        Map mapUnmodifiableMap = C21562.unmodifiableMap(map);
        C14773 c14773 = new C14773(arrayList);
        if (numberOfItems > 1) {
            Object archiveProperty = iInArchive.getArchiveProperty(PropID.SOLID);
            if ((archiveProperty instanceof Boolean) && ((Boolean) archiveProperty).booleanValue()) {
                z = true;
            }
        }
        long jMo25091 = this.f10329.mo25091();
        IInArchive iInArchive2 = this.f10330;
        this.f10328 = listUnmodifiableList;
        this.f10327 = mapUnmodifiableMap;
        this.f10324 = c14773;
        this.f10330 = iInArchive;
        this.f10326 = z;
        this.f10325 = jMo25091;
        if (c17337 != null) {
            this.f10323 = c17337;
        }
        if (iInArchive2 != null) {
            C2700.m4192(iInArchive2);
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(final AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) throws IOException {
        final C6177 c6177M27881 = ((C12092) interfaceC19370).m27881();
        int iMin = (int) Math.min(1048576L, interfaceC19370.getSize());
        if (iMin < 1024) {
            iMin = 1024;
        }
        C11627 c11627 = new C11627(iMin);
        final InterfaceC12257 interfaceC12257M54977 = C25037.m54977(c11627.m26742());
        final C19350 c19350 = new C19350();
        C4081.f8987.submit(new Runnable() { // from class: l.֫ۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C4598 c4598 = this.f8513;
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                C6177 c6177 = c6177M27881;
                C19350 c19351 = c19350;
                InterfaceC12257 interfaceC12257 = interfaceC12257M54977;
                try {
                    try {
                        int iM14000 = c6177.m14000();
                        C19847.m45087(abstractActivityC55410, new int[]{iM14000}, new C15996(c4598, c19351, interfaceC12257));
                        C2700.m4192(interfaceC12257);
                        c19351.f57762 = true;
                    } catch (Throwable th) {
                        C2700.m4192(interfaceC12257);
                        c19351.f57762 = true;
                        throw th;
                    }
                } catch (IOException e) {
                    c19351.f57761 = e;
                    C2700.m4192(interfaceC12257);
                    c19351.f57762 = true;
                } catch (Throwable th2) {
                    c19351.f57761 = new IOException(th2);
                    C2700.m4192(interfaceC12257);
                    c19351.f57762 = true;
                }
            }
        });
        while (!c19350.f57763) {
            IOException iOException = c19350.f57761;
            if (iOException != null) {
                throw iOException;
            }
            if (c19350.f57760) {
                return null;
            }
            if (c19350.f57762) {
                break;
            }
        }
        IOException iOException2 = c19350.f57761;
        if (iOException2 != null) {
            throw iOException2;
        }
        if (c19350.f57760) {
            return null;
        }
        return C25037.m54976(c11627.m26743()).mo14212();
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9711(Set set, InterfaceC24317 interfaceC24317) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C6634 c6634 = new C6634(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            C6177 c6177M27881 = ((C12092) interfaceC19370).m27881();
            if (c6177M27881.m13996()) {
                try {
                    interfaceC24317.mo10593(interfaceC19370, null);
                } catch (Throwable th) {
                    if (!interfaceC24317.mo10594(th instanceof IOException ? th : new IOException(th))) {
                        return;
                    }
                }
            } else {
                c6634.mo4686(c6177M27881.m14000(), interfaceC19370);
            }
        }
        new RunnableC22033(this, c6634, executorServiceNewSingleThreadExecutor, interfaceC24317).run();
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9712(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370, InterfaceC5761 interfaceC5761) {
        m9713(abstractActivityC5549, interfaceC19370, interfaceC5761, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9713(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370, InterfaceC5761 interfaceC5761, boolean z) {
        C19847.m45087(abstractActivityC5549, new int[]{((C12092) interfaceC19370).m27881().m14000()}, new C11304(this, z, interfaceC5761));
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        if (this.f10327 == null) {
            mo9717(false);
        }
        C6177 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C12092(entry);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update("archive".getBytes());
        C16111.m36662(messageDigest, this.f10329.mo25505());
        messageDigest.update(String.valueOf(this.f10325).getBytes());
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        if (this.f10327 == null) {
            mo9717(false);
        }
        if (C4809.f10911) {
            str = C17588.m40053(str, "/7z/");
        }
        List listM7180 = this.f10324.m7180(str.substring(1));
        ArrayList arrayList = new ArrayList(listM7180.size() + 1);
        Iterator it = listM7180.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12092((C6177) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final IInArchive m9729() {
        C17337 c17337 = this.f10323;
        C12826.requireNonNull(c17337);
        return C11801.m27051(this.f10329, new C12645(c17337));
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public final List m9728() {
        return this.f10328;
    }

    public final C6177 getEntry(String str) {
        Map map = this.f10327;
        if (map == null) {
            return null;
        }
        C6177 c6177 = (C6177) map.get(str);
        return (c6177 == null && str.endsWith("/")) ? (C6177) this.f10324.m7176(str) : c6177;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m9721() {
        return this.f10329.mo25505();
    }

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC17043 m9719() {
        return this.f10329;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final List m9726() {
        return C17337.m39319(this.f10323);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final long m9727() {
        return C17337.m39320(this.f10323);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
        List listM39316 = C17337.m39316(this.f10323);
        c11996.m27459(this.f10329.mo25505());
        c11996.m27459(C12248.m28241(this.f10329.mo25505()));
        c11996.writeInt(1397117505);
        c11996.writeInt(listM39316.size());
        Iterator it = listM39316.iterator();
        while (it.hasNext()) {
            c11996.m27459(((C10633) it.next()).m24447().mo25505());
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final List m9720() {
        return C17337.m39316(this.f10323);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo9723() {
        if (this.f10327 == null) {
            try {
                mo9717(false);
            } catch (IOException unused) {
            }
        }
        return this.f10326;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m9724() {
        return this.f10325 != this.f10329.mo25091();
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m9706() {
        return this.f10329.mo25094();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IInArchive iInArchive = this.f10330;
        if (iInArchive != null) {
            C2700.m4192(iInArchive);
            this.f10330 = null;
        }
    }
}
