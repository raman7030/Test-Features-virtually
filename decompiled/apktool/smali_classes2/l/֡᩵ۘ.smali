.class public final Ll/֡᩵ۘ;
.super Ljava/lang/Object;
.source "48CR"


# instance fields
.field public ֫:[Ll/ᩴ᩵ۘ;

.field public ۧ:Ll/ܽ᩵ۘ;

.field public ܽ:Ll/ۙۘۘ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [Ll/ᩴ᩵ۘ;

    .line 259
    iput-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    const/4 v0, 0x0

    .line 260
    :goto_0
    iget-object v1, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 261
    new-instance v2, Ll/ᩴ᩵ۘ;

    invoke-direct {v2, p0, v0}, Ll/ᩴ᩵ۘ;-><init>(Ll/֡᩵ۘ;I)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;
    .locals 0

    .line 52
    iget-object p0, p0, Ll/֡᩵ۘ;->ܽ:Ll/ۙۘۘ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/֡᩵ۘ;)Ll/ܽ᩵ۘ;
    .locals 0

    .line 52
    iget-object p0, p0, Ll/֡᩵ۘ;->ۧ:Ll/ܽ᩵ۘ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ܶᩴۘ;
    .locals 1

    .line 423
    iget-object v0, p0, Ll/֡᩵ۘ;->ۧ:Ll/ܽ᩵ۘ;

    iget-object v0, v0, Ll/ܽ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    return-object v0
.end method

.method public final ֫(ID)V
    .locals 1

    .line 378
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, v0, p1

    .line 379
    invoke-virtual {p1, p2, p3}, Ll/ᩴ᩵ۘ;->֫(D)V

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    .line 289
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, v0, p1

    .line 290
    invoke-virtual {p1, p2}, Ll/ᩴ᩵ۘ;->ۧ(I)V

    return-void
.end method

.method public final ֫(III)V
    .locals 0

    .line 313
    iget-object p3, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, p3, p1

    .line 314
    invoke-virtual {p1, p2}, Ll/ᩴ᩵ۘ;->֫(I)V

    return-void
.end method

.method public final ֫(Ll/۟ۘۘ;Ll/᩹᩵ۘ;)V
    .locals 3

    .line 276
    iput-object p1, p0, Ll/֡᩵ۘ;->ܽ:Ll/ۙۘۘ;

    .line 277
    iget-object v0, p0, Ll/֡᩵ۘ;->ۧ:Ll/ܽ᩵ۘ;

    if-nez v0, :cond_0

    .line 278
    new-instance v0, Ll/ܽ᩵ۘ;

    .line 38
    invoke-direct {v0}, Ll/᩻᩵ۘ;-><init>()V

    .line 39
    new-instance v1, Ll/۠ᩴۘ;

    const-string v2, "InputA"

    invoke-direct {v1, v2}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Ll/ܽ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 40
    new-instance v1, Ll/۠ᩴۘ;

    const-string v2, "InputB"

    invoke-direct {v1, v2}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Ll/ܽ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 41
    new-instance v1, Ll/ܶᩴۘ;

    const-string v2, "OutputB"

    invoke-direct {v1, v2}, Ll/ܶᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Ll/ܽ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 278
    iput-object v0, p0, Ll/֡᩵ۘ;->ۧ:Ll/ܽ᩵ۘ;

    invoke-virtual {p1, v0}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 281
    :cond_0
    new-instance p1, Ll/᩵᩵ۘ;

    const/16 v0, 0x40

    invoke-direct {p1, p0, v0, p2}, Ll/᩵᩵ۘ;-><init>(Ll/֡᩵ۘ;ILl/᩹᩵ۘ;)V

    const/4 p2, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge p2, v0, :cond_1

    .line 284
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object v0, v0, p2

    invoke-virtual {v0, p1}, Ll/ᩴ᩵ۘ;->֫(Ll/᩵᩵ۘ;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ(ID)V
    .locals 1

    .line 415
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, v0, p1

    .line 416
    invoke-virtual {p1, p2, p3}, Ll/ᩴ᩵ۘ;->ۧ(D)V

    return-void
.end method

.method public final ۧ(III)V
    .locals 4

    int-to-double v0, p3

    const-wide v2, 0x3f80204081020408L    # 0.007874015748031496

    mul-double v0, v0, v2

    .line 361
    iget-object p3, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, p3, p1

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double v0, v0, v2

    .line 362
    invoke-virtual {p1, p2, v0, v1}, Ll/ᩴ᩵ۘ;->֫(ID)V

    return-void
.end method

.method public final ܳ(ID)V
    .locals 1

    .line 388
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, v0, p1

    .line 389
    invoke-virtual {p1, p2, p3}, Ll/ᩴ᩵ۘ;->ܳ(D)V

    return-void
.end method

.method public final ܽ(ID)V
    .locals 1

    .line 373
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, v0, p1

    .line 374
    invoke-virtual {p1, p2, p3}, Ll/ᩴ᩵ۘ;->ܽ(D)V

    return-void
.end method

.method public final ܿ(ID)V
    .locals 1

    .line 393
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, v0, p1

    .line 394
    invoke-virtual {p1, p2, p3}, Ll/ᩴ᩵ۘ;->ܿ(D)V

    return-void
.end method

.method public final ᩳ(ID)V
    .locals 1

    .line 383
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, v0, p1

    .line 384
    invoke-virtual {p1, p2, p3}, Ll/ᩴ᩵ۘ;->ᩳ(D)V

    return-void
.end method

.method public final ᩻(ID)V
    .locals 1

    .line 404
    iget-object v0, p0, Ll/֡᩵ۘ;->֫:[Ll/ᩴ᩵ۘ;

    aget-object p1, v0, p1

    .line 405
    invoke-virtual {p1, p2, p3}, Ll/ᩴ᩵ۘ;->᩻(D)V

    return-void
.end method
