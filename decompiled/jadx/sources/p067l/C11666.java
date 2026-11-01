package p067l;

import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۢᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 97G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11666 {
    /* JADX INFO: renamed from: ֫ */
    public static void m26799(C9383 c9383) {
        c9383.m21844("StrictHostKeyChecking", "no");
        c9383.m21844("server_host_key", m26798(c9383.m21829("server_host_key")));
        c9383.m21844("PubkeyAcceptedAlgorithms", m26798(c9383.m21829("PubkeyAcceptedAlgorithms")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26798(String str) {
        if (str == null || str.isEmpty()) {
            return OpenSSHPublicKeyUtil.RSA;
        }
        for (String str2 : str.split(",")) {
            if (OpenSSHPublicKeyUtil.RSA.equals(str2.trim())) {
                return str;
            }
        }
        return str.concat(",ssh-rsa");
    }
}
