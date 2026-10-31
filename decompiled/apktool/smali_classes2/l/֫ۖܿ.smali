.class public final Ll/֫ۖܿ;
.super Ljava/lang/Object;
.source "T70E"


# instance fields
.field public ֡:Z

.field public final ֨:Ll/᩹ۘܿ;

.field public ֫:I

.field public ۖ:I

.field public ۘ:I

.field public final ۚ:Z

.field public final ۜ:I

.field public final ۠:Ll/᩹ۘܿ;

.field public ۡ:I

.field public ۢ:Ll/᩶ۘܿ;

.field public ۧ:Ll/ۗۘܿ;

.field public final ܳ:Ll/᩹ۘܿ;

.field public ܶ:I

.field public ܺ:I

.field public ܽ:Ll/᩹ۘܿ;

.field public ܿ:Z

.field public ᩳ:Ll/᩹ۘܿ;

.field public final ᩴ:Ll/᩹ۘܿ;

.field public final ᩵:Z

.field public ᩷:Ll/ܰܺܿ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(IIZZ)V
    .locals 2

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 39
    iput v0, p0, Ll/֫ۖܿ;->ۖ:I

    .line 55
    iput p1, p0, Ll/֫ۖܿ;->ۜ:I

    .line 56
    iput p2, p0, Ll/֫ۖܿ;->֫:I

    .line 57
    iput-boolean p3, p0, Ll/֫ۖܿ;->᩵:Z

    .line 58
    iput-boolean p4, p0, Ll/֫ۖܿ;->ۚ:Z

    .line 59
    new-instance v0, Ll/᩹ۘܿ;

    invoke-direct {v0, p1}, Ll/᩹ۘܿ;-><init>(I)V

    iput-object v0, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 60
    :cond_0
    new-instance v1, Ll/᩹ۘܿ;

    invoke-direct {v1, p1}, Ll/᩹ۘܿ;-><init>(I)V

    :goto_0
    iput-object v1, p0, Ll/֫ۖܿ;->֨:Ll/᩹ۘܿ;

    if-eqz p3, :cond_1

    move-object v1, v0

    goto :goto_1

    .line 61
    :cond_1
    new-instance v1, Ll/᩹ۘܿ;

    invoke-direct {v1, p1}, Ll/᩹ۘܿ;-><init>(I)V

    :goto_1
    iput-object v1, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    .line 62
    iput p2, p0, Ll/֫ۖܿ;->ܶ:I

    if-eqz p4, :cond_2

    .line 63
    new-instance p2, Ll/᩹ۘܿ;

    invoke-direct {p2, p1}, Ll/᩹ۘܿ;-><init>(I)V

    goto :goto_2

    :cond_2
    move-object p2, v0

    :goto_2
    iput-object p2, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-eqz p3, :cond_3

    .line 64
    new-instance v0, Ll/ۗۘܿ;

    invoke-direct {v0, p1}, Ll/ۗۘܿ;-><init>(I)V

    :cond_3
    iput-object v0, p0, Ll/֫ۖܿ;->ۧ:Ll/ۗۘܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۖܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ۖܿ;->ۜ:I

    return p0
.end method

.method public static ֫(Ll/֫ۖܿ;II)V
    .locals 1

    if-ne p1, p2, :cond_0

    .line 363
    invoke-virtual {p0, p1}, Ll/֫ۖܿ;->ۧ(I)V

    return-void

    .line 366
    :cond_0
    iget v0, p0, Ll/֫ۖܿ;->ۖ:I

    if-ge p1, v0, :cond_1

    iput p1, p0, Ll/֫ۖܿ;->ۖ:I

    .line 367
    :cond_1
    iget p1, p0, Ll/֫ۖܿ;->ܺ:I

    if-le p2, p1, :cond_2

    iput p2, p0, Ll/֫ۖܿ;->ܺ:I

    :cond_2
    return-void
.end method

