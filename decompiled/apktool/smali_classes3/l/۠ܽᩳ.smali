.class public final Ll/۠ܽᩳ;
.super Ll/ܶܽᩳ;
.source "B1VV"


# instance fields
.field public ܳ:Ljava/lang/String;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 299
    invoke-direct {p0}, Ll/ܶܽᩳ;-><init>()V

    .line 300
    iput p1, p0, Ll/۠ܽᩳ;->ᩳ:I

    .line 301
    iput-object p2, p0, Ll/۠ܽᩳ;->ܿ:Ljava/lang/String;

    .line 302
    iput-object p3, p0, Ll/۠ܽᩳ;->ܳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 308
    iget v0, p0, Ll/۠ܽᩳ;->ᩳ:I

    return v0
.end method

.method public final ֫(Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/ܿۖ᩷;)V
    .locals 3

    .line 333
    new-instance v0, Ll/ۘᩳᩳ;

    const/16 v1, 0x8

    new-array v2, v1, [B

    invoke-direct {v0, v2}, Ll/ۘᩳᩳ;-><init>([B)V

    .line 334
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۘᩳᩳ;->֫(Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/ܿۖ᩷;)[B

    move-result-object v0

    .line 335
    invoke-interface {p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result p4

    if-eqz p4, :cond_0

    return-void

    .line 336
    :cond_0
    array-length p4, v0

    add-int/2addr p4, v1

    new-array p4, p4, [B

    .line 337
    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, p4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 338
    invoke-interface {p1}, Ll/֡ܿᩳ;->size()J

    move-result-wide v1

    invoke-interface {p2}, Ll/֡ܿᩳ;->size()J

    move-result-wide p1

    add-long/2addr p1, v1

    invoke-interface {p3}, Ll/֡ܿᩳ;->size()J

    move-result-wide v1

    add-long/2addr v1, p1

    .line 339
    array-length p1, v0

    invoke-static {v1, v2, p1, p4}, Ll/᩺ۧᩳ;->֫(JI[B)V

    .line 340
    iput-object p4, p0, Ll/ܶܽᩳ;->֫:[B

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 318
    iget-object v0, p0, Ll/۠ܽᩳ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    const/16 v0, 0x1c

    return v0
.end method

.method public final ܿ()Ljava/security/spec/AlgorithmParameterSpec;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 323
    iget-object v0, p0, Ll/۠ܽᩳ;->ܳ:Ljava/lang/String;

    return-object v0
.end method
