.class public final Ll/ۛᩴ᩵;
.super Ljava/lang/Object;
.source "BA22"

# interfaces
.implements Ll/ܿۖ᩵;


# static fields
.field public static final ۧ:Ll/֫᩻֨;


# instance fields
.field public final ֫:Ljavax/crypto/Mac;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    const-class v0, Ll/ۛᩴ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۛᩴ᩵;->ۧ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>([BI[B)V
    .locals 2

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x202

    if-eq p2, v0, :cond_3

    const/16 v0, 0x210

    if-eq p2, v0, :cond_3

    const/16 v0, 0x300

    const-string v1, "AESCMAC"

    if-eq p2, v0, :cond_2

    const/16 v0, 0x302

    if-eq p2, v0, :cond_2

    const/16 v0, 0x311

    if-ne p2, v0, :cond_1

    if-eqz p3, :cond_0

    .line 74
    invoke-static {p2, p1, p3}, Ll/ۨᩴ᩵;->֫(I[B[B)[B

    move-result-object p1

    .line 75
    invoke-static {}, Ll/ۙ֨᩵;->ܽ()Ljava/security/Provider;

    move-result-object p2

    invoke-static {v1, p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object p2

    goto :goto_0

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Missing preauthIntegrityHash for SMB 3.1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 78
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown dialect"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 p3, 0x0

    new-array p3, p3, [B

    .line 67
    invoke-static {p2, p1, p3}, Ll/ۨᩴ᩵;->֫(I[B[B)[B

    move-result-object p1

    .line 68
    invoke-static {}, Ll/ۙ֨᩵;->ܽ()Ljava/security/Provider;

    move-result-object p2

    invoke-static {v1, p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object p2

    goto :goto_0

    :cond_3
    const-string p2, "HmacSHA256"

    .line 62
    invoke-static {p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p2

    .line 81
    :goto_0
    new-instance p3, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "HMAC"

    invoke-direct {p3, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {p2, p3}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 82
    iput-object p2, p0, Ll/ۛᩴ᩵;->֫:Ljavax/crypto/Mac;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫([BIILl/ܰܺ᩵;Ll/ܰܺ᩵;)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 94
    :try_start_0
    iget-object p4, p0, Ll/ۛᩴ᩵;->֫:Ljavax/crypto/Mac;

    invoke-virtual {p4}, Ljavax/crypto/Mac;->reset()V

    add-int/lit8 p4, p2, 0x30

    const/4 p5, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    add-int v2, p4, v1

    .line 99
    aput-byte p5, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, p2, 0x10

    .line 102
    invoke-static {v1, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v3

    or-int/lit8 v3, v3, 0x8

    int-to-long v3, v3

    .line 104
    invoke-static {v3, v4, v1, p1}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 106
    iget-object v1, p0, Ll/ۛᩴ᩵;->֫:Ljavax/crypto/Mac;

    invoke-virtual {v1, p1, p2, p3}, Ljavax/crypto/Mac;->update([BII)V

    .line 108
    iget-object p2, p0, Ll/ۛᩴ᩵;->֫:Ljavax/crypto/Mac;

    invoke-virtual {p2}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object p2

    .line 109
    invoke-static {p2, p5, p1, p4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
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

.method public final declared-synchronized ֫([BIILl/ܰܺ᩵;)Z
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 120
    :try_start_0
    iget-object p4, p0, Ll/ۛᩴ᩵;->֫:Ljavax/crypto/Mac;

    invoke-virtual {p4}, Ljavax/crypto/Mac;->reset()V

    add-int/lit8 p4, p2, 0x10

    .line 122
    invoke-static {p4, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p4

    and-int/lit8 p4, p4, 0x8

    const/4 v1, 0x1

    if-nez p4, :cond_0

    .line 124
    sget-object p1, Ll/ۛᩴ᩵;->ۧ:Ll/֫᩻֨;

    const-string p2, "The server did not sign a message we expected to be signed"

    invoke-interface {p1, p2}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    monitor-exit v0

    return v1

    :cond_0
    const/16 p4, 0x10

    :try_start_1
    new-array v2, p4, [B

    add-int/lit8 v3, p2, 0x30

    const/4 v4, 0x0

    .line 129
    invoke-static {p1, v3, v2, v4, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, p4, :cond_1

    add-int v6, v3, v5

    .line 133
    aput-byte v4, p1, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 135
    :cond_1
    iget-object v3, p0, Ll/ۛᩴ᩵;->֫:Ljavax/crypto/Mac;

    invoke-virtual {v3, p1, p2, p3}, Ljavax/crypto/Mac;->update([BII)V

    new-array p1, p4, [B

    .line 138
    iget-object p2, p0, Ll/ۛᩴ᩵;->֫:Ljavax/crypto/Mac;

    invoke-virtual {p2}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object p2

    invoke-static {p2, v4, p1, v4, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    invoke-static {v2, p1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_2

    .line 140
    monitor-exit v0

    return v1

    .line 142
    :cond_2
    monitor-exit v0

    return v4

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
