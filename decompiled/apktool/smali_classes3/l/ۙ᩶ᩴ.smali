.class public final Ll/ۙ᩶ᩴ;
.super Ll/ۨ᩹ᩴ;
.source "N673"


# static fields
.field public static final d:Ll/ᩴ᩹ᩴ;

.field public static final serialVersionUID:J = -0x43cbddbf9310f03L


# instance fields
.field public final transient a:Ll/ᩴ᩹ᩴ;

.field public final transient b:Ll/ۗ᩶ᩴ;

.field public final transient c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x751

    const/4 v1, 0x1

    .line 149
    invoke-static {v0, v1, v1}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/ۙ᩶ᩴ;->d:Ll/ᩴ᩹ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩶ᩴ;ILl/ᩴ᩹ᩴ;)V
    .locals 1

    .line 364
    invoke-direct {p0}, Ll/ۨ᩹ᩴ;-><init>()V

    .line 365
    sget-object v0, Ll/ۙ᩶ᩴ;->d:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p3, v0}, Ll/ᩴ᩹ᩴ;->c0(Ll/۬᩹ᩴ;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 368
    iput-object p1, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    .line 369
    iput p2, p0, Ll/ۙ᩶ᩴ;->c:I

    .line 370
    iput-object p3, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    return-void

    .line 366
    :cond_0
    new-instance p1, Ll/ܺ᩹ᩴ;

    const-string p2, "JapaneseDate before Meiji 6 is not supported"

    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/ᩴ᩹ᩴ;)V
    .locals 2

    .line 343
    invoke-direct {p0}, Ll/ۨ᩹ᩴ;-><init>()V

    .line 344
    sget-object v0, Ll/ۙ᩶ᩴ;->d:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p1, v0}, Ll/ᩴ᩹ᩴ;->c0(Ll/۬᩹ᩴ;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 350
    invoke-static {p1}, Ll/ۗ᩶ᩴ;->j(Ll/ᩴ᩹ᩴ;)Ll/ۗ᩶ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    .line 762
    iget v1, p1, Ll/ᩴ᩹ᩴ;->a:I

    .line 272
    iget-object v0, v0, Ll/ۗ᩶ᩴ;->b:Ll/ᩴ᩹ᩴ;

    .line 762
    iget v0, v0, Ll/ᩴ᩹ᩴ;->a:I

    sub-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    .line 352
    iput v1, p0, Ll/ۙ᩶ᩴ;->c:I

    .line 353
    iput-object p1, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    return-void

    .line 345
    :cond_0
    new-instance p1, Ll/ܺ᩹ᩴ;

    const-string v0, "JapaneseDate before Meiji 6 is not supported"

    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 774
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 791
    new-instance v0, Ll/۟᩹ᩴ;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Ll/۟᩹ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 600
    invoke-super {p0, p1}, Ll/ۨ᩹ᩴ;->B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final C(JLl/ۡۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 687
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 512
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 518
    sget-object v0, Ll/᩶᩶ᩴ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 539
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 527
    :pswitch_0
    iget-object p1, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    .line 422
    iget p1, p1, Ll/ۗ᩶ᩴ;->a:I

    int-to-long v0, p1

    return-wide v0

    .line 523
    :pswitch_1
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 523
    throw v0

    .line 525
    :pswitch_2
    iget p1, p0, Ll/ۙ᩶ᩴ;->c:I

    int-to-long v0, p1

    return-wide v0

    .line 534
    :pswitch_3
    iget p1, p0, Ll/ۙ᩶ᩴ;->c:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 535
    iget-object p1, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p1}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result p1

    iget-object v1, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    .line 272
    iget-object v1, v1, Ll/ۗ᩶ᩴ;->b:Ll/ᩴ᩹ᩴ;

    .line 535
    invoke-virtual {v1}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result v1

    sub-int/2addr p1, v1

    add-int/2addr p1, v0

    int-to-long v0, p1

    return-wide v0

    .line 537
    :cond_0
    iget-object p1, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p1}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    .line 541
    :cond_1
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final H()J
    .locals 2

    .line 728
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v0

    return-wide v0
.end method

.method public final I(Ll/۟ۙᩴ;)Ll/ܰ᩹ᩴ;
    .locals 1

    .line 174
    new-instance v0, Ll/ܽ᩶ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܽ᩶ᩴ;-><init>(Ll/۬᩹ᩴ;Ll/۟ۙᩴ;)V

    return-object v0
.end method

