package l;

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
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.ۖۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2346 extends AbstractC13921 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f7531;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C15750 f7532;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13052 f7533;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f7534;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f7535;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Map f7536;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f7537;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f7538;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IInArchive f7539;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7651(IInArchive iInArchive) {
        if (iInArchive == null) {
            return;
        }
        IInArchive iInArchive2 = this.f7539;
        if (iInArchive2 == null) {
            this.f7539 = iInArchive;
        } else if (iInArchive2 != iInArchive) {
            C0349.m1793(iInArchive);
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo7654() {
        return "archive";
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized IInArchive m7659() {
        IInArchive iInArchive = this.f7539;
        if (iInArchive != null) {
            this.f7539 = null;
            return iInArchive;
        }
        return m7658();
    }

    public C2346(String str, Collection collection) {
        AtomicLong atomicLong = new AtomicLong();
        this.f7531 = atomicLong;
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        this.f7538 = abstractC15440M39866;
        this.f7532 = new C15750(abstractC15440M39866, collection, atomicLong);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2346 m7631(C12951 c12951) {
        C2346 c2346M7634 = m7634(c12951);
        if (c12951.available() == 0) {
            return c2346M7634;
        }
        throw new IllegalArgumentException("Trailing archive source files metadata");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2346 m7634(C12951 c12951) {
        C2346 c2346 = new C2346(c12951.m31506(), Collections.EMPTY_LIST);
        String strM31506 = c12951.m31506();
        if (!strM31506.isEmpty()) {
            C10395.m26217(c2346.f7538.mo23554(), strM31506);
        }
        if (c12951.available() < 4 || c12951.m31500() != 1397117505) {
            return c2346;
        }
        if (c12951.available() < 8) {
            throw new IllegalArgumentException("Truncated archive source files metadata");
        }
        c12951.readInt();
        int i = c12951.readInt();
        if (i <= 0 || i > 10000) {
            throw new IllegalArgumentException(C19370.m44628(i, "Invalid archive source file count: "));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayList.add(C16999.m39866(c12951.m31506(), new String[0]));
            } catch (IndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Truncated archive source files metadata", e);
            }
        }
        c2346.f7532 = new C15750(c2346.f7538, arrayList, c2346.f7531);
        return c2346;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7644(AbstractC15440 abstractC15440) {
        this.f7532.m37147(abstractC15440);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7646(boolean z) {
        List list = Collections.EMPTY_LIST;
        AtomicLong atomicLong = this.f7531;
        AbstractC15440 abstractC15440 = this.f7538;
        C15750 c15750 = new C15750(abstractC15440, list, atomicLong);
        IInArchive iInArchiveM25034 = C9924.m25034(abstractC15440, new C10813(c15750));
        try {
            m7633(iInArchiveM25034, c15750);
        } catch (Throwable th) {
            C0349.m1793(iInArchiveM25034);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7647(C8383 c8383) {
        List list = Collections.EMPTY_LIST;
        AbstractC15440 abstractC15440 = this.f7538;
        C15750 c15750 = new C15750(abstractC15440, list, this.f7531);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C9924.m25035(null, abstractC15440, new C16456(this, c15750, atomicBoolean, c8383));
        return !atomicBoolean.get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7645(IInArchive iInArchive) {
        m7633(iInArchive, (C15750) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m7633(IInArchive iInArchive, C15750 c15750) {
        int numberOfItems = iInArchive.getNumberOfItems();
        ArrayList arrayList = new ArrayList(numberOfItems);
        HashMap map = new HashMap(numberOfItems);
        boolean z = false;
        for (int i = 0; i < numberOfItems; i++) {
            C4007 c4007M12071 = C4007.m12071(iInArchive, i);
            arrayList.add(c4007M12071);
            map.put(c4007M12071.m12082(), c4007M12071);
        }
        List listUnmodifiableList = C20195.unmodifiableList(arrayList);
        Map mapUnmodifiableMap = C20195.unmodifiableMap(map);
        C13052 c13052 = new C13052(arrayList);
        if (numberOfItems > 1) {
            Object archiveProperty = iInArchive.getArchiveProperty(PropID.SOLID);
            if ((archiveProperty instanceof Boolean) && ((Boolean) archiveProperty).booleanValue()) {
                z = true;
            }
        }
        long jMo23117 = this.f7538.mo23117();
        IInArchive iInArchive2 = this.f7539;
        this.f7537 = listUnmodifiableList;
        this.f7536 = mapUnmodifiableMap;
        this.f7533 = c13052;
        this.f7539 = iInArchive;
        this.f7535 = z;
        this.f7534 = jMo23117;
        if (c15750 != null) {
            this.f7532 = c15750;
        }
        if (iInArchive2 != null) {
            C0349.m1793(iInArchive2);
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream mo7636(final AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) throws IOException {
        final C4007 c4007M25859 = ((C10231) interfaceC17889).m25859();
        int iMin = (int) Math.min(1048576L, interfaceC17889.getSize());
        if (iMin < 1024) {
            iMin = 1024;
        }
        C9742 c9742 = new C9742(iMin);
        final InterfaceC10405 interfaceC10405M52568 = C23852.m52568(c9742.m24728());
        final C17868 c17868 = new C17868();
        C1802.f6208.submit(new Runnable() { // from class: l.֫ۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C2346 c2346 = this.f5733;
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                C4007 c4007 = c4007M25859;
                C17868 c17869 = c17868;
                InterfaceC10405 interfaceC10405 = interfaceC10405M52568;
                try {
                    try {
                        int iM12080 = c4007.m12080();
                        C18390.m42815(abstractActivityC3347, new int[]{iM12080}, new C14339(c2346, c17869, interfaceC10405));
                        C0349.m1793(interfaceC10405);
                        c17869.f54564 = true;
                    } catch (Throwable th) {
                        C0349.m1793(interfaceC10405);
                        c17869.f54564 = true;
                        throw th;
                    }
                } catch (IOException e) {
                    c17869.f54563 = e;
                    C0349.m1793(interfaceC10405);
                    c17869.f54564 = true;
                } catch (Throwable th2) {
                    c17869.f54563 = new IOException(th2);
                    C0349.m1793(interfaceC10405);
                    c17869.f54564 = true;
                }
            }
        });
        while (!c17868.f54565) {
            IOException iOException = c17868.f54563;
            if (iOException != null) {
                throw iOException;
            }
            if (c17868.f54562) {
                return null;
            }
            if (c17868.f54564) {
                break;
            }
        }
        IOException iOException2 = c17868.f54563;
        if (iOException2 != null) {
            throw iOException2;
        }
        if (c17868.f54562) {
            return null;
        }
        return C23852.m52567(c9742.m24729()).mo12307();
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7640(Set set, InterfaceC23094 interfaceC23094) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C4488 c4488 = new C4488(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            C4007 c4007M25859 = ((C10231) interfaceC17889).m25859();
            if (c4007M25859.m12076()) {
                try {
                    interfaceC23094.mo8530(interfaceC17889, null);
                } catch (Throwable th) {
                    if (!interfaceC23094.mo8531(th instanceof IOException ? th : new IOException(th))) {
                        return;
                    }
                }
            } else {
                c4488.mo2318(c4007M25859.m12080(), interfaceC17889);
            }
        }
        new RunnableC20691(this, c4488, executorServiceNewSingleThreadExecutor, interfaceC23094).run();
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7641(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889, InterfaceC3569 interfaceC3569) {
        m7642(abstractActivityC3346, interfaceC17889, interfaceC3569, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7642(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889, InterfaceC3569 interfaceC3569, boolean z) {
        C18390.m42815(abstractActivityC3346, new int[]{((C10231) interfaceC17889).m25859().m12080()}, new C9402(this, z, interfaceC3569));
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 mo7638(String str) {
        if (this.f7536 == null) {
            mo7646(false);
        }
        C4007 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C10231(entry);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("archive".getBytes());
        C14460.m34528(messageDigest, this.f7538.mo23554());
        messageDigest.update(String.valueOf(this.f7534).getBytes());
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f7536 == null) {
            mo7646(false);
        }
        if (C2568.f8121) {
            str = C16014.m37867(str, "/7z/");
        }
        List listM4937 = this.f7533.m4937(str.substring(1));
        ArrayList arrayList = new ArrayList(listM4937.size() + 1);
        Iterator it = listM4937.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10231((C4007) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final IInArchive m7658() {
        C15750 c15750 = this.f7532;
        C11003.requireNonNull(c15750);
        return C9924.m25034(this.f7538, new C10813(c15750));
    }

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final List m7657() {
        return this.f7537;
    }

    public final C4007 getEntry(String str) {
        Map map = this.f7536;
        if (map == null) {
            return null;
        }
        C4007 c4007 = (C4007) map.get(str);
        return (c4007 == null && str.endsWith("/")) ? (C4007) this.f7533.m4933(str) : c4007;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m7650() {
        return this.f7538.mo23554();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m7648() {
        return this.f7538;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m7655() {
        return C15750.m37149(this.f7532);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m7656() {
        return C15750.m37150(this.f7532);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7643(C10130 c10130) {
        List listM37146 = C15750.m37146(this.f7532);
        c10130.m25439(this.f7538.mo23554());
        c10130.m25439(C10395.m26212(this.f7538.mo23554()));
        c10130.writeInt(1397117505);
        c10130.writeInt(listM37146.size());
        Iterator it = listM37146.iterator();
        while (it.hasNext()) {
            c10130.m25439(((C8696) it.next()).m22478().mo23554());
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List m7649() {
        return C15750.m37146(this.f7532);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo7652() {
        if (this.f7536 == null) {
            try {
                mo7646(false);
            } catch (IOException unused) {
            }
        }
        return this.f7535;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m7653() {
        return this.f7534 != this.f7538.mo23117();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m7635() {
        return this.f7538.mo23120();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IInArchive iInArchive = this.f7539;
        if (iInArchive != null) {
            C0349.m1793(iInArchive);
            this.f7539 = null;
        }
    }
}
