package org.bouncycastle.jcajce.provider.symmetric;

import l.C20094;
import l.C4860;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac.POLY1305-" + str, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.POLY1305" + str, "POLY1305-" + str);
        configurableProvider.addAlgorithm("KeyGenerator.POLY1305-" + str, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.POLY1305" + str, "POLY1305-" + str);
    }

    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-CMAC", str2);
        StringBuilder sbM46316 = C20094.m46316(str, "-CMAC", C4860.m14172("Alg.Alias.Mac.", str, "CMAC"), "KeyGenerator.", configurableProvider);
        sbM46316.append(str);
        sbM46316.append("-CMAC");
        configurableProvider.addAlgorithm(sbM46316.toString(), str3);
        configurableProvider.addAlgorithm(C4860.m14172("Alg.Alias.KeyGenerator.", str, "CMAC"), str + "-CMAC");
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-GMAC", str2);
        StringBuilder sbM46316 = C20094.m46316(str, "-GMAC", C4860.m14172("Alg.Alias.Mac.", str, "GMAC"), "KeyGenerator.", configurableProvider);
        sbM46316.append(str);
        sbM46316.append("-GMAC");
        configurableProvider.addAlgorithm(sbM46316.toString(), str3);
        configurableProvider.addAlgorithm(C4860.m14172("Alg.Alias.KeyGenerator.", str, "GMAC"), str + "-GMAC");
    }
}
