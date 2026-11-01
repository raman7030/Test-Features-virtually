package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֫ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C4137 extends AbstractC24196 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ WeakReference f9123;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC19370 f9124;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractC15599 f9125;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f9126;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ String f9127;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ String f9128;

    /* JADX INFO: renamed from: ᩻ */
    public volatile boolean f9129;

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo8378() {
        return true;
    }

    public C4137(AbstractC15599 abstractC15599, InterfaceC19370 interfaceC19370, String str, String str2, String str3, WeakReference weakReference) {
        this.f9125 = abstractC15599;
        this.f9124 = interfaceC19370;
        this.f9126 = str;
        this.f9128 = str2;
        this.f9127 = str3;
        this.f9123 = weakReference;
        this.f9129 = (abstractC15599 instanceof AbstractC5375) && interfaceC19370.getTime() <= 0;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8376() {
        return !C8597.m20012(this.f9124);
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8382() {
        return this.f9126;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8379() {
        return this.f9128;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo8377() {
        return this.f9129;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo8380() throws IOException {
        throw new IOException("Visitor image source must be prepared before decoding");
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩵ */
    public final C13468 mo8381() throws IOException {
        C18218 c18218 = new C18218(this.f9125);
        try {
            InterfaceC19370 interfaceC19370M35470 = c18218.f54372.m35470(this.f9127);
            this.f9129 = (this.f9125 instanceof AbstractC5375) && ((C17278) interfaceC19370M35470).getTime() <= 0;
            StringBuilder sb = new StringBuilder(this.f9126);
            C19560.m44420(sb, c18218.f54372);
            C17278 c17278 = (C17278) interfaceC19370M35470;
            C13468 c13468 = new C13468(sb.toString(), Math.max(-1L, c17278.getSize()), c17278.getTime());
            c18218.close();
            return c13468;
        } catch (Throwable th) {
            try {
                c18218.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ֫ */
    public final void mo8375(OutputStream outputStream, boolean z, InterfaceC18588 interfaceC18588) throws IOException {
        InputStream inputStreamM52839;
        AbstractC24196.m53499(interfaceC18588);
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f9123.get();
        AbstractC15599 abstractC15599 = this.f9125;
        boolean z2 = z && ((abstractC15599 instanceof C20661) || (abstractC15599 instanceof C4598));
        if (z2 && (abstractActivityC5549 == null || abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed())) {
            throw new C14138();
        }
        C9760 c9760 = new C9760(interfaceC18588, z2, abstractActivityC5549);
        C18218 c18218 = new C18218(abstractC15599);
        AbstractC15599 abstractC155910 = c18218.f54372;
        try {
            AbstractC24196.m53499(c9760);
            InterfaceC19370 interfaceC19370M35470 = abstractC155910.m35470(this.f9127);
            if (abstractC155910 instanceof C20661) {
                C20661 c20661 = (C20661) abstractC155910;
                if (z) {
                    inputStreamM52839 = c20661.m46675(abstractActivityC5549, interfaceC19370M35470, c9760);
                } else {
                    inputStreamM52839 = C23775.m52839(((C14387) interfaceC19370M35470).m33002(), c20661.m46674(), c20661.m46682(), c20661.m46684(), null);
                }
                try {
                    AbstractC24196.m53499(c9760);
                    if (inputStreamM52839 == null) {
                        throw new C14138();
                    }
                    byte[] bArr = new byte[32768];
                    while (true) {
                        AbstractC24196.m53499(c9760);
                        int i = inputStreamM52839.read(bArr);
                        AbstractC24196.m53499(c9760);
                        if (i < 0) {
                            break;
                        } else if (i > 0) {
                            outputStream.write(bArr, 0, i);
                        }
                    }
                    inputStreamM52839.close();
                } catch (Throwable th) {
                    if (inputStreamM52839 != null) {
                        try {
                            inputStreamM52839.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                C12855 c12855 = new C12855(outputStream, c9760);
                if (abstractC155910 instanceof C4598) {
                    ((C4598) abstractC155910).m9713(abstractActivityC5549, interfaceC19370M35470, c12855, z);
                } else {
                    abstractC155910.mo9712(abstractActivityC5549, interfaceC19370M35470, c12855);
                }
                AbstractC24196.m53499(c9760);
                if (c12855.f36160) {
                    throw new C14138();
                }
            }
            c18218.close();
        } catch (Throwable th3) {
            try {
                c18218.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
