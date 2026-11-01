package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۖۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4582 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public C15861 f10258;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ AbstractC17043 f10259;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C12510 f10260;

    /* JADX INFO: renamed from: ܳ */
    public C24027 f10261 = new C24027();

    /* JADX INFO: renamed from: ᩷ */
    public C24164 f10262;

    /* JADX INFO: renamed from: ᩻ */
    public C14634 f10263;

    public C4582(C12510 c12510, AbstractC17043 abstractC17043) {
        this.f10260 = c12510;
        this.f10259 = abstractC17043;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C12510 c12510 = this.f10260;
        C24164 c24164 = new C24164(c12510.f35058);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431(c12510.getFileName());
        c24164.mo51877(new View.OnClickListener() { // from class: l.ۡۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29384.f10262.m53442();
            }
        });
        c24164.mo51883();
        this.f10262 = c24164;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0221  */
    /* JADX WARN: Code duplicated, block: B:72:0x0225  */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924, InterruptedException {
        C15861 c15861;
        C6190 c6190M45791;
        C24027 c24027 = this.f10261;
        C12510 c12510 = this.f10260;
        C21898.m49405(c12510.f35059, c12510.f35060);
        boolean z = false;
        String strM33522 = C14652.m33522(false);
        if (strM33522 == null) {
            strM33522 = "su";
        }
        C14634 c14634 = new C14634(strM33522, false);
        this.f10263 = c14634;
        C13161.m30148(c14634, "0", c12510.f35061);
        AbstractC17043 abstractC17043 = this.f10259;
        abstractC17043.m38666();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C19110.f57020);
        try {
            C19561 c19561 = new C19561(c12510.f35059);
            try {
                c24027.m53210(c19561, c12510.f35060);
                ArrayList<C5738> arrayList = c24027.f76310;
                ArrayList<C5738> arrayList2 = c24027.f76308;
                this.f10262.m53440(R.string.MT_Protector);
                C20689 c20689 = new C20689(c24027.f76309);
                c20689.m46753(new InterfaceC4595() { // from class: l.ܺۚܿ
                    @Override // p067l.InterfaceC4595
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo8466(int i) {
                        C4582 c4582 = this.f51672;
                        c4582.f10262.m53436(i);
                        if (i == 100) {
                            c4582.f10262.m53432(true);
                        }
                    }
                });
                this.f10258 = new C15861(c19561.m44455(), c20689);
                for (C5738 c5738 : arrayList2) {
                    executorServiceNewFixedThreadPool.submit(new RunnableC24579(this.f10258, c5738, abstractC17043.m38684(C18524.m42103(c5738.getName(), z)), true));
                    z = false;
                }
                String strM9665 = m9665("pm install-create -r -d " + C13161.m30151(c12510.f35061));
                if (!strM9665.contains("Success")) {
                    throw new Exception(strM9665);
                }
                Matcher matcher = Pattern.compile("\\[(\\d+)]").matcher(strM9665);
                if (!matcher.find()) {
                    throw new Exception(strM9665);
                }
                int i = Integer.parseInt(matcher.group(1));
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    try {
                        RunnableC24579 runnableC24579 = (RunnableC24579) this.f10258.f45944.poll(500L, TimeUnit.MILLISECONDS);
                        if (runnableC24579 != null) {
                            AbstractC17043 abstractC17044 = runnableC24579.f77816;
                            String strM25756 = C11164.m25756(abstractC17044.mo25505());
                            long jMo25101 = abstractC17044.mo25101();
                            String name = abstractC17044.getName();
                            if (c24027.f76311 == null && (c6190M45791 = C20272.m45791(abstractC17044)) != null) {
                                c24027.f76311 = c6190M45791.m14014();
                            }
                            String strM9666 = m9665("cat " + strM25756 + " | pm install-write -S " + jMo25101 + " " + i + " " + name);
                            abstractC17044.mo25503();
                            if (!strM9666.contains("Success")) {
                                throw new Exception(strM9666);
                            }
                            i2++;
                        } else {
                            C15861 c15862 = this.f10258;
                            if (c15862.f45941) {
                                throw new CancellationException();
                            }
                            c15862.m35998();
                        }
                        arrayList2 = arrayList2;
                    } catch (Exception e) {
                        m9665("pm install-abandon " + i);
                        throw e;
                    }
                }
                this.f10258.m35998();
                C21898.m49401(m9665("pm install-commit " + i));
                if (!arrayList.isEmpty()) {
                    this.f10262.m53432(false);
                    C15861 c15863 = this.f10258;
                    C20689 c206810 = new C20689(c24027.f76312);
                    C24164 c24164 = this.f10262;
                    C12826.requireNonNull(c24164);
                    c206810.m46753(new C24793(c24164));
                    c15863.f45942 = c206810;
                    for (C5738 c5739 : arrayList) {
                        executorServiceNewFixedThreadPool.submit(new RunnableC24579(this.f10258, c5739, C17853.f53287.m38684(C18524.m42103(c5739.getName(), false)), false));
                    }
                    C4081.m8189(executorServiceNewFixedThreadPool);
                    this.f10258.m35998();
                }
                c19561.close();
                if (executorServiceNewFixedThreadPool.isShutdown()) {
                    return;
                }
                C15861 c15864 = this.f10258;
                if (c15864 != null) {
                    c15864.f45941 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                return;
            } catch (Throwable th) {
                try {
                    c19561.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (!executorServiceNewFixedThreadPool.isShutdown()) {
                c15861 = this.f10258;
                if (c15861 != null) {
                    c15861.f45941 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
            }
            throw th3;
        }
        if (!executorServiceNewFixedThreadPool.isShutdown()) {
            c15861 = this.f10258;
            if (c15861 != null) {
                c15861.f45941 = true;
            }
            executorServiceNewFixedThreadPool.shutdownNow();
            executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ֫ */
    private String m9665(String str) {
        C14634 c14634 = this.f10263;
        c14634.getClass();
        return c14634.mo27361(0L, str).m31744();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f10262.m53444()) {
            return;
        }
        C12510 c12510 = this.f10260;
        C21898.m49402(c12510.f35058, c12510.getFileName(), this.f10261.f76311);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (exc instanceof CancellationException) {
            return;
        }
        this.f10260.m28815(exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f10262.m53442();
        this.f10259.mo25503();
        C14634 c14634 = this.f10263;
        if (c14634 != null) {
            c14634.close();
        }
    }
}
