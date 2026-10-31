.class public final Ll/ܶ۠ܽ;
.super Ljava/lang/Object;
.source "76V4"


# instance fields
.field public ֫:Z

.field public ۖ:I

.field public ۜ:I

.field public ۡ:Ll/۠۠ܽ;

.field public ۢ:Ljava/lang/CharSequence;

.field public ۧ:Z

.field public ܳ:I

.field public ܺ:Ll/ۖ۠ܽ;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:Z


# direct methods
.method private ֫(CII)I
    .locals 3

    .line 184
    iget-object v0, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    instance-of v1, v0, Ll/᩺۬ۡ;

    const/4 v2, -0x2

    if-eqz v1, :cond_5

    check-cast v0, Ll/᩺۬ۡ;

    .line 186
    iget-object v1, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    invoke-virtual {v1}, Ll/۠۠ܽ;->۫()V

    .line 187
    invoke-interface {v0, p1, p2, p3}, Ll/᩺۬ۡ;->indexOf(CII)I

    move-result p1

    if-ltz p1, :cond_0

    sub-int p2, p1, p2

    goto :goto_0

    :cond_0
    sub-int p2, p3, p2

    :goto_0
    const/16 p3, 0x400

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lt p2, p3, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 214
    :goto_1
    iget-object p3, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    invoke-virtual {p3}, Ll/۠۠ܽ;->ۧ()Z

    move-result p3

    if-nez p3, :cond_2

    if-eqz p2, :cond_3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 215
    :cond_2
    iput-boolean v1, p0, Ll/ܶ۠ܽ;->֫:Z

    .line 216
    iget-object p2, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    iput-boolean v0, p2, Ll/۠۠ܽ;->ܺ:Z

    const/4 v0, 0x1

    :cond_3
    if-eqz v0, :cond_4

    return v2

    :cond_4
    return p1

    :cond_5
    :goto_2
    if-ge p2, p3, :cond_8

    .line 192
    iget-object v0, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_6

    return p2

    .line 193
    :cond_6
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_7

    return v2

    :cond_7
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_8
    const/4 p1, -0x1

    return p1
.end method

