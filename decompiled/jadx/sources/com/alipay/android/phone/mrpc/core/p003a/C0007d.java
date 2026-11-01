package com.alipay.android.phone.mrpc.core.p003a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.alipay.sdk.p010m.p021f.AbstractC0112a;
import com.alipay.sdk.p010m.p058y.C0252o;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.a.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0007d extends AbstractC0004a {
    public C0007d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.p003a.InterfaceC0006c
    /* JADX INFO: renamed from: a */
    public Object mo144a() {
        try {
            String str = new String(this.f77b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(C0252o.f1206a);
            if (i == 1000) {
                return this.f76a == String.class ? jSONObject.optString(C0252o.f1208c) : AbstractC0112a.m593a(jSONObject.optString(C0252o.f1208c), this.f76a);
            }
            throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("response  =");
            sb.append(new String(this.f77b));
            sb.append(":");
            sb.append(e);
            throw new RpcException((Integer) 10, sb.toString() == null ? "" : e.getMessage());
        }
    }
}