.method private ۜ()V
    .locals 4

    .line 319
    iget-object v0, p0, Ll/֫ۖܿ;->ۢ:Ll/᩶ۘܿ;

    if-nez v0, :cond_0

    return-void

    .line 320
    :cond_0
    iget-object v1, p0, Ll/֫ۖܿ;->ۧ:Ll/ۗۘܿ;

    iget v2, p0, Ll/֫ۖܿ;->ۘ:I

    iget-boolean v3, p0, Ll/֫ۖܿ;->ܿ:Z

    if-eqz v3, :cond_1

    iget-object v0, p0, Ll/֫ۖܿ;->ᩳ:Ll/᩹ۘܿ;

    invoke-virtual {v0}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object v0

    :cond_1
    invoke-virtual {v1, v2, v0}, Ll/ۗۘܿ;->֫(ILl/᩶ۘܿ;)V

    const/4 v0, 0x0

    .line 321
    iput-object v0, p0, Ll/֫ۖܿ;->ۢ:Ll/᩶ۘܿ;

    const/4 v0, 0x0

    .line 322
    iput-boolean v0, p0, Ll/֫ۖܿ;->ܿ:Z

    return-void
.end method

.method private ۧ(IZ)V
    .locals 2

    .line 272
    invoke-virtual {p0}, Ll/֫ۖܿ;->ܳ()V

    .line 274
    iget v0, p0, Ll/֫ۖܿ;->֫:I

    iget-object v1, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    invoke-virtual {v1, v0, p1}, Ll/᩹ۘܿ;->֫(II)V

    iget v0, p0, Ll/֫ۖܿ;->֫:I

    invoke-virtual {v1, v0}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {v1, p1}, Ll/᩹ۘܿ;->֫(I)V

    if-eqz p2, :cond_0

    .line 277
    invoke-virtual {v1}, Ll/᩹ۘܿ;->֫()V

    .line 278
    iget-object p2, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ll/᩹ۘܿ;->֫()V

    .line 280
    :cond_0
    iget-object p2, p0, Ll/֫ۖܿ;->֨:Ll/᩹ۘܿ;

    if-eqz p2, :cond_1

    invoke-virtual {p2, v1}, Ll/᩹ۘܿ;->֫(Ll/᩹ۘܿ;)V

    .line 281
    :cond_1
    iget p2, p0, Ll/֫ۖܿ;->֫:I

    invoke-virtual {v1}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object v0

    invoke-direct {p0, p2, p1, v0}, Ll/֫ۖܿ;->ܿ(IILl/᩶ۘܿ;)V

    .line 282
    iput p1, p0, Ll/֫ۖܿ;->֫:I

    .line 283
    iget p1, p0, Ll/֫ۖܿ;->ۜ:I

    invoke-virtual {v1, p1}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 284
    iget-object p2, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Ll/᩹ۘܿ;->ۧ(I)V

    :cond_2
    return-void
.end method

