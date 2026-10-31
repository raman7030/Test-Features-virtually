.class public final Ll/ۡۨۚ;
.super Ljava/lang/Object;
.source "C7DS"


# instance fields
.field public ֫:Ll/ۜۨۚ;

.field public final ۜ:Ll/ۗۛۚ;

.field public final ۢ:Ll/ܺۤۚ;

.field public ۧ:Ljava/lang/Object;

.field public ܳ:Ll/ܶ᩺ۚ;

.field public final ܽ:Ll/ۘۨۚ;

.field public ܿ:Ll/ۡۨۚ;

.field public final ᩳ:Ll/ܺۤۚ;

.field public ᩷:J

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۨۨۚ;Ll/ۘۨۚ;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Ll/ۡۨۚ;->ܿ:Ll/ۡۨۚ;

    .line 52
    iput-object p2, p0, Ll/ۡۨۚ;->ܽ:Ll/ۘۨۚ;

    .line 111
    iget-object p2, p1, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    .line 53
    iput-object p2, p0, Ll/ۡۨۚ;->ۜ:Ll/ۗۛۚ;

    .line 55
    iget-object p2, p1, Ll/ۨۨۚ;->֡:Ll/ܺۤۚ;

    iput-object p2, p0, Ll/ۡۨۚ;->ᩳ:Ll/ܺۤۚ;

    .line 56
    iget-object p1, p1, Ll/ۨۨۚ;->۠:Ll/ܺۤۚ;

    iput-object p1, p0, Ll/ۡۨۚ;->ۢ:Ll/ܺۤۚ;

    return-void
.end method

