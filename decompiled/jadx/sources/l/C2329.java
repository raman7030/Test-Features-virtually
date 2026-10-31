package l;

import android.view.View;
import bin.mt.plus.R;
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
public final class C2329 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14197 f7467;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f7468;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f7469;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22789 f7470 = new C22789();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22933 f7471;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C12906 f7472;

    public C2329(C10671 c10671, AbstractC15440 abstractC15440) {
        this.f7469 = c10671;
        this.f7468 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C10671 c10671 = this.f7469;
        C22933 c22933 = new C22933(c10671.f32087);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040(c10671.getFileName());
        c22933.mo49541(new View.OnClickListener() { // from class: l.ۡۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26459.f7471.m51051();
            }
        });
        c22933.mo49547();
        this.f7471 = c22933;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0221  */
    /* JADX WARN: Code duplicated, block: B:72:0x0225  */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637, InterruptedException {
        C14197 c14197;
        C4021 c4021M43525;
        C22789 c22789 = this.f7470;
        C10671 c10671 = this.f7469;
        C20549.m47082(c10671.f32088, c10671.f32089);
        boolean z = false;
        String strM31436 = C12925.m31436(false);
        if (strM31436 == null) {
            strM31436 = "su";
        }
        C12906 c12906 = new C12906(strM31436, false);
        this.f7472 = c12906;
        C11356.m28104(c12906, "0", c10671.f32090);
        AbstractC15440 abstractC15440 = this.f7468;
        abstractC15440.m36508();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        try {
            C18090 c18090 = new C18090(c10671.f32088);
            try {
                c22789.m50867(c18090, c10671.f32089);
                ArrayList<C3545> arrayList = c22789.f73580;
                ArrayList<C3545> arrayList2 = c22789.f73578;
                this.f7471.m51049(R.string.MT_Protector);
                C19277 c19277 = new C19277(c22789.f73579);
                c19277.m44459(new InterfaceC2343() { // from class: l.ܺۚܿ
                    @Override // l.InterfaceC2343
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6264(int i) {
                        C2329 c2329 = this.f48532;
                        c2329.f7471.m51045(i);
                        if (i == 100) {
                            c2329.f7471.m51041(true);
                        }
                    }
                });
                this.f7467 = new C14197(c18090.m42196(), c19277);
                for (C3545 c3545 : arrayList2) {
                    executorServiceNewFixedThreadPool.submit(new RunnableC23370(this.f7467, c3545, abstractC15440.m36526(C16999.m39860(c3545.getName(), z)), true));
                    z = false;
                }
                String strM7595 = m7595("pm install-create -r -d " + C11356.m28107(c10671.f32090));
                if (!strM7595.contains("Success")) {
                    throw new Exception(strM7595);
                }
                Matcher matcher = Pattern.compile("\\[(\\d+)]").matcher(strM7595);
                if (!matcher.find()) {
                    throw new Exception(strM7595);
                }
                int i = Integer.parseInt(matcher.group(1));
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    try {
                        RunnableC23370 runnableC23370 = (RunnableC23370) this.f7467.f42857.poll(500L, TimeUnit.MILLISECONDS);
                        if (runnableC23370 != null) {
                            AbstractC15440 abstractC15441 = runnableC23370.f75070;
                            String strM23755 = C9255.m23755(abstractC15441.mo23554());
                            long jMo23127 = abstractC15441.mo23127();
                            String name = abstractC15441.getName();
                            if (c22789.f73581 == null && (c4021M43525 = C18838.m43525(abstractC15441)) != null) {
                                c22789.f73581 = c4021M43525.m12094();
                            }
                            String strM7596 = m7595("cat " + strM23755 + " | pm install-write -S " + jMo23127 + " " + i + " " + name);
                            abstractC15441.mo23552();
                            if (!strM7596.contains("Success")) {
                                throw new Exception(strM7596);
                            }
                            i2++;
                        } else {
                            C14197 c14198 = this.f7467;
                            if (c14198.f42854) {
                                throw new CancellationException();
                            }
                            c14198.m33866();
                        }
                        arrayList2 = arrayList2;
                    } catch (Exception e) {
                        m7595("pm install-abandon " + i);
                        throw e;
                    }
                }
                this.f7467.m33866();
                C20549.m47078(m7595("pm install-commit " + i));
                if (!arrayList.isEmpty()) {
                    this.f7471.m51041(false);
                    C14197 c14199 = this.f7467;
                    C19277 c19278 = new C19277(c22789.f73582);
                    C22933 c22933 = this.f7471;
                    C11003.requireNonNull(c22933);
                    c19278.m44459(new C23595(c22933));
                    c14199.f42855 = c19278;
                    for (C3545 c3546 : arrayList) {
                        executorServiceNewFixedThreadPool.submit(new RunnableC23370(this.f7467, c3546, C16293.f50120.m36526(C16999.m39860(c3546.getName(), false)), false));
                    }
                    C1802.m5992(executorServiceNewFixedThreadPool);
                    this.f7467.m33866();
                }
                c18090.close();
                if (executorServiceNewFixedThreadPool.isShutdown()) {
                    return;
                }
                C14197 c141910 = this.f7467;
                if (c141910 != null) {
                    c141910.f42854 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                return;
            } catch (Throwable th) {
                try {
                    c18090.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (!executorServiceNewFixedThreadPool.isShutdown()) {
                c14197 = this.f7467;
                if (c14197 != null) {
                    c14197.f42854 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
            }
            throw th3;
        }
        if (!executorServiceNewFixedThreadPool.isShutdown()) {
            c14197 = this.f7467;
            if (c14197 != null) {
                c14197.f42854 = true;
            }
            executorServiceNewFixedThreadPool.shutdownNow();
            executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m7595(String str) {
        C12906 c12906 = this.f7472;
        c12906.getClass();
        return c12906.mo25342(0L, str).m29682();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f7471.m51053()) {
            return;
        }
        C10671 c10671 = this.f7469;
        C20549.m47079(c10671.f32087, c10671.getFileName(), this.f7470.f73581);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (exc instanceof CancellationException) {
            return;
        }
        this.f7469.m26776(exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f7471.m51051();
        this.f7468.mo23552();
        C12906 c12906 = this.f7472;
        if (c12906 != null) {
            c12906.close();
        }
    }
}
