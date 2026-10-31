.class public final Ll/᩶᩷ۘ;
.super Ljava/lang/Object;
.source "27Y0"


# static fields
.field public static ܳ:Ll/ۚۢۘ;

.field public static ܿ:Ljava/util/Hashtable;


# instance fields
.field public ֫:Ll/֨᩷ۘ;

.field public final ۧ:Ll/᩹᩷ۘ;

.field public ܽ:Ll/ᩴ᩷ۘ;

.field public ᩳ:Ljava/util/Vector;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    const-string v0, "6"

    const-string v1, "jsch.lang"

    const-string v2, "jsch.compression"

    const-string v3, "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1"

    const-string v4, "jsch.mac"

    const-string v5, "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr"

    const-string v6, "jsch.cipher"

    const-string v7, "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256"

    const-string v8, ""

    const-string v9, "none"

    const-string v10, "no"

    const-string v11, "yes"

    .line 41
    new-instance v12, Ljava/util/Hashtable;

    invoke-direct {v12}, Ljava/util/Hashtable;-><init>()V

    sput-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v13, "jsch.kex"

    const-string v14, "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256"

    .line 44
    sget-object v15, Ll/᩵ۡۘ;->ܽ:[B

    .line 524
    :try_start_0
    invoke-static {v13, v14}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v13, "kex"

    .line 44
    invoke-virtual {v12, v13, v14}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v13, "jsch.server_host_key"

    .line 524
    :try_start_1
    invoke-static {v13, v7}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-object v13, v7

    :goto_0
    const-string v14, "server_host_key"

    .line 46
    invoke-virtual {v12, v14, v13}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v13, "jsch.prefer_known_host_key_types"

    .line 524
    :try_start_2
    invoke-static {v13, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-object v13, v11

    :goto_1
    const-string v14, "prefer_known_host_key_types"

    .line 48
    invoke-virtual {v12, v14, v13}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v13, "jsch.enable_strict_kex"

    .line 524
    :try_start_3
    invoke-static {v13, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_2

    :catch_3
    move-object v13, v11

    :goto_2
    const-string v14, "enable_strict_kex"

    .line 50
    invoke-virtual {v12, v14, v13}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v13, "jsch.require_strict_kex"

    .line 524
    :try_start_4
    invoke-static {v13, v10}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_3

    :catch_4
    move-object v13, v10

    :goto_3
    const-string v14, "require_strict_kex"

    .line 51
    invoke-virtual {v12, v14, v13}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v13, "jsch.enable_server_sig_algs"

    .line 524
    :try_start_5
    invoke-static {v13, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_4

    :catch_5
    move-object v13, v11

    :goto_4
    const-string v14, "enable_server_sig_algs"

    .line 52
    invoke-virtual {v12, v14, v13}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v13, "jsch.enable_ext_info_in_auth"

    .line 524
    :try_start_6
    invoke-static {v13, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_5

    :catch_6
    move-object v13, v11

    :goto_5
    const-string v14, "enable_ext_info_in_auth"

    .line 54
    invoke-virtual {v12, v14, v13}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    .line 524
    :try_start_7
    invoke-static {v6, v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_6

    :catch_7
    move-object v13, v5

    :goto_6
    const-string v14, "cipher.s2c"

    .line 56
    invoke-virtual {v12, v14, v13}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v12, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    .line 524
    :try_start_8
    invoke-static {v6, v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    const-string v6, "cipher.c2s"

    .line 58
    invoke-virtual {v12, v6, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v5, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    .line 524
    :try_start_9
    invoke-static {v4, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_9
    .catch Ljava/lang/SecurityException; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_7

    :catch_9
    move-object v6, v3

    :goto_7
    const-string v12, "mac.s2c"

    .line 60
    invoke-virtual {v5, v12, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v5, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    .line 524
    :try_start_a
    invoke-static {v4, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_a
    .catch Ljava/lang/SecurityException; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    const-string v4, "mac.c2s"

    .line 62
    invoke-virtual {v5, v4, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v3, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    .line 524
    :try_start_b
    invoke-static {v2, v9}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_b
    .catch Ljava/lang/SecurityException; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_8

    :catch_b
    move-object v4, v9

    :goto_8
    const-string v5, "compression.s2c"

    .line 64
    invoke-virtual {v3, v5, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v3, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    .line 524
    :try_start_c
    invoke-static {v2, v9}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_c
    .catch Ljava/lang/SecurityException; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_9

    :catch_c
    move-object v2, v9

    :goto_9
    const-string v4, "compression.c2s"

    .line 65
    invoke-virtual {v3, v4, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v2, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    .line 524
    :try_start_d
    invoke-static {v1, v8}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_d
    .catch Ljava/lang/SecurityException; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_a

    :catch_d
    move-object v3, v8

    :goto_a
    const-string v4, "lang.s2c"

    .line 67
    invoke-virtual {v2, v4, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v2, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    .line 524
    :try_start_e
    invoke-static {v1, v8}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_e
    .catch Ljava/lang/SecurityException; {:try_start_e .. :try_end_e} :catch_e

    goto :goto_b

    :catch_e
    move-object v1, v8

    :goto_b
    const-string v3, "lang.c2s"

    .line 68
    invoke-virtual {v2, v3, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.dhgex_min"

    const-string v3, "2048"

    .line 524
    :try_start_f
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_f
    .catch Ljava/lang/SecurityException; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    const-string v2, "dhgex_min"

    .line 70
    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.dhgex_max"

    const-string v3, "8192"

    .line 524
    :try_start_10
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_10
    .catch Ljava/lang/SecurityException; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    const-string v2, "dhgex_max"

    .line 71
    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.dhgex_preferred"

    const-string v3, "3072"

    .line 524
    :try_start_11
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_11
    .catch Ljava/lang/SecurityException; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    const-string v2, "dhgex_preferred"

    .line 72
    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.compression_level"

    .line 524
    :try_start_12
    invoke-static {v2, v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_12
    .catch Ljava/lang/SecurityException; {:try_start_12 .. :try_end_12} :catch_12

    goto :goto_c

    :catch_12
    move-object v2, v0

    :goto_c
    const-string v3, "compression_level"

    .line 74
    invoke-virtual {v1, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "diffie-hellman-group1-sha1"

    .line 77
    const-class v3, Ll/֫᩷ۘ;

    .line 0
    const-class v4, Ll/ۧ᩷ۘ;

    const-string v5, "diffie-hellman-group-exchange-sha1"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "diffie-hellman-group-exchange-sha256"

    .line 79
    const-class v3, Ll/ᩳ᩷ۘ;

    .line 0
    const-class v4, Ll/᩶ۜۘ;

    const-string v5, "diffie-hellman-group14-sha1"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "diffie-hellman-group-exchange-sha384@ssh.com"

    .line 81
    const-class v3, Ll/ܿ᩷ۘ;

    .line 0
    const-class v4, Ll/ܽ᩷ۘ;

    const-string v5, "diffie-hellman-group-exchange-sha224@ssh.com"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 82
    const-class v2, Ll/ܳ᩷ۘ;

    const-string v3, "diffie-hellman-group14-sha256"

    const-string v4, "diffie-hellman-group-exchange-sha512@ssh.com"

    .line 0
    const-class v5, Ll/᩹ۜۘ;

    invoke-static {v2, v1, v4, v5, v3}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 84
    const-class v2, Ll/۫ۜۘ;

    const-string v3, "diffie-hellman-group16-sha512"

    const-string v4, "diffie-hellman-group15-sha512"

    .line 0
    const-class v6, Ll/ۨۜۘ;

    invoke-static {v2, v1, v4, v6, v3}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 86
    const-class v2, Ll/ܰۜۘ;

    const-string v3, "diffie-hellman-group18-sha512"

    const-string v4, "diffie-hellman-group17-sha512"

    .line 0
    const-class v12, Ll/۟ۜۘ;

    invoke-static {v2, v1, v4, v12, v3}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "diffie-hellman-group14-sha224@ssh.com"

    .line 89
    const-class v3, Ll/᩸ۜۘ;

    const-string v4, "diffie-hellman-group14-sha256@ssh.com"

    .line 0
    invoke-static {v5, v1, v4, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "diffie-hellman-group15-sha384@ssh.com"

    .line 91
    const-class v3, Ll/۬ۜۘ;

    .line 0
    const-class v4, Ll/ۗۜۘ;

    const-string v5, "diffie-hellman-group15-sha256@ssh.com"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "diffie-hellman-group16-sha384@ssh.com"

    .line 93
    const-class v3, Ll/ۛۜۘ;

    const-string v4, "diffie-hellman-group16-sha512@ssh.com"

    .line 0
    invoke-static {v6, v1, v4, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "ecdsa-sha2-nistp256"

    .line 95
    const-class v3, Ll/ۗۖۘ;

    const-string v4, "diffie-hellman-group18-sha512@ssh.com"

    .line 0
    invoke-static {v12, v1, v4, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "ecdsa-sha2-nistp521"

    .line 97
    const-class v3, Ll/۫ۖۘ;

    .line 0
    const-class v4, Ll/۬ۖۘ;

    const-string v5, "ecdsa-sha2-nistp384"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "ecdh-sha2-nistp384"

    .line 100
    const-class v3, Ll/֡ۜۘ;

    .line 0
    const-class v4, Ll/ᩴۜۘ;

    const-string v5, "ecdh-sha2-nistp256"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "ecdh-sha2-nistp"

    .line 103
    const-class v3, Ll/ۤܺۘ;

    .line 0
    const-class v4, Ll/֨ۜۘ;

    const-string v5, "ecdh-sha2-nistp521"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "curve25519-sha256"

    .line 105
    const-class v3, Ll/ۢۜۘ;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "curve25519-sha256@libssh.org"

    .line 106
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    const-class v2, Ll/ۖۜۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "curve448-sha512"

    invoke-virtual {v1, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    const-class v2, Ll/ۡۜۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "mlkem768x25519-sha256"

    invoke-virtual {v1, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "mlkem1024nistp384-sha384"

    .line 110
    const-class v3, Ll/ۚۜۘ;

    .line 0
    const-class v4, Ll/᩵ۜۘ;

    const-string v5, "mlkem768nistp256-sha256"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "sntrup761x25519-sha512"

    .line 111
    const-class v3, Ll/ܺۜۘ;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "sntrup761x25519-sha512@openssh.com"

    .line 112
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    const-class v2, Ll/ۤۡۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "mlkem768"

    invoke-virtual {v1, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    const-class v2, Ll/۫ۡۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "mlkem1024"

    invoke-virtual {v1, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "dh"

    .line 118
    const-class v3, Ll/۫ܺۘ;

    .line 0
    const-class v4, Ll/ܰۡۘ;

    const-string v5, "sntrup761"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "blowfish-cbc"

    .line 120
    const-class v3, Ll/ۗܺۘ;

    .line 0
    const-class v4, Ll/ᩳۘۘ;

    const-string v5, "3des-cbc"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-sha1-96"

    .line 122
    const-class v3, Ll/֫ۖۘ;

    .line 0
    const-class v4, Ll/ܽۖۘ;

    const-string v5, "hmac-sha1"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-sha2-512"

    .line 124
    const-class v3, Ll/ۡۖۘ;

    .line 0
    const-class v4, Ll/᩻ۖۘ;

    const-string v5, "hmac-sha2-256"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-md5-96"

    .line 126
    const-class v3, Ll/ۨܺۘ;

    .line 0
    const-class v4, Ll/ܰܺۘ;

    const-string v5, "hmac-md5"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-sha1-96-etm@openssh.com"

    .line 128
    const-class v3, Ll/ۧۖۘ;

    .line 0
    const-class v4, Ll/ᩳۖۘ;

    const-string v5, "hmac-sha1-etm@openssh.com"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-sha2-512-etm@openssh.com"

    .line 130
    const-class v3, Ll/ܺۖۘ;

    .line 0
    const-class v4, Ll/ۜۖۘ;

    const-string v5, "hmac-sha2-256-etm@openssh.com"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-md5-96-etm@openssh.com"

    .line 132
    const-class v3, Ll/᩺ܺۘ;

    .line 0
    const-class v4, Ll/۟ܺۘ;

    const-string v5, "hmac-md5-etm@openssh.com"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-sha224@ssh.com"

    .line 134
    const-class v3, Ll/ܿۖۘ;

    .line 0
    const-class v4, Ll/ܳۖۘ;

    const-string v5, "hmac-sha256-2@ssh.com"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-sha384@ssh.com"

    .line 136
    const-class v3, Ll/ۢۖۘ;

    .line 0
    const-class v4, Ll/᩷ۖۘ;

    const-string v5, "hmac-sha256@ssh.com"

    invoke-static {v4, v1, v5, v3, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 137
    const-class v2, Ll/ۖۖۘ;

    const-string v3, "sha-1"

    const-string v4, "hmac-sha512@ssh.com"

    .line 0
    const-class v5, Ll/۠ۖۘ;

    invoke-static {v2, v1, v4, v5, v3}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "sha-224"

    const-string v3, "sha-256"

    const-class v4, Ll/ܶۖۘ;

    const-class v6, Ll/᩸ۖۘ;

    invoke-static {v4, v1, v2, v6, v3}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "sha-384"

    const-string v3, "sha-512"

    const-class v12, Ll/᩹ۖۘ;

    const-class v13, Ll/᩶ۖۘ;

    invoke-static {v12, v1, v2, v13, v3}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 143
    const-class v2, Ll/֡ۖۘ;

    const-string v3, "sha1"

    const-string v14, "md5"

    .line 0
    invoke-static {v2, v1, v14, v5, v3}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "sha224"

    const-string v3, "sha256"

    invoke-static {v4, v1, v2, v6, v3}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "sha384"

    const-string v4, "sha512"

    invoke-static {v12, v1, v2, v13, v4}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "ssh-rsa"

    .line 150
    const-class v4, Ll/ۛۖۘ;

    .line 0
    const-class v5, Ll/ۙۖۘ;

    const-string v6, "signature.dss"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "rsa-sha2-512"

    .line 152
    const-class v4, Ll/ۧۘۘ;

    .line 0
    const-class v5, Ll/ܰۖۘ;

    const-string v6, "rsa-sha2-256"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "ssh-rsa-sha256@ssh.com"

    .line 154
    const-class v4, Ll/۟ۖۘ;

    .line 0
    const-class v5, Ll/᩺ۖۘ;

    const-string v6, "ssh-rsa-sha224@ssh.com"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "ssh-rsa-sha512@ssh.com"

    .line 156
    const-class v4, Ll/ܽۘۘ;

    .line 0
    const-class v5, Ll/֫ۘۘ;

    const-string v6, "ssh-rsa-sha384@ssh.com"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "keypairgen.rsa"

    .line 158
    const-class v4, Ll/᩵ۖۘ;

    .line 0
    const-class v5, Ll/ۘۖۘ;

    const-string v6, "keypairgen.dsa"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "random"

    .line 160
    const-class v4, Ll/֨ۖۘ;

    .line 0
    const-class v5, Ll/ᩴۖۘ;

    const-string v6, "keypairgen.ecdsa"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "hmac-ripemd160@openssh.com"

    .line 163
    const-class v4, Ll/ۗۡۘ;

    .line 0
    const-class v5, Ll/᩶ۡۘ;

    const-string v6, "hmac-ripemd160"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 164
    const-class v2, Ll/ۙۡۘ;

    .line 166
    const-class v4, Ll/ۜۜۘ;

    const-string v5, "hmac-ripemd160-etm@openssh.com"

    .line 0
    invoke-static {v2, v1, v5, v4, v9}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "aes256-gcm@openssh.com"

    .line 169
    const-class v4, Ll/ܶܺۘ;

    .line 0
    const-class v5, Ll/᩵ܺۘ;

    const-string v6, "aes128-gcm@openssh.com"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "aes192-cbc"

    .line 172
    const-class v4, Ll/֡ܺۘ;

    .line 0
    const-class v5, Ll/ۘܺۘ;

    const-string v6, "aes128-cbc"

    invoke-static {v5, v1, v6, v4, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "aes256-cbc"

    .line 173
    const-class v4, Ll/֨ܺۘ;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "rijndael-cbc@lysator.liu.se"

    .line 174
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    const-class v2, Ll/᩹ۡۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "chacha20-poly1305@openssh.com"

    invoke-virtual {v1, v4, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const-class v2, Ll/ܶۡۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "cast128-cbc"

    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "twofish128-cbc"

    .line 179
    const-class v5, Ll/ܽܺۘ;

    .line 0
    const-class v6, Ll/᩸ۡۘ;

    const-string v9, "cast128-ctr"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 180
    const-class v2, Ll/ܿܺۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "twofish192-cbc"

    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "twofish256-cbc"

    .line 181
    const-class v5, Ll/᩻ܺۘ;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "twofish-cbc"

    .line 182
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const-class v2, Ll/ᩳܺۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "twofish128-ctr"

    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "twofish256-ctr"

    .line 185
    const-class v5, Ll/ۜܺۘ;

    .line 0
    const-class v6, Ll/ܳܺۘ;

    const-string v9, "twofish192-ctr"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "aes128-ctr"

    .line 188
    const-class v5, Ll/ᩴܺۘ;

    .line 0
    const-class v6, Ll/᩺ۡۘ;

    const-string v9, "seed-cbc@ssh.com"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "aes256-ctr"

    .line 190
    const-class v5, Ll/۠ܺۘ;

    .line 0
    const-class v6, Ll/ۚܺۘ;

    const-string v9, "aes192-ctr"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "blowfish-ctr"

    .line 192
    const-class v5, Ll/۬ܺۘ;

    .line 0
    const-class v6, Ll/ܿۘۘ;

    const-string v9, "3des-ctr"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "arcfour128"

    .line 194
    const-class v5, Ll/᩹ܺۘ;

    .line 0
    const-class v6, Ll/ۙܺۘ;

    const-string v9, "arcfour"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "userauth.none"

    .line 197
    const-class v5, Ll/ܺۡۘ;

    .line 0
    const-class v6, Ll/᩶ܺۘ;

    const-string v9, "arcfour256"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "userauth.keyboard-interactive"

    .line 199
    const-class v5, Ll/ۡۡۘ;

    .line 0
    const-class v6, Ll/ۖۡۘ;

    const-string v9, "userauth.password"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 200
    const-class v2, Ll/ۘۡۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "userauth.publickey"

    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "zlib"

    .line 202
    const-class v5, Ll/ۢۘۘ;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "zlib@openssh.com"

    .line 203
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    const-class v2, Ll/ۚۖۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "pbkdf2"

    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    const-class v2, Ll/ۖܺۘ;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "bcrypt"

    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Argon2d"

    .line 207
    const-class v5, Ll/۠ۡۘ;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Argon2i"

    .line 208
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Argon2id"

    .line 209
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "xdh"

    .line 211
    const-class v5, Ll/ۡܺۘ;

    .line 0
    const-class v6, Ll/ۨۡۘ;

    const-string v9, "scrypt"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "ssh-ed25519"

    .line 214
    const-class v5, Ll/۟ۡۘ;

    .line 0
    const-class v6, Ll/۬ۡۘ;

    const-string v9, "keypairgen.eddsa"

    invoke-static {v6, v1, v9, v5, v2}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    .line 215
    const-class v2, Ll/֫ܺۘ;

    const-string v5, "keypairgen_fromprivate.eddsa"

    const-string v9, "ssh-ed448"

    .line 0
    invoke-static {v2, v1, v9, v6, v5}, Ll/ܶ᩷ۘ;->֫(Ljava/lang/Class;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    const-string v2, "StrictHostKeyChecking"

    const-string v5, "ask"

    .line 218
    invoke-virtual {v1, v2, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "HashKnownHosts"

    .line 219
    invoke-virtual {v1, v2, v10}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "jsch.preferred_authentications"

    const-string v5, "gssapi-with-mic,publickey,keyboard-interactive,password"

    .line 524
    :try_start_13
    invoke-static {v2, v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_13
    .catch Ljava/lang/SecurityException; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    const-string v2, "PreferredAuthentications"

    .line 221
    invoke-virtual {v1, v2, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.client_pubkey"

    .line 524
    :try_start_14
    invoke-static {v2, v7}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7
    :try_end_14
    .catch Ljava/lang/SecurityException; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    const-string v2, "PubkeyAcceptedAlgorithms"

    .line 223
    invoke-virtual {v1, v2, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.enable_pubkey_auth_query"

    .line 524
    :try_start_15
    invoke-static {v2, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_15
    .catch Ljava/lang/SecurityException; {:try_start_15 .. :try_end_15} :catch_15

    goto :goto_d

    :catch_15
    move-object v2, v11

    :goto_d
    const-string v5, "enable_pubkey_auth_query"

    .line 225
    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.try_additional_pubkey_algorithms"

    .line 524
    :try_start_16
    invoke-static {v2, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_16
    .catch Ljava/lang/SecurityException; {:try_start_16 .. :try_end_16} :catch_16

    goto :goto_e

    :catch_16
    move-object v2, v11

    :goto_e
    const-string v5, "try_additional_pubkey_algorithms"

    .line 227
    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.enable_auth_none"

    .line 524
    :try_start_17
    invoke-static {v2, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_17
    .catch Ljava/lang/SecurityException; {:try_start_17 .. :try_end_17} :catch_17

    goto :goto_f

    :catch_17
    move-object v2, v11

    :goto_f
    const-string v5, "enable_auth_none"

    .line 229
    invoke-virtual {v1, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.use_sftp_write_flush_workaround"

    .line 524
    :try_start_18
    invoke-static {v2, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_18
    .catch Ljava/lang/SecurityException; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    const-string v2, "use_sftp_write_flush_workaround"

    .line 230
    invoke-virtual {v1, v2, v11}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.check_ciphers"

    .line 524
    :try_start_19
    invoke-static {v2, v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_19
    .catch Ljava/lang/SecurityException; {:try_start_19 .. :try_end_19} :catch_19

    :catch_19
    const-string v2, "CheckCiphers"

    .line 233
    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.check_macs"

    .line 524
    :try_start_1a
    invoke-static {v2, v8}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_1a
    .catch Ljava/lang/SecurityException; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    const-string v2, "CheckMacs"

    .line 235
    invoke-virtual {v1, v2, v8}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.check_kexes"

    const-string v4, "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512"

    .line 524
    :try_start_1b
    invoke-static {v2, v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_1b
    .catch Ljava/lang/SecurityException; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    const-string v2, "CheckKexes"

    .line 236
    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.check_signatures"

    const-string v4, "ssh-ed25519,ssh-ed448"

    .line 524
    :try_start_1c
    invoke-static {v2, v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_1c
    .catch Ljava/lang/SecurityException; {:try_start_1c .. :try_end_1c} :catch_1c

    :catch_1c
    const-string v2, "CheckSignatures"

    .line 238
    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.fingerprint_hash"

    .line 524
    :try_start_1d
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_1d
    .catch Ljava/lang/SecurityException; {:try_start_1d .. :try_end_1d} :catch_1d

    :catch_1d
    const-string v2, "FingerprintHash"

    .line 240
    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v2, "jsch.max_auth_tries"

    .line 524
    :try_start_1e
    invoke-static {v2, v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1e
    .catch Ljava/lang/SecurityException; {:try_start_1e .. :try_end_1e} :catch_1e

    :catch_1e
    const-string v2, "MaxAuthTries"

    .line 242
    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    sget-object v0, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    const-string v1, "ClearAllForwardings"

    invoke-virtual {v0, v1, v10}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    new-instance v0, Ll/᩸᩷ۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 295
    sput-object v0, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 246
    new-instance v0, Ll/᩹᩷ۘ;

    .line 691
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 246
    iput-object v0, p0, Ll/᩶᩷ۘ;->ۧ:Ll/᩹᩷ۘ;

    .line 248
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    iput-object v1, p0, Ll/᩶᩷ۘ;->ᩳ:Ljava/util/Vector;

    .line 250
    new-instance v1, Ll/֡ۢۘ;

    invoke-direct {v1, v0}, Ll/֡ۢۘ;-><init>(Ll/᩹᩷ۘ;)V

    .line 252
    iput-object v1, p0, Ll/᩶᩷ۘ;->֫:Ll/֨᩷ۘ;

    const/4 v0, 0x0

    .line 284
    iput-object v0, p0, Ll/᩶᩷ۘ;->ܽ:Ll/ᩴ᩷ۘ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 591
    sget-object v1, Ll/᩶᩷ۘ;->ܿ:Ljava/util/Hashtable;

    move-object v0, v1

    monitor-enter v0

    :try_start_0
    const-string v2, "PubkeyAcceptedKeyTypes"

    .line 592
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p0, "PubkeyAcceptedAlgorithms"

    .line 595
    :cond_0
    invoke-virtual {v1, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 596
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ᩳ()Ll/ۚۢۘ;
    .locals 1

    .line 685
    sget-object v0, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    return-object v0
.end method


# virtual methods
.method public final ֫(ILjava/lang/String;Ljava/lang/String;)Ll/۟ۢۘ;
    .locals 1

    if-eqz p3, :cond_0

    .line 348
    new-instance v0, Ll/۟ۢۘ;

    invoke-direct {v0, p0, p2, p3, p1}, Ll/۟ۢۘ;-><init>(Ll/᩶᩷ۘ;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0

    .line 346
    :cond_0
    new-instance p1, Ll/۫᩷ۘ;

    const-string p2, "host must not be null."

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 346
    throw p1
.end method

.method public final ֫()Ll/ᩴ᩷ۘ;
    .locals 1

    .line 418
    iget-object v0, p0, Ll/᩶᩷ۘ;->ܽ:Ll/ᩴ᩷ۘ;

    if-nez v0, :cond_0

    .line 419
    new-instance v0, Ll/᩵ۢۘ;

    invoke-direct {v0, p0}, Ll/᩵ۢۘ;-><init>(Ll/᩶᩷ۘ;)V

    iput-object v0, p0, Ll/᩶᩷ۘ;->ܽ:Ll/ᩴ᩷ۘ;

    .line 420
    :cond_0
    iget-object v0, p0, Ll/᩶᩷ۘ;->ܽ:Ll/ᩴ᩷ۘ;

    return-object v0
.end method

.method public final ֫(Ll/֡᩷ۘ;[B)V
    .locals 3

    if-eqz p2, :cond_1

    .line 507
    :try_start_0
    array-length v0, p2

    new-array v0, v0, [B

    .line 508
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 510
    :try_start_1
    move-object p2, p1

    check-cast p2, Ll/ۚ᩷ۘ;

    invoke-virtual {p2, v0}, Ll/ۚ᩷ۘ;->֫([B)Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_0

    .line 514
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ([B)V

    goto :goto_1

    .line 511
    :cond_0
    :try_start_2
    new-instance p1, Ll/۫᩷ۘ;

    const-string p2, "Incorrect passphrase provided."

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 511
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    move-object p2, v0

    goto :goto_0

    :catchall_1
    move-exception p1

    .line 514
    :goto_0
    invoke-static {p2}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 515
    throw p1

    .line 518
    :cond_1
    :goto_1
    iget-object p2, p0, Ll/᩶᩷ۘ;->֫:Ll/֨᩷ۘ;

    instance-of v0, p2, Ll/֡ۢۘ;

    if-eqz v0, :cond_2

    .line 519
    check-cast p2, Ll/֡ۢۘ;

    invoke-virtual {p2, p1}, Ll/֡ۢۘ;->֫(Ll/֡᩷ۘ;)V

    return-void

    .line 520
    :cond_2
    move-object p2, p1

    check-cast p2, Ll/ۚ᩷ۘ;

    invoke-virtual {p2}, Ll/ۚ᩷ۘ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_3

    .line 521
    iget-object p1, p0, Ll/᩶᩷ۘ;->֫:Ll/֨᩷ۘ;

    invoke-virtual {p2}, Ll/ۚ᩷ۘ;->ܽ()Ll/ᩳۢۘ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ᩳۢۘ;->ۧ()[B

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨᩷ۘ;->֫([B)Z

    return-void

    :cond_3
    move-object v0, p0

    .line 523
    monitor-enter v0

    .line 524
    :try_start_3
    iget-object p2, p0, Ll/᩶᩷ۘ;->֫:Ll/֨᩷ۘ;

    instance-of v1, p2, Ll/۠᩷ۘ;

    if-nez v1, :cond_4

    .line 525
    new-instance v1, Ll/۠᩷ۘ;

    .line 42
    invoke-direct {v1, p2}, Ll/۠᩷ۘ;-><init>(Ll/֨᩷ۘ;)V

    .line 525
    invoke-virtual {p0, v1}, Ll/᩶᩷ۘ;->֫(Ll/֨᩷ۘ;)V

    .line 527
    :cond_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 528
    iget-object p2, p0, Ll/᩶᩷ۘ;->֫:Ll/֨᩷ۘ;

    check-cast p2, Ll/۠᩷ۘ;

    invoke-virtual {p2, p1}, Ll/۠᩷ۘ;->֫(Ll/֡᩷ۘ;)V

    return-void

    :catchall_2
    move-exception p1

    .line 527
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/֨᩷ۘ;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 268
    :try_start_0
    iput-object p1, p0, Ll/᩶᩷ۘ;->֫:Ll/֨᩷ۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/۟ۢۘ;)V
    .locals 2

    .line 353
    iget-object v0, p0, Ll/᩶᩷ۘ;->ᩳ:Ljava/util/Vector;

    monitor-enter v0

    .line 354
    :try_start_0
    iget-object v1, p0, Ll/᩶᩷ۘ;->ᩳ:Ljava/util/Vector;

    invoke-virtual {v1, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 355
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()Ll/֨᩷ۘ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 273
    :try_start_0
    iget-object v1, p0, Ll/᩶᩷ۘ;->֫:Ll/֨᩷ۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/۟ۢۘ;)V
    .locals 2

    .line 359
    iget-object v0, p0, Ll/᩶᩷ۘ;->ᩳ:Ljava/util/Vector;

    monitor-enter v0

    .line 360
    :try_start_0
    iget-object v1, p0, Ll/᩶᩷ۘ;->ᩳ:Ljava/util/Vector;

    invoke-virtual {v1, p1}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 361
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܽ()Ll/ۚۢۘ;
    .locals 1

    .line 665
    iget-object v0, p0, Ll/᩶᩷ۘ;->ۧ:Ll/᩹᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object v0, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    return-object v0
.end method
