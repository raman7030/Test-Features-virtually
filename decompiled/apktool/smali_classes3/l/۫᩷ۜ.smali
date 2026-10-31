.class public final Ll/۫᩷ۜ;
.super Ljava/lang/Object;
.source "1799"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    .line 577
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 578
    iput p1, p0, Ll/۫᩷ۜ;->֫:I

    .line 579
    iput p2, p0, Ll/۫᩷ۜ;->ۧ:I

    .line 580
    iput p3, p0, Ll/۫᩷ۜ;->ܽ:I

    .line 581
    iput p4, p0, Ll/۫᩷ۜ;->ܿ:I

    .line 582
    iput p5, p0, Ll/۫᩷ۜ;->ᩳ:I

    .line 583
    iput p6, p0, Ll/۫᩷ۜ;->ܳ:I

    return-void
.end method

.method public static ֫(Ll/ۢۜۜ;)Ll/۫᩷ۜ;
    .locals 12

    .line 590
    iget-object v0, p0, Ll/ۢۜۜ;->᩻:Ljava/lang/String;

    iget-object p0, p0, Ll/ۢۜۜ;->ᩳ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    const-string v1, "dex_field"

    .line 308
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v0, 0x3a

    .line 598
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_1

    move v1, v0

    goto :goto_0

    .line 599
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    :goto_0
    if-ltz v0, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 600
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_6

    :cond_3
    const-string v1, "dex_method"

    .line 301
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v0, 0x28

    .line 602
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_4

    add-int/lit8 v1, v0, 0x1

    const/16 v2, 0x29

    .line 603
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    goto :goto_1

    :cond_4
    const/4 v1, -0x1

    :goto_1
    if-ltz v0, :cond_5

    move v2, v0

    goto :goto_2

    .line 604
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    :goto_2
    if-ltz v0, :cond_6

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 605
    :cond_6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_3
    if-ltz v1, :cond_7

    move v3, v1

    goto :goto_4

    .line 606
    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    :goto_4
    if-ltz v1, :cond_8

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 607
    :cond_8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    :goto_5
    const/4 p0, 0x0

    const/4 v4, 0x0

    move v9, v0

    move v11, v1

    move v8, v2

    move v10, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    const/4 v0, 0x0

    :goto_6
    const/4 v2, 0x0

    const/4 p0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v7, v0

    move v6, v1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 609
    :goto_7
    new-instance p0, Ll/۫᩷ۜ;

    move-object v5, p0

    invoke-direct/range {v5 .. v11}, Ll/۫᩷ۜ;-><init>(IIIIII)V

    return-object p0
.end method
