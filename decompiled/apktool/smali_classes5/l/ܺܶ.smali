.class public final Ll/ܺܶ;
.super Ll/۠ܶ;
.source "S1AA"


# static fields
.field public static ۡ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 37
    sput-object v0, Ll/ܺܶ;->ۡ:[I

    return-void
.end method

.method public constructor <init>(Ll/ܶ۠;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Ll/۠ܶ;-><init>(Ll/ܶ۠;)V

    .line 41
    iget-object p1, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    sget-object v0, Ll/ᩳܶ;->ۗ:Ll/ᩳܶ;

    iput-object v0, p1, Ll/ܿܶ;->ۢ:Ll/ᩳܶ;

    .line 42
    iget-object p1, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    sget-object v0, Ll/ᩳܶ;->۬:Ll/ᩳܶ;

    iput-object v0, p1, Ll/ܿܶ;->ۢ:Ll/ᩳܶ;

    const/4 p1, 0x0

    .line 43
    iput p1, p0, Ll/۠ܶ;->ܳ:I

    return-void
.end method

.method public static ֫([IIIIIFI)V
    .locals 2

    sub-int/2addr p2, p1

    sub-int/2addr p4, p3

    const/4 p1, -0x1

    const/4 p3, 0x0

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x1

    if-eq p6, p1, :cond_2

    if-eqz p6, :cond_1

    if-eq p6, v1, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p1, p2

    mul-float p1, p1, p5

    add-float/2addr p1, v0

    float-to-int p1, p1

    .line 296
    aput p2, p0, p3

    .line 297
    aput p1, p0, v1

    return-void

    :cond_1
    int-to-float p1, p4

    mul-float p1, p1, p5

    add-float/2addr p1, v0

    float-to-int p1, p1

    .line 290
    aput p1, p0, p3

    .line 291
    aput p4, p0, v1

    return-void

    :cond_2
    int-to-float p1, p4

    mul-float p1, p1, p5

    add-float/2addr p1, v0

    float-to-int p1, p1

    int-to-float p6, p2

    div-float/2addr p6, p5

    add-float/2addr p6, v0

    float-to-int p5, p6

    if-gt p1, p2, :cond_3

    .line 280
    aput p1, p0, p3

    .line 281
    aput p4, p0, v1

    return-void

    :cond_3
    if-gt p5, p4, :cond_4

    .line 283
    aput p2, p0, p3

    .line 284
    aput p5, p0, v1

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HorizontalRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v1}, Ll/ܶ۠;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 12

    .line 83
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-boolean v1, v0, Ll/ܶ۠;->ۗ֫:Z

    iget-object v2, p0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    if-eqz v1, :cond_0

    .line 84
    invoke-virtual {v0}, Ll/ܶ۠;->ܶ()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/ܳܶ;->֫(I)V

    .line 86
    :cond_0
    iget-boolean v0, v2, Ll/ܿܶ;->᩻:Z

    iget-object v1, v2, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    iget-object v3, v2, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    const/4 v4, 0x0

    iget-object v5, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v6, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    if-nez v0, :cond_4

    .line 87
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 1966
    iget-object v7, v0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v7, v7, v4

    .line 87
    iput-object v7, p0, Ll/۠ܶ;->ۧ:Ll/۠۠;

    .line 88
    sget-object v8, Ll/۠۠;->᩶:Ll/۠۠;

    if-eq v7, v8, :cond_7

    .line 89
    sget-object v8, Ll/۠۠;->ۙ:Ll/۠۠;

    if-ne v7, v8, :cond_3

    .line 620
    iget-object v9, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v9, :cond_1

    .line 1966
    iget-object v10, v9, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v10, v10, v4

    .line 92
    sget-object v11, Ll/۠۠;->᩹:Ll/۠۠;

    if-eq v10, v11, :cond_2

    .line 1966
    :cond_1
    iget-object v10, v9, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v10, v10, v4

    if-ne v10, v8, :cond_3

    .line 94
    :cond_2
    invoke-virtual {v9}, Ll/ܶ۠;->ܶ()I

    move-result v0

    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->۫:Ll/ۚ۠;

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    sub-int/2addr v0, v1

    .line 95
    iget-object v1, v9, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v1, v1, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-object v3, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v3, v3, Ll/ܶ۠;->۫:Ll/ۚ۠;

    invoke-virtual {v3}, Ll/ۚ۠;->ܽ()I

    move-result v3

    invoke-static {v6, v1, v3}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 96
    iget-object v1, v9, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v1, v1, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v3, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v3, v3, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    invoke-virtual {v3}, Ll/ۚ۠;->ܽ()I

    move-result v3

    neg-int v3, v3

    invoke-static {v5, v1, v3}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 97
    invoke-virtual {v2, v0}, Ll/ܳܶ;->֫(I)V

    return-void

    .line 101
    :cond_3
    sget-object v8, Ll/۠۠;->᩹:Ll/۠۠;

    if-ne v7, v8, :cond_7

    .line 102
    invoke-virtual {v0}, Ll/ܶ۠;->ܶ()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/ܳܶ;->֫(I)V

    goto :goto_0

    .line 106
    :cond_4
    iget-object v0, p0, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v7, Ll/۠۠;->ۙ:Ll/۠۠;

    if-ne v0, v7, :cond_7

    .line 107
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 620
    iget-object v8, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v8, :cond_5

    .line 1966
    iget-object v9, v8, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v9, v9, v4

    .line 109
    sget-object v10, Ll/۠۠;->᩹:Ll/۠۠;

    if-eq v9, v10, :cond_6

    .line 1966
    :cond_5
    iget-object v9, v8, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v9, v9, v4

    if-ne v9, v7, :cond_7

    .line 111
    :cond_6
    iget-object v1, v8, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v1, v1, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܶ۠;->۫:Ll/ۚ۠;

    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    invoke-static {v6, v1, v0}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 112
    iget-object v0, v8, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    neg-int v1, v1

    invoke-static {v5, v0, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    return-void

    .line 127
    :cond_7
    :goto_0
    iget-boolean v0, v2, Ll/ܿܶ;->᩻:Z

    const/4 v7, 0x1

    if-eqz v0, :cond_e

    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-boolean v8, v0, Ll/ܶ۠;->ۗ֫:Z

    if-eqz v8, :cond_e

    .line 128
    iget-object v1, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v3, v1, v4

    iget-object v8, v3, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v8, :cond_b

    aget-object v9, v1, v7

    iget-object v9, v9, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v9, :cond_b

    .line 129
    invoke-virtual {v0}, Ll/ܶ۠;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 130
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    iput v0, v6, Ll/ܿܶ;->ܽ:I

    .line 131
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v0, v0, v7

    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    neg-int v0, v0

    iput v0, v5, Ll/ܿܶ;->ܽ:I

    return-void

    .line 133
    :cond_8
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v0, v0, v4

    invoke-static {v0}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 135
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    invoke-static {v6, v0, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 137
    :cond_9
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v0, v0, v7

    invoke-static {v0}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 139
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v1, v1, v7

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    neg-int v1, v1

    invoke-static {v5, v0, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 141
    :cond_a
    iput-boolean v7, v6, Ll/ܿܶ;->֫:Z

    .line 142
    iput-boolean v7, v5, Ll/ܿܶ;->֫:Z

    return-void

    :cond_b
    if-eqz v8, :cond_c

    .line 145
    invoke-static {v3}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 147
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    invoke-static {v6, v0, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 148
    iget v0, v2, Ll/ܿܶ;->ܺ:I

    invoke-static {v5, v6, v0}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    return-void

    .line 150
    :cond_c
    aget-object v1, v1, v7

    iget-object v3, v1, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v3, :cond_d

    .line 151
    invoke-static {v1}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 153
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v1, v1, v7

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    neg-int v1, v1

    invoke-static {v5, v0, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 154
    iget v0, v2, Ll/ܿܶ;->ܺ:I

    neg-int v0, v0

    invoke-static {v6, v5, v0}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    return-void

    .line 158
    :cond_d
    instance-of v1, v0, Ll/۬۠;

    if-nez v1, :cond_1a

    .line 620
    iget-object v1, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v1, :cond_1a

    .line 158
    sget-object v1, Ll/֡۠;->ۙ:Ll/֡۠;

    .line 159
    invoke-virtual {v0, v1}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v0

    iget-object v0, v0, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v0, :cond_1a

    .line 160
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 620
    iget-object v1, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 160
    iget-object v1, v1, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v1, v1, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    .line 161
    invoke-virtual {v0}, Ll/ܶ۠;->᩸()I

    move-result v0

    invoke-static {v6, v1, v0}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 162
    iget v0, v2, Ll/ܿܶ;->ܺ:I

    invoke-static {v5, v6, v0}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    return-void

    .line 166
    :cond_e
    iget-object v0, p0, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v8, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v0, v8, :cond_15

    .line 167
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v8, v0, Ll/ܶ۠;->ܰ:I

    const/4 v9, 0x2

    if-eq v8, v9, :cond_13

    const/4 v9, 0x3

    if-eq v8, v9, :cond_f

    goto/16 :goto_1

    .line 169
    :cond_f
    iget v8, v0, Ll/ܶ۠;->᩺:I

    if-ne v8, v9, :cond_12

    .line 172
    iput-object p0, v6, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    .line 173
    iput-object p0, v5, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    .line 174
    iget-object v8, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v9, v8, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iput-object p0, v9, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    .line 175
    iget-object v8, v8, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iput-object p0, v8, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    .line 176
    iput-object p0, v2, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    .line 178
    invoke-virtual {v0}, Ll/ܶ۠;->۬()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 179
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v1, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iput-object p0, v1, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    .line 182
    iget-object v0, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 186
    :cond_10
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 187
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-object v0, v0, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 190
    :cond_11
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-object v0, v0, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 195
    :cond_12
    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    .line 196
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    iput-boolean v7, v2, Ll/ܿܶ;->֫:Z

    .line 201
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    iget-object v0, v6, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    iget-object v0, v5, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 620
    :cond_13
    iget-object v0, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-nez v0, :cond_14

    goto :goto_1

    .line 213
    :cond_14
    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    .line 214
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    iput-boolean v7, v2, Ll/ܿܶ;->֫:Z

    .line 217
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    :cond_15
    :goto_1
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v3, v1, v4

    iget-object v8, v3, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v8, :cond_17

    aget-object v9, v1, v7

    iget-object v9, v9, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v9, :cond_17

    .line 228
    invoke-virtual {v0}, Ll/ܶ۠;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 229
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    iput v0, v6, Ll/ܿܶ;->ܽ:I

    .line 230
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v0, v0, v7

    invoke-virtual {v0}, Ll/ۚ۠;->ܽ()I

    move-result v0

    neg-int v0, v0

    iput v0, v5, Ll/ܿܶ;->ܽ:I

    return-void

    .line 232
    :cond_16
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v0, v0, v4

    invoke-static {v0}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v0

    .line 233
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v1, v1, v7

    invoke-static {v1}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v1

    .line 242
    invoke-virtual {v0, p0}, Ll/ܿܶ;->֫(Ll/۠ܶ;)V

    .line 243
    invoke-virtual {v1, p0}, Ll/ܿܶ;->֫(Ll/۠ܶ;)V

    .line 245
    sget-object v0, Ll/֨ܶ;->᩹:Ll/֨ܶ;

    iput-object v0, p0, Ll/۠ܶ;->ᩳ:Ll/֨ܶ;

    return-void

    :cond_17
    if-eqz v8, :cond_18

    .line 248
    invoke-static {v3}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 250
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    invoke-static {v6, v0, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 251
    invoke-virtual {p0, v5, v6, v7, v2}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;ILl/ܳܶ;)V

    return-void

    .line 253
    :cond_18
    aget-object v1, v1, v7

    iget-object v3, v1, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v3, :cond_19

    .line 254
    invoke-static {v1}, Ll/۠ܶ;->֫(Ll/ۚ۠;)Ll/ܿܶ;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 256
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    aget-object v1, v1, v7

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    neg-int v1, v1

    invoke-static {v5, v0, v1}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    const/4 v0, -0x1

    .line 257
    invoke-virtual {p0, v6, v5, v0, v2}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;ILl/ܳܶ;)V

    return-void

    .line 261
    :cond_19
    instance-of v1, v0, Ll/۬۠;

    if-nez v1, :cond_1a

    .line 620
    iget-object v1, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v1, :cond_1a

    .line 262
    iget-object v1, v1, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v1, v1, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    .line 263
    invoke-virtual {v0}, Ll/ܶ۠;->᩸()I

    move-result v0

    invoke-static {v6, v1, v0}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;I)V

    .line 264
    invoke-virtual {p0, v5, v6, v7, v2}, Ll/۠ܶ;->֫(Ll/ܿܶ;Ll/ܿܶ;ILl/ܳܶ;)V

    :cond_1a
    return-void
.end method

.method public final ֫(Ll/ۧܶ;)V
    .locals 22

    move-object/from16 v0, p0

    .line 305
    sget-object v1, Ll/ۡܶ;->֫:[I

    iget-object v2, v0, Ll/۠ܶ;->ᩳ:Ll/֨ܶ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-eq v1, v3, :cond_25

    .line 320
    iget-object v1, v0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-boolean v4, v1, Ll/ܿܶ;->᩻:Z

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x1

    iget-object v7, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-object v8, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    if-nez v4, :cond_1c

    .line 321
    iget-object v4, v0, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v9, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v4, v9, :cond_1c

    .line 322
    iget-object v4, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v9, v4, Ll/ܶ۠;->ܰ:I

    const/4 v10, 0x2

    if-eq v9, v10, :cond_1b

    if-eq v9, v3, :cond_0

    goto/16 :goto_8

    .line 324
    :cond_0
    iget v9, v4, Ll/ܶ۠;->᩺:I

    const/4 v10, -0x1

    if-eqz v9, :cond_5

    if-ne v9, v3, :cond_1

    goto :goto_3

    .line 446
    :cond_1
    invoke-virtual {v4}, Ll/ܶ۠;->᩻()I

    move-result v3

    if-eq v3, v10, :cond_4

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    .line 453
    :cond_2
    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v4, v3, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v4, v4, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget v4, v4, Ll/ܿܶ;->ܺ:I

    goto :goto_0

    .line 449
    :cond_3
    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v4, v3, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v4, v4, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget v4, v4, Ll/ܿܶ;->ܺ:I

    int-to-float v4, v4

    .line 1302
    iget v3, v3, Ll/ܶ۠;->֡:F

    div-float/2addr v4, v3

    goto :goto_1

    .line 457
    :cond_4
    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v4, v3, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v4, v4, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget v4, v4, Ll/ܿܶ;->ܺ:I

    :goto_0
    int-to-float v4, v4

    .line 1302
    iget v3, v3, Ll/ܶ۠;->֡:F

    mul-float v4, v4, v3

    :goto_1
    add-float/2addr v4, v5

    float-to-int v3, v4

    .line 461
    :goto_2
    invoke-virtual {v1, v3}, Ll/ܳܶ;->֫(I)V

    goto/16 :goto_8

    .line 326
    :cond_5
    :goto_3
    iget-object v3, v4, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v9, v3, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    .line 327
    iget-object v3, v3, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    .line 328
    iget-object v11, v4, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v11, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v11, :cond_6

    const/4 v11, 0x1

    goto :goto_4

    :cond_6
    const/4 v11, 0x0

    .line 329
    :goto_4
    iget-object v12, v4, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v12, v12, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v12, :cond_7

    const/4 v12, 0x1

    goto :goto_5

    :cond_7
    const/4 v12, 0x0

    .line 330
    :goto_5
    iget-object v13, v4, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v13, v13, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v13, :cond_8

    const/4 v13, 0x1

    goto :goto_6

    :cond_8
    const/4 v13, 0x0

    .line 331
    :goto_6
    iget-object v14, v4, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget-object v14, v14, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v14, :cond_9

    const/4 v14, 0x1

    goto :goto_7

    :cond_9
    const/4 v14, 0x0

    .line 333
    :goto_7
    invoke-virtual {v4}, Ll/ܶ۠;->᩻()I

    move-result v4

    if-eqz v11, :cond_f

    if-eqz v12, :cond_f

    if-eqz v13, :cond_f

    if-eqz v14, :cond_f

    .line 336
    iget-object v10, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 1302
    iget v10, v10, Ll/ܶ۠;->֡:F

    .line 337
    iget-boolean v11, v9, Ll/ܿܶ;->᩻:Z

    iget-object v12, v9, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    sget-object v13, Ll/ܺܶ;->ۡ:[I

    if-eqz v11, :cond_b

    iget-boolean v11, v3, Ll/ܿܶ;->᩻:Z

    if-eqz v11, :cond_b

    .line 338
    iget-boolean v5, v7, Ll/ܿܶ;->ܳ:Z

    if-eqz v5, :cond_24

    iget-boolean v5, v8, Ll/ܿܶ;->ܳ:Z

    if-nez v5, :cond_a

    goto/16 :goto_9

    .line 341
    :cond_a
    iget-object v5, v7, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿܶ;

    iget v5, v5, Ll/ܿܶ;->ܺ:I

    iget v7, v7, Ll/ܿܶ;->ܽ:I

    add-int v16, v5, v7

    .line 342
    iget-object v5, v8, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿܶ;

    iget v5, v5, Ll/ܿܶ;->ܺ:I

    iget v7, v8, Ll/ܿܶ;->ܽ:I

    sub-int v17, v5, v7

    .line 343
    iget v5, v9, Ll/ܿܶ;->ܺ:I

    iget v7, v9, Ll/ܿܶ;->ܽ:I

    add-int v18, v5, v7

    .line 344
    iget v5, v3, Ll/ܿܶ;->ܺ:I

    iget v3, v3, Ll/ܿܶ;->ܽ:I

    sub-int v19, v5, v3

    move-object v15, v13

    move/from16 v20, v10

    move/from16 v21, v4

    .line 345
    invoke-static/range {v15 .. v21}, Ll/ܺܶ;->֫([IIIIIFI)V

    .line 346
    aget v2, v13, v2

    invoke-virtual {v1, v2}, Ll/ܳܶ;->֫(I)V

    .line 347
    iget-object v1, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v1, v1, Ll/۠ܶ;->֫:Ll/ܳܶ;

    aget v2, v13, v6

    invoke-virtual {v1, v2}, Ll/ܳܶ;->֫(I)V

    return-void

    .line 350
    :cond_b
    iget-boolean v11, v7, Ll/ܿܶ;->᩻:Z

    if-eqz v11, :cond_d

    iget-boolean v11, v8, Ll/ܿܶ;->᩻:Z

    if-eqz v11, :cond_d

    .line 351
    iget-boolean v11, v9, Ll/ܿܶ;->ܳ:Z

    if-eqz v11, :cond_24

    iget-boolean v11, v3, Ll/ܿܶ;->ܳ:Z

    if-nez v11, :cond_c

    goto/16 :goto_9

    .line 354
    :cond_c
    iget v11, v7, Ll/ܿܶ;->ܺ:I

    iget v14, v7, Ll/ܿܶ;->ܽ:I

    add-int v16, v11, v14

    .line 355
    iget v11, v8, Ll/ܿܶ;->ܺ:I

    iget v14, v8, Ll/ܿܶ;->ܽ:I

    sub-int v17, v11, v14

    .line 356
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܿܶ;

    iget v11, v11, Ll/ܿܶ;->ܺ:I

    iget v14, v9, Ll/ܿܶ;->ܽ:I

    add-int v18, v11, v14

    .line 357
    iget-object v11, v3, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܿܶ;

    iget v11, v11, Ll/ܿܶ;->ܺ:I

    iget v14, v3, Ll/ܿܶ;->ܽ:I

    sub-int v19, v11, v14

    move-object v15, v13

    move/from16 v20, v10

    move/from16 v21, v4

    .line 358
    invoke-static/range {v15 .. v21}, Ll/ܺܶ;->֫([IIIIIFI)V

    .line 359
    aget v11, v13, v2

    invoke-virtual {v1, v11}, Ll/ܳܶ;->֫(I)V

    .line 360
    iget-object v11, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v11, v11, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v11, v11, Ll/۠ܶ;->֫:Ll/ܳܶ;

    aget v14, v13, v6

    invoke-virtual {v11, v14}, Ll/ܳܶ;->֫(I)V

    .line 362
    :cond_d
    iget-boolean v11, v7, Ll/ܿܶ;->ܳ:Z

    if-eqz v11, :cond_24

    iget-boolean v11, v8, Ll/ܿܶ;->ܳ:Z

    if-eqz v11, :cond_24

    iget-boolean v11, v9, Ll/ܿܶ;->ܳ:Z

    if-eqz v11, :cond_24

    iget-boolean v11, v3, Ll/ܿܶ;->ܳ:Z

    if-nez v11, :cond_e

    goto/16 :goto_9

    .line 367
    :cond_e
    iget-object v11, v7, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܿܶ;

    iget v11, v11, Ll/ܿܶ;->ܺ:I

    iget v14, v7, Ll/ܿܶ;->ܽ:I

    add-int v16, v11, v14

    .line 368
    iget-object v11, v8, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܿܶ;

    iget v11, v11, Ll/ܿܶ;->ܺ:I

    iget v14, v8, Ll/ܿܶ;->ܽ:I

    sub-int v17, v11, v14

    .line 369
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܿܶ;

    iget v11, v11, Ll/ܿܶ;->ܺ:I

    iget v9, v9, Ll/ܿܶ;->ܽ:I

    add-int v18, v11, v9

    .line 370
    iget-object v9, v3, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܿܶ;

    iget v9, v9, Ll/ܿܶ;->ܺ:I

    iget v3, v3, Ll/ܿܶ;->ܽ:I

    sub-int v19, v9, v3

    move-object v15, v13

    move/from16 v20, v10

    move/from16 v21, v4

    .line 371
    invoke-static/range {v15 .. v21}, Ll/ܺܶ;->֫([IIIIIFI)V

    .line 372
    aget v3, v13, v2

    invoke-virtual {v1, v3}, Ll/ܳܶ;->֫(I)V

    .line 373
    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v3, v3, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v3, v3, Ll/۠ܶ;->֫:Ll/ܳܶ;

    aget v4, v13, v6

    invoke-virtual {v3, v4}, Ll/ܳܶ;->֫(I)V

    goto/16 :goto_8

    :cond_f
    if-eqz v11, :cond_15

    if-eqz v13, :cond_15

    .line 375
    iget-boolean v3, v7, Ll/ܿܶ;->ܳ:Z

    if-eqz v3, :cond_24

    iget-boolean v3, v8, Ll/ܿܶ;->ܳ:Z

    if-nez v3, :cond_10

    goto/16 :goto_9

    .line 378
    :cond_10
    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 1302
    iget v3, v3, Ll/ܶ۠;->֡:F

    .line 379
    iget-object v9, v7, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܿܶ;

    iget v9, v9, Ll/ܿܶ;->ܺ:I

    iget v11, v7, Ll/ܿܶ;->ܽ:I

    add-int/2addr v9, v11

    .line 380
    iget-object v11, v8, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܿܶ;

    iget v11, v11, Ll/ܿܶ;->ܺ:I

    iget v12, v8, Ll/ܿܶ;->ܽ:I

    sub-int/2addr v11, v12

    if-eq v4, v10, :cond_13

    if-eqz v4, :cond_13

    if-eq v4, v6, :cond_11

    goto/16 :goto_8

    :cond_11
    sub-int/2addr v11, v9

    .line 398
    invoke-virtual {v0, v11, v2}, Ll/۠ܶ;->֫(II)I

    move-result v4

    int-to-float v9, v4

    div-float/2addr v9, v3

    add-float/2addr v9, v5

    float-to-int v9, v9

    .line 400
    invoke-virtual {v0, v9, v6}, Ll/۠ܶ;->֫(II)I

    move-result v10

    if-eq v9, v10, :cond_12

    int-to-float v4, v10

    mul-float v4, v4, v3

    add-float/2addr v4, v5

    float-to-int v4, v4

    .line 404
    :cond_12
    invoke-virtual {v1, v4}, Ll/ܳܶ;->֫(I)V

    .line 405
    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v3, v3, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v3, v3, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v3, v10}, Ll/ܳܶ;->֫(I)V

    goto/16 :goto_8

    :cond_13
    sub-int/2addr v11, v9

    .line 386
    invoke-virtual {v0, v11, v2}, Ll/۠ܶ;->֫(II)I

    move-result v4

    int-to-float v9, v4

    mul-float v9, v9, v3

    add-float/2addr v9, v5

    float-to-int v9, v9

    .line 388
    invoke-virtual {v0, v9, v6}, Ll/۠ܶ;->֫(II)I

    move-result v10

    if-eq v9, v10, :cond_14

    int-to-float v4, v10

    div-float/2addr v4, v3

    add-float/2addr v4, v5

    float-to-int v4, v4

    .line 392
    :cond_14
    invoke-virtual {v1, v4}, Ll/ܳܶ;->֫(I)V

    .line 393
    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v3, v3, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v3, v3, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v3, v10}, Ll/ܳܶ;->֫(I)V

    goto/16 :goto_8

    :cond_15
    if-eqz v12, :cond_1c

    if-eqz v14, :cond_1c

    .line 409
    iget-boolean v11, v9, Ll/ܿܶ;->ܳ:Z

    if-eqz v11, :cond_24

    iget-boolean v11, v3, Ll/ܿܶ;->ܳ:Z

    if-nez v11, :cond_16

    goto/16 :goto_9

    .line 412
    :cond_16
    iget-object v11, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    .line 1302
    iget v11, v11, Ll/ܶ۠;->֡:F

    .line 413
    iget-object v12, v9, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܿܶ;

    iget v12, v12, Ll/ܿܶ;->ܺ:I

    iget v9, v9, Ll/ܿܶ;->ܽ:I

    add-int/2addr v12, v9

    .line 414
    iget-object v9, v3, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܿܶ;

    iget v9, v9, Ll/ܿܶ;->ܺ:I

    iget v3, v3, Ll/ܿܶ;->ܽ:I

    sub-int/2addr v9, v3

    if-eq v4, v10, :cond_19

    if-eqz v4, :cond_17

    if-eq v4, v6, :cond_19

    goto :goto_8

    :cond_17
    sub-int/2addr v9, v12

    .line 432
    invoke-virtual {v0, v9, v6}, Ll/۠ܶ;->֫(II)I

    move-result v3

    int-to-float v4, v3

    mul-float v4, v4, v11

    add-float/2addr v4, v5

    float-to-int v4, v4

    .line 434
    invoke-virtual {v0, v4, v2}, Ll/۠ܶ;->֫(II)I

    move-result v9

    if-eq v4, v9, :cond_18

    int-to-float v3, v9

    div-float/2addr v3, v11

    add-float/2addr v3, v5

    float-to-int v3, v3

    .line 438
    :cond_18
    invoke-virtual {v1, v9}, Ll/ܳܶ;->֫(I)V

    .line 439
    iget-object v4, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v4, v4, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v4, v4, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v4, v3}, Ll/ܳܶ;->֫(I)V

    goto :goto_8

    :cond_19
    sub-int/2addr v9, v12

    .line 420
    invoke-virtual {v0, v9, v6}, Ll/۠ܶ;->֫(II)I

    move-result v3

    int-to-float v4, v3

    div-float/2addr v4, v11

    add-float/2addr v4, v5

    float-to-int v4, v4

    .line 422
    invoke-virtual {v0, v4, v2}, Ll/۠ܶ;->֫(II)I

    move-result v9

    if-eq v4, v9, :cond_1a

    int-to-float v3, v9

    mul-float v3, v3, v11

    add-float/2addr v3, v5

    float-to-int v3, v3

    .line 426
    :cond_1a
    invoke-virtual {v1, v9}, Ll/ܳܶ;->֫(I)V

    .line 427
    iget-object v4, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v4, v4, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v4, v4, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v4, v3}, Ll/ܳܶ;->֫(I)V

    goto :goto_8

    .line 620
    :cond_1b
    iget-object v3, v4, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v3, :cond_1c

    .line 468
    iget-object v3, v3, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v3, v3, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iget-boolean v9, v3, Ll/ܿܶ;->᩻:Z

    if-eqz v9, :cond_1c

    .line 469
    iget v4, v4, Ll/ܶ۠;->ܿ֫:F

    .line 470
    iget v3, v3, Ll/ܿܶ;->ܺ:I

    int-to-float v3, v3

    mul-float v3, v3, v4

    add-float/2addr v3, v5

    float-to-int v3, v3

    .line 472
    invoke-virtual {v1, v3}, Ll/ܳܶ;->֫(I)V

    .line 481
    :cond_1c
    :goto_8
    iget-boolean v3, v7, Ll/ܿܶ;->ܳ:Z

    iget-object v4, v7, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    if-eqz v3, :cond_24

    iget-boolean v3, v8, Ll/ܿܶ;->ܳ:Z

    iget-object v9, v8, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    if-nez v3, :cond_1d

    goto/16 :goto_9

    .line 485
    :cond_1d
    iget-boolean v3, v7, Ll/ܿܶ;->᩻:Z

    if-eqz v3, :cond_1e

    iget-boolean v3, v8, Ll/ܿܶ;->᩻:Z

    if-eqz v3, :cond_1e

    iget-boolean v3, v1, Ll/ܿܶ;->᩻:Z

    if-eqz v3, :cond_1e

    goto/16 :goto_9

    .line 489
    :cond_1e
    iget-boolean v3, v1, Ll/ܿܶ;->᩻:Z

    if-nez v3, :cond_1f

    iget-object v3, v0, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v10, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v3, v10, :cond_1f

    iget-object v3, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v10, v3, Ll/ܶ۠;->ܰ:I

    if-nez v10, :cond_1f

    .line 492
    invoke-virtual {v3}, Ll/ܶ۠;->ۙ()Z

    move-result v3

    if-nez v3, :cond_1f

    .line 494
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿܶ;

    .line 495
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿܶ;

    .line 496
    iget v3, v3, Ll/ܿܶ;->ܺ:I

    iget v4, v7, Ll/ܿܶ;->ܽ:I

    add-int/2addr v3, v4

    .line 497
    iget v2, v2, Ll/ܿܶ;->ܺ:I

    iget v4, v8, Ll/ܿܶ;->ܽ:I

    add-int/2addr v2, v4

    sub-int v4, v2, v3

    .line 500
    invoke-virtual {v7, v3}, Ll/ܿܶ;->֫(I)V

    .line 501
    invoke-virtual {v8, v2}, Ll/ܿܶ;->֫(I)V

    .line 502
    invoke-virtual {v1, v4}, Ll/ܳܶ;->֫(I)V

    return-void

    .line 506
    :cond_1f
    iget-boolean v3, v1, Ll/ܿܶ;->᩻:Z

    if-nez v3, :cond_21

    iget-object v3, v0, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v10, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v3, v10, :cond_21

    iget v3, v0, Ll/۠ܶ;->ܿ:I

    if-ne v3, v6, :cond_21

    .line 509
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_21

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_21

    .line 510
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿܶ;

    .line 511
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܿܶ;

    .line 512
    iget v3, v3, Ll/ܿܶ;->ܺ:I

    iget v10, v7, Ll/ܿܶ;->ܽ:I

    add-int/2addr v3, v10

    .line 513
    iget v6, v6, Ll/ܿܶ;->ܺ:I

    iget v10, v8, Ll/ܿܶ;->ܽ:I

    add-int/2addr v6, v10

    sub-int/2addr v6, v3

    .line 515
    iget v3, v1, Ll/ܳܶ;->ۖ:I

    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 516
    iget-object v6, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v10, v6, Ll/ܶ۠;->֫֫:I

    .line 517
    iget v6, v6, Ll/ܶ۠;->ܽ֫:I

    .line 518
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-lez v10, :cond_20

    .line 520
    invoke-static {v10, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 522
    :cond_20
    invoke-virtual {v1, v3}, Ll/ܳܶ;->֫(I)V

    .line 526
    :cond_21
    iget-boolean v3, v1, Ll/ܿܶ;->᩻:Z

    if-nez v3, :cond_22

    goto :goto_9

    .line 530
    :cond_22
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿܶ;

    .line 531
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿܶ;

    .line 532
    iget v4, v3, Ll/ܿܶ;->ܺ:I

    iget v6, v7, Ll/ܿܶ;->ܽ:I

    add-int/2addr v4, v6

    .line 533
    iget v6, v2, Ll/ܿܶ;->ܺ:I

    iget v9, v8, Ll/ܿܶ;->ܽ:I

    add-int/2addr v6, v9

    .line 534
    iget-object v9, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v9}, Ll/ܶ۠;->᩷()F

    move-result v9

    if-ne v3, v2, :cond_23

    .line 536
    iget v4, v3, Ll/ܿܶ;->ܺ:I

    .line 537
    iget v6, v2, Ll/ܿܶ;->ܺ:I

    const/high16 v9, 0x3f000000    # 0.5f

    :cond_23
    sub-int/2addr v6, v4

    .line 542
    iget v2, v1, Ll/ܿܶ;->ܺ:I

    sub-int/2addr v6, v2

    int-to-float v2, v4

    add-float/2addr v2, v5

    int-to-float v3, v6

    mul-float v3, v3, v9

    add-float/2addr v3, v2

    float-to-int v2, v3

    .line 543
    invoke-virtual {v7, v2}, Ll/ܿܶ;->֫(I)V

    .line 544
    iget v2, v7, Ll/ܿܶ;->ܺ:I

    iget v1, v1, Ll/ܿܶ;->ܺ:I

    add-int/2addr v2, v1

    invoke-virtual {v8, v2}, Ll/ܿܶ;->֫(I)V

    :cond_24
    :goto_9
    return-void

    .line 315
    :cond_25
    iget-object v1, v0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v3, v1, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v1, v1, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    invoke-virtual {v0, v3, v1, v2}, Ll/۠ܶ;->֫(Ll/ۚ۠;Ll/ۚ۠;I)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 548
    iget-object v0, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-boolean v1, v0, Ll/ܿܶ;->᩻:Z

    if-eqz v1, :cond_0

    .line 549
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v0, v0, Ll/ܿܶ;->ܺ:I

    invoke-virtual {v1, v0}, Ll/ܶ۠;->֡(I)V

    :cond_0
    return-void
.end method

.method public final ܳ()Z
    .locals 3

    .line 72
    iget-object v0, p0, Ll/۠ܶ;->ۧ:Ll/۠۠;

    sget-object v1, Ll/۠۠;->᩶:Ll/۠۠;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    .line 73
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v0, v0, Ll/ܶ۠;->ܰ:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Ll/۠ܶ;->ۜ:Ll/ۖܶ;

    .line 54
    iget-object v0, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v0}, Ll/ܿܶ;->֫()V

    .line 55
    iget-object v0, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-virtual {v0}, Ll/ܿܶ;->֫()V

    .line 56
    iget-object v0, p0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    invoke-virtual {v0}, Ll/ܿܶ;->֫()V

    const/4 v0, 0x0

    .line 57
    iput-boolean v0, p0, Ll/۠ܶ;->᩻:Z

    return-void
.end method

.method public final ᩻()V
    .locals 2

    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p0, Ll/۠ܶ;->᩻:Z

    .line 63
    iget-object v1, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v1}, Ll/ܿܶ;->֫()V

    .line 64
    iput-boolean v0, v1, Ll/ܿܶ;->᩻:Z

    .line 65
    iget-object v1, p0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-virtual {v1}, Ll/ܿܶ;->֫()V

    .line 66
    iput-boolean v0, v1, Ll/ܿܶ;->᩻:Z

    .line 67
    iget-object v1, p0, Ll/۠ܶ;->֫:Ll/ܳܶ;

    iput-boolean v0, v1, Ll/ܿܶ;->᩻:Z

    return-void
.end method
