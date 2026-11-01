package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import p067l.C20865;
import p067l.C21466;

/* JADX INFO: loaded from: classes.dex */
public abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM48631 = C21466.m48631("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM48631, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strM48631);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strM48631);
        configurableProvider.addAlgorithm("KeyGenerator." + strM48631, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strM48631);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strM48631);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strM48631 = C21466.m48631("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, strM48631);
        C20865.m47157(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, strM48631);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM48631 = C21466.m48631("KMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM48631, str2);
        configurableProvider.addAlgorithm("KeyGenerator." + strM48631, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, strM48631);
    }
}
