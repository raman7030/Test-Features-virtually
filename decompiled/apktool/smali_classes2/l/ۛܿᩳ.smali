.class public Ll/ۛܿᩳ;
.super Ljava/lang/Object;
.source "W1X3"


# annotations
.annotation runtime Ll/᩸ᩳᩳ;
    type = .enum Ll/֫ܿᩳ;->ۨ:Ll/֫ܿᩳ;
.end annotation


# static fields
.field public static final ۜ:Ljava/lang/String; = "1.2.840.10045.2.1"

.field public static final ۢ:Ljava/lang/String; = "2.16.840.1.101.3.4.3.2"

.field public static final ܳ:Ljava/lang/String; = "1.2.840.113549.1.1.1"

.field public static final ܽ:Ll/᩺ᩳᩳ;

.field public static final ܿ:Ljava/lang/String; = "2.16.840.1.101.3.4.2.1"

.field public static final ᩳ:Ljava/lang/String; = "1.3.14.3.2.26"

.field public static final ᩷:Ljava/lang/String; = "1.2.840.113549.1.1.1"

.field public static final ᩻:Ljava/lang/String; = "1.2.840.10040.4.1"


# instance fields
.field public ֫:Ljava/lang/String;
    .annotation runtime Ll/ۨᩳᩳ;
        index = 0x0
        type = .enum Ll/֫ܿᩳ;->ۤ:Ll/֫ܿᩳ;
    .end annotation
.end field

