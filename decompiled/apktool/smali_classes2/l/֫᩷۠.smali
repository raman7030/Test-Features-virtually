.class public abstract Ll/֫᩷۠;
.super Ljava/lang/Object;
.source "M664"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫([Ll/ۙ֨֨;[Ll/ۙ֨֨;Ll/ۛ᩸֨;)I
    .locals 9

    .line 1445
    array-length v0, p0

    array-length v1, p1

    sub-int/2addr v0, v1

    const/4 v1, 0x4

    if-gt v0, v1, :cond_d

    const/4 v1, -0x4

    if-ge v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    if-lez v0, :cond_1

    .line 1449
    array-length v1, p1

    goto :goto_0

    :cond_1
    array-length v1, p0

    :goto_0
    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_c

    .line 1451
    aget-object v3, p0, v2

    aget-object v4, p1, v2

    const/4 v5, 0x1

    if-nez v3, :cond_2

    if-nez v4, :cond_9

    goto :goto_3

    :cond_2
    if-nez v4, :cond_3

    goto :goto_2

    .line 1420
    :cond_3
    invoke-virtual {v3}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v6

    sget-object v7, Ll/ۢ۠֨;->ܽ֫:Ll/ۢ۠֨;

    invoke-virtual {v6, v7}, Ll/ۢ۠֨;->֫(Ll/ۢ۠֨;)Z

    move-result v6

    if-nez v6, :cond_4

    sget-object v6, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    invoke-virtual {v3, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v6

    if-eqz v6, :cond_5

    :cond_4
    invoke-virtual {v4}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v6

    invoke-virtual {v6, v7}, Ll/ۢ۠֨;->֫(Ll/ۢ۠֨;)Z

    move-result v6

    if-nez v6, :cond_a

    sget-object v6, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    invoke-virtual {v4, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_3

    .line 1429
    :cond_5
    sget-object v6, Ll/ۢ۠֨;->ۖ֫:Ll/ۢ۠֨;

    invoke-virtual {v3, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 1430
    invoke-virtual {v4, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    goto :goto_3

    .line 1431
    :cond_6
    sget-object v7, Ll/ۢ۠֨;->ܺ֫:Ll/ۢ۠֨;

    invoke-virtual {v3, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 1432
    invoke-virtual {v4, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 1433
    check-cast v3, Ll/ܽۡ۠;

    iget v3, v3, Ll/ܽۡ۠;->ۨ:I

    check-cast v4, Ll/ܽۡ۠;

    iget v4, v4, Ll/ܽۡ۠;->ۨ:I

    if-ne v3, v4, :cond_9

    goto :goto_3

    .line 1437
    :cond_7
    invoke-virtual {v4, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v4, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_2

    .line 1441
    :cond_8
    invoke-virtual {p2, v3, v4}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v5

    goto :goto_3

    :cond_9
    :goto_2
    const/4 v5, 0x0

    :cond_a
    :goto_3
    if-nez v5, :cond_b

    goto :goto_4

    :cond_b
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_c
    return v0

    :cond_d
    :goto_4
    const p0, 0x7fffffff

    return p0
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public ֫(Ll/ܽ᩷۠;)V
    .locals 3

    .line 1254
    invoke-virtual {p0}, Ll/֫᩷۠;->֫()I

    move-result v0

    .line 1255
    iget-object v1, p1, Ll/ܽ᩷۠;->ܽ:Ll/ܶ֨۠;

    invoke-virtual {v1, v0}, Ll/ܶ֨۠;->֫(I)V

    .line 1256
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " frame_type="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
