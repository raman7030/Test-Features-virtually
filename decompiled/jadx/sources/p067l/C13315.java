package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13315 extends AbstractC15599 {

    /* JADX INFO: renamed from: ۙ */
    public C13985 f37395;

    /* JADX INFO: renamed from: ᩶ */
    public long f37396;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC17043 f37397;

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return "compress";
    }

    public C13315(String str) {
        this.f37397 = C18524.m42109(str, new String[0]);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        long jM39853;
        EnumC17494 enumC17494;
        AbstractC17043 abstractC17043 = this.f37397;
        C24618 c24618M38671 = abstractC17043.m38671("r");
        try {
            byte[] bArrM39852 = EnumC17494.m39852();
            int i = 0;
            int iMo23140 = c24618M38671.mo23140(0, bArrM39852.length, bArrM39852);
            String strM38675 = abstractC17043.m38675();
            long jMo25101 = abstractC17043.mo25101();
            long jMo25091 = abstractC17043.mo25091();
            EnumC17494[] enumC17494ArrValues = EnumC17494.values();
            int length = enumC17494ArrValues.length;
            while (true) {
                if (i >= length) {
                    jM39853 = -1;
                    enumC17494 = null;
                    break;
                }
                EnumC17494 enumC17495 = enumC17494ArrValues[i];
                if (enumC17495.m39856(bArrM39852, iMo23140)) {
                    jM39853 = enumC17495.m39853(c24618M38671);
                    enumC17494 = enumC17495;
                    break;
                }
                i++;
            }
            long j = jM39853;
            if (enumC17494 == null) {
                throw new IOException("Unknown format file: " + abstractC17043.mo25505());
            }
            this.f37395 = new C13985(strM38675, j, jMo25101, jMo25091, enumC17494);
            this.f37396 = jMo25091;
            c24618M38671.close();
        } catch (Throwable th) {
            try {
                c24618M38671.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) throws IOException {
        InputStream inputStreamMo29987 = this.f37397.mo29987();
        try {
            return ((C13985) interfaceC19370).m31784().m39854(inputStreamMo29987);
        } catch (IOException e) {
            inputStreamMo29987.close();
            throw e;
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final C20810 mo30393(InterfaceC19370 interfaceC19370) throws IOException {
        AbstractC17043 abstractC17043 = this.f37397;
        C20689 c20689 = new C20689(abstractC17043.mo25101());
        C7950 c7950 = new C7950(abstractC17043.mo29987(), c20689);
        try {
            return new C20810(((C13985) interfaceC19370).m31784().m39854(c7950), c20689, false);
        } catch (IOException e) {
            c7950.close();
            throw e;
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9712(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370, InterfaceC5761 interfaceC5761) throws IOException {
        C20810 c20810Mo30393 = mo30393(interfaceC19370);
        try {
            c20810Mo30393.m46980().m46753(new C19429(interfaceC5761));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int i = c20810Mo30393.read(bArr);
                if (i == -1) {
                    c20810Mo30393.close();
                    return;
                }
                interfaceC5761.mo12854(i, bArr);
            } while (!interfaceC5761.mo3924());
            c20810Mo30393.close();
        } catch (Throwable th) {
            try {
                c20810Mo30393.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        if (this.f37395 == null) {
            mo9717(false);
        }
        C13985 c13985 = this.f37395;
        if (c13985 == null || !str.equals(c13985.getPath())) {
            return null;
        }
        return this.f37395;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update("compress".getBytes());
        C16111.m36662(messageDigest, this.f37397.mo25505());
        messageDigest.update(String.valueOf(this.f37396).getBytes());
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        if (this.f37395 == null) {
            mo9717(false);
        }
        ArrayList arrayList = new ArrayList(2);
        if (this.f37395 != null && (str.isEmpty() || str.equals("/"))) {
            arrayList.add(this.f37395);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C13985 m30395() {
        return this.f37395;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
        c11996.m27459(this.f37397.mo25505());
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m30394() {
        return this.f37397.mo25505();
    }

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC17043 m30396() {
        return this.f37397;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m30398() {
        return this.f37396 != this.f37397.mo25091();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m30397() {
        return this.f37397.mo25094();
    }
}
