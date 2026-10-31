.class public final Ll/۬᩵;
.super Ljava/lang/Object;
.source "85M9"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ۗ:Ljava/lang/Object;


# instance fields
.field public ۙ:[Ljava/lang/Object;

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۬᩵;->ۗ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    .line 62
    invoke-direct {p0, v0}, Ll/۬᩵;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Ll/۬᩵;->᩸:Z

    if-nez p1, :cond_0

    .line 74
    sget-object p1, Ll/֡᩵;->֫:[I

    iput-object p1, p0, Ll/۬᩵;->᩹:[I

    .line 75
    sget-object p1, Ll/֡᩵;->ۧ:[Ljava/lang/Object;

    iput-object p1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    return-void

    :cond_0
    mul-int/lit8 p1, p1, 0x4

    const/4 v0, 0x4

    :goto_0
    const/16 v1, 0x20

    if-ge v0, v1, :cond_2

    const/4 v1, 0x1

    shl-int/2addr v1, v0

    add-int/lit8 v1, v1, -0xc

    if-gt p1, v1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 25
    :cond_2
    :goto_1
    div-int/lit8 p1, p1, 0x4

    .line 78
    new-array v0, p1, [I

    iput-object v0, p0, Ll/۬᩵;->᩹:[I

    .line 79
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    return-void
.end method

.method private ᩳ()V
    .locals 8

    .line 230
    iget v0, p0, Ll/۬᩵;->᩶:I

    .line 232
    iget-object v1, p0, Ll/۬᩵;->᩹:[I

    .line 233
    iget-object v2, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    .line 236
    aget-object v6, v2, v4

    .line 238
    sget-object v7, Ll/۬᩵;->ۗ:Ljava/lang/Object;

    if-eq v6, v7, :cond_1

    if-eq v4, v5, :cond_0

    .line 240
    aget v7, v1, v4

    aput v7, v1, v5

    .line 241
    aput-object v6, v2, v5

    const/4 v6, 0x0

    .line 242
    aput-object v6, v2, v4

    :cond_0
    add-int/lit8 v5, v5, 0x1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 249
    :cond_2
    iput-boolean v3, p0, Ll/۬᩵;->᩸:Z

    .line 250
    iput v5, p0, Ll/۬᩵;->᩶:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 50
    invoke-virtual {p0}, Ll/۬᩵;->clone()Ll/۬᩵;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۬᩵;
    .locals 2

    .line 88
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬᩵;

    .line 89
    iget-object v1, p0, Ll/۬᩵;->᩹:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/۬᩵;->᩹:[I

    .line 90
    iget-object v1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 92
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 498
    invoke-virtual {p0}, Ll/۬᩵;->ܽ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    .line 502
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۬᩵;->᩶:I

    mul-int/lit8 v1, v1, 0x1c

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    .line 503
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 504
    :goto_0
    iget v2, p0, Ll/۬᩵;->᩶:I

    if-ge v1, v2, :cond_3

    if-lez v1, :cond_1

    const-string v2, ", "

    .line 506
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    :cond_1
    invoke-virtual {p0, v1}, Ll/۬᩵;->֫(I)I

    move-result v2

    .line 509
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    .line 510
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 511
    invoke-virtual {p0, v1}, Ll/۬᩵;->ᩳ(I)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_2

    .line 513
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v2, "(this Map)"

    .line 515
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/16 v1, 0x7d

    .line 518
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 519
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 361
    iget-boolean v0, p0, Ll/۬᩵;->᩸:Z

    if-eqz v0, :cond_0

    .line 362
    invoke-direct {p0}, Ll/۬᩵;->ᩳ()V

    .line 365
    :cond_0
    iget-object v0, p0, Ll/۬᩵;->᩹:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(Ll/ܳ۟;)I
    .locals 2

    .line 419
    iget-boolean v0, p0, Ll/۬᩵;->᩸:Z

    if-eqz v0, :cond_0

    .line 420
    invoke-direct {p0}, Ll/۬᩵;->ᩳ()V

    :cond_0
    const/4 v0, 0x0

    .line 423
    :goto_0
    iget v1, p0, Ll/۬᩵;->᩶:I

    if-ge v0, v1, :cond_2

    .line 424
    iget-object v1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(ILjava/lang/Integer;)Ljava/lang/Object;
    .locals 2

    .line 118
    iget-object v0, p0, Ll/۬᩵;->᩹:[I

    iget v1, p0, Ll/۬᩵;->᩶:I

    invoke-static {v1, p1, v0}, Ll/֡᩵;->֫(II[I)I

    move-result p1

    if-ltz p1, :cond_1

    .line 120
    iget-object v0, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    sget-object v0, Ll/۬᩵;->ۗ:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    return-object p2
.end method

.method public final ֫()V
    .locals 5

    .line 444
    iget v0, p0, Ll/۬᩵;->᩶:I

    .line 445
    iget-object v1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    const/4 v4, 0x0

    .line 448
    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 451
    :cond_0
    iput v2, p0, Ll/۬᩵;->᩶:I

    .line 452
    iput-boolean v2, p0, Ll/۬᩵;->᩸:Z

    return-void
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 7

    .line 460
    iget v0, p0, Ll/۬᩵;->᩶:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/۬᩵;->᩹:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    if-gt p1, v1, :cond_0

    .line 461
    invoke-virtual {p0, p1, p2}, Ll/۬᩵;->ܽ(ILjava/lang/Object;)V

    return-void

    .line 465
    :cond_0
    iget-boolean v1, p0, Ll/۬᩵;->᩸:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/۬᩵;->᩹:[I

    array-length v1, v1

    if-lt v0, v1, :cond_1

    .line 466
    invoke-direct {p0}, Ll/۬᩵;->ᩳ()V

    .line 469
    :cond_1
    iget v0, p0, Ll/۬᩵;->᩶:I

    .line 470
    iget-object v1, p0, Ll/۬᩵;->᩹:[I

    array-length v1, v1

    const/4 v2, 0x1

    if-lt v0, v1, :cond_4

    add-int/lit8 v1, v0, 0x1

    mul-int/lit8 v1, v1, 0x4

    const/4 v3, 0x4

    :goto_0
    const/16 v4, 0x20

    if-ge v3, v4, :cond_3

    shl-int v4, v2, v3

    add-int/lit8 v4, v4, -0xc

    if-gt v1, v4, :cond_2

    move v1, v4

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 25
    :cond_3
    :goto_1
    div-int/lit8 v1, v1, 0x4

    .line 473
    new-array v3, v1, [I

    .line 474
    new-array v1, v1, [Ljava/lang/Object;

    .line 477
    iget-object v4, p0, Ll/۬᩵;->᩹:[I

    array-length v5, v4

    const/4 v6, 0x0

    invoke-static {v4, v6, v3, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 478
    iget-object v4, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    array-length v5, v4

    invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 480
    iput-object v3, p0, Ll/۬᩵;->᩹:[I

    .line 481
    iput-object v1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    .line 484
    :cond_4
    iget-object v1, p0, Ll/۬᩵;->᩹:[I

    aput p1, v1, v0

    .line 485
    iget-object p1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    add-int/2addr v0, v2

    .line 486
    iput v0, p0, Ll/۬᩵;->᩶:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 340
    iget-boolean v0, p0, Ll/۬᩵;->᩸:Z

    if-eqz v0, :cond_0

    .line 341
    invoke-direct {p0}, Ll/۬᩵;->ᩳ()V

    .line 344
    :cond_0
    iget v0, p0, Ll/۬᩵;->᩶:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 3

    .line 139
    iget-object v0, p0, Ll/۬᩵;->᩹:[I

    iget v1, p0, Ll/۬᩵;->᩶:I

    invoke-static {v1, p1, v0}, Ll/֡᩵;->֫(II[I)I

    move-result p1

    if-ltz p1, :cond_0

    .line 142
    iget-object v0, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    aget-object v1, v0, p1

    sget-object v2, Ll/۬᩵;->ۗ:Ljava/lang/Object;

    if-eq v1, v2, :cond_0

    .line 143
    aput-object v2, v0, p1

    const/4 p1, 0x1

    .line 144
    iput-boolean p1, p0, Ll/۬᩵;->᩸:Z

    :cond_0
    return-void
.end method

.method public final ܽ(ILjava/lang/Object;)V
    .locals 7

    .line 261
    iget-object v0, p0, Ll/۬᩵;->᩹:[I

    iget v1, p0, Ll/۬᩵;->᩶:I

    invoke-static {v1, p1, v0}, Ll/֡᩵;->֫(II[I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 264
    iget-object p1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-void

    :cond_0
    not-int v0, v0

    .line 268
    iget v1, p0, Ll/۬᩵;->᩶:I

    if-ge v0, v1, :cond_1

    iget-object v2, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    aget-object v3, v2, v0

    sget-object v4, Ll/۬᩵;->ۗ:Ljava/lang/Object;

    if-ne v3, v4, :cond_1

    .line 269
    iget-object v1, p0, Ll/۬᩵;->᩹:[I

    aput p1, v1, v0

    .line 270
    aput-object p2, v2, v0

    return-void

    .line 274
    :cond_1
    iget-boolean v2, p0, Ll/۬᩵;->᩸:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/۬᩵;->᩹:[I

    array-length v2, v2

    if-lt v1, v2, :cond_2

    .line 275
    invoke-direct {p0}, Ll/۬᩵;->ᩳ()V

    .line 278
    iget-object v0, p0, Ll/۬᩵;->᩹:[I

    iget v1, p0, Ll/۬᩵;->᩶:I

    invoke-static {v1, p1, v0}, Ll/֡᩵;->֫(II[I)I

    move-result v0

    not-int v0, v0

    .line 281
    :cond_2
    iget v1, p0, Ll/۬᩵;->᩶:I

    iget-object v2, p0, Ll/۬᩵;->᩹:[I

    array-length v2, v2

    const/4 v3, 0x1

    if-lt v1, v2, :cond_5

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x4

    const/4 v2, 0x4

    :goto_0
    const/16 v4, 0x20

    if-ge v2, v4, :cond_4

    shl-int v4, v3, v2

    add-int/lit8 v4, v4, -0xc

    if-gt v1, v4, :cond_3

    move v1, v4

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 25
    :cond_4
    :goto_1
    div-int/lit8 v1, v1, 0x4

    .line 284
    new-array v2, v1, [I

    .line 285
    new-array v1, v1, [Ljava/lang/Object;

    .line 288
    iget-object v4, p0, Ll/۬᩵;->᩹:[I

    array-length v5, v4

    const/4 v6, 0x0

    invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 289
    iget-object v4, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    array-length v5, v4

    invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 291
    iput-object v2, p0, Ll/۬᩵;->᩹:[I

    .line 292
    iput-object v1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    .line 295
    :cond_5
    iget v1, p0, Ll/۬᩵;->᩶:I

    sub-int/2addr v1, v0

    if-eqz v1, :cond_6

    .line 297
    iget-object v2, p0, Ll/۬᩵;->᩹:[I

    add-int/lit8 v4, v0, 0x1

    invoke-static {v2, v0, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 298
    iget-object v1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    iget v2, p0, Ll/۬᩵;->᩶:I

    sub-int/2addr v2, v0

    invoke-static {v1, v0, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 301
    :cond_6
    iget-object v1, p0, Ll/۬᩵;->᩹:[I

    aput p1, v1, v0

    .line 302
    iget-object p1, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    .line 303
    iget p1, p0, Ll/۬᩵;->᩶:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/۬᩵;->᩶:I

    return-void
.end method

.method public final ᩳ(I)Ljava/lang/Object;
    .locals 1

    .line 375
    iget-boolean v0, p0, Ll/۬᩵;->᩸:Z

    if-eqz v0, :cond_0

    .line 376
    invoke-direct {p0}, Ll/۬᩵;->ᩳ()V

    .line 379
    :cond_0
    iget-object v0, p0, Ll/۬᩵;->ۙ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method
