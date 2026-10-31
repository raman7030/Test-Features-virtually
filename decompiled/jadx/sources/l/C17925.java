package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩳ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C17925 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C16513 f54748;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f54749;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Uri f54750;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f54751;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23713 f54752;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16431 f54753;

    public C17925(Uri uri, C16431 c16431, InterfaceC15097 interfaceC15097, C16513 c16513, C23713 c23713, boolean z) {
        this.f54750 = uri;
        this.f54753 = c16431;
        this.f54749 = interfaceC15097;
        this.f54748 = c16513;
        this.f54752 = c23713;
        this.f54751 = z;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17925 m41935(InterfaceC17889 interfaceC17889, AbstractC13921 abstractC13921) throws Throwable {
        C23713 c23713;
        InterfaceC15097 c23362;
        boolean z = abstractC13921 instanceof AbstractC3163;
        if (!z && !(abstractC13921 instanceof C2499)) {
            throw new C20748("HLS thumbnails require a local or network visitor");
        }
        C16431 c16431 = null;
        C23713 c23713M47730 = z ? C20892.m47730(C4925.m14335()) : null;
        try {
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{interfaceC17889}[0];
            C11003.requireNonNull(obj);
            arrayList.add(obj);
            C17843 c17843 = new C17843(0, C20195.unmodifiableList(arrayList));
            C16431 c16432 = new C16431(null, abstractC13921, c17843, EnumC10788.HLS_DIRECT, c23713M47730);
            try {
                Uri uri = c17843.mo16333().f33612.f35426;
                String string = c23713M47730 == null ? UUID.randomUUID().toString() : c23713M47730.m52286();
                if (z) {
                    c16431 = c16432;
                    c23713 = c23713M47730;
                    try {
                        c23362 = new C23362(c23713M47730, c16432, new C6324(c16432, c23713M47730), C20892.m47732(), EnumC16306.f50166, new C9915(), null);
                    } catch (Error e) {
                        e = e;
                        if (c16431 != null) {
                            c16431.m38742();
                            c16431.m38740();
                        }
                        if (c23713 != null) {
                            c23713.close();
                        }
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (c16431 != null) {
                            c16431.m38742();
                            c16431.m38740();
                        }
                        if (c23713 != null) {
                            c23713.close();
                        }
                        throw e;
                    }
                } else {
                    c16431 = c16432;
                    c23713 = c23713M47730;
                    c23362 = c16431;
                }
                return new C17925(uri, c16431, c23362, new C16513(c16431, abstractC13921, string), c23713, z);
            } catch (Error | RuntimeException e3) {
                e = e3;
                c16431 = c16432;
                c23713 = c23713M47730;
                if (c16431 != null) {
                    c16431.m38742();
                    c16431.m38740();
                }
                if (c23713 != null) {
                    c23713.close();
                }
                throw e;
            }
        } catch (Error e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 m41936() {
        C23713 c23713;
        boolean z = this.f54751;
        C16431 c16431 = this.f54753;
        return (!z || (c23713 = this.f54752) == null || c23713.m52288() == null) ? c16431 : new C9315(c23713, new C14601(c16431), c16431, new C19462());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C23713 c23713 = this.f54752;
        try {
            C16431 c16431 = this.f54753;
            c16431.m38742();
            c16431.m38740();
        } finally {
            if (c23713 != null) {
                c23713.close();
            }
        }
    }
}