.method public final K()Ll/ۘ᩶ᩴ;
    .locals 1

    .line 396
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    return-object v0
.end method

.method public final N(Ll/۫ۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 610
    invoke-super {p0, p1}, Ll/ۨ᩹ᩴ;->N(Ll/۫ۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final Q()I
    .locals 4

    .line 420
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    invoke-virtual {v0}, Ll/ۗ᩶ᩴ;->k()Ll/ۗ᩶ᩴ;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, v0, Ll/ۗ᩶ᩴ;->b:Ll/ᩴ᩹ᩴ;

    .line 762
    iget v2, v0, Ll/ᩴ᩹ᩴ;->a:I

    .line 421
    iget-object v3, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 762
    iget v3, v3, Ll/ᩴ᩹ᩴ;->a:I

    if-ne v2, v3, :cond_0

    .line 422
    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result v0

    sub-int/2addr v0, v1

    goto :goto_0

    .line 424
    :cond_0
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->Q()I

    move-result v0

    .line 426
    :goto_0
    iget v2, p0, Ll/ۙ᩶ᩴ;->c:I

    if-ne v2, v1, :cond_1

    .line 427
    iget-object v2, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    .line 272
    iget-object v2, v2, Ll/ۗ᩶ᩴ;->b:Ll/ᩴ᩹ᩴ;

    .line 427
    invoke-virtual {v2}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result v2

    sub-int/2addr v2, v1

    sub-int/2addr v0, v2

    :cond_1
    return v0
.end method

.method public final X(J)Ll/۬᩹ᩴ;
    .locals 1

    .line 677
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙ᩶ᩴ;->d0(Ll/ᩴ᩹ᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final Y(J)Ll/۬᩹ᩴ;
    .locals 1

    .line 667
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴ᩹ᩴ;->m0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙ᩶ᩴ;->d0(Ll/ᩴ᩹ᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final Z(J)Ll/۬᩹ᩴ;
    .locals 1

    .line 662
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴ᩹ᩴ;->o0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙ᩶ᩴ;->d0(Ll/ᩴ᩹ᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final a()Ll/ۖ᩶ᩴ;
    .locals 1

    .line 384
    sget-object v0, Ll/᩹᩶ᩴ;->c:Ll/᩹᩶ᩴ;

    return-object v0
.end method

.method public final a0(JLl/ۡۗᩴ;)Ll/ۙ᩶ᩴ;
    .locals 0

    .line 682
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final b0(JLl/ۤۗᩴ;)Ll/ۙ᩶ᩴ;
    .locals 7

    .line 566
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_5

    .line 567
    move-object v0, p3

    check-cast v0, Ll/ᩴۗᩴ;

    .line 568
    invoke-virtual {p0, v0}, Ll/ۙ᩶ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v1

    cmp-long v3, v1, p1

    if-nez v3, :cond_0

    return-object p0

    .line 571
    :cond_0
    sget-object v1, Ll/᩶᩶ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    const/16 v3, 0x9

    const/16 v4, 0x8

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 384
    :cond_1
    sget-object v2, Ll/᩹᩶ᩴ;->c:Ll/᩹᩶ᩴ;

    .line 575
    invoke-virtual {v2, v0}, Ll/᩹᩶ᩴ;->v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v6

    invoke-virtual {v6, p1, p2, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v6

    .line 576
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_4

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_2

    .line 588
    :goto_0
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->q0(JLl/ۤۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙ᩶ᩴ;->d0(Ll/ᩴ᩹ᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 580
    :cond_2
    iget-object p1, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p1, v6}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙ᩶ᩴ;->d0(Ll/ᩴ᩹ᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 582
    :cond_3
    invoke-static {v6}, Ll/ۗ᩶ᩴ;->o(I)Ll/ۗ᩶ᩴ;

    move-result-object p1

    iget p2, p0, Ll/ۙ᩶ᩴ;->c:I

    .line 638
    invoke-virtual {v2, p1, p2}, Ll/᩹᩶ᩴ;->z(Ll/ۘ᩶ᩴ;I)I

    move-result p1

    .line 639
    iget-object p2, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p2, p1}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙ᩶ᩴ;->d0(Ll/ᩴ᩹ᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 396
    :cond_4
    iget-object p1, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    .line 638
    invoke-virtual {v2, p1, v6}, Ll/᩹᩶ᩴ;->z(Ll/ۘ᩶ᩴ;I)I

    move-result p1

    .line 639
    iget-object p2, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p2, p1}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙ᩶ᩴ;->d0(Ll/ᩴ᩹ᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 590
    :cond_5
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 124
    invoke-virtual {p0, p1, p2, p3}, Ll/ۙ᩶ᩴ;->b0(JLl/ۤۗᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 124
    invoke-virtual {p0, p1, p2, p3}, Ll/ۙ᩶ᩴ;->b0(JLl/ۤۗᩴ;)Ll/ۙ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Ll/ۡ֨ᩴ;)Ll/ۙ᩶ᩴ;
    .locals 0

    .line 600
    invoke-super {p0, p1}, Ll/ۨ᩹ᩴ;->B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 682
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 682
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final d0(Ll/ᩴ᩹ᩴ;)Ll/ۙ᩶ᩴ;
    .locals 1

    .line 711
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p1, v0}, Ll/ᩴ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ll/ۙ᩶ᩴ;

    invoke-direct {v0, p1}, Ll/ۙ᩶ᩴ;-><init>(Ll/ᩴ᩹ᩴ;)V

    return-object v0
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 465
    sget-object v0, Ll/ᩴۗᩴ;->ALIGNED_DAY_OF_WEEK_IN_MONTH:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ᩴۗᩴ;->ALIGNED_DAY_OF_WEEK_IN_YEAR:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ᩴۗᩴ;->ALIGNED_WEEK_OF_MONTH:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ᩴۗᩴ;->ALIGNED_WEEK_OF_YEAR:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 474
    :cond_0
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 475
    check-cast p1, Ll/ᩴۗᩴ;

    invoke-virtual {p1}, Ll/ᩴۗᩴ;->isDateBased()Z

    move-result p1

    return p1

    :cond_1
    if-eqz p1, :cond_2

    .line 477
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 749
    :cond_0
    instance-of v0, p1, Ll/ۙ᩶ᩴ;

    if-eqz v0, :cond_1

    .line 750
    check-cast p1, Ll/ۙ᩶ᩴ;

    .line 751
    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    iget-object p1, p1, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 384
    sget-object v0, Ll/᩹᩶ᩴ;->c:Ll/᩹᩶ᩴ;

    .line 763
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->hashCode()I

    move-result v0

    const v1, -0x29035c2f

    xor-int/2addr v0, v1

    return v0
.end method

.method public final m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 600
    invoke-super {p0, p1}, Ll/ۨ᩹ᩴ;->B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 5

    .line 482
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_5

    .line 483
    invoke-virtual {p0, p1}, Ll/ۙ᩶ᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 484
    check-cast p1, Ll/ᩴۗᩴ;

    .line 485
    sget-object v0, Ll/᩶᩶ᩴ;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    if-eq v0, v1, :cond_3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    const/4 v4, 0x3

    if-eq v0, v4, :cond_0

    .line 384
    sget-object v0, Ll/᩹᩶ᩴ;->c:Ll/᩹᩶ᩴ;

    .line 503
    invoke-virtual {v0, p1}, Ll/᩹᩶ᩴ;->v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 494
    :cond_0
    iget-object p1, p0, Ll/ۙ᩶ᩴ;->b:Ll/ۗ᩶ᩴ;

    .line 272
    iget-object v0, p1, Ll/ۗ᩶ᩴ;->b:Ll/ᩴ᩹ᩴ;

    .line 762
    iget v0, v0, Ll/ᩴ᩹ᩴ;->a:I

    .line 495
    invoke-virtual {p1}, Ll/ۗ᩶ᩴ;->k()Ll/ۗ᩶ᩴ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 272
    iget-object p1, p1, Ll/ۗ᩶ᩴ;->b:Ll/ᩴ᩹ᩴ;

    .line 762
    iget p1, p1, Ll/ᩴ᩹ᩴ;->a:I

    sub-int/2addr p1, v0

    add-int/2addr p1, v1

    int-to-long v0, p1

    .line 497
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    :cond_1
    const p1, 0x3b9ac9ff

    sub-int/2addr p1, v0

    int-to-long v0, p1

    .line 500
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 487
    :cond_2
    invoke-virtual {p0}, Ll/ۙ᩶ᩴ;->Q()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 409
    :cond_3
    iget-object p1, p0, Ll/ۙ᩶ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p1}, Ll/ᩴ᩹ᩴ;->d0()I

    move-result p1

    int-to-long v0, p1

    .line 486
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 505
    :cond_4
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 505
    throw v0

    .line 507
    :cond_5
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 687
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶ᩴ;

    return-object p1
.end method
