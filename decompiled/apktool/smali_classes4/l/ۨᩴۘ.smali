.class public final Ll/ۨᩴۘ;
.super Ll/ܿ᩵ۘ;
.source "P8CH"


# instance fields
.field public ۖ:Ll/۠ᩴۘ;

.field public ۘ:D

.field public ۜ:Ll/᩹ᩴۘ;

.field public ۡ:D

.field public ۢ:D

.field public ܺ:D

.field public ᩷:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 46
    invoke-direct {p0}, Ll/ܿ᩵ۘ;-><init>()V

    const-wide/16 v0, 0x0

    .line 43
    iput-wide v0, p0, Ll/ۨᩴۘ;->ۘ:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 44
    iput-wide v0, p0, Ll/ۨᩴۘ;->ۢ:D

    .line 47
    new-instance v0, Ll/۠ᩴۘ;

    const-string v1, "Time"

    invoke-direct {v0, v1}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۨᩴۘ;->ۖ:Ll/۠ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 48
    new-instance v0, Ll/᩹ᩴۘ;

    const-string v1, "Current"

    .line 31
    invoke-direct {v0, v1}, Ll/᩸ᩴۘ;-><init>(Ljava/lang/String;)V

    .line 48
    iput-object v0, p0, Ll/ۨᩴۘ;->ۜ:Ll/᩹ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 13

    .line 53
    iget-object v0, p0, Ll/ܿ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 54
    iget-object v1, p0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    const/4 v2, 0x0

    aget-wide v3, v1, v2

    .line 55
    iget-object v1, p0, Ll/ۨᩴۘ;->ۜ:Ll/᩹ᩴۘ;

    invoke-virtual {v1}, Ll/᩹ᩴۘ;->ᩳ()D

    move-result-wide v5

    .line 59
    iget-wide v7, p0, Ll/ۨᩴۘ;->ܺ:D

    cmpl-double v9, v3, v7

    if-eqz v9, :cond_0

    .line 61
    iput-wide v5, p0, Ll/ۨᩴۘ;->ۡ:D

    const-wide/16 v7, 0x0

    .line 62
    iput-wide v7, p0, Ll/ۨᩴۘ;->᩷:D

    .line 63
    iput-wide v3, p0, Ll/ۨᩴۘ;->ܺ:D

    .line 66
    :cond_0
    iget-wide v3, p0, Ll/ۨᩴۘ;->ܺ:D

    const/16 v7, 0x8

    cmpl-double v8, v5, v3

    if-nez v8, :cond_1

    :goto_0
    if-ge v2, v7, :cond_5

    .line 69
    aput-wide v5, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 73
    :cond_1
    iget-object v3, p0, Ll/ۨᩴۘ;->ۖ:Ll/۠ᩴۘ;

    invoke-virtual {v3}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v3

    aget-wide v8, v3, v2

    .line 75
    iget-wide v3, p0, Ll/ۨᩴۘ;->ۘ:D

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    cmpl-double v12, v8, v3

    if-eqz v12, :cond_3

    .line 176
    iget-object v3, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {v3}, Ll/۟ۘۘ;->ܿ()D

    move-result-wide v3

    cmpg-double v12, v8, v3

    if-gez v12, :cond_2

    move-wide v3, v10

    goto :goto_1

    .line 74
    :cond_2
    iget-object v3, p0, Ll/᩻᩵ۘ;->ܿ:Ll/۟ۘۘ;

    invoke-virtual {v3}, Ll/۟ۘۘ;->ܽ()D

    move-result-wide v3

    div-double/2addr v3, v8

    .line 76
    :goto_1
    iput-wide v3, p0, Ll/ۨᩴۘ;->ۢ:D

    .line 77
    iput-wide v8, p0, Ll/ۨᩴۘ;->ۘ:D

    :cond_3
    :goto_2
    if-ge v2, v7, :cond_5

    .line 81
    iget-wide v3, p0, Ll/ۨᩴۘ;->᩷:D

    cmpg-double v5, v3, v10

    if-gez v5, :cond_4

    .line 83
    iget-wide v5, p0, Ll/ۨᩴۘ;->ۡ:D

    iget-wide v8, p0, Ll/ۨᩴۘ;->ܺ:D

    sub-double/2addr v8, v5

    mul-double v8, v8, v3

    add-double/2addr v8, v5

    .line 84
    iget-wide v5, p0, Ll/ۨᩴۘ;->ۢ:D

    add-double/2addr v3, v5

    iput-wide v3, p0, Ll/ۨᩴۘ;->᩷:D

    move-wide v5, v8

    goto :goto_3

    .line 86
    :cond_4
    iget-wide v3, p0, Ll/ۨᩴۘ;->ܺ:D

    move-wide v5, v3

    .line 88
    :goto_3
    aput-wide v5, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 92
    :cond_5
    invoke-virtual {v1, v5, v6}, Ll/᩹ᩴۘ;->֫(D)V

    return-void
.end method
