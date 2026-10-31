.class public final Ll/ۡ᩵ۘ;
.super Ll/᩻᩵ۘ;
.source "U8D0"

# interfaces
.implements Ll/ۜ᩵ۘ;


# instance fields
.field public ۜ:Ll/ۚ᩵ۘ;

.field public ܳ:Ll/۠ᩴۘ;

.field public ᩻:Ll/ܶᩴۘ;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 36
    invoke-direct {p0}, Ll/᩻᩵ۘ;-><init>()V

    .line 37
    new-instance v0, Ll/ۚ᩵ۘ;

    invoke-direct {v0}, Ll/ۚ᩵ۘ;-><init>()V

    iput-object v0, p0, Ll/ۡ᩵ۘ;->ۜ:Ll/ۚ᩵ۘ;

    .line 38
    new-instance v0, Ll/۠ᩴۘ;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/4 v3, 0x1

    const-string v4, "Amplitude"

    .line 51
    invoke-direct {v0, v3, v4, v1, v2}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 38
    iput-object v0, p0, Ll/ۡ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 39
    new-instance v0, Ll/ܶᩴۘ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܶᩴۘ;-><init>(I)V

    iput-object v0, p0, Ll/ۡ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 7

    .line 44
    iget-object v0, p0, Ll/ۡ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 45
    iget-object v1, p0, Ll/ۡ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_0

    .line 48
    iget-object v3, p0, Ll/ۡ᩵ۘ;->ۜ:Ll/ۚ᩵ۘ;

    invoke-virtual {v3}, Ll/ۚ᩵ۘ;->֫()D

    move-result-wide v3

    aget-wide v5, v0, v2

    mul-double v3, v3, v5

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