.method private ܿ(IILl/᩶ۘܿ;)V
    .locals 3

    if-lt p2, p1, :cond_7

    .line 292
    iget v0, p0, Ll/֫ۖܿ;->ۜ:I

    if-gt p2, v0, :cond_7

    .line 293
    iget-boolean v1, p0, Ll/֫ۖܿ;->᩵:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    sub-int v1, p2, p1

    if-eqz v1, :cond_6

    const/16 v2, 0x1000

    if-lt v1, v2, :cond_1

    goto :goto_2

    .line 299
    :cond_1
    iget-object v1, p0, Ll/֫ۖܿ;->ۢ:Ll/᩶ۘܿ;

    if-eqz v1, :cond_5

    iget v1, p0, Ll/֫ۖܿ;->ۡ:I

    if-ne v1, p1, :cond_5

    .line 300
    iget-boolean p1, p0, Ll/֫ۖܿ;->ܿ:Z

    if-nez p1, :cond_3

    .line 301
    iget-object p1, p0, Ll/֫ۖܿ;->ᩳ:Ll/᩹ۘܿ;

    if-nez p1, :cond_2

    new-instance p1, Ll/᩹ۘܿ;

    invoke-direct {p1, v0}, Ll/᩹ۘܿ;-><init>(I)V

    iput-object p1, p0, Ll/֫ۖܿ;->ᩳ:Ll/᩹ۘܿ;

    goto :goto_0

    .line 302
    :cond_2
    invoke-virtual {p1, v0}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 303
    :goto_0
    iget-object p1, p0, Ll/֫ۖܿ;->ᩳ:Ll/᩹ۘܿ;

    iget-object v0, p0, Ll/֫ۖܿ;->ۢ:Ll/᩶ۘܿ;

    invoke-virtual {p1, v0}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    const/4 p1, 0x1

    .line 304
    iput-boolean p1, p0, Ll/֫ۖܿ;->ܿ:Z

    .line 306
    :cond_3
    iget-object p1, p0, Ll/֫ۖܿ;->ᩳ:Ll/᩹ۘܿ;

    invoke-virtual {p1, p3}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    .line 307
    iput p2, p0, Ll/֫ۖܿ;->ۡ:I

    .line 308
    iget p1, p0, Ll/֫ۖܿ;->ۘ:I

    sub-int/2addr p2, p1

    if-lt p2, v2, :cond_4

    invoke-direct {p0}, Ll/֫ۖܿ;->ۜ()V

    :cond_4
    :goto_1
    return-void

    .line 310
    :cond_5
    invoke-direct {p0}, Ll/֫ۖܿ;->ۜ()V

    .line 311
    iput p1, p0, Ll/֫ۖܿ;->ۘ:I

    .line 312
    iput p2, p0, Ll/֫ۖܿ;->ۡ:I

    .line 313
    iput-object p3, p0, Ll/֫ۖܿ;->ۢ:Ll/᩶ۘܿ;

    return-void

    .line 297
    :cond_6
    :goto_2
    invoke-direct {p0}, Ll/֫ۖܿ;->ۜ()V

    .line 298
    iget-object p2, p0, Ll/֫ۖܿ;->ۧ:Ll/ۗۘܿ;

    invoke-virtual {p2, p1, p3}, Ll/ۗۘܿ;->֫(ILl/᩶ۘܿ;)V

    return-void

    .line 292
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax dependency block"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(IILl/᩶ۘܿ;)Ll/᩶ۘܿ;
    .locals 1

    .line 202
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-nez v0, :cond_3

    iget v0, p0, Ll/֫ۖܿ;->֫:I

    if-lt p1, v0, :cond_3

    if-lt p2, p1, :cond_3

    iget p1, p0, Ll/֫ۖܿ;->ۜ:I

    if-ge p2, p1, :cond_3

    .line 205
    invoke-virtual {p0}, Ll/֫ۖܿ;->ܳ()V

    .line 206
    iget-object v0, p0, Ll/֫ۖܿ;->ܽ:Ll/᩹ۘܿ;

    if-nez v0, :cond_0

    new-instance v0, Ll/᩹ۘܿ;

    invoke-direct {v0, p1}, Ll/᩹ۘܿ;-><init>(I)V

    iput-object v0, p0, Ll/֫ۖܿ;->ܽ:Ll/᩹ۘܿ;

    goto :goto_0

    .line 207
    :cond_0
    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 208
    :goto_0
    iget-object p1, p0, Ll/֫ۖܿ;->ܽ:Ll/᩹ۘܿ;

    iget-object v0, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    :cond_1
    invoke-virtual {p1, v0}, Ll/᩹ۘܿ;->֫(Ll/᩹ۘܿ;)V

    if-eqz p3, :cond_2

    .line 209
    iget-object p1, p0, Ll/֫ۖܿ;->ܽ:Ll/᩹ۘܿ;

    invoke-virtual {p1, p3}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    .line 210
    :cond_2
    iget-object p1, p0, Ll/֫ۖܿ;->ܽ:Ll/᩹ۘܿ;

    iget p3, p0, Ll/֫ۖܿ;->֫:I

    invoke-virtual {p1, p3, p2}, Ll/᩹ۘܿ;->֫(II)V

    iget p3, p0, Ll/֫ۖܿ;->֫:I

    invoke-virtual {p1, p3}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {p1, p2}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {p1}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object p1

    return-object p1

    .line 203
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax checkpoint dependency"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 4

    const/4 v0, 0x0

    .line 336
    iput-object v0, p0, Ll/֫ۖܿ;->ۧ:Ll/ۗۘܿ;

    .line 337
    iget v1, p0, Ll/֫ۖܿ;->ۜ:I

    iget-object v2, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Ll/᩹ۘܿ;->ۧ(I)V

    :cond_0
    const v2, 0x7fffffff

    .line 338
    iput v2, p0, Ll/֫ۖܿ;->ۖ:I

    const/4 v2, 0x0

    .line 339
    iput v2, p0, Ll/֫ۖܿ;->ܺ:I

    .line 340
    iget-object v3, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    invoke-virtual {v3, v1}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 341
    iget-object v3, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 342
    :cond_1
    iput-object v0, p0, Ll/֫ۖܿ;->ۢ:Ll/᩶ۘܿ;

    .line 343
    iget-object v3, p0, Ll/֫ۖܿ;->ᩳ:Ll/᩹ۘܿ;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v1}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 344
    :cond_2
    iget-object v3, p0, Ll/֫ۖܿ;->ܽ:Ll/᩹ۘܿ;

    if-eqz v3, :cond_3

    invoke-virtual {v3, v1}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 345
    :cond_3
    iput-boolean v2, p0, Ll/֫ۖܿ;->ܿ:Z

    .line 346
    iput-boolean v2, p0, Ll/֫ۖܿ;->֡:Z

    .line 347
    iput-boolean v2, p0, Ll/֫ۖܿ;->᩻:Z

    .line 348
    iput-object v0, p0, Ll/֫ۖܿ;->᩷:Ll/ܰܺܿ;

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 220
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/֫ۖܿ;->֫:I

    if-lt p1, v0, :cond_1

    iget v1, p0, Ll/֫ۖܿ;->ۜ:I

    if-ge p1, v1, :cond_1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    .line 224
    invoke-direct {p0, p1, v0}, Ll/֫ۖܿ;->ۧ(IZ)V

    :cond_0
    const/4 p1, 0x1

    .line 225
    iput-boolean p1, p0, Ll/֫ۖܿ;->֡:Z

    return-void

    .line 221
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid syntax convergence entry"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IZ)V
    .locals 2

    if-nez p2, :cond_0

    .line 187
    iget v0, p0, Ll/֫ۖܿ;->֫:I

    sub-int v0, p1, v0

    const/16 v1, 0x1000

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 188
    iget p1, p0, Ll/֫ۖܿ;->ۜ:I

    .line 189
    :cond_1
    invoke-direct {p0, p1, p2}, Ll/֫ۖܿ;->ۧ(IZ)V

    if-eqz p2, :cond_2

    .line 191
    invoke-direct {p0}, Ll/֫ۖܿ;->ۜ()V

    const/4 p1, 0x1

    .line 192
    iput-boolean p1, p0, Ll/֫ۖܿ;->᩻:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ܰܺܿ;)V
    .locals 2

    .line 99
    iget-boolean v0, p0, Ll/֫ۖܿ;->ۚ:Z

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 100
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "End-search proofs are disabled"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 103
    :cond_1
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_2

    iget-boolean v1, p0, Ll/֫ۖܿ;->֡:Z

    if-eqz v1, :cond_3

    :cond_2
    iget-object v1, p0, Ll/֫ۖܿ;->᩷:Ll/ܰܺܿ;

    if-ne p1, v1, :cond_6

    :cond_3
    if-nez v0, :cond_5

    .line 106
    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-eqz v0, :cond_4

    goto :goto_0

    .line 107
    :cond_4
    iget-object v0, p0, Ll/֫ۖܿ;->᩷:Ll/ܰܺܿ;

    if-eq p1, v0, :cond_5

    .line 108
    invoke-virtual {p0}, Ll/֫ۖܿ;->ܳ()V

    .line 109
    iput-object p1, p0, Ll/֫ۖܿ;->᩷:Ll/ܰܺܿ;

    :cond_5
    :goto_0
    return-void

    .line 104
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot change syntax observation sink in the current state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩶ۘܿ;)V
    .locals 2

    .line 168
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll/᩶ۘܿ;->᩻()I

    move-result v0

    iget v1, p0, Ll/֫ۖܿ;->ۜ:I

    if-ne v0, v1, :cond_1

    .line 171
    iget-object v0, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-eqz v0, :cond_0

    .line 174
    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    return-void

    .line 172
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "End-search proofs are disabled"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 169
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot commit syntax end-search dependency"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ll/۫ۘܿ;
    .locals 2

    .line 327
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩵:Z

    if-eqz v0, :cond_1

    .line 328
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Ll/֫ۖܿ;->ۧ:Ll/ۗۘܿ;

    sget-object v1, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    invoke-virtual {v0, v1}, Ll/ۗۘܿ;->֫(Ll/᩸ۘܿ;)Ll/۫ۘܿ;

    move-result-object v0

    const/4 v1, 0x0

    .line 330
    iput-object v1, p0, Ll/֫ۖܿ;->ۧ:Ll/ۗۘܿ;

    return-object v0

    .line 328
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Replay dependencies are not complete"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 327
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Replay index retention is disabled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(I)V
    .locals 2

    .line 155
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-nez v0, :cond_3

    if-ltz p1, :cond_3

    iget v0, p0, Ll/֫ۖܿ;->ۜ:I

    if-gt p1, v0, :cond_3

    .line 158
    iget-object v0, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(I)V

    .line 159
    iget-object v0, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(I)V

    .line 160
    :cond_0
    iget-object v0, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-nez v0, :cond_1

    return-void

    .line 161
    :cond_1
    iget-object v1, p0, Ll/֫ۖܿ;->᩷:Ll/ܰܺܿ;

    if-nez v1, :cond_2

    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(I)V

    return-void

    .line 162
    :cond_2
    check-cast v1, Ll/ܺۢܿ;

    invoke-virtual {v1, p1}, Ll/ܺۢܿ;->ۧ(I)V

    return-void

    .line 156
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot observe syntax input boundary"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(IILl/᩶ۘܿ;)V
    .locals 2

    .line 244
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-nez v0, :cond_3

    iget v0, p0, Ll/֫ۖܿ;->֫:I

    if-lt p1, v0, :cond_3

    if-le p2, p1, :cond_3

    iget v0, p0, Ll/֫ۖܿ;->ۜ:I

    if-gt p2, v0, :cond_3

    .line 245
    invoke-virtual {p3}, Ll/᩶ۘܿ;->᩻()I

    move-result v1

    if-ne v1, v0, :cond_3

    .line 248
    iget v0, p0, Ll/֫ۖܿ;->֫:I

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ll/֫ۖܿ;->ۧ(IZ)V

    .line 249
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ll/֫ۖܿ;->ܿ(IILl/᩶ۘܿ;)V

    .line 250
    iget-object p1, p0, Ll/֫ۖܿ;->֨:Ll/᩹ۘܿ;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    .line 251
    :cond_1
    iget-object p1, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p3}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    .line 252
    :cond_2
    iput p2, p0, Ll/֫ۖܿ;->֫:I

    return-void

    .line 246
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid confirmed syntax fragment"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/᩶ۘܿ;)V
    .locals 2

    const-string v0, "dependency"

    .line 127
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 128
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-nez v0, :cond_4

    .line 131
    invoke-virtual {p1}, Ll/᩶ۘܿ;->᩻()I

    move-result v0

    iget v1, p0, Ll/֫ۖܿ;->ۜ:I

    if-ne v0, v1, :cond_3

    .line 134
    iget-object v0, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    .line 136
    iget-object v0, p0, Ll/֫ۖܿ;->֨:Ll/᩹ۘܿ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩹ۘܿ;->ܽ()V

    .line 137
    :cond_0
    iget-object v0, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩹ۘܿ;->ܽ()V

    .line 138
    :cond_1
    iget-object v0, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    :cond_2
    return-void

    .line 132
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Checkpoint dependency length differs"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 129
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot resume a syntax checkpoint in the current state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()V
    .locals 4

    .line 375
    iget v0, p0, Ll/֫ۖܿ;->ۖ:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 377
    :cond_0
    iget v2, p0, Ll/֫ۖܿ;->ܺ:I

    .line 378
    iput v1, p0, Ll/֫ۖܿ;->ۖ:I

    const/4 v1, 0x0

    .line 379
    iput v1, p0, Ll/֫ۖܿ;->ܺ:I

    .line 380
    iget-object v1, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    invoke-virtual {v1, v0, v2}, Ll/᩹ۘܿ;->֫(II)V

    .line 381
    iget-object v1, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0, v2}, Ll/᩹ۘܿ;->֫(II)V

    .line 382
    :cond_1
    iget-object v1, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-nez v1, :cond_2

    :goto_0
    return-void

    .line 383
    :cond_2
    iget-object v3, p0, Ll/֫ۖܿ;->᩷:Ll/ܰܺܿ;

    if-nez v3, :cond_3

    invoke-virtual {v1, v0, v2}, Ll/᩹ۘܿ;->֫(II)V

    return-void

    .line 384
    :cond_3
    check-cast v3, Ll/ܺۢܿ;

    invoke-virtual {v3, v0, v2}, Ll/ܺۢܿ;->֫(II)V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 120
    iget v0, p0, Ll/֫ۖܿ;->֫:I

    return v0
