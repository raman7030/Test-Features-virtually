.class public final Ll/ܺ֫֨;
.super Ll/ۢ֫֨;
.source "C5BI"


# instance fields
.field public ۜۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final ۧ()V
    .locals 11

    .line 314
    iget-object v0, p0, Ll/ܺ֫֨;->ۜۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 315
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_11

    .line 316
    invoke-virtual {p0}, Ll/ۨܽ֨;->֨()Ll/ۛܽ֨;

    move-result-object v2

    .line 317
    sget-object v3, Ll/ۛܽ֨;->᩶:Ll/ۛܽ֨;

    const-string v4, ","

    const/4 v5, 0x0

    if-eq v2, v3, :cond_5

    sget-object v3, Ll/ۛܽ֨;->ۙ:Ll/ۛܽ֨;

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "{"

    .line 368
    invoke-virtual {p0, v2}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 369
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ֫֨;

    .line 370
    invoke-virtual {v2, p0}, Ll/ۢܽ֨;->֫(Ll/ۨܽ֨;)V

    .line 371
    instance-of v3, v2, Ll/֨֫֨;

    if-nez v3, :cond_1

    instance-of v3, v2, Ll/ۖ֫֨;

    if-eqz v3, :cond_2

    .line 372
    :cond_1
    invoke-virtual {v2}, Ll/ۢܽ֨;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 374
    :cond_2
    invoke-virtual {v2}, Ll/ۢ֫֨;->ۧ()V

    add-int/lit8 v2, v1, -0x1

    if-ge v5, v2, :cond_3

    .line 376
    invoke-virtual {p0, v4}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 379
    :cond_4
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩵()V

    return-void

    .line 343
    :cond_5
    :goto_1
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ֫֨;

    .line 329
    instance-of v3, v2, Ll/ۡ֫֨;

    const/16 v6, 0xa

    if-nez v3, :cond_7

    instance-of v2, v2, Ll/֨֫֨;

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    const/4 v2, 0x1

    goto :goto_3

    .line 394
    :cond_7
    :goto_2
    iget v2, p0, Ll/ۢܽ֨;->᩶:I

    add-int/2addr v2, v6

    .line 330
    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v3

    add-int/2addr v2, v3

    .line 344
    :goto_3
    invoke-virtual {p0}, Ll/ۨܽ֨;->֨()Ll/ۛܽ֨;

    move-result-object v3

    sget-object v7, Ll/ۛܽ֨;->ۙ:Ll/ۛܽ֨;

    const/4 v8, 0x4

    if-ne v3, v7, :cond_8

    goto :goto_4

    .line 345
    :cond_8
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢ֫֨;

    iget-object v3, v3, Ll/ۢ֫֨;->᩻ۧ:Ll/۟۫ۚ;

    .line 336
    sget-object v7, Ll/᩷֫֨;->֫:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v7, v3

    packed-switch v3, :pswitch_data_0

    .line 338
    rem-int/lit8 v3, v1, 0x2

    if-le v1, v6, :cond_a

    if-nez v3, :cond_9

    const/4 v3, 0x4

    goto :goto_5

    :goto_4
    :pswitch_0
    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    const/4 v3, 0x6

    goto :goto_5

    :cond_a
    if-nez v3, :cond_b

    const/4 v3, 0x2

    goto :goto_5

    :cond_b
    const/4 v3, 0x3

    .line 347
    :goto_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۨܽ֨;->۠()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "{ "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 213
    iget-object v6, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    sget-object v7, Ll/ۢܽ֨;->ܶ֫:Ljava/lang/String;

    invoke-virtual {p0, v8, v7}, Ll/ۢܽ֨;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v9}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    .line 349
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۢ֫֨;

    .line 350
    sget-object v9, Ll/ۛܽ֨;->ۙ:Ll/ۛܽ֨;

    invoke-virtual {v6, v9}, Ll/ۨܽ֨;->֫(Ll/ۛܽ֨;)V

    .line 398
    iput v2, v6, Ll/ۢܽ֨;->᩶:I

    .line 352
    instance-of v9, v6, Ll/ۡ֫֨;

    if-nez v9, :cond_c

    instance-of v9, v6, Ll/֨֫֨;

    if-nez v9, :cond_c

    instance-of v9, v6, Ll/ۖ֫֨;

    if-eqz v9, :cond_d

    .line 355
    :cond_c
    rem-int v9, v5, v3

    if-nez v9, :cond_d

    if-eqz v5, :cond_d

    .line 213
    iget-object v9, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-virtual {p0, v8, v7}, Ll/ۢܽ֨;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    .line 358
    :cond_d
    invoke-virtual {v6}, Ll/ۢ֫֨;->ۧ()V

    add-int/lit8 v6, v1, -0x1

    if-ge v5, v6, :cond_f

    .line 360
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    rem-int v9, v5, v3

    add-int/lit8 v10, v3, -0x1

    if-ne v9, v10, :cond_e

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v9

    goto :goto_7

    :cond_e
    const-string v9, " "

    :goto_7
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    :cond_f
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_10
    const-string v0, " }"

    .line 238
    iget-object v1, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-interface {v1, v0}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    const-string v0, "  }"

    .line 363
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    return-void

    .line 324
    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۨܽ֨;->۠()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{ } }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᩹()Ljava/lang/String;
    .locals 4

    .line 303
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "={"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܺ֫֨;->ۜۧ:Ljava/util/ArrayList;

    .line 304
    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ܿ᩶ܳ;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Ll/ܿ᩶ܳ;-><init>(I)V

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    const-string v2, ","

    invoke-static {v2}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
