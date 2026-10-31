package l;

import android.content.pm.PackageInstaller;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩺ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22789 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f73581;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f73578 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f73580 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f73579 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f73582 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50867(C18090 c18090, List list) throws IOException {
        ArrayList arrayList;
        C3545 entry = c18090.getEntry("manifest.json");
        if (entry != null) {
            try {
                this.f73581 = AbstractC5206.m14983(new String(c18090.m42193(entry, (C19277) null), StandardCharsets.UTF_8)).m48553(am.o);
            } catch (Exception unused) {
            }
        }
        ArrayList arrayListM36330 = list != null ? C15308.m36330(c18090, list) : null;
        Iterator it = c18090.m42210().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f73578;
            if (!zHasNext) {
                break;
            }
            C3545 c3545 = (C3545) it.next();
            String name = c3545.getName();
            if (C15308.m36331(name) && (arrayListM36330 == null || arrayListM36330.contains(name))) {
                C16999.m39860(name, false);
                System.out.println("add ".concat(name));
                arrayList.add(c3545);
                this.f73579 = c3545.getSize() + this.f73579;
            }
        }
        for (C3545 c3546 : c18090.m42210()) {
            if (!c3546.isDirectory() && c3546.getName().startsWith("Android/")) {
                C16999.m39860(c3546.getName(), false);
                this.f73580.add(c3546);
                this.f73582 = c3546.getSize() + this.f73582;
            }
        }
        Collections.sort(arrayList, new C11501());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50865(C14197 c14197, PackageInstaller.Session session, ExecutorService executorService) throws Exception {
        ArrayList arrayList = this.f73578;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            executorService.submit(new RunnableC6437(c14197, (C3545) it.next(), session));
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (((Runnable) c14197.f42857.poll(500L, TimeUnit.MILLISECONDS)) != null) {
                i++;
            } else if (c14197.f42854) {
                return;
            } else {
                c14197.m33866();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50866(C14197 c14197, C22933 c22933, ExecutorService executorService) throws Exception {
        ArrayList<C3545> arrayList = this.f73580;
        if (arrayList.isEmpty()) {
            return;
        }
        c22933.m51048();
        c22933.m51041(false);
        C19277 c19277 = new C19277(this.f73582);
        c19277.m44459(new C23595(c22933));
        c14197.f42855 = c19277;
        for (C3545 c3545 : arrayList) {
            executorService.submit(new RunnableC23370(c14197, c3545, C16293.f50120.m36526(C16999.m39860(c3545.getName(), false)), false));
        }
        C1802.m5992(executorService);
        c14197.m33866();
    }
}
