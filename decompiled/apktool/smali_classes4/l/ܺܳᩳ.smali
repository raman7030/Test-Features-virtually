.class public final Ll/ܺܳᩳ;
.super Ll/ۡܳᩳ;
.source "UB8Q"


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public ᩶:I

.field public final ᩹:[B


# direct methods
.method public constructor <init>(Ljava/security/cert/X509Certificate;[B)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Ll/ۡܳᩳ;-><init>(Ljava/security/cert/X509Certificate;)V

    const/4 p1, -0x1

    .line 31
    iput p1, p0, Ll/ܺܳᩳ;->᩶:I

    .line 35
    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Ll/ܺܳᩳ;->᩹:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 46
    :cond_0
    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 49
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ll/ܺܳᩳ;->getEncoded()[B

    move-result-object v0

    .line 50
    check-cast p1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object p1

    .line 51
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v1
.end method

.method public final getEncoded()[B
    .locals 1

    .line 40
    iget-object v0, p0, Ll/ܺܳᩳ;->᩹:[B

    if-eqz v0, :cond_0

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 59
    iget v0, p0, Ll/ܺܳᩳ;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 61
    :try_start_0
    invoke-virtual {p0}, Ll/ܺܳᩳ;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    iput v0, p0, Ll/ܺܳᩳ;->᩶:I
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 63
    iput v0, p0, Ll/ܺܳᩳ;->᩶:I

    .line 66
    :cond_0
    :goto_0
    iget v0, p0, Ll/ܺܳᩳ;->᩶:I

    return v0
.end method
