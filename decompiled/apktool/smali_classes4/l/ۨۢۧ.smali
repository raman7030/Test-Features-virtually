.class public final Ll/ۨۢۧ;
.super Ljava/lang/Object;
.source "C8GX"

# interfaces
.implements Ll/᩶ۢۧ;


# instance fields
.field public final ֫:Ll/ܳ۬ܺ;

.field public final ۧ:I


# direct methods
.method public constructor <init>(ILl/ܳ۬ܺ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput p1, p0, Ll/ۨۢۧ;->ۧ:I

    .line 59
    iput-object p2, p0, Ll/ۨۢۧ;->֫:Ll/ܳ۬ܺ;

    return-void
.end method

.method public static ֫(ILl/ᩳ֨֫;)Ll/ۨۢۧ;
    .locals 13

    .line 27
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    .line 28
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    const/4 v2, -0x2

    .line 30
    :goto_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    const/16 v4, 0x8

    if-le v3, v4, :cond_f

    .line 31
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    .line 32
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v4

    .line 33
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v5

    add-int/2addr v5, v4

    .line 34
    invoke-virtual {p1, v5}, Ll/ᩳ֨֫;->ᩳ(I)V

    const v4, 0x5453494c

    if-ne v3, v4, :cond_0

    .line 37
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    .line 38
    invoke-static {v3, p1}, Ll/ۨۢۧ;->֫(ILl/ᩳ֨֫;)Ll/ۨۢۧ;

    move-result-object v3

    goto/16 :goto_5

    :cond_0
    const/4 v4, 0x0

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_4

    .line 89
    :sswitch_0
    invoke-static {p1}, Ll/ܰۢۧ;->֫(Ll/ᩳ֨֫;)Ll/ܰۢۧ;

    move-result-object v3

    goto/16 :goto_5

    .line 85
    :sswitch_1
    invoke-static {p1}, Ll/ۤۢۧ;->֫(Ll/ᩳ֨֫;)Ll/ۤۢۧ;

    move-result-object v3

    goto/16 :goto_5

    .line 83
    :sswitch_2
    invoke-static {p1}, Ll/۫ۢۧ;->֫(Ll/ᩳ֨֫;)Ll/۫ۢۧ;

    move-result-object v3

    goto/16 :goto_5

    :sswitch_3
    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    const/4 v3, 0x4

    .line 58
    invoke-virtual {p1, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 59
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v6

    .line 60
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v7

    .line 61
    invoke-virtual {p1, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 62
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    sparse-switch v3, :sswitch_data_1

    move-object v8, v4

    goto :goto_1

    :sswitch_4
    const-string v8, "video/mjpeg"

    goto :goto_1

    :sswitch_5
    const-string v8, "video/mp43"

    goto :goto_1

    :sswitch_6
    const-string v8, "video/mp42"

    goto :goto_1

    :sswitch_7
    const-string v8, "video/avc"

    goto :goto_1

    :sswitch_8
    const-string v8, "video/mp4v-es"

    :goto_1
    if-nez v8, :cond_1

    const-string v6, "Ignoring track with unsupported compression "

    .line 0
    invoke-static {v3, v6}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    goto/16 :goto_4

    .line 68
    :cond_1
    new-instance v3, Ll/֨ᩴ֫;

    invoke-direct {v3}, Ll/֨ᩴ֫;-><init>()V

    .line 69
    invoke-virtual {v3, v6}, Ll/֨ᩴ֫;->ۙ(I)V

    invoke-virtual {v3, v7}, Ll/֨ᩴ֫;->ۡ(I)V

    invoke-virtual {v3, v8}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 70
    new-instance v4, Ll/᩺ۢۧ;

    invoke-virtual {v3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v3

    invoke-direct {v4, v3}, Ll/᩺ۢۧ;-><init>(Ll/۠ᩴ֫;)V

    goto/16 :goto_4

    :cond_2
    const/4 v3, 0x1

    if-ne v2, v3, :cond_c

    .line 77
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۘ()I

    move-result v6

    const-string v7, "audio/raw"

    const-string v8, "audio/mp4a-latm"

    if-eq v6, v3, :cond_7

    const/16 v3, 0x55

    if-eq v6, v3, :cond_6

    const/16 v3, 0xff

    if-eq v6, v3, :cond_5

    const/16 v3, 0x2000

    if-eq v6, v3, :cond_4

    const/16 v3, 0x2001

    if-eq v6, v3, :cond_3

    move-object v3, v4

    goto :goto_2

    :cond_3
    const-string v3, "audio/vnd.dts"

    goto :goto_2

    :cond_4
    const-string v3, "audio/ac3"

    goto :goto_2

    :cond_5
    move-object v3, v8

    goto :goto_2

    :cond_6
    const-string v3, "audio/mpeg"

    goto :goto_2

    :cond_7
    move-object v3, v7

    :goto_2
    if-nez v3, :cond_8

    const-string v3, "Ignoring track with unsupported format tag "

    .line 0
    invoke-static {v6, v3}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    goto :goto_4

    .line 83
    :cond_8
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۘ()I

    move-result v4

    .line 84
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v6

    const/4 v9, 0x6

    .line 85
    invoke-virtual {p1, v9}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 86
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۘ()I

    move-result v9

    .line 87
    sget-object v10, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 2233
    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v9, v10}, Ll/ۘ֨֫;->֫(ILjava/nio/ByteOrder;)I

    move-result v9

    .line 88
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v10

    const/4 v11, 0x0

    if-lez v10, :cond_9

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۘ()I

    move-result v10

    goto :goto_3

    :cond_9
    const/4 v10, 0x0

    .line 89
    :goto_3
    new-instance v12, Ll/֨ᩴ֫;

    invoke-direct {v12}, Ll/֨ᩴ֫;-><init>()V

    .line 91
    invoke-virtual {v12, v3}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v12, v4}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 93
    invoke-virtual {v12, v6}, Ll/֨ᩴ֫;->۠(I)V

    .line 94
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    if-eqz v9, :cond_a

    .line 95
    invoke-virtual {v12, v9}, Ll/֨ᩴ֫;->᩵(I)V

    .line 97
    :cond_a
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    if-lez v10, :cond_b

    .line 98
    new-array v3, v10, [B

    .line 99
    invoke-virtual {p1, v11, v10, v3}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 100
    invoke-static {v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v3

    invoke-virtual {v12, v3}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 102
    :cond_b
    new-instance v3, Ll/᩺ۢۧ;

    invoke-virtual {v12}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v4

    invoke-direct {v3, v4}, Ll/᩺ۢۧ;-><init>(Ll/۠ᩴ֫;)V

    goto :goto_5

    .line 38
    :cond_c
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Ignoring strf box for unsupported track type: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    invoke-static {v2}, Ll/ۘ֨֫;->ܳ(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 38
    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :goto_4
    move-object v3, v4

    :goto_5
    if-eqz v3, :cond_e

    .line 43
    invoke-interface {v3}, Ll/᩶ۢۧ;->getType()I

    move-result v4

    const v6, 0x68727473

    if-ne v4, v6, :cond_d

    .line 44
    move-object v2, v3

    check-cast v2, Ll/ۤۢۧ;

    invoke-virtual {v2}, Ll/ۤۢۧ;->֫()I

    move-result v2

    .line 46
    :cond_d
    invoke-virtual {v0, v3}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 48
    :cond_e
    invoke-virtual {p1, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 49
    invoke-virtual {p1, v1}, Ll/ᩳ֨֫;->ᩳ(I)V

    goto/16 :goto_0

    .line 51
    :cond_f
    new-instance p1, Ll/ۨۢۧ;

    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Ll/ۨۢۧ;-><init>(ILl/ܳ۬ܺ;)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x66727473 -> :sswitch_3
        0x68697661 -> :sswitch_2
        0x68727473 -> :sswitch_1
        0x6e727473 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x30355844 -> :sswitch_8
        0x31435641 -> :sswitch_7
        0x31637661 -> :sswitch_7
        0x3234504d -> :sswitch_6
        0x3334504d -> :sswitch_5
        0x34363248 -> :sswitch_7
        0x34504d46 -> :sswitch_8
        0x44495633 -> :sswitch_8
        0x44495658 -> :sswitch_8
        0x47504a4d -> :sswitch_4
        0x58564944 -> :sswitch_8
        0x64697678 -> :sswitch_8
        0x67706a6d -> :sswitch_4
        0x78766964 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final getType()I
    .locals 1

    .line 64
    iget v0, p0, Ll/ۨۢۧ;->ۧ:I

    return v0
.end method

.method public final ֫(Ljava/lang/Class;)Ll/᩶ۢۧ;
    .locals 3

    .line 70
    iget-object v0, p0, Ll/ۨۢۧ;->֫:Ll/ܳ۬ܺ;

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    .line 70
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۢۧ;

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
