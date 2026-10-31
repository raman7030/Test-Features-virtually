.class public final Ll/ܺ᩶֫;
.super Ljava/lang/Object;
.source "48SH"


# instance fields
.field public ֡:Ll/᩷۬֫;

.field public ֨:J

.field public ֫:Ll/ܺܶۡ;

.field public ۖ:Ljava/lang/String;

.field public ۘ:I

.field public ۚ:J

.field public ۜ:Ll/ۤ᩹֫;

.field public ۠:Ll/ۢ۬֫;

.field public ۡ:J

.field public ۢ:Landroid/os/Looper;

.field public ۧ:Ll/ᩳᩴ֫;

.field public final ܳ:Landroid/content/ContextWrapper;

.field public ܶ:Ll/ۜ᩶֫;

.field public ܺ:Ll/ۛܶܺ;

.field public ܽ:Ll/ᩳ۫ܽ;

.field public ܿ:Ll/ܳ֨֫;

.field public ᩳ:Z

.field public ᩴ:J

.field public ᩵:Ll/ۛܶܺ;

.field public ᩶:I

.field public ᩷:Ll/᩷᩶֫;

.field public ᩸:Z

.field public ᩹:Z

.field public ᩻:J


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 2

    .line 307
    new-instance v0, Ll/ۢ᩶֫;

    invoke-direct {v0, p1}, Ll/ۢ᩶֫;-><init>(Landroid/app/Application;)V

    new-instance v1, Ll/ۡ᩶֫;

    invoke-direct {v1, p1}, Ll/ۡ᩶֫;-><init>(Landroid/app/Application;)V

    invoke-direct {p0, p1, v0, v1}, Ll/ܺ᩶֫;-><init>(Landroid/content/ContextWrapper;Ll/ۛܶܺ;Ll/ۛܶܺ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/ContextWrapper;Ll/ۛܶܺ;Ll/ۛܶܺ;)V
    .locals 6

    .line 421
    new-instance v0, Ll/ۜ᩶֫;

    invoke-direct {v0, p1}, Ll/ۜ᩶֫;-><init>(Landroid/content/ContextWrapper;)V

    new-instance v1, Ll/᩷᩶֫;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ll/ᩳ۫ܽ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p1}, Ll/ᩳ۫ܽ;-><init>(ILjava/lang/Object;)V

    new-instance v4, Ll/ܺܶۡ;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Ll/ܺܶۡ;-><init>(I)V

    .line 438
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 439
    iput-object p1, p0, Ll/ܺ᩶֫;->ܳ:Landroid/content/ContextWrapper;

    .line 440
    iput-object p2, p0, Ll/ܺ᩶֫;->᩵:Ll/ۛܶܺ;

    .line 441
    iput-object p3, p0, Ll/ܺ᩶֫;->ܺ:Ll/ۛܶܺ;

    .line 442
    iput-object v0, p0, Ll/ܺ᩶֫;->ܶ:Ll/ۜ᩶֫;

    .line 443
    iput-object v1, p0, Ll/ܺ᩶֫;->᩷:Ll/᩷᩶֫;

    .line 444
    iput-object v2, p0, Ll/ܺ᩶֫;->ܽ:Ll/ᩳ۫ܽ;

    .line 445
    iput-object v4, p0, Ll/ܺ᩶֫;->֫:Ll/ܺܶۡ;

    .line 446
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 903
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 904
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 446
    :goto_0
    iput-object p1, p0, Ll/ܺ᩶֫;->ۢ:Landroid/os/Looper;

    .line 447
    sget-object p1, Ll/ᩳᩴ֫;->ۧ:Ll/ᩳᩴ֫;

    iput-object p1, p0, Ll/ܺ᩶֫;->ۧ:Ll/ᩳᩴ֫;

    .line 449
    iput v3, p0, Ll/ܺ᩶֫;->᩶:I

    .line 451
    iput-boolean v3, p0, Ll/ܺ᩶֫;->᩸:Z

    .line 452
    sget-object p1, Ll/ۢ۬֫;->ܽ:Ll/ۢ۬֫;

    iput-object p1, p0, Ll/ܺ᩶֫;->۠:Ll/ۢ۬֫;

    const-wide/16 p1, 0x1388

    .line 453
    iput-wide p1, p0, Ll/ܺ᩶֫;->ۚ:J

    const-wide/16 p1, 0x3a98

    .line 454
    iput-wide p1, p0, Ll/ܺ᩶֫;->֨:J

    const-wide/16 p1, 0xbb8

    .line 455
    iput-wide p1, p0, Ll/ܺ᩶֫;->ۡ:J

    .line 456
    sget-object p1, Ll/᩷۬֫;->ܳ:Ll/᩷۬֫;

    iput-object p1, p0, Ll/ܺ᩶֫;->֡:Ll/᩷۬֫;

    .line 457
    new-instance p1, Ll/۫᩹֫;

    invoke-direct {p1}, Ll/۫᩹֫;-><init>()V

    invoke-virtual {p1}, Ll/۫᩹֫;->֫()Ll/ۤ᩹֫;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ᩶֫;->ۜ:Ll/ۤ᩹֫;

    .line 458
    sget-object p1, Ll/ܽۚ֫;->֫:Ll/ܳ֨֫;

    iput-object p1, p0, Ll/ܺ᩶֫;->ܿ:Ll/ܳ֨֫;

    const-wide/16 p1, 0x1f4

    .line 459
    iput-wide p1, p0, Ll/ܺ᩶֫;->ᩴ:J

    const-wide/16 p1, 0x7d0

    .line 460
    iput-wide p1, p0, Ll/ܺ᩶֫;->᩻:J

    .line 461
    iput-boolean v3, p0, Ll/ܺ᩶֫;->᩹:Z

    const-string p1, ""

    .line 462
    iput-object p1, p0, Ll/ܺ᩶֫;->ۖ:Ljava/lang/String;

    const/16 p1, -0x3e8

    .line 463
    iput p1, p0, Ll/ܺ᩶֫;->ۘ:I

    .line 52
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x23

    if-lt p1, p2, :cond_1

    .line 53
    new-instance p1, Ll/ۧ᩶֫;

    :cond_1
    return-void
