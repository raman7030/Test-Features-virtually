.class public abstract Ll/۠ܶ;
.super Ljava/lang/Object;
.source "M1C7"

# interfaces
.implements Ll/ۧܶ;


# instance fields
.field public ֫:Ll/ܳܶ;

.field public ۜ:Ll/ۖܶ;

.field public ۢ:Ll/ܶ۠;

.field public ۧ:Ll/۠۠;

.field public ܳ:I

.field public ܽ:Ll/ܿܶ;

.field public ܿ:I

.field public ᩳ:Ll/֨ܶ;

.field public ᩷:Ll/ܿܶ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܶ۠;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ll/ܳܶ;

    invoke-direct {v0, p0}, Ll/ܳܶ;-><init>(Ll/۠ܶ;)V

    iput-object v0, p0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Ll/۠ܶ;->ܳ:I

    .line 37
    iput-boolean v0, p0, Ll/۠ܶ;->᩻:Z

    .line 38
    new-instance v0, Ll/ܿܶ;

    invoke-direct {v0, p0}, Ll/ܿܶ;-><init>(Ll/۠ܶ;)V

    iput-object v0, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    .line 39
    new-instance v0, Ll/ܿܶ;

    invoke-direct {v0, p0}, Ll/ܿܶ;-><init>(Ll/۠ܶ;)V

    iput-object v0, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    .line 41
    sget-object v0, Ll/֨ܶ;->ۙ:Ll/֨ܶ;

    iput-object v0, p0, Ll/۠ܶ;->ᩳ:Ll/֨ܶ;

    .line 44
    iput-object p1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    return-void
.end method

.method public static ֫(Ll/ۚ۠;)Ll/ܿܶ;
    .locals 2

    .line 95
    iget-object p0, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez p0, :cond_0

    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, p0, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 100
    iget-object p0, p0, Ll/ۚ۠;->᩷:Ll/֡۠;

    .line 101
    sget-object v1, Ll/ۚܶ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_5

    const/4 v1, 0x2

    if-eq p0, v1, :cond_4

    const/4 v1, 0x3

    if-eq p0, v1, :cond_3

    const/4 v1, 0x4

    if-eq p0, v1, :cond_2

    const/4 v1, 0x5

    if-eq p0, v1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 119
    :cond_1
    iget-object p0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    .line 120
    iget-object p0, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    return-object p0

    .line 115
    :cond_2
    iget-object p0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    .line 116
    iget-object p0, p0, Ll/ᩴܶ;->ۡ:Ll/ܿܶ;

    return-object p0

    .line 111
    :cond_3
    iget-object p0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    .line 112
    iget-object p0, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    return-object p0

    .line 107
    :cond_4
    iget-object p0, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    .line 108
    iget-object p0, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    return-object p0

    .line 103
    :cond_5
    iget-object p0, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    .line 104
    iget-object p0, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    return-object p0
.end method

.method public static ֫(Ll/ۚ۠;I)Ll/ܿܶ;
    .locals 1

    .line 258
    iget-object p0, p0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez p0, :cond_0

    goto :goto_1

    .line 262
    :cond_0
    iget-object v0, p0, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    if-nez p1, :cond_1

    .line 263
    iget-object p1, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    goto :goto_0

    :cond_1
    iget-object p1, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    .line 265
    :goto_0
    iget-object p0, p0, Ll/ۚ۠;->᩷:Ll/֡۠;

    .line 266
    sget-object v0, Ll/ۚܶ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    const/4 v0, 0x5

    if-eq p0, v0, :cond_2

    :goto_1
    const/4 p0, 0x0

    return-object p0

    .line 273
    :cond_2
    iget-object p0, p1, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    return-object p0

    .line 269
    :cond_3
    iget-object p0, p1, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    return-object p0
.end method

