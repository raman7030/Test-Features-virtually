package p067l;

import android.content.IIntentSender;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.text.TextUtils;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۫ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13969 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public C24164 f39435;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C12510 f39436;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ InterfaceC9275 f39437;

    /* JADX INFO: renamed from: ܳ */
    public C24027 f39438;

    /* JADX INFO: renamed from: ᩷ */
    public String f39439;

    /* JADX INFO: renamed from: ᩻ */
    public C15861 f39440;

    public C13969(C12510 c12510, InterfaceC9275 interfaceC9275) {
        this.f39436 = c12510;
        this.f39437 = interfaceC9275;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C12510 c12510 = this.f39436;
        C24164 c24164 = new C24164(c12510.f35058);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431(c12510.getFileName());
        c24164.mo51877(new View.OnClickListener() { // from class: l.᩹ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74458.f39435.m53442();
            }
        });
        c24164.mo51883();
        this.f39435 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C12510 c12510 = this.f39436;
        if (c12510.f35063) {
            C21898.m49405(c12510.f35059, c12510.f35060);
        }
        ExecutorService executorServiceNewFixedThreadPool = null;
        try {
            PackageInstaller.Session sessionMo21470 = this.f39437.mo21470(C6475.m14838());
            try {
                if (c12510.f35063) {
                    this.f39438 = new C24027();
                    C19561 c19561 = new C19561(c12510.f35059);
                    try {
                        this.f39438.m53210(c19561, c12510.f35060);
                        this.f39435.m53440(R.string.MT_Protector);
                        C20689 c20689 = new C20689(this.f39438.f76309);
                        c20689.m46753(new InterfaceC4595() { // from class: l.᩶ۚܿ
                            @Override // p067l.InterfaceC4595
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo8466(int i) {
                                C13969 c13969 = this.f67298;
                                c13969.f39435.m53436(i);
                                if (i == 100) {
                                    c13969.f39435.m53432(true);
                                }
                            }
                        });
                        this.f39440 = new C15861(c19561.m44455(), c20689);
                        this.f39435.mo51878(new Runnable() { // from class: l.ۙۚܿ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f17020.f39440.f45941 = true;
                            }
                        });
                        ExecutorService executorService = C4081.f8990;
                        executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C19110.f57020);
                        this.f39438.m53208(this.f39440, sessionMo21470, executorServiceNewFixedThreadPool);
                        C15861 c15861 = this.f39440;
                        if (c15861.f45941) {
                            sessionMo21470.abandon();
                            c19561.close();
                            sessionMo21470.close();
                            if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                                return;
                            }
                            executorServiceNewFixedThreadPool.shutdownNow();
                            return;
                        }
                        c15861.m35998();
                        c19561.close();
                    } catch (Throwable th) {
                        try {
                            c19561.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    this.f39435.m53440(R.string.MT_Protector);
                    this.f39435.mo51878((Runnable) null);
                    C20689 c206810 = new C20689(c12510.f35059.mo25101());
                    c206810.m46753(new InterfaceC4595() { // from class: l.ۗۚܿ
                        @Override // p067l.InterfaceC4595
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo8466(int i) {
                            C13969 c13969 = this.f12367;
                            c13969.f39435.m53436(i);
                            if (i == 100) {
                                c13969.f39435.m53432(true);
                            }
                        }
                    });
                    OutputStream outputStreamOpenWrite = sessionMo21470.openWrite(c12510.getFileName(), 0L, -1L);
                    try {
                        c12510.f35059.m38653(outputStreamOpenWrite, new C14639(this, c206810));
                        if (outputStreamOpenWrite != null) {
                            outputStreamOpenWrite.close();
                        }
                        if (this.f39435.m53444()) {
                            sessionMo21470.abandon();
                            sessionMo21470.close();
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
                C15309 c15309 = new C15309();
                c15309.f43692 = new CountDownLatch(1);
                sessionMo21470.commit((IntentSender) IntentSender.class.getConstructor(IIntentSender.class).newInstance(c15309));
                while (!c15309.f43692.await(500L, TimeUnit.MILLISECONDS)) {
                    if (this.f39435.m53444()) {
                        sessionMo21470.abandon();
                        sessionMo21470.close();
                        if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                            return;
                        }
                        executorServiceNewFixedThreadPool.shutdownNow();
                        return;
                    }
                }
                Intent intent = c15309.f43693;
                int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
                if (intExtra == 0) {
                    this.f39439 = intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME");
                    C24027 c24027 = this.f39438;
                    if (c24027 != null) {
                        c24027.m53209(this.f39440, this.f39435, executorServiceNewFixedThreadPool);
                    }
                } else {
                    if (intExtra == 3) {
                        throw new CancellationException();
                    }
                    String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                    if (TextUtils.isEmpty(stringExtra)) {
                        throw new C3924(R.string.MT_Protector);
                    }
                    C21898.m49401(stringExtra.replace("Success", ""));
                }
                sessionMo21470.close();
                if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                    return;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
            } catch (Throwable th5) {
                if (sessionMo21470 != null) {
                    try {
                        sessionMo21470.close();
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

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (!this.f39435.m53444()) {
            C12510 c12510 = this.f39436;
            C21898.m49402(c12510.f35058, c12510.getFileName(), this.f39439);
            if (c12510.f35063) {
                return;
            }
            C21898.f68877.mo4067((Object) null);
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        String message = exc.getMessage();
        if (message != null && message.equals("binder haven't been received")) {
            this.f39437.mo21471();
            return;
        }
        if ((exc instanceof CancellationException) || this.f39435.m53444()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        boolean z = exc instanceof C2450;
        C12510 c12510 = this.f39436;
        if (z) {
            C2450 c2450 = (C2450) exc;
            if (c2450.m3442()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                intent.putExtra("pkgName", c12510.f35062);
                C4491.m9493(C7050.m16232()).m9497(intent);
                return;
            } else if (c2450.m3443()) {
                AbstractActivityC5549 abstractActivityC5549 = c12510.f35058;
                String message2 = c2450.getMessage();
                String strM3441 = c2450.m3441();
                abstractActivityC5549.getClass();
                abstractActivityC5549.runOnUiThread(new RunnableC11585(abstractActivityC5549, message2, strM3441, false));
                return;
            }
        }
        c12510.m28815(exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f39435.m53442();
    }
}
