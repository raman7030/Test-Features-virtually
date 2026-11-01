package com.tencent.p062mm.opensdk.diffdev.p064a;

import com.tencent.p062mm.opensdk.diffdev.OAuthListener;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0609c implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0608b f2098g;

    public RunnableC0609c(C0608b c0608b) {
        this.f2098g = c0608b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f2098g.f2097f.f2094c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OAuthListener) it.next()).onQrcodeScanned();
        }
    }
}
