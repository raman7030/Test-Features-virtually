.class public final Ll/ۚۖۘ;
.super Ljava/lang/Object;
.source "37XE"

# interfaces
.implements Ll/֫ۢۘ;


# static fields
.field public static final ۜ:[B

.field public static final ۡ:[B

.field public static final ۢ:[B

.field public static final ܳ:[B

.field public static final ܿ:[B

.field public static final ᩷:[B

.field public static final ᩻:[B


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/String;

.field public ܽ:[B

.field public ᩳ:Ljavax/crypto/SecretKeyFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 40
    fill-array-data v1, :array_0

    sput-object v1, Ll/ۚۖۘ;->ܿ:[B

    new-array v1, v0, [B

    .line 43
    fill-array-data v1, :array_1

    sput-object v1, Ll/ۚۖۘ;->ܳ:[B

    new-array v1, v0, [B

    .line 46
    fill-array-data v1, :array_2

    sput-object v1, Ll/ۚۖۘ;->᩻:[B

    new-array v1, v0, [B

    .line 49
    fill-array-data v1, :array_3

    sput-object v1, Ll/ۚۖۘ;->ۜ:[B

    new-array v1, v0, [B

    .line 52
    fill-array-data v1, :array_4

    sput-object v1, Ll/ۚۖۘ;->᩷:[B

    new-array v1, v0, [B

    .line 55
    fill-array-data v1, :array_5

    sput-object v1, Ll/ۚۖۘ;->ۢ:[B

    new-array v0, v0, [B

    .line 58
    fill-array-data v0, :array_6

    sput-object v0, Ll/ۚۖۘ;->ۡ:[B

    return-void

    :array_0
    .array-data 1
        0x2at
        -0x7at
        0x48t
        -0x7at
        -0x9t
        0xdt
        0x2t
        0x7t
    .end array-data

    :array_1
    .array-data 1
        0x2at
        -0x7at
        0x48t
        -0x7at
        -0x9t
        0xdt
        0x2t
        0x8t
    .end array-data

    :array_2
    .array-data 1
        0x2at
        -0x7at
        0x48t
        -0x7at
        -0x9t
        0xdt
        0x2t
        0x9t
    .end array-data

    :array_3
    .array-data 1
        0x2at
        -0x7at
        0x48t
        -0x7at
        -0x9t
        0xdt
        0x2t
        0xat
    .end array-data

    :array_4
    .array-data 1
        0x2at
        -0x7at
        0x48t
        -0x7at
        -0x9t
        0xdt
        0x2t
        0xbt
    .end array-data

    :array_5
    .array-data 1
        0x2at
        -0x7at
        0x48t
        -0x7at
        -0x9t
        0xdt
        0x2t
        0xct
    .end array-data

    :array_6
    .array-data 1
        0x2at
        -0x7at
        0x48t
        -0x7at
        -0x9t
        0xdt
        0x2t
        0xdt
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ܽ([B)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_7

    .line 149
    sget-object v0, Ll/ۚۖۘ;->ܿ:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    sget-object v0, Ll/ۚۖۘ;->ܳ:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "PBKDF2WithHmacSHA224"

    goto :goto_1

    .line 153
    :cond_1
    sget-object v0, Ll/ۚۖۘ;->᩻:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "PBKDF2WithHmacSHA256"

    goto :goto_1

    .line 155
    :cond_2
    sget-object v0, Ll/ۚۖۘ;->ۜ:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "PBKDF2WithHmacSHA384"

    goto :goto_1

    .line 157
    :cond_3
    sget-object v0, Ll/ۚۖۘ;->᩷:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "PBKDF2WithHmacSHA512"

    goto :goto_1

    .line 159
    :cond_4
    sget-object v0, Ll/ۚۖۘ;->ۢ:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "PBKDF2WithHmacSHA512/224"

    goto :goto_1

    .line 161
    :cond_5
    sget-object v0, Ll/ۚۖۘ;->ۡ:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "PBKDF2WithHmacSHA512/256"

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    goto :goto_1

    :cond_7
    :goto_0
    const-string v0, "PBKDF2WithHmacSHA1"

    :goto_1
    if-nez v0, :cond_b

    .line 166
    new-instance v0, Ll/۫᩷ۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unsupported pbkdf2 function oid: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    .line 173
    :cond_8
    :goto_2
    array-length v4, p0

    if-ge v3, v4, :cond_a

    .line 174
    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    .line 175
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "0x"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_9

    const-string v6, "0"

    goto :goto_3

    :cond_9
    const-string v6, ""

    :goto_3
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    .line 176
    array-length v4, p0

    if-ge v3, v4, :cond_8

    const-string v4, ":"

    .line 177
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 179
    :cond_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 166
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 166
    throw v0

    :cond_b
    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/util/HashMap;)V
    .locals 1

    .line 39
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "initWithPPKv3Header() not supported"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫([B)V
    .locals 1

    .line 35
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "initWithOpenSSHv1KDFOptions() not supported"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 35
    throw p1
.end method

.method public final ֫(I[B)[B
    .locals 3

    .line 134
    array-length v0, p2

    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 135
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_0

    .line 136
    aget-byte v2, p2, v1

    and-int/lit16 v2, v2, 0xff

    int-to-char v2, v2

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 139
    :cond_0
    :try_start_0
    new-instance p2, Ljavax/crypto/spec/PBEKeySpec;

    iget-object v1, p0, Ll/ۚۖۘ;->ܽ:[B

    iget v2, p0, Ll/ۚۖۘ;->֫:I

    mul-int/lit8 p1, p1, 0x8

    invoke-direct {p2, v0, v1, v2, p1}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    .line 140
    iget-object p1, p0, Ll/ۚۖۘ;->ᩳ:Ljavax/crypto/SecretKeyFactory;

    invoke-virtual {p1, p2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object p1

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ([B)V
    .locals 7

    .line 70
    :try_start_0
    new-instance v0, Ll/ۚۡۘ;

    invoke-direct {v0, p1}, Ll/ۚۡۘ;-><init>([B)V

    .line 71
    invoke-virtual {v0}, Ll/ۚۡۘ;->᩷()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 74
    invoke-virtual {v0}, Ll/ۚۡۘ;->ۧ()[Ll/ۚۡۘ;

    move-result-object p1

    .line 75
    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_d

    array-length v0, p1

    const/4 v2, 0x4

    if-gt v0, v2, :cond_d

    const/4 v0, 0x0

    .line 78
    aget-object v3, p1, v0

    invoke-virtual {v3}, Ll/ۚۡۘ;->ۜ()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, 0x1

    .line 81
    aget-object v4, p1, v3

    invoke-virtual {v4}, Ll/ۚۡۘ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 85
    array-length v4, p1

    const/4 v5, 0x0

    const/4 v6, 0x3

    if-ne v4, v2, :cond_2

    .line 86
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ll/ۚۡۘ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 89
    aget-object v2, p1, v6

    invoke-virtual {v2}, Ll/ۚۡۘ;->᩷()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 92
    aget-object v2, p1, v6

    goto :goto_1

    .line 90
    :cond_0
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 90
    throw p1

    .line 87
    :cond_1
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 87
    throw p1

    .line 93
    :cond_2
    array-length v2, p1

    if-ne v2, v6, :cond_5

    .line 94
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ll/ۚۡۘ;->᩷()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 95
    aget-object v2, p1, v1

    goto :goto_1

    .line 96
    :cond_3
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ll/ۚۡۘ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    .line 97
    :cond_4
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 97
    throw p1

    :cond_5
    :goto_0
    move-object v2, v5

    .line 102
    :goto_1
    aget-object v4, p1, v0

    invoke-virtual {v4}, Ll/ۚۡۘ;->֫()[B

    move-result-object v4

    iput-object v4, p0, Ll/ۚۖۘ;->ܽ:[B

    .line 103
    aget-object p1, p1, v3

    invoke-virtual {p1}, Ll/ۚۡۘ;->֫()[B

    move-result-object p1

    invoke-static {p1}, Ll/ۚۡۘ;->֫([B)I

    move-result p1

    iput p1, p0, Ll/ۚۖۘ;->֫:I

    if-eqz v2, :cond_a

    .line 106
    invoke-virtual {v2}, Ll/ۚۡۘ;->ۧ()[Ll/ۚۡۘ;

    move-result-object p1

    .line 107
    array-length v2, p1

    if-ne v2, v1, :cond_9

    .line 110
    aget-object v1, p1, v0

    invoke-virtual {v1}, Ll/ۚۡۘ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 113
    aget-object v1, p1, v3

    .line 72
    invoke-virtual {v1}, Ll/ۚۡۘ;->ᩳ()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_6

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_7

    .line 116
    aget-object p1, p1, v0

    invoke-virtual {p1}, Ll/ۚۡۘ;->֫()[B

    move-result-object v5

    goto :goto_3

    .line 114
    :cond_7
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 114
    throw p1

    .line 111
    :cond_8
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 111
    throw p1

    .line 108
    :cond_9
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 108
    throw p1

    .line 119
    :cond_a
    :goto_3
    invoke-static {v5}, Ll/ۚۖۘ;->ܽ([B)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۖۘ;->ۧ:Ljava/lang/String;

    .line 120
    invoke-static {p1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۖۘ;->ᩳ:Ljavax/crypto/SecretKeyFactory;

    return-void

    .line 82
    :cond_b
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 82
    throw p1

    .line 79
    :cond_c
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 79
    throw p1

    .line 76
    :cond_d
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 76
    throw p1

    .line 72
    :cond_e
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 72
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 122
    instance-of v0, p1, Ll/۫᩷ۘ;

    if-nez v0, :cond_12

    .line 124
    instance-of v0, p1, Ljava/security/NoSuchAlgorithmException;

    if-nez v0, :cond_11

    .line 126
    instance-of v0, p1, Ll/֨ۡۘ;

    if-nez v0, :cond_10

    instance-of v0, p1, Ljava/lang/ArithmeticException;

    if-eqz v0, :cond_f

    goto :goto_4

    .line 128
    :cond_f
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "pbkdf2 unavailable"

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    throw v0

    .line 127
    :cond_10
    :goto_4
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "invalid ASN1"

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    throw v0

    .line 125
    :cond_11
    new-instance v0, Ll/۫᩷ۘ;

    iget-object v1, p0, Ll/ۚۖۘ;->ۧ:Ljava/lang/String;

    const-string v2, "unsupported pbkdf2 algorithm: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    throw v0

    .line 123
    :cond_12
    check-cast p1, Ll/۫᩷ۘ;

    throw p1
.end method
