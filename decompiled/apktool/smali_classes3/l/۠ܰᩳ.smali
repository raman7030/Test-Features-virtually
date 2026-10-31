.class public final Ll/۠ܰᩳ;
.super Ljava/lang/Object;
.source "XAZX"


# instance fields
.field public final ֫:I

.field public ۧ:[C

.field public final ܳ:I

.field public final ܽ:[I

.field public final ܿ:Ll/ۚܰᩳ;

.field public ᩳ:[I


# direct methods
.method public constructor <init>(Ll/ۚܰᩳ;II)V
    .locals 5

    .line 387
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 388
    iput-object p1, p0, Ll/۠ܰᩳ;->ܿ:Ll/ۚܰᩳ;

    .line 389
    iput p2, p0, Ll/۠ܰᩳ;->֫:I

    .line 390
    iput p3, p0, Ll/۠ܰᩳ;->ܳ:I

    .line 391
    iget-object v0, p1, Ll/ۚܰᩳ;->֫:[I

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Ll/۠ܰᩳ;->ܽ:[I

    const/4 v0, 0x0

    .line 392
    :goto_0
    iget v1, p1, Ll/ۚܰᩳ;->ᩳ:I

    if-ge v0, v1, :cond_2

    if-lt v0, p2, :cond_0

    if-lt v0, p3, :cond_1

    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 393
    invoke-virtual {p1, v0}, Ll/ۚܰᩳ;->֫(I)I

    move-result v2

    invoke-virtual {p1, v0}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v3

    sub-int/2addr v2, v3

    .line 397
    iget-object v3, p0, Ll/۠ܰᩳ;->ܽ:[I

    aget v4, v3, v0

    add-int/2addr v4, v2

    aput v4, v3, v0

    .line 398
    aget v4, v3, v1

    sub-int/2addr v4, v2

    aput v4, v3, v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 403
    :goto_0
    iget-object v4, p0, Ll/۠ܰᩳ;->ܿ:Ll/ۚܰᩳ;

    iget v5, v4, Ll/ۚܰᩳ;->ᩳ:I

    iget-object v6, p0, Ll/۠ܰᩳ;->ܽ:[I

    if-ge v1, v5, :cond_1

    .line 404
    aget v4, v6, v1

    add-int/2addr v3, v4

    .line 405
    aput v2, v6, v1

    int-to-long v4, v2

    int-to-long v6, v3

    add-long/2addr v4, v6

    long-to-int v2, v4

    int-to-long v6, v2

    cmp-long v8, v4, v6

    if-nez v8, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 408
    :cond_1
    aput v2, v6, v5

    if-nez v2, :cond_2

    goto :goto_2

    .line 410
    :cond_2
    new-array v1, v2, [C

    iput-object v1, p0, Ll/۠ܰᩳ;->ۧ:[C

    .line 411
    invoke-virtual {v6}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, p0, Ll/۠ܰᩳ;->ᩳ:[I

    .line 412
    :goto_1
    iget v1, v4, Ll/ۚܰᩳ;->ᩳ:I

    if-ge v0, v1, :cond_5

    .line 413
    iget v1, p0, Ll/۠ܰᩳ;->֫:I

    if-lt v0, v1, :cond_3

    iget v1, p0, Ll/۠ܰᩳ;->ܳ:I

    if-lt v0, v1, :cond_4

    .line 414
    :cond_3
    invoke-virtual {v4, v0}, Ll/ۚܰᩳ;->֫(I)I

    move-result v1

    invoke-virtual {v4, v0}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v2

    sub-int/2addr v1, v2

    if-eqz v1, :cond_4

    .line 415
    iget-object v2, v4, Ll/ۚܰᩳ;->ۧ:[C

    invoke-virtual {v4, v0}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v3

    iget-object v5, p0, Ll/۠ܰᩳ;->ۧ:[C

    aget v7, v6, v0

    invoke-static {v2, v3, v5, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    return-void
.end method
