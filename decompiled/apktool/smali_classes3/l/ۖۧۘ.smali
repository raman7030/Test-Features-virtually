.class public final Ll/ۖۧۘ;
.super Ll/ܽۨۖ;
.source "Z9HI"


# instance fields
.field public final synthetic ܳ:Ll/ۘۧۘ;

.field public ܿ:Ljavax/crypto/SecretKey;

.field public final ᩻:Ll/ܽۨۖ;


# direct methods
.method public constructor <init>(Ll/ۘۧۘ;Ll/ܽۨۖ;Ljavax/crypto/SecretKey;)V
    .locals 0

    .line 99
    iput-object p1, p0, Ll/ۖۧۘ;->ܳ:Ll/ۘۧۘ;

    invoke-direct {p0}, Ll/ܽۨۖ;-><init>()V

    .line 100
    iput-object p2, p0, Ll/ۖۧۘ;->᩻:Ll/ܽۨۖ;

    .line 101
    iput-object p3, p0, Ll/ۖۧۘ;->ܿ:Ljavax/crypto/SecretKey;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Signed("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۖۧۘ;->᩻:Ll/ܽۨۖ;

    invoke-virtual {v1}, Ll/ܽۨۖ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫(Ll/֡֫ۘ;)V
    .locals 0

    .line 95
    invoke-virtual {p0, p1}, Ll/ۖۧۘ;->ܽ(Ll/֡֫ۘ;)V

    return-void
.end method

.method public final ۧ()Ll/ۚ֫ۘ;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۖۧۘ;->᩻:Ll/ܽۨۖ;

    invoke-virtual {v0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    return-object v0
.end method

.method public final ܳ()Ll/ܽۨۖ;
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ۖۧۘ;->᩻:Ll/ܽۨۖ;

    invoke-virtual {v0}, Ll/ܽۨۖ;->ܳ()Ll/ܽۨۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۖۧۘ;->᩻:Ll/ܽۨۖ;

    invoke-virtual {v0}, Ll/֨֫ۘ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ܽ(Ll/֡֫ۘ;)V
    .locals 5

    .line 120
    iget-object v0, p0, Ll/ۖۧۘ;->ܳ:Ll/ۘۧۘ;

    iget-object v1, p0, Ll/ۖۧۘ;->᩻:Ll/ܽۨۖ;

    :try_start_0
    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    check-cast v2, Ll/᩻ۨۖ;

    sget-object v3, Ll/֫ۨۖ;->ۛ:Ll/֫ۨۖ;

    invoke-virtual {v2, v3}, Ll/᩻ۨۖ;->ۧ(Ll/֫ۨۖ;)V

    .line 121
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܺ()I

    move-result v2

    .line 123
    invoke-virtual {v1, p1}, Ll/ܽۨۖ;->ܽ(Ll/֡֫ۘ;)V

    .line 124
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܺ()I

    move-result v1

    sub-int/2addr v1, v2

    .line 125
    sget v3, Ll/ۘۧۘ;->᩹:I
    :try_end_0
    .catch Ll/۠۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :try_start_1
    iget-object v3, p0, Ll/ۖۧۘ;->ܿ:Ljavax/crypto/SecretKey;

    invoke-static {v0}, Ll/ۘۧۘ;->֫(Ll/ۘۧۘ;)Ll/ۖ֫ۘ;

    move-result-object v0

    .line 90
    invoke-interface {v3}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Ll/ۖ֫ۘ;->ۧ(Ljava/lang/String;)Ll/ۚ۟ۖ;

    move-result-object v0

    .line 91
    invoke-interface {v3}, Ljava/security/Key;->getEncoded()[B

    move-result-object v3

    invoke-interface {v0, v3}, Ll/ۚ۟ۖ;->init([B)V

    .line 131
    invoke-virtual {p1}, Ll/ۤܰۖ;->֫()[B

    move-result-object v3

    invoke-interface {v0, v3, v2, v1}, Ll/ۚ۟ۖ;->update([BII)V

    .line 132
    invoke-interface {v0}, Ll/ۚ۟ۖ;->֫()[B

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    :try_start_2
    invoke-virtual {p1}, Ll/ۤܰۖ;->֫()[B

    move-result-object p1

    add-int/lit8 v2, v2, 0x30

    const/16 v1, 0x10

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :catchall_0
    move-exception p1

    .line 137
    throw p1
    :try_end_2
    .catch Ll/۠۟ۖ; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 141
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ܿ()I
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۖۧۘ;->᩻:Ll/ܽۨۖ;

    invoke-virtual {v0}, Ll/ܽۨۖ;->ܿ()I

    move-result v0

    return v0
.end method
