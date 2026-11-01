package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: classes2.dex */
public class RainbowParameters implements CipherParameters {
    public static final int len_pkseed = 32;
    public static final int len_salt = 16;
    public static final int len_skseed = 32;
    public static final RainbowParameters rainbowIIIcircumzenithal;
    public static final RainbowParameters rainbowIIIclassic;
    public static final RainbowParameters rainbowIIIcompressed;
    public static final RainbowParameters rainbowVcircumzenithal;
    public static final RainbowParameters rainbowVclassic;
    public static final RainbowParameters rainbowVcompressed;
    public final Digest hash_algo;

    /* JADX INFO: renamed from: m */
    public final int f81706m;

    /* JADX INFO: renamed from: n */
    public final int f81707n;
    public final String name;

    /* JADX INFO: renamed from: o1 */
    public final int f81708o1;

    /* JADX INFO: renamed from: o2 */
    public final int f81709o2;

    /* JADX INFO: renamed from: v1 */
    public final int f81710v1;

    /* JADX INFO: renamed from: v2 */
    public final int f81711v2;
    public final Version version;

    static {
        Version version = Version.CLASSIC;
        rainbowIIIclassic = new RainbowParameters("rainbow-III-classic", 3, version);
        Version version2 = Version.CIRCUMZENITHAL;
        rainbowIIIcircumzenithal = new RainbowParameters("rainbow-III-circumzenithal", 3, version2);
        Version version3 = Version.COMPRESSED;
        rainbowIIIcompressed = new RainbowParameters("rainbow-III-compressed", 3, version3);
        rainbowVclassic = new RainbowParameters("rainbow-V-classic", 5, version);
        rainbowVcircumzenithal = new RainbowParameters("rainbow-V-circumzenithal", 5, version2);
        rainbowVcompressed = new RainbowParameters("rainbow-V-compressed", 5, version3);
    }

    public RainbowParameters(String str, int i, Version version) {
        Digest sHA384Digest;
        this.name = str;
        if (i == 3) {
            this.f81710v1 = 68;
            this.f81708o1 = 32;
            this.f81709o2 = 48;
            sHA384Digest = new SHA384Digest();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.f81710v1 = 96;
            this.f81708o1 = 36;
            this.f81709o2 = 64;
            sHA384Digest = new SHA512Digest();
        }
        this.hash_algo = sHA384Digest;
        int i2 = this.f81710v1;
        int i3 = this.f81708o1;
        this.f81711v2 = i2 + i3;
        int i4 = this.f81709o2;
        this.f81707n = i2 + i3 + i4;
        this.f81706m = i3 + i4;
        this.version = version;
    }

    public Digest getHash_algo() {
        return this.hash_algo;
    }

    public int getLen_pkseed() {
        return 32;
    }

    public int getLen_salt() {
        return 16;
    }

    public int getLen_skseed() {
        return 32;
    }

    public int getM() {
        return this.f81706m;
    }

    public int getN() {
        return this.f81707n;
    }

    public String getName() {
        return this.name;
    }

    public int getO1() {
        return this.f81708o1;
    }

    public int getO2() {
        return this.f81709o2;
    }

    public int getV1() {
        return this.f81710v1;
    }

    public int getV2() {
        return this.f81711v2;
    }

    public Version getVersion() {
        return this.version;
    }
}
