.class public final Ll/֡ᩴۘ;
.super Ll/۠ᩴۘ;
.source "M8D1"


# instance fields
.field public ۡ:Z

.field public ۢ:Ll/᩻᩵ۘ;

.field public ܺ:Z

.field public ᩷:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Input"

    .line 31
    invoke-direct {p0, v0}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Ll/֡ᩴۘ;->᩷:Z

    .line 25
    iput-boolean v0, p0, Ll/֡ᩴۘ;->ܺ:Z

    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Ll/֡ᩴۘ;->ۡ:Z

    return-void
.end method

.method public static ֫(Ll/֡ᩴۘ;Z)V
    .locals 2

    if-eqz p1, :cond_1

    .line 149
    iget-object v0, p0, Ll/֡ᩴۘ;->ۢ:Ll/᩻᩵ۘ;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/᩸ᩴۘ;->ܽ()Ll/᩻᩵ۘ;

    move-result-object v0

    :cond_0
    const/4 v1, 0x1

    .line 76
    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Z)V

    .line 77
    iput-boolean v1, p0, Ll/֡ᩴۘ;->ܺ:Z

    :cond_1
    if-eqz p1, :cond_2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x0

    .line 92
    :goto_0
    invoke-virtual {p0, v0, v1}, Ll/۠ᩴۘ;->ۧ(D)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩸֨ۘ;)V
    .locals 2

    .line 60
    new-instance v0, Ll/᩵ᩴۘ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/᩵ᩴۘ;-><init>(Ll/֡ᩴۘ;Z)V

    invoke-virtual {p0, p1, v0}, Ll/᩸ᩴۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ۡ()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Ll/֡ᩴۘ;->ۡ:Z

    return v0
.end method

.method public final ۢ()V
    .locals 2

    .line 143
    iget-boolean v0, p0, Ll/֡ᩴۘ;->᩷:Z

    if-eqz v0, :cond_1

    .line 149
    iget-object v0, p0, Ll/֡ᩴۘ;->ۢ:Ll/᩻᩵ۘ;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/᩸ᩴۘ;->ܽ()Ll/᩻᩵ۘ;

    move-result-object v0

    :cond_0
    const/4 v1, 0x0

    .line 144
    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Z)V

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/᩸֨ۘ;)V
    .locals 2

    .line 60
    new-instance v0, Ll/᩵ᩴۘ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ll/᩵ᩴۘ;-><init>(Ll/֡ᩴۘ;Z)V

    invoke-virtual {p0, p1, v0}, Ll/᩸ᩴۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ۧ(Ll/᩻᩵ۘ;)V
    .locals 1

    .line 153
    iput-object p1, p0, Ll/֡ᩴۘ;->ۢ:Ll/᩻᩵ۘ;

    const/4 v0, 0x1

    .line 136
    iput-boolean v0, p0, Ll/֡ᩴۘ;->᩷:Z

    const/4 v0, 0x0

    .line 156
    invoke-virtual {p1, v0}, Ll/᩻᩵ۘ;->֫(Z)V

    return-void
.end method

.method public final ۧ(I)Z
    .locals 9

    .line 105
    invoke-virtual {p0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 106
    iget-boolean v1, p0, Ll/֡ᩴۘ;->ܺ:Z

    const/4 v2, 0x0

    .line 107
    iput-boolean v2, p0, Ll/֡ᩴۘ;->ܺ:Z

    .line 108
    iget-boolean v3, p0, Ll/֡ᩴۘ;->ۡ:Z

    const/4 v4, 0x1

    const-wide v5, 0x3f847ae147ae147bL    # 0.01

    if-eqz v3, :cond_0

    .line 109
    aget-wide v7, v0, p1

    cmpl-double p1, v7, v5

    if-ltz p1, :cond_1

    .line 111
    iput-boolean v2, p0, Ll/֡ᩴۘ;->ۡ:Z

    return v4

    .line 114
    :cond_0
    aget-wide v2, v0, p1

    cmpg-double p1, v2, v5

    if-gez p1, :cond_1

    .line 115
    iput-boolean v4, p0, Ll/֡ᩴۘ;->ۡ:Z

    :cond_1
    return v1
.end method
