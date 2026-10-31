package org.bouncycastle.jcajce.provider.digest;

import l.C19462;
import l.C20094;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM46315 = C20094.m46315("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM46315, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strM46315);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strM46315);
        configurableProvider.addAlgorithm("KeyGenerator." + strM46315, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strM46315);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strM46315);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strM46315 = C20094.m46315("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, strM46315);
        C19462.m44861(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, strM46315);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM46315 = C20094.m46315("KMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM46315, str2);
        configurableProvider.addAlgorithm("KeyGenerator." + strM46315, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, strM46315);
    }
}
