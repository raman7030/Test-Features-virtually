package p067l;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.᩶᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27Y0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21769 {

    /* JADX INFO: renamed from: ܳ */
    public static InterfaceC7372 f68542;

    /* JADX INFO: renamed from: ܿ */
    public static Hashtable f68543;

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC3663 f68544;

    /* JADX INFO: renamed from: ۧ */
    public final C23780 f68545;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC20428 f68546;

    /* JADX INFO: renamed from: ᩳ */
    public Vector f68547;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m49096(InterfaceC3663 interfaceC3663) {
        this.f68544 = interfaceC3663;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized InterfaceC3663 m49098() {
        return this.f68544;
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
        f68543 = hashtable;
        String property23 = "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256";
        byte[] bArr = C20764.f65273;
        try {
            property23 = System.getProperty("jsch.kex", "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256");
        } catch (SecurityException unused) {
        }
        hashtable.put("kex", property23);
        Hashtable hashtable2 = f68543;
        try {
            property = System.getProperty("jsch.server_host_key", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
        } catch (SecurityException unused2) {
            property = "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256";
        }
        hashtable2.put("server_host_key", property);
        Hashtable hashtable3 = f68543;
        try {
            property2 = System.getProperty("jsch.prefer_known_host_key_types", "yes");
        } catch (SecurityException unused3) {
            property2 = "yes";
        }
        hashtable3.put("prefer_known_host_key_types", property2);
        Hashtable hashtable4 = f68543;
        try {
            property3 = System.getProperty("jsch.enable_strict_kex", "yes");
        } catch (SecurityException unused4) {
            property3 = "yes";
        }
        hashtable4.put("enable_strict_kex", property3);
        Hashtable hashtable5 = f68543;
        try {
            property4 = System.getProperty("jsch.require_strict_kex", "no");
        } catch (SecurityException unused5) {
            property4 = "no";
        }
        hashtable5.put("require_strict_kex", property4);
        Hashtable hashtable6 = f68543;
        try {
            property5 = System.getProperty("jsch.enable_server_sig_algs", "yes");
        } catch (SecurityException unused6) {
            property5 = "yes";
        }
        hashtable6.put("enable_server_sig_algs", property5);
        Hashtable hashtable7 = f68543;
        try {
            property6 = System.getProperty("jsch.enable_ext_info_in_auth", "yes");
        } catch (SecurityException unused7) {
            property6 = "yes";
        }
        hashtable7.put("enable_ext_info_in_auth", property6);
        Hashtable hashtable8 = f68543;
        try {
            property7 = System.getProperty("jsch.cipher", "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr");
        } catch (SecurityException unused8) {
            property7 = "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr";
        }
        hashtable8.put("cipher.s2c", property7);
        Hashtable hashtable9 = f68543;
        try {
            property19 = System.getProperty("jsch.cipher", "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr");
        } catch (SecurityException unused9) {
        }
        hashtable9.put("cipher.c2s", property19);
        Hashtable hashtable10 = f68543;
        try {
            property8 = System.getProperty("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1");
        } catch (SecurityException unused10) {
            property8 = "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1";
        }
        hashtable10.put("mac.s2c", property8);
        Hashtable hashtable11 = f68543;
        try {
            property18 = System.getProperty("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1");
        } catch (SecurityException unused11) {
        }
        hashtable11.put("mac.c2s", property18);
        Hashtable hashtable12 = f68543;
        try {
            property9 = System.getProperty("jsch.compression", "none");
        } catch (SecurityException unused12) {
            property9 = "none";
        }
        hashtable12.put("compression.s2c", property9);
        Hashtable hashtable13 = f68543;
        try {
            property10 = System.getProperty("jsch.compression", "none");
        } catch (SecurityException unused13) {
            property10 = "none";
        }
        hashtable13.put("compression.c2s", property10);
        Hashtable hashtable14 = f68543;
        try {
            property11 = System.getProperty("jsch.lang", "");
        } catch (SecurityException unused14) {
            property11 = "";
        }
        hashtable14.put("lang.s2c", property11);
        Hashtable hashtable15 = f68543;
        try {
            property12 = System.getProperty("jsch.lang", "");
        } catch (SecurityException unused15) {
            property12 = "";
        }
        hashtable15.put("lang.c2s", property12);
        Hashtable hashtable16 = f68543;
        String property24 = "2048";
        try {
            property24 = System.getProperty("jsch.dhgex_min", "2048");
        } catch (SecurityException unused16) {
        }
        hashtable16.put("dhgex_min", property24);
        Hashtable hashtable17 = f68543;
        String property25 = "8192";
        try {
            property25 = System.getProperty("jsch.dhgex_max", "8192");
        } catch (SecurityException unused17) {
        }
        hashtable17.put("dhgex_max", property25);
        Hashtable hashtable18 = f68543;
        String property26 = "3072";
        try {
            property26 = System.getProperty("jsch.dhgex_preferred", "3072");
        } catch (SecurityException unused18) {
        }
        hashtable18.put("dhgex_preferred", property26);
        Hashtable hashtable19 = f68543;
        try {
            property13 = System.getProperty("jsch.compression_level", "6");
        } catch (SecurityException unused19) {
            property13 = "6";
        }
        hashtable19.put("compression_level", property13);
        Hashtable hashtable20 = f68543;
        C17073.m38721(C13052.class, hashtable20, "diffie-hellman-group-exchange-sha1", C4334.class, "diffie-hellman-group1-sha1");
        C17073.m38721(C21375.class, hashtable20, "diffie-hellman-group14-sha1", C19757.class, "diffie-hellman-group-exchange-sha256");
        C17073.m38721(C18415.class, hashtable20, "diffie-hellman-group-exchange-sha224@ssh.com", C19086.class, "diffie-hellman-group-exchange-sha384@ssh.com");
        C17073.m38721(C16403.class, hashtable20, "diffie-hellman-group-exchange-sha512@ssh.com", C23386.class, "diffie-hellman-group14-sha256");
        C17073.m38721(C13998.class, hashtable20, "diffie-hellman-group15-sha512", C13328.class, "diffie-hellman-group16-sha512");
        C17073.m38721(C15338.class, hashtable20, "diffie-hellman-group17-sha512", C9304.class, "diffie-hellman-group18-sha512");
        C17073.m38721(C23386.class, hashtable20, "diffie-hellman-group14-sha256@ssh.com", C22716.class, "diffie-hellman-group14-sha224@ssh.com");
        C17073.m38721(C5281.class, hashtable20, "diffie-hellman-group15-sha256@ssh.com", C14668.class, "diffie-hellman-group15-sha384@ssh.com");
        C17073.m38721(C13328.class, hashtable20, "diffie-hellman-group16-sha512@ssh.com", C7963.class, "diffie-hellman-group16-sha384@ssh.com");
        C17073.m38721(C9304.class, hashtable20, "diffie-hellman-group18-sha512@ssh.com", C5164.class, "ecdsa-sha2-nistp256");
        C17073.m38721(C14551.class, hashtable20, "ecdsa-sha2-nistp384", C13881.class, "ecdsa-sha2-nistp521");
        C17073.m38721(C20034.class, hashtable20, "ecdh-sha2-nistp256", C2598.class, "ecdh-sha2-nistp384");
        C17073.m38721(C3269.class, hashtable20, "ecdh-sha2-nistp521", C12241.class, "ecdh-sha2-nistp");
        hashtable20.put("curve25519-sha256", C11317.class.getName());
        hashtable20.put("curve25519-sha256@libssh.org", C11317.class.getName());
        hashtable20.put("curve448-sha512", C4611.class.getName());
        hashtable20.put("mlkem768x25519-sha256", C10646.class.getName());
        C17073.m38721(C20705.class, hashtable20, "mlkem768nistp256-sha256", C7293.class, "mlkem1024nistp384-sha384");
        hashtable20.put("sntrup761x25519-sha512", C17350.class.getName());
        hashtable20.put("sntrup761x25519-sha512@openssh.com", C17350.class.getName());
        hashtable20.put("mlkem768", C12046.class.getName());
        hashtable20.put("mlkem1024", C14057.class.getName());
        C17073.m38721(C15397.class, hashtable20, "sntrup761", C14252.class, "dh");
        C17073.m38721(C19284.class, hashtable20, "3des-cbc", C5535.class, "blowfish-cbc");
        C17073.m38721(C17903.class, hashtable20, "hmac-sha1", C3822.class, "hmac-sha1-96");
        C17073.m38721(C24609.class, hashtable20, "hmac-sha2-256", C10528.class, "hmac-sha2-512");
        C17073.m38721(C15592.class, hashtable20, "hmac-md5", C13582.class, "hmac-md5-96");
        C17073.m38721(C19245.class, hashtable20, "hmac-sha1-etm@openssh.com", C12540.class, "hmac-sha1-96-etm@openssh.com");
        C17073.m38721(C8516.class, hashtable20, "hmac-sha2-256-etm@openssh.com", C17232.class, "hmac-sha2-512-etm@openssh.com");
        C17073.m38721(C9558.class, hashtable20, "hmac-md5-etm@openssh.com", C24310.class, "hmac-md5-96-etm@openssh.com");
        C17073.m38721(C15891.class, hashtable20, "hmac-sha256-2@ssh.com", C18574.class, "hmac-sha224@ssh.com");
        C17073.m38721(C21928.class, hashtable20, "hmac-sha256@ssh.com", C11199.class, "hmac-sha384@ssh.com");
        C17073.m38721(C4493.class, hashtable20, "hmac-sha512@ssh.com", C9857.class, "sha-1");
        C17073.m38721(C16562.class, hashtable20, "sha-224", C22599.class, "sha-256");
        C17073.m38721(C23269.class, hashtable20, "sha-384", C21258.class, "sha-512");
        C17073.m38721(C2480.class, hashtable20, "md5", C9857.class, "sha1");
        String property27 = "sha256";
        C17073.m38721(C16562.class, hashtable20, "sha224", C22599.class, "sha256");
        C17073.m38721(C23269.class, hashtable20, "sha384", C21258.class, "sha512");
        C17073.m38721(C6505.class, hashtable20, "signature.dss", C7846.class, OpenSSHPublicKeyUtil.RSA);
        C17073.m38721(C15221.class, hashtable20, "rsa-sha2-256", C12579.class, "rsa-sha2-512");
        C17073.m38721(C23939.class, hashtable20, "ssh-rsa-sha224@ssh.com", C9187.class, "ssh-rsa-sha256@ssh.com");
        C17073.m38721(C3861.class, hashtable20, "ssh-rsa-sha384@ssh.com", C17942.class, "ssh-rsa-sha512@ssh.com");
        C17073.m38721(C5834.class, hashtable20, "keypairgen.dsa", C20587.class, "keypairgen.rsa");
        C17073.m38721(C19916.class, hashtable20, "keypairgen.ecdsa", C3151.class, "random");
        C17073.m38721(C21434.class, hashtable20, "hmac-ripemd160", C5340.class, "hmac-ripemd160@openssh.com");
        C17073.m38721(C6681.class, hashtable20, "hmac-ripemd160-etm@openssh.com", C8634.class, "none");
        C17073.m38721(C20959.class, hashtable20, "aes128-gcm@openssh.com", C16933.class, "aes256-gcm@openssh.com");
        C17073.m38721(C6206.class, hashtable20, "aes128-cbc", C2852.class, "aes192-cbc");
        hashtable20.put("aes256-cbc", C3523.class.getName());
        hashtable20.put("rijndael-cbc@lysator.liu.se", C3523.class.getName());
        String property28 = "chacha20-poly1305@openssh.com";
        hashtable20.put("chacha20-poly1305@openssh.com", C23445.class.getName());
        hashtable20.put("cast128-cbc", C16738.class.getName());
        C17073.m38721(C22775.class, hashtable20, "cast128-ctr", C18275.class, "twofish128-cbc");
        hashtable20.put("twofish192-cbc", C18946.class.getName());
        hashtable20.put("twofish256-cbc", C24981.class.getName());
        hashtable20.put("twofish-cbc", C24981.class.getName());
        hashtable20.put("twofish128-ctr", C19617.class.getName());
        C17073.m38721(C16263.class, hashtable20, "twofish192-ctr", C8888.class, "twofish256-ctr");
        C17073.m38721(C24115.class, hashtable20, "seed-cbc@ssh.com", C20288.class, "aes128-ctr");
        C17073.m38721(C7547.class, hashtable20, "aes192-ctr", C10229.class, "aes256-ctr");
        C17073.m38721(C18613.class, hashtable20, "3des-ctr", C14922.class, "blowfish-ctr");
        C17073.m38721(C6876.class, hashtable20, "arcfour", C23640.class, "arcfour128");
        C17073.m38721(C21629.class, hashtable20, "arcfour256", C17409.class, "userauth.none");
        C17073.m38721(C4670.class, hashtable20, "userauth.password", C10705.class, "userauth.keyboard-interactive");
        hashtable20.put("userauth.publickey", C6011.class.getName());
        hashtable20.put("zlib", C11238.class.getName());
        hashtable20.put("zlib@openssh.com", C11238.class.getName());
        hashtable20.put("pbkdf2", C7175.class.getName());
        hashtable20.put("bcrypt", C4865.class.getName());
        hashtable20.put("Argon2d", C10034.class.getName());
        hashtable20.put("Argon2i", C10034.class.getName());
        hashtable20.put("Argon2id", C10034.class.getName());
        C17073.m38721(C13387.class, hashtable20, "scrypt", C10900.class, "xdh");
        C17073.m38721(C14727.class, hashtable20, "keypairgen.eddsa", C9363.class, OpenSSHPublicKeyUtil.ED_25519);
        C17073.m38721(C4194.class, hashtable20, "ssh-ed448", C14727.class, "keypairgen_fromprivate.eddsa");
        hashtable20.put("StrictHostKeyChecking", "ask");
        hashtable20.put("HashKnownHosts", "no");
        String property29 = "gssapi-with-mic,publickey,keyboard-interactive,password";
        try {
            property29 = System.getProperty("jsch.preferred_authentications", "gssapi-with-mic,publickey,keyboard-interactive,password");
        } catch (SecurityException unused20) {
        }
        hashtable20.put("PreferredAuthentications", property29);
        Hashtable hashtable21 = f68543;
        try {
            property20 = System.getProperty("jsch.client_pubkey", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
        } catch (SecurityException unused21) {
        }
        hashtable21.put("PubkeyAcceptedAlgorithms", property20);
        Hashtable hashtable22 = f68543;
        try {
            property14 = System.getProperty("jsch.enable_pubkey_auth_query", "yes");
        } catch (SecurityException unused22) {
            property14 = "yes";
        }
        hashtable22.put("enable_pubkey_auth_query", property14);
        Hashtable hashtable23 = f68543;
        try {
            property15 = System.getProperty("jsch.try_additional_pubkey_algorithms", "yes");
        } catch (SecurityException unused23) {
            property15 = "yes";
        }
        hashtable23.put("try_additional_pubkey_algorithms", property15);
        Hashtable hashtable24 = f68543;
        try {
            property16 = System.getProperty("jsch.enable_auth_none", "yes");
        } catch (SecurityException unused24) {
            property16 = "yes";
        }
        hashtable24.put("enable_auth_none", property16);
        Hashtable hashtable25 = f68543;
        try {
            property22 = System.getProperty("jsch.use_sftp_write_flush_workaround", "yes");
        } catch (SecurityException unused25) {
        }
        hashtable25.put("use_sftp_write_flush_workaround", property22);
        Hashtable hashtable26 = f68543;
        try {
            property28 = System.getProperty("jsch.check_ciphers", "chacha20-poly1305@openssh.com");
        } catch (SecurityException unused26) {
        }
        hashtable26.put("CheckCiphers", property28);
        Hashtable hashtable27 = f68543;
        try {
            property21 = System.getProperty("jsch.check_macs", "");
        } catch (SecurityException unused27) {
        }
        hashtable27.put("CheckMacs", property21);
        Hashtable hashtable28 = f68543;
        String property30 = "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512";
        try {
            property30 = System.getProperty("jsch.check_kexes", "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512");
        } catch (SecurityException unused28) {
        }
        hashtable28.put("CheckKexes", property30);
        Hashtable hashtable29 = f68543;
        String property31 = "ssh-ed25519,ssh-ed448";
        try {
            property31 = System.getProperty("jsch.check_signatures", "ssh-ed25519,ssh-ed448");
        } catch (SecurityException unused29) {
        }
        hashtable29.put("CheckSignatures", property31);
        Hashtable hashtable30 = f68543;
        try {
            property27 = System.getProperty("jsch.fingerprint_hash", "sha256");
        } catch (SecurityException unused30) {
        }
        hashtable30.put("FingerprintHash", property27);
        Hashtable hashtable31 = f68543;
        try {
            property17 = System.getProperty("jsch.max_auth_tries", "6");
        } catch (SecurityException unused31) {
        }
        hashtable31.put("MaxAuthTries", property17);
        f68543.put("ClearAllForwardings", "no");
        f68542 = new C23110();
    }

    public C21769() {
        C23780 c23780 = new C23780();
        this.f68545 = c23780;
        this.f68547 = new Vector();
        this.f68544 = new C2677(c23780);
        this.f68546 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9383 m49093(int i, String str, String str2) throws C14392 {
        if (str2 == null) {
            throw new C14392("host must not be null.");
        }
        return new C9383(this, str, str2, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49097(C9383 c9383) {
        synchronized (this.f68547) {
            this.f68547.addElement(c9383);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49099(C9383 c9383) {
        synchronized (this.f68547) {
            this.f68547.remove(c9383);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20428 m49094() {
        if (this.f68546 == null) {
            this.f68546 = new C20784(this);
        }
        return this.f68546;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49095(InterfaceC2992 interfaceC2992, byte[] bArr) throws Throwable {
        if (bArr != null) {
            try {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                try {
                    if (!((C7687) interfaceC2992).mo5027(bArr2)) {
                        throw new C14392("Incorrect passphrase provided.");
                    }
                    C20764.m46890(bArr2);
                } catch (Throwable th) {
                    th = th;
                    bArr = bArr2;
                    C20764.m46890(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        InterfaceC3663 interfaceC3663 = this.f68544;
        if (interfaceC3663 instanceof C2677) {
            ((C2677) interfaceC3663).m4138(interfaceC2992);
            return;
        }
        C7687 c7687 = (C7687) interfaceC2992;
        if (!c7687.mo5031()) {
            this.f68544.mo4139(c7687.m17802().mo9931());
            return;
        }
        synchronized (this) {
            InterfaceC3663 interfaceC3664 = this.f68544;
            if (!(interfaceC3664 instanceof C10369)) {
                m49096(new C10369(interfaceC3664));
            }
        }
        ((C10369) this.f68544).m24007(interfaceC2992);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m49091(String str) {
        String str2;
        Hashtable hashtable = f68543;
        synchronized (hashtable) {
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                str = "PubkeyAcceptedAlgorithms";
            }
            str2 = (String) hashtable.get(str);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7372 m49100() {
        this.f68545.getClass();
        return f68542;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static InterfaceC7372 m49092() {
        return f68542;
    }
}