.method private ֫()Ljava/lang/String;
    .locals 4

    .line 229
    iget-object v0, p0, Ll/ۡۨۚ;->ᩳ:Ll/ܺۤۚ;

    iget-object v1, v0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iget-object v1, v1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 0
    :goto_0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 230
    iget-object v1, p0, Ll/ۡۨۚ;->ۢ:Ll/ܺۤۚ;

    iget-object v2, v1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iget-object v2, v2, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, ":#"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫(IJLl/ܶ᩺ۚ;Ll/ۜۨۚ;Ljava/lang/Object;)V
    .locals 0

    .line 60
    iput p1, p0, Ll/ۡۨۚ;->᩻:I

    .line 61
    iput-wide p2, p0, Ll/ۡۨۚ;->᩷:J

    .line 62
    iput-object p4, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    .line 63
    iput-object p5, p0, Ll/ۡۨۚ;->֫:Ll/ۜۨۚ;

    .line 64
    iput-object p6, p0, Ll/ۡۨۚ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 14

    .line 93
    iget-object v0, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v0}, Ll/ܶ᩺ۚ;->ۢ()Ll/᩸᩺ۚ;

    move-result-object v0

    .line 94
    iget-object v1, p0, Ll/ۡۨۚ;->֫:Ll/ۜۨۚ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    .line 69
    iget-object v6, p0, Ll/ۡۨۚ;->ܽ:Ll/ۘۨۚ;

    if-eqz v1, :cond_3

    instance-of v7, v1, Ll/ܺۤۚ;

    if-eqz v7, :cond_3

    .line 70
    move-object v7, v1

    check-cast v7, Ll/ܺۤۚ;

    .line 71
    iget-object v8, v7, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    const-string v9, "{0} has the wrong index #{1} into the Constant Pool"

    const-wide/16 v10, 0x1

    if-eqz v8, :cond_2

    iget v8, v1, Ll/ۜۨۚ;->᩸:I

    if-nez v8, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v1}, Ll/ۜۨۚ;->֫()Z

    move-result v8

    if-nez v8, :cond_3

    .line 80
    iget-object v8, p0, Ll/ۡۨۚ;->ۜ:Ll/ۗۛۚ;

    invoke-virtual {v8, v7}, Ll/ۗۛۚ;->֫(Ll/ܺۤۚ;)Ll/ܽ۫ᩴ;

    move-result-object v7

    .line 81
    invoke-virtual {v7}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 82
    invoke-virtual {v7}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۨۚ;

    goto :goto_1

    .line 84
    :cond_1
    iget-wide v7, p0, Ll/ۡۨۚ;->᩷:J

    iget p1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    int-to-long v12, p1

    sub-long/2addr v7, v12

    sub-long/2addr v7, v10

    iget-object p1, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    .line 85
    invoke-virtual {p1}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    iget v0, v1, Ll/ۜۨۚ;->᩸:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object v0, v1, v5

    .line 84
    invoke-virtual {v6, v7, v8, v9, v1}, Ll/ۘۨۚ;->ܽ(JLjava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 75
    :cond_2
    :goto_0
    iget-wide v7, p0, Ll/ۡۨۚ;->᩷:J

    iget v12, v1, Ll/ۜۨۚ;->᩸:I

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    int-to-long v12, v12

    sub-long/2addr v7, v12

    sub-long/2addr v7, v10

    iget-object v10, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    .line 76
    invoke-virtual {v10}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object v10

    iget v11, v1, Ll/ۜۨۚ;->᩸:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    new-array v12, v4, [Ljava/lang/Object;

    aput-object v10, v12, v3

    aput-object v11, v12, v5

    .line 75
    invoke-virtual {v6, v7, v8, v9, v12}, Ll/ۘۨۚ;->ۧ(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :cond_3
    :goto_1
    iput-object v1, p0, Ll/ۡۨۚ;->֫:Ll/ۜۨۚ;

    .line 95
    sget-object v1, Ll/ۢۨۚ;->ۧ:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x4

    const/4 v7, 0x3

    const/16 v8, 0xff

    if-eq v0, v5, :cond_7

    if-eq v0, v4, :cond_6

    if-eq v0, v7, :cond_5

    if-ne v0, v1, :cond_4

    goto :goto_2

    .line 220
    :cond_4
    iget-object p1, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {p1}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    new-array v0, v5, [Ljava/lang/Object;

    aput-object p1, v0, v3

    const-string p1, "{0} has an unknown type"

    invoke-virtual {v6, p1, v0}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 216
    :cond_5
    :goto_2
    iget-object v0, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v0}, Ll/ܶ᩺ۚ;->ۡ()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    shr-int/lit8 v0, v0, 0x8

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 217
    iget-object v0, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v0}, Ll/ܶ᩺ۚ;->ۡ()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/2addr v0, v8

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    return-void

    .line 207
    :cond_6
    sget-object v0, Ll/ܶ᩺ۚ;->᩹ۡ:Ll/ܶ᩺ۚ;

    invoke-virtual {v0}, Ll/ܶ᩺ۚ;->ۡ()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 208
    iget-object v0, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v0}, Ll/ܶ᩺ۚ;->ۡ()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/2addr v0, v8

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 209
    iget-object v0, p0, Ll/ۡۨۚ;->֫:Ll/ۜۨۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 210
    iget-object v0, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    sget-object v1, Ll/ܶ᩺ۚ;->ۛᩳ:Ll/ܶ᩺ۚ;

    if-ne v0, v1, :cond_17

    .line 211
    iget-object v0, p0, Ll/ۡۨۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۨۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void

    .line 97
    :cond_7
    iget-object v0, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    sget-object v9, Ll/ܶ᩺ۚ;->֡֫:Ll/ܶ᩺ۚ;

    if-ne v0, v9, :cond_8

    .line 98
    iget-object v0, p0, Ll/ۡۨۚ;->֫:Ll/ۜۨۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    return-void

    .line 101
    :cond_8
    invoke-virtual {v0}, Ll/ܶ᩺ۚ;->ۡ()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 102
    iget-object v0, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v0}, Ll/ܶ᩺ۚ;->᩻()I

    move-result v0

    if-ne v0, v5, :cond_9

    goto/16 :goto_8

    .line 107
    :cond_9
    sget-object v9, Ll/ۢۨۚ;->֫:[I

    iget-object v10, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v9, v10

    if-eq v10, v5, :cond_15

    if-eq v10, v4, :cond_13

    .line 118
    :try_start_0
    iget-object v10, p0, Ll/ۡۨۚ;->֫:Ll/ۜۨۚ;

    iget v10, v10, Ll/ۜۨۚ;->᩸:I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    iget-object v11, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v9, v9, v11

    packed-switch v9, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    and-int/lit16 v9, v10, -0x100

    if-nez v9, :cond_a

    goto :goto_3

    .line 157
    :cond_a
    iget-object p1, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {p1}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object v0, v1, v5

    const-string p1, "Too long argument of {0}: {1}"

    invoke-virtual {v6, p1, v1}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :pswitch_1
    shl-int/lit8 v10, v10, 0x10

    goto :goto_3

    :pswitch_2
    shl-int/lit8 v9, v10, 0x8

    .line 150
    iget-object v10, p0, Ll/ۡۨۚ;->ۧ:Ljava/lang/Object;

    check-cast v10, Ll/ۜۨۚ;

    iget v10, v10, Ll/ۜۨۚ;->᩸:I

    and-int/2addr v10, v8

    or-int/2addr v9, v10

    shl-int/lit8 v10, v9, 0x8

    goto :goto_3

    :pswitch_3
    shl-int/lit8 v9, v10, 0x8

    .line 147
    iget-object v10, p0, Ll/ۡۨۚ;->ۧ:Ljava/lang/Object;

    check-cast v10, Ll/ۜۨۚ;

    iget v10, v10, Ll/ۜۨۚ;->᩸:I

    and-int/2addr v10, v8

    or-int/2addr v10, v9

    goto :goto_3

    .line 144
    :pswitch_4
    iget v9, p0, Ll/ۡۨۚ;->᩻:I

    sub-int/2addr v10, v9

    :goto_3
    if-eq v0, v5, :cond_17

    const-string v9, "{0} - The argument {2} of the \'\'{1}\'\' instruction is written. It is larger than allowed {3}"

    if-eq v0, v4, :cond_11

    const-string v8, "signed 16-bit value "

    const/16 v11, 0x7fff

    if-eq v0, v7, :cond_f

    if-eq v0, v1, :cond_d

    const/4 v8, 0x5

    if-ne v0, v8, :cond_c

    const v0, 0x7fffffff

    if-le v10, v0, :cond_b

    .line 196
    invoke-direct {p0}, Ll/ۡۨۚ;->֫()Ljava/lang/String;

    move-result-object v2

    iget-object v8, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v8}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object v8

    .line 197
    invoke-static {v10}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "signed 32-bit value "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    invoke-static {v0}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v2, v1, v3

    aput-object v8, v1, v5

    aput-object v11, v1, v4

    aput-object v0, v1, v7

    .line 195
    invoke-virtual {v6, v9, v1}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :cond_b
    invoke-virtual {p1, v10}, Ll/ۛ۫ۚ;->ۧ(I)V

    return-void

    .line 203
    :cond_c
    iget-object p1, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {p1}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object v0, v1, v5

    const-string p1, "{0} has wrong length {1}"

    invoke-virtual {v6, p1, v1}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_d
    if-le v10, v11, :cond_e

    .line 185
    invoke-direct {p0}, Ll/ۡۨۚ;->֫()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v2}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 186
    invoke-static {v10}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    invoke-static {v11}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v3

    aput-object v2, v1, v5

    aput-object v12, v1, v4

    aput-object v8, v1, v7

    .line 184
    invoke-virtual {v6, v9, v1}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    :cond_e
    invoke-virtual {p1, v10}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 190
    iget-object v0, p0, Ll/ۡۨۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۨۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    .line 191
    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    return-void

    :cond_f
    if-le v10, v11, :cond_10

    .line 176
    invoke-direct {p0}, Ll/ۡۨۚ;->֫()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v2}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 177
    invoke-static {v10}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    invoke-static {v11}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v3

    aput-object v2, v1, v5

    aput-object v12, v1, v4

    aput-object v8, v1, v7

    .line 175
    invoke-virtual {v6, v9, v1}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    :cond_10
    invoke-virtual {p1, v10}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void

    :cond_11
    if-le v10, v8, :cond_12

    .line 167
    invoke-direct {p0}, Ll/ۡۨۚ;->֫()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {v2}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 168
    invoke-static {v10}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v8

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v3

    aput-object v2, v1, v5

    aput-object v8, v1, v4

    const-string v0, "unsigned 8-bit value 0xFF"

    aput-object v0, v1, v7

    .line 166
    invoke-virtual {v6, v9, v1}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    :cond_12
    invoke-virtual {p1, v10}, Ll/ۛ۫ۚ;->֫(I)V

    return-void

    .line 120
    :catch_0
    iget-object p1, p0, Ll/ۡۨۚ;->ܳ:Ll/ܶ᩺ۚ;

    invoke-virtual {p1}, Ll/ܶ᩺ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    new-array v0, v5, [Ljava/lang/Object;

    aput-object p1, v0, v3

    const-string p1, "Null arg for {0}"

    invoke-virtual {v6, p1, v0}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 112
    :cond_13
    iget-object v0, p0, Ll/ۡۨۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۚ۟ۚ;

    .line 110
    iget-object v1, v0, Ll/ۚ۟ۚ;->ۧ:Ll/ۘۨۚ;

    new-instance v2, Ll/֡۟ۚ;

    invoke-direct {v2, v0}, Ll/֡۟ۚ;-><init>(Ll/ۚ۟ۚ;)V

    invoke-virtual {v1, v2}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    const/4 v1, 0x0

    .line 112
    :goto_4
    iget v2, v0, Ll/ۚ۟ۚ;->᩻:I

    if-ge v1, v2, :cond_14

    .line 113
    invoke-virtual {p1, v3}, Ll/ۛ۫ۚ;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 115
    :cond_14
    iget-object v1, v0, Ll/ۚ۟ۚ;->֫:Ll/ۜۨۚ;

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    iget v2, v0, Ll/ۚ۟ۚ;->ۜ:I

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ۧ(I)V

    .line 116
    iget-object v1, v0, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ۧ(I)V

    .line 117
    :goto_5
    iget-object v1, v0, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v3, v1, :cond_17

    .line 118
    iget-object v1, v0, Ll/ۚ۟ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ۧ(I)V

    .line 119
    iget-object v1, v0, Ll/ۚ۟ۚ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۨۚ;

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    iget v2, v0, Ll/ۚ۟ۚ;->ۜ:I

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ۧ(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 109
    :cond_15
    iget-object v0, p0, Ll/ۡۨۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۚ۟ۚ;

    const/4 v1, 0x0

    .line 165
    :goto_6
    iget v2, v0, Ll/ۚ۟ۚ;->᩻:I

    if-ge v1, v2, :cond_16

    .line 166
    invoke-virtual {p1, v3}, Ll/ۛ۫ۚ;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 168
    :cond_16
    iget-object v1, v0, Ll/ۚ۟ۚ;->֫:Ll/ۜۨۚ;

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    iget v2, v0, Ll/ۚ۟ۚ;->ۜ:I

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ۧ(I)V

    .line 169
    iget v1, v0, Ll/ۚ۟ۚ;->ܳ:I

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ۧ(I)V

    .line 170
    iget v1, v0, Ll/ۚ۟ۚ;->ܽ:I

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ۧ(I)V

    .line 171
    :goto_7
    iget-object v1, v0, Ll/ۚ۟ۚ;->᩷:[Ll/ۜۨۚ;

    array-length v2, v1

    if-ge v3, v2, :cond_17

    .line 172
    aget-object v1, v1, v3

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    iget v2, v0, Ll/ۚ۟ۚ;->ۜ:I

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ۧ(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_17
    :goto_8
    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
