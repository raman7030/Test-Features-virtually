package p067l;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import bin.p000mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۢۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11288 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public C24164 f31452;

    /* JADX INFO: renamed from: ܳ */
    public C24027 f31453 = new C24027();

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C12510 f31454;

    /* JADX INFO: renamed from: ᩻ */
    public C15861 f31455;

    public C11288(C12510 c12510) {
        this.f31454 = c12510;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C12510 c12510 = this.f31454;
        C24164 c24164 = new C24164(c12510.f35058);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431(c12510.getFileName());
        c24164.mo51877(new View.OnClickListener() { // from class: l.᩷ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69301.f31452.m53442();
            }
        });
        c24164.mo51883();
        this.f31452 = c24164;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩺ۚܿ] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.pm.PackageInstaller] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.content.pm.PackageInstaller$Session, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.pm.PackageInstaller$Session] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        boolean z;
        C19886 c19886;
        C15861 c15861;
        Throwable th;
        ?? r0 = this.f31453;
        C12510 c12510 = this.f31454;
        C21898.m49405(c12510.f35059, c12510.f35060);
        PackageInstaller.SessionParams sessionParamsM14838 = C6475.m14838();
        if (Build.VERSION.SDK_INT >= 26) {
            sessionParamsM14838.setInstallReason(4);
        }
        ?? packageInstaller = C7050.m16217().getPackageInstaller();
        int iCreateSession = packageInstaller.createSession(sessionParamsM14838);
        ExecutorService executorService = C4081.f8990;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C19110.f57020);
        final C19886 c19886M46482 = null;
        ?? r8 = 0;
        ?? r9 = 0;
        try {
            try {
                C19561 c19561 = new C19561(c12510.f35059);
                try {
                    packageInstaller = packageInstaller.openSession(iCreateSession);
                    try {
                        r0.m53210(c19561, c12510.f35060);
                        this.f31452.m53440(R.string.MT_Protector);
                        C20689 c20689 = new C20689(r0.f76309);
                        c20689.m46753(new InterfaceC4595() { // from class: l.ܿۚܿ
                            @Override // p067l.InterfaceC4595
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo8466(int i) {
                                C11288 c11288 = this.f55728;
                                c11288.f31452.m53436(i);
                                if (i == 100) {
                                    c11288.f31452.m53432(true);
                                }
                            }
                        });
                        this.f31455 = new C15861(c19561.m44455(), c20689);
                        this.f31452.mo51878(new Runnable() { // from class: l.ܳۚܿ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f46296.f31455.f45941 = true;
                            }
                        });
                        r0.m53208(this.f31455, packageInstaller, executorServiceNewFixedThreadPool);
                        C15861 c15862 = this.f31455;
                        if (c15862.f45941) {
                            throw new CancellationException();
                        }
                        c15862.m35998();
                        c19886M46482 = C20557.m46482(iCreateSession);
                        Intent intent = new Intent("bin.mt.file.action.INSTALL_CALLBACK");
                        intent.setPackage(c12510.f35058.getPackageName());
                        intent.putExtra("android.content.pm.extra.SESSION_ID", iCreateSession);
                        PendingIntent broadcast = PendingIntent.getBroadcast(c12510.f35058, iCreateSession, intent, 167772160);
                        z = false;
                        C7050.m16212(new RunnableC24698(0, packageInstaller, broadcast));
                        try {
                            this.f31452.mo51878(new Runnable() { // from class: l.ۜۚܿ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C11288 c11288 = this.f23122;
                                    C19886 c19887 = c19886M46482;
                                    c11288.f31455.f45941 = true;
                                    synchronized (c19887) {
                                        c19887.notifyAll();
                                    }
                                }
                            });
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            while (true) {
                                if (!c19886M46482.m45181()) {
                                    if (this.f31452.m53444()) {
                                        throw new CancellationException();
                                    }
                                    if (c19886M46482.m45179() == -1) {
                                        if (C5623.m12441()) {
                                            ApplicationC21448.f67649.edit().putBoolean("show_apks_miui_warning", true).apply();
                                            throw new C3924(R.string.MT_Protector);
                                        }
                                        throw new C3924(R.string.MT_Protector);
                                    }
                                    if (!this.f31452.m53433() && c19886M46482.m45179() == 1 && System.currentTimeMillis() - jCurrentTimeMillis > 60000) {
                                        throw new C18544();
                                    }
                                } else if (c19886M46482.m45179() == 1) {
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                }
                                int iM45179 = c19886M46482.m45179();
                                String strM45178 = c19886M46482.m45178();
                                if (iM45179 == 0) {
                                    if (!TextUtils.isEmpty(strM45178) && r0.f76311 == null) {
                                        r0.f76311 = strM45178;
                                    }
                                    r0.m53209(this.f31455, this.f31452, executorServiceNewFixedThreadPool);
                                    c19561.close();
                                    if (!executorServiceNewFixedThreadPool.isShutdown()) {
                                        C15861 c15863 = this.f31455;
                                        if (c15863 != null) {
                                            c15863.f45941 = true;
                                        }
                                        executorServiceNewFixedThreadPool.shutdownNow();
                                        executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                                    }
                                    if (packageInstaller != 0) {
                                        packageInstaller.close();
                                    }
                                    c19886M46482.m45180();
                                    return;
                                }
                                if (iM45179 == 2) {
                                    throw new CancellationException();
                                }
                                if (iM45179 == 3) {
                                    if (TextUtils.isEmpty(strM45178)) {
                                        throw new C3924(R.string.MT_Protector);
                                    }
                                    C21898.m49401(strM45178.replace("Success", ""));
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            try {
                                c19561.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r8 = packageInstaller;
                        packageInstaller = r8;
                        z = true;
                        c19886M46482 = null;
                        th = th;
                        c19561.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c19886 = c19886M46482;
                r9 = packageInstaller;
                if (!executorServiceNewFixedThreadPool.isShutdown()) {
                    c15861 = this.f31455;
                    if (c15861 != null) {
                        c15861.f45941 = true;
                    }
                    executorServiceNewFixedThreadPool.shutdownNow();
                    executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                }
                if (r9 != 0) {
                    if (z) {
                        r9.abandon();
                    }
                    r9.close();
                }
                if (c19886 != null) {
                    c19886.m45180();
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            z = true;
            c19886 = null;
            if (!executorServiceNewFixedThreadPool.isShutdown()) {
                c15861 = this.f31455;
                if (c15861 != null) {
                    c15861.f45941 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
            }
            if (r9 != 0) {
                if (z) {
                    r9.abandon();
                }
                r9.close();
            }
            if (c19886 != null) {
                c19886.m45180();
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f31452.m53444()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (C5623.m12441()) {
            C24104.m53360(ApplicationC21448.f67649, "show_apks_miui_warning", false);
        }
        C12510 c12510 = this.f31454;
        C21898.m49402(c12510.f35058, c12510.getFileName(), this.f31453.f76311);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (!(exc instanceof C18544) || this.f31452.m53433()) {
            if (exc instanceof CancellationException) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            String message = exc.getMessage();
            boolean zM12441 = C5623.m12441();
            C12510 c12510 = this.f31454;
            if (!zM12441 || message == null || !message.contains("INSTALL_FAILED_INTERNAL_ERROR")) {
                c12510.m28815(exc);
            } else {
                C24104.m53360(ApplicationC21448.f67649, "show_apks_miui_warning", true);
                c12510.m28813(R.string.MT_Protector);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f31452.m53442();
    }
}
