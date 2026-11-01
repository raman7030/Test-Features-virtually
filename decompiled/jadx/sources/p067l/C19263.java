package p067l;

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
public final class C19263 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f57563;

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC11402 f57566;

    /* JADX INFO: renamed from: ۚ */
    public int f57567;

    /* JADX INFO: renamed from: ۜ */
    public boolean f57568;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC22753 f57571;

    /* JADX INFO: renamed from: ܳ */
    public final C18426 f57572;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC3669 f57574;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC16716 f57575;

    /* JADX INFO: renamed from: ᩳ */
    public C17750 f57576;

    /* JADX INFO: renamed from: ᩴ */
    public final HashSet f57577;

    /* JADX INFO: renamed from: ᩷ */
    public long f57579;

    /* JADX INFO: renamed from: ۢ */
    public final C24812 f57570 = new C24812();

    /* JADX INFO: renamed from: ֫ */
    public final C14298 f57564 = new C14298();

    /* JADX INFO: renamed from: ᩵ */
    public final ArrayList f57578 = new ArrayList();

    /* JADX INFO: renamed from: ۖ */
    public final SparseArray f57565 = new SparseArray();

    /* JADX INFO: renamed from: ܺ */
    public final C17921 f57573 = new C17921();

    /* JADX INFO: renamed from: ᩻ */
    public final C5221 f57580 = new C5221();

    /* JADX INFO: renamed from: ۡ */
    public final C23128 f57569 = new C23128(0, 0);

    public C19263(C18426 c18426, InterfaceC16716 interfaceC16716) {
        this.f57572 = c18426;
        this.f57575 = interfaceC16716;
        new C23128(2, 0);
        this.f57577 = new HashSet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43895(Uri uri) {
        int iMo7075;
        InterfaceC22753 interfaceC22753Mo8449 = this.f57575.mo8449();
        C6659 c6659 = new C6659();
        c6659.m15164(uri);
        c6659.m15169(0L);
        c6659.m15162(6);
        C5318 c5318M15161 = c6659.m15161();
        C24812 c24812 = this.f57570;
        C23877.m52960(!this.f57568);
        this.f57568 = true;
        this.f57579 = c5318M15161.f12521;
        this.f57571 = interfaceC22753Mo8449;
        C17750 c17750 = new C17750(this.f57571, 0L, interfaceC22753Mo8449.mo4020(c5318M15161));
        InterfaceC3669[] interfaceC3669ArrM41998 = this.f57572.m41998();
        InterfaceC3669 interfaceC3669 = interfaceC3669ArrM41998[0];
        Throwable e = null;
        try {
            if (interfaceC3669.mo7079(c17750)) {
                c17750.mo24036();
            } else {
                c17750.mo24036();
                interfaceC3669 = null;
            }
        } catch (EOFException unused) {
        } catch (Throwable th) {
            c17750.mo24036();
            throw th;
        }
        if (interfaceC3669 != null) {
            interfaceC3669.mo7078(new C15278(this));
            boolean z = true;
            while (z) {
                try {
                    iMo7075 = interfaceC3669.mo7075(c17750, c24812);
                } catch (Exception | OutOfMemoryError e2) {
                    e = e2;
                    iMo7075 = -1;
                }
                boolean z2 = !this.f57563 || this.f57567 < this.f57565.size() || this.f57566 == null;
                if (e != null || (z2 && iMo7075 == -1)) {
                    m43899();
                    throw C10998.m25387(e != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e);
                }
                if (iMo7075 == 1) {
                    c17750 = m43883(c24812.f79276);
                }
                z = z2;
            }
            this.f57576 = c17750;
            this.f57574 = interfaceC3669;
            return;
        }
        String str = "None of the available extractors (" + C8876.m20480(", ").m20482((Iterable) C9468.m21989(AbstractC16192.m36882(interfaceC3669ArrM41998), new C7775())) + ") could read the stream.";
        InterfaceC22753 interfaceC22753 = this.f57571;
        interfaceC22753.getClass();
        interfaceC22753.mo4021().getClass();
        throw new C13608(str, AbstractC16192.m36872of());
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m43899() {
        SparseArray sparseArray;
        int i = 0;
        while (true) {
            sparseArray = this.f57565;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C9244) sparseArray.valueAt(i)).m14123();
            i++;
        }
        sparseArray.clear();
        InterfaceC3669 interfaceC3669 = this.f57574;
        if (interfaceC3669 != null) {
            interfaceC3669.mo7076();
            this.f57574 = null;
        }
        this.f57576 = null;
        C10685.m24613(this.f57571);
        this.f57571 = null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m43900() {
        return this.f57578.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final MediaFormat m43893(int i) {
        C3840 c3840 = (C3840) this.f57578.get(i);
        MediaFormat mediaFormatM7536 = c3840.m7536(this.f57580, this.f57569);
        long j = c3840.f8243.f25067;
        if (j != -9223372036854775807L) {
            mediaFormatM7536.setLong("durationUs", j);
            return mediaFormatM7536;
        }
        InterfaceC11402 interfaceC11402 = this.f57566;
        if (interfaceC11402 != null && interfaceC11402.mo8953() != -9223372036854775807L) {
            mediaFormatM7536.setLong("durationUs", this.f57566.mo8953());
        }
        return mediaFormatM7536;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43897(int i) {
        this.f57577.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43894() {
        if (m43887()) {
            m43891();
            m43887();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43892(ByteBuffer byteBuffer) {
        if (!m43887()) {
            return -1;
        }
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
        C23128 c23128 = this.f57569;
        c23128.f72704 = byteBuffer;
        C12558 c12558M40745 = this.f57573.m40745();
        c12558M40745.getClass();
        C9244 c9244 = ((C3840) this.f57578.get(c12558M40745.f35283)).f8243;
        C5221 c5221 = this.f57580;
        int iM14116 = c9244.m14116(c5221, c23128, 1, false);
        if (iM14116 == -5) {
            iM14116 = c9244.m14116(c5221, c23128, 1, false);
        }
        c5221.m11196();
        C23877.m52960(iM14116 == -4);
        byteBuffer.flip();
        byteBuffer.position(0);
        c23128.f72704 = null;
        return byteBuffer.remaining();
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m43898() {
        if (m43887()) {
            return this.f57573.m40745().f35282;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43896() {
        if (m43887()) {
            return this.f57573.m40745().f35281;
        }
        return -1;
    }

    @EnsuresNonNullIf(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    /* JADX INFO: renamed from: ܳ */
    private boolean m43887() {
        C24812 c24812 = this.f57570;
        boolean z = false;
        while (true) {
            C17921 c17921 = this.f57573;
            if (!c17921.m40744()) {
                C12558 c12558M40745 = c17921.m40745();
                c12558M40745.getClass();
                if (this.f57577.contains(Integer.valueOf(c12558M40745.f35283))) {
                    return true;
                }
                m43891();
            } else {
                if (z) {
                    return false;
                }
                try {
                    InterfaceC3669 interfaceC3669 = this.f57574;
                    interfaceC3669.getClass();
                    C17750 c17750 = this.f57576;
                    c17750.getClass();
                    int iMo7075 = interfaceC3669.mo7075(c17750, c24812);
                    if (iMo7075 == -1) {
                        z = true;
                    } else if (iMo7075 == 1) {
                        this.f57576 = m43883(c24812.f79276);
                    }
                } catch (Exception | OutOfMemoryError e) {
                    C21334.m48350("Treating exception as the end of input.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m43891() {
        C3840 c3840 = (C3840) this.f57578.get(this.f57573.m40746().f35283);
        if (c3840.f8242) {
            return;
        }
        C9244 c9244 = c3840.f8243;
        c9244.m14136(1);
        c9244.m14128();
    }

    /* JADX INFO: renamed from: ֫ */
    private C17750 m43883(long j) {
        InterfaceC22753 interfaceC22753 = this.f57571;
        interfaceC22753.getClass();
        Uri uriMo4021 = interfaceC22753.mo4021();
        uriMo4021.getClass();
        C10685.m24613(interfaceC22753);
        long j2 = this.f57579 + j;
        C6659 c6659 = new C6659();
        c6659.m15164(uriMo4021);
        c6659.m15169(j2);
        c6659.m15162(6);
        long jMo4020 = interfaceC22753.mo4020(c6659.m15161());
        if (jMo4020 != -1) {
            jMo4020 += j;
        }
        return new C17750(interfaceC22753, j, jMo4020);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43884(C19263 c19263, C9244 c9244, C10307 c10307) {
        c19263.f57567++;
        ArrayList arrayList = c19263.f57578;
        c9244.m21294(arrayList.size());
        arrayList.add(new C3840(c9244, false, null));
        String strM52066 = C23404.m52066(c10307);
        if (strM52066 != null) {
            c9244.m21295(arrayList.size());
            arrayList.add(new C3840(c9244, true, strM52066));
        }
    }
}
