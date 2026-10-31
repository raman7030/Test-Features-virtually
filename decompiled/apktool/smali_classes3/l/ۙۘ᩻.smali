.class public final Ll/ۙۘ᩻;
.super Ll/ۗۖ֡;
.source "DAFW"


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 100
    check-cast p1, Ll/᩵ᩴ᩻;

    .line 104
    invoke-static {p1}, Ll/ۗۘ᩻;->֫(Ll/᩵ᩴ᩻;)Ll/֫ۜۘ;

    move-result-object v0

    .line 105
    iput-object p1, v0, Ll/֫ۜۘ;->᩻֫:Ll/᩵ᩴ᩻;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۤۖ֡;)V
    .locals 0

    .line 100
    check-cast p1, Ll/᩵ᩴ᩻;

    .line 112
    invoke-interface {p2}, Ll/ۤۖ֡;->ۙۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۜۘ;

    .line 113
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    invoke-virtual {p1}, Ll/᩵᩻ۘ;->ۧ()V

    .line 116
    :try_start_0
    invoke-virtual {p1}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟ۢۘ;->ۧ()V
    :try_end_0
    .catch Ll/۫᩷ۘ; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)Ll/ۤۖ֡;
    .locals 1

    .line 100
    check-cast p1, Ll/֫ۜۘ;

    .line 156
    new-instance v0, Ll/ܽۘ֡;

    invoke-direct {v0, p1}, Ll/ܽۘ֡;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;Ll/ۤۖ֡;)Z
    .locals 5

    .line 100
    check-cast p1, Ll/᩵ᩴ᩻;

    .line 124
    invoke-interface {p2}, Ll/ۤۖ֡;->ۙۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۜۘ;

    .line 125
    invoke-virtual {p1}, Ll/᩵᩻ۘ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 130
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢۘ;->ۢ()Z

    move-result v0
    :try_end_0
    .catch Ll/۫᩷ۘ; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    goto :goto_0

    .line 138
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p2}, Ll/ۤۖ֡;->ܶ֫()Ll/ۘ᩹ᩴ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۘ᩹ᩴ;->toEpochMilli()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    const/4 p2, 0x1

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    const-wide/16 v2, 0x7d0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    return p2

    :cond_2
    :try_start_1
    const-string v0, "."

    .line 145
    invoke-virtual {p1, v0}, Ll/֫ۜۘ;->ܳ(Ljava/lang/String;)Ll/֫ۡۘ;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return p2

    :catch_0
    move-exception p1

    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :catch_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
