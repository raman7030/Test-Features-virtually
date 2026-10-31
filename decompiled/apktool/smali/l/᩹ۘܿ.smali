.class public final Ll/᩹ۘܿ;
.super Ljava/lang/Object;
.source "U707"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:Ll/᩸ۘܿ;

.field public ܿ:I

.field public ᩳ:Z

.field public ᩻:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 242
    invoke-virtual {p0, p1}, Ll/᩹ۘܿ;->ۧ(I)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩹ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩹ۘܿ;->֫:I

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/᩹ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩹ۘܿ;->ܳ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/᩹ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩹ۘܿ;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/᩹ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩹ۘܿ;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩹ۘܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩹ۘܿ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/᩹ۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩹ۘܿ;->᩻:I

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 280
    iput-boolean v0, p0, Ll/᩹ۘܿ;->ᩳ:Z

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    if-ltz p1, :cond_3

    .line 269
    iget v0, p0, Ll/᩹ۘܿ;->᩻:I

    if-gt p1, v0, :cond_3

    .line 272
    iget v0, p0, Ll/᩹ۘܿ;->ۧ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-ge p1, v0, :cond_1

    .line 273
    :cond_0
    iput p1, p0, Ll/᩹ۘܿ;->ۧ:I

    .line 274
    :cond_1
    iget v0, p0, Ll/᩹ۘܿ;->֫:I

    if-le p1, v0, :cond_2

    iput p1, p0, Ll/᩹ۘܿ;->֫:I

    :cond_2
    return-void

    .line 270
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid dependency boundary"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II)V
    .locals 2

    if-ne p1, p2, :cond_0

    .line 257
    invoke-virtual {p0, p1}, Ll/᩹ۘܿ;->֫(I)V

    return-void

    :cond_0
    if-ltz p1, :cond_4

    if-gt p1, p2, :cond_4

    .line 258
    iget v0, p0, Ll/᩹ۘܿ;->᩻:I

    if-gt p2, v0, :cond_4

    .line 261
    iget v0, p0, Ll/᩹ۘܿ;->ܳ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    if-ge p1, v0, :cond_2

    .line 262
    :cond_1
    iput p1, p0, Ll/᩹ۘܿ;->ܳ:I

    .line 263
    :cond_2
    iget p1, p0, Ll/᩹ۘܿ;->ܿ:I

    if-le p2, p1, :cond_3

    iput p2, p0, Ll/᩹ۘܿ;->ܿ:I

    :cond_3
    return-void

    .line 259
    :cond_4
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid dependency read range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩶ۘܿ;)V
    .locals 3

    .line 292
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    iget v0, p0, Ll/᩹ۘܿ;->᩻:I

    invoke-static {p1}, Ll/᩶ۘܿ;->᩻(Ll/᩶ۘܿ;)I

    move-result v1

    if-ne v0, v1, :cond_8

    .line 297
    invoke-static {p1}, Ll/᩶ۘܿ;->ܳ(Ll/᩶ۘܿ;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 299
    iget v2, p0, Ll/᩹ۘܿ;->ܳ:I

    if-eq v2, v1, :cond_0

    if-ge v0, v2, :cond_1

    .line 300
    :cond_0
    iput v0, p0, Ll/᩹ۘܿ;->ܳ:I

    .line 301
    :cond_1
    invoke-static {p1}, Ll/᩶ۘܿ;->ܿ(Ll/᩶ۘܿ;)I

    move-result v0

    .line 302
    iget v2, p0, Ll/᩹ۘܿ;->ܿ:I

    if-le v0, v2, :cond_2

    iput v0, p0, Ll/᩹ۘܿ;->ܿ:I

    .line 304
    :cond_2
    invoke-static {p1}, Ll/᩶ۘܿ;->ۧ(Ll/᩶ۘܿ;)I

    move-result v0

    if-eq v0, v1, :cond_5

    .line 306
    iget v2, p0, Ll/᩹ۘܿ;->ۧ:I

    if-eq v2, v1, :cond_3

    if-ge v0, v2, :cond_4

    .line 307
    :cond_3
    iput v0, p0, Ll/᩹ۘܿ;->ۧ:I

    .line 308
    :cond_4
    invoke-static {p1}, Ll/᩶ۘܿ;->֫(Ll/᩶ۘܿ;)I

    move-result v0

    .line 309
    iget v1, p0, Ll/᩹ۘܿ;->֫:I

    if-le v0, v1, :cond_5

    iput v0, p0, Ll/᩹ۘܿ;->֫:I

    .line 311
    :cond_5
    iget-boolean v0, p0, Ll/᩹ۘܿ;->ᩳ:Z

    invoke-static {p1}, Ll/᩶ۘܿ;->ᩳ(Ll/᩶ۘܿ;)Z

    move-result v1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Ll/᩹ۘܿ;->ᩳ:Z

    .line 312
    invoke-static {p1}, Ll/᩶ۘܿ;->ܽ(Ll/᩶ۘܿ;)Ll/᩸ۘܿ;

    move-result-object p1

    .line 313
    sget-object v0, Ll/᩸ۘܿ;->ۙ:Ll/᩸ۘܿ;

    if-ne p1, v0, :cond_6

    .line 314
    iput-object v0, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    return-void

    .line 315
    :cond_6
    sget-object v0, Ll/᩸ۘܿ;->᩶:Ll/᩸ۘܿ;

    if-ne p1, v0, :cond_7

    iget-object p1, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    sget-object v1, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-ne p1, v1, :cond_7

    .line 317
    iput-object v0, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    :cond_7
    return-void

    .line 294
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Dependency text lengths differ"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩹ۘܿ;)V
    .locals 3

    .line 327
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 329
    :cond_0
    iget v0, p0, Ll/᩹ۘܿ;->᩻:I

    iget v1, p1, Ll/᩹ۘܿ;->᩻:I

    if-ne v0, v1, :cond_9

    .line 333
    iget v0, p1, Ll/᩹ۘܿ;->ܳ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 335
    iget v2, p0, Ll/᩹ۘܿ;->ܳ:I

    if-eq v2, v1, :cond_1

    if-ge v0, v2, :cond_2

    .line 336
    :cond_1
    iput v0, p0, Ll/᩹ۘܿ;->ܳ:I

    .line 337
    :cond_2
    iget v0, p1, Ll/᩹ۘܿ;->ܿ:I

    .line 338
    iget v2, p0, Ll/᩹ۘܿ;->ܿ:I

    if-le v0, v2, :cond_3

    iput v0, p0, Ll/᩹ۘܿ;->ܿ:I

    .line 340
    :cond_3
    iget v0, p1, Ll/᩹ۘܿ;->ۧ:I

    if-eq v0, v1, :cond_6

    .line 342
    iget v2, p0, Ll/᩹ۘܿ;->ۧ:I

    if-eq v2, v1, :cond_4

    if-ge v0, v2, :cond_5

    .line 343
    :cond_4
    iput v0, p0, Ll/᩹ۘܿ;->ۧ:I

    .line 344
    :cond_5
    iget v0, p1, Ll/᩹ۘܿ;->֫:I

    .line 345
    iget v1, p0, Ll/᩹ۘܿ;->֫:I

    if-le v0, v1, :cond_6

    iput v0, p0, Ll/᩹ۘܿ;->֫:I

    .line 347
    :cond_6
    iget-boolean v0, p0, Ll/᩹ۘܿ;->ᩳ:Z

    iget-boolean v1, p1, Ll/᩹ۘܿ;->ᩳ:Z

    or-int/2addr v0, v1

    iput-boolean v0, p0, Ll/᩹ۘܿ;->ᩳ:Z

    .line 348
    iget-object p1, p1, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    .line 349
    sget-object v0, Ll/᩸ۘܿ;->ۙ:Ll/᩸ۘܿ;

    if-ne p1, v0, :cond_7

    .line 350
    iput-object v0, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    return-void

    .line 351
    :cond_7
    sget-object v0, Ll/᩸ۘܿ;->᩶:Ll/᩸ۘܿ;

    if-ne p1, v0, :cond_8

    iget-object p1, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    sget-object v1, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-ne p1, v1, :cond_8

    .line 353
    iput-object v0, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    :cond_8
    :goto_0
    return-void

    .line 330
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Dependency text lengths differ"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ll/᩶ۘܿ;
    .locals 2

    .line 360
    new-instance v0, Ll/᩶ۘܿ;

    iget-object v1, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    invoke-direct {v0, p0, v1}, Ll/᩶ۘܿ;-><init>(Ll/᩹ۘܿ;Ll/᩸ۘܿ;)V

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 248
    iput p1, p0, Ll/᩹ۘܿ;->᩻:I

    const/4 p1, -0x1

    .line 249
    iput p1, p0, Ll/᩹ۘܿ;->֫:I

    iput p1, p0, Ll/᩹ۘܿ;->ۧ:I

    iput p1, p0, Ll/᩹ۘܿ;->ܿ:I

    iput p1, p0, Ll/᩹ۘܿ;->ܳ:I

    const/4 p1, 0x0

    .line 250
    iput-boolean p1, p0, Ll/᩹ۘܿ;->ᩳ:Z

    .line 251
    sget-object p1, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    iput-object p1, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    return-void

    .line 247
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative text length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ()V
    .locals 1

    .line 286
    sget-object v0, Ll/᩸ۘܿ;->ۙ:Ll/᩸ۘܿ;

    iput-object v0, p0, Ll/᩹ۘܿ;->ܽ:Ll/᩸ۘܿ;

    return-void
.end method
