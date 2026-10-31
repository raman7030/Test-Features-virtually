.class public final Ll/ۘۘۧ;
.super Ljava/lang/Object;
.source "38J0"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:Ll/᩸᩷ۧ;

.field public ۧ:Ll/ܶۘۧ;

.field public ܽ:Z


# direct methods
.method private ۧ(Ll/۠᩷ۧ;)Z
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "streamReader"
        }
        result = true
    .end annotation

    .line 95
    new-instance v0, Ll/᩵ۘۧ;

    invoke-direct {v0}, Ll/᩵ۘۧ;-><init>()V

    const/4 v1, 0x1

    .line 96
    invoke-virtual {v0, p1, v1}, Ll/᩵ۘۧ;->֫(Ll/۠᩷ۧ;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Ll/᩵ۘۧ;->᩻:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    .line 100
    :cond_0
    iget v0, v0, Ll/᩵ۘۧ;->֫:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 101
    new-instance v2, Ll/ᩳ֨֫;

    invoke-direct {v2, v0}, Ll/ᩳ֨֫;-><init>(I)V

    .line 102
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    invoke-interface {p1, v3, v0, v4}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 117
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 48
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_1

    .line 49
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    const/16 v0, 0x7f

    if-ne p1, v0, :cond_1

    .line 51
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v4

    const-wide/32 v6, 0x464c4143

    cmp-long p1, v4, v6

    if-nez p1, :cond_1

    .line 105
    new-instance p1, Ll/ۖۘۧ;

    .line 38
    invoke-direct {p1}, Ll/ܶۘۧ;-><init>()V

    .line 105
    iput-object p1, p0, Ll/ۘۘۧ;->ۧ:Ll/ܶۘۧ;

    return v1

    .line 117
    :cond_1
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 48
    :try_start_0
    invoke-static {v1, v2, v1}, Ll/᩸ۢۧ;->֫(ILl/ᩳ֨֫;Z)Z

    move-result p1
    :try_end_0
    .catch Ll/ۡ᩵֫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 107
    new-instance p1, Ll/᩹ۘۧ;

    .line 37
    invoke-direct {p1}, Ll/ܶۘۧ;-><init>()V

    .line 107
    iput-object p1, p0, Ll/ۘۘۧ;->ۧ:Ll/ܶۘۧ;

    goto :goto_1

    .line 117
    :cond_2
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 108
    invoke-static {v2}, Ll/ۚۘۧ;->ۧ(Ll/ᩳ֨֫;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 109
    new-instance p1, Ll/ۚۘۧ;

    .line 34
    invoke-direct {p1}, Ll/ܶۘۧ;-><init>()V

    .line 109
    iput-object p1, p0, Ll/ۘۘۧ;->ۧ:Ll/ܶۘۧ;

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 4

    .line 76
    iget-object v0, p0, Ll/ۘۘۧ;->֫:Ll/᩸᩷ۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Ll/ۘۘۧ;->ۧ:Ll/ܶۘۧ;

    if-nez v0, :cond_1

    .line 78
    invoke-direct {p0, p1}, Ll/ۘۘۧ;->ۧ(Ll/۠᩷ۧ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    goto :goto_0

    :cond_0
    const-string p1, "Failed to determine bitstream type"

    const/4 p2, 0x0

    .line 79
    invoke-static {p1, p2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 84
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/ۘۘۧ;->ܽ:Z

    if-nez v0, :cond_2

    .line 85
    iget-object v0, p0, Ll/ۘۘۧ;->֫:Ll/᩸᩷ۧ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    .line 86
    iget-object v1, p0, Ll/ۘۘۧ;->֫:Ll/᩸᩷ۧ;

    invoke-interface {v1}, Ll/᩸᩷ۧ;->ܳ()V

    .line 87
    iget-object v1, p0, Ll/ۘۘۧ;->ۧ:Ll/ܶۘۧ;

    iget-object v3, p0, Ll/ۘۘۧ;->֫:Ll/᩸᩷ۧ;

    invoke-virtual {v1, v3, v0}, Ll/ܶۘۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۢۧ;)V

    .line 88
    iput-boolean v2, p0, Ll/ۘۘۧ;->ܽ:Z

    .line 90
    :cond_2
    iget-object v0, p0, Ll/ۘۘۧ;->ۧ:Ll/ܶۘۧ;

    invoke-virtual {v0, p1, p2}, Ll/ܶۘۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۘۘۧ;->ۧ:Ll/ܶۘۧ;

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܶۘۧ;->֫(JJ)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/ۘۘۧ;->֫:Ll/᩸᩷ۧ;

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 0

    .line 51
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۘۘۧ;->ۧ(Ll/۠᩷ۧ;)Z

    move-result p1
    :try_end_0
    .catch Ll/ۡ᩵֫; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
