.class public final Ll/ۖ۟ܺ;
.super Ll/ۘ۟ܺ;
.source "57R8"

# interfaces
.implements Ll/۫۟ܺ;


# instance fields
.field public final ۛ:Ll/᩸۟ܺ;

.field public final ۤ:Ll/ܺ۟ܺ;

.field public final ۫:Ll/۠۟ܺ;

.field public final ۬:Ll/ܽ۫ᩴ;


# direct methods
.method public constructor <init>(Ll/᩸۟ܺ;Ll/ܺ۟ܺ;Ll/۠۟ܺ;Ll/ܽ۫ᩴ;)V
    .locals 0

    .line 427
    invoke-direct {p0}, Ll/ۘ۟ܺ;-><init>()V

    .line 428
    iput-object p1, p0, Ll/ۖ۟ܺ;->ۛ:Ll/᩸۟ܺ;

    .line 429
    iput-object p2, p0, Ll/ۖ۟ܺ;->ۤ:Ll/ܺ۟ܺ;

    .line 430
    iput-object p3, p0, Ll/ۖ۟ܺ;->۫:Ll/۠۟ܺ;

    .line 431
    iput-object p4, p0, Ll/ۖ۟ܺ;->۬:Ll/ܽ۫ᩴ;

    return-void
.end method

.method public static ֫(Ll/᩸۟ܺ;Ll/ܺ۟ܺ;Ll/۠۟ܺ;Ll/ܽ۫ᩴ;)Ll/ۖ۟ܺ;
    .locals 1

    .line 464
    new-instance v0, Ll/ۖ۟ܺ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۖ۟ܺ;-><init>(Ll/᩸۟ܺ;Ll/ܺ۟ܺ;Ll/۠۟ܺ;Ll/ܽ۫ᩴ;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 520
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "token"

    iget-object v2, p0, Ll/ۖ۟ܺ;->ۛ:Ll/᩸۟ܺ;

    .line 521
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "realOrImaginary"

    iget-object v2, p0, Ll/ۖ۟ܺ;->ۤ:Ll/ܺ۟ܺ;

    .line 522
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "plusIndentCommentsBefore"

    iget-object v2, p0, Ll/ۖ۟ܺ;->۫:Ll/۠۟ܺ;

    .line 523
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 524
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 499
    iget-object v0, p0, Ll/ۖ۟ܺ;->ۛ:Ll/᩸۟ܺ;

    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;)Ll/ۢ۟ܺ;
    .locals 1

    .line 509
    iget p1, p2, Ll/ۢ۟ܺ;->֫:I

    invoke-virtual {p0}, Ll/ۖ۟ܺ;->ܽ()I

    move-result v0

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Ll/ۢ۟ܺ;->֫(I)Ll/ۢ۟ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩴ۟ܺ;)V
    .locals 0

    .line 488
    invoke-virtual {p1, p0}, Ll/ᩴ۟ܺ;->֫(Ll/ۘ۟ܺ;)V

    return-void
.end method

.method public final ֫(Ll/ᩴۧۖ;)V
    .locals 2

    .line 514
    iget-object v0, p0, Ll/ۖ۟ܺ;->ۛ:Ll/᩸۟ܺ;

    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 515
    invoke-virtual {p0}, Ll/ۘ۟ܺ;->ܳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ll/ᩴۧۖ;->֫(Ll/ܰۤܺ;Ljava/lang/String;)V

    return-void
.end method

.method public final ۡ()Ll/᩸۟ܺ;
    .locals 1

    .line 474
    iget-object v0, p0, Ll/ۖ۟ܺ;->ۛ:Ll/᩸۟ܺ;

    return-object v0
.end method

.method public final ۢ()Ll/۠۟ܺ;
    .locals 1

    .line 440
    iget-object v0, p0, Ll/ۖ۟ܺ;->۫:Ll/۠۟ܺ;

    return-object v0
.end method

.method public final ۧ()Ll/ܰۤܺ;
    .locals 2

    .line 504
    iget-object v0, p0, Ll/ۖ۟ܺ;->ۛ:Ll/᩸۟ܺ;

    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 292
    invoke-static {v0, v0}, Ll/ܰۤܺ;->֫(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v0

    .line 504
    invoke-static {}, Ll/ۘ۟ܺ;->ۜ()Ll/᩵ۗܺ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܰۤܺ;->֫(Ll/᩵ۗܺ;)Ll/ܰۤܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Ll/ܺ۟ܺ;
    .locals 1

    .line 483
    iget-object v0, p0, Ll/ۖ۟ܺ;->ۤ:Ll/ܺ۟ܺ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 3

    .line 420
    iget-object v0, p0, Ll/ۖ۟ܺ;->ۛ:Ll/᩸۟ܺ;

    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v1

    .line 493
    invoke-interface {v1}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    sget v2, Ll/۬۟ܺ;->֫:I

    .line 112
    new-instance v2, Ll/ۗ۟ܺ;

    invoke-direct {v2, v1}, Ll/ۗ۟ܺ;-><init>(Ljava/lang/String;)V

    .line 41
    invoke-virtual {v2}, Ll/ۗ۟ܺ;->next()Ljava/lang/Object;

    .line 42
    invoke-virtual {v2}, Ll/ۗ۟ܺ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ll/ۗ۟ܺ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    const/16 v0, 0x3e8

    return v0

    .line 420
    :cond_1
    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    .line 494
    invoke-interface {v0}, Ll/ܶ۟ܺ;->length()I

    move-result v0

    return v0
.end method

.method public final ᩷()Ll/ܽ۫ᩴ;
    .locals 1

    .line 447
    iget-object v0, p0, Ll/ۖ۟ܺ;->۬:Ll/ܽ۫ᩴ;

    return-object v0
.end method
