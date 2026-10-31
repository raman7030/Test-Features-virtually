.class public final Ll/ܽۙᩳ;
.super Ljava/lang/Object;
.source "06RI"


# instance fields
.field public ֫:Ll/ܺۙᩳ;

.field public final ۜ:Ll/ۖۙᩳ;

.field public final ۡ:Ll/ۡ۬ᩳ;

.field public ۢ:Ll/֫ۙᩳ;

.field public ۧ:J

.field public ܳ:J

.field public ܽ:Ll/ۧۙᩳ;

.field public ܿ:Ll/ۢ۬ᩳ;

.field public final ᩳ:Ll/ܳۙᩳ;

.field public final ᩷:Z

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ۖۙᩳ;ZZ)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ll/ܺۙᩳ;

    invoke-direct {v0}, Ll/ܺۙᩳ;-><init>()V

    iput-object v0, p0, Ll/ܽۙᩳ;->֫:Ll/ܺۙᩳ;

    .line 18
    new-instance v0, Ll/ܳۙᩳ;

    invoke-direct {v0}, Ll/ܳۙᩳ;-><init>()V

    iput-object v0, p0, Ll/ܽۙᩳ;->ᩳ:Ll/ܳۙᩳ;

    .line 24
    iput-object p1, p0, Ll/ܽۙᩳ;->ۜ:Ll/ۖۙᩳ;

    .line 26
    iput-boolean p3, p0, Ll/ܽۙᩳ;->᩷:Z

    if-eqz p2, :cond_1

    .line 27
    iget-object p2, p1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 21
    iget-object p2, p2, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {p2}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    .line 23
    invoke-virtual {p2}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۡ۬ᩳ;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    .line 27
    :cond_1
    iget-object p2, p1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-virtual {p2}, Ll/ۢ۬ᩳ;->ۧ()Ll/ۡ۬ᩳ;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Ll/ܽۙᩳ;->ۡ:Ll/ۡ۬ᩳ;

    .line 28
    iget-wide p2, p1, Ll/ۖۙᩳ;->֫:J

    iput-wide p2, p0, Ll/ܽۙᩳ;->ܳ:J

    .line 29
    iget-wide p2, p1, Ll/ۖۙᩳ;->ᩳ:J

    iput-wide p2, p0, Ll/ܽۙᩳ;->᩻:J

    .line 30
    iget-object p1, p1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iput-object p1, p0, Ll/ܽۙᩳ;->ܿ:Ll/ۢ۬ᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖۙᩳ;)Ll/ۖۙᩳ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 63
    iget-object v2, v0, Ll/ܽۙᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v2}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Ll/ܽۙᩳ;->ۜ:Ll/ۖۙᩳ;

    iget-wide v2, v2, Ll/ۖۙᩳ;->֫:J

    goto :goto_0

    :cond_0
    iget-wide v2, v0, Ll/ܽۙᩳ;->ܳ:J

    :goto_0
    move-wide v7, v2

    .line 64
    iget-wide v2, v1, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v4, v0, Ll/ܽۙᩳ;->᩻:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    .line 65
    new-instance v5, Ll/ۢ۬ᩳ;

    iget-object v2, v0, Ll/ܽۙᩳ;->ܿ:Ll/ۢ۬ᩳ;

    iget-object v12, v2, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v13, v2, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    iget-wide v2, v2, Ll/ۢ۬ᩳ;->ۧ:J

    iget-object v4, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-wide v14, v4, Ll/ۢ۬ᩳ;->ۧ:J

    .line 66
    invoke-static {v2, v3, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    iget-object v2, v0, Ll/ܽۙᩳ;->ܿ:Ll/ۢ۬ᩳ;

    iget-boolean v2, v2, Ll/ۢ۬ᩳ;->֫:Z

    move-object v11, v5

    move/from16 v16, v2

    invoke-direct/range {v11 .. v16}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    .line 67
    new-instance v2, Ll/ۖۙᩳ;

    iget-object v6, v1, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v11, v1, Ll/ۖۙᩳ;->ܽ:J

    move-object v4, v2

    invoke-direct/range {v4 .. v12}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    return-object v2
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 55
    iput-object v0, p0, Ll/ܽۙᩳ;->ۢ:Ll/֫ۙᩳ;

    iget-object v0, p0, Ll/ܽۙᩳ;->ᩳ:Ll/ܳۙᩳ;

    invoke-virtual {v0}, Ll/ܳۙᩳ;->ۧ()V

    return-void
.end method

.method public final ֫(Ll/᩻ۙᩳ;Ll/ۖۙᩳ;)V
    .locals 9

    .line 40
    iget-object v0, p0, Ll/ܽۙᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {p1}, Ll/᩻ۙᩳ;->֫()Ll/ܺۙᩳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܺۙᩳ;->֫(Ll/ܺۙᩳ;)Ll/ܺۙᩳ;

    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Ll/ܽۙᩳ;->ۜ:Ll/ۖۙᩳ;

    if-eqz v0, :cond_0

    iget-object v0, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v3, v1, v2}, Ll/ۢ۬ᩳ;->֫(Ll/ܺۙᩳ;J)Ll/ۢ۬ᩳ;

    move-result-object v0

    .line 43
    :goto_0
    iget-wide v1, p2, Ll/ۖۙᩳ;->ܽ:J

    iget-boolean p2, p0, Ll/ܽۙᩳ;->᩷:Z

    iget-object v4, p0, Ll/ܽۙᩳ;->ᩳ:Ll/ܳۙᩳ;

    invoke-virtual {v0, v4, v1, v2, p2}, Ll/ۢ۬ᩳ;->֫(Ll/ܳۙᩳ;JZ)Ll/ۢ۬ᩳ;

    move-result-object v4

    .line 44
    new-instance p2, Ll/֫ۙᩳ;

    invoke-virtual {p1}, Ll/᩻ۙᩳ;->ۧ()J

    move-result-wide v5

    invoke-virtual {p1}, Ll/᩻ۙᩳ;->ܽ()J

    move-result-wide v7

    move-object v2, p2

    invoke-direct/range {v2 .. v8}, Ll/֫ۙᩳ;-><init>(Ll/ܺۙᩳ;Ll/ۢ۬ᩳ;JJ)V

    iput-object p2, p0, Ll/ܽۙᩳ;->ۢ:Ll/֫ۙᩳ;

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 48
    iget-object v0, p0, Ll/ܽۙᩳ;->ۢ:Ll/֫ۙᩳ;

    invoke-static {v0}, Ll/֫ۙᩳ;->֫(Ll/֫ۙᩳ;)Ll/ܺۙᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۙᩳ;->֫:Ll/ܺۙᩳ;

    .line 49
    iget-object v0, p0, Ll/ܽۙᩳ;->ۢ:Ll/֫ۙᩳ;

    invoke-static {v0}, Ll/֫ۙᩳ;->ۧ(Ll/֫ۙᩳ;)Ll/ۢ۬ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۙᩳ;->ܿ:Ll/ۢ۬ᩳ;

    .line 50
    iget-object v0, p0, Ll/ܽۙᩳ;->ۢ:Ll/֫ۙᩳ;

    invoke-static {v0}, Ll/֫ۙᩳ;->ܽ(Ll/֫ۙᩳ;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܽۙᩳ;->ܳ:J

    .line 51
    iget-object v0, p0, Ll/ܽۙᩳ;->ۢ:Ll/֫ۙᩳ;

    invoke-static {v0}, Ll/֫ۙᩳ;->ᩳ(Ll/֫ۙᩳ;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܽۙᩳ;->᩻:J

    const/4 v0, 0x0

    .line 52
    iput-object v0, p0, Ll/ܽۙᩳ;->ۢ:Ll/֫ۙᩳ;

    return-void
.end method
