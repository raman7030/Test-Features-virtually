.class public final Ll/ۛۖ᩵;
.super Ljava/lang/Object;
.source "P9WB"

# interfaces
.implements Ll/ܿۖ᩵;


# static fields
.field public static final ܳ:Ll/֫᩻֨;

.field public static final synthetic ܿ:I


# instance fields
.field public ֫:Ljava/security/MessageDigest;

.field public ۧ:[B

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    const-class v0, Ll/ۛۖ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۛۖ᩵;->ܳ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    invoke-static {}, Ll/ۙ֨᩵;->ۧ()Ljava/security/MessageDigest;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۖ᩵;->֫:Ljava/security/MessageDigest;

    .line 92
    iput-object p1, p0, Ll/ۛۖ᩵;->ۧ:[B

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-static {}, Ll/ۙ֨᩵;->ۧ()Ljava/security/MessageDigest;

    move-result-object p2

    iput-object p2, p0, Ll/ۛۖ᩵;->֫:Ljava/security/MessageDigest;

    .line 70
    iput-object p1, p0, Ll/ۛۖ᩵;->ۧ:[B

    const/4 p2, 0x0

    .line 71
    iput p2, p0, Ll/ۛۖ᩵;->ܽ:I

    .line 74
    sget-object v0, Ll/ۛۖ᩵;->ܳ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "macSigningKey:"

    .line 75
    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 76
    array-length v1, p1

    invoke-static {p1, p2, v1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>([BLjava/lang/Object;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    invoke-static {}, Ll/ۙ֨᩵;->ۧ()Ljava/security/MessageDigest;

    move-result-object p2

    iput-object p2, p0, Ll/ۛۖ᩵;->֫:Ljava/security/MessageDigest;

    .line 104
    iput-object p1, p0, Ll/ۛۖ᩵;->ۧ:[B

    const/4 p1, 0x2

    .line 105
    iput p1, p0, Ll/ۛۖ᩵;->ܽ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 280
    iget-object v1, p0, Ll/ۛۖ᩵;->ۧ:[B

    array-length v2, v1

    invoke-static {v1, v0, v2}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MacSigningKey="

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫([BII)V
    .locals 5

    .line 156
    sget-object v0, Ll/ۛۖ᩵;->ܳ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 157
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "update: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۛۖ᩵;->ᩳ:I

    const-string v3, " "

    const-string v4, ":"

    .line 0
    invoke-static {v1, v2, v3, p2, v4}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 157
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    const/16 v1, 0x100

    .line 158
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {p1, p2, v1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    if-nez p3, :cond_1

    return-void

    .line 163
    :cond_1
    iget-object v0, p0, Ll/ۛۖ᩵;->֫:Ljava/security/MessageDigest;

    invoke-virtual {v0, p1, p2, p3}, Ljava/security/MessageDigest;->update([BII)V

    .line 164
    iget p1, p0, Ll/ۛۖ᩵;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۛۖ᩵;->ᩳ:I

    return-void
.end method

.method public final ֫([BIILl/ܰܺ᩵;Ll/ܰܺ᩵;)V
    .locals 5

    .line 194
    sget-object v0, Ll/ۛۖ᩵;->ܳ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Signing with seq "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۛۖ᩵;->ܽ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 198
    :cond_0
    check-cast p4, Ll/ۨۖ᩵;

    iget v1, p0, Ll/ۛۖ᩵;->ܽ:I

    invoke-virtual {p4, v1}, Ll/ۨۖ᩵;->᩷(I)V

    if-eqz p5, :cond_1

    .line 200
    check-cast p5, Ll/ۨۖ᩵;

    iget p4, p0, Ll/ۛۖ᩵;->ܽ:I

    add-int/lit8 p4, p4, 0x1

    invoke-virtual {p5, p4}, Ll/ۨۖ᩵;->᩷(I)V

    .line 204
    :cond_1
    :try_start_0
    iget-object p4, p0, Ll/ۛۖ᩵;->ۧ:[B

    array-length p5, p4

    const/4 v1, 0x0

    invoke-virtual {p0, p4, v1, p5}, Ll/ۛۖ᩵;->֫([BII)V

    add-int/lit8 p4, p2, 0xe

    const/4 p5, 0x0

    :goto_0
    const/16 v2, 0x8

    if-ge p5, v2, :cond_2

    add-int v2, p4, p5

    .line 207
    aput-byte v1, p1, v2

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    .line 208
    :cond_2
    iget p5, p0, Ll/ۛۖ᩵;->ܽ:I

    int-to-long v3, p5

    invoke-static {v3, v4, p4, p1}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 209
    invoke-virtual {p0, p1, p2, p3}, Ll/ۛۖ᩵;->֫([BII)V

    .line 210
    invoke-virtual {p0}, Ll/ۛۖ᩵;->֫()[B

    move-result-object p2

    invoke-static {p2, v1, p1, p4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string p2, "Signature failed"

    .line 216
    invoke-interface {v0, p2, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    :goto_1
    iget p1, p0, Ll/ۛۖ᩵;->ܽ:I

    add-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ۛۖ᩵;->ܽ:I

    return-void

    :goto_2
    iget p2, p0, Ll/ۛۖ᩵;->ܽ:I

    add-int/lit8 p2, p2, 0x2

    iput p2, p0, Ll/ۛۖ᩵;->ܽ:I

    .line 223
    throw p1
.end method

.method public final ֫([BIILl/ܰܺ᩵;)Z
    .locals 5

    .line 235
    check-cast p4, Ll/ۨۖ᩵;

    .line 478
    iget p2, p4, Ll/ۨۖ᩵;->᩺:I

    const/4 p3, 0x4

    and-int/2addr p2, p3

    .line 237
    sget-object v0, Ll/ۛۖ᩵;->ܳ:Ll/֫᩻֨;

    const/4 v1, 0x0

    if-nez p2, :cond_0

    const-string p1, "Expected signed response, but is not signed"

    .line 239
    invoke-interface {v0, p1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    return v1

    .line 243
    :cond_0
    iget-object p2, p0, Ll/ۛۖ᩵;->ۧ:[B

    array-length v2, p2

    invoke-virtual {p0, p2, v1, v2}, Ll/ۛۖ᩵;->֫([BII)V

    const/16 p2, 0xe

    .line 245
    invoke-virtual {p0, p1, p3, p2}, Ll/ۛۖ᩵;->֫([BII)V

    const/16 p2, 0x8

    new-array p3, p2, [B

    .line 248
    invoke-virtual {p4}, Ll/ۨۖ᩵;->ᩳ֫()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3, v1, p3}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 249
    invoke-virtual {p0, p3, v1, p2}, Ll/ۛۖ᩵;->֫([BII)V

    .line 251
    invoke-virtual {p4}, Ll/ۨۖ᩵;->᩶()I

    move-result p3

    const/16 v2, 0x2e

    const/16 v3, 0x1a

    if-ne p3, v2, :cond_1

    .line 255
    move-object p3, p4

    check-cast p3, Ll/֡ۘ᩵;

    .line 446
    iget p4, p4, Ll/ۨۖ᩵;->ۧ֫:I

    .line 256
    invoke-virtual {p3}, Ll/֡ۘ᩵;->ۖ֫()I

    move-result v2

    sub-int/2addr p4, v2

    add-int/lit8 p4, p4, -0x16

    .line 257
    invoke-virtual {p0, p1, v3, p4}, Ll/ۛۖ᩵;->֫([BII)V

    .line 258
    invoke-virtual {p3}, Ll/֡ۘ᩵;->ܺ֫()[B

    move-result-object p4

    invoke-virtual {p3}, Ll/֡ۘ᩵;->ᩴ֫()I

    move-result v2

    invoke-virtual {p3}, Ll/֡ۘ᩵;->ۖ֫()I

    move-result p3

    invoke-virtual {p0, p4, v2, p3}, Ll/ۛۖ᩵;->֫([BII)V

    goto :goto_0

    .line 446
    :cond_1
    iget p3, p4, Ll/ۨۖ᩵;->ۧ֫:I

    add-int/lit8 p3, p3, -0x16

    .line 260
    invoke-virtual {p0, p1, v3, p3}, Ll/ۛۖ᩵;->֫([BII)V

    .line 262
    :goto_0
    invoke-virtual {p0}, Ll/ۛۖ᩵;->֫()[B

    move-result-object p3

    const/4 p4, 0x0

    :goto_1
    if-ge p4, p2, :cond_4

    .line 264
    aget-byte v2, p3, p4

    const/16 v3, 0x12

    add-int/lit8 v4, p4, 0x12

    aget-byte v4, p1, v4

    if-eq v2, v4, :cond_3

    .line 265
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result p4

    const/4 v2, 0x1

    if-eqz p4, :cond_2

    const-string p4, "signature verification failure"

    .line 266
    invoke-interface {v0, p4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 267
    invoke-static {p3, v1, p2}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p3

    const-string p4, "Expect: "

    invoke-virtual {p4, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 268
    invoke-static {p1, v3, p2}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Have: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_2
    return v2

    :cond_3
    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_4
    return v1
.end method

.method public final ֫()[B
    .locals 4

    .line 174
    iget-object v0, p0, Ll/ۛۖ᩵;->֫:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    .line 176
    sget-object v1, Ll/ۛۖ᩵;->ܳ:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const-string v2, "digest: "

    .line 177
    invoke-interface {v1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 178
    array-length v2, v0

    invoke-static {v0, v3, v2}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 180
    :cond_0
    iput v3, p0, Ll/ۛۖ᩵;->ᩳ:I

    return-object v0
.end method
