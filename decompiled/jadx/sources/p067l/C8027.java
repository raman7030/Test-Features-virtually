package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8027 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C13457 f21108;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f21109;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f21110;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC15402 f21111;

    public C8027(ViewOnClickListenerC15402 viewOnClickListenerC15402, C13457 c13457, String str) {
        this.f21111 = viewOnClickListenerC15402;
        this.f21108 = c13457;
        this.f21110 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f21111.f44003);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f21109 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        boolean zM53444 = this.f21109.m53444();
        ViewOnClickListenerC15402 viewOnClickListenerC15402 = this.f21111;
        if (!zM53444) {
            C18280 c18280 = viewOnClickListenerC15402.f44000;
            C24164 c24164 = this.f21109;
            AbstractC17043 abstractC17043M43057 = C18951.m43057(c18280);
            AbstractC17043 abstractC17043M38684 = abstractC17043M43057.m38684("packageDone");
            AbstractC17043 abstractC17043M38685 = abstractC17043M43057.m38684("packageDoneTemp");
            if (!abstractC17043M38684.mo25094()) {
                c24164.m53440(R.string.MT_Protector);
                String[] strArrM8515 = C4199.m8515(c18280);
                C18724 c18724 = ServiceC10905.f30230;
                C11349 c11349 = new C11349();
                c11349.m26292(strArrM8515[0]);
                C20066 c20066Execute = c18724.m42716(c11349.m26284()).execute();
                if (!c20066Execute.m45439()) {
                    throw new IOException("Code-" + c20066Execute.m45443() + ": " + c20066Execute.m45437());
                }
                AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
                if (abstractC2630M45436 == null) {
                    throw new IOException("Response body is null");
                }
                C20689 c20689 = new C20689(abstractC2630M45436.mo4015());
                c20689.m46753(new C24793(c24164));
                MessageDigest messageDigestM36660 = C16111.m36660();
                try {
                    InputStream inputStreamM4011 = abstractC2630M45436.m4011();
                    try {
                        OutputStream outputStreamMo25506 = abstractC17043M38685.mo25506(false);
                        try {
                            byte[] bArr = new byte[512];
                            while (true) {
                                int i = inputStreamM4011.read(bArr);
                                if (i != -1) {
                                    c20689.m46754(i);
                                    messageDigestM36660.update(bArr, 0, i);
                                    outputStreamMo25506.write(bArr, 0, i);
                                    if (c24164.m53444()) {
                                        outputStreamMo25506.close();
                                        inputStreamM4011.close();
                                        break;
                                    }
                                } else {
                                    if (outputStreamMo25506 != null) {
                                        outputStreamMo25506.close();
                                    }
                                    inputStreamM4011.close();
                                    if (!C16111.m36665(messageDigestM36660.digest()).equals(strArrM8515[1])) {
                                        abstractC17043M38685.mo25503();
                                        throw new IOException("MD5 verification failed");
                                    }
                                    if (abstractC17043M38685.mo25502(abstractC17043M38684)) {
                                        break;
                                    }
                                    abstractC17043M38685.mo25503();
                                    throw new IOException("Rename file fail: " + abstractC17043M38685.mo25505() + " to " + abstractC17043M38684.mo25505());
                                }
                            }
                        } catch (Throwable th) {
                            if (outputStreamMo25506 != null) {
                                try {
                                    outputStreamMo25506.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            inputStreamM4011.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Exception e) {
                    abstractC17043M38685.mo25503();
                    throw e;
                }
            }
        }
        if (this.f21109.m53444()) {
            return;
        }
        ActivityC9368 activityC9368 = viewOnClickListenerC15402.f44003;
        C18280 c18281 = viewOnClickListenerC15402.f44000;
        C13457 c13457 = this.f21108;
        C24164 c24165 = this.f21109;
        c24165.m53440(R.string.MT_Protector);
        AbstractC17043 abstractC17043M43054 = C18951.m43054(c18281);
        AbstractC17043 abstractC17043M43058 = C18951.m43057(c18281);
        AbstractC17043 abstractC17043M38686 = abstractC17043M43058.m38684("packageLocal");
        AbstractC17043 abstractC17043M38687 = abstractC17043M43058.m38684("packageDone");
        AbstractC17043 abstractC17043M38688 = abstractC17043M43058.m38684("packageDone.zip");
        AbstractC17043 abstractC17043M38689 = abstractC17043M43058.m38684("package.apk");
        abstractC17043M43054.mo37342();
        try {
            C20689 c206810 = new C20689(abstractC17043M38687.mo25101());
            c206810.m46753(new C24793(c24165));
            InputStream inputStreamM6038 = C3410.m6038(new C19622(abstractC17043M38687.mo29987(), c206810));
            try {
                OutputStream outputStreamMo25507 = abstractC17043M38688.mo25506(false);
                try {
                    byte[] bArr2 = new byte[1024];
                    do {
                        int i2 = inputStreamM6038.read(bArr2);
                        if (i2 != -1) {
                            outputStreamMo25507.write(bArr2, 0, i2);
                        } else {
                            if (outputStreamMo25507 != null) {
                                outputStreamMo25507.close();
                            }
                            inputStreamM6038.close();
                            C10844 c10844 = new C10844(abstractC17043M38689);
                            try {
                                C19561 c19561 = new C19561(abstractC17043M38686);
                                try {
                                    C19561 c19562 = new C19561(abstractC17043M38688);
                                    try {
                                        HashSet hashSet = new HashSet();
                                        Iterator it = c19562.m44469().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C5738 c5738 = (C5738) it.next();
                                                c10844.m24987(c5738);
                                                C23461.m52179(c19562.m44448(c5738), c10844.m24981());
                                                hashSet.add(c5738.getName());
                                                if (c24165.m53444()) {
                                                    c19562.close();
                                                    break;
                                                }
                                            } else {
                                                Iterator it2 = c19561.m44469().iterator();
                                                do {
                                                    if (it2.hasNext()) {
                                                        C5738 c5739 = (C5738) it2.next();
                                                        if (!hashSet.contains(c5739.getName())) {
                                                            c10844.m24988(c5739, c19561);
                                                        }
                                                    } else {
                                                        c19562.close();
                                                        c19561.close();
                                                        c10844.close();
                                                        C11896.m27212(activityC9368, abstractC17043M38689, abstractC17043M43054, c13457, c24165);
                                                    }
                                                } while (!c24165.m53444());
                                                c19562.close();
                                                break;
                                            }
                                        }
                                        c19561.close();
                                        c10844.close();
                                    } catch (Throwable th5) {
                                        try {
                                            c19562.close();
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                        }
                                        throw th5;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        c19561.close();
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th9) {
                                try {
                                    c10844.close();
                                } catch (Throwable th10) {
                                    th9.addSuppressed(th10);
                                }
                                throw th9;
                            }
                        }
                        abstractC17043M38688.mo25503();
                        abstractC17043M38689.mo25503();
                    } while (!c24165.m53444());
                    outputStreamMo25507.close();
                    inputStreamM6038.close();
                    abstractC17043M38688.mo25503();
                    abstractC17043M38689.mo25503();
                } catch (Throwable th11) {
                    if (outputStreamMo25507 != null) {
                        try {
                            outputStreamMo25507.close();
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                        }
                    }
                    throw th11;
                }
            } catch (Throwable th13) {
                try {
                    inputStreamM6038.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
                throw th13;
            }
        } catch (Throwable th15) {
            abstractC17043M38688.mo25503();
            abstractC17043M38689.mo25503();
            throw th15;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f21109.m53444()) {
            return;
        }
        this.f21111.m35082(this.f21110);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f21111.f44003.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f21109.m53442();
    }
}
