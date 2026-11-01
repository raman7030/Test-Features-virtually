package p067l;

import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11236 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ IBinder f31249;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Bundle f31250;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f31251;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f31252;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3188 f31253;

    public RunnableC11236(C2517 c2517, C3188 c3188, String str, IBinder iBinder, Bundle bundle) {
        this.f31252 = c2517;
        this.f31253 = c3188;
        this.f31251 = str;
        this.f31249 = iBinder;
        this.f31250 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f31253.f6126.getBinder();
        C2517 c2517 = this.f31252;
        C11868 c11868 = (C11868) c2517.f4113.f48755.getOrDefault(binder, null);
        if (c11868 == null) {
            return;
        }
        HashMap map = c11868.f33078;
        AbstractServiceC16599 abstractServiceC16599 = c2517.f4113;
        String str = this.f31251;
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            IBinder iBinder = this.f31249;
            Bundle bundle = this.f31250;
            if (!zHasNext) {
                arrayList.add(new C1349(iBinder, bundle));
                map.put(str, arrayList);
                C23267 c23267 = new C23267(abstractServiceC16599, str, c11868, str, bundle);
                if (bundle == null) {
                    abstractServiceC16599.m37614();
                } else {
                    c23267.m36046(1);
                    abstractServiceC16599.m37614();
                }
                if (!c23267.m36047()) {
                    throw new IllegalStateException(C24420.m53894(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), c11868.f33076, " id=", str));
                }
                return;
            }
            C1349 c1349 = (C1349) it.next();
            if (iBinder == c1349.f33658 && C13590.m30917(bundle, (Bundle) c1349.f33659)) {
                return;
            }
        }
    }
}
