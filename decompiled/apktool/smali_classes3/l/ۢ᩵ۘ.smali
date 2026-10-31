.class public final Ll/ۢ᩵ۘ;
.super Ll/᩻᩵ۘ;
.source "S8DV"


# instance fields
.field public ۖ:Ll/۠ᩴۘ;

.field public ۘ:D

.field public ۜ:D

.field public ۡ:D

.field public ۢ:Ll/ܶᩴۘ;

.field public ܳ:Ll/۠ᩴۘ;

.field public ܺ:Z

.field public ᩴ:Z

.field public ᩵:D

.field public ᩷:Ll/ᩴᩴۘ;

.field public ᩻:D


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 34
    invoke-direct {p0}, Ll/᩻᩵ۘ;-><init>()V

    .line 35
    new-instance v0, Ll/ᩴᩴۘ;

    invoke-direct {v0}, Ll/ᩴᩴۘ;-><init>()V

    iput-object v0, p0, Ll/ۢ᩵ۘ;->᩷:Ll/ᩴᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 36
    new-instance v0, Ll/۠ᩴۘ;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/4 v3, 0x1

    const-string v4, "Amplitude"

    .line 51
    invoke-direct {v0, v3, v4, v1, v2}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 36
    iput-object v0, p0, Ll/ۢ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 27
    new-instance v0, Ll/۠ᩴۘ;

    const/4 v1, 0x1

    const-string v2, "Rate"

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 51
    invoke-direct {v0, v1, v2, v3, v4}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 27
    iput-object v0, p0, Ll/ۢ᩵ۘ;->ۖ:Ll/۠ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 49
    new-instance v0, Ll/ܶᩴۘ;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ll/ܶᩴۘ;-><init>(I)V

    iput-object v0, p0, Ll/ۢ᩵ۘ;->ۢ:Ll/ܶᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 50
    iput-boolean v1, p0, Ll/ۢ᩵ۘ;->ᩴ:Z

    .line 51
    iput-wide v3, p0, Ll/ۢ᩵ۘ;->᩻:D

    return-void
.end method

.method private ᩷()D
    .locals 5

    .line 100
    iget-object v0, p0, Ll/ۢ᩵ۘ;->᩷:Ll/ᩴᩴۘ;

    invoke-virtual {v0}, Ll/ᩴᩴۘ;->ܿ()V

    .line 101
    invoke-virtual {v0}, Ll/ᩴᩴۘ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 102
    iput-boolean v1, p0, Ll/ۢ᩵ۘ;->ᩴ:Z

    .line 74
    iget-object v1, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {v1}, Ll/۟ۘۘ;->ܽ()D

    move-result-wide v1

    .line 103
    invoke-virtual {v0, v1, v2}, Ll/ᩴᩴۘ;->֫(D)D

    move-result-wide v1

    iput-wide v1, p0, Ll/ۢ᩵ۘ;->᩵:D

    .line 74
    iget-object v1, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {v1}, Ll/۟ۘۘ;->ܽ()D

    move-result-wide v1

    .line 106
    invoke-virtual {v0}, Ll/ᩴᩴۘ;->ܳ()D

    move-result-wide v3

    mul-double v3, v3, v1

    return-wide v3

    :cond_0
    const/4 v0, 0x1

    .line 108
    iput-boolean v0, p0, Ll/ۢ᩵ۘ;->ᩴ:Z

    .line 109
    iput-boolean v0, p0, Ll/ۢ᩵ۘ;->ܺ:Z

    const-wide/16 v0, 0x0

    .line 110
    iput-wide v0, p0, Ll/ۢ᩵ۘ;->ۡ:D

    return-wide v0
.end method


# virtual methods
.method public final ۧ()V
    .locals 11

    .line 56
    iget-object v0, p0, Ll/ۢ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 57
    iget-object v1, p0, Ll/ۢ᩵ۘ;->ۖ:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    .line 58
    iget-object v2, p0, Ll/ۢ᩵ۘ;->ۢ:Ll/ܶᩴۘ;

    invoke-virtual {v2}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x8

    .line 60
    iget-object v6, p0, Ll/ۢ᩵ۘ;->᩷:Ll/ᩴᩴۘ;

    if-ge v4, v5, :cond_3

    .line 63
    iget-wide v7, p0, Ll/ۢ᩵ۘ;->ۡ:D

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    cmpl-double v5, v7, v9

    if-ltz v5, :cond_0

    .line 64
    :goto_1
    iget-wide v5, p0, Ll/ۢ᩵ۘ;->ۡ:D

    cmpl-double v7, v5, v9

    if-ltz v7, :cond_2

    .line 65
    iget-wide v7, p0, Ll/ۢ᩵ۘ;->᩵:D

    iput-wide v7, p0, Ll/ۢ᩵ۘ;->ۘ:D

    sub-double/2addr v5, v9

    .line 66
    iput-wide v5, p0, Ll/ۢ᩵ۘ;->ۡ:D

    .line 67
    invoke-direct {p0}, Ll/ۢ᩵ۘ;->᩷()D

    move-result-wide v5

    iput-wide v5, p0, Ll/ۢ᩵ۘ;->᩻:D

    goto :goto_1

    :cond_0
    if-nez v4, :cond_2

    .line 69
    iget-boolean v5, p0, Ll/ۢ᩵ۘ;->ᩴ:Z

    if-nez v5, :cond_1

    invoke-virtual {v6}, Ll/ᩴᩴۘ;->ۜ()Z

    move-result v5

    if-nez v5, :cond_2

    .line 72
    :cond_1
    iget-wide v5, p0, Ll/ۢ᩵ۘ;->ۜ:D

    iput-wide v5, p0, Ll/ۢ᩵ۘ;->᩵:D

    iput-wide v5, p0, Ll/ۢ᩵ۘ;->ۘ:D

    const-wide/16 v5, 0x0

    .line 73
    iput-wide v5, p0, Ll/ۢ᩵ۘ;->ۡ:D

    .line 74
    invoke-direct {p0}, Ll/ۢ᩵ۘ;->᩷()D

    move-result-wide v5

    iput-wide v5, p0, Ll/ۢ᩵ۘ;->᩻:D

    .line 78
    :cond_2
    iget-wide v5, p0, Ll/ۢ᩵ۘ;->᩵:D

    iget-wide v7, p0, Ll/ۢ᩵ۘ;->ۘ:D

    sub-double/2addr v5, v7

    iget-wide v9, p0, Ll/ۢ᩵ۘ;->ۡ:D

    mul-double v5, v5, v9

    add-double/2addr v5, v7

    iput-wide v5, p0, Ll/ۢ᩵ۘ;->ۜ:D

    .line 79
    aget-wide v7, v0, v4

    mul-double v5, v5, v7

    aput-wide v5, v2, v4

    .line 81
    iget-wide v5, p0, Ll/ۢ᩵ۘ;->᩻:D

    aget-wide v7, v1, v4

    mul-double v5, v5, v7

    add-double/2addr v5, v9

    .line 82
    iput-wide v5, p0, Ll/ۢ᩵ۘ;->ۡ:D

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 85
    :cond_3
    iget-boolean v0, p0, Ll/ۢ᩵ۘ;->ܺ:Z

    if-eqz v0, :cond_4

    .line 86
    iput-boolean v3, p0, Ll/ۢ᩵ۘ;->ܺ:Z

    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    return-void
.end method
