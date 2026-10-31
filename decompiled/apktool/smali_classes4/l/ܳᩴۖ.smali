.class public Ll/ܳᩴۖ;
.super Ljava/lang/Object;
.source "X93U"

# interfaces
.implements Ll/ۛۘۖ;


# instance fields
.field public final ֫:Ll/֡ۖۖ;

.field public final ۧ:Z

.field public final ܽ:Ll/ܿᩴۖ;

.field public final ܿ:Ljava/lang/Class;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 8

    .line 2341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2343
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩹()Ll/ܶۖۖ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v6, 0x0

    :goto_0
    iput-boolean v6, p0, Ll/ܳᩴۖ;->ᩳ:Z

    .line 2344
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩶()Z

    move-result v7

    iput-boolean v7, p0, Ll/ܳᩴۖ;->ۧ:Z

    .line 2345
    new-instance v0, Ll/ܿᩴۖ;

    move-object v1, v0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v1 .. v7}, Ll/ܿᩴۖ;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;ZZ)V

    .line 2354
    iput-object p1, p0, Ll/ܳᩴۖ;->֫:Ll/֡ۖۖ;

    .line 2355
    invoke-static {v0}, Ll/ܿᩴۖ;->֫(Ll/ܿᩴۖ;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Ll/ܳᩴۖ;->ܿ:Ljava/lang/Class;

    .line 2356
    iput-object v0, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۘᩴۖ;)Ljava/lang/Object;
    .locals 0

    .line 2394
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "getRepeatedField() called on a singular field."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 1

    .line 2374
    iget-object v0, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    invoke-virtual {v0, p1}, Ll/ܿᩴۖ;->֫(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫()Ll/ܳ֡ۖ;
    .locals 2

    .line 2453
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "newBuilderForField() called on a non-Message type."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/᩶ۘۖ;I)Ll/ܳ֡ۖ;
    .locals 0

    .line 2464
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "getRepeatedFieldBuilder() called on a non-Message type."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩶ۘۖ;)V
    .locals 1

    .line 2448
    iget-object v0, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    invoke-virtual {v0, p1}, Ll/ܿᩴۖ;->֫(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public final ֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V
    .locals 0

    .line 2404
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "setRepeatedField() called on a singular field."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 1

    .line 2389
    iget-object v0, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܿᩴۖ;->֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;
    .locals 1

    .line 2379
    iget-object v0, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    invoke-virtual {v0, p1}, Ll/ܿᩴۖ;->ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/᩶ۘۖ;I)Ljava/lang/Object;
    .locals 0

    .line 2399
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "getRepeatedField() called on a singular field."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 0

    .line 2409
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "addRepeatedField() called on a singular field."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/ۘᩴۖ;)Z
    .locals 4

    .line 2414
    iget-boolean v0, p0, Ll/ܳᩴۖ;->ۧ:Z

    iget-object v1, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    if-nez v0, :cond_2

    .line 2415
    iget-boolean v0, p0, Ll/ܳᩴۖ;->ᩳ:Z

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ܳᩴۖ;->֫:Ll/֡ۖۖ;

    if-eqz v0, :cond_1

    .line 2416
    invoke-virtual {v1, p1}, Ll/ܿᩴۖ;->ۧ(Ll/ۘᩴۖ;)I

    move-result p1

    invoke-virtual {v3}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    if-ne p1, v0, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 2418
    :cond_1
    invoke-virtual {p0, p1}, Ll/ܳᩴۖ;->֫(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3}, Ll/֡ۖۖ;->֡()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    .line 2420
    :cond_2
    invoke-virtual {v1, p1}, Ll/ܿᩴۖ;->ܽ(Ll/ۘᩴۖ;)Z

    move-result p1

    return p1
.end method

.method public ܽ(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 0

    .line 2384
    invoke-virtual {p0, p1}, Ll/ܳᩴۖ;->֫(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/᩶ۘۖ;)Z
    .locals 4

    .line 2425
    iget-boolean v0, p0, Ll/ܳᩴۖ;->ۧ:Z

    iget-object v1, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    if-nez v0, :cond_2

    .line 2426
    iget-boolean v0, p0, Ll/ܳᩴۖ;->ᩳ:Z

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ܳᩴۖ;->֫:Ll/֡ۖۖ;

    if-eqz v0, :cond_1

    .line 2427
    invoke-virtual {v1, p1}, Ll/ܿᩴۖ;->ܽ(Ll/᩶ۘۖ;)I

    move-result p1

    invoke-virtual {v3}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    if-ne p1, v0, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 2429
    :cond_1
    invoke-virtual {p0, p1}, Ll/ܳᩴۖ;->ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3}, Ll/֡ۖۖ;->֡()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    .line 2431
    :cond_2
    invoke-virtual {v1, p1}, Ll/ܿᩴۖ;->ᩳ(Ll/᩶ۘۖ;)Z

    move-result p1

    return p1
.end method

.method public final ܿ(Ll/᩶ۘۖ;)I
    .locals 1

    .line 2442
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getRepeatedFieldSize() called on a singular field."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ(Ll/ۘᩴۖ;)I
    .locals 1

    .line 2436
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getRepeatedFieldSize() called on a singular field."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ᩳ(Ll/᩶ۘۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 2459
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getFieldBuilder() called on a non-Message type."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
