.class public final Ll/۟ᩴۘ;
.super Ll/᩻᩵ۘ;
.source "V8DT"


# static fields
.field public static ۢ:[D


# instance fields
.field public ۜ:D

.field public ܳ:Ll/۠ᩴۘ;

.field public ᩷:Ll/ܶᩴۘ;

.field public ᩻:D


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/16 v0, 0x802

    new-array v0, v0, [D

    .line 50
    sput-object v0, Ll/۟ᩴۘ;->ۢ:[D

    const/4 v0, 0x0

    .line 52
    :goto_0
    sget-object v1, Ll/۟ᩴۘ;->ۢ:[D

    array-length v2, v1

    if-ge v0, v2, :cond_0

    int-to-double v2, v0

    const-wide/high16 v4, 0x40a0000000000000L    # 2048.0

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 53
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    .line 54
    aput-wide v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 58
    invoke-direct {p0}, Ll/᩻᩵ۘ;-><init>()V

    const-wide/16 v0, 0x0

    .line 43
    iput-wide v0, p0, Ll/۟ᩴۘ;->᩻:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 44
    iput-wide v0, p0, Ll/۟ᩴۘ;->ۜ:D

    .line 59
    new-instance v2, Ll/۠ᩴۘ;

    const-string v0, "Input"

    invoke-direct {v2, v0}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Ll/۟ᩴۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {p0, v2}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide/16 v5, 0x0

    const-wide/high16 v7, 0x4020000000000000L    # 8.0

    const-wide/high16 v3, -0x3fe0000000000000L    # -8.0

    .line 60
    invoke-virtual/range {v2 .. v8}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 61
    new-instance v0, Ll/ܶᩴۘ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܶᩴۘ;-><init>(I)V

    iput-object v0, p0, Ll/۟ᩴۘ;->᩷:Ll/ܶᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 10

    .line 66
    iget-object v0, p0, Ll/۟ᩴۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 67
    iget-object v1, p0, Ll/۟ᩴۘ;->᩷:Ll/ܶᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_3

    .line 70
    aget-wide v3, v0, v2

    .line 72
    iget-wide v5, p0, Ll/۟ᩴۘ;->᩻:D

    cmpl-double v7, v3, v5

    if-nez v7, :cond_0

    .line 73
    iget-wide v3, p0, Ll/۟ᩴۘ;->ۜ:D

    aput-wide v3, v1, v2

    goto :goto_3

    .line 75
    :cond_0
    iput-wide v3, p0, Ll/۟ᩴۘ;->᩻:D

    .line 77
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    double-to-int v5, v5

    int-to-double v6, v5

    sub-double/2addr v3, v6

    const-wide/high16 v6, 0x40a0000000000000L    # 2048.0

    mul-double v3, v3, v6

    double-to-int v6, v3

    int-to-double v7, v6

    sub-double/2addr v3, v7

    .line 83
    sget-object v7, Ll/۟ᩴۘ;->ۢ:[D

    aget-wide v8, v7, v6

    add-int/lit8 v6, v6, 0x1

    aget-wide v6, v7, v6

    sub-double/2addr v6, v8

    mul-double v6, v6, v3

    add-double/2addr v6, v8

    :goto_1
    if-lez v5, :cond_1

    add-int/lit8 v5, v5, -0x1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    mul-double v6, v6, v3

    goto :goto_1

    :cond_1
    :goto_2
    if-gez v5, :cond_2

    add-int/lit8 v5, v5, 0x1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    mul-double v6, v6, v3

    goto :goto_2

    .line 95
    :cond_2
    aput-wide v6, v1, v2

    .line 96
    iput-wide v6, p0, Ll/۟ᩴۘ;->ۜ:D

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
