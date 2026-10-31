package org.bouncycastle.jcajce.provider.asymmetric;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.spec.ContextParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class CONTEXT {
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.CONTEXT$";

    public class ContextAlgorithmParametersSpi extends AlgorithmParametersSpi {
        public ContextParameterSpec contextParameterSpec;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
            if (cls == null) {
                throw new NullPointerException("argument to getParameterSpec must not be null");
            }
            if (cls == ContextParameterSpec.class) {
                return this.contextParameterSpec;
            }
            throw new IllegalArgumentException("argument to getParameterSpec must be ContextParameterSpec.class");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (!(algorithmParameterSpec instanceof ContextParameterSpec)) {
                throw new IllegalArgumentException("argument to engineInit must be a ContextParameterSpec");
            }
            this.contextParameterSpec = (ContextParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ContextParameterSpec";
        }

        public boolean isASN1FormatString(String str) {
            return str == null || str.equals("ASN.1");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("AlgorithmParameters.CONTEXT", "org.bouncycastle.jcajce.provider.asymmetric.CONTEXT$ContextAlgorithmParametersSpi");
        }
    }
}
