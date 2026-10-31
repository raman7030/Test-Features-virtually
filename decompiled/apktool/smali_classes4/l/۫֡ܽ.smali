.class public Ll/۫֡ܽ;
.super Ll/ۛۚܽ;
.source "Z6QT"


# instance fields
.field public ۧ:[I

.field public ܽ:[I

.field public ᩳ:[I


# direct methods
.method public constructor <init>([I[I[ILl/ۛۚܽ;)V
    .locals 0

    .line 2335
    invoke-direct {p0}, Ll/ۛۚܽ;-><init>()V

    .line 2336
    iput-object p1, p0, Ll/۫֡ܽ;->ۧ:[I

    .line 2337
    iput-object p2, p0, Ll/۫֡ܽ;->ܽ:[I

    .line 2338
    iput-object p3, p0, Ll/۫֡ܽ;->ᩳ:[I

    .line 2339
    iput-object p4, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    return-void
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;
    .locals 9

    .line 2283
    instance-of v0, p0, Ll/ۢ֨ܽ;

    if-nez v0, :cond_0

    return-object p0

    .line 2287
    :cond_0
    move-object v0, p0

    check-cast v0, Ll/ۢ֨ܽ;

    iget-object v0, v0, Ll/ۖ֨ܽ;->ۧ:[I

    .line 2288
    array-length v1, v0

    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    return-object p0

    :cond_1
    const/16 v2, 0x80

    new-array v2, v2, [I

    .line 2298
    new-array v3, v1, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_2

    .line 2303
    aget v6, v0, v5

    and-int/lit8 v6, v6, 0x7f

    add-int/lit8 v5, v5, 0x1

    aput v5, v2, v6

    goto :goto_0

    :cond_2
    move v5, v1

    :goto_1
    if-lez v5, :cond_5

    add-int/lit8 v6, v1, -0x1

    :goto_2
    if-lt v6, v5, :cond_3

    .line 2312
    aget v7, v0, v6

    sub-int v8, v6, v5

    aget v8, v0, v8

    if-ne v7, v8, :cond_4

    add-int/lit8 v7, v6, -0x1

    .line 2314
    aput v5, v3, v7

    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    :cond_3
    :goto_3
    if-lez v6, :cond_4

    add-int/lit8 v6, v6, -0x1

    .line 2325
    aput v5, v3, v6

    goto :goto_3

    :cond_4
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_5
    const/4 v5, 0x1

    sub-int/2addr v1, v5

    .line 2329
    aput v5, v3, v1

    .line 2330
    instance-of v1, p0, Ll/ۘ֨ܽ;

    if-eqz v1, :cond_7

    .line 2331
    new-instance v1, Ll/ۤ֡ܽ;

    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 2351
    invoke-direct {v1, v0, v2, v3, p0}, Ll/۫֡ܽ;-><init>([I[I[ILl/ۛۚܽ;)V

    .line 2352
    iget-object p0, v1, Ll/۫֡ܽ;->ۧ:[I

    array-length v0, p0

    :goto_4
    if-ge v4, v0, :cond_6

    aget v2, p0, v4

    .line 2353
    iget v3, v1, Ll/ۤ֡ܽ;->ܿ:I

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v2, v3

    iput v2, v1, Ll/ۤ֡ܽ;->ܿ:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_6
    return-object v1

    .line 2332
    :cond_7
    new-instance v1, Ll/۫֡ܽ;

    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v1, v0, v2, v3, p0}, Ll/۫֡ܽ;-><init>([I[I[ILl/ۛۚܽ;)V

    return-object v1
.end method
