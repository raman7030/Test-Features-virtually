.class public final Ll/ᩴ֡ۧ;
.super Ljava/lang/Object;
.source "98SV"


# static fields
.field public static final ܳ:[B


# instance fields
.field public ֫:[B

.field public ۧ:Z

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    .line 330
    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ֡ۧ;->ܳ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
    .end array-data
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 362
    iput-boolean v0, p0, Ll/ᩴ֡ۧ;->ۧ:Z

    .line 363
    iput v0, p0, Ll/ᩴ֡ۧ;->ܽ:I

    .line 364
    iput v0, p0, Ll/ᩴ֡ۧ;->ᩳ:I

    return-void
.end method

.method public final ֫(II[B)V
    .locals 3

    .line 426
    iget-boolean v0, p0, Ll/ᩴ֡ۧ;->ۧ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sub-int/2addr p2, p1

    .line 430
    iget-object v0, p0, Ll/ᩴ֡ۧ;->֫:[B

    array-length v1, v0

    iget v2, p0, Ll/ᩴ֡ۧ;->ܽ:I

    add-int/2addr v2, p2

    if-ge v1, v2, :cond_1

    mul-int/lit8 v2, v2, 0x2

    .line 431
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ֡ۧ;->֫:[B

    .line 433
    :cond_1
    iget-object v0, p0, Ll/ᩴ֡ۧ;->֫:[B

    iget v1, p0, Ll/ᩴ֡ۧ;->ܽ:I

    invoke-static {p3, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 434
    iget p1, p0, Ll/ᩴ֡ۧ;->ܽ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ᩴ֡ۧ;->ܽ:I

    return-void
.end method

.method public final ֫(II)Z
    .locals 7

    .line 378
    iget v0, p0, Ll/ᩴ֡ۧ;->ᩳ:I

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz v0, :cond_8

    const/16 v4, 0xb5

    const/4 v5, 0x2

    const-string v6, "Unexpected start code value"

    if-eq v0, v3, :cond_6

    if-eq v0, v5, :cond_4

    const/4 v5, 0x4

    if-eq v0, v2, :cond_2

    if-ne v0, v5, :cond_1

    const/16 v0, 0xb3

    if-eq p1, v0, :cond_0

    if-ne p1, v4, :cond_9

    .line 413
    :cond_0
    iget p1, p0, Ll/ᩴ֡ۧ;->ܽ:I

    sub-int/2addr p1, p2

    iput p1, p0, Ll/ᩴ֡ۧ;->ܽ:I

    .line 414
    iput-boolean v1, p0, Ll/ᩴ֡ۧ;->ۧ:Z

    return v3

    .line 419
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    and-int/lit16 p1, p1, 0xf0

    const/16 p2, 0x20

    if-eq p1, p2, :cond_3

    .line 403
    invoke-static {v6}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 404
    invoke-virtual {p0}, Ll/ᩴ֡ۧ;->֫()V

    goto :goto_0

    .line 406
    :cond_3
    iget p1, p0, Ll/ᩴ֡ۧ;->ܽ:I

    iput p1, p0, Ll/ᩴ֡ۧ;->ܿ:I

    .line 407
    iput v5, p0, Ll/ᩴ֡ۧ;->ᩳ:I

    goto :goto_0

    :cond_4
    const/16 p2, 0x1f

    if-le p1, p2, :cond_5

    .line 395
    invoke-static {v6}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 396
    invoke-virtual {p0}, Ll/ᩴ֡ۧ;->֫()V

    goto :goto_0

    .line 398
    :cond_5
    iput v2, p0, Ll/ᩴ֡ۧ;->ᩳ:I

    goto :goto_0

    :cond_6
    if-eq p1, v4, :cond_7

    .line 387
    invoke-static {v6}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 388
    invoke-virtual {p0}, Ll/ᩴ֡ۧ;->֫()V

    goto :goto_0

    .line 390
    :cond_7
    iput v5, p0, Ll/ᩴ֡ۧ;->ᩳ:I

    goto :goto_0

    :cond_8
    const/16 p2, 0xb0

    if-ne p1, p2, :cond_9

    .line 381
    iput v3, p0, Ll/ᩴ֡ۧ;->ᩳ:I

    .line 382
    iput-boolean v3, p0, Ll/ᩴ֡ۧ;->ۧ:Z

    .line 421
    :cond_9
    :goto_0
    sget-object p1, Ll/ᩴ֡ۧ;->ܳ:[B

    invoke-virtual {p0, v1, v2, p1}, Ll/ᩴ֡ۧ;->֫(II[B)V

    return v1
.end method
