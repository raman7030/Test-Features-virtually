.class public final Ll/᩵ᩳۘ;
.super Ljava/lang/Object;
.source "E9JH"


# instance fields
.field public final ֫:Ll/ܿܽۘ;

.field public ۧ:Ll/ۙ֫ۘ;

.field public ܳ:Ll/ܽۧۘ;

.field public final ܽ:Z

.field public ܿ:Ll/ܶܽۘ;

.field public final ᩳ:Ll/᩷ۧۘ;

.field public ᩻:J


# direct methods
.method public constructor <init>(JLl/ܽۧۘ;Ll/ܶܽۘ;Ljava/util/EnumSet;Ll/ۙ֫ۘ;Ll/ۜۧۘ;Ll/ܿܽۘ;Ljava/util/EnumSet;Ljava/util/EnumSet;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-wide p1, p0, Ll/᩵ᩳۘ;->᩻:J

    .line 56
    iput-object p3, p0, Ll/᩵ᩳۘ;->ܳ:Ll/ܽۧۘ;

    .line 57
    iput-object p4, p0, Ll/᩵ᩳۘ;->ܿ:Ll/ܶܽۘ;

    .line 59
    invoke-virtual {p7}, Ll/ۜۧۘ;->ܳ()Ll/᩷ۧۘ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ᩳۘ;->ᩳ:Ll/᩷ۧۘ;

    .line 60
    iput-object p6, p0, Ll/᩵ᩳۘ;->ۧ:Ll/ۙ֫ۘ;

    .line 61
    iput-object p8, p0, Ll/᩵ᩳۘ;->֫:Ll/ܿܽۘ;

    .line 63
    sget-object p2, Ll/ۢۨۖ;->ۨ:Ll/ۢۨۖ;

    invoke-interface {p10, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩹ۛۖ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p7}, Ll/ۜۧۘ;->ۡ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/᩵ᩳۘ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TreeConnect["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/᩵ᩳۘ;->᩻:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "]("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ᩳۘ;->ܳ:Ll/ܽۧۘ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 12

    .line 68
    iget-wide v0, p0, Ll/᩵ᩳۘ;->᩻:J

    iget-object v2, p0, Ll/᩵ᩳۘ;->֫:Ll/ܿܽۘ;

    iget-object v3, p0, Ll/᩵ᩳۘ;->ܿ:Ll/ܶܽۘ;

    const-string v4, "Error closing connection to "

    :try_start_0
    new-instance v11, Ll/ۖ᩺ۖ;

    iget-object v5, p0, Ll/᩵ᩳۘ;->ᩳ:Ll/᩷ۧۘ;

    invoke-virtual {v5}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v6

    invoke-virtual {v3}, Ll/ܶܽۘ;->ᩳ()J

    move-result-wide v7

    iget-wide v9, p0, Ll/᩵ᩳۘ;->᩻:J

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Ll/ۖ᩺ۖ;-><init>(Ll/᩹ۛۖ;JJ)V

    const/4 v5, 0x0

    .line 305
    invoke-virtual {v3, v11, v5}, Ll/ܶܽۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;

    move-result-object v5

    .line 70
    iget-object v6, p0, Ll/᩵ᩳۘ;->ۧ:Ll/ۙ֫ۘ;

    invoke-virtual {v6}, Ll/ۙ֫ۘ;->ۖ()J

    move-result-wide v6

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v8, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;

    invoke-static {v6, v7, v5}, Ll/ᩳ۟ۖ;->֫(JLjava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۨۖ;

    .line 71
    invoke-virtual {v5}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v6

    check-cast v6, Ll/᩻ۨۖ;

    invoke-virtual {v6}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll/۟۫ۖ;->ܽ(J)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_0

    .line 75
    new-instance v4, Ll/ۜܽۘ;

    invoke-virtual {v3}, Ll/ܶܽۘ;->ᩳ()J

    move-result-wide v5

    invoke-direct {v4, v5, v6, v0, v1}, Ll/ۜܽۘ;-><init>(JJ)V

    invoke-virtual {v2, v4}, Ll/ܿܽۘ;->֫(Ll/ܽܽۘ;)V

    return-void

    .line 72
    :cond_0
    :try_start_1
    new-instance v6, Ll/֨ۨۖ;

    invoke-virtual {v5}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v5

    check-cast v5, Ll/᩻ۨۖ;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Ll/᩵ᩳۘ;->ܳ:Ll/ܽۧۘ;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v5, v4}, Ll/֨ۨۖ;-><init>(Ll/᩻ۨۖ;Ljava/lang/String;)V

    throw v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v4

    .line 75
    new-instance v5, Ll/ۜܽۘ;

    invoke-virtual {v3}, Ll/ܶܽۘ;->ᩳ()J

    move-result-wide v6

    invoke-direct {v5, v6, v7, v0, v1}, Ll/ۜܽۘ;-><init>(JJ)V

    invoke-virtual {v2, v5}, Ll/ܿܽۘ;->֫(Ll/ܽܽۘ;)V

    .line 76
    throw v4
.end method

.method public final ۧ()Ll/ۙ֫ۘ;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/᩵ᩳۘ;->ۧ:Ll/ۙ֫ۘ;

    return-object v0
.end method

.method public final ܳ()J
    .locals 2

    .line 84
    iget-wide v0, p0, Ll/᩵ᩳۘ;->᩻:J

    return-wide v0
.end method

.method public final ܽ()Ll/᩷ۧۘ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/᩵ᩳۘ;->ᩳ:Ll/᩷ۧۘ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/᩵ᩳۘ;->ܳ:Ll/ܽۧۘ;

    invoke-virtual {v0}, Ll/ܽۧۘ;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/ܶܽۘ;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/᩵ᩳۘ;->ܿ:Ll/ܶܽۘ;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Ll/᩵ᩳۘ;->ܽ:Z

    return v0
.end method
