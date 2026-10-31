package l;

import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ᩳۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes4.dex */
public final class C17777 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f54369;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC9505 f54372;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f54373;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f54374;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f54377;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16895 f54378;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC1368 f54380;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f54381;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16184 f54382;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f54383;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f54385;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23615 f54376 = new C23615();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12552 f54370 = new C12552();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f54384 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SparseArray f54371 = new SparseArray();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16365 f54379 = new C16365();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3002 f54386 = new C3002();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C21843 f54375 = new C21843(0, 0);

    public C17777(C16895 c16895, InterfaceC15097 interfaceC15097) {
        this.f54378 = c16895;
        this.f54381 = interfaceC15097;
        new C21843(2, 0);
        this.f54383 = new HashSet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41649(Uri uri) {
        int iMo4837;
        InterfaceC21449 interfaceC21449Mo6247 = this.f54381.mo6247();
        C4515 c4515 = new C4515();
        c4515.m13281(uri);
        c4515.m13286(0L);
        c4515.m13279(6);
        C3104 c3104M13278 = c4515.m13278();
        C23615 c23615 = this.f54376;
        C22632.m50634(!this.f54374);
        this.f54374 = true;
        this.f54385 = c3104M13278.f9718;
        this.f54377 = interfaceC21449Mo6247;
        C16184 c16184 = new C16184(this.f54377, 0L, interfaceC21449Mo6247.mo1620(c3104M13278));
        InterfaceC1368[] interfaceC1368ArrM39757 = this.f54378.m39757();
        InterfaceC1368 interfaceC1368 = interfaceC1368ArrM39757[0];
        Throwable e = null;
        try {
            if (interfaceC1368.mo4841(c16184)) {
                c16184.mo22066();
            } else {
                c16184.mo22066();
                interfaceC1368 = null;
            }
        } catch (EOFException unused) {
        } catch (Throwable th) {
            c16184.mo22066();
            throw th;
        }
        if (interfaceC1368 != null) {
            interfaceC1368.mo4840(new C13584(this));
            boolean z = true;
            while (z) {
                try {
                    iMo4837 = interfaceC1368.mo4837(c16184, c23615);
                } catch (Exception | OutOfMemoryError e2) {
                    e = e2;
                    iMo4837 = -1;
                }
                boolean z2 = !this.f54369 || this.f54373 < this.f54371.size() || this.f54372 == null;
                if (e != null || (z2 && iMo4837 == -1)) {
                    m41653();
                    throw C9080.m23440(e != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e);
                }
                if (iMo4837 == 1) {
                    c16184 = m41637(c23615.f76532);
                }
                z = z2;
            }
            this.f54382 = c16184;
            this.f54380 = interfaceC1368;
            return;
        }
        String str = "None of the available extractors (" + C6847.m18531(", ").m18533((Iterable) C7470.m20014(AbstractC14545.m34733(interfaceC1368ArrM39757), new C5688())) + ") could read the stream.";
        InterfaceC21449 interfaceC21449 = this.f54377;
        interfaceC21449.getClass();
        interfaceC21449.mo1621().getClass();
        throw new C11826(str, AbstractC14545.of());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m41653() {
        SparseArray sparseArray;
        int i = 0;
        while (true) {
            sparseArray = this.f54371;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C7235) sparseArray.valueAt(i)).m12202();
            i++;
        }
        sparseArray.clear();
        InterfaceC1368 interfaceC1368 = this.f54380;
        if (interfaceC1368 != null) {
            interfaceC1368.mo4838();
            this.f54380 = null;
        }
        this.f54382 = null;
        C8751.m22643(this.f54377);
        this.f54377 = null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41654() {
        return this.f54384.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaFormat m41647(int i) {
        C1549 c1549 = (C1549) this.f54384.get(i);
        MediaFormat mediaFormatM5307 = c1549.m5307(this.f54386, this.f54375);
        long j = c1549.f5462.f22184;
        if (j != -9223372036854775807L) {
            mediaFormatM5307.setLong("durationUs", j);
            return mediaFormatM5307;
        }
        InterfaceC9505 interfaceC9505 = this.f54372;
        if (interfaceC9505 != null && interfaceC9505.mo6827() != -9223372036854775807L) {
            mediaFormatM5307.setLong("durationUs", this.f54372.mo6827());
        }
        return mediaFormatM5307;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41651(int i) {
        this.f54383.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41648() {
        if (m41641()) {
            m41645();
            m41641();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41646(ByteBuffer byteBuffer) {
        if (!m41641()) {
            return -1;
        }
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
        C21843 c21843 = this.f54375;
        c21843.f69995 = byteBuffer;
        C10722 c10722M38528 = this.f54379.m38528();
        c10722M38528.getClass();
        C7235 c7235 = ((C1549) this.f54384.get(c10722M38528.f32309)).f5462;
        C3002 c3002 = this.f54386;
        int iM12195 = c7235.m12195(c3002, c21843, 1, false);
        if (iM12195 == -5) {
            iM12195 = c7235.m12195(c3002, c21843, 1, false);
        }
        c3002.m9145();
        C22632.m50634(iM12195 == -4);
        byteBuffer.flip();
        byteBuffer.position(0);
        c21843.f69995 = null;
        return byteBuffer.remaining();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m41652() {
        if (m41641()) {
            return this.f54379.m38528().f32308;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41650() {
        if (m41641()) {
            return this.f54379.m38528().f32307;
        }
        return -1;
    }

    @EnsuresNonNullIf(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m41641() {
        C23615 c23615 = this.f54376;
        boolean z = false;
        while (true) {
            C16365 c16365 = this.f54379;
            if (!c16365.m38527()) {
                C10722 c10722M38528 = c16365.m38528();
                c10722M38528.getClass();
                if (this.f54383.contains(Integer.valueOf(c10722M38528.f32309))) {
                    return true;
                }
                m41645();
            } else {
                if (z) {
                    return false;
                }
                try {
                    InterfaceC1368 interfaceC1368 = this.f54380;
                    interfaceC1368.getClass();
                    C16184 c16184 = this.f54382;
                    c16184.getClass();
                    int iMo4837 = interfaceC1368.mo4837(c16184, c23615);
                    if (iMo4837 == -1) {
                        z = true;
                    } else if (iMo4837 == 1) {
                        this.f54382 = m41637(c23615.f76532);
                    }
                } catch (Exception | OutOfMemoryError e) {
                    C19956.m46036("Treating exception as the end of input.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m41645() {
        C1549 c1549 = (C1549) this.f54384.get(this.f54379.m38529().f32309);
        if (c1549.f5461) {
            return;
        }
        C7235 c7235 = c1549.f5462;
        c7235.m12215(1);
        c7235.m12207();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16184 m41637(long j) {
        InterfaceC21449 interfaceC21449 = this.f54377;
        interfaceC21449.getClass();
        Uri uriMo1621 = interfaceC21449.mo1621();
        uriMo1621.getClass();
        C8751.m22643(interfaceC21449);
        long j2 = this.f54385 + j;
        C4515 c4515 = new C4515();
        c4515.m13281(uriMo1621);
        c4515.m13286(j2);
        c4515.m13279(6);
        long jMo1620 = interfaceC21449.mo1620(c4515.m13278());
        if (jMo1620 != -1) {
            jMo1620 += j;
        }
        return new C16184(interfaceC21449, j, jMo1620);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41638(C17777 c17777, C7235 c7235, C8353 c8353) {
        c17777.f54373++;
        ArrayList arrayList = c17777.f54384;
        c7235.m19345(arrayList.size());
        arrayList.add(new C1549(c7235, false, null));
        String strM49728 = C22134.m49728(c8353);
        if (strM49728 != null) {
            c7235.m19346(arrayList.size());
            arrayList.add(new C1549(c7235, true, strM49728));
        }
    }
}
