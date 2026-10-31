.class public final Ll/᩵ۚ᩵;
.super Ljava/lang/Object;
.source "LA2F"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 268
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵ۚ᩵;->֫:[B

    return-void

    :array_0
    .array-data 1
        0x4bt
        0x47t
        0x53t
        0x21t
        0x40t
        0x23t
        0x24t
        0x25t
    .end array-data
.end method

.method public static ֫([B[B[B)V
    .locals 8

    const/4 v0, 0x7

    new-array v1, v0, [B

    const/16 v2, 0x8

    new-array v3, v2, [B

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 282
    :goto_0
    array-length v6, p0

    div-int/2addr v6, v0

    if-ge v5, v6, :cond_0

    mul-int/lit8 v6, v5, 0x7

    .line 283
    invoke-static {p0, v6, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 284
    invoke-static {v1}, Ll/ۙ֨᩵;->ۧ([B)Ljavax/crypto/Cipher;

    move-result-object v6

    .line 285
    array-length v7, p1

    invoke-virtual {v6, p1, v4, v7, v3}, Ljavax/crypto/Cipher;->update([BII[B)I

    mul-int/lit8 v6, v5, 0x8

    .line 286
    invoke-static {v3, v4, p2, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 1

    if-eqz p0, :cond_0

    .line 129
    invoke-static {}, Ll/ۙ֨᩵;->֫()Ljava/security/MessageDigest;

    move-result-object v0

    .line 130
    invoke-static {p0}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 131
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    return-object p0

    .line 127
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Password parameter is required"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;[B[B[B)[B
    .locals 1

    const/16 v0, 0x18

    new-array v0, v0, [B

    .line 199
    invoke-static {p2}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object p2

    .line 200
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 201
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 202
    invoke-virtual {p2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object p0

    .line 203
    invoke-virtual {p0, p3}, Ljava/security/MessageDigest;->update([B)V

    .line 204
    invoke-virtual {p0, p4}, Ljava/security/MessageDigest;->update([B)V

    const/4 p1, 0x0

    const/16 p2, 0x10

    .line 205
    invoke-virtual {p0, v0, p1, p2}, Ljava/security/MessageDigest;->digest([BII)I

    const/16 p0, 0x8

    .line 206
    invoke-static {p4, p1, v0, p2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static ֫(Ll/ᩴۡ᩵;Ljava/lang/String;[B)[B
    .locals 4

    const/16 v0, 0xe

    new-array v1, v0, [B

    const/16 v2, 0x15

    new-array v2, v2, [B

    const/16 v3, 0x18

    new-array v3, v3, [B

    .line 254
    invoke-interface {p0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۤ֨᩵;->֫(Ljava/lang/String;Ll/֨ۡ᩵;)[B

    move-result-object p0

    .line 255
    array-length p1, p0

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    const/4 p1, 0x0

    .line 261
    invoke-static {p0, p1, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 262
    sget-object p0, Ll/᩵ۚ᩵;->֫:[B

    invoke-static {v1, p0, v2}, Ll/᩵ۚ᩵;->֫([B[B[B)V

    .line 263
    invoke-static {v2, p2, v3}, Ll/᩵ۚ᩵;->֫([B[B[B)V

    return-object v3
.end method

.method public static ֫([B[B)[B
    .locals 4

    const/16 v0, 0x15

    new-array v0, v0, [B

    const/16 v1, 0x18

    new-array v1, v1, [B

    const/4 v2, 0x0

    const/16 v3, 0x10

    .line 235
    invoke-static {p0, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 236
    invoke-static {v0, p1, v1}, Ll/᩵ۚ᩵;->֫([B[B[B)V

    return-object v1
.end method

.method public static ۧ([B[B[B)[B
    .locals 3

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 154
    invoke-static {}, Ll/ۙ֨᩵;->ۧ()Ljava/security/MessageDigest;

    move-result-object v2

    .line 156
    invoke-virtual {v2, p1}, Ljava/security/MessageDigest;->update([B)V

    const/4 p1, 0x0

    .line 157
    invoke-virtual {v2, p2, p1, v0}, Ljava/security/MessageDigest;->update([BII)V

    .line 158
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p2

    invoke-static {p2, p1, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 p2, 0x15

    new-array p2, p2, [B

    const/16 v0, 0x10

    .line 161
    invoke-static {p0, p1, p2, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 p0, 0x18

    new-array p0, p0, [B

    .line 163
    invoke-static {p2, v1, p0}, Ll/᩵ۚ᩵;->֫([B[B[B)V

    return-object p0
.end method
