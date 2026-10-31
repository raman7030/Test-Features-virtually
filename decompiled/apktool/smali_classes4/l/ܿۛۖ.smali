.class public final Ll/ܿۛۖ;
.super Ljava/lang/Object;
.source "19KT"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ۙ:I

.field public ᩶:Ll/᩷ۤۖ;

.field public final ᩸:Ll/۫ܰۖ;

.field public final ᩹:Ll/ᩴۤۖ;


# direct methods
.method public constructor <init>([BLl/ᩴۤۖ;)V
    .locals 1

    .line 382
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 383
    new-instance v0, Ll/۫ܰۖ;

    .line 50
    invoke-direct {v0, p1}, Ll/ۤܰۖ;-><init>([B)V

    .line 383
    iput-object v0, p0, Ll/ܿۛۖ;->᩸:Ll/۫ܰۖ;

    .line 384
    iput-object p2, p0, Ll/ܿۛۖ;->᩹:Ll/ᩴۤۖ;

    const/4 p1, 0x0

    .line 385
    iput p1, p0, Ll/ܿۛۖ;->ۙ:I

    .line 386
    invoke-direct {p0}, Ll/ܿۛۖ;->֫()Ll/᩷ۤۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿۛۖ;->᩶:Ll/᩷ۤۖ;

    return-void
.end method

.method private ֫()Ll/᩷ۤۖ;
    .locals 6

    .line 407
    iget-object v0, p0, Ll/ܿۛۖ;->᩸:Ll/۫ܰۖ;

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 409
    :try_start_0
    iget v2, p0, Ll/ܿۛۖ;->ۙ:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 410
    invoke-virtual {v0, v2}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 411
    iget-object v1, p0, Ll/ܿۛۖ;->᩹:Ll/ᩴۤۖ;

    invoke-interface {v1, v0}, Ll/ᩴۤۖ;->֫(Ll/ۤܰۖ;)Ll/֡ۤۖ;

    move-result-object v1

    check-cast v1, Ll/᩷ۤۖ;

    .line 412
    invoke-virtual {v1}, Ll/᩷ۤۖ;->ۧ()J

    move-result-wide v4

    long-to-int v2, v4

    if-nez v2, :cond_0

    .line 415
    iput v3, p0, Ll/ܿۛۖ;->ۙ:I

    goto :goto_0

    .line 417
    :cond_0
    iget v3, p0, Ll/ܿۛۖ;->ۙ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܿۛۖ;->ۙ:I
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 425
    new-instance v1, Ll/ۧۧۘ;

    .line 34
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 425
    throw v1

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 391
    iget-object v0, p0, Ll/ܿۛۖ;->᩶:Ll/᩷ۤۖ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 396
    iget-object v0, p0, Ll/ܿۛۖ;->᩶:Ll/᩷ۤۖ;

    if-eqz v0, :cond_0

    .line 401
    invoke-direct {p0}, Ll/ܿۛۖ;->֫()Ll/᩷ۤۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ܿۛۖ;->᩶:Ll/᩷ۤۖ;

    return-object v0

    .line 397
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 431
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
