package l;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۢۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9385 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22933 f28503;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22789 f28504 = new C22789();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f28505;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14197 f28506;

    public C9385(C10671 c10671) {
        this.f28505 = c10671;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C10671 c10671 = this.f28505;
        C22933 c22933 = new C22933(c10671.f32087);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040(c10671.getFileName());
        c22933.mo49541(new View.OnClickListener() { // from class: l.᩷ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f66619.f28503.m51051();
            }
        });
        c22933.mo49547();
        this.f28503 = c22933;
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
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        boolean z;
        C18432 c18432;
        C14197 c14197;
        Throwable th;
        ?? r0 = this.f28504;
        C10671 c10671 = this.f28505;
        C20549.m47082(c10671.f32088, c10671.f32089);
        PackageInstaller.SessionParams sessionParamsM12974 = C4321.m12974();
        if (Build.VERSION.SDK_INT >= 26) {
            sessionParamsM12974.setInstallReason(4);
        }
        ?? packageInstaller = C4925.m14320().getPackageInstaller();
        int iCreateSession = packageInstaller.createSession(sessionParamsM12974);
        ExecutorService executorService = C1802.f6211;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        final C18432 c18432M44188 = null;
        ?? r8 = 0;
        ?? r9 = 0;
        try {
            try {
                C18090 c18090 = new C18090(c10671.f32088);
                try {
                    packageInstaller = packageInstaller.openSession(iCreateSession);
                    try {
                        r0.m50867(c18090, c10671.f32089);
                        this.f28503.m51049(R.string.MT_Protector);
                        C19277 c19277 = new C19277(r0.f73579);
                        c19277.m44459(new InterfaceC2343() { // from class: l.ܿۚܿ
                            @Override // l.InterfaceC2343
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo6264(int i) {
                                C9385 c9385 = this.f52545;
                                c9385.f28503.m51045(i);
                                if (i == 100) {
                                    c9385.f28503.m51041(true);
                                }
                            }
                        });
                        this.f28506 = new C14197(c18090.m42196(), c19277);
                        this.f28503.mo49542(new Runnable() { // from class: l.ܳۚܿ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f43204.f28506.f42854 = true;
                            }
                        });
                        r0.m50865(this.f28506, packageInstaller, executorServiceNewFixedThreadPool);
                        C14197 c14198 = this.f28506;
                        if (c14198.f42854) {
                            throw new CancellationException();
                        }
                        c14198.m33866();
                        c18432M44188 = C19138.m44188(iCreateSession);
                        Intent intent = new Intent("bin.mt.file.action.INSTALL_CALLBACK");
                        intent.setPackage(c10671.f32087.getPackageName());
                        intent.putExtra("android.content.pm.extra.SESSION_ID", iCreateSession);
                        PendingIntent broadcast = PendingIntent.getBroadcast(c10671.f32087, iCreateSession, intent, 167772160);
                        z = false;
                        C4925.m14315(new RunnableC23495(0, packageInstaller, broadcast));
                        try {
                            this.f28503.mo49542(new Runnable() { // from class: l.ۜۚܿ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9385 c9385 = this.f20244;
                                    C18432 c18433 = c18432M44188;
                                    c9385.f28506.f42854 = true;
                                    synchronized (c18433) {
                                        c18433.notifyAll();
                                    }
                                }
                            });
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            while (true) {
                                if (!c18432M44188.m42908()) {
                                    if (this.f28503.m51053()) {
                                        throw new CancellationException();
                                    }
                                    if (c18432M44188.m42906() == -1) {
                                        if (C3424.m10402()) {
                                            ApplicationC20075.f65008.edit().putBoolean("show_apks_miui_warning", true).apply();
                                            throw new C1637(R.string.MT_Protector);
                                        }
                                        throw new C1637(R.string.MT_Protector);
                                    }
                                    if (!this.f28503.m51042() && c18432M44188.m42906() == 1 && System.currentTimeMillis() - jCurrentTimeMillis > 60000) {
                                        throw new C17020();
                                    }
                                } else if (c18432M44188.m42906() == 1) {
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                }
                                int iM42906 = c18432M44188.m42906();
                                String strM42905 = c18432M44188.m42905();
                                if (iM42906 == 0) {
                                    if (!TextUtils.isEmpty(strM42905) && r0.f73581 == null) {
                                        r0.f73581 = strM42905;
                                    }
                                    r0.m50866(this.f28506, this.f28503, executorServiceNewFixedThreadPool);
                                    c18090.close();
                                    if (!executorServiceNewFixedThreadPool.isShutdown()) {
                                        C14197 c14199 = this.f28506;
                                        if (c14199 != null) {
                                            c14199.f42854 = true;
                                        }
                                        executorServiceNewFixedThreadPool.shutdownNow();
                                        executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                                    }
                                    if (packageInstaller != 0) {
                                        packageInstaller.close();
                                    }
                                    c18432M44188.m42907();
                                    return;
                                }
                                if (iM42906 == 2) {
                                    throw new CancellationException();
                                }
                                if (iM42906 == 3) {
                                    if (TextUtils.isEmpty(strM42905)) {
                                        throw new C1637(R.string.MT_Protector);
                                    }
                                    C20549.m47078(strM42905.replace("Success", ""));
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            try {
                                c18090.close();
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
                        c18432M44188 = null;
                        th = th;
                        c18090.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c18432 = c18432M44188;
                r9 = packageInstaller;
                if (!executorServiceNewFixedThreadPool.isShutdown()) {
                    c14197 = this.f28506;
                    if (c14197 != null) {
                        c14197.f42854 = true;
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
                if (c18432 != null) {
                    c18432.m42907();
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            z = true;
            c18432 = null;
            if (!executorServiceNewFixedThreadPool.isShutdown()) {
                c14197 = this.f28506;
                if (c14197 != null) {
                    c14197.f42854 = true;
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
            if (c18432 != null) {
                c18432.m42907();
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f28503.m51053()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (C3424.m10402()) {
            C22870.m50970(ApplicationC20075.f65008, "show_apks_miui_warning", false);
        }
        C10671 c10671 = this.f28505;
        C20549.m47079(c10671.f32087, c10671.getFileName(), this.f28504.f73581);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (!(exc instanceof C17020) || this.f28503.m51042()) {
            if (exc instanceof CancellationException) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            String message = exc.getMessage();
            boolean zM10402 = C3424.m10402();
            C10671 c10671 = this.f28505;
            if (!zM10402 || message == null || !message.contains("INSTALL_FAILED_INTERNAL_ERROR")) {
                c10671.m26776(exc);
            } else {
                C22870.m50970(ApplicationC20075.f65008, "show_apks_miui_warning", true);
                c10671.m26774(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f28503.m51051();
    }
}
