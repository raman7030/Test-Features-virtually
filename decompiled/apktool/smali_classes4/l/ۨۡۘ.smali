.class public final Ll/ۨۡۘ;
.super Ljava/lang/Object;
.source "K7W8"

# interfaces
.implements Ll/֫ۢۘ;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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
    .locals 6

    .line 85
    iget-object v1, p0, Ll/ۨۡۘ;->ᩳ:[B

    iget v2, p0, Ll/ۨۡۘ;->ۧ:I

    iget v3, p0, Ll/ۨۡۘ;->֫:I

    iget v4, p0, Ll/ۨۡۘ;->ܽ:I

    move-object v0, p2

    move v5, p1

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/crypto/generators/SCrypt;->generate([B[BIIII)[B

    move-result-object p1

    return-object p1
.end method

.method public final ۧ([B)V
    .locals 6

    .line 46
    :try_start_0
    new-instance v0, Ll/ۚۡۘ;

    invoke-direct {v0, p1}, Ll/ۚۡۘ;-><init>([B)V

    .line 47
    invoke-virtual {v0}, Ll/ۚۡۘ;->᩷()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 50
    invoke-virtual {v0}, Ll/ۚۡۘ;->ۧ()[Ll/ۚۡۘ;

    move-result-object p1

    .line 51
    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_6

    array-length v0, p1

    const/4 v2, 0x5

    if-gt v0, v2, :cond_6

    const/4 v0, 0x0

    .line 54
    aget-object v2, p1, v0

    invoke-virtual {v2}, Ll/ۚۡۘ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    .line 57
    aget-object v3, p1, v2

    invoke-virtual {v3}, Ll/ۚۡۘ;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x2

    .line 60
    aget-object v4, p1, v3

    invoke-virtual {v4}, Ll/ۚۡۘ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, 0x3

    .line 63
    aget-object v5, p1, v4

    invoke-virtual {v5}, Ll/ۚۡۘ;->ܳ()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 66
    array-length v5, p1

    if-le v5, v1, :cond_1

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ll/ۚۡۘ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 67
    throw p1

    .line 70
    :cond_1
    :goto_0
    aget-object v0, p1, v0

    invoke-virtual {v0}, Ll/ۚۡۘ;->֫()[B

    move-result-object v0

    iput-object v0, p0, Ll/ۨۡۘ;->ᩳ:[B

    .line 71
    aget-object v0, p1, v2

    invoke-virtual {v0}, Ll/ۚۡۘ;->֫()[B

    move-result-object v0

    invoke-static {v0}, Ll/ۚۡۘ;->֫([B)I

    move-result v0

    iput v0, p0, Ll/ۨۡۘ;->ۧ:I

    .line 72
    aget-object v0, p1, v3

    invoke-virtual {v0}, Ll/ۚۡۘ;->֫()[B

    move-result-object v0

    invoke-static {v0}, Ll/ۚۡۘ;->֫([B)I

    move-result v0

    iput v0, p0, Ll/ۨۡۘ;->֫:I

    .line 73
    aget-object p1, p1, v4

    invoke-virtual {p1}, Ll/ۚۡۘ;->֫()[B

    move-result-object p1

    invoke-static {p1}, Ll/ۚۡۘ;->֫([B)I

    move-result p1

    iput p1, p0, Ll/ۨۡۘ;->ܽ:I

    return-void

    .line 64
    :cond_2
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 64
    throw p1

    .line 61
    :cond_3
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 61
    throw p1

    .line 58
    :cond_4
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 58
    throw p1

    .line 55
    :cond_5
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 55
    throw p1

    .line 52
    :cond_6
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 52
    throw p1

    .line 48
    :cond_7
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 48
    throw p1
    :try_end_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 75
    :goto_1
    instance-of v0, p1, Ll/۫᩷ۘ;

    if-nez v0, :cond_a

    .line 77
    instance-of v0, p1, Ll/֨ۡۘ;

    if-nez v0, :cond_9

    instance-of v0, p1, Ljava/lang/ArithmeticException;

    if-eqz v0, :cond_8

    goto :goto_2

    .line 79
    :cond_8
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "scrypt unavailable"

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    throw v0

    .line 78
    :cond_9
    :goto_2
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "invalid ASN1"

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    throw v0

    .line 76
    :cond_a
    check-cast p1, Ll/۫᩷ۘ;

    throw p1
.end method
