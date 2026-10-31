.class public final Ll/ۗ۠;
.super Ll/ܶ۠;
.source "41JE"


# instance fields
.field public ֫ۧ:I

.field public ۟֫:I

.field public ۧۧ:F

.field public ܰ֫:I

.field public ܽۧ:Z

.field public ᩺֫:Ll/ۚ۠;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 46
    invoke-direct {p0}, Ll/ܶ۠;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    .line 37
    iput v0, p0, Ll/ۗ۠;->ۧۧ:F

    const/4 v0, -0x1

    .line 38
    iput v0, p0, Ll/ۗ۠;->۟֫:I

    .line 39
    iput v0, p0, Ll/ۗ۠;->֫ۧ:I

    .line 41
    iget-object v0, p0, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iput-object v0, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    const/4 v0, 0x0

    .line 42
    iput v0, p0, Ll/ۗ۠;->ܰ֫:I

    .line 47
    iget-object v1, p0, Ll/ܶ۠;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 48
    iget-object v1, p0, Ll/ܶ۠;->᩻:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    iget-object v1, p0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 51
    iget-object v2, p0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    iget-object v3, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֨(I)V
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {v0, p1}, Ll/ۚ۠;->֫(I)V

    const/4 p1, 0x1

    .line 195
    iput-boolean p1, p0, Ll/ۗ۠;->ܽۧ:Z

    return-void
.end method

.method public final ֫(Ll/֡۠;)Ll/ۚ۠;
    .locals 2

    .line 125
    sget-object v0, Ll/ۙ۠;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    .line 135
    :pswitch_1
    iget v0, p0, Ll/ۗ۠;->ܰ֫:I

    if-nez v0, :cond_0

    .line 136
    iget-object p1, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    return-object p1

    .line 128
    :pswitch_2
    iget v0, p0, Ll/ۗ۠;->ܰ֫:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 129
    iget-object p1, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    return-object p1

    .line 147
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ܶ۠;Ljava/util/HashMap;)V
    .locals 0

    .line 57
    invoke-super {p0, p1, p2}, Ll/ܶ۠;->֫(Ll/ܶ۠;Ljava/util/HashMap;)V

    .line 58
    check-cast p1, Ll/ۗ۠;

    .line 59
    iget p2, p1, Ll/ۗ۠;->ۧۧ:F

    iput p2, p0, Ll/ۗ۠;->ۧۧ:F

    .line 60
    iget p2, p1, Ll/ۗ۠;->۟֫:I

    iput p2, p0, Ll/ۗ۠;->۟֫:I

    .line 61
    iget p2, p1, Ll/ۗ۠;->֫ۧ:I

    iput p2, p0, Ll/ۗ۠;->֫ۧ:I

    .line 62
    iget p1, p1, Ll/ۗ۠;->ܰ֫:I

    invoke-virtual {p0, p1}, Ll/ۗ۠;->᩸(I)V

    return-void
.end method

