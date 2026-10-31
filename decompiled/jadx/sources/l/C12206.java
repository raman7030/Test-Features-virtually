package l;

import android.content.IIntentSender;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۫ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12206 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22933 f36420;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f36421;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7267 f36422;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22789 f36423;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f36424;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14197 f36425;

    public C12206(C10671 c10671, InterfaceC7267 interfaceC7267) {
        this.f36421 = c10671;
        this.f36422 = interfaceC7267;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C10671 c10671 = this.f36421;
        C22933 c22933 = new C22933(c10671.f32087);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040(c10671.getFileName());
        c22933.mo49541(new View.OnClickListener() { // from class: l.᩹ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71738.f36420.m51051();
            }
        });
        c22933.mo49547();
        this.f36420 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C10671 c10671 = this.f36421;
        if (c10671.f32092) {
            C20549.m47082(c10671.f32088, c10671.f32089);
        }
        ExecutorService executorServiceNewFixedThreadPool = null;
        try {
            PackageInstaller.Session sessionMo19504 = this.f36422.mo19504(C4321.m12974());
            try {
                if (c10671.f32092) {
                    this.f36423 = new C22789();
                    C18090 c18090 = new C18090(c10671.f32088);
                    try {
                        this.f36423.m50867(c18090, c10671.f32089);
                        this.f36420.m51049(R.string.MT_Protector);
                        C19277 c19277 = new C19277(this.f36423.f73579);
                        c19277.m44459(new InterfaceC2343() { // from class: l.᩶ۚܿ
                            @Override // l.InterfaceC2343
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo6264(int i) {
                                C12206 c12206 = this.f64658;
                                c12206.f36420.m51045(i);
                                if (i == 100) {
                                    c12206.f36420.m51041(true);
                                }
                            }
                        });
                        this.f36425 = new C14197(c18090.m42196(), c19277);
                        this.f36420.mo49542(new Runnable() { // from class: l.ۙۚܿ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f14196.f36425.f42854 = true;
                            }
                        });
                        ExecutorService executorService = C1802.f6211;
                        executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
                        this.f36423.m50865(this.f36425, sessionMo19504, executorServiceNewFixedThreadPool);
                        C14197 c14197 = this.f36425;
                        if (c14197.f42854) {
                            sessionMo19504.abandon();
                            c18090.close();
                            sessionMo19504.close();
                            if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                                return;
                            }
                            executorServiceNewFixedThreadPool.shutdownNow();
                            return;
                        }
                        c14197.m33866();
                        c18090.close();
                    } catch (Throwable th) {
                        try {
                            c18090.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    this.f36420.m51049(R.string.MT_Protector);
                    this.f36420.mo49542((Runnable) null);
                    C19277 c19278 = new C19277(c10671.f32088.mo23127());
                    c19278.m44459(new InterfaceC2343() { // from class: l.ۗۚܿ
                        @Override // l.InterfaceC2343
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6264(int i) {
                            C12206 c12206 = this.f9565;
                            c12206.f36420.m51045(i);
                            if (i == 100) {
                                c12206.f36420.m51041(true);
                            }
                        }
                    });
                    OutputStream outputStreamOpenWrite = sessionMo19504.openWrite(c10671.getFileName(), 0L, -1L);
                    try {
                        c10671.f32088.m36495(outputStreamOpenWrite, new C12911(this, c19278));
                        if (outputStreamOpenWrite != null) {
                            outputStreamOpenWrite.close();
                        }
                        if (this.f36420.m51053()) {
                            sessionMo19504.abandon();
                            sessionMo19504.close();
                            return;
                        }
                    } catch (Throwable th3) {
                        if (outputStreamOpenWrite != null) {
                            try {
                                outputStreamOpenWrite.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                C13616 c13616 = new C13616();
                c13616.f40615 = new CountDownLatch(1);
                sessionMo19504.commit((IntentSender) IntentSender.class.getConstructor(IIntentSender.class).newInstance(c13616));
                while (!c13616.f40615.await(500L, TimeUnit.MILLISECONDS)) {
                    if (this.f36420.m51053()) {
                        sessionMo19504.abandon();
                        sessionMo19504.close();
                        if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                            return;
                        }
                        executorServiceNewFixedThreadPool.shutdownNow();
                        return;
                    }
                }
                Intent intent = c13616.f40616;
                int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
                if (intExtra == 0) {
                    this.f36424 = intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME");
                    C22789 c22789 = this.f36423;
                    if (c22789 != null) {
                        c22789.m50866(this.f36425, this.f36420, executorServiceNewFixedThreadPool);
                    }
                } else {
                    if (intExtra == 3) {
                        throw new CancellationException();
                    }
                    String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                    if (TextUtils.isEmpty(stringExtra)) {
                        throw new C1637(R.string.MT_Protector);
                    }
                    C20549.m47078(stringExtra.replace("Success", ""));
                }
                sessionMo19504.close();
                if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                    return;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
            } catch (Throwable th5) {
                if (sessionMo19504 != null) {
                    try {
                        sessionMo19504.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            if (0 != 0 && !executorServiceNewFixedThreadPool.isShutdown()) {
                executorServiceNewFixedThreadPool.shutdownNow();
            }
            throw th7;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (!this.f36420.m51053()) {
            C10671 c10671 = this.f36421;
            C20549.m47079(c10671.f32087, c10671.getFileName(), this.f36424);
            if (c10671.f32092) {
                return;
            }
            C20549.f66200.mo1669((Object) null);
            return;
        }
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        String message = exc.getMessage();
        if (message != null && message.equals("binder haven't been received")) {
            this.f36422.mo19505();
            return;
        }
        if ((exc instanceof CancellationException) || this.f36420.m51053()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        boolean z = exc instanceof C0086;
        C10671 c10671 = this.f36421;
        if (z) {
            C0086 c0086 = (C0086) exc;
            if (c0086.m1046()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                intent.putExtra("pkgName", c10671.f32091);
                C2234.m7411(C4925.m14335()).m7415(intent);
                return;
            } else if (c0086.m1047()) {
                AbstractActivityC3346 abstractActivityC3346 = c10671.f32087;
                String message2 = c0086.getMessage();
                String strM1045 = c0086.m1045();
                abstractActivityC3346.getClass();
                abstractActivityC3346.runOnUiThread(new RunnableC9697(abstractActivityC3346, message2, strM1045, false));
                return;
            }
        }
        c10671.m26776(exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f36420.m51051();
    }
}
