package l;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.᩶᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27Y0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20413 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5265 f65866;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Hashtable f65867;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1362 f65868;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22529 f65869;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC19002 f65870;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Vector f65871;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m46773(InterfaceC1362 interfaceC1362) {
        this.f65868 = interfaceC1362;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized InterfaceC1362 m46775() {
        return this.f65868;
    }

    static {
        String property;
        String property2;
        String property3;
        String property4;
        String property5;
        String property6;
        String property7;
        String property8;
        String property9;
        String property10;
        String property11;
        String property12;
        String property13;
        String property14;
        String property15;
        String property16;
        String property17 = "6";
        String property18 = "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1";
        String property19 = "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr";
        String property20 = "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256";
        String property21 = "";
        String property22 = "yes";
        Hashtable hashtable = new Hashtable();
        f65867 = hashtable;
        String property23 = "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256";
        byte[] bArr = C19356.f62660;
        try {
            property23 = System.getProperty("jsch.kex", "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256");
        } catch (SecurityException unused) {
        }
        hashtable.put("kex", property23);
        Hashtable hashtable2 = f65867;
        try {
            property = System.getProperty("jsch.server_host_key", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
        } catch (SecurityException unused2) {
            property = "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256";
        }
        hashtable2.put("server_host_key", property);
        Hashtable hashtable3 = f65867;
        try {
            property2 = System.getProperty("jsch.prefer_known_host_key_types", "yes");
        } catch (SecurityException unused3) {
            property2 = "yes";
        }
        hashtable3.put("prefer_known_host_key_types", property2);
        Hashtable hashtable4 = f65867;
        try {
            property3 = System.getProperty("jsch.enable_strict_kex", "yes");
        } catch (SecurityException unused4) {
            property3 = "yes";
        }
        hashtable4.put("enable_strict_kex", property3);
        Hashtable hashtable5 = f65867;
        try {
            property4 = System.getProperty("jsch.require_strict_kex", "no");
        } catch (SecurityException unused5) {
            property4 = "no";
        }
        hashtable5.put("require_strict_kex", property4);
        Hashtable hashtable6 = f65867;
        try {
            property5 = System.getProperty("jsch.enable_server_sig_algs", "yes");
        } catch (SecurityException unused6) {
            property5 = "yes";
        }
        hashtable6.put("enable_server_sig_algs", property5);
        Hashtable hashtable7 = f65867;
        try {
            property6 = System.getProperty("jsch.enable_ext_info_in_auth", "yes");
        } catch (SecurityException unused7) {
            property6 = "yes";
        }
        hashtable7.put("enable_ext_info_in_auth", property6);
        Hashtable hashtable8 = f65867;
        try {
            property7 = System.getProperty("jsch.cipher", "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr");
        } catch (SecurityException unused8) {
            property7 = "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr";
        }
        hashtable8.put("cipher.s2c", property7);
        Hashtable hashtable9 = f65867;
        try {
            property19 = System.getProperty("jsch.cipher", "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr");
        } catch (SecurityException unused9) {
        }
        hashtable9.put("cipher.c2s", property19);
        Hashtable hashtable10 = f65867;
        try {
            property8 = System.getProperty("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1");
        } catch (SecurityException unused10) {
            property8 = "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1";
        }
        hashtable10.put("mac.s2c", property8);
        Hashtable hashtable11 = f65867;
        try {
            property18 = System.getProperty("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1");
        } catch (SecurityException unused11) {
        }
        hashtable11.put("mac.c2s", property18);
        Hashtable hashtable12 = f65867;
        try {
            property9 = System.getProperty("jsch.compression", "none");
        } catch (SecurityException unused12) {
            property9 = "none";
        }
        hashtable12.put("compression.s2c", property9);
        Hashtable hashtable13 = f65867;
        try {
            property10 = System.getProperty("jsch.compression", "none");
        } catch (SecurityException unused13) {
            property10 = "none";
        }
        hashtable13.put("compression.c2s", property10);
        Hashtable hashtable14 = f65867;
        try {
            property11 = System.getProperty("jsch.lang", "");
        } catch (SecurityException unused14) {
            property11 = "";
        }
        hashtable14.put("lang.s2c", property11);
        Hashtable hashtable15 = f65867;
        try {
            property12 = System.getProperty("jsch.lang", "");
        } catch (SecurityException unused15) {
            property12 = "";
        }
        hashtable15.put("lang.c2s", property12);
        Hashtable hashtable16 = f65867;
        String property24 = "2048";
        try {
            property24 = System.getProperty("jsch.dhgex_min", "2048");
        } catch (SecurityException unused16) {
        }
        hashtable16.put("dhgex_min", property24);
        Hashtable hashtable17 = f65867;
        String property25 = "8192";
        try {
            property25 = System.getProperty("jsch.dhgex_max", "8192");
        } catch (SecurityException unused17) {
        }
        hashtable17.put("dhgex_max", property25);
        Hashtable hashtable18 = f65867;
        String property26 = "3072";
        try {
            property26 = System.getProperty("jsch.dhgex_preferred", "3072");
        } catch (SecurityException unused18) {
        }
        hashtable18.put("dhgex_preferred", property26);
        Hashtable hashtable19 = f65867;
        try {
            property13 = System.getProperty("jsch.compression_level", "6");
        } catch (SecurityException unused19) {
            property13 = "6";
        }
        hashtable19.put("compression_level", property13);
        Hashtable hashtable20 = f65867;
        C15472.m36562(C11241.class, hashtable20, "diffie-hellman-group-exchange-sha1", C2068.class, "diffie-hellman-group1-sha1");
        C15472.m36562(C19999.class, hashtable20, "diffie-hellman-group14-sha1", C18296.class, "diffie-hellman-group-exchange-sha256");
        C15472.m36562(C16884.class, hashtable20, "diffie-hellman-group-exchange-sha224@ssh.com", C17590.class, "diffie-hellman-group-exchange-sha384@ssh.com");
        C15472.m36562(C14767.class, hashtable20, "diffie-hellman-group-exchange-sha512@ssh.com", C22115.class, "diffie-hellman-group14-sha256");
        C15472.m36562(C12237.class, hashtable20, "diffie-hellman-group15-sha512", C11532.class, "diffie-hellman-group16-sha512");
        C15472.m36562(C13647.class, hashtable20, "diffie-hellman-group17-sha512", C7298.class, "diffie-hellman-group18-sha512");
        C15472.m36562(C22115.class, hashtable20, "diffie-hellman-group14-sha256@ssh.com", C21410.class, "diffie-hellman-group14-sha224@ssh.com");
        C15472.m36562(C3065.class, hashtable20, "diffie-hellman-group15-sha256@ssh.com", C12942.class, "diffie-hellman-group15-sha384@ssh.com");
        C15472.m36562(C11532.class, hashtable20, "diffie-hellman-group16-sha512@ssh.com", C5887.class, "diffie-hellman-group16-sha384@ssh.com");
        C15472.m36562(C7298.class, hashtable20, "diffie-hellman-group18-sha512@ssh.com", C2942.class, "ecdsa-sha2-nistp256");
        C15472.m36562(C12819.class, hashtable20, "ecdsa-sha2-nistp384", C12114.class, "ecdsa-sha2-nistp521");
        C15472.m36562(C18588.class, hashtable20, "ecdh-sha2-nistp256", C0242.class, "ecdh-sha2-nistp384");
        C15472.m36562(C0948.class, hashtable20, "ecdh-sha2-nistp521", C10388.class, "ecdh-sha2-nistp");
        hashtable20.put("curve25519-sha256", C9416.class.getName());
        hashtable20.put("curve25519-sha256@libssh.org", C9416.class.getName());
        hashtable20.put("curve448-sha512", C2360.class.getName());
        hashtable20.put("mlkem768x25519-sha256", C8710.class.getName());
        C15472.m36562(C19294.class, hashtable20, "mlkem768nistp256-sha256", C5182.class, "mlkem1024nistp384-sha384");
        hashtable20.put("sntrup761x25519-sha512", C15764.class.getName());
        hashtable20.put("sntrup761x25519-sha512@openssh.com", C15764.class.getName());
        hashtable20.put("mlkem768", C10183.class.getName());
        hashtable20.put("mlkem1024", C12299.class.getName());
        C15472.m36562(C13709.class, hashtable20, "sntrup761", C12504.class, "dh");
        C15472.m36562(C17799.class, hashtable20, "3des-cbc", C3332.class, "blowfish-cbc");
        C15472.m36562(C16346.class, hashtable20, "hmac-sha1", C1530.class, "hmac-sha1-96");
        C15472.m36562(C23402.class, hashtable20, "hmac-sha2-256", C8586.class, "hmac-sha2-512");
        C15472.m36562(C13914.class, hashtable20, "hmac-md5", C11799.class, "hmac-md5-96");
        C15472.m36562(C17758.class, hashtable20, "hmac-sha1-etm@openssh.com", C10703.class, "hmac-sha1-96-etm@openssh.com");
        C15472.m36562(C6469.class, hashtable20, "hmac-sha2-256-etm@openssh.com", C15640.class, "hmac-sha2-512-etm@openssh.com");
        C15472.m36562(C7565.class, hashtable20, "hmac-md5-etm@openssh.com", C23087.class, "hmac-md5-96-etm@openssh.com");
        C15472.m36562(C14229.class, hashtable20, "hmac-sha256-2@ssh.com", C17052.class, "hmac-sha224@ssh.com");
        C15472.m36562(C20581.class, hashtable20, "hmac-sha256@ssh.com", C9292.class, "hmac-sha384@ssh.com");
        C15472.m36562(C2236.class, hashtable20, "hmac-sha512@ssh.com", C7880.class, "sha-1");
        C15472.m36562(C14935.class, hashtable20, "sha-224", C21287.class, "sha-256");
        C15472.m36562(C21992.class, hashtable20, "sha-384", C19876.class, "sha-512");
        C15472.m36562(C0118.class, hashtable20, "md5", C7880.class, "sha1");
        String property27 = "sha256";
        C15472.m36562(C14935.class, hashtable20, "sha224", C21287.class, "sha256");
        C15472.m36562(C21992.class, hashtable20, "sha384", C19876.class, "sha512");
        C15472.m36562(C4353.class, hashtable20, "signature.dss", C5764.class, OpenSSHPublicKeyUtil.RSA);
        C15472.m36562(C13524.class, hashtable20, "rsa-sha2-256", C10744.class, "rsa-sha2-512");
        C15472.m36562(C22697.class, hashtable20, "ssh-rsa-sha224@ssh.com", C7175.class, "ssh-rsa-sha256@ssh.com");
        C15472.m36562(C1571.class, hashtable20, "ssh-rsa-sha384@ssh.com", C16387.class, "ssh-rsa-sha512@ssh.com");
        C15472.m36562(C3647.class, hashtable20, "keypairgen.dsa", C19170.class, "keypairgen.rsa");
        C15472.m36562(C18464.class, hashtable20, "keypairgen.ecdsa", C0824.class, "random");
        C15472.m36562(C20061.class, hashtable20, "hmac-ripemd160", C3127.class, "hmac-ripemd160@openssh.com");
        C15472.m36562(C4538.class, hashtable20, "hmac-ripemd160-etm@openssh.com", C6593.class, "none");
        C15472.m36562(C19561.class, hashtable20, "aes128-gcm@openssh.com", C15325.class, "aes256-gcm@openssh.com");
        C15472.m36562(C4038.class, hashtable20, "aes128-cbc", C0509.class, "aes192-cbc");
        hashtable20.put("aes256-cbc", C1215.class.getName());
        hashtable20.put("rijndael-cbc@lysator.liu.se", C1215.class.getName());
        String property28 = "chacha20-poly1305@openssh.com";
        hashtable20.put("chacha20-poly1305@openssh.com", C22177.class.getName());
        hashtable20.put("cast128-cbc", C15120.class.getName());
        C15472.m36562(C21472.class, hashtable20, "cast128-ctr", C16737.class, "twofish128-cbc");
        hashtable20.put("twofish192-cbc", C17443.class.getName());
        hashtable20.put("twofish256-cbc", C23793.class.getName());
        hashtable20.put("twofish-cbc", C23793.class.getName());
        hashtable20.put("twofish128-ctr", C18149.class.getName());
        C15472.m36562(C14620.class, hashtable20, "twofish192-ctr", C6860.class, "twofish256-ctr");
        C15472.m36562(C22882.class, hashtable20, "seed-cbc@ssh.com", C18855.class, "aes128-ctr");
        C15472.m36562(C5449.class, hashtable20, "aes192-ctr", C8271.class, "aes256-ctr");
        C15472.m36562(C17093.class, hashtable20, "3des-ctr", C13209.class, "blowfish-ctr");
        C15472.m36562(C4743.class, hashtable20, "arcfour", C22382.class, "arcfour128");
        C15472.m36562(C20266.class, hashtable20, "arcfour256", C15826.class, "userauth.none");
        C15472.m36562(C2422.class, hashtable20, "userauth.password", C8772.class, "userauth.keyboard-interactive");
        hashtable20.put("userauth.publickey", C3833.class.getName());
        hashtable20.put("zlib", C9333.class.getName());
        hashtable20.put("zlib@openssh.com", C9333.class.getName());
        hashtable20.put("pbkdf2", C5058.class.getName());
        hashtable20.put("bcrypt", C2627.class.getName());
        hashtable20.put("Argon2d", C8066.class.getName());
        hashtable20.put("Argon2i", C8066.class.getName());
        hashtable20.put("Argon2id", C8066.class.getName());
        C15472.m36562(C11594.class, hashtable20, "scrypt", C8977.class, "xdh");
        C15472.m36562(C13004.class, hashtable20, "keypairgen.eddsa", C7360.class, OpenSSHPublicKeyUtil.ED_25519);
        C15472.m36562(C1921.class, hashtable20, "ssh-ed448", C13004.class, "keypairgen_fromprivate.eddsa");
        hashtable20.put("StrictHostKeyChecking", "ask");
        hashtable20.put("HashKnownHosts", "no");
        String property29 = "gssapi-with-mic,publickey,keyboard-interactive,password";
        try {
            property29 = System.getProperty("jsch.preferred_authentications", "gssapi-with-mic,publickey,keyboard-interactive,password");
        } catch (SecurityException unused20) {
        }
        hashtable20.put("PreferredAuthentications", property29);
        Hashtable hashtable21 = f65867;
        try {
            property20 = System.getProperty("jsch.client_pubkey", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
        } catch (SecurityException unused21) {
        }
        hashtable21.put("PubkeyAcceptedAlgorithms", property20);
        Hashtable hashtable22 = f65867;
        try {
            property14 = System.getProperty("jsch.enable_pubkey_auth_query", "yes");
        } catch (SecurityException unused22) {
            property14 = "yes";
        }
        hashtable22.put("enable_pubkey_auth_query", property14);
        Hashtable hashtable23 = f65867;
        try {
            property15 = System.getProperty("jsch.try_additional_pubkey_algorithms", "yes");
        } catch (SecurityException unused23) {
            property15 = "yes";
        }
        hashtable23.put("try_additional_pubkey_algorithms", property15);
        Hashtable hashtable24 = f65867;
        try {
            property16 = System.getProperty("jsch.enable_auth_none", "yes");
        } catch (SecurityException unused24) {
            property16 = "yes";
        }
        hashtable24.put("enable_auth_none", property16);
        Hashtable hashtable25 = f65867;
        try {
            property22 = System.getProperty("jsch.use_sftp_write_flush_workaround", "yes");
        } catch (SecurityException unused25) {
        }
        hashtable25.put("use_sftp_write_flush_workaround", property22);
        Hashtable hashtable26 = f65867;
        try {
            property28 = System.getProperty("jsch.check_ciphers", "chacha20-poly1305@openssh.com");
        } catch (SecurityException unused26) {
        }
        hashtable26.put("CheckCiphers", property28);
        Hashtable hashtable27 = f65867;
        try {
            property21 = System.getProperty("jsch.check_macs", "");
        } catch (SecurityException unused27) {
        }
        hashtable27.put("CheckMacs", property21);
        Hashtable hashtable28 = f65867;
        String property30 = "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512";
        try {
            property30 = System.getProperty("jsch.check_kexes", "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512");
        } catch (SecurityException unused28) {
        }
        hashtable28.put("CheckKexes", property30);
        Hashtable hashtable29 = f65867;
        String property31 = "ssh-ed25519,ssh-ed448";
        try {
            property31 = System.getProperty("jsch.check_signatures", "ssh-ed25519,ssh-ed448");
        } catch (SecurityException unused29) {
        }
        hashtable29.put("CheckSignatures", property31);
        Hashtable hashtable30 = f65867;
        try {
            property27 = System.getProperty("jsch.fingerprint_hash", "sha256");
        } catch (SecurityException unused30) {
        }
        hashtable30.put("FingerprintHash", property27);
        Hashtable hashtable31 = f65867;
        try {
            property17 = System.getProperty("jsch.max_auth_tries", "6");
        } catch (SecurityException unused31) {
        }
        hashtable31.put("MaxAuthTries", property17);
        f65867.put("ClearAllForwardings", "no");
        f65866 = new C21824();
    }

    public C20413() {
        C22529 c22529 = new C22529();
        this.f65869 = c22529;
        this.f65871 = new Vector();
        this.f65868 = new C0325(c22529);
        this.f65870 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7381 m46770(int i, String str, String str2) throws C12651 {
        if (str2 == null) {
            throw new C12651("host must not be null.");
        }
        return new C7381(this, str, str2, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46774(C7381 c7381) {
        synchronized (this.f65871) {
            this.f65871.addElement(c7381);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46776(C7381 c7381) {
        synchronized (this.f65871) {
            this.f65871.remove(c7381);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19002 m46771() {
        if (this.f65870 == null) {
            this.f65870 = new C19377(this);
        }
        return this.f65870;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46772(InterfaceC0656 interfaceC0656, byte[] bArr) throws Throwable {
        if (bArr != null) {
            try {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                try {
                    if (!((C5596) interfaceC0656).mo2688(bArr2)) {
                        throw new C12651("Incorrect passphrase provided.");
                    }
                    C19356.m44596(bArr2);
                } catch (Throwable th) {
                    th = th;
                    bArr = bArr2;
                    C19356.m44596(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        InterfaceC1362 interfaceC1362 = this.f65868;
        if (interfaceC1362 instanceof C0325) {
            ((C0325) interfaceC1362).m1740(interfaceC0656);
            return;
        }
        C5596 c5596 = (C5596) interfaceC0656;
        if (!c5596.mo2692()) {
            this.f65868.mo1741(c5596.m15881().mo7883());
            return;
        }
        synchronized (this) {
            InterfaceC1362 interfaceC1363 = this.f65868;
            if (!(interfaceC1363 instanceof C8418)) {
                m46773(new C8418(interfaceC1363));
            }
        }
        ((C8418) this.f65868).m22037(interfaceC0656);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46768(String str) {
        String str2;
        Hashtable hashtable = f65867;
        synchronized (hashtable) {
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                str = "PubkeyAcceptedAlgorithms";
            }
            str2 = (String) hashtable.get(str);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5265 m46777() {
        this.f65869.getClass();
        return f65866;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5265 m46769() {
        return f65866;
    }
}