.method private ֫(Z)I
    .locals 9

    .line 139
    iget v0, p0, Ll/ܶ۠ܽ;->ۜ:I

    iget-object v1, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v1, v1, Ll/ۖ۠ܽ;->᩷:Ll/ܺ۠ܽ;

    iget v1, v1, Ll/ܺ۠ܽ;->ܽ:I

    add-int/2addr v0, v1

    const/4 v1, 0x1

    add-int/2addr v0, v1

    if-nez p1, :cond_0

    .line 140
    iget-object v2, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    iget v2, v2, Ll/۠۠ܽ;->ܽ֫:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 141
    :cond_0
    :goto_0
    iget v2, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    const/4 v4, 0x0

    if-gt v2, v3, :cond_10

    .line 142
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_4

    .line 143
    :cond_1
    iget v2, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 144
    iget-object v3, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v3, v3, Ll/ۖ۠ܽ;->᩷:Ll/ܺ۠ܽ;

    iget v5, v3, Ll/ܺ۠ܽ;->ܽ:I

    add-int/2addr v5, v2

    const/4 v6, -0x2

    const/4 v7, -0x1

    if-lt v5, v0, :cond_2

    goto :goto_2

    .line 175
    :cond_2
    iget-boolean v8, v3, Ll/ܺ۠ܽ;->ۧ:Z

    if-eqz v8, :cond_3

    iget-char v3, v3, Ll/ܺ۠ܽ;->֫:C

    invoke-direct {p0, v3, v5, v0}, Ll/ܶ۠ܽ;->֫(CII)I

    move-result v7

    goto :goto_2

    :cond_3
    :goto_1
    if-ge v5, v0, :cond_6

    .line 177
    iget-object v3, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v3, v3, Ll/ۖ۠ܽ;->᩷:Ll/ܺ۠ܽ;

    iget-object v8, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    invoke-interface {v8, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-virtual {v3, v8}, Ll/ܺ۠ܽ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_4

    move v7, v5

    goto :goto_2

    .line 178
    :cond_4
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v7, -0x2

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    if-ne v7, v6, :cond_7

    goto/16 :goto_4

    :cond_7
    if-gez v7, :cond_8

    .line 146
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    return v4

    .line 147
    :cond_8
    iget-object v3, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v5, v3, Ll/ۖ۠ܽ;->᩷:Ll/ܺ۠ܽ;

    iget v5, v5, Ll/ܺ۠ܽ;->ܽ:I

    sub-int/2addr v7, v5

    iput v7, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 148
    iget v5, p0, Ll/ܶ۠ܽ;->ܽ:I

    const/16 v6, 0x40

    if-ge v5, v6, :cond_c

    add-int/lit8 v5, v5, 0x1

    .line 149
    iput v5, p0, Ll/ܶ۠ܽ;->ܽ:I

    .line 150
    iget v8, p0, Ll/ܶ۠ܽ;->ۖ:I

    sub-int/2addr v7, v2

    add-int/2addr v7, v8

    iput v7, p0, Ll/ܶ۠ܽ;->ۖ:I

    if-ne v5, v6, :cond_c

    const/16 v5, 0x80

    if-ge v7, v5, :cond_c

    if-nez p1, :cond_9

    .line 152
    iget-object p1, v3, Ll/ۖ۠ܽ;->֫:Ll/ۖ۠ܽ;

    if-eqz p1, :cond_9

    .line 154
    invoke-direct {p0, p1, v2}, Ll/ܶ۠ܽ;->֫(Ll/ۖ۠ܽ;I)V

    const/4 p1, 0x2

    return p1

    .line 199
    :cond_9
    iput v2, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 200
    iput-boolean v1, p0, Ll/ܶ۠ܽ;->᩻:Z

    .line 66
    iget p1, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-le v2, p1, :cond_a

    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    return v4

    .line 67
    :cond_a
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_b

    return v4

    .line 68
    :cond_b
    iget-object p1, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget p1, p1, Ll/ۖ۠ܽ;->ܽ:I

    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    invoke-direct {p0, p1, v0}, Ll/ܶ۠ܽ;->֫(II)V

    return v1

    :cond_c
    if-eqz p1, :cond_f

    const/4 v2, 0x0

    .line 162
    :goto_3
    iget-object v3, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget v5, v3, Ll/ۖ۠ܽ;->ۜ:I

    if-ge v2, v5, :cond_f

    .line 163
    iget-object v3, v3, Ll/ۖ۠ܽ;->᩻:Ll/ۧۚܽ;

    iget-object v5, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    iget v6, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v6, v2

    invoke-interface {v5, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-interface {v3, v5}, Ll/ۧۚܽ;->֫(I)Z

    move-result v3

    if-nez v3, :cond_d

    .line 168
    iget v2, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/ܶ۠ܽ;->᩷:I

    goto/16 :goto_0

    .line 164
    :cond_d
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_e

    :goto_4
    return v4

    :cond_e
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 167
    :cond_f
    iget-object p1, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget p1, p1, Ll/ۖ۠ܽ;->ܽ:I

    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    invoke-direct {p0, p1, v0}, Ll/ܶ۠ܽ;->֫(II)V

    return v1

    .line 170
    :cond_10
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    return v4
.end method

.method private ֫(II)V
    .locals 1

    .line 223
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    iput v0, p0, Ll/ܶ۠ܽ;->ܳ:I

    .line 224
    iput p2, p0, Ll/ܶ۠ܽ;->ܿ:I

    .line 225
    iput p1, p0, Ll/ܶ۠ܽ;->ᩳ:I

    const/4 p1, 0x1

    .line 226
    iput-boolean p1, p0, Ll/ܶ۠ܽ;->ۧ:Z

    return-void
.end method

.method private ֫(Ll/ۖ۠ܽ;I)V
    .locals 3

    .line 26
    iput-object p1, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    .line 27
    iput p2, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 28
    iget-object v0, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    iget v0, v0, Ll/۠۠ܽ;->ܽ֫:I

    iget v1, p1, Ll/ۖ۠ܽ;->ܳ:I

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ܶ۠ܽ;->ۜ:I

    const/4 v1, 0x0

    .line 29
    iput v1, p0, Ll/ܶ۠ܽ;->ۖ:I

    iput v1, p0, Ll/ܶ۠ܽ;->ܽ:I

    .line 30
    iput-boolean v1, p0, Ll/ܶ۠ܽ;->ۧ:Z

    .line 31
    iget p1, p1, Ll/ۖ۠ܽ;->ᩳ:I

    const/4 v2, 0x3

    if-ne p1, v2, :cond_0

    sub-int/2addr v0, p2

    add-int/lit8 v0, v0, 0x1

    const/16 p1, 0x80

    if-ge v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-boolean v1, p0, Ll/ܶ۠ܽ;->᩻:Z

    return-void
.end method

.method private ܽ()V
    .locals 2

    .line 231
    iget-object v0, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/۠۠ܽ;->ܺ:Z

    return-void
.end method

.method private ᩳ()Z
    .locals 3

    .line 206
    iget-object v0, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۤ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 207
    iput-boolean v0, p0, Ll/ܶ۠ܽ;->֫:Z

    .line 208
    iget-object v2, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    iput-boolean v1, v2, Ll/۠۠ܽ;->ܺ:Z

    return v0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 237
    iput-object v0, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    .line 238
    iput-object v0, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    .line 239
    iput-object v0, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ֫(Ll/ۖ۠ܽ;Ll/۠۠ܽ;Ljava/lang/CharSequence;I)V
    .locals 0

    .line 19
    iput-object p2, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    .line 20
    iput-object p3, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    const/4 p2, 0x0

    .line 21
    iput-boolean p2, p0, Ll/ܶ۠ܽ;->֫:Z

    .line 22
    invoke-direct {p0, p1, p4}, Ll/ܶ۠ܽ;->֫(Ll/ۖ۠ܽ;I)V

    return-void
.end method

.method public final ۧ()Z
    .locals 8

    .line 36
    iget-boolean v0, p0, Ll/ܶ۠ܽ;->ۧ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 37
    iput-boolean v1, p0, Ll/ܶ۠ܽ;->ۧ:Z

    .line 38
    iget-object v0, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget v0, v0, Ll/ۖ۠ܽ;->ᩳ:I

    const/4 v3, 0x4

    if-ne v0, v3, :cond_2

    iget-boolean v0, p0, Ll/ܶ۠ܽ;->᩻:Z

    if-nez v0, :cond_2

    .line 39
    iget-object v0, p0, Ll/ܶ۠ܽ;->ۡ:Ll/۠۠ܽ;

    iget v0, v0, Ll/۠۠ܽ;->ܽ֫:I

    .line 40
    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 41
    :cond_0
    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    if-ge v3, v0, :cond_1

    iget-object v4, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v4, v4, Ll/ۖ۠ܽ;->᩻:Ll/ۧۚܽ;

    iget-object v5, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    invoke-interface {v5, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-interface {v4, v3}, Ll/ۧۚܽ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 42
    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 43
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_d

    .line 46
    :cond_1
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܶ۠ܽ;->᩷:I

    goto :goto_0

    .line 47
    :cond_2
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 51
    :cond_3
    :goto_0
    iget-boolean v0, p0, Ll/ܶ۠ܽ;->᩻:Z

    if-eqz v0, :cond_6

    .line 66
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-le v0, v3, :cond_4

    :goto_1
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    goto/16 :goto_b

    .line 67
    :cond_4
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_b

    .line 68
    :cond_5
    iget-object v0, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget v0, v0, Ll/ۖ۠ܽ;->ܽ:I

    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    invoke-direct {p0, v0, v3}, Ll/ܶ۠ܽ;->֫(II)V

    goto/16 :goto_a

    .line 52
    :cond_6
    iget-object v0, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget v0, v0, Ll/ۖ۠ܽ;->ᩳ:I

    packed-switch v0, :pswitch_data_0

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown regex search plan"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :pswitch_0
    invoke-direct {p0, v2}, Ll/ܶ۠ܽ;->֫(Z)I

    move-result v0

    goto/16 :goto_c

    .line 57
    :pswitch_1
    invoke-direct {p0, v1}, Ll/ܶ۠ܽ;->֫(Z)I

    move-result v0

    goto/16 :goto_c

    .line 125
    :pswitch_2
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-gt v0, v3, :cond_a

    .line 126
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_b

    .line 127
    :cond_7
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-gt v0, v3, :cond_8

    iget-object v3, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v3, v3, Ll/ۖ۠ܽ;->᩻:Ll/ۧۚܽ;

    iget-object v4, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    invoke-interface {v4, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-interface {v3, v0}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_8

    .line 128
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 129
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_b

    .line 131
    :cond_8
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-le v0, v3, :cond_9

    goto :goto_2

    .line 132
    :cond_9
    iget-object v3, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget v3, v3, Ll/ۖ۠ܽ;->ܽ:I

    invoke-direct {p0, v3, v0}, Ll/ܶ۠ܽ;->֫(II)V

    goto/16 :goto_a

    .line 134
    :cond_a
    :goto_2
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    goto/16 :goto_b

    .line 98
    :pswitch_3
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-gt v0, v3, :cond_14

    .line 99
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_b

    goto/16 :goto_b

    .line 100
    :cond_b
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 101
    iget-object v3, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 120
    iget-object v4, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v4, v4, Ll/ۖ۠ܽ;->ۧ:[C

    array-length v5, v4

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_d

    aget-char v7, v4, v6

    if-ne v7, v3, :cond_c

    goto :goto_6

    :cond_c
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 103
    :cond_d
    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v4, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-gt v3, v4, :cond_10

    iget-object v4, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 120
    iget-object v4, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v4, v4, Ll/ۖ۠ܽ;->ۧ:[C

    array-length v5, v4

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v5, :cond_f

    aget-char v7, v4, v6

    if-ne v7, v3, :cond_e

    goto :goto_5

    :cond_e
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 104
    :cond_f
    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 105
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_d

    goto/16 :goto_b

    .line 107
    :cond_10
    :goto_5
    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v4, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-le v3, v4, :cond_11

    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    goto/16 :goto_b

    .line 109
    :cond_11
    :goto_6
    iget v3, p0, Ll/ܶ۠ܽ;->ܽ:I

    const/16 v4, 0x40

    if-ge v3, v4, :cond_13

    add-int/lit8 v3, v3, 0x1

    .line 110
    iput v3, p0, Ll/ܶ۠ܽ;->ܽ:I

    .line 111
    iget v5, p0, Ll/ܶ۠ܽ;->ۖ:I

    iget v6, p0, Ll/ܶ۠ܽ;->᩷:I

    sub-int/2addr v6, v0

    add-int/2addr v6, v5

    iput v6, p0, Ll/ܶ۠ܽ;->ۖ:I

    if-ne v3, v4, :cond_13

    const/16 v3, 0x80

    if-ge v6, v3, :cond_13

    .line 199
    iput v0, p0, Ll/ܶ۠ܽ;->᩷:I

    .line 200
    iput-boolean v2, p0, Ll/ܶ۠ܽ;->᩻:Z

    .line 66
    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-le v0, v3, :cond_12

    goto/16 :goto_1

    .line 67
    :cond_12
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_b

    .line 114
    :cond_13
    iget-object v0, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget v0, v0, Ll/ۖ۠ܽ;->ܽ:I

    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    invoke-direct {p0, v0, v3}, Ll/ܶ۠ܽ;->֫(II)V

    goto/16 :goto_a

    .line 116
    :cond_14
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    goto/16 :goto_b

    .line 89
    :goto_7
    :pswitch_4
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-gt v0, v3, :cond_17

    .line 90
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_15

    goto/16 :goto_b

    .line 91
    :cond_15
    iget-object v0, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v0, v0, Ll/ۖ۠ܽ;->᩻:Ll/ۧۚܽ;

    iget-object v3, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    iget v4, p0, Ll/ܶ۠ܽ;->᩷:I

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-interface {v0, v3}, Ll/ۧۚܽ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget v0, v0, Ll/ۖ۠ܽ;->ۢ:I

    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v3, v2

    invoke-direct {p0, v0, v3}, Ll/ܶ۠ܽ;->֫(II)V

    goto :goto_a

    .line 92
    :cond_16
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܶ۠ܽ;->᩷:I

    goto :goto_7

    .line 94
    :cond_17
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    goto :goto_b

    .line 72
    :goto_8
    :pswitch_5
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v3, p0, Ll/ܶ۠ܽ;->ۜ:I

    if-gt v0, v3, :cond_1e

    .line 73
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_b

    .line 74
    :cond_18
    iget-object v0, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v0, v0, Ll/ۖ۠ܽ;->ܿ:[I

    aget v0, v0, v1

    int-to-char v0, v0

    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    iget v4, p0, Ll/ܶ۠ܽ;->ۜ:I

    add-int/2addr v4, v2

    invoke-direct {p0, v0, v3, v4}, Ll/ܶ۠ܽ;->֫(CII)I

    move-result v0

    iput v0, p0, Ll/ܶ۠ܽ;->᩷:I

    const/4 v3, -0x2

    if-ne v0, v3, :cond_19

    goto :goto_b

    :cond_19
    if-gez v0, :cond_1a

    .line 76
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    goto :goto_b

    :cond_1a
    const/4 v0, 0x1

    .line 78
    :goto_9
    iget-object v3, p0, Ll/ܶ۠ܽ;->ܺ:Ll/ۖ۠ܽ;

    iget-object v4, v3, Ll/ۖ۠ܽ;->ܿ:[I

    array-length v5, v4

    if-ge v0, v5, :cond_1d

    .line 79
    aget v3, v4, v0

    iget-object v4, p0, Ll/ܶ۠ܽ;->ۢ:Ljava/lang/CharSequence;

    iget v5, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v5, v0

    invoke-interface {v4, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_1b

    .line 83
    iget v0, p0, Ll/ܶ۠ܽ;->᩷:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܶ۠ܽ;->᩷:I

    goto :goto_8

    .line 80
    :cond_1b
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_1c

    goto :goto_b

    :cond_1c
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    .line 82
    :cond_1d
    iget v0, v3, Ll/ۖ۠ܽ;->ۢ:I

    iget v3, p0, Ll/ܶ۠ܽ;->᩷:I

    array-length v4, v4

    add-int/2addr v3, v4

    invoke-direct {p0, v0, v3}, Ll/ܶ۠ܽ;->֫(II)V

    :goto_a
    const/4 v0, 0x1

    goto :goto_c

    .line 85
    :cond_1e
    invoke-direct {p0}, Ll/ܶ۠ܽ;->ܽ()V

    :goto_b
    const/4 v0, 0x0

    :goto_c
    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    if-ne v0, v2, :cond_1f

    return v2

    :cond_1f
    :goto_d
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
