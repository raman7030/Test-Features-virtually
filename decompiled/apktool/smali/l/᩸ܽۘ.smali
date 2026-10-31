.class public final Ll/᩸ܽۘ;
.super Ljava/lang/Object;
.source "69D6"


# instance fields
.field public ֫:Ljavax/crypto/SecretKey;

.field public ۧ:Z

.field public ܳ:Ljavax/crypto/SecretKey;

.field public ܽ:Ljavax/crypto/SecretKey;

.field public ܿ:Ljavax/crypto/spec/SecretKeySpec;

.field public ᩳ:[B

.field public ᩻:Z


# virtual methods
.method public final ֫()Ljavax/crypto/SecretKey;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/᩸ܽۘ;->֫:Ljavax/crypto/SecretKey;

    return-object v0
.end method

.method public final ֫(Ljavax/crypto/spec/SecretKeySpec;)V
    .locals 0

    .line 109
    iput-object p1, p0, Ll/᩸ܽۘ;->֫:Ljavax/crypto/SecretKey;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 53
    iput-boolean p1, p0, Ll/᩸ܽۘ;->᩻:Z

    return-void
.end method

.method public final ֫([B)V
    .locals 1

    .line 77
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/᩸ܽۘ;->ᩳ:[B

    return-void
.end method

.method public final ۜ()V
    .locals 1

    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p0, Ll/᩸ܽۘ;->ۧ:Z

    return-void
.end method

.method public final ۧ()Ljavax/crypto/SecretKey;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/᩸ܽۘ;->ܽ:Ljavax/crypto/SecretKey;

    return-object v0
.end method

.method public final ۧ(Ljavax/crypto/spec/SecretKeySpec;)V
    .locals 0

    .line 105
    iput-object p1, p0, Ll/᩸ܽۘ;->ܽ:Ljavax/crypto/SecretKey;

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Ll/᩸ܽۘ;->ۧ:Z

    return v0
.end method

.method public final ܽ(Ljavax/crypto/spec/SecretKeySpec;)V
    .locals 0

    .line 73
    iput-object p1, p0, Ll/᩸ܽۘ;->ܿ:Ljavax/crypto/spec/SecretKeySpec;

    return-void
.end method

.method public final ܽ()[B
    .locals 1

    .line 81
    iget-object v0, p0, Ll/᩸ܽۘ;->ᩳ:[B

    return-object v0
.end method

.method public final ܿ()Ljavax/crypto/SecretKey;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/᩸ܽۘ;->ܳ:Ljavax/crypto/SecretKey;

    return-object v0
.end method

.method public final ᩳ()Ljavax/crypto/spec/SecretKeySpec;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/᩸ܽۘ;->ܿ:Ljavax/crypto/spec/SecretKeySpec;

    return-object v0
.end method

.method public final ᩳ(Ljavax/crypto/spec/SecretKeySpec;)V
    .locals 0

    .line 113
    iput-object p1, p0, Ll/᩸ܽۘ;->ܳ:Ljavax/crypto/SecretKey;

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Ll/᩸ܽۘ;->᩻:Z

    return v0
.end method
