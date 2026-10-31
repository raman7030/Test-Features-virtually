.class public final Ll/֨ܽᩳ;
.super Ll/ܶܽᩳ;
.source "B1VV"


# instance fields
.field public ۜ:Ljava/security/spec/AlgorithmParameterSpec;

.field public ܳ:Ljava/lang/String;

.field public ܿ:I

.field public ᩳ:Ljava/lang/String;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/PSSParameterSpec;)V
    .locals 0

    .line 226
    invoke-direct {p0}, Ll/ܶܽᩳ;-><init>()V

    .line 227
    iput p1, p0, Ll/֨ܽᩳ;->ܿ:I

    .line 228
    iput-object p2, p0, Ll/֨ܽᩳ;->ᩳ:Ljava/lang/String;

    .line 229
    iput-object p3, p0, Ll/֨ܽᩳ;->ܳ:Ljava/lang/String;

    .line 230
    iput-object p4, p0, Ll/֨ܽᩳ;->᩻:Ljava/lang/String;

    .line 231
    iput-object p5, p0, Ll/֨ܽᩳ;->ۜ:Ljava/security/spec/AlgorithmParameterSpec;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 236
    iget v0, p0, Ll/֨ܽᩳ;->ܿ:I

    return v0
.end method

.method public final ֫(Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/ܿۖ᩷;)V
    .locals 7

    .line 261
    iget-object v0, p0, Ll/֨ܽᩳ;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 262
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 263
    invoke-interface {p1}, Ll/֡ܿᩳ;->size()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/ܶܽᩳ;->֫(J)I

    move-result v2

    invoke-interface {p2}, Ll/֡ܿᩳ;->size()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/ܶܽᩳ;->֫(J)I

    move-result v3

    add-int/2addr v2, v3

    invoke-interface {p3}, Ll/֡ܿᩳ;->size()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/ܶܽᩳ;->֫(J)I

    move-result v3

    add-int/2addr v2, v3

    .line 264
    new-instance v3, Ll/ۚܽᩳ;

    invoke-direct {v3, v0}, Ll/ۚܽᩳ;-><init>(Ljava/security/MessageDigest;)V

    const/4 v4, 0x5

    new-array v4, v4, [B

    const/4 v5, 0x0

    const/16 v6, 0x5a

    aput-byte v6, v4, v5

    const/4 v5, 0x1

    .line 277
    invoke-static {v2, v5, v4}, Ll/᩺ۧᩳ;->֫(II[B)V

    .line 278
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write([B)V

    .line 280
    invoke-static {v1, p1, v3, p4}, Ll/ܶܽᩳ;->֫(Ljava/security/MessageDigest;Ll/֡ܿᩳ;Ljava/io/OutputStream;Ll/ܿۖ᩷;)V

    .line 281
    invoke-interface {p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 283
    :cond_0
    invoke-static {v1, p2, v3, p4}, Ll/ܶܽᩳ;->֫(Ljava/security/MessageDigest;Ll/֡ܿᩳ;Ljava/io/OutputStream;Ll/ܿۖ᩷;)V

    .line 284
    invoke-interface {p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 286
    :cond_1
    invoke-static {v1, p3, v3, p4}, Ll/ܶܽᩳ;->֫(Ljava/security/MessageDigest;Ll/֡ܿᩳ;Ljava/io/OutputStream;Ll/ܿۖ᩷;)V

    .line 287
    invoke-interface {p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return-void

    .line 289
    :cond_2
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܶܽᩳ;->֫:[B

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Ll/֨ܽᩳ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    const/16 v0, 0x18

    return v0
.end method

.method public final ܿ()Ljava/security/spec/AlgorithmParameterSpec;
    .locals 1

    .line 256
    iget-object v0, p0, Ll/֨ܽᩳ;->ۜ:Ljava/security/spec/AlgorithmParameterSpec;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 251
    iget-object v0, p0, Ll/֨ܽᩳ;->᩻:Ljava/lang/String;

    return-object v0
.end method
