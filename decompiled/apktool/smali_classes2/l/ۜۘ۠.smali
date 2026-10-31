.class public final Ll/ۜۘ۠;
.super Ljava/lang/Object;
.source "E7PU"


# instance fields
.field public ֫:[I

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    new-array v0, v0, [I

    .line 343
    iput-object v0, p0, Ll/ۜۘ۠;->֫:[I

    const/4 v0, 0x0

    .line 344
    iput v0, p0, Ll/ۜۘ۠;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 4

    .line 367
    iget v0, p0, Ll/ۜۘ۠;->ۧ:I

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 381
    :cond_0
    iget-object v2, p0, Ll/ۜۘ۠;->֫:[I

    add-int/lit8 v3, v0, -0x2

    aget v2, v2, v3

    :goto_0
    sub-int v2, p1, v2

    if-nez v0, :cond_1

    goto :goto_1

    .line 390
    :cond_1
    iget-object v1, p0, Ll/ۜۘ۠;->֫:[I

    add-int/lit8 v3, v0, -0x1

    aget v1, v1, v3

    :goto_1
    sub-int v1, p2, v1

    if-eq v2, v1, :cond_2

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x2

    .line 400
    iget-object v1, p0, Ll/ۜۘ۠;->֫:[I

    array-length v1, v1

    :goto_3
    if-le v0, v1, :cond_4

    shl-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 407
    :cond_4
    iget-object v0, p0, Ll/ۜۘ۠;->֫:[I

    array-length v2, v0

    if-lt v1, v2, :cond_6

    .line 409
    array-length v2, v0

    if-eq v1, v2, :cond_5

    .line 410
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۜۘ۠;->֫:[I

    .line 369
    :cond_5
    iget-object v0, p0, Ll/ۜۘ۠;->֫:[I

    iget v1, p0, Ll/ۜۘ۠;->ۧ:I

    aput p1, v0, v1

    add-int/lit8 p1, v1, 0x1

    .line 370
    aput p2, v0, p1

    add-int/lit8 v1, v1, 0x2

    .line 371
    iput v1, p0, Ll/ۜۘ۠;->ۧ:I

    return-void

    .line 408
    :cond_6
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
