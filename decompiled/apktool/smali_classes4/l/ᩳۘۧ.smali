.class public final Ll/ᩳۘۧ;
.super Ljava/lang/Object;
.source "R8QR"


# static fields
.field public static final ܿ:Ll/ۗܶܺ;

.field public static final ᩳ:Ll/ۗܶܺ;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    .line 98
    invoke-static {v0}, Ll/ۗܶܺ;->֫(C)Ll/ۗܶܺ;

    move-result-object v0

    sput-object v0, Ll/ᩳۘۧ;->ܿ:Ll/ۗܶܺ;

    const/16 v0, 0x2a

    .line 99
    invoke-static {v0}, Ll/ۗܶܺ;->֫(C)Ll/ۗܶܺ;

    move-result-object v0

    sput-object v0, Ll/ᩳۘۧ;->ᩳ:Ll/ۗܶܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳۘۧ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 107
    iput v0, p0, Ll/ᩳۘۧ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ᩳۘۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 112
    iput v0, p0, Ll/ᩳۘۧ;->ۧ:I

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;Ljava/util/ArrayList;)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 120
    iget v3, v1, Ll/ᩳۘۧ;->ۧ:I

    const/4 v4, 0x1

    if-eqz v3, :cond_13

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eq v3, v4, :cond_11

    iget-object v4, v1, Ll/ᩳۘۧ;->֫:Ljava/util/ArrayList;

    const/16 v9, 0xb00

    const/16 v10, 0xb03

    const/16 v11, 0x890

    const/4 v12, 0x3

    if-eq v3, v6, :cond_c

    if-ne v3, v12, :cond_b

    .line 198
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v13

    .line 199
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v15

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v17

    sub-long v15, v15, v17

    iget v3, v1, Ll/ᩳۘۧ;->ܽ:I

    int-to-long v7, v3

    sub-long v7, v15, v7

    long-to-int v3, v7

    .line 200
    new-instance v7, Ll/ᩳ֨֫;

    invoke-direct {v7, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 201
    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v8

    invoke-interface {v0, v8, v5, v3}, Ll/۠᩷ۧ;->readFully([BII)V

    const/4 v0, 0x0

    const/16 v8, 0xb04

    .line 203
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_a

    .line 204
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۘۧ;

    .line 205
    iget-wide v5, v3, Ll/ܽۘۧ;->ۧ:J

    sub-long/2addr v5, v13

    long-to-int v6, v5

    .line 206
    invoke-virtual {v7, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v5, 0x4

    .line 210
    invoke-virtual {v7, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 211
    invoke-virtual {v7}, Ll/ᩳ֨֫;->᩷()I

    move-result v5

    .line 510
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v5, v6}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v15

    .line 255
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v17

    const/16 v18, -0x1

    sparse-switch v17, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v12, "Super_SlowMotion_BGM"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_0

    goto :goto_1

    :cond_0
    const/16 v18, 0x4

    goto :goto_1

    :sswitch_1
    const-string v12, "Super_SlowMotion_Deflickering_On"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    goto :goto_1

    :cond_1
    const/16 v18, 0x3

    goto :goto_1

    :sswitch_2
    const-string v12, "Super_SlowMotion_Data"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    goto :goto_1

    :cond_2
    const/16 v18, 0x2

    goto :goto_1

    :sswitch_3
    const-string v12, "Super_SlowMotion_Edit_Data"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_1

    :cond_3
    const/16 v18, 0x1

    goto :goto_1

    :sswitch_4
    const-string v12, "SlowMotion_Data"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_1

    :cond_4
    const/16 v18, 0x0

    :goto_1
    const/4 v12, 0x0

    packed-switch v18, :pswitch_data_0

    const-string v0, "Invalid SEF name"

    .line 267
    invoke-static {v0, v12}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :pswitch_0
    const/16 v15, 0xb01

    goto :goto_2

    :pswitch_1
    const/16 v15, 0xb04

    goto :goto_2

    :pswitch_2
    const/16 v15, 0xb00

    goto :goto_2

    :pswitch_3
    const/16 v15, 0xb03

    goto :goto_2

    :pswitch_4
    const/16 v15, 0x890

    .line 215
    :goto_2
    iget v3, v3, Ll/ܽۘۧ;->֫:I

    add-int/lit8 v5, v5, 0x8

    sub-int/2addr v3, v5

    if-eq v15, v11, :cond_7

    const/16 v5, 0xb01

    if-eq v15, v9, :cond_6

    if-eq v15, v5, :cond_6

    if-eq v15, v10, :cond_6

    if-ne v15, v8, :cond_5

    goto :goto_3

    .line 226
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_6
    :goto_3
    move-object/from16 v5, p3

    goto/16 :goto_5

    :cond_7
    const/16 v5, 0xb01

    .line 233
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 510
    invoke-virtual {v7, v3, v6}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    .line 235
    sget-object v6, Ll/ᩳۘۧ;->ᩳ:Ll/ۗܶܺ;

    invoke-virtual {v6, v3}, Ll/ۗܶܺ;->ۧ(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x0

    .line 236
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v15

    if-ge v6, v15, :cond_9

    .line 237
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/CharSequence;

    sget-object v5, Ll/ᩳۘۧ;->ܿ:Ll/ۗܶܺ;

    invoke-virtual {v5, v15}, Ll/ۗܶܺ;->ۧ(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v5

    .line 238
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v15

    const/4 v10, 0x3

    if-ne v15, v10, :cond_8

    const/4 v10, 0x0

    .line 242
    :try_start_0
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/String;

    invoke-static/range {v19 .. v19}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v21

    const/4 v10, 0x1

    .line 243
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v24

    const/4 v10, 0x2

    .line 244
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/4 v10, 0x1

    add-int/lit8 v5, v5, -0x1

    shl-int v23, v10, v5

    .line 246
    new-instance v5, Ll/ۘܺۧ;

    move-object/from16 v20, v5

    invoke-direct/range {v20 .. v25}, Ll/ۘܺۧ;-><init>(JIJ)V

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v6, v6, 0x1

    const/16 v5, 0xb01

    const/16 v10, 0xb03

    goto :goto_4

    :catch_0
    move-exception v0

    .line 248
    invoke-static {v12, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 239
    :cond_8
    invoke-static {v12, v12}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 251
    :cond_9
    new-instance v3, Ll/ᩴܺۧ;

    invoke-direct {v3, v8}, Ll/ᩴܺۧ;-><init>(Ljava/util/ArrayList;)V

    move-object/from16 v5, p3

    .line 218
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v0, v0, 0x1

    const/16 v8, 0xb04

    const/4 v5, 0x0

    const/16 v10, 0xb03

    const/4 v12, 0x3

    goto/16 :goto_0

    :cond_a
    const-wide/16 v3, 0x0

    .line 137
    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    return-void

    .line 140
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 162
    :cond_c
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v5

    .line 163
    iget v3, v1, Ll/ᩳۘۧ;->ܽ:I

    add-int/lit8 v3, v3, -0x14

    .line 164
    new-instance v7, Ll/ᩳ֨֫;

    invoke-direct {v7, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 165
    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v8

    const/4 v10, 0x0

    invoke-interface {v0, v8, v10, v3}, Ll/۠᩷ۧ;->readFully([BII)V

    const/4 v0, 0x0

    const/16 v8, 0xb01

    .line 167
    :goto_6
    div-int/lit8 v10, v3, 0xc

    if-ge v0, v10, :cond_f

    const/4 v10, 0x2

    .line 168
    invoke-virtual {v7, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 169
    invoke-virtual {v7}, Ll/ᩳ֨֫;->ۡ()S

    move-result v10

    if-eq v10, v11, :cond_d

    if-eq v10, v9, :cond_d

    if-eq v10, v8, :cond_d

    const/16 v8, 0xb03

    if-eq v10, v8, :cond_e

    const/16 v12, 0xb04

    if-eq v10, v12, :cond_e

    const/16 v10, 0x8

    .line 183
    invoke-virtual {v7, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    goto :goto_7

    :cond_d
    const/16 v8, 0xb03

    .line 178
    :cond_e
    iget v10, v1, Ll/ᩳۘۧ;->ܽ:I

    int-to-long v12, v10

    sub-long v12, v5, v12

    invoke-virtual {v7}, Ll/ᩳ֨֫;->᩷()I

    move-result v10

    int-to-long v8, v10

    sub-long/2addr v12, v8

    .line 179
    invoke-virtual {v7}, Ll/ᩳ֨֫;->᩷()I

    move-result v8

    .line 180
    new-instance v9, Ll/ܽۘۧ;

    invoke-direct {v9, v8, v12, v13}, Ll/ܽۘۧ;-><init>(IJ)V

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v0, v0, 0x1

    const/16 v8, 0xb01

    const/16 v9, 0xb00

    goto :goto_6

    .line 187
    :cond_f
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    const-wide/16 v3, 0x0

    .line 188
    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    return-void

    :cond_10
    const/4 v0, 0x3

    .line 192
    iput v0, v1, Ll/ᩳۘۧ;->ۧ:I

    const/4 v3, 0x0

    .line 193
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۘۧ;

    iget-wide v3, v0, Ll/ܽۘۧ;->ۧ:J

    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    return-void

    :cond_11
    const/4 v3, 0x0

    .line 147
    new-instance v4, Ll/ᩳ֨֫;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Ll/ᩳ֨֫;-><init>(I)V

    .line 148
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    invoke-interface {v0, v6, v3, v5}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 149
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    add-int/2addr v3, v5

    iput v3, v1, Ll/ᩳۘۧ;->ܽ:I

    .line 150
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    const v4, 0x53454654

    if-eq v3, v4, :cond_12

    const-wide/16 v3, 0x0

    .line 151
    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    return-void

    .line 157
    :cond_12
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v3

    iget v0, v1, Ll/ᩳۘۧ;->ܽ:I

    add-int/lit8 v0, v0, -0xc

    int-to-long v5, v0

    sub-long/2addr v3, v5

    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    const/4 v0, 0x2

    .line 158
    iput v0, v1, Ll/ᩳۘۧ;->ۧ:I

    return-void

    :cond_13
    const-wide/16 v3, 0x0

    .line 122
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v0, v5, v7

    if-eqz v0, :cond_15

    const-wide/16 v7, 0x8

    cmp-long v0, v5, v7

    if-gez v0, :cond_14

    goto :goto_8

    :cond_14
    sub-long v3, v5, v7

    .line 126
    :cond_15
    :goto_8
    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    const/4 v0, 0x1

    .line 127
    iput v0, v1, Ll/ᩳۘۧ;->ۧ:I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
