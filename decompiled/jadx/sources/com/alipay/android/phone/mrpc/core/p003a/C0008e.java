package com.alipay.android.phone.mrpc.core.p003a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.alipay.sdk.p010m.p021f.AbstractC0112a;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import p067l.C12826;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.a.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0008e extends AbstractC0005b {

    /* JADX INFO: renamed from: c */
    public int f80c;

    /* JADX INFO: renamed from: d */
    public Object f81d;

    public C0008e(int i, String str, Object obj) {
        super(str, obj);
        this.f80c = i;
    }

    @Override // com.alipay.android.phone.mrpc.core.p003a.InterfaceC0009f
    /* JADX INFO: renamed from: a */
    public void mo145a(Object obj) {
        this.f81d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.p003a.InterfaceC0009f
    /* JADX INFO: renamed from: a */
    public byte[] mo146a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f81d != null) {
                arrayList.add(new BasicNameValuePair("extParam", AbstractC0112a.m594a(this.f81d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f78a));
            arrayList.add(new BasicNameValuePair("id", this.f80c + ""));
            C12826.toString(this.f79b);
            Object obj = this.f79b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? "[]" : AbstractC0112a.m594a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("request  =");
            sb.append(this.f79b);
            sb.append(":");
            sb.append(e);
            throw new RpcException(9, sb.toString() != null ? e.getMessage() : "", e);
        }
    }
}
