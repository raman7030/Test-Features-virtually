package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֫ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1861 extends AbstractC22967 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f6342;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f6343;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13921 f6344;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6345;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6346;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6347;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile boolean f6348;

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean mo6176() {
        return true;
    }

    public C1861(AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889, String str, String str2, String str3, WeakReference weakReference) {
        this.f6344 = abstractC13921;
        this.f6343 = interfaceC17889;
        this.f6345 = str;
        this.f6347 = str2;
        this.f6346 = str3;
        this.f6342 = weakReference;
        this.f6348 = (abstractC13921 instanceof AbstractC3163) && interfaceC17889.getTime() <= 0;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo6174() {
        return !C6554.m18062(this.f6343);
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String mo6180() {
        return this.f6345;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo6177() {
        return this.f6347;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo6175() {
        return this.f6348;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InputStream mo6178() throws IOException {
        throw new IOException("Visitor image source must be prepared before decoding");
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C11679 mo6179() throws IOException {
        C16677 c16677 = new C16677(this.f6344);
        try {
            InterfaceC17889 interfaceC17889M33351 = c16677.f51187.m33351(this.f6346);
            this.f6348 = (this.f6344 instanceof AbstractC3163) && ((C15688) interfaceC17889M33351).getTime() <= 0;
            StringBuilder sb = new StringBuilder(this.f6345);
            C18089.m42161(sb, c16677.f51187);
            C15688 c15688 = (C15688) interfaceC17889M33351;
            C11679 c11679 = new C11679(sb.toString(), Math.max(-1L, c15688.getSize()), c15688.getTime());
            c16677.close();
            return c11679;
        } catch (Throwable th) {
            try {
                c16677.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6173(OutputStream outputStream, boolean z, InterfaceC17066 interfaceC17066) throws IOException {
        InputStream inputStreamM50497;
        AbstractC22967.m51107(interfaceC17066);
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f6342.get();
        AbstractC13921 abstractC13921 = this.f6344;
        boolean z2 = z && ((abstractC13921 instanceof C19247) || (abstractC13921 instanceof C2346));
        if (z2 && (abstractActivityC3346 == null || abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed())) {
            throw new C12384();
        }
        C7777 c7777 = new C7777(interfaceC17066, z2, abstractActivityC3346);
        C16677 c16677 = new C16677(abstractC13921);
        AbstractC13921 abstractC13922 = c16677.f51187;
        try {
            AbstractC22967.m51107(c7777);
            InterfaceC17889 interfaceC17889M33351 = abstractC13922.m33351(this.f6346);
            if (abstractC13922 instanceof C19247) {
                C19247 c19247 = (C19247) abstractC13922;
                if (z) {
                    inputStreamM50497 = c19247.m44381(abstractActivityC3346, interfaceC17889M33351, c7777);
                } else {
                    inputStreamM50497 = C22523.m50497(((C12645) interfaceC17889M33351).m30924(), c19247.m44380(), c19247.m44388(), c19247.m44390(), null);
                }
                try {
                    AbstractC22967.m51107(c7777);
                    if (inputStreamM50497 == null) {
                        throw new C12384();
                    }
                    byte[] bArr = new byte[32768];
                    while (true) {
                        AbstractC22967.m51107(c7777);
                        int i = inputStreamM50497.read(bArr);
                        AbstractC22967.m51107(c7777);
                        if (i < 0) {
                            break;
                        } else if (i > 0) {
                            outputStream.write(bArr, 0, i);
                        }
                    }
                    inputStreamM50497.close();
                } catch (Throwable th) {
                    if (inputStreamM50497 != null) {
                        try {
                            inputStreamM50497.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                C11034 c11034 = new C11034(outputStream, c7777);
                if (abstractC13922 instanceof C2346) {
                    ((C2346) abstractC13922).m7642(abstractActivityC3346, interfaceC17889M33351, c11034, z);
                } else {
                    abstractC13922.mo7641(abstractActivityC3346, interfaceC17889M33351, c11034);
                }
                AbstractC22967.m51107(c7777);
                if (c11034.f33165) {
                    throw new C12384();
                }
            }
            c16677.close();
        } catch (Throwable th3) {
            try {
                c16677.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
