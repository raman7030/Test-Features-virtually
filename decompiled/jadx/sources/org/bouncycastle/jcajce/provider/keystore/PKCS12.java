package org.bouncycastle.jcajce.provider.keystore;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.Properties;
import p067l.C21740;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12 {
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.keystore.pkcs12.";

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String propertyValue = Properties.getPropertyValue("org.bouncycastle.pkcs12.default");
            if (propertyValue != null) {
                StringBuilder sbM49019 = C21740.m49019("Alg.Alias.KeyStore.PKCS12", propertyValue, "Alg.Alias.KeyStore.BCPKCS12", propertyValue, configurableProvider);
                sbM49019.append(propertyValue.substring(0, 5));
                sbM49019.append("-DEF");
                sbM49019.append(propertyValue.substring(6));
                configurableProvider.addAlgorithm("Alg.Alias.KeyStore.PKCS12-DEF", sbM49019.toString());
            } else {
                configurableProvider.addAlgorithm("KeyStore.PKCS12", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$BCPKCS12KeyStore");
                configurableProvider.addAlgorithm("KeyStore.BCPKCS12", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$BCPKCS12KeyStore");
                configurableProvider.addAlgorithm("KeyStore.PKCS12-DEF", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStore");
            }
            configurableProvider.addAlgorithm("KeyStore.PKCS12-3DES-40RC2", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$BCPKCS12KeyStore");
            configurableProvider.addAlgorithm("KeyStore.PKCS12-3DES-3DES", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$BCPKCS12KeyStore3DES");
            configurableProvider.addAlgorithm("KeyStore.PKCS12-AES256-AES128", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStoreAES256");
            configurableProvider.addAlgorithm("KeyStore.PKCS12-AES256-AES128-GCM", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStoreAES256GCM");
            configurableProvider.addAlgorithm("KeyStore.PKCS12-DEF-3DES-40RC2", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStore");
            configurableProvider.addAlgorithm("KeyStore.PKCS12-DEF-3DES-3DES", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStore3DES");
            configurableProvider.addAlgorithm("KeyStore.PKCS12-DEF-AES256-AES128", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStoreAES256");
            configurableProvider.addAlgorithm("KeyStore.PKCS12-DEF-AES256-AES128-GCM", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStoreAES256GCM");
        }
    }
}
