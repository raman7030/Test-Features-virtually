package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import java.util.ArrayList;
import l.C11003;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class e extends b {
    public int c;
    public Object d;

    public e(int i, String str, Object obj) {
        super(str, obj);
        this.c = i;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public void a(Object obj) {
        this.d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.d != null) {
                arrayList.add(new BasicNameValuePair("extParam", com.alipay.sdk.m.f.a.a(this.d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.a));
            arrayList.add(new BasicNameValuePair("id", this.c + ""));
            C11003.toString(this.b);
            Object obj = this.b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? "[]" : com.alipay.sdk.m.f.a.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("request  =");
            sb.append(this.b);
            sb.append(":");
            sb.append(e);
            throw new RpcException(9, sb.toString() != null ? e.getMessage() : "", e);
        }
    }
}
