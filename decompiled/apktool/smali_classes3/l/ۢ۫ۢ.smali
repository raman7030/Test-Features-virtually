.class public final Ll/ۢ۫ۢ;
.super Ljava/lang/Object;
.source "C6PQ"


# instance fields
.field public final ֫:[I

.field public final ۧ:I


# direct methods
.method public constructor <init>(I[I)V
    .locals 0

    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 316
    iput p1, p0, Ll/ۢ۫ۢ;->ۧ:I

    .line 317
    iput-object p2, p0, Ll/ۢ۫ۢ;->֫:[I

    return-void
.end method

.method public static ֫(Ll/᩸ܳ֡;)Ll/ۢ۫ۢ;
    .locals 8

    .line 321
    sget-object v0, Ll/ۙ۬ۢ;->֡:Ll/᩸ܳ֡;

    if-eq p0, v0, :cond_0

    goto/16 :goto_2

    .line 322
    :cond_0
    iget-object v0, p0, Ll/᩸ܳ֡;->ܳ:[Ll/᩷ۜ֡;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ll/ۢ۫ۢ;->ۧ(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v0

    .line 323
    instance-of v2, v0, Ll/ᩳ᩻֡;

    if-eqz v2, :cond_8

    check-cast v0, Ll/ᩳ᩻֡;

    .line 324
    iget-object p0, p0, Ll/᩸ܳ֡;->ܳ:[Ll/᩷ۜ֡;

    array-length p0, p0

    new-array p0, p0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 325
    :goto_0
    invoke-virtual {v0}, Ll/᩺ܳ֡;->֫()I

    move-result v4

    if-ge v3, v4, :cond_7

    .line 326
    invoke-virtual {v0, v3}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v4

    iget-object v4, v4, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-static {v4}, Ll/ۢ۫ۢ;->ۧ(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v4

    .line 327
    invoke-virtual {v4}, Ll/᩺ܳ֡;->֫()I

    move-result v5

    if-ne v5, v1, :cond_6

    invoke-virtual {v4, v2}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v4

    instance-of v5, v4, Ll/ۡۜ֡;

    if-eqz v5, :cond_6

    check-cast v4, Ll/ۡۜ֡;

    iget v5, v4, Ll/ۡۜ֡;->ܿ:I

    .line 328
    iget-object v4, v4, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    invoke-static {v4}, Ll/ۢ۫ۢ;->ۧ(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v4

    const/16 v6, 0x46

    if-ne v5, v6, :cond_3

    .line 331
    invoke-virtual {v4}, Ll/᩺ܳ֡;->֫()I

    move-result v6

    if-ne v6, v1, :cond_6

    invoke-virtual {v4, v2}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v4

    instance-of v6, v4, Ll/ܽ᩻֡;

    if-eqz v6, :cond_6

    check-cast v4, Ll/ܽ᩻֡;

    iget v6, v4, Ll/ܽ᩻֡;->ܽ:I

    const/16 v7, 0x5f

    if-eq v6, v7, :cond_1

    goto :goto_1

    .line 333
    :cond_1
    iget-object v4, v4, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    invoke-static {v4}, Ll/ۢ۫ۢ;->ۧ(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v4

    .line 334
    invoke-virtual {v4}, Ll/᩺ܳ֡;->֫()I

    move-result v6

    if-ne v6, v1, :cond_6

    invoke-virtual {v4, v2}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v4

    instance-of v6, v4, Ll/ۡۜ֡;

    if-eqz v6, :cond_6

    check-cast v4, Ll/ۡۜ֡;

    iget v6, v4, Ll/ۡۜ֡;->ܿ:I

    if-eq v6, v1, :cond_2

    goto :goto_1

    .line 336
    :cond_2
    iget-object v4, v4, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    invoke-static {v4}, Ll/ۢ۫ۢ;->ۧ(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object v4

    .line 338
    :cond_3
    iget-object v6, v0, Ll/᩻᩻֡;->ۢ:Ll/ܳ᩻֡;

    if-eq v4, v6, :cond_4

    goto :goto_1

    .line 339
    :cond_4
    aget v4, p0, v5

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v4, v3, 0x1

    .line 340
    aput v4, p0, v5

    :cond_6
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 342
    :cond_7
    new-instance v1, Ll/ۢ۫ۢ;

    iget v0, v0, Ll/ۜ᩻֡;->ۜ:I

    invoke-direct {v1, v0, p0}, Ll/ۢ۫ۢ;-><init>(I[I)V

    return-object v1

    :cond_8
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢ۫ۢ;->ۧ(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/᩺ܳ֡;)Ll/᩺ܳ֡;
    .locals 2

    .line 346
    :goto_0
    instance-of v0, p0, Ll/ܳ᩻֡;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/᩺ܳ֡;->֫()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 347
    invoke-virtual {p0, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v1

    instance-of v1, v1, Ll/ۢ᩻֡;

    if-eqz v1, :cond_0

    .line 348
    invoke-virtual {p0, v0}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object p0

    iget-object p0, p0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    goto :goto_0

    :cond_0
    return-object p0
.end method
