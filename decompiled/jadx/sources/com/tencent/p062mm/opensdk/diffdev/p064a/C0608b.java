package com.tencent.p062mm.opensdk.diffdev.p064a;

import com.tencent.p062mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p062mm.opensdk.diffdev.OAuthListener;
import com.tencent.p062mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0608b implements OAuthListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0607a f2097f;

    public C0608b(C0607a c0607a) {
        this.f2097f = c0607a;
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.OAuthListener
    public final void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
        Log.m2020d("MicroMsg.SDK.ListenerWrapper", "onAuthFinish, errCode = " + oAuthErrCode.toString() + ", authCode = " + str);
        C0607a.m2010c(this.f2097f);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f2097f.f2094c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
        }
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.OAuthListener
    public final void onAuthGotQrcode(String str, byte[] bArr) {
        Log.m2020d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f2097f.f2094c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
        }
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.OAuthListener
    public final void onQrcodeScanned() {
        Log.m2020d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
        if (this.f2097f.handler != null) {
            this.f2097f.handler.post(new RunnableC0609c(this));
        }
    }
}
