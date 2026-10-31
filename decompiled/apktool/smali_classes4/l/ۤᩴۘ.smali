.class public final Ll/ۤᩴۘ;
.super Ll/ܿ᩵ۘ;
.source "68CW"


# instance fields
.field public ۖ:D

.field public ۜ:D

.field public ۡ:D

.field public ۢ:D

.field public ܺ:Ll/۠ᩴۘ;

.field public ᩷:Ll/᩹ᩴۘ;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 40
    invoke-direct {p0}, Ll/ܿ᩵ۘ;-><init>()V

    const-wide/16 v0, 0x0

    .line 36
    iput-wide v0, p0, Ll/ۤᩴۘ;->ۖ:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 37
    iput-wide v0, p0, Ll/ۤᩴۘ;->ۢ:D

    const-wide v3, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 38
    iput-wide v3, p0, Ll/ۤᩴۘ;->ۜ:D

    .line 41
    new-instance v0, Ll/۠ᩴۘ;

    const-string v1, "Time"

    invoke-direct {v0, v1}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۤᩴۘ;->ܺ:Ll/۠ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 42
    iget-object v2, p0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    invoke-virtual/range {v2 .. v8}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 43
    new-instance v0, Ll/᩹ᩴۘ;

    invoke-direct {v0}, Ll/᩹ᩴۘ;-><init>()V

    iput-object v0, p0, Ll/ۤᩴۘ;->᩷:Ll/᩹ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 15

    .line 48
    iget-object v0, p0, Ll/ܿ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 49
    iget-object v1, p0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    const/4 v2, 0x0

    aget-wide v3, v1, v2

    .line 50
    iget-object v1, p0, Ll/ۤᩴۘ;->ܺ:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    aget-wide v5, v1, v2

    .line 51
    iget-object v1, p0, Ll/ۤᩴۘ;->᩷:Ll/᩹ᩴۘ;

    invoke-virtual {v1}, Ll/᩹ᩴۘ;->ᩳ()D

    move-result-wide v7

    .line 54
    iget-wide v9, p0, Ll/ۤᩴۘ;->ۜ:D

    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    .line 55
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(DD)D

    move-result-wide v7

    .line 57
    iget-wide v9, p0, Ll/ۤᩴۘ;->ۖ:D

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    cmpl-double v13, v5, v9

    if-eqz v13, :cond_0

    .line 69
    iget-object v9, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {v9}, Ll/۟ۘۘ;->ᩳ()I

    move-result v9

    int-to-double v9, v9

    mul-double v9, v9, v5

    div-double v13, v3, v7

    div-double v9, v11, v9

    .line 102
    invoke-static {v13, v14, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    .line 58
    iput-wide v9, p0, Ll/ۤᩴۘ;->ۢ:D

    .line 59
    iput-wide v5, p0, Ll/ۤᩴۘ;->ۖ:D

    .line 64
    :cond_0
    iget-wide v9, p0, Ll/ۤᩴۘ;->ۡ:D

    cmpl-double v13, v3, v9

    if-eqz v13, :cond_1

    .line 69
    iget-object v9, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {v9}, Ll/۟ۘۘ;->ᩳ()I

    move-result v9

    int-to-double v9, v9

    mul-double v5, v5, v9

    div-double v9, v3, v7

    div-double v5, v11, v5

    .line 102
    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    .line 65
    iput-wide v5, p0, Ll/ۤᩴۘ;->ۢ:D

    .line 66
    iput-wide v3, p0, Ll/ۤᩴۘ;->ۡ:D

    .line 69
    :cond_1
    iget-wide v3, p0, Ll/ۤᩴۘ;->ۡ:D

    const/16 v5, 0x8

    cmpg-double v6, v7, v3

    if-gez v6, :cond_3

    :goto_0
    if-ge v2, v5, :cond_6

    .line 72
    iget-wide v3, p0, Ll/ۤᩴۘ;->ۢ:D

    mul-double v7, v7, v3

    .line 73
    iget-wide v3, p0, Ll/ۤᩴۘ;->ۡ:D

    cmpl-double v6, v7, v3

    if-lez v6, :cond_2

    .line 75
    iput-wide v11, p0, Ll/ۤᩴۘ;->ۢ:D

    move-wide v7, v3

    .line 77
    :cond_2
    aput-wide v7, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    cmpl-double v6, v7, v3

    if-lez v6, :cond_5

    :goto_1
    if-ge v2, v5, :cond_6

    .line 82
    iget-wide v3, p0, Ll/ۤᩴۘ;->ۢ:D

    mul-double v7, v7, v3

    .line 83
    iget-wide v3, p0, Ll/ۤᩴۘ;->ۡ:D

    cmpg-double v6, v7, v3

    if-gez v6, :cond_4

    .line 85
    iput-wide v11, p0, Ll/ۤᩴۘ;->ۢ:D

    move-wide v7, v3

    .line 87
    :cond_4
    aput-wide v7, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    if-nez v6, :cond_6

    :goto_2
    if-ge v2, v5, :cond_6

    .line 92
    iget-wide v3, p0, Ll/ۤᩴۘ;->ۡ:D

    aput-wide v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 96
    :cond_6
    invoke-virtual {v1, v7, v8}, Ll/᩹ᩴۘ;->֫(D)V

    return-void
.end method
