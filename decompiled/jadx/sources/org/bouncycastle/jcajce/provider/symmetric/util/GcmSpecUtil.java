package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import l.C19370;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes.dex */
public class GcmSpecUtil {
    public static final Constructor constructor;
    public static final Class gcmSpecClass;
    public static final Method iv;
    public static final Method tLen;

    static {
        Method methodExtractMethod;
        Class clsLoadClass = ClassUtil.loadClass(GcmSpecUtil.class, "javax.crypto.spec.GCMParameterSpec");
        gcmSpecClass = clsLoadClass;
        if (clsLoadClass != null) {
            constructor = extractConstructor();
            tLen = extractMethod("getTLen");
            methodExtractMethod = extractMethod("getIV");
        } else {
            methodExtractMethod = null;
            constructor = null;
            tLen = null;
        }
        iv = methodExtractMethod;
    }

    public static AEADParameters extractAeadParameters(final KeyParameter keyParameter, final AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        try {
            return (AEADParameters) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.3
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return new AEADParameters(keyParameter, ((Integer) GcmSpecUtil.tLen.invoke(algorithmParameterSpec, null)).intValue(), (byte[]) GcmSpecUtil.iv.invoke(algorithmParameterSpec, null));
                }
            });
        } catch (Exception unused) {
            throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
        }
    }

    public static Constructor extractConstructor() {
        try {
            return (Constructor) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return GcmSpecUtil.gcmSpecClass.getConstructor(Integer.TYPE, byte[].class);
                }
            });
        } catch (PrivilegedActionException unused) {
            return null;
        }
    }

    public static GCMParameters extractGcmParameters(final AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        try {
            return (GCMParameters) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.4
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return new GCMParameters((byte[]) GcmSpecUtil.iv.invoke(algorithmParameterSpec, null), ((Integer) GcmSpecUtil.tLen.invoke(algorithmParameterSpec, null)).intValue() / 8);
                }
            });
        } catch (Exception unused) {
            throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
        }
    }

    public static Method extractMethod(final String str) {
        try {
            return (Method) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.2
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return GcmSpecUtil.gcmSpecClass.getDeclaredMethod(str, null);
                }
            });
        } catch (PrivilegedActionException unused) {
            return null;
        }
    }

    public static boolean gcmSpecExists() {
        return gcmSpecClass != null;
    }

    public static boolean gcmSpecExtractable() {
        return constructor != null;
    }

    public static boolean isGcmSpec(Class cls) {
        return gcmSpecClass == cls;
    }

    public static boolean isGcmSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        Class cls = gcmSpecClass;
        return cls != null && cls.isInstance(algorithmParameterSpec);
    }

    public static AlgorithmParameterSpec extractGcmSpec(ASN1Primitive aSN1Primitive) throws InvalidParameterSpecException {
        try {
            GCMParameters gCMParameters = GCMParameters.getInstance(aSN1Primitive);
            return (AlgorithmParameterSpec) constructor.newInstance(Integers.valueOf(gCMParameters.getIcvLen() * 8), gCMParameters.getNonce());
        } catch (Exception e) {
            throw new InvalidParameterSpecException(C19370.m44629(e, new StringBuilder("Construction failed: ")));
        }
    }
}
