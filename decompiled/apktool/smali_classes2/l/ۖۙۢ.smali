.class public final Ll/ۖۙۢ;
.super Ljava/lang/Object;
.source "K6OY"


# direct methods
.method public static ֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/۫᩶ۢ;Ll/۬᩶ۢ;ZLl/ᩴ᩷ܿ;)V
    .locals 11

    const-string v1, "Source nesting exceeds formatter limit"

    .line 30
    :try_start_0
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 31
    new-instance v0, Ll/᩺᩶ۢ;

    new-instance v2, Ll/᩷ۤۢ;

    move-object v4, p0

    invoke-direct {v2, p0}, Ll/᩷ۤۢ;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, v2}, Ll/᩺᩶ۢ;-><init>(Ll/᩷ۤۢ;)V

    .line 32
    invoke-virtual {v0}, Ll/ᩴܳ֡;->ۢ()V

    .line 33
    new-instance v5, Ll/ܺۙۢ;

    .line 64
    invoke-direct {v5, v0}, Ll/֫ܳ֡;-><init>(Ll/᩻ܳ֡;)V

    .line 34
    invoke-virtual {v5}, Ll/֫ܳ֡;->ܽ()V

    .line 36
    invoke-virtual {v5}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ܳ֡;

    .line 37
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 38
    invoke-interface {v6}, Ll/֡ܳ֡;->getType()I

    move-result v6

    const/16 v7, 0xf

    if-eq v6, v7, :cond_3

    const/16 v7, 0x13

    if-eq v6, v7, :cond_3

    const/16 v7, 0x8

    if-eq v6, v7, :cond_3

    const/16 v7, 0x11

    if-ne v6, v7, :cond_1

    goto :goto_1

    :cond_1
    const/16 v7, 0x10

    if-eq v6, v7, :cond_2

    const/16 v7, 0x14

    if-eq v6, v7, :cond_2

    const/16 v7, 0x12

    if-ne v6, v7, :cond_0

    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 42
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_0

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    const/16 v6, 0x80

    if-gt v3, v6, :cond_4

    goto :goto_0

    .line 40
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_5
    new-instance v0, Ll/ۢۙۢ;

    invoke-direct {v0, v5}, Ll/ۢۙۢ;-><init>(Ll/֫ܳ֡;)V

    .line 46
    invoke-virtual {v0}, Ll/ᩴܳ֡;->ۢ()V

    .line 47
    sget-object v2, Ll/ۡۙۢ;->֫:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_8

    const/4 v3, 0x2

    if-eq v2, v3, :cond_7

    const/4 v3, 0x3

    if-ne v2, v3, :cond_6

    .line 50
    invoke-virtual {v0}, Ll/ۢۙۢ;->ۙ()Ll/ᩳۙۢ;

    move-result-object v0

    goto :goto_2

    .line 47
    :cond_6
    new-instance v0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {v0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw v0

    .line 49
    :cond_7
    invoke-virtual {v0}, Ll/ۢۙۢ;->ۗ()Ll/ܿۙۢ;

    move-result-object v0

    goto :goto_2

    .line 48
    :cond_8
    invoke-virtual {v0}, Ll/ۢۙۢ;->ۛ()Ll/᩷ۙۢ;

    move-result-object v0

    :goto_2
    move-object v6, v0

    .line 52
    new-instance v0, Ll/ۨ᩶ۢ;

    move-object v3, v0

    move-object v4, p0

    move-object v7, p1

    move-object v8, p2

    move v9, p4

    move-object/from16 v10, p5

    invoke-direct/range {v3 .. v10}, Ll/ۨ᩶ۢ;-><init>(Ljava/lang/CharSequence;Ll/֫ܳ֡;Ll/ۡܳ֡;Ll/ۗ᩶ۢ;Ll/۫᩶ۢ;ZLl/ᩴ᩷ܿ;)V

    move-object v2, p3

    .line 53
    invoke-virtual {v0, p3}, Ll/ۨ᩶ۢ;->֫(Ll/۬᩶ۢ;)V

    .line 54
    invoke-virtual {v0}, Ll/ۨ᩶ۢ;->֫()V
    :try_end_0
    .catch Ll/ۜۤۢ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 58
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 56
    :catch_1
    new-instance v0, Ljava/lang/InterruptedException;

    const-string v1, "Code transformation cancelled"

    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