.end method

.method public constructor <init>(Ll/ۤۤۜ;Ll/۟᩹֫;Ll/᩺֫ۧ;)V
    .locals 1

    .line 373
    new-instance v0, Ll/ܳ᩶֫;

    invoke-direct {v0, p2}, Ll/ܳ᩶֫;-><init>(Ll/۟᩹֫;)V

    new-instance p2, Ll/᩻᩶֫;

    invoke-direct {p2, p3}, Ll/᩻᩶֫;-><init>(Ll/᩺֫ۧ;)V

    invoke-direct {p0, p1, v0, p2}, Ll/ܺ᩶֫;-><init>(Landroid/content/ContextWrapper;Ll/ۛܶܺ;Ll/ۛܶܺ;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۘ᩶֫;
    .locals 2

    .line 1109
    iget-boolean v0, p0, Ll/ܺ᩶֫;->ᩳ:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1110
    iput-boolean v1, p0, Ll/ܺ᩶֫;->ᩳ:Z

    .line 1111
    new-instance v0, Ll/ܺۙ֫;

    invoke-direct {v0, p0}, Ll/ܺۙ֫;-><init>(Ll/ܺ᩶֫;)V

    return-object v0
.end method

.method public final ֫(Ll/۟᩹֫;)V
    .locals 1

    .line 542
    iget-boolean v0, p0, Ll/ܺ᩶֫;->ᩳ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 544
    new-instance v0, Ll/ܳ᩶֫;

    invoke-direct {v0, p1}, Ll/ܳ᩶֫;-><init>(Ll/۟᩹֫;)V

    iput-object v0, p0, Ll/ܺ᩶֫;->᩵:Ll/ۛܶܺ;

    return-void
.end method

.method public final ֫(Ll/᩺֫ۧ;)V
    .locals 1

    .line 557
    iget-boolean v0, p0, Ll/ܺ᩶֫;->ᩳ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 559
    new-instance v0, Ll/᩻᩶֫;

    invoke-direct {v0, p1}, Ll/᩻᩶֫;-><init>(Ll/᩺֫ۧ;)V

    iput-object v0, p0, Ll/ܺ᩶֫;->ܺ:Ll/ۛܶܺ;

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 860
    iget-boolean v0, p0, Ll/ܺ᩶֫;->ᩳ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    const-wide/16 v0, 0x2710

    .line 861
    iput-wide v0, p0, Ll/ܺ᩶֫;->ۚ:J

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 876
    iget-boolean v0, p0, Ll/ܺ᩶֫;->ᩳ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    const-wide/16 v0, 0x3a98

    .line 877
    iput-wide v0, p0, Ll/ܺ᩶֫;->֨:J

    return-void
.end method
