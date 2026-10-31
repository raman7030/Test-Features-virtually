.class public final Ll/ܿܰܳ;
.super Ljava/lang/Object;
.source "A1YB"

# interfaces
.implements Ll/ܶ᩶᩻;


# instance fields
.field public final synthetic ۗ:Ll/ܺܰܳ;

.field public ۙ:Ljava/util/List;

.field public final synthetic ۛ:[Z

.field public final synthetic ۤ:J

.field public final synthetic ۨ:Ll/ᩳܰۡ;

.field public final synthetic ۫:J

.field public final synthetic ۬:Ll/ۗ᩺ۡ;

.field public ᩶:Z

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ܺܰܳ;JJLl/ᩳܰۡ;[ZLl/ۗ᩺ۡ;)V
    .locals 0

    .line 405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܰܳ;->ۗ:Ll/ܺܰܳ;

    iput-wide p2, p0, Ll/ܿܰܳ;->۫:J

    iput-wide p4, p0, Ll/ܿܰܳ;->ۤ:J

    iput-object p6, p0, Ll/ܿܰܳ;->ۨ:Ll/ᩳܰۡ;

    iput-object p7, p0, Ll/ܿܰܳ;->ۛ:[Z

    iput-object p8, p0, Ll/ܿܰܳ;->۬:Ll/ۗ᩺ۡ;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 459
    iget-object v0, p0, Ll/ܿܰܳ;->ۗ:Ll/ܺܰܳ;

    .line 288
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->cancel()V

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 413
    iget-object v0, p0, Ll/ܿܰܳ;->ۗ:Ll/ܺܰܳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩹ܶۢ;->ܽ(JJ)V

    .line 414
    iget-wide p3, p0, Ll/ܿܰܳ;->۫:J

    add-long/2addr p3, p1

    iget-wide p1, p0, Ll/ܿܰܳ;->ۤ:J

    invoke-virtual {v0, p3, p4, p1, p2}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    return-void
.end method

.method public final ۖ()Z
    .locals 1

    .line 454
    iget-boolean v0, p0, Ll/ܿܰܳ;->᩶:Z

    return v0
.end method

.method public final ᩴ()Z
    .locals 6

    .line 419
    iget-object v0, p0, Ll/ܿܰܳ;->ۨ:Ll/ᩳܰۡ;

    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩹()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 420
    iput-boolean v3, p0, Ll/ܿܰܳ;->᩹:Z

    .line 421
    iput-boolean v3, p0, Ll/ܿܰܳ;->᩶:Z

    return v2

    .line 424
    :cond_0
    iget-object v1, p0, Ll/ܿܰܳ;->ۛ:[Z

    aput-boolean v2, v1, v3

    .line 425
    iget-object v1, p0, Ll/ܿܰܳ;->۬:Ll/ۗ᩺ۡ;

    invoke-static {v1}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    .line 426
    iget-object v2, p0, Ll/ܿܰܳ;->ۙ:Ljava/util/List;

    if-nez v2, :cond_1

    .line 427
    invoke-static {v0, v1, p0}, Ll/᩹᩶᩻;->֫(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/ܿۖ᩷;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ܿܰܳ;->ۙ:Ljava/util/List;

    .line 429
    :cond_1
    iput-boolean v3, p0, Ll/ܿܰܳ;->᩹:Z

    .line 430
    new-instance v1, Ll/۫֨ܳ;

    invoke-direct {v1, v5, v0}, Ll/۫֨ܳ;-><init>(Lbin/mt/plus/Main;Ll/ᩳܰۡ;)V

    new-instance v0, Ll/ᩳܰܳ;

    invoke-direct {v0, p0}, Ll/ᩳܰܳ;-><init>(Ll/ܿܰܳ;)V

    .line 431
    invoke-virtual {v1, v0}, Ll/۫֨ܳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 432
    iget-object v0, p0, Ll/ܿܰܳ;->ۙ:Ljava/util/List;

    invoke-virtual {v1, v0}, Ll/۫֨ܳ;->֫(Ljava/util/List;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܿܰܳ;->᩶:Z

    return v0

    .line 434
    :cond_2
    iget-object v1, p0, Ll/ܿܰܳ;->᩸:Ljava/util/Iterator;

    if-nez v1, :cond_3

    .line 435
    invoke-static {}, Ll/ۤܺܳ;->ۧ()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, p0, Ll/ܿܰܳ;->᩸:Ljava/util/Iterator;

    .line 437
    :cond_3
    iget-object v1, p0, Ll/ܿܰܳ;->᩸:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 438
    iget-object v1, p0, Ll/ܿܰܳ;->᩸:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 439
    iput-boolean v2, p0, Ll/ܿܰܳ;->᩹:Z

    .line 440
    iput-boolean v3, p0, Ll/ܿܰܳ;->᩶:Z

    return v2

    .line 443
    :cond_4
    iput-boolean v3, p0, Ll/ܿܰܳ;->᩹:Z

    .line 444
    new-instance v1, Ll/۫֨ܳ;

    invoke-direct {v1, v5, v0}, Ll/۫֨ܳ;-><init>(Lbin/mt/plus/Main;Ll/ᩳܰۡ;)V

    invoke-virtual {v1}, Ll/۫֨ܳ;->֫()Z

    move-result v0

    iput-boolean v0, p0, Ll/ܿܰܳ;->᩶:Z

    return v0
.end method

.method public final ᩺()Z
    .locals 1

    .line 449
    iget-boolean v0, p0, Ll/ܿܰܳ;->᩹:Z

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 464
    iget-object v0, p0, Ll/ܿܰܳ;->ۗ:Ll/ܺܰܳ;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