.field public ۧ:Ll/᩺ᩳᩳ;
    .annotation runtime Ll/ۨᩳᩳ;
        index = 0x1
        optional = true
        type = .enum Ll/֫ܿᩳ;->᩹:Ll/֫ܿᩳ;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 34
    new-instance v0, Ll/᩺ᩳᩳ;

    const/4 v1, 0x2

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    invoke-direct {v0, v1}, Ll/᩺ᩳᩳ;-><init>([B)V

    sput-object v0, Ll/ۛܿᩳ;->ܽ:Ll/᩺ᩳᩳ;

    return-void

    :array_0
    .array-data 1
        0x5t
        0x0t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/᩺ᩳᩳ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/ۛܿᩳ;->֫:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Ll/ۛܿᩳ;->ۧ:Ll/᩺ᩳᩳ;

    return-void
.end method

.method public static ֫(Ll/ܰۧᩳ;)Ll/ۛܿᩳ;
    .locals 3

    .line 44
    sget-object v0, Ll/ۤܿᩳ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 48
    new-instance p0, Ll/ۛܿᩳ;

    const-string v0, "2.16.840.1.101.3.4.2.1"

    sget-object v1, Ll/ۛܿᩳ;->ܽ:Ll/᩺ᩳᩳ;

    invoke-direct {p0, v0, v1}, Ll/ۛܿᩳ;-><init>(Ljava/lang/String;Ll/᩺ᩳᩳ;)V

    return-object p0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported digest algorithm: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_1
    new-instance p0, Ll/ۛܿᩳ;

    const-string v0, "1.3.14.3.2.26"

    sget-object v1, Ll/ۛܿᩳ;->ܽ:Ll/᩺ᩳᩳ;

    invoke-direct {p0, v0, v1}, Ll/ۛܿᩳ;-><init>(Ljava/lang/String;Ll/᩺ᩳᩳ;)V

    return-object p0
.end method

.method public static ֫(Ljava/security/PublicKey;I)Ll/ܰۧᩳ;
    .locals 2

    .line 56
    invoke-interface {p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object p0

    const-string v0, "RSA"

    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x12

    if-nez v0, :cond_6

    const-string v0, "1.2.840.113549.1.1.1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "DSA"

    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p0, 0x15

    if-ge p1, p0, :cond_1

    .line 66
    sget-object p0, Ll/ܰۧᩳ;->᩶:Ll/ܰۧᩳ;

    return-object p0

    .line 68
    :cond_1
    sget-object p0, Ll/ܰۧᩳ;->ۙ:Ll/ܰۧᩳ;

    return-object p0

    :cond_2
    const-string v0, "EC"

    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p0, -0x1

    if-eq p1, p0, :cond_4

    if-lt p1, v1, :cond_3

    goto :goto_0

    .line 72
    :cond_3
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string p1, "ECDSA signatures only supported for minSdkVersion 18 and higher"

    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 75
    :cond_4
    :goto_0
    sget-object p0, Ll/ܰۧᩳ;->ۙ:Ll/ܰۧᩳ;

    return-object p0

    .line 77
    :cond_5
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string v0, "Unsupported key algorithm: "

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 77
    invoke-direct {p1, p0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    if-ge p1, v1, :cond_7

    .line 60
    sget-object p0, Ll/ܰۧᩳ;->᩶:Ll/ܰۧᩳ;

    return-object p0

    .line 62
    :cond_7
    sget-object p0, Ll/ܰۧᩳ;->ۙ:Ll/ܰۧᩳ;

    return-object p0
.end method

.method public static ֫(Ljava/security/PublicKey;Ll/ܰۧᩳ;Z)Ll/ܺ᩺ۘ;
    .locals 7

    .line 88
    invoke-interface {p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object p0

    .line 90
    sget-object v0, Ll/ۤܿᩳ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v0, v1

    const-string v2, "Unexpected digest algorithm: "

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    const-string v1, "SHA256"

    goto :goto_0

    .line 98
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string v1, "SHA1"

    :goto_0
    const-string v5, "RSA"

    .line 101
    invoke-virtual {v5, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    const-string v6, "1.2.840.113549.1.1.1"

    if-nez v5, :cond_8

    invoke-virtual {v6, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_3

    :cond_2
    const-string v5, "DSA"

    .line 105
    invoke-virtual {v5, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 107
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    if-eq p0, v4, :cond_4

    if-ne p0, v3, :cond_3

    .line 118
    new-instance p0, Ll/ۛܿᩳ;

    const-string p1, "2.16.840.1.101.3.4.3.2"

    sget-object v0, Ll/ۛܿᩳ;->ܽ:Ll/᩺ᩳᩳ;

    invoke-direct {p0, p1, v0}, Ll/ۛܿᩳ;-><init>(Ljava/lang/String;Ll/᩺ᩳᩳ;)V

    goto :goto_1

    .line 122
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 109
    :cond_4
    new-instance p0, Ll/ۛܿᩳ;

    const-string p1, "1.2.840.10040.4.1"

    sget-object v0, Ll/ۛܿᩳ;->ܽ:Ll/᩺ᩳᩳ;

    invoke-direct {p0, p1, v0}, Ll/ۛܿᩳ;-><init>(Ljava/lang/String;Ll/᩺ᩳᩳ;)V

    :goto_1
    if-eqz p2, :cond_5

    const-string p1, "withDetDSA"

    goto :goto_2

    :cond_5
    const-string p1, "withDSA"

    .line 126
    :goto_2
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 192
    new-instance p2, Ll/ܿۚᩴ;

    invoke-direct {p2, p1, p0}, Ll/ܿۚᩴ;-><init>(Ljava/lang/String;Ll/ۛܿᩳ;)V

    return-object p2

    :cond_6
    const-string p1, "EC"

    .line 128
    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p0, "withECDSA"

    .line 129
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ll/ۛܿᩳ;

    const-string p2, "1.2.840.10045.2.1"

    sget-object v0, Ll/ۛܿᩳ;->ܽ:Ll/᩺ᩳᩳ;

    invoke-direct {p1, p2, v0}, Ll/ۛܿᩳ;-><init>(Ljava/lang/String;Ll/᩺ᩳᩳ;)V

    .line 192
    new-instance p2, Ll/ܿۚᩴ;

    invoke-direct {p2, p0, p1}, Ll/ܿۚᩴ;-><init>(Ljava/lang/String;Ll/ۛܿᩳ;)V

    return-object p2

    .line 133
    :cond_7
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "Unsupported key algorithm: "

    .line 0
    invoke-static {p2, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 133
    invoke-direct {p1, p0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_3
    const-string p0, "withRSA"

    .line 102
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ll/ۛܿᩳ;

    sget-object p2, Ll/ۛܿᩳ;->ܽ:Ll/᩺ᩳᩳ;

    invoke-direct {p1, v6, p2}, Ll/ۛܿᩳ;-><init>(Ljava/lang/String;Ll/᩺ᩳᩳ;)V

    .line 192
    new-instance p2, Ll/ܿۚᩴ;

    invoke-direct {p2, p0, p1}, Ll/ܿۚᩴ;-><init>(Ljava/lang/String;Ll/ۛܿᩳ;)V

    return-object p2
.end method
