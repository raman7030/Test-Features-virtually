package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import p067l.C6988;

/* JADX INFO: loaded from: classes2.dex */
public class LMSKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final Map otsParameters;
    public static final Map sigParameters;
    public final LMOtsParameters lmOtsParameters;
    public final LMSigParameters lmSigParams;

    static {
        HashMap map = new HashMap();
        sigParameters = map;
        HashMap map2 = new HashMap();
        otsParameters = map2;
        map.put("lms-sha256-n32-h5", LMSigParameters.lms_sha256_n32_h5);
        map.put("lms-sha256-n32-h10", LMSigParameters.lms_sha256_n32_h10);
        map.put("lms-sha256-n32-h15", LMSigParameters.lms_sha256_n32_h15);
        map.put("lms-sha256-n32-h20", LMSigParameters.lms_sha256_n32_h20);
        map.put("lms-sha256-n32-h25", LMSigParameters.lms_sha256_n32_h25);
        map.put("lms-sha256-n24-h5", LMSigParameters.lms_sha256_n24_h5);
        map.put("lms-sha256-n24-h10", LMSigParameters.lms_sha256_n24_h10);
        map.put("lms-sha256-n24-h15", LMSigParameters.lms_sha256_n24_h15);
        map.put("lms-sha256-n24-h20", LMSigParameters.lms_sha256_n24_h20);
        map.put("lms-sha256-n24-h25", LMSigParameters.lms_sha256_n24_h25);
        map.put("lms-shake256-n32-h5", LMSigParameters.lms_shake256_n32_h5);
        map.put("lms-shake256-n32-h10", LMSigParameters.lms_shake256_n32_h10);
        map.put("lms-shake256-n32-h15", LMSigParameters.lms_shake256_n32_h15);
        map.put("lms-shake256-n32-h20", LMSigParameters.lms_shake256_n32_h20);
        map.put("lms-shake256-n32-h25", LMSigParameters.lms_shake256_n32_h25);
        map.put("lms-shake256-n24-h5", LMSigParameters.lms_shake256_n24_h5);
        map.put("lms-shake256-n24-h10", LMSigParameters.lms_shake256_n24_h10);
        map.put("lms-shake256-n24-h15", LMSigParameters.lms_shake256_n24_h15);
        map.put("lms-shake256-n24-h20", LMSigParameters.lms_shake256_n24_h20);
        map.put("lms-shake256-n24-h25", LMSigParameters.lms_shake256_n24_h25);
        map2.put("sha256-n32-w1", LMOtsParameters.sha256_n32_w1);
        map2.put("sha256-n32-w2", LMOtsParameters.sha256_n32_w2);
        map2.put("sha256-n32-w4", LMOtsParameters.sha256_n32_w4);
        map2.put("sha256-n32-w8", LMOtsParameters.sha256_n32_w8);
    }

    public LMSKeyGenParameterSpec(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters) {
        this.lmSigParams = lMSigParameters;
        this.lmOtsParameters = lMOtsParameters;
    }

    public LMOtsParameters getOtsParams() {
        return this.lmOtsParameters;
    }

    public LMSigParameters getSigParams() {
        return this.lmSigParams;
    }

    public static LMSKeyGenParameterSpec fromNames(String str, String str2) {
        Map map = sigParameters;
        if (!map.containsKey(str)) {
            throw new IllegalArgumentException(C6988.m16053("LM signature parameter name ", str, " not recognized"));
        }
        Map map2 = otsParameters;
        if (map2.containsKey(str2)) {
            return new LMSKeyGenParameterSpec((LMSigParameters) map.get(str), (LMOtsParameters) map2.get(str2));
        }
        throw new IllegalArgumentException(C6988.m16053("LM OTS parameter name ", str2, " not recognized"));
    }
}
