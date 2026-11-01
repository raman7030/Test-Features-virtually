package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.j */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0024j extends AbstractC0003a {

    /* JADX INFO: renamed from: g */
    public InterfaceC0021g f107g;

    public C0024j(InterfaceC0021g interfaceC0021g, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, "application/x-www-form-urlencoded", z);
        this.f107g = interfaceC0021g;
    }

    /* JADX INFO: renamed from: a */
    private int m193a(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 15;
            case 9:
                return 16;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m194a(C0029o c0029o) {
        c0029o.m217a(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List listM157b = this.f107g.mo187c().m157b();
        if (listM157b == null || listM157b.isEmpty()) {
            return;
        }
        Iterator it = listM157b.iterator();
        while (it.hasNext()) {
            c0029o.m217a((Header) it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC0013ad m195b() {
        return this.f107g.mo186b();
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0037w
    /* JADX INFO: renamed from: a */
    public Object mo196a() {
        C0029o c0029o = new C0029o(this.f107g.mo185a());
        c0029o.m219a(this.f71b);
        c0029o.m215a(this.f74e);
        c0029o.m218a(this.f75f);
        c0029o.m216a("id", String.valueOf(this.f73d));
        c0029o.m216a("operationType", this.f72c);
        c0029o.m216a("gzip", String.valueOf(this.f107g.mo188d()));
        m194a(c0029o);
        Thread.currentThread().getId();
        c0029o.toString();
        try {
            C0036v c0036v = (C0036v) m195b().mo160a(c0029o).get();
            if (c0036v != null) {
                return c0036v.m265b();
            }
            throw new RpcException((Integer) 9, "response is null");
        } catch (InterruptedException e) {
            throw new RpcException(13, "", e);
        } catch (CancellationException e2) {
            throw new RpcException(13, "", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e3);
            }
            HttpException httpException = (HttpException) cause;
            throw new RpcException(Integer.valueOf(m193a(httpException.getCode())), httpException.getMsg());
        }
    }
}
