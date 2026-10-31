.class public final Ll/ܽۛۖ;
.super Ljava/lang/Object;
.source "19KT"

# interfaces
.implements Ll/ᩴۤۖ;


# virtual methods
.method public final ֫(Ll/ۤܰۖ;)Ll/֡ۤۖ;
    .locals 10

    .line 505
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v1, 0x0

    move-wide v3, v1

    move-wide v5, v3

    :cond_0
    add-long/2addr v3, v5

    long-to-int v5, v3

    .line 511
    invoke-virtual {p1, v5}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 513
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v5

    .line 514
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v7

    .line 515
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܳ()J

    .line 516
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܳ()J

    .line 518
    sget-object v9, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    long-to-int v8, v7

    div-int/lit8 v8, v8, 0x2

    invoke-virtual {p1, v8, v9}, Ll/ۤܰۖ;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 519
    new-instance v7, Ll/ۗ᩻ۚ;

    .line 24
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 519
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    cmp-long v7, v5, v1

    if-nez v7, :cond_0

    .line 522
    new-instance p1, Ll/ۘ۫ۡ;

    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method

.method public final ֫()Ll/ۧۤۖ;
    .locals 1

    .line 152
    sget-object v0, Ll/ۧۤۖ;->ᩴۧ:Ll/ۧۤۖ;

    return-object v0
.end method
