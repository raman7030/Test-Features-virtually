.class public final Ll/ܳۘܿ;
.super Ljava/lang/Object;
.source "470W"


# instance fields
.field public final ֫:Ll/ۨۖܿ;

.field public final ۜ:Ll/ۢۖܿ;

.field public final ۢ:J

.field public final ۧ:Ll/ᩳۢܿ;

.field public final ܳ:Ll/ܽۘܿ;

.field public final ܽ:I

.field public final ܿ:Ll/᩺ܺܿ;

.field public final ᩳ:Ll/ᩳۘܿ;

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/᩺ܺܿ;JIIILl/ۢۖܿ;Ll/ᩳۢܿ;Ll/ܽۘܿ;Ll/ۨۖܿ;Ll/ᩳۘܿ;)V
    .locals 1

    .line 467
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "program"

    .line 468
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ܳۘܿ;->ܿ:Ll/᩺ܺܿ;

    .line 469
    iput-object p7, p0, Ll/ܳۘܿ;->ۜ:Ll/ۢۖܿ;

    .line 470
    iput-object p8, p0, Ll/ܳۘܿ;->ۧ:Ll/ᩳۢܿ;

    .line 471
    iput-object p9, p0, Ll/ܳۘܿ;->ܳ:Ll/ܽۘܿ;

    .line 472
    iput-object p10, p0, Ll/ܳۘܿ;->֫:Ll/ۨۖܿ;

    .line 473
    iput-object p11, p0, Ll/ܳۘܿ;->ᩳ:Ll/ᩳۘܿ;

    if-eqz p11, :cond_1

    .line 474
    iget-object p9, p11, Ll/ᩳۘܿ;->֫:Ll/ܶۘܿ;

    invoke-virtual {p9}, Ll/ܶۘܿ;->ᩳ()I

    move-result p9

    if-ne p9, p4, :cond_0

    iget-object p9, p11, Ll/ᩳۘܿ;->ܽ:Ll/ܽۘܿ;

    .line 475
    invoke-virtual {p9}, Ll/ܽۘܿ;->֫()Ll/᩺ܺܿ;

    move-result-object p9

    if-ne p9, p1, :cond_0

    goto :goto_0

    .line 476
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window pending reuse identity differs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-ltz p4, :cond_5

    if-ltz p5, :cond_5

    if-gt p5, p6, :cond_5

    if-gt p6, p4, :cond_5

    .line 481
    invoke-virtual {p7}, Ll/ۢۖܿ;->֫()I

    move-result p7

    sub-int p9, p6, p5

    if-ne p7, p9, :cond_4

    .line 484
    invoke-virtual {p8}, Ll/ᩳۢܿ;->ۧ()I

    move-result p7

    if-ne p7, p9, :cond_3

    const/4 p7, 0x0

    .line 485
    invoke-virtual {p8, p7}, Ll/ᩳۢܿ;->ᩳ(I)Ll/ܶۜܿ;

    move-result-object p7

    iget-object p8, p1, Ll/᩺ܺܿ;->ۡ:Ll/ܶۜܿ;

    if-ne p7, p8, :cond_3

    .line 488
    invoke-virtual {p10}, Ll/ۨۖܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object p7

    if-ne p7, p1, :cond_2

    .line 489
    invoke-virtual {p10}, Ll/ۨۖܿ;->ܽ()I

    move-result p1

    if-ne p1, p4, :cond_2

    .line 492
    iput-wide p2, p0, Ll/ܳۘܿ;->ۢ:J

    .line 493
    iput p4, p0, Ll/ܳۘܿ;->᩷:I

    .line 494
    iput p5, p0, Ll/ܳۘܿ;->᩻:I

    .line 495
    iput p6, p0, Ll/ܳۘܿ;->ܽ:I

    return-void

    .line 490
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window checkpoint cache identity differs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 486
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window context differs from requested range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 482
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window style length differs from requested range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 479
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax window result range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܳۘܿ;)Ll/ۨۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۘܿ;->֫:Ll/ۨۖܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܳۘܿ;)Ll/ᩳۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۘܿ;->ᩳ:Ll/ᩳۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܳۘܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ܳۘܿ;->ۢ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ܳۘܿ;)Ll/᩺ܺܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۘܿ;->ܿ:Ll/᩺ܺܿ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܳۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܳۘܿ;->᩷:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܳۘܿ;)Ll/ܽۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۘܿ;->ܳ:Ll/ܽۘܿ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ۨۖܿ;
    .locals 1

    .line 546
    iget-object v0, p0, Ll/ܳۘܿ;->֫:Ll/ۨۖܿ;

    return-object v0
.end method

.method public final ۜ()I
    .locals 1

    .line 511
    iget v0, p0, Ll/ܳۘܿ;->᩷:I

    return v0
.end method

.method public final ۧ()Ll/ᩳۢܿ;
    .locals 1

    .line 531
    iget-object v0, p0, Ll/ܳۘܿ;->ۧ:Ll/ᩳۢܿ;

    return-object v0
.end method

.method public final ܳ()I
    .locals 1

    .line 516
    iget v0, p0, Ll/ܳۘܿ;->᩻:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 521
    iget v0, p0, Ll/ܳۘܿ;->ܽ:I

    return v0
.end method

.method public final ܿ()Ll/ܽۘܿ;
    .locals 1

    .line 551
    iget-object v0, p0, Ll/ܳۘܿ;->ܳ:Ll/ܽۘܿ;

    return-object v0
.end method

.method public final ᩳ()Ll/᩺ܺܿ;
    .locals 1

    .line 501
    iget-object v0, p0, Ll/ܳۘܿ;->ܿ:Ll/᩺ܺܿ;

    return-object v0
.end method

.method public final ᩷()J
    .locals 2

    .line 506
    iget-wide v0, p0, Ll/ܳۘܿ;->ۢ:J

    return-wide v0
.end method

.method public final ᩻()Ll/ۢۖܿ;
    .locals 1

    .line 526
    iget-object v0, p0, Ll/ܳۘܿ;->ۜ:Ll/ۢۖܿ;

    return-object v0
.end method
