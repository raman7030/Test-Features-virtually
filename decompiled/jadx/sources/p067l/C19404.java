package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩳ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C19404 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C18062 f57945;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16716 f57946;

    /* JADX INFO: renamed from: ۬ */
    public final Uri f57947;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f57948;

    /* JADX INFO: renamed from: ᩸ */
    public final C24905 f57949;

    /* JADX INFO: renamed from: ᩹ */
    public final C17984 f57950;

    public C19404(Uri uri, C17984 c17984, InterfaceC16716 interfaceC16716, C18062 c18062, C24905 c24905, boolean z) {
        this.f57947 = uri;
        this.f57950 = c17984;
        this.f57946 = interfaceC16716;
        this.f57945 = c18062;
        this.f57949 = c24905;
        this.f57948 = z;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX INFO: renamed from: ֫ */
    public static C19404 m44184(InterfaceC19370 interfaceC19370, AbstractC15599 abstractC15599) throws Throwable {
        C24905 c24905;
        InterfaceC16716 c24571;
        boolean z = abstractC15599 instanceof AbstractC5375;
        if (!z && !(abstractC15599 instanceof C4744)) {
            throw new C22087("HLS thumbnails require a local or network visitor");
        }
        C17984 c17984 = null;
        C24905 c24905M50060 = z ? C22224.m50060(C7050.m16232()) : null;
        try {
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{interfaceC19370}[0];
            C12826.requireNonNull(obj);
            arrayList.add(obj);
            C19326 c19326 = new C19326(0, C21562.unmodifiableList(arrayList));
            C17984 c17985 = new C17984(null, abstractC15599, c19326, EnumC12621.HLS_DIRECT, c24905M50060);
            try {
                Uri uri = c19326.mo18258().f36611.f38436;
                String string = c24905M50060 == null ? UUID.randomUUID().toString() : c24905M50060.m54689();
                if (z) {
                    c17984 = c17985;
                    c24905 = c24905M50060;
                    try {
                        c24571 = new C24571(c24905M50060, c17985, new C8379(c17985, c24905M50060), C22224.m50062(), EnumC17865.f53333, new C11792(), null);
                    } catch (Error e) {
                        e = e;
                        if (c17984 != null) {
                            c17984.m40967();
                            c17984.m40965();
                        }
                        if (c24905 != null) {
                            c24905.close();
                        }
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (c17984 != null) {
                            c17984.m40967();
                            c17984.m40965();
                        }
                        if (c24905 != null) {
                            c24905.close();
                        }
                        throw e;
                    }
                } else {
                    c17984 = c17985;
                    c24905 = c24905M50060;
                    c24571 = c17984;
                }
                return new C19404(uri, c17984, c24571, new C18062(c17984, abstractC15599, string), c24905, z);
            } catch (Error | RuntimeException e3) {
                e = e3;
                c17984 = c17985;
                c24905 = c24905M50060;
                if (c17984 != null) {
                    c17984.m40967();
                    c17984.m40965();
                }
                if (c24905 != null) {
                    c24905.close();
                }
                throw e;
            }
        } catch (Error e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16716 m44185() {
        C24905 c24905;
        boolean z = this.f57948;
        C17984 c17984 = this.f57950;
        return (!z || (c24905 = this.f57949) == null || c24905.m54691() == null) ? c17984 : new C11221(c24905, new C16245(c17984), c17984, new C20865());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C24905 c24905 = this.f57949;
        try {
            C17984 c17984 = this.f57950;
            c17984.m40967();
            c17984.m40965();
        } finally {
            if (c24905 != null) {
                c24905.close();
            }
        }
    }
}
