package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5954 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f18253;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f18254;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f18255;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13714 f18256;

    public C5954(ViewOnClickListenerC13714 viewOnClickListenerC13714, C11667 c11667, String str) {
        this.f18256 = viewOnClickListenerC13714;
        this.f18253 = c11667;
        this.f18255 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f18256.f40922);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f18254 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        boolean zM51053 = this.f18254.m51053();
        ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f18256;
        if (!zM51053) {
            C16742 c16742 = viewOnClickListenerC13714.f40919;
            C22933 c22933 = this.f18254;
            AbstractC15440 abstractC15440M40799 = C17448.m40799(c16742);
            AbstractC15440 abstractC15440M36526 = abstractC15440M40799.m36526("packageDone");
            AbstractC15440 abstractC15440M36527 = abstractC15440M40799.m36526("packageDoneTemp");
            if (!abstractC15440M36526.mo23120()) {
                c22933.m51049(R.string.MT_Protector);
                String[] strArrM6342 = C1926.m6342(c16742);
                C17209 c17209 = ServiceC8982.f27295;
                C9449 c9449 = new C9449();
                c9449.m24282(strArrM6342[0]);
                C18621 c18621Execute = c17209.m40469(c9449.m24274()).execute();
                if (!c18621Execute.m43173()) {
                    throw new IOException("Code-" + c18621Execute.m43177() + ": " + c18621Execute.m43171());
                }
                AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
                if (abstractC0275M43170 == null) {
                    throw new IOException("Response body is null");
                }
                C19277 c19277 = new C19277(abstractC0275M43170.mo1615());
                c19277.m44459(new C23595(c22933));
                MessageDigest messageDigestM34526 = C14460.m34526();
                try {
                    InputStream inputStreamM1611 = abstractC0275M43170.m1611();
                    try {
                        OutputStream outputStreamMo23555 = abstractC15440M36527.mo23555(false);
                        try {
                            byte[] bArr = new byte[512];
                            while (true) {
                                int i = inputStreamM1611.read(bArr);
                                if (i != -1) {
                                    c19277.m44460(i);
                                    messageDigestM34526.update(bArr, 0, i);
                                    outputStreamMo23555.write(bArr, 0, i);
                                    if (c22933.m51053()) {
                                        outputStreamMo23555.close();
                                        inputStreamM1611.close();
                                        break;
                                    }
                                } else {
                                    if (outputStreamMo23555 != null) {
                                        outputStreamMo23555.close();
                                    }
                                    inputStreamM1611.close();
                                    if (!C14460.m34531(messageDigestM34526.digest()).equals(strArrM6342[1])) {
                                        abstractC15440M36527.mo23552();
                                        throw new IOException("MD5 verification failed");
                                    }
                                    if (abstractC15440M36527.mo23551(abstractC15440M36526)) {
                                        break;
                                    }
                                    abstractC15440M36527.mo23552();
                                    throw new IOException("Rename file fail: " + abstractC15440M36527.mo23554() + " to " + abstractC15440M36526.mo23554());
                                }
                            }
                        } catch (Throwable th) {
                            if (outputStreamMo23555 != null) {
                                try {
                                    outputStreamMo23555.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            inputStreamM1611.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Exception e) {
                    abstractC15440M36527.mo23552();
                    throw e;
                }
            }
        }
        if (this.f18254.m51053()) {
            return;
        }
        ActivityC7365 activityC7365 = viewOnClickListenerC13714.f40922;
        C16742 c16743 = viewOnClickListenerC13714.f40919;
        C11667 c11667 = this.f18253;
        C22933 c22934 = this.f18254;
        c22934.m51049(R.string.MT_Protector);
        AbstractC15440 abstractC15440M40796 = C17448.m40796(c16743);
        AbstractC15440 abstractC15440M407910 = C17448.m40799(c16743);
        AbstractC15440 abstractC15440M36528 = abstractC15440M407910.m36526("packageLocal");
        AbstractC15440 abstractC15440M36529 = abstractC15440M407910.m36526("packageDone");
        AbstractC15440 abstractC15440M365210 = abstractC15440M407910.m36526("packageDone.zip");
        AbstractC15440 abstractC15440M365211 = abstractC15440M407910.m36526("package.apk");
        abstractC15440M40796.mo35195();
        try {
            C19277 c19278 = new C19277(abstractC15440M36529.mo23127());
            c19278.m44459(new C23595(c22934));
            InputStream inputStreamM3765 = C1096.m3765(new C18154(abstractC15440M36529.mo27926(), c19278));
            try {
                OutputStream outputStreamMo23556 = abstractC15440M365210.mo23555(false);
                try {
                    byte[] bArr2 = new byte[1024];
                    do {
                        int i2 = inputStreamM3765.read(bArr2);
                        if (i2 != -1) {
                            outputStreamMo23556.write(bArr2, 0, i2);
                        } else {
                            if (outputStreamMo23556 != null) {
                                outputStreamMo23556.close();
                            }
                            inputStreamM3765.close();
                            C8918 c8918 = new C8918(abstractC15440M365211);
                            try {
                                C18090 c18090 = new C18090(abstractC15440M36528);
                                try {
                                    C18090 c18091 = new C18090(abstractC15440M365210);
                                    try {
                                        HashSet hashSet = new HashSet();
                                        Iterator it = c18091.m42210().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C3545 c3545 = (C3545) it.next();
                                                c8918.m23013(c3545);
                                                C22194.m49852(c18091.m42189(c3545), c8918.m23007());
                                                hashSet.add(c3545.getName());
                                                if (c22934.m51053()) {
                                                    c18091.close();
                                                    break;
                                                }
                                            } else {
                                                Iterator it2 = c18090.m42210().iterator();
                                                do {
                                                    if (it2.hasNext()) {
                                                        C3545 c3546 = (C3545) it2.next();
                                                        if (!hashSet.contains(c3546.getName())) {
                                                            c8918.m23014(c3546, c18090);
                                                        }
                                                    } else {
                                                        c18091.close();
                                                        c18090.close();
                                                        c8918.close();
                                                        C10025.m25195(activityC7365, abstractC15440M365211, abstractC15440M40796, c11667, c22934);
                                                    }
                                                } while (!c22934.m51053());
                                                c18091.close();
                                                break;
                                            }
                                        }
                                        c18090.close();
                                        c8918.close();
                                    } catch (Throwable th5) {
                                        try {
                                            c18091.close();
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                        }
                                        throw th5;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        c18090.close();
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th9) {
                                try {
                                    c8918.close();
                                } catch (Throwable th10) {
                                    th9.addSuppressed(th10);
                                }
                                throw th9;
                            }
                        }
                        abstractC15440M365210.mo23552();
                        abstractC15440M365211.mo23552();
                    } while (!c22934.m51053());
                    outputStreamMo23556.close();
                    inputStreamM3765.close();
                    abstractC15440M365210.mo23552();
                    abstractC15440M365211.mo23552();
                } catch (Throwable th11) {
                    if (outputStreamMo23556 != null) {
                        try {
                            outputStreamMo23556.close();
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                        }
                    }
                    throw th11;
                }
            } catch (Throwable th13) {
                try {
                    inputStreamM3765.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
                throw th13;
            }
        } catch (Throwable th15) {
            abstractC15440M365210.mo23552();
            abstractC15440M365211.mo23552();
            throw th15;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f18254.m51053()) {
            return;
        }
        this.f18256.m32968(this.f18255);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f18256.f40922.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f18254.m51051();
    }
}
