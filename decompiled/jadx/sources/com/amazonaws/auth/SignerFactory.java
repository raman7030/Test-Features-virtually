package com.amazonaws.auth;

import com.amazonaws.internal.config.InternalConfig;
import p067l.ConcurrentMapC12768;

/* JADX INFO: loaded from: classes.dex */
public final class SignerFactory {

    /* JADX INFO: renamed from: ֫ */
    public static final ConcurrentMapC12768 f1322;

    static {
        ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
        f1322 = concurrentMapC12768;
        concurrentMapC12768.put("QueryStringSignerType", QueryStringSigner.class);
        concurrentMapC12768.put("AWS4SignerType", AWS4Signer.class);
        concurrentMapC12768.put("NoOpSignerType", NoOpSigner.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1389(Class cls, String str) {
        f1322.put(str, cls);
    }

    /* JADX INFO: renamed from: ܽ */
    public static Signer m1391(String str, String str2) {
        return m1388(str, str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Signer m1390(String str, String str2) {
        return m1388(InternalConfig.Factory.m1455().m1453(str, str2).m1456(), str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Signer m1388(String str, String str2) {
        Class cls = (Class) f1322.get(str);
        if (cls == null) {
            throw new IllegalArgumentException();
        }
        try {
            Signer signer = (Signer) cls.newInstance();
            if (signer instanceof ServiceAwareSigner) {
                ((ServiceAwareSigner) signer).setServiceName(str2);
            }
            return signer;
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Cannot create an instance of ".concat(cls.getName()), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Cannot create an instance of ".concat(cls.getName()), e2);
        }
    }
}
