.class public final Ll/۬֨᩵;
.super Ljava/security/MessageDigest;
.source "49UX"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᩶:[B

.field public ᩸:[B

.field public ᩹:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>([B)V
    .locals 7

    const-string v0, "HMACT64"

    .line 52
    invoke-direct {p0, v0}, Ljava/security/MessageDigest;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x40

    new-array v1, v0, [B

    .line 41
    iput-object v1, p0, Ll/۬֨᩵;->᩸:[B

    new-array v1, v0, [B

    .line 43
    iput-object v1, p0, Ll/۬֨᩵;->᩶:[B

    .line 53
    array-length v1, p1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x5c

    const/16 v4, 0x36

    if-ge v2, v1, :cond_0

    .line 55
    iget-object v5, p0, Ll/۬֨᩵;->᩸:[B

    aget-byte v6, p1, v2

    xor-int/2addr v4, v6

    int-to-byte v4, v4

    aput-byte v4, v5, v2

    .line 56
    iget-object v4, p0, Ll/۬֨᩵;->᩶:[B

    aget-byte v5, p1, v2

    xor-int/2addr v3, v5

    int-to-byte v3, v3

    aput-byte v3, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v1, v0, :cond_1

    .line 59
    iget-object p1, p0, Ll/۬֨᩵;->᩸:[B

    aput-byte v4, p1, v1

    .line 60
    iget-object p1, p0, Ll/۬֨᩵;->᩶:[B

    aput-byte v3, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 63
    :cond_1
    invoke-static {}, Ll/ۙ֨᩵;->ۧ()Ljava/security/MessageDigest;

    move-result-object p1

    iput-object p1, p0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;

    .line 64
    invoke-virtual {p0}, Ll/۬֨᩵;->engineReset()V

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 79
    :try_start_0
    new-instance v0, Ll/۬֨᩵;

    const-string v1, "HMACT64"

    .line 69
    invoke-direct {v0, v1}, Ljava/security/MessageDigest;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x40

    new-array v2, v1, [B

    .line 41
    iput-object v2, v0, Ll/۬֨᩵;->᩸:[B

    new-array v1, v1, [B

    .line 43
    iput-object v1, v0, Ll/۬֨᩵;->᩶:[B

    .line 70
    iget-object v1, p0, Ll/۬֨᩵;->᩸:[B

    iput-object v1, v0, Ll/۬֨᩵;->᩸:[B

    .line 71
    iget-object v1, p0, Ll/۬֨᩵;->᩶:[B

    iput-object v1, v0, Ll/۬֨᩵;->᩶:[B

    .line 72
    iget-object v1, p0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/MessageDigest;

    iput-object v1, v0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 81
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final engineDigest([BII)I
    .locals 3

    .line 96
    iget-object v0, p0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 97
    iget-object v2, p0, Ll/۬֨᩵;->᩶:[B

    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 98
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 100
    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/security/MessageDigest;->digest([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 102
    :catch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final engineDigest()[B
    .locals 3

    .line 88
    iget-object v0, p0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 89
    iget-object v2, p0, Ll/۬֨᩵;->᩶:[B

    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 90
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method public final engineGetDigestLength()I
    .locals 1

    .line 109
    iget-object v0, p0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v0

    return v0
.end method

.method public final engineReset()V
    .locals 2

    .line 115
    iget-object v0, p0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    .line 116
    iget-object v1, p0, Ll/۬֨᩵;->᩸:[B

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final engineUpdate(B)V
    .locals 1

    .line 122
    iget-object v0, p0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update(B)V

    return-void
.end method

.method public final engineUpdate([BII)V
    .locals 1

    .line 128
    iget-object v0, p0, Ll/۬֨᩵;->᩹:Ljava/security/MessageDigest;

    invoke-virtual {v0, p1, p2, p3}, Ljava/security/MessageDigest;->update([BII)V

    return-void
.end method
