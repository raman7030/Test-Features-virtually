package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11518 extends AbstractC13921 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12223 f34398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f34399;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f34400;

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ */
    public final String mo7654() {
        return "compress";
    }

    public C11518(String str) {
        this.f34400 = C16999.m39866(str, new String[0]);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
        long jM37679;
        EnumC15915 enumC15915;
        AbstractC15440 abstractC15440 = this.f34400;
        C23411 c23411M36513 = abstractC15440.m36513("r");
        try {
            byte[] bArrM37678 = EnumC15915.m37678();
            int i = 0;
            int iMo21175 = c23411M36513.mo21175(0, bArrM37678.length, bArrM37678);
            String strM36517 = abstractC15440.m36517();
            long jMo23127 = abstractC15440.mo23127();
            long jMo23117 = abstractC15440.mo23117();
            EnumC15915[] enumC15915ArrValues = EnumC15915.values();
            int length = enumC15915ArrValues.length;
            while (true) {
                if (i >= length) {
                    jM37679 = -1;
                    enumC15915 = null;
                    break;
                }
                EnumC15915 enumC15916 = enumC15915ArrValues[i];
                if (enumC15916.m37682(bArrM37678, iMo21175)) {
                    jM37679 = enumC15916.m37679(c23411M36513);
                    enumC15915 = enumC15916;
                    break;
                }
                i++;
            }
            long j = jM37679;
            if (enumC15915 == null) {
                throw new IOException("Unknown format file: " + abstractC15440.mo23554());
            }
            this.f34398 = new C12223(strM36517, j, jMo23127, jMo23117, enumC15915);
            this.f34399 = jMo23117;
            c23411M36513.close();
        } catch (Throwable th) {
            try {
                c23411M36513.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) throws IOException {
        InputStream inputStreamMo27926 = this.f34400.mo27926();
        try {
            return ((C12223) interfaceC17889).m29722().m37680(inputStreamMo27926);
        } catch (IOException e) {
            inputStreamMo27926.close();
            throw e;
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19404 mo28347(InterfaceC17889 interfaceC17889) throws IOException {
        AbstractC15440 abstractC15440 = this.f34400;
        C19277 c19277 = new C19277(abstractC15440.mo23127());
        C5873 c5873 = new C5873(abstractC15440.mo27926(), c19277);
        try {
            return new C19404(((C12223) interfaceC17889).m29722().m37680(c5873), c19277, false);
        } catch (IOException e) {
            c5873.close();
            throw e;
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7641(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889, InterfaceC3569 interfaceC3569) throws IOException {
        C19404 c19404Mo28347 = mo28347(interfaceC17889);
        try {
            c19404Mo28347.m44686().m44459(new C17951(interfaceC3569));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int i = c19404Mo28347.read(bArr);
                if (i == -1) {
                    c19404Mo28347.close();
                    return;
                }
                interfaceC3569.mo10874(i, bArr);
            } while (!interfaceC3569.mo1526());
            c19404Mo28347.close();
        } catch (Throwable th) {
            try {
                c19404Mo28347.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        if (this.f34398 == null) {
            mo7646(false);
        }
        C12223 c12223 = this.f34398;
        if (c12223 == null || !str.equals(c12223.getPath())) {
            return null;
        }
        return this.f34398;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("compress".getBytes());
        C14460.m34528(messageDigest, this.f34400.mo23554());
        messageDigest.update(String.valueOf(this.f34399).getBytes());
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f34398 == null) {
            mo7646(false);
        }
        ArrayList arrayList = new ArrayList(2);
        if (this.f34398 != null && (str.isEmpty() || str.equals("/"))) {
            arrayList.add(this.f34398);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12223 m28349() {
        return this.f34398;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        c10130.m25439(this.f34400.mo23554());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m28348() {
        return this.f34400.mo23554();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m28350() {
        return this.f34400;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m28352() {
        return this.f34399 != this.f34400.mo23117();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m28351() {
        return this.f34400.mo23120();
    }
}
