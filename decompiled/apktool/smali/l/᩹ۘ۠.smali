.class public Ll/᩹ۘ۠;
.super Ljava/lang/Object;
.source "37RB"


# instance fields
.field public final ֫:Ll/ۖܶ۠;

.field public final ۧ:I

.field public final ܽ:Ll/᩶ۘ۠;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩶ۘ۠;IILl/ۖܶ۠;)V
    .locals 0

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    iput-object p1, p0, Ll/᩹ۘ۠;->ܽ:Ll/᩶ۘ۠;

    .line 314
    iput p2, p0, Ll/᩹ۘ۠;->ᩳ:I

    .line 315
    iput p3, p0, Ll/᩹ۘ۠;->ۧ:I

    .line 316
    iput-object p4, p0, Ll/᩹ۘ۠;->֫:Ll/ۖܶ۠;

    .line 317
    invoke-virtual {p0}, Ll/᩹ۘ۠;->֫()V

    return-void
.end method

.method private ֫(Ll/֡ۘ۠;)Ll/ۖܶ۠;
    .locals 4

    .line 380
    iget-object v0, p0, Ll/᩹ۘ۠;->֫:Ll/ۖܶ۠;

    if-nez v0, :cond_0

    .line 381
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    .line 383
    :cond_0
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 384
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚۘ۠;

    .line 385
    invoke-interface {v2}, Ll/ۚۘ۠;->getStyle()Ll/֡ۘ۠;

    move-result-object v3

    if-ne v3, p1, :cond_1

    .line 227
    invoke-virtual {v1, v2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 389
    :cond_2
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public ֫()V
    .locals 4

    .line 338
    iget-object v0, p0, Ll/᩹ۘ۠;->ܽ:Ll/᩶ۘ۠;

    iget-object v0, v0, Ll/᩶ۘ۠;->᩹:Ll/᩸ۘ۠;

    sget-object v1, Ll/᩸ۘ۠;->᩹:Ll/᩸ۘ۠;

    if-ne v0, v1, :cond_0

    return-void

    .line 339
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bad token kind - expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ۧ()Ll/ۚۘ۠;
    .locals 2

    .line 360
    sget-object v0, Ll/֡ۘ۠;->᩶:Ll/֡ۘ۠;

    invoke-direct {p0, v0}, Ll/᩹ۘ۠;->֫(Ll/֡ۘ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 361
    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 363
    :cond_0
    iget-object v0, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۚۘ۠;

    return-object v0
.end method

.method public ܳ()Ljava/lang/String;
    .locals 1

    .line 348
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 371
    sget-object v0, Ll/֡ۘ۠;->᩶:Ll/֡ۘ۠;

    invoke-direct {p0, v0}, Ll/᩹ۘ۠;->֫(Ll/֡ۘ۠;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۘ۠;

    .line 372
    invoke-interface {v1}, Ll/ۚۘ۠;->isDeprecated()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public ܿ()I
    .locals 1

    .line 352
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ᩳ()Ll/ۤܶ۠;
    .locals 1

    .line 344
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
