.class public final Ll/ۛ᩷ۧ;
.super Ljava/lang/Object;
.source "08IU"


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public final ۡ:Ll/ۤ᩷ۧ;

.field public final ۢ:I

.field public final ۧ:I

.field public final ܳ:Ll/᩻᩵֫;

.field public final ܺ:J

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIIIIIJLl/ۤ᩷ۧ;Ll/᩻᩵֫;)V
    .locals 0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    iput p1, p0, Ll/ۛ᩷ۧ;->᩻:I

    .line 180
    iput p2, p0, Ll/ۛ᩷ۧ;->ᩳ:I

    .line 181
    iput p3, p0, Ll/ۛ᩷ۧ;->ۜ:I

    .line 182
    iput p4, p0, Ll/ۛ᩷ۧ;->ܿ:I

    .line 183
    iput p5, p0, Ll/ۛ᩷ۧ;->᩷:I

    .line 184
    invoke-static {p5}, Ll/ۛ᩷ۧ;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/ۛ᩷ۧ;->ۢ:I

    .line 185
    iput p6, p0, Ll/ۛ᩷ۧ;->ܽ:I

    .line 186
    iput p7, p0, Ll/ۛ᩷ۧ;->֫:I

    .line 187
    invoke-static {p7}, Ll/ۛ᩷ۧ;->֫(I)I

    move-result p1

    iput p1, p0, Ll/ۛ᩷ۧ;->ۧ:I

    .line 188
    iput-wide p8, p0, Ll/ۛ᩷ۧ;->ܺ:J

    .line 189
    iput-object p10, p0, Ll/ۛ᩷ۧ;->ۡ:Ll/ۤ᩷ۧ;

    .line 190
    iput-object p11, p0, Ll/ۛ᩷ۧ;->ܳ:Ll/᩻᩵֫;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 2

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    new-instance v0, Ll/ܽ֨֫;

    .line 48
    array-length v1, p1

    invoke-direct {v0, p1, v1}, Ll/ܽ֨֫;-><init>([BI)V

    mul-int/lit8 p2, p2, 0x8

    .line 128
    invoke-virtual {v0, p2}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 p1, 0x10

    .line 129
    invoke-virtual {v0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p2

    iput p2, p0, Ll/ۛ᩷ۧ;->᩻:I

    .line 130
    invoke-virtual {v0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/ۛ᩷ۧ;->ᩳ:I

    const/16 p1, 0x18

    .line 131
    invoke-virtual {v0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p2

    iput p2, p0, Ll/ۛ᩷ۧ;->ۜ:I

    .line 132
    invoke-virtual {v0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/ۛ᩷ۧ;->ܿ:I

    const/16 p1, 0x14

    .line 133
    invoke-virtual {v0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/ۛ᩷ۧ;->᩷:I

    .line 134
    invoke-static {p1}, Ll/ۛ᩷ۧ;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/ۛ᩷ۧ;->ۢ:I

    const/4 p1, 0x3

    .line 135
    invoke-virtual {v0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۛ᩷ۧ;->ܽ:I

    const/4 p1, 0x5

    .line 136
    invoke-virtual {v0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۛ᩷ۧ;->֫:I

    .line 137
    invoke-static {p1}, Ll/ۛ᩷ۧ;->֫(I)I

    move-result p1

    iput p1, p0, Ll/ۛ᩷ۧ;->ۧ:I

    const/16 p1, 0x24

    .line 138
    invoke-virtual {v0, p1}, Ll/ܽ֨֫;->ܽ(I)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۛ᩷ۧ;->ܺ:J

    const/4 p1, 0x0

    .line 139
    iput-object p1, p0, Ll/ۛ᩷ۧ;->ۡ:Ll/ۤ᩷ۧ;

    .line 140
    iput-object p1, p0, Ll/ۛ᩷ۧ;->ܳ:Ll/᩻᩵֫;

    return-void
.end method

.method public static ֫(I)I
    .locals 1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_5

    const/16 v0, 0xc

    if-eq p0, v0, :cond_4

    const/16 v0, 0x10

    if-eq p0, v0, :cond_3

    const/16 v0, 0x14

    if-eq p0, v0, :cond_2

    const/16 v0, 0x18

    if-eq p0, v0, :cond_1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 p0, 0x7

    return p0

    :cond_1
    const/4 p0, 0x6

    return p0

    :cond_2
    const/4 p0, 0x5

    return p0

    :cond_3
    const/4 p0, 0x4

    return p0

    :cond_4
    const/4 p0, 0x2

    return p0

    :cond_5
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(I)I
    .locals 0

    sparse-switch p0, :sswitch_data_0

    const/4 p0, -0x1

    return p0

    :sswitch_0
    const/4 p0, 0x3

    return p0

    :sswitch_1
    const/4 p0, 0x2

    return p0

    :sswitch_2
    const/16 p0, 0xb

    return p0

    :sswitch_3
    const/4 p0, 0x1

    return p0

    :sswitch_4
    const/16 p0, 0xa

    return p0

    :sswitch_5
    const/16 p0, 0x9

    return p0

    :sswitch_6
    const/16 p0, 0x8

    return p0

    :sswitch_7
    const/4 p0, 0x7

    return p0

    :sswitch_8
    const/4 p0, 0x6

    return p0

    :sswitch_9
    const/4 p0, 0x5

    return p0

    :sswitch_a
    const/4 p0, 0x4

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()J
    .locals 5

    const-wide/16 v0, 0x0

    .line 208
    iget-wide v2, p0, Ll/ۛ᩷ۧ;->ܺ:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    const-wide/32 v0, 0xf4240

    mul-long v2, v2, v0

    iget v0, p0, Ll/ۛ᩷ۧ;->᩷:I

    int-to-long v0, v0

    div-long/2addr v2, v0

    return-wide v2
.end method

.method public final ֫(Ljava/util/List;)Ll/ۛ᩷ۧ;
    .locals 13

    .line 308
    new-instance v0, Ll/᩻᩵֫;

    invoke-direct {v0, p1}, Ll/᩻᩵֫;-><init>(Ljava/util/List;)V

    .line 269
    iget-object p1, p0, Ll/ۛ᩷ۧ;->ܳ:Ll/᩻᩵֫;

    if-nez p1, :cond_0

    :goto_0
    move-object v12, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object v0

    goto :goto_0

    .line 309
    :goto_1
    new-instance p1, Ll/ۛ᩷ۧ;

    iget-wide v9, p0, Ll/ۛ᩷ۧ;->ܺ:J

    iget-object v11, p0, Ll/ۛ᩷ۧ;->ۡ:Ll/ۤ᩷ۧ;

    iget v2, p0, Ll/ۛ᩷ۧ;->᩻:I

    iget v3, p0, Ll/ۛ᩷ۧ;->ᩳ:I

    iget v4, p0, Ll/ۛ᩷ۧ;->ۜ:I

    iget v5, p0, Ll/ۛ᩷ۧ;->ܿ:I

    iget v6, p0, Ll/ۛ᩷ۧ;->᩷:I

    iget v7, p0, Ll/ۛ᩷ۧ;->ܽ:I

    iget v8, p0, Ll/ۛ᩷ۧ;->֫:I

    move-object v1, p1

    invoke-direct/range {v1 .. v12}, Ll/ۛ᩷ۧ;-><init>(IIIIIIIJLl/ۤ᩷ۧ;Ll/᩻᩵֫;)V

    return-object p1
.end method

.method public final ֫(Ll/ۤ᩷ۧ;)Ll/ۛ᩷ۧ;
    .locals 13

    .line 274
    new-instance v12, Ll/ۛ᩷ۧ;

    iget-wide v8, p0, Ll/ۛ᩷ۧ;->ܺ:J

    iget-object v11, p0, Ll/ۛ᩷ۧ;->ܳ:Ll/᩻᩵֫;

    iget v1, p0, Ll/ۛ᩷ۧ;->᩻:I

    iget v2, p0, Ll/ۛ᩷ۧ;->ᩳ:I

    iget v3, p0, Ll/ۛ᩷ۧ;->ۜ:I

    iget v4, p0, Ll/ۛ᩷ۧ;->ܿ:I

    iget v5, p0, Ll/ۛ᩷ۧ;->᩷:I

    iget v6, p0, Ll/ۛ᩷ۧ;->ܽ:I

    iget v7, p0, Ll/ۛ᩷ۧ;->֫:I

    move-object v0, v12

    move-object v10, p1

    invoke-direct/range {v0 .. v11}, Ll/ۛ᩷ۧ;-><init>(IIIIIIIJLl/ۤ᩷ۧ;Ll/᩻᩵֫;)V

    return-object v12
.end method

.method public final ֫([BLl/᩻᩵֫;)Ll/۠ᩴ֫;
    .locals 3

    const/4 v0, 0x4

    const/16 v1, -0x80

    .line 252
    aput-byte v1, p1, v0

    .line 253
    iget v0, p0, Ll/ۛ᩷ۧ;->ܿ:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 269
    :goto_0
    iget-object v1, p0, Ll/ۛ᩷ۧ;->ܳ:Ll/᩻᩵֫;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p2}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object p2

    .line 255
    :goto_1
    new-instance v1, Ll/֨ᩴ֫;

    invoke-direct {v1}, Ll/֨ᩴ֫;-><init>()V

    const-string v2, "audio/flac"

    .line 256
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 257
    invoke-virtual {v1, v0}, Ll/֨ᩴ֫;->ۖ(I)V

    iget v0, p0, Ll/ۛ᩷ۧ;->ܽ:I

    .line 258
    invoke-virtual {v1, v0}, Ll/֨ᩴ֫;->ᩳ(I)V

    iget v0, p0, Ll/ۛ᩷ۧ;->᩷:I

    .line 259
    invoke-virtual {v1, v0}, Ll/֨ᩴ֫;->۠(I)V

    .line 260
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 2233
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    iget v2, p0, Ll/ۛ᩷ۧ;->֫:I

    invoke-static {v2, v0}, Ll/ۘ֨֫;->֫(ILjava/nio/ByteOrder;)I

    move-result v0

    .line 260
    invoke-virtual {v1, v0}, Ll/֨ᩴ֫;->᩵(I)V

    .line 261
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 262
    invoke-virtual {v1, p2}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 263
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ljava/util/List;)Ll/ۛ᩷ۧ;
    .locals 12

    .line 291
    invoke-static {p1}, Ll/᩸ۢۧ;->֫(Ljava/util/List;)Ll/᩻᩵֫;

    move-result-object p1

    .line 269
    iget-object v0, p0, Ll/ۛ᩷ۧ;->ܳ:Ll/᩻᩵֫;

    if-nez v0, :cond_0

    :goto_0
    move-object v11, p1

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object p1

    goto :goto_0

    .line 292
    :goto_1
    new-instance p1, Ll/ۛ᩷ۧ;

    iget-wide v8, p0, Ll/ۛ᩷ۧ;->ܺ:J

    iget-object v10, p0, Ll/ۛ᩷ۧ;->ۡ:Ll/ۤ᩷ۧ;

    iget v1, p0, Ll/ۛ᩷ۧ;->᩻:I

    iget v2, p0, Ll/ۛ᩷ۧ;->ᩳ:I

    iget v3, p0, Ll/ۛ᩷ۧ;->ۜ:I

    iget v4, p0, Ll/ۛ᩷ۧ;->ܿ:I

    iget v5, p0, Ll/ۛ᩷ۧ;->᩷:I

    iget v6, p0, Ll/ۛ᩷ۧ;->ܽ:I

    iget v7, p0, Ll/ۛ᩷ۧ;->֫:I

    move-object v0, p1

    invoke-direct/range {v0 .. v11}, Ll/ۛ᩷ۧ;-><init>(IIIIIIIJLl/ۤ᩷ۧ;Ll/᩻᩵֫;)V

    return-object p1
.end method
