.class public final Ll/᩵۟ۚ;
.super Ljava/lang/Object;
.source "L7ER"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ۗ:I

.field public ۙ:Ll/ۛۛۚ;

.field public ۛ:Ll/ۛۛۚ;

.field public ۤ:Ll/ۛۛۚ;

.field public ۫:J

.field public ۬:I

.field public final ᩶:Z

.field public ᩸:Ll/᩺۬ۚ;

.field public final ᩹:Ll/ۘۨۚ;


# direct methods
.method public constructor <init>(Ll/ۘۨۚ;Z)V
    .locals 2

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 47
    iput-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    const/4 v0, -0x1

    .line 63
    iput v0, p0, Ll/᩵۟ۚ;->۬:I

    .line 64
    iput v0, p0, Ll/᩵۟ۚ;->ۗ:I

    .line 65
    sget-object v0, Ll/᩺۬ۚ;->ܿ֫:Ll/᩺۬ۚ;

    iput-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    .line 76
    iput-object p1, p0, Ll/᩵۟ۚ;->᩹:Ll/ۘۨۚ;

    .line 77
    iput-boolean p2, p0, Ll/᩵۟ۚ;->᩶:Z

    return-void
.end method

.method public static varargs ֫([Ll/ۛۛۚ;)Z
    .locals 4

    .line 198
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final getLength()I
    .locals 4

    .line 208
    invoke-virtual {p0}, Ll/᩵۟ۚ;->ᩳ()Z

    move-result v0

    iget-boolean v1, p0, Ll/᩵۟ۚ;->᩶:Z

    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    .line 211
    :cond_0
    sget-object v0, Ll/᩺۬ۚ;->ܰ:Ll/᩺۬ۚ;

    iput-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    .line 213
    :cond_1
    sget-object v0, Ll/ۖ۟ۚ;->֫:[I

    iget-object v2, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x0

    const/4 v3, 0x2

    packed-switch v0, :pswitch_data_0

    return v1

    :pswitch_0
    add-int/2addr v1, v3

    .line 236
    iget-object v0, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    if-nez v0, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ll/ۛۛۚ;->ۧ()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    .line 237
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ll/ۛۛۚ;->ۧ()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    return v1

    .line 232
    :pswitch_1
    iget-object v0, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ll/ۛۛۚ;->ۧ()I

    move-result v0

    goto :goto_2

    :pswitch_2
    add-int/2addr v1, v3

    return v1

    .line 220
    :pswitch_3
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    invoke-virtual {v0}, Ll/ۛۛۚ;->ۧ()I

    move-result v0

    goto :goto_4

    .line 223
    :pswitch_4
    iget-object v0, p0, Ll/᩵۟ۚ;->ۛ:Ll/ۛۛۚ;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Ll/ۛۛۚ;->ۧ()I

    move-result v0

    :goto_2
    add-int/lit8 v2, v0, -0x2

    :goto_3
    add-int/2addr v2, v3

    add-int/2addr v2, v1

    return v2

    .line 217
    :pswitch_5
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    invoke-virtual {v0}, Ll/ۛۛۚ;->ۧ()I

    move-result v0

    sub-int/2addr v0, v3

    :goto_4
    add-int/2addr v0, v1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()Ll/ܶۨۚ;
    .locals 4

    .line 156
    sget-object v0, Ll/ۖ۟ۚ;->֫:[I

    iget-object v1, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 183
    :pswitch_0
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    if-ne v0, v3, :cond_0

    .line 184
    sget-object v0, Ll/ܶۨۚ;->۟ᩳ:Ll/ܶۨۚ;

    return-object v0

    .line 186
    :cond_0
    iget-object v0, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    new-array v3, v2, [Ll/ۛۛۚ;

    aput-object v0, v3, v1

    invoke-static {v3}, Ll/᩵۟ۚ;->֫([Ll/ۛۛۚ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 187
    sget-object v0, Ll/ܶۨۚ;->ܿᩳ:Ll/ܶۨۚ;

    return-object v0

    .line 189
    :cond_1
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    new-array v2, v2, [Ll/ۛۛۚ;

    aput-object v0, v2, v1

    invoke-static {v2}, Ll/᩵۟ۚ;->֫([Ll/ۛۛۚ;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 190
    sget-object v0, Ll/ܶۨۚ;->۟ܿ:Ll/ܶۨۚ;

    return-object v0

    .line 177
    :pswitch_1
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    if-ne v0, v3, :cond_2

    .line 178
    sget-object v0, Ll/ܶۨۚ;->۟ᩳ:Ll/ܶۨۚ;

    return-object v0

    .line 180
    :cond_2
    iget-object v0, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    new-array v2, v2, [Ll/ۛۛۚ;

    aput-object v0, v2, v1

    invoke-static {v2}, Ll/᩵۟ۚ;->֫([Ll/ۛۛۚ;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Ll/ܶۨۚ;->ܿᩳ:Ll/ܶۨۚ;

    return-object v0

    .line 174
    :pswitch_2
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    if-ne v0, v3, :cond_8

    sget-object v0, Ll/ܶۨۚ;->۟ᩳ:Ll/ܶۨۚ;

    return-object v0

    .line 167
    :pswitch_3
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    if-ne v0, v3, :cond_4

    .line 168
    sget-object v0, Ll/ܶۨۚ;->۟ᩳ:Ll/ܶۨۚ;

    return-object v0

    .line 170
    :cond_4
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    new-array v2, v2, [Ll/ۛۛۚ;

    aput-object v0, v2, v1

    invoke-static {v2}, Ll/᩵۟ۚ;->֫([Ll/ۛۛۚ;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    sget-object v0, Ll/ܶۨۚ;->۟ܿ:Ll/ܶۨۚ;

    return-object v0

    .line 164
    :pswitch_4
    iget-object v0, p0, Ll/᩵۟ۚ;->ۛ:Ll/ۛۛۚ;

    new-array v2, v2, [Ll/ۛۛۚ;

    aput-object v0, v2, v1

    invoke-static {v2}, Ll/᩵۟ۚ;->֫([Ll/ۛۛۚ;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    sget-object v0, Ll/ܶۨۚ;->ۙܳ:Ll/ܶۨۚ;

    return-object v0

    .line 161
    :pswitch_5
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    new-array v2, v2, [Ll/ۛۛۚ;

    aput-object v0, v2, v1

    invoke-static {v2}, Ll/᩵۟ۚ;->֫([Ll/ۛۛۚ;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    sget-object v0, Ll/ܶۨۚ;->۟ܿ:Ll/ܶۨۚ;

    return-object v0

    :cond_8
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(I)V
    .locals 0

    .line 86
    iput p1, p0, Ll/᩵۟ۚ;->ۗ:I

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 122
    iput-wide p1, p0, Ll/᩵۟ۚ;->۫:J

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 4

    .line 96
    new-instance v0, Ll/ܺ۟ۚ;

    invoke-direct {v0, p0}, Ll/ܺ۟ۚ;-><init>(Ll/᩵۟ۚ;)V

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    .line 88
    invoke-static {p1}, Ll/᩺۬ۚ;->֫(Ljava/lang/String;)Ll/᩺۬ۚ;

    move-result-object v0

    .line 98
    iput-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    .line 99
    sget-object v1, Ll/᩺۬ۚ;->ܿ֫:Ll/᩺۬ۚ;

    if-ne v0, v1, :cond_0

    .line 100
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    iget-object p1, p0, Ll/᩵۟ۚ;->᩹:Ll/ۘۨۚ;

    const-string v3, "Unknown entry type \"{0}\" of the StackMapTable"

    invoke-virtual {p1, v0, v1, v3, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 9

    .line 246
    iget-boolean v0, p0, Ll/᩵۟ۚ;->᩶:Z

    if-nez v0, :cond_0

    .line 262
    sget-object v1, Ll/᩺۬ۚ;->ܰ:Ll/᩺۬ۚ;

    iput-object v1, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    .line 265
    :cond_0
    sget-object v1, Ll/ۖ۟ۚ;->֫:[I

    iget-object v2, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x2

    const-string v3, "Offset value {0} is not valid  for the \"{1}\" entry type"

    const-string v4, "Should be only one stack map element for the \"{0}\" entry type"

    const-string v5, "Locals map element for the \"{0}\" entry type is absent"

    const/4 v6, 0x1

    const/4 v7, 0x0

    iget-object v8, p0, Ll/᩵۟ۚ;->᩹:Ll/ۘۨۚ;

    packed-switch v1, :pswitch_data_0

    .line 360
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget-object p1, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {p1}, Ll/᩺۬ۚ;->֫()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v7

    const-string p1, "StackMap entry type is not set"

    invoke-virtual {v8, v0, v1, p1, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    :pswitch_0
    if-eqz v0, :cond_1

    .line 343
    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v0}, Ll/᩺۬ۚ;->֫()I

    move-result v0

    move-object v1, p1

    check-cast v1, Ll/ۛ۫ۚ;

    invoke-virtual {v1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 344
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    invoke-virtual {v1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_0

    .line 347
    :cond_1
    iget v0, p0, Ll/᩵۟ۚ;->۬:I

    move-object v1, p1

    check-cast v1, Ll/ۛ۫ۚ;

    invoke-virtual {v1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 349
    :goto_0
    iget-object v0, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    if-nez v0, :cond_2

    .line 350
    move-object v0, p1

    check-cast v0, Ll/ۛ۫ۚ;

    invoke-virtual {v0, v7}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_1

    .line 352
    :cond_2
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    .line 354
    :goto_1
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    if-nez v0, :cond_3

    .line 355
    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v7}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void

    .line 357
    :cond_3
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    return-void

    .line 328
    :pswitch_1
    iget-object v0, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    if-nez v0, :cond_4

    .line 329
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget-object p1, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {p1}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v7

    invoke-virtual {v8, v0, v1, v5, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 332
    :cond_4
    iget-object v0, v0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_5

    .line 333
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    const-string p1, "There are more than locals map elements for the \"append_frame\" entry type"

    new-array v2, v7, [Ljava/lang/Object;

    invoke-virtual {v8, v0, v1, p1, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 336
    :cond_5
    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v0}, Ll/᩺۬ۚ;->֫()I

    move-result v0

    iget-object v1, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    iget-object v1, v1, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v1, v0

    sub-int/2addr v1, v6

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->֫(I)V

    .line 337
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 338
    iget-object v0, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->ۧ(Ll/֡۫ۚ;)V

    return-void

    .line 313
    :pswitch_2
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    if-eqz v0, :cond_6

    .line 314
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget-object v2, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v2}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v2, v3, v7

    const-string v2, "There are unexpected stack maps for the \"{0}\" entry type"

    invoke-virtual {v8, v0, v1, v2, v3}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    .line 317
    :goto_2
    iget-object v1, p0, Ll/᩵۟ۚ;->ۙ:Ll/ۛۛۚ;

    if-eqz v1, :cond_7

    .line 318
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget-object v2, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v2}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v2, v3, v7

    const-string v2, "There are unexpected locals maps for the \"{0}\" entry type"

    invoke-virtual {v8, v0, v1, v2, v3}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    move v6, v0

    :goto_3
    if-eqz v6, :cond_8

    return-void

    .line 324
    :cond_8
    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v0}, Ll/᩺۬ۚ;->֫()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 325
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void

    .line 299
    :pswitch_3
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    if-nez v0, :cond_9

    .line 300
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget-object p1, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {p1}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v7

    invoke-virtual {v8, v0, v1, v5, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 303
    :cond_9
    iget-object v0, v0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq v0, v6, :cond_a

    .line 304
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget-object p1, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {p1}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v7

    invoke-virtual {v8, v0, v1, v4, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 307
    :cond_a
    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v0}, Ll/᩺۬ۚ;->֫()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 308
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 309
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->ۧ(Ll/֡۫ۚ;)V

    return-void

    .line 267
    :pswitch_4
    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v0}, Ll/᩺۬ۚ;->֫()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 268
    iget-object v0, p0, Ll/᩵۟ۚ;->ۛ:Ll/ۛۛۚ;

    if-nez v0, :cond_b

    .line 269
    invoke-virtual {p1, v7}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void

    .line 271
    :cond_b
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    return-void

    .line 282
    :pswitch_5
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    if-nez v0, :cond_c

    .line 283
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget-object p1, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {p1}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v7

    const-string p1, "Stack map element for the \"{0}\" entry type is absent"

    invoke-virtual {v8, v0, v1, p1, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 286
    :cond_c
    iget-object v0, v0, Ll/ۛۛۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq v0, v6, :cond_d

    .line 287
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget-object p1, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {p1}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v7

    invoke-virtual {v8, v0, v1, v4, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 291
    :cond_d
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    const/16 v1, 0x40

    if-lt v0, v1, :cond_e

    .line 292
    iget-wide v4, p0, Ll/᩵۟ۚ;->۫:J

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v0}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v7

    aput-object v0, v1, v6

    invoke-virtual {v8, v4, v5, v3, v1}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 295
    :cond_e
    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v0}, Ll/᩺۬ۚ;->֫()I

    move-result v0

    iget v1, p0, Ll/᩵۟ۚ;->ۗ:I

    add-int/2addr v0, v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 296
    iget-object v0, p0, Ll/᩵۟ۚ;->ۤ:Ll/ۛۛۚ;

    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->ۧ(Ll/֡۫ۚ;)V

    return-void

    .line 275
    :pswitch_6
    sget-object v0, Ll/᩺۬ۚ;->֫֫:Ll/᩺۬ۚ;

    iget v1, p0, Ll/᩵۟ۚ;->ۗ:I

    invoke-virtual {v0, v1}, Ll/᩺۬ۚ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_f

    .line 276
    iget-wide v0, p0, Ll/᩵۟ۚ;->۫:J

    iget p1, p0, Ll/᩵۟ۚ;->ۗ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v4, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    invoke-virtual {v4}, Ll/᩺۬ۚ;->᩷()Ljava/lang/String;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v7

    aput-object v4, v2, v6

    invoke-virtual {v8, v0, v1, v3, v2}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 279
    :cond_f
    iget v0, p0, Ll/᩵۟ۚ;->ۗ:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/᩵۟ۚ;)V
    .locals 1

    if-nez p1, :cond_0

    .line 81
    iget p1, p0, Ll/᩵۟ۚ;->۬:I

    goto :goto_0

    :cond_0
    iget v0, p0, Ll/᩵۟ۚ;->۬:I

    iget p1, p1, Ll/᩵۟ۚ;->۬:I

    sub-int/2addr v0, p1

    add-int/lit8 p1, v0, -0x1

    :goto_0
    iput p1, p0, Ll/᩵۟ۚ;->ۗ:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 91
    iput p1, p0, Ll/᩵۟ۚ;->۬:I

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 147
    invoke-virtual {p0}, Ll/᩵۟ۚ;->ܿ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܽ()Ll/᩺۬ۚ;
    .locals 1

    .line 365
    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 2

    .line 112
    invoke-static {p1}, Ll/᩺۬ۚ;->ۧ(I)Ll/᩺۬ۚ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    .line 113
    sget-object v1, Ll/᩺۬ۚ;->֫֫:Ll/᩺۬ۚ;

    if-ne v0, v1, :cond_0

    .line 114
    iput p1, p0, Ll/᩵۟ۚ;->ۗ:I

    return-void

    .line 115
    :cond_0
    sget-object v1, Ll/᩺۬ۚ;->ܽ֫:Ll/᩺۬ۚ;

    if-ne v0, v1, :cond_1

    .line 116
    invoke-virtual {v1}, Ll/᩺۬ۚ;->֫()I

    move-result v0

    sub-int/2addr p1, v0

    iput p1, p0, Ll/᩵۟ۚ;->ۗ:I

    :cond_1
    return-void
.end method

.method public final ܿ()Z
    .locals 2

    .line 142
    iget-boolean v0, p0, Ll/᩵۟ۚ;->᩶:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    sget-object v1, Ll/᩺۬ۚ;->᩺:Ll/᩺۬ۚ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 4

    .line 132
    iget-boolean v0, p0, Ll/᩵۟ۚ;->᩶:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵۟ۚ;->᩸:Ll/᩺۬ۚ;

    sget-object v3, Ll/᩺۬ۚ;->ܿ֫:Ll/᩺۬ۚ;

    if-eq v0, v3, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    iget v0, p0, Ll/᩵۟ۚ;->۬:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_2

    return v2

    :cond_2
    return v1
.end method
