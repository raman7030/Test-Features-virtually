package l;

import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۢᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 97G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9782 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24785(C7381 c7381) {
        c7381.m19871("StrictHostKeyChecking", "no");
        c7381.m19871("server_host_key", m24784(c7381.m19856("server_host_key")));
        c7381.m19871("PubkeyAcceptedAlgorithms", m24784(c7381.m19856("PubkeyAcceptedAlgorithms")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24784(String str) {
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
