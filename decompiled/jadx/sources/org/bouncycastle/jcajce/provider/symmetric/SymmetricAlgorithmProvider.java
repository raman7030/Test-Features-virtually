package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import p067l.C21466;
import p067l.C6988;

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
        StringBuilder sbM48632 = C21466.m48632(str, "-CMAC", C6988.m16053("Alg.Alias.Mac.", str, "CMAC"), "KeyGenerator.", configurableProvider);
        sbM48632.append(str);
        sbM48632.append("-CMAC");
        configurableProvider.addAlgorithm(sbM48632.toString(), str3);
        configurableProvider.addAlgorithm(C6988.m16053("Alg.Alias.KeyGenerator.", str, "CMAC"), str + "-CMAC");
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-GMAC", str2);
        StringBuilder sbM48632 = C21466.m48632(str, "-GMAC", C6988.m16053("Alg.Alias.Mac.", str, "GMAC"), "KeyGenerator.", configurableProvider);
        sbM48632.append(str);
        sbM48632.append("-GMAC");
        configurableProvider.addAlgorithm(sbM48632.toString(), str3);
        configurableProvider.addAlgorithm(C6988.m16053("Alg.Alias.KeyGenerator.", str, "GMAC"), str + "-GMAC");
    }
}