.end method

.method public final ܽ(I)Ll/᩶ۘܿ;
    .locals 3

    .line 230
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/֫ۖܿ;->֫:I

    if-le p1, v0, :cond_1

    iget v0, p0, Ll/֫ۖܿ;->ۜ:I

    if-gt p1, v0, :cond_1

    .line 233
    invoke-virtual {p0}, Ll/֫ۖܿ;->ܳ()V

    .line 234
    iget v1, p0, Ll/֫ۖܿ;->֫:I

    iget-object v2, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    invoke-virtual {v2, v1, p1}, Ll/᩹ۘܿ;->֫(II)V

    iget v1, p0, Ll/֫ۖܿ;->֫:I

    .line 235
    invoke-virtual {v2, v1}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {v2, p1}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {v2}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object v1

    .line 236
    invoke-virtual {v2, v0}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 237
    iget-object v2, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 238
    :cond_0
    iput p1, p0, Ll/֫ۖܿ;->֫:I

    return-object v1

    .line 231
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid speculative dependency range"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(IILl/᩶ۘܿ;)V
    .locals 1

    .line 179
    iget v0, p0, Ll/֫ۖܿ;->֫:I

    if-ge p1, v0, :cond_0

    if-gt p2, v0, :cond_0

    .line 182
    invoke-direct {p0, p1, p2, p3}, Ll/֫ۖܿ;->ܿ(IILl/᩶ۘܿ;)V

    return-void

    .line 180
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Reused dependency crosses replay entry"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(Ll/᩶ۘܿ;)V
    .locals 2

    .line 69
    iget-object v0, p0, Ll/֫ۖܿ;->֨:Ll/᩹ۘܿ;

    if-eqz v0, :cond_2

    iget v1, p0, Ll/֫ۖܿ;->֫:I

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 70
    invoke-virtual {v0}, Ll/᩹ۘܿ;->ܽ()V

    return-void

    .line 71
    :cond_1
    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(Ll/᩶ۘܿ;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ܿ(I)Ll/᩶ۘܿ;
    .locals 2

    .line 76
    iget-object v0, p0, Ll/֫ۖܿ;->֨:Ll/᩹ۘܿ;

    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {p0}, Ll/֫ۖܿ;->ܳ()V

    .line 78
    iget-object v1, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    invoke-virtual {v0, v1}, Ll/᩹ۘܿ;->֫(Ll/᩹ۘܿ;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/᩹ۘܿ;->֫(II)V

    invoke-virtual {v0, v1}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {v0, p1}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {v0}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object p1

    return-object p1

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not a window recorder"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ()V
    .locals 2

    .line 265
    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_0

    .line 266
    invoke-direct {p0}, Ll/֫ۖܿ;->ۜ()V

    const/4 v0, 0x1

    .line 267
    iput-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    return-void

    .line 265
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Syntax suffix is not being reused"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ(I)Ll/᩶ۘܿ;
    .locals 3

    .line 87
    invoke-virtual {p0}, Ll/֫ۖܿ;->ܳ()V

    .line 88
    iget v0, p0, Ll/֫ۖܿ;->ܶ:I

    iget-object v1, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    invoke-virtual {v1, v0, p1}, Ll/᩹ۘܿ;->֫(II)V

    iget v0, p0, Ll/֫ۖܿ;->ܶ:I

    .line 89
    invoke-virtual {v1, v0}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {v1, p1}, Ll/᩹ۘܿ;->֫(I)V

    invoke-virtual {v1}, Ll/᩹ۘܿ;->ۧ()Ll/᩶ۘܿ;

    move-result-object v0

    .line 90
    iget v2, p0, Ll/֫ۖܿ;->ۜ:I

    invoke-virtual {v1, v2}, Ll/᩹ۘܿ;->ۧ(I)V

    .line 91
    iput p1, p0, Ll/֫ۖܿ;->ܶ:I

    return-object v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 143
    iget-boolean v0, p0, Ll/֫ۖܿ;->᩻:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-nez v0, :cond_3

    .line 146
    iget-object v0, p0, Ll/֫ۖܿ;->ܳ:Ll/᩹ۘܿ;

    invoke-virtual {v0}, Ll/᩹ۘܿ;->֫()V

    .line 147
    iget-object v0, p0, Ll/֫ۖܿ;->۠:Ll/᩹ۘܿ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩹ۘܿ;->֫()V

    .line 148
    :cond_0
    iget-object v0, p0, Ll/֫ۖܿ;->ᩴ:Ll/᩹ۘܿ;

    if-nez v0, :cond_1

    return-void

    .line 149
    :cond_1
    iget-object v1, p0, Ll/֫ۖܿ;->᩷:Ll/ܰܺܿ;

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ll/᩹ۘܿ;->֫()V

    return-void

    .line 150
    :cond_2
    check-cast v1, Ll/ܺۢܿ;

    invoke-virtual {v1}, Ll/ܺۢܿ;->֫()V

    return-void

    .line 144
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot observe EOF in the current replay state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ(IILl/᩶ۘܿ;)V
    .locals 1

    .line 257
    iget-boolean v0, p0, Ll/֫ۖܿ;->֡:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/֫ۖܿ;->֫:I

    if-lt p1, v0, :cond_0

    .line 260
    invoke-direct {p0, p1, p2, p3}, Ll/֫ۖܿ;->ܿ(IILl/᩶ۘܿ;)V

    return-void

    .line 258
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Reused dependency precedes convergence entry"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩻()I
    .locals 1

    .line 83
    iget v0, p0, Ll/֫ۖܿ;->ܶ:I

    return v0
.end method
