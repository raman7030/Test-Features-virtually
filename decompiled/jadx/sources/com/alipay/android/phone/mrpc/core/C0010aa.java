package com.alipay.android.phone.mrpc.core;

import com.alipay.android.phone.mrpc.core.p003a.C0007d;
import com.alipay.android.phone.mrpc.core.p003a.C0008e;
import com.alipay.android.phone.mrpc.core.p003a.InterfaceC0006c;
import com.alipay.android.phone.mrpc.core.p003a.InterfaceC0009f;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.aa */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0010aa {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f82a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f83b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public byte f84c = 0;

    /* JADX INFO: renamed from: d */
    public AtomicInteger f85d = new AtomicInteger();

    /* JADX INFO: renamed from: e */
    public C0039y f86e;

    public C0010aa(C0039y c0039y) {
        this.f86e = c0039y;
    }

    /* JADX INFO: renamed from: a */
    private void m147a(Object obj, Class cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    /* JADX INFO: renamed from: a */
    private void m148a(Object obj, byte[] bArr, Class cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    /* JADX INFO: renamed from: a */
    private void m149a(Object obj, byte[] bArr, Class cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) {
        throw rpcException;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m150a(Method method, Object[] objArr, String str, int i, boolean z) {
        InterfaceC0009f interfaceC0009fM152a = m152a(i, str, objArr);
        ThreadLocal threadLocal = f83b;
        if (threadLocal.get() != null) {
            interfaceC0009fM152a.mo145a(threadLocal.get());
        }
        byte[] bArr = (byte[]) m153a(method, i, str, interfaceC0009fM152a.mo146a(), z).mo196a();
        threadLocal.set(null);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0006c m151a(Type type, byte[] bArr) {
        return new C0007d(type, bArr);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0009f m152a(int i, String str, Object[] objArr) {
        return new C0008e(i, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0037w m153a(Method method, int i, String str, byte[] bArr, boolean z) {
        return new C0024j(this.f86e.m266a(), method, i, str, bArr, z);
    }

    /* JADX INFO: renamed from: a */
    public Object m154a(Object obj, Class cls, Method method, Object[] objArr) {
        byte[] bArr;
        if (C0012ac.m159a()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        ThreadLocal threadLocal = f82a;
        byte[] bArrM150a = null;
        threadLocal.set(null);
        f83b.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String strValue = operationType.value();
        int iIncrementAndGet = this.f85d.incrementAndGet();
        m147a(obj, cls, method, objArr, annotations);
        try {
            if (this.f84c == 0) {
                bArrM150a = m150a(method, objArr, strValue, iIncrementAndGet, z);
                Object objMo144a = m151a(genericReturnType, bArrM150a).mo144a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(objMo144a);
                }
            }
            bArr = bArrM150a;
        } catch (RpcException e) {
            e.setOperationType(strValue);
            bArr = bArrM150a;
            m149a(obj, bArr, cls, method, objArr, annotations, e);
        }
        m148a(obj, bArr, cls, method, objArr, annotations);
        return f82a.get();
    }
}
