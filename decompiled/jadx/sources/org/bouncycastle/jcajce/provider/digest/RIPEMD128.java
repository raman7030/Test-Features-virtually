package org.bouncycastle.jcajce.provider.digest;

import l.C16014;
import l.C9045;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.RIPEMD128Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD128 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new RIPEMD128Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new RIPEMD128Digest((RIPEMD128Digest) this.digest);
            return digest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new RIPEMD128Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD128", 128, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = RIPEMD128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.RIPEMD128", sb.toString());
            StringBuilder sbM23342 = C9045.m23342("RIPEMD128", str, new StringBuilder("Alg.Alias.MessageDigest."), TeleTrusTObjectIdentifiers.ripemd128, configurableProvider);
            sbM23342.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "RIPEMD128", sbM23342.toString(), C16014.m37867(str, "$KeyGenerator"));
        }
    }
}
