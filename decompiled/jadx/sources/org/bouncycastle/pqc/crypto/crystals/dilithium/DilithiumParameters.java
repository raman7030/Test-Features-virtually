package org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class DilithiumParameters {
    public static final DilithiumParameters dilithium2 = new DilithiumParameters("dilithium2", 2, false);
    public static final DilithiumParameters dilithium3 = new DilithiumParameters("dilithium3", 3, false);
    public static final DilithiumParameters dilithium5 = new DilithiumParameters("dilithium5", 5, false);

    /* JADX INFO: renamed from: k */
    public final int f81585k;
    public final String name;

    @Deprecated
    public final boolean usingAES;

    public DilithiumParameters(String str, int i, boolean z) {
        this.name = str;
        this.f81585k = i;
        this.usingAES = z;
    }

    public DilithiumEngine getEngine(SecureRandom secureRandom) {
        return new DilithiumEngine(this.f81585k, secureRandom, this.usingAES);
    }

    public String getName() {
        return this.name;
    }
}
