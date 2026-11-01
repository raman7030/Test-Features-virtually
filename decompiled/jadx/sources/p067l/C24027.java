package p067l;

import android.content.pm.PackageInstaller;
import com.umeng.analytics.pro.C0655am;
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
public final class C24027 {

    /* JADX INFO: renamed from: ܿ */
    public String f76311;

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f76308 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f76310 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public long f76309 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public long f76312 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final void m53210(C19561 c19561, List list) throws IOException {
        ArrayList arrayList;
        C5738 entry = c19561.getEntry("manifest.json");
        if (entry != null) {
            try {
                this.f76311 = AbstractC7316.m16893(new String(c19561.m44452(entry, (C20689) null), StandardCharsets.UTF_8)).m50890(C0655am.f2354o);
            } catch (Exception unused) {
            }
        }
        ArrayList arrayListM38492 = list != null ? C16917.m38492(c19561, list) : null;
        Iterator it = c19561.m44469().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f76308;
            if (!zHasNext) {
                break;
            }
            C5738 c5738 = (C5738) it.next();
            String name = c5738.getName();
            if (C16917.m38493(name) && (arrayListM38492 == null || arrayListM38492.contains(name))) {
                C18524.m42103(name, false);
                System.out.println("add ".concat(name));
                arrayList.add(c5738);
                this.f76309 = c5738.getSize() + this.f76309;
            }
        }
        for (C5738 c5739 : c19561.m44469()) {
            if (!c5739.isDirectory() && c5739.getName().startsWith("Android/")) {
                C18524.m42103(c5739.getName(), false);
                this.f76310.add(c5739);
                this.f76312 = c5739.getSize() + this.f76312;
            }
        }
        Collections.sort(arrayList, new C13299());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53208(C15861 c15861, PackageInstaller.Session session, ExecutorService executorService) throws Exception {
        ArrayList arrayList = this.f76308;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            executorService.submit(new RunnableC8486(c15861, (C5738) it.next(), session));
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (((Runnable) c15861.f45944.poll(500L, TimeUnit.MILLISECONDS)) != null) {
                i++;
            } else if (c15861.f45941) {
                return;
            } else {
                c15861.m35998();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53209(C15861 c15861, C24164 c24164, ExecutorService executorService) throws Exception {
        ArrayList<C5738> arrayList = this.f76310;
        if (arrayList.isEmpty()) {
            return;
        }
        c24164.m53439();
        c24164.m53432(false);
        C20689 c20689 = new C20689(this.f76312);
        c20689.m46753(new C24793(c24164));
        c15861.f45942 = c20689;
        for (C5738 c5738 : arrayList) {
            executorService.submit(new RunnableC24579(c15861, c5738, C17853.f53287.m38684(C18524.m42103(c5738.getName(), false)), false));
        }
        C4081.m8189(executorService);
        c15861.m35998();
    }
}
