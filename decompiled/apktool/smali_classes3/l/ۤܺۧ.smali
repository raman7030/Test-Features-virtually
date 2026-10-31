.class public final Ll/ۤܺۧ;
.super Ljava/lang/Object;
.source "V8RX"


# instance fields
.field public ֫:J

.field public ۧ:I

.field public final ܳ:[B

.field public ܽ:I

.field public ܿ:Ll/ۛܺۧ;

.field public final ᩳ:Ljava/util/ArrayDeque;

.field public final ᩻:Ll/֫ۖۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 65
    iput-object v0, p0, Ll/ۤܺۧ;->ܳ:[B

    .line 66
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۤܺۧ;->ᩳ:Ljava/util/ArrayDeque;

    .line 67
    new-instance v0, Ll/֫ۖۧ;

    invoke-direct {v0}, Ll/֫ۖۧ;-><init>()V

    iput-object v0, p0, Ll/ۤܺۧ;->᩻:Ll/֫ۖۧ;

    return-void
.end method

.method private ֫(Ll/۠᩷ۧ;I)J
    .locals 6

    .line 195
    iget-object v0, p0, Ll/ۤܺۧ;->ܳ:[B

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1, p2}, Ll/۠᩷ۧ;->readFully([BII)V

    const-wide/16 v2, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    const/16 p1, 0x8

    shl-long/2addr v2, p1

    .line 198
    aget-byte p1, v0, v1

    and-int/lit16 p1, p1, 0xff

    int-to-long v4, p1

    or-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 77
    iput v0, p0, Ll/ۤܺۧ;->ܽ:I

    .line 78
    iget-object v0, p0, Ll/ۤܺۧ;->ᩳ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 79
    iget-object v0, p0, Ll/ۤܺۧ;->᩻:Ll/֫ۖۧ;

    invoke-virtual {v0}, Ll/֫ۖۧ;->ۧ()V

    return-void
.end method

.method public final ֫(Ll/ۛܺۧ;)V
    .locals 0

    .line 72
    iput-object p1, p0, Ll/ۤܺۧ;->ܿ:Ll/ۛܺۧ;

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 13

    .line 84
    iget-object v0, p0, Ll/ۤܺۧ;->ܿ:Ll/ۛܺۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 86
    :goto_0
    iget-object v0, p0, Ll/ۤܺۧ;->ᩳ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ܺۧ;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 87
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v3

    invoke-static {v1}, Ll/۫ܺۧ;->֫(Ll/۫ܺۧ;)J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-ltz v1, :cond_0

    .line 88
    iget-object p1, p0, Ll/ۤܺۧ;->ܿ:Ll/ۛܺۧ;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ܺۧ;

    invoke-static {v0}, Ll/۫ܺۧ;->ۧ(Ll/۫ܺۧ;)I

    move-result v0

    check-cast p1, Ll/ۨܺۧ;

    .line 2049
    iget-object p1, p1, Ll/ۨܺۧ;->֫:Ll/ܰܺۧ;

    invoke-virtual {p1, v0}, Ll/ܰܺۧ;->֫(I)V

    return v2

    .line 92
    :cond_0
    iget v1, p0, Ll/ۤܺۧ;->ܽ:I

    iget-object v3, p0, Ll/ۤܺۧ;->᩻:Ll/֫ۖۧ;

    const/4 v4, 0x4

    const/4 v5, 0x0

    if-nez v1, :cond_5

    .line 93
    invoke-virtual {v3, p1, v2, v5, v4}, Ll/֫ۖۧ;->֫(Ll/۠᩷ۧ;ZZI)J

    move-result-wide v6

    const-wide/16 v8, -0x2

    cmp-long v1, v6, v8

    if-nez v1, :cond_3

    .line 171
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 173
    :goto_1
    iget-object v1, p0, Ll/ۤܺۧ;->ܳ:[B

    invoke-interface {p1, v5, v4, v1}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 174
    aget-byte v6, v1, v5

    invoke-static {v6}, Ll/֫ۖۧ;->֫(I)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_2

    if-gt v6, v4, :cond_2

    .line 176
    invoke-static {v1, v6, v5}, Ll/֫ۖۧ;->֫([BIZ)J

    move-result-wide v7

    long-to-int v1, v7

    .line 177
    iget-object v7, p0, Ll/ۤܺۧ;->ܿ:Ll/ۛܺۧ;

    check-cast v7, Ll/ۨܺۧ;

    .line 2038
    iget-object v7, v7, Ll/ۨܺۧ;->֫:Ll/ܰܺۧ;

    const v7, 0x1549a966

    if-eq v1, v7, :cond_1

    const v7, 0x1f43b675

    if-eq v1, v7, :cond_1

    const v7, 0x1c53bb6b

    if-eq v1, v7, :cond_1

    const v7, 0x1654ae6b

    if-ne v1, v7, :cond_2

    .line 178
    :cond_1
    invoke-interface {p1, v6}, Ll/۠᩷ۧ;->ܽ(I)V

    int-to-long v6, v1

    goto :goto_2

    .line 182
    :cond_2
    invoke-interface {p1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    goto :goto_1

    :cond_3
    :goto_2
    const-wide/16 v8, -0x1

    cmp-long v1, v6, v8

    if-nez v1, :cond_4

    return v5

    :cond_4
    long-to-int v1, v6

    .line 101
    iput v1, p0, Ll/ۤܺۧ;->ۧ:I

    .line 102
    iput v2, p0, Ll/ۤܺۧ;->ܽ:I

    .line 105
    :cond_5
    iget v1, p0, Ll/ۤܺۧ;->ܽ:I

    const/4 v6, 0x2

    if-ne v1, v2, :cond_6

    const/16 v1, 0x8

    .line 106
    invoke-virtual {v3, p1, v5, v2, v1}, Ll/֫ۖۧ;->֫(Ll/۠᩷ۧ;ZZI)J

    move-result-wide v7

    iput-wide v7, p0, Ll/ۤܺۧ;->֫:J

    .line 107
    iput v6, p0, Ll/ۤܺۧ;->ܽ:I

    .line 110
    :cond_6
    iget-object v1, p0, Ll/ۤܺۧ;->ܿ:Ll/ۛܺۧ;

    iget v3, p0, Ll/ۤܺۧ;->ۧ:I

    move-object v7, v1

    check-cast v7, Ll/ۨܺۧ;

    .line 2033
    iget-object v7, v7, Ll/ۨܺۧ;->֫:Ll/ܰܺۧ;

    const/4 v7, 0x3

    const/4 v8, 0x5

    sparse-switch v3, :sswitch_data_0

    const/4 v9, 0x0

    goto :goto_3

    :sswitch_0
    const/4 v9, 0x5

    goto :goto_3

    :sswitch_1
    const/4 v9, 0x4

    goto :goto_3

    :sswitch_2
    const/4 v9, 0x1

    goto :goto_3

    :sswitch_3
    const/4 v9, 0x3

    goto :goto_3

    :sswitch_4
    const/4 v9, 0x2

    :goto_3
    if-eqz v9, :cond_13

    if-eq v9, v2, :cond_12

    const-wide/16 v10, 0x8

    const/4 v0, 0x0

    if-eq v9, v6, :cond_10

    if-eq v9, v7, :cond_c

    if-eq v9, v4, :cond_b

    if-ne v9, v8, :cond_a

    .line 128
    iget-wide v6, p0, Ll/ۤܺۧ;->֫:J

    const-wide/16 v8, 0x4

    cmp-long v12, v6, v8

    if-eqz v12, :cond_8

    cmp-long v8, v6, v10

    if-nez v8, :cond_7

    goto :goto_4

    .line 130
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Invalid float size: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/ۤܺۧ;->֫:J

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :cond_8
    :goto_4
    long-to-int v0, v6

    .line 212
    invoke-direct {p0, p1, v0}, Ll/ۤܺۧ;->֫(Ll/۠᩷ۧ;I)J

    move-result-wide v6

    if-ne v0, v4, :cond_9

    long-to-int p1, v6

    .line 215
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    float-to-double v6, p1

    goto :goto_5

    .line 217
    :cond_9
    invoke-static {v6, v7}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v6

    .line 133
    :goto_5
    check-cast v1, Ll/ۨܺۧ;

    .line 2059
    iget-object p1, v1, Ll/ۨܺۧ;->֫:Ll/ܰܺۧ;

    invoke-virtual {p1, v3, v6, v7}, Ll/ܰܺۧ;->֫(ID)V

    .line 134
    iput v5, p0, Ll/ۤܺۧ;->ܽ:I

    return v2

    .line 153
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Invalid element type "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 145
    :cond_b
    iget-wide v6, p0, Ll/ۤܺۧ;->֫:J

    long-to-int v0, v6

    check-cast v1, Ll/ۨܺۧ;

    .line 2069
    iget-object v1, v1, Ll/ۨܺۧ;->֫:Ll/ܰܺۧ;

    invoke-virtual {v1, v3, v0, p1}, Ll/ܰܺۧ;->֫(IILl/۠᩷ۧ;)V

    .line 146
    iput v5, p0, Ll/ۤܺۧ;->ܽ:I

    return v2

    .line 137
    :cond_c
    iget-wide v6, p0, Ll/ۤܺۧ;->֫:J

    const-wide/32 v8, 0x7fffffff

    cmp-long v4, v6, v8

    if-gtz v4, :cond_f

    long-to-int v0, v6

    if-nez v0, :cond_d

    const-string p1, ""

    goto :goto_7

    .line 235
    :cond_d
    new-array v4, v0, [B

    .line 236
    invoke-interface {p1, v4, v5, v0}, Ll/۠᩷ۧ;->readFully([BII)V

    :goto_6
    if-lez v0, :cond_e

    add-int/lit8 p1, v0, -0x1

    .line 239
    aget-byte p1, v4, p1

    if-nez p1, :cond_e

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    .line 242
    :cond_e
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v4, v5, v0}, Ljava/lang/String;-><init>([BII)V

    .line 141
    :goto_7
    check-cast v1, Ll/ۨܺۧ;

    .line 2064
    iget-object v0, v1, Ll/ۨܺۧ;->֫:Ll/ܰܺۧ;

    invoke-virtual {v0, v3, p1}, Ll/ܰܺۧ;->֫(ILjava/lang/String;)V

    .line 142
    iput v5, p0, Ll/ۤܺۧ;->ܽ:I

    return v2

    .line 138
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "String element size: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/ۤܺۧ;->֫:J

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 120
    :cond_10
    iget-wide v6, p0, Ll/ۤܺۧ;->֫:J

    cmp-long v4, v6, v10

    if-gtz v4, :cond_11

    long-to-int v0, v6

    .line 124
    invoke-direct {p0, p1, v0}, Ll/ۤܺۧ;->֫(Ll/۠᩷ۧ;I)J

    move-result-wide v6

    check-cast v1, Ll/ۨܺۧ;

    .line 2054
    iget-object p1, v1, Ll/ۨܺۧ;->֫:Ll/ܰܺۧ;

    invoke-virtual {p1, v3, v6, v7}, Ll/ܰܺۧ;->֫(IJ)V

    .line 125
    iput v5, p0, Ll/ۤܺۧ;->ܽ:I

    return v2

    .line 121
    :cond_11
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Invalid integer size: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/ۤܺۧ;->֫:J

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 113
    :cond_12
    invoke-interface {p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v7

    .line 114
    iget-wide v3, p0, Ll/ۤܺۧ;->֫:J

    add-long/2addr v3, v7

    .line 115
    new-instance p1, Ll/۫ܺۧ;

    iget v1, p0, Ll/ۤܺۧ;->ۧ:I

    invoke-direct {p1, v1, v3, v4}, Ll/۫ܺۧ;-><init>(IJ)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 116
    iget-object p1, p0, Ll/ۤܺۧ;->ܿ:Ll/ۛܺۧ;

    iget v9, p0, Ll/ۤܺۧ;->ۧ:I

    iget-wide v10, p0, Ll/ۤܺۧ;->֫:J

    check-cast p1, Ll/ۨܺۧ;

    .line 2044
    iget-object v6, p1, Ll/ۨܺۧ;->֫:Ll/ܰܺۧ;

    invoke-virtual/range {v6 .. v11}, Ll/ܰܺۧ;->֫(JIJ)V

    .line 117
    iput v5, p0, Ll/ۤܺۧ;->ܽ:I

    return v2

    .line 149
    :cond_13
    iget-wide v0, p0, Ll/ۤܺۧ;->֫:J

    long-to-int v1, v0

    invoke-interface {p1, v1}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 150
    iput v5, p0, Ll/ۤܺۧ;->ܽ:I

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_4
        0x86 -> :sswitch_3
        0x88 -> :sswitch_4
        0x9b -> :sswitch_4
        0x9f -> :sswitch_4
        0xa0 -> :sswitch_2
        0xa1 -> :sswitch_1
        0xa3 -> :sswitch_1
        0xa5 -> :sswitch_1
        0xa6 -> :sswitch_2
        0xae -> :sswitch_2
        0xb0 -> :sswitch_4
        0xb3 -> :sswitch_4
        0xb5 -> :sswitch_0
        0xb7 -> :sswitch_2
        0xba -> :sswitch_4
        0xbb -> :sswitch_2
        0xd7 -> :sswitch_4
        0xe0 -> :sswitch_2
        0xe1 -> :sswitch_2
        0xe7 -> :sswitch_4
        0xee -> :sswitch_4
        0xf1 -> :sswitch_4
        0xfb -> :sswitch_4
        0x41e4 -> :sswitch_2
        0x41e7 -> :sswitch_4
        0x41ed -> :sswitch_1
        0x4254 -> :sswitch_4
        0x4255 -> :sswitch_1
        0x4282 -> :sswitch_3
        0x4285 -> :sswitch_4
        0x42f7 -> :sswitch_4
        0x4489 -> :sswitch_0
        0x47e1 -> :sswitch_4
        0x47e2 -> :sswitch_1
        0x47e7 -> :sswitch_2
        0x47e8 -> :sswitch_4
        0x4dbb -> :sswitch_2
        0x5031 -> :sswitch_4
        0x5032 -> :sswitch_4
        0x5034 -> :sswitch_2
        0x5035 -> :sswitch_2
        0x536e -> :sswitch_3
        0x53ab -> :sswitch_1
        0x53ac -> :sswitch_4
        0x53b8 -> :sswitch_4
        0x54b0 -> :sswitch_4
        0x54b2 -> :sswitch_4
        0x54ba -> :sswitch_4
        0x55aa -> :sswitch_4
        0x55b0 -> :sswitch_2
        0x55b2 -> :sswitch_4
        0x55b9 -> :sswitch_4
        0x55ba -> :sswitch_4
        0x55bb -> :sswitch_4
        0x55bc -> :sswitch_4
        0x55bd -> :sswitch_4
        0x55d0 -> :sswitch_2
        0x55d1 -> :sswitch_0
        0x55d2 -> :sswitch_0
        0x55d3 -> :sswitch_0
        0x55d4 -> :sswitch_0
        0x55d5 -> :sswitch_0
        0x55d6 -> :sswitch_0
        0x55d7 -> :sswitch_0
        0x55d8 -> :sswitch_0
        0x55d9 -> :sswitch_0
        0x55da -> :sswitch_0
        0x55ee -> :sswitch_4
        0x56aa -> :sswitch_4
        0x56bb -> :sswitch_4
        0x6240 -> :sswitch_2
        0x6264 -> :sswitch_4
        0x63a2 -> :sswitch_1
        0x6d80 -> :sswitch_2
        0x75a1 -> :sswitch_2
        0x75a2 -> :sswitch_4
        0x7670 -> :sswitch_2
        0x7671 -> :sswitch_4
        0x7672 -> :sswitch_1
        0x7673 -> :sswitch_0
        0x7674 -> :sswitch_0
        0x7675 -> :sswitch_0
        0x22b59c -> :sswitch_3
        0x23e383 -> :sswitch_4
        0x2ad7b1 -> :sswitch_4
        0x114d9b74 -> :sswitch_2
        0x1549a966 -> :sswitch_2
        0x1654ae6b -> :sswitch_2
        0x18538067 -> :sswitch_2
        0x1a45dfa3 -> :sswitch_2
        0x1c53bb6b -> :sswitch_2
        0x1f43b675 -> :sswitch_2
    .end sparse-switch
.end method
