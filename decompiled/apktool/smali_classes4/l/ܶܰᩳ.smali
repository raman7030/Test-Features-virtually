.class public final Ll/ܶܰᩳ;
.super Ljava/lang/Object;
.source "XAZX"


# instance fields
.field public final ֫:[Ll/۠ܰᩳ;

.field public final ۧ:Ll/֨ܰᩳ;

.field public ܽ:Z

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩸ܰᩳ;[Ll/۠ܰᩳ;I)V
    .locals 1

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    new-instance v0, Ll/֨ܰᩳ;

    invoke-direct {v0, p1}, Ll/֨ܰᩳ;-><init>(Ll/᩸ܰᩳ;)V

    .line 278
    iput-object v0, p0, Ll/ܶܰᩳ;->ۧ:Ll/֨ܰᩳ;

    .line 282
    iput-object p2, p0, Ll/ܶܰᩳ;->֫:[Ll/۠ܰᩳ;

    .line 283
    iput p3, p0, Ll/ܶܰᩳ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 12

    :cond_0
    :goto_0
    if-ge p1, p2, :cond_b

    .line 291
    iget-object v0, p0, Ll/ܶܰᩳ;->ۧ:Ll/֨ܰᩳ;

    invoke-virtual {v0, p1}, Ll/֨ܰᩳ;->ܽ(I)Z

    .line 292
    invoke-virtual {v0}, Ll/֨ܰᩳ;->ܽ()I

    move-result v1

    add-int/lit8 p1, p1, 0x1

    if-eqz v1, :cond_0

    .line 294
    invoke-virtual {v0}, Ll/֨ܰᩳ;->֫()C

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    move v3, p1

    move v4, v3

    move v5, v4

    :goto_1
    if-ge v3, p2, :cond_6

    .line 297
    invoke-virtual {v0, v3}, Ll/֨ܰᩳ;->ܽ(I)Z

    .line 298
    invoke-virtual {v0}, Ll/֨ܰᩳ;->֫()C

    move-result v4

    if-eqz v4, :cond_3

    .line 300
    invoke-virtual {v0}, Ll/֨ܰᩳ;->ܽ()I

    move-result v6

    if-eqz v2, :cond_2

    add-int/lit8 v2, v1, 0x1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    if-le v6, v2, :cond_3

    add-int/lit8 v5, v3, 0x1

    move v4, v5

    goto :goto_3

    :cond_3
    if-eqz v4, :cond_5

    const/16 v2, 0x7d

    if-eq v4, v2, :cond_4

    const/16 v2, 0x5d

    if-eq v4, v2, :cond_4

    const/16 v2, 0x29

    if-eq v4, v2, :cond_4

    const/16 v2, 0x3e

    if-ne v4, v2, :cond_7

    :cond_4
    if-eq v5, p1, :cond_7

    move v5, v3

    goto :goto_4

    :cond_5
    add-int/lit8 v2, v3, 0x1

    move v4, v2

    :goto_3
    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x0

    goto :goto_1

    :cond_6
    move v3, v4

    :cond_7
    :goto_4
    move v2, p1

    :goto_5
    if-ge v2, v5, :cond_a

    .line 311
    invoke-virtual {v0, v2}, Ll/֨ܰᩳ;->ܽ(I)Z

    .line 312
    invoke-static {v0}, Ll/֨ܰᩳ;->֫(Ll/֨ܰᩳ;)I

    move-result v2

    iget v4, p0, Ll/ܶܰᩳ;->ᩳ:I

    sub-int/2addr v2, v4

    iget-object v4, p0, Ll/ܶܰᩳ;->֫:[Ll/۠ܰᩳ;

    aget-object v2, v4, v2

    .line 313
    invoke-static {v0}, Ll/֨ܰᩳ;->ۧ(Ll/֨ܰᩳ;)I

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 314
    invoke-static {v0}, Ll/֨ܰᩳ;->ᩳ(Ll/֨ܰᩳ;)I

    move-result v6

    sub-int v6, v4, v6

    .line 315
    iget-boolean v7, p0, Ll/ܶܰᩳ;->ܽ:Z

    if-eqz v7, :cond_8

    .line 316
    invoke-static {v0}, Ll/֨ܰᩳ;->ܽ(Ll/֨ܰᩳ;)I

    move-result v7

    :goto_6
    if-ge v7, v6, :cond_9

    .line 420
    iget-object v8, v2, Ll/۠ܰᩳ;->ۧ:[C

    iget-object v9, v2, Ll/۠ܰᩳ;->ᩳ:[I

    aget v10, v9, v7

    add-int/lit8 v11, v10, 0x1

    aput v11, v9, v7

    int-to-char v9, v1

    aput-char v9, v8, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    .line 319
    :cond_8
    invoke-static {v0}, Ll/֨ܰᩳ;->ܽ(Ll/֨ܰᩳ;)I

    move-result v7

    .line 397
    iget-object v2, v2, Ll/۠ܰᩳ;->ܽ:[I

    aget v8, v2, v7

    add-int/lit8 v8, v8, 0x1

    aput v8, v2, v7

    .line 398
    aget v7, v2, v6

    add-int/lit8 v7, v7, -0x1

    aput v7, v2, v6

    :cond_9
    move v2, v4

    goto :goto_5

    .line 323
    :cond_a
    invoke-virtual {p0, p1, v3}, Ll/ܶܰᩳ;->֫(II)V

    move p1, v3

    goto/16 :goto_0

    :cond_b
    return-void
.end method