.method public final ֫(Ll/ܿ۠;Z)V
    .locals 7

    .line 620
    iget-object p2, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 215
    check-cast p2, Ll/᩸۠;

    if-nez p2, :cond_0

    goto/16 :goto_3

    .line 219
    :cond_0
    sget-object v0, Ll/֡۠;->۫:Ll/֡۠;

    invoke-virtual {p2, v0}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v0

    .line 220
    sget-object v1, Ll/֡۠;->ۛ:Ll/֡۠;

    invoke-virtual {p2, v1}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v1

    .line 221
    iget-object v2, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v2, v2, v4

    sget-object v5, Ll/۠۠;->ۗ:Ll/۠۠;

    if-ne v2, v5, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 222
    :goto_0
    iget v5, p0, Ll/ۗ۠;->ܰ֫:I

    if-nez v5, :cond_3

    .line 223
    sget-object v0, Ll/֡۠;->ۨ:Ll/֡۠;

    invoke-virtual {p2, v0}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v0

    .line 224
    sget-object v1, Ll/֡۠;->᩶:Ll/֡۠;

    invoke-virtual {p2, v1}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v1

    .line 225
    iget-object p2, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz p2, :cond_2

    iget-object p2, p2, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object p2, p2, v3

    sget-object v2, Ll/۠۠;->ۗ:Ll/۠۠;

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    move v2, v3

    .line 227
    :cond_3
    iget-boolean p2, p0, Ll/ۗ۠;->ܽۧ:Z

    const/4 v3, -0x1

    const/4 v5, 0x5

    if-eqz p2, :cond_6

    iget-object p2, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {p2}, Ll/ۚ۠;->ۜ()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 228
    iget-object p2, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {p1, p2}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object p2

    .line 232
    iget-object v6, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {v6}, Ll/ۚ۠;->ۧ()I

    move-result v6

    invoke-virtual {p1, p2, v6}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    .line 233
    iget v6, p0, Ll/ۗ۠;->۟֫:I

    if-eq v6, v3, :cond_4

    if-eqz v2, :cond_5

    .line 235
    invoke-virtual {p1, v1}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Ll/ܿ۠;->ۧ(Ll/ܺ۠;Ll/ܺ۠;II)V

    goto :goto_2

    .line 237
    :cond_4
    iget v6, p0, Ll/ۗ۠;->֫ۧ:I

    if-eq v6, v3, :cond_5

    if-eqz v2, :cond_5

    .line 239
    invoke-virtual {p1, v1}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v1

    .line 240
    invoke-virtual {p1, v0}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Ll/ܿ۠;->ۧ(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 241
    invoke-virtual {p1, v1, p2, v4, v5}, Ll/ܿ۠;->ۧ(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 244
    :cond_5
    :goto_2
    iput-boolean v4, p0, Ll/ۗ۠;->ܽۧ:Z

    return-void

    .line 247
    :cond_6
    iget p2, p0, Ll/ۗ۠;->۟֫:I

    const/16 v6, 0x8

    if-eq p2, v3, :cond_7

    .line 248
    iget-object p2, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {p1, p2}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object p2

    .line 249
    invoke-virtual {p1, v0}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v0

    .line 250
    iget v3, p0, Ll/ۗ۠;->۟֫:I

    invoke-virtual {p1, p2, v0, v3, v6}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    if-eqz v2, :cond_9

    .line 252
    invoke-virtual {p1, v1}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, Ll/ܿ۠;->ۧ(Ll/ܺ۠;Ll/ܺ۠;II)V

    return-void

    .line 254
    :cond_7
    iget p2, p0, Ll/ۗ۠;->֫ۧ:I

    if-eq p2, v3, :cond_8

    .line 255
    iget-object p2, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {p1, p2}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object p2

    .line 256
    invoke-virtual {p1, v1}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v1

    .line 257
    iget v3, p0, Ll/ۗ۠;->֫ۧ:I

    neg-int v3, v3

    invoke-virtual {p1, p2, v1, v3, v6}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    if-eqz v2, :cond_9

    .line 259
    invoke-virtual {p1, v0}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, Ll/ܿ۠;->ۧ(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 260
    invoke-virtual {p1, v1, p2, v4, v5}, Ll/ܿ۠;->ۧ(Ll/ܺ۠;Ll/ܺ۠;II)V

    return-void

    .line 262
    :cond_8
    iget p2, p0, Ll/ۗ۠;->ۧۧ:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_9

    .line 263
    iget-object p2, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {p1, p2}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object p2

    .line 264
    invoke-virtual {p1, v1}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v1

    .line 265
    iget v2, p0, Ll/ۗ۠;->ۧۧ:F

    .line 1430
    invoke-virtual {p1}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v3

    .line 356
    iget-object v4, v3, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v4, p2, v0}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 357
    iget-object p2, v3, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p2, v1, v2}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 265
    invoke-virtual {p1, v3}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۛ()Z
    .locals 1

    .line 199
    iget-boolean v0, p0, Ll/ۗ۠;->ܽۧ:Z

    return v0
.end method

.method public final ۜ֫()I
    .locals 1

    .line 183
    iget v0, p0, Ll/ۗ۠;->۟֫:I

    return v0
.end method

.method public final ۠(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    .line 164
    iput v1, p0, Ll/ۗ۠;->ۧۧ:F

    .line 165
    iput p1, p0, Ll/ۗ۠;->۟֫:I

    .line 166
    iput v0, p0, Ll/ۗ۠;->֫ۧ:I

    :cond_0
    return-void
.end method

.method public final ۢ֫()F
    .locals 1

    .line 179
    iget v0, p0, Ll/ۗ۠;->ۧۧ:F

    return v0
.end method

.method public final ۧ(Ll/ܿ۠;Z)V
    .locals 2

    .line 620
    iget-object p2, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-nez p2, :cond_0

    return-void

    .line 276
    :cond_0
    iget-object p2, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    move-result p1

    .line 277
    iget p2, p0, Ll/ۗ۠;->ܰ֫:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    .line 1083
    iput p1, p0, Ll/ܶ۠;->᩶֫:I

    .line 1092
    iput v1, p0, Ll/ܶ۠;->ۙ֫:I

    .line 620
    iget-object p1, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 280
    invoke-virtual {p1}, Ll/ܶ۠;->ۜ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܶ۠;->ۜ(I)V

    .line 281
    invoke-virtual {p0, v1}, Ll/ܶ۠;->᩵(I)V

    return-void

    .line 1083
    :cond_1
    iput v1, p0, Ll/ܶ۠;->᩶֫:I

    .line 1092
    iput p1, p0, Ll/ܶ۠;->ۙ֫:I

    .line 620
    iget-object p1, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 285
    invoke-virtual {p1}, Ll/ܶ۠;->ܶ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܶ۠;->᩵(I)V

    .line 286
    invoke-virtual {p0, v1}, Ll/ܶ۠;->ۜ(I)V

    return-void
.end method

.method public final ۨ()Z
    .locals 1

    .line 203
    iget-boolean v0, p0, Ll/ۗ۠;->ܽۧ:Z

    return v0
.end method

.method public final ܳ֫()Ll/ۚ۠;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    return-object v0
.end method

.method public final ܶ(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    .line 172
    iput v1, p0, Ll/ۗ۠;->ۧۧ:F

    .line 173
    iput v0, p0, Ll/ۗ۠;->۟֫:I

    .line 174
    iput p1, p0, Ll/ۗ۠;->֫ۧ:I

    :cond_0
    return-void
.end method

.method public final ܽ(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 156
    iput p1, p0, Ll/ۗ۠;->ۧۧ:F

    const/4 p1, -0x1

    .line 157
    iput p1, p0, Ll/ۗ۠;->۟֫:I

    .line 158
    iput p1, p0, Ll/ۗ۠;->֫ۧ:I

    :cond_0
    return-void
.end method

.method public final ᩷֫()I
    .locals 1

    .line 187
    iget v0, p0, Ll/ۗ۠;->֫ۧ:I

    return v0
.end method

.method public final ᩸(I)V
    .locals 3

    .line 84
    iget v0, p0, Ll/ۗ۠;->ܰ֫:I

    if-ne v0, p1, :cond_0

    goto :goto_2

    .line 87
    :cond_0
    iput p1, p0, Ll/ۗ۠;->ܰ֫:I

    .line 88
    iget-object p1, p0, Ll/ܶ۠;->᩻:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 89
    iget v0, p0, Ll/ۗ۠;->ܰ֫:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 90
    iget-object v0, p0, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iput-object v0, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    goto :goto_0

    .line 92
    :cond_1
    iget-object v0, p0, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iput-object v0, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    .line 94
    :goto_0
    iget-object v0, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object p1, p0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    .line 97
    iget-object v2, p0, Ll/ۗ۠;->᩺֫:Ll/ۚ۠;

    aput-object v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public final ᩻֫()I
    .locals 1

    .line 116
    iget v0, p0, Ll/ۗ۠;->ܰ֫:I

    return v0
.end method
