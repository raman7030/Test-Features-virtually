.class public abstract Ll/ۢܰ֡;
.super Ljava/lang/Object;
.source "46A3"

# interfaces
.implements Ll/᩺֫ۚ;


# instance fields
.field public ᩶:Ll/֨ۗ֡;

.field public final ᩸:Ll/۬ۛ֡;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    .line 54
    iput-object p2, p0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    .line 55
    iput p3, p0, Ll/ۢܰ֡;->᩹:I

    return-void
.end method

.method public static ֫(Ll/۬ۛ֡;Ll/ᩴۨ֡;)Ll/ۢܰ֡;
    .locals 4

    .line 60
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܿ()I

    move-result v0

    if-nez v0, :cond_0

    .line 63
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܳ()I

    move-result v0

    .line 66
    :cond_0
    invoke-virtual {p0}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/۠ۗ֡;->֫(I)Ll/֨ۗ֡;

    move-result-object v0

    .line 68
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v1

    if-nez v0, :cond_1

    .line 76
    new-instance v0, Ll/֡ܰ֡;

    .line 43
    sget-object v2, Ll/֨ۗ֡;->ۖܳ:Ll/֨ۗ֡;

    invoke-direct {v0, p0, v2, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_1

    .line 78
    :cond_1
    sget-object v2, Ll/᩷᩺֡;->֫:[I

    iget-object v3, v0, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 152
    new-instance p0, Ll/ܶ᩵ۚ;

    iget-object p1, v0, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x0

    const-string v1, "Unexpected opcode format: %s"

    .line 46
    invoke-direct {p0, p1, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    throw p0

    .line 150
    :pswitch_0
    new-instance v0, Ll/ۜ᩺֡;

    invoke-direct {v0, p0, v1}, Ll/ۜ᩺֡;-><init>(Ll/۬ۛ֡;I)V

    goto/16 :goto_1

    .line 148
    :pswitch_1
    new-instance v0, Ll/᩵ܰ֡;

    invoke-direct {v0, p0, v1}, Ll/᩵ܰ֡;-><init>(Ll/۬ۛ֡;I)V

    goto/16 :goto_1

    .line 146
    :pswitch_2
    new-instance v0, Ll/ۖܰ֡;

    invoke-direct {v0, p0, v1}, Ll/ۖܰ֡;-><init>(Ll/۬ۛ֡;I)V

    goto/16 :goto_1

    .line 144
    :pswitch_3
    new-instance v2, Ll/᩷ܰ֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 142
    :pswitch_4
    new-instance v2, Ll/ۜܰ֡;

    invoke-direct {v2, p0, v0, v1}, Ll/ۜܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 140
    :pswitch_5
    new-instance v2, Ll/᩻ܰ֡;

    invoke-direct {v2, p0, v0, v1}, Ll/᩻ܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 138
    :pswitch_6
    new-instance v2, Ll/ܳܰ֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 136
    :pswitch_7
    new-instance v2, Ll/ܿܰ֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 134
    :pswitch_8
    new-instance v2, Ll/ᩳܰ֡;

    invoke-direct {v2, p0, v0, v1}, Ll/ᩳܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 132
    :pswitch_9
    new-instance v2, Ll/ۧܰ֡;

    .line 45
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 130
    :pswitch_a
    new-instance v2, Ll/ܽܰ֡;

    .line 45
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 128
    :pswitch_b
    invoke-virtual {p0, v1, v0}, Ll/۬ۛ֡;->ܽ(ILl/֨ۗ֡;)Ll/֫ܰ֡;

    move-result-object v0

    goto/16 :goto_1

    .line 126
    :pswitch_c
    new-instance v2, Ll/۟᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 124
    :pswitch_d
    new-instance v2, Ll/ܰ᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 122
    :pswitch_e
    new-instance v2, Ll/᩺᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 120
    :pswitch_f
    new-instance v2, Ll/ۨ᩺֡;

    invoke-direct {v2, p0, v0, v1}, Ll/ۨ᩺֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 118
    :pswitch_10
    new-instance v2, Ll/ۛ᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 116
    :pswitch_11
    new-instance v2, Ll/ۤ᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 114
    :pswitch_12
    new-instance v2, Ll/۫᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto/16 :goto_0

    .line 112
    :pswitch_13
    new-instance v2, Ll/۬᩺֡;

    .line 45
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 110
    :pswitch_14
    new-instance v2, Ll/ۗ᩺֡;

    .line 45
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 108
    :pswitch_15
    new-instance v2, Ll/ۙ᩺֡;

    .line 45
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 106
    :pswitch_16
    invoke-virtual {p0, v1, v0}, Ll/۬ۛ֡;->ۧ(ILl/֨ۗ֡;)Ll/᩶᩺֡;

    move-result-object v0

    goto :goto_1

    .line 104
    :pswitch_17
    new-instance v2, Ll/᩹᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 102
    :pswitch_18
    new-instance v2, Ll/᩸᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 100
    :pswitch_19
    new-instance v2, Ll/ܶ᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 98
    :pswitch_1a
    new-instance v2, Ll/۠᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 96
    :pswitch_1b
    new-instance v2, Ll/֨᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 94
    :pswitch_1c
    new-instance v2, Ll/ۚ᩺֡;

    invoke-direct {v2, p0, v0, v1}, Ll/ۚ᩺֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 92
    :pswitch_1d
    new-instance v2, Ll/֡᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 90
    :pswitch_1e
    new-instance v2, Ll/᩵᩺֡;

    invoke-direct {v2, p0, v0, v1}, Ll/᩵᩺֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 88
    :pswitch_1f
    new-instance v2, Ll/ۘ᩺֡;

    .line 45
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 86
    :pswitch_20
    invoke-virtual {p0, v1, v0}, Ll/۬ۛ֡;->֫(ILl/֨ۗ֡;)Ll/ۖ᩺֡;

    move-result-object v0

    goto :goto_1

    .line 84
    :pswitch_21
    new-instance v2, Ll/ܺ᩺֡;

    .line 45
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 82
    :pswitch_22
    new-instance v2, Ll/ۡ᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    goto :goto_0

    .line 80
    :pswitch_23
    new-instance v2, Ll/ۢ᩺֡;

    .line 44
    invoke-direct {v2, p0, v0, v1}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    :goto_0
    move-object v0, v2

    .line 69
    :goto_1
    invoke-interface {v0}, Ll/᩺֫ۚ;->ۚ()I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    invoke-virtual {p1, p0}, Ll/ᩴۨ֡;->֫(I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public ۚ()I
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    iget-object v0, v0, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    iget v0, v0, Ll/ۘۗ֡;->᩹:I

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ۢ()Ll/֨ۗ֡;
    .locals 1

    .line 158
    iget-object v0, p0, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    return-object v0
.end method