.method public static ֫(Ll/ܿܶ;Ll/ܿܶ;I)V
    .locals 1

    .line 280
    iget-object v0, p0, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    iput p2, p0, Ll/ܿܶ;->ܽ:I

    .line 282
    iget-object p1, p1, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final ֫(II)I
    .locals 1

    if-nez p2, :cond_1

    .line 234
    iget-object p2, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v0, p2, Ll/ܶ۠;->֫֫:I

    .line 235
    iget p2, p2, Ll/ܶ۠;->ܽ֫:I

    .line 236
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    .line 238
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    return p2

    .line 244
    :cond_1
    iget-object p2, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v0, p2, Ll/ܶ۠;->۟:I

    .line 245
    iget p2, p2, Ll/ܶ۠;->ۧ֫:I

    .line 246
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    .line 248
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    return p2

    :cond_3
    return p1
.end method

.method public abstract ֫()V
.end method

.method public final ֫(Ll/ۚ۠;Ll/ۚ۠;I)V
    .locals 12

    .line 127
    invoke-static {p1}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v0

    .line 128
    invoke-static {p2}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v1

    .line 130
    iget-boolean v2, v0, Ll/ܿܶ;->᩻:Z

    if-eqz v2, :cond_f

    iget-boolean v2, v1, Ll/ܿܶ;->᩻:Z

    if-nez v2, :cond_0

    goto/16 :goto_5

    .line 134
    :cond_0
    iget v2, v0, Ll/ܿܶ;->ܺ:I

    invoke-virtual {p1}, Ll/ۚ۠;->ܽ()I

    move-result p1

    add-int/2addr p1, v2

    .line 135
    iget v2, v1, Ll/ܿܶ;->ܺ:I

    invoke-virtual {p2}, Ll/ۚ۠;->ܽ()I

    move-result p2

    sub-int/2addr v2, p2

    sub-int p2, v2, p1

    .line 138
    iget-object v3, p0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-boolean v4, v3, Ll/ܿܶ;->᩻:Z

    const/high16 v5, 0x3f000000    # 0.5f

    if-nez v4, :cond_a

    iget-object v4, p0, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v6, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v4, v6, :cond_a

    .line 171
    iget v4, p0, Ll/۠ܶ;->ܿ:I

    if-eqz v4, :cond_9

    const/4 v7, 0x1

    if-eq v4, v7, :cond_8

    const/4 v8, 0x2

    if-eq v4, v8, :cond_5

    const/4 v8, 0x3

    if-eq v4, v8, :cond_1

    goto/16 :goto_3

    .line 199
    :cond_1
    iget-object v4, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v9, v4, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v10, v9, Ll/۠ܶ;->ۧ:Ll/۠۠;

    if-ne v10, v6, :cond_2

    iget v10, v9, Ll/۠ܶ;->ܿ:I

    if-ne v10, v8, :cond_2

    iget-object v10, v4, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v11, v10, Ll/۠ܶ;->ۧ:Ll/۠۠;

    if-ne v11, v6, :cond_2

    iget v6, v10, Ll/۠ܶ;->ܿ:I

    if-ne v6, v8, :cond_2

    goto :goto_3

    :cond_2
    if-nez p3, :cond_3

    .line 205
    iget-object v9, v4, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    .line 206
    :cond_3
    iget-object v6, v9, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-boolean v8, v6, Ll/ܿܶ;->᩻:Z

    if-eqz v8, :cond_a

    .line 1302
    iget v4, v4, Ll/ܶ۠;->֡:F

    if-ne p3, v7, :cond_4

    .line 210
    iget v6, v6, Ll/ܿܶ;->ܺ:I

    int-to-float v6, v6

    div-float/2addr v6, v4

    add-float/2addr v6, v5

    float-to-int v4, v6

    goto :goto_0

    .line 212
    :cond_4
    iget v6, v6, Ll/ܿܶ;->ܺ:I

    int-to-float v6, v6

    mul-float v4, v4, v6

    add-float/2addr v4, v5

    float-to-int v4, v4

    .line 214
    :goto_0
    invoke-virtual {v3, v4}, Ll/ܳܶ;->֫(I)V

    goto :goto_3

    .line 177
    :cond_5
    iget-object v4, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 620
    iget-object v6, v4, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v6, :cond_a

    if-nez p3, :cond_6

    .line 179
    iget-object v6, v6, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    goto :goto_1

    :cond_6
    iget-object v6, v6, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    .line 182
    :goto_1
    iget-object v6, v6, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-boolean v7, v6, Ll/ܿܶ;->᩻:Z

    if-eqz v7, :cond_a

    if-nez p3, :cond_7

    .line 183
    iget v4, v4, Ll/ܶ۠;->ܿ֫:F

    goto :goto_2

    :cond_7
    iget v4, v4, Ll/ܶ۠;->ᩳ֫:F

    .line 186
    :goto_2
    iget v6, v6, Ll/ܿܶ;->ܺ:I

    int-to-float v6, v6

    mul-float v6, v6, v4

    add-float/2addr v6, v5

    float-to-int v4, v6

    .line 188
    invoke-virtual {p0, v4, p3}, Ll/۠ܶ;->֫(II)I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ܳܶ;->֫(I)V

    goto :goto_3

    .line 194
    :cond_8
    iget v4, v3, Ll/ܳܶ;->ۖ:I

    invoke-virtual {p0, v4, p3}, Ll/۠ܶ;->֫(II)I

    move-result v4

    .line 195
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ܳܶ;->֫(I)V

    goto :goto_3

    .line 173
    :cond_9
    invoke-virtual {p0, p2, p3}, Ll/۠ܶ;->֫(II)I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ܳܶ;->֫(I)V

    .line 143
    :cond_a
    :goto_3
    iget-boolean v4, v3, Ll/ܿܶ;->᩻:Z

    if-nez v4, :cond_b

    goto :goto_5

    .line 147
    :cond_b
    iget v4, v3, Ll/ܿܶ;->ܺ:I

    iget-object v6, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v7, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    if-ne v4, p2, :cond_c

    .line 148
    invoke-virtual {v7, p1}, Ll/ܿܶ;->֫(I)V

    .line 149
    invoke-virtual {v6, v2}, Ll/ܿܶ;->֫(I)V

    return-void

    .line 154
    :cond_c
    iget-object p2, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    if-nez p3, :cond_d

    invoke-virtual {p2}, Ll/ܶ۠;->᩷()F

    move-result p2

    goto :goto_4

    .line 155
    :cond_d
    invoke-virtual {p2}, Ll/ܶ۠;->ۚ()F

    move-result p2

    :goto_4
    if-ne v0, v1, :cond_e

    .line 158
    iget p1, v0, Ll/ܿܶ;->ܺ:I

    .line 159
    iget v2, v1, Ll/ܿܶ;->ܺ:I

    const/high16 p2, 0x3f000000    # 0.5f

    :cond_e
    sub-int/2addr v2, p1

    .line 165
    iget p3, v3, Ll/ܿܶ;->ܺ:I

    sub-int/2addr v2, p3

    int-to-float p1, p1

    add-float/2addr p1, v5

    int-to-float p3, v2

    mul-float p3, p3, p2

    add-float/2addr p3, p1

    float-to-int p1, p3

    .line 166
    invoke-virtual {v7, p1}, Ll/ܿܶ;->֫(I)V

    .line 167
    iget p1, v7, Ll/ܿܶ;->ܺ:I

    iget p2, v3, Ll/ܿܶ;->ܺ:I

    add-int/2addr p1, p2

    invoke-virtual {v6, p1}, Ll/ܿܶ;->֫(I)V

    :cond_f
    :goto_5
    return-void
.end method

.method public ֫(Ll/ۧܶ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܿܶ;Ll/ܿܶ;ILl/ܳܶ;)V
    .locals 2

    .line 286
    iget-object v0, p1, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    iget-object v0, p1, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    iput p3, p1, Ll/ܿܶ;->ܿ:I

    .line 289
    iput-object p4, p1, Ll/ܿܶ;->ᩳ:Ll/ܳܶ;

    .line 290
    iget-object p2, p2, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    iget-object p2, p4, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract ۧ()V
.end method

.method public abstract ܳ()Z
.end method

.method public abstract ܽ()V
.end method

.method public final ܿ()Z
    .locals 1

    .line 301
    iget-boolean v0, p0, Ll/۠ܶ;->᩻:Z

    return v0
.end method

.method public ᩳ()J
    .locals 2

    .line 295
    iget-object v0, p0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-boolean v1, v0, Ll/ܿܶ;->᩻:Z

    if-eqz v1, :cond_0

    .line 296
    iget v0, v0, Ll/ܿܶ;->ܺ:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method
