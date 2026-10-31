.class public abstract Ll/ᩳۡᩳ;
.super Ll/ܽۡᩳ;
.source "P1WW"


# instance fields
.field public ۖ:Ll/᩵ۢᩳ;

.field public final ۡ:Ljava/lang/String;

.field public final ܺ:Z


# direct methods
.method public constructor <init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Ll/ܽۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V

    if-eqz p4, :cond_0

    .line 29
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "[ZIJDFCSB]*"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۡᩳ;->ۡ:Ljava/lang/String;

    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Ll/ᩳۡᩳ;->ܺ:Z

    return-void

    .line 32
    :cond_0
    iput-object p3, p0, Ll/ᩳۡᩳ;->ۡ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Ll/ᩳۡᩳ;->ܺ:Z

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܿۡᩳ;)Ljava/util/List;
    .locals 6

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 228
    iget-object p1, p1, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {p1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩷ۚ;

    .line 43
    invoke-virtual {p0, v1}, Ll/ᩳۡᩳ;->֫(Ll/֡᩷ۚ;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1}, Ll/֡᩷ۚ;->ۧܽ()Ll/᩻۫ܺ;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۢۚ;

    .line 48
    invoke-virtual {p0, v2}, Ll/ᩳۡᩳ;->֫(Ll/֨ۢۚ;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 52
    :cond_3
    invoke-virtual {v2}, Ll/֨ۢۚ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Ljava/lang/String;"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    .line 56
    :cond_4
    invoke-static {v2}, Ll/ۙۢᩳ;->֫(Ll/ۚܽۚ;)Ljava/lang/String;

    move-result-object v3

    .line 81
    iget-boolean v4, p0, Ll/ᩳۡᩳ;->ܺ:Z

    iget-object v5, p0, Ll/ᩳۡᩳ;->ۡ:Ljava/lang/String;

    if-eqz v4, :cond_5

    .line 82
    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    goto :goto_2

    .line 84
    :cond_5
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-nez v3, :cond_6

    goto :goto_1

    .line 61
    :cond_6
    invoke-virtual {v2}, Ll/֨ۢۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 62
    invoke-virtual {p0, v2, v3}, Ll/ᩳۡᩳ;->֫(Ll/֨ۢۚ;Ll/᩵֫ۚ;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_1

    .line 66
    :cond_7
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    return-object v0
.end method

.method public ֫(Ll/֡᩷ۚ;)Z
    .locals 2

    .line 88
    sget-object v0, Ll/ܺۗ֡;->ܿ֫:Ll/ܺۗ֡;

    invoke-virtual {p1}, Ll/֡᩷ۚ;->ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ܺۗ֡;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Ljava/lang/Object;"

    .line 73
    invoke-virtual {p1}, Ll/֡᩷ۚ;->ۜܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ֫(Ll/֨ۢۚ;)Z
    .locals 2

    .line 92
    sget-object v0, Ll/ܺۗ֡;->ܿ֫:Ll/ܺۗ֡;

    invoke-virtual {p1}, Ll/֨ۢۚ;->ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ܺۗ֡;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    sget-object v0, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {p1}, Ll/֨ۢۚ;->ܽ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ܺۗ֡;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ֫(Ll/֨ۢۚ;Ll/᩵֫ۚ;)Z
    .locals 16

    move-object/from16 v0, p0

    .line 91
    new-instance v1, Ll/᩵ۢᩳ;

    iget-object v2, v0, Ll/᩻ۡᩳ;->֫:Ll/ܿۡᩳ;

    invoke-direct {v1, v2}, Ll/᩵ۢᩳ;-><init>(Ll/ܿۡᩳ;)V

    iput-object v1, v0, Ll/ᩳۡᩳ;->ۖ:Ll/᩵ۢᩳ;

    move-object/from16 v3, p1

    .line 92
    invoke-virtual {v1, v3}, Ll/᩵ۢᩳ;->֫(Ll/֨ۢۚ;)V

    .line 94
    iget-object v1, v0, Ll/ᩳۡᩳ;->ۖ:Ll/᩵ۢᩳ;

    invoke-virtual {v1}, Ll/᩵ۢᩳ;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚܽۚ;

    .line 95
    invoke-interface {v3}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v4

    .line 96
    iget-boolean v5, v2, Ll/ܿۡᩳ;->ܳ:Z

    const-string v6, "Ljava/net/URL;"

    const-string v7, "Ljava/net/HttpURLConnection;"

    const-string v8, "Ljava/net/InetAddress;"

    const-string v9, "Lorg/json/JSONObject;"

    const-string v10, "Landroid/graphics/"

    const-string v11, "Landroid/view/"

    const-string v12, "Ljavax/xml/"

    const-string v13, "Lorg/json/"

    const-string v14, "Lorg/xml/"

    const-string v15, "Ljava/util/concurrent/"

    if-eqz v5, :cond_a

    .line 322
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x3

    goto :goto_1

    :sswitch_1
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x2

    goto :goto_1

    :sswitch_2
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x1

    goto :goto_1

    :sswitch_3
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    goto :goto_1

    :goto_0
    const/4 v5, -0x1

    :goto_1
    packed-switch v5, :pswitch_data_0

    .line 329
    invoke-virtual {v4, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_4

    .line 331
    :cond_5
    invoke-virtual {v4, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_4

    .line 333
    :cond_6
    invoke-virtual {v4, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto/16 :goto_4

    .line 335
    :cond_7
    invoke-virtual {v4, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto/16 :goto_4

    .line 337
    :cond_8
    invoke-virtual {v4, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    goto/16 :goto_4

    .line 339
    :cond_9
    invoke-virtual {v4, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1f

    goto/16 :goto_4

    .line 342
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_1

    goto/16 :goto_2

    :sswitch_4
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_2

    :cond_b
    const/16 v5, 0xa

    goto/16 :goto_3

    :sswitch_5
    const-string v5, "Ljava/io/FileOutputStream;"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    goto/16 :goto_2

    :cond_c
    const/16 v5, 0x9

    goto/16 :goto_3

    :sswitch_6
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto/16 :goto_2

    :cond_d
    const/16 v5, 0x8

    goto/16 :goto_3

    :sswitch_7
    const-string v5, "Ljava/io/FileInputStream;"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_2

    :cond_e
    const/4 v5, 0x7

    goto :goto_3

    :sswitch_8
    const-string v5, "Ljava/util/Date;"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    goto :goto_2

    :cond_f
    const/4 v5, 0x6

    goto :goto_3

    :sswitch_9
    const-string v5, "Ljava/io/File;"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    goto :goto_2

    :cond_10
    const/4 v5, 0x5

    goto :goto_3

    :sswitch_a
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto :goto_2

    :cond_11
    const/4 v5, 0x4

    goto :goto_3

    :sswitch_b
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_2

    :cond_12
    const/4 v5, 0x3

    goto :goto_3

    :sswitch_c
    const-string v5, "Ljava/util/Calendar;"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    goto :goto_2

    :cond_13
    const/4 v5, 0x2

    goto :goto_3

    :sswitch_d
    const-string v5, "Ljava/text/SimpleDateFormat;"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    goto :goto_2

    :cond_14
    const/4 v5, 0x1

    goto :goto_3

    :sswitch_e
    const-string v5, "Ljava/io/RandomAccessFile;"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    goto :goto_2

    :cond_15
    const/4 v5, 0x0

    goto :goto_3

    :goto_2
    const/4 v5, -0x1

    :goto_3
    packed-switch v5, :pswitch_data_1

    const-string v5, "Ljava/nio/file/"

    .line 356
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_16

    :goto_4
    :pswitch_0
    const/4 v1, 0x0

    goto/16 :goto_5

    .line 358
    :cond_16
    invoke-virtual {v4, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_17

    goto :goto_4

    .line 360
    :cond_17
    invoke-virtual {v4, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_18

    goto :goto_4

    .line 362
    :cond_18
    invoke-virtual {v4, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    goto :goto_4

    .line 364
    :cond_19
    invoke-virtual {v4, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1a

    goto :goto_4

    :cond_1a
    const-string v5, "Landroid/app/"

    .line 366
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1b

    goto :goto_4

    .line 368
    :cond_1b
    invoke-virtual {v4, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1c

    goto :goto_4

    :cond_1c
    const-string v5, "Landroid/content/"

    .line 370
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1d

    goto :goto_4

    .line 372
    :cond_1d
    invoke-virtual {v4, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1e

    goto :goto_4

    :cond_1e
    const-string v5, "Landroid/os/"

    .line 374
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1f

    goto :goto_4

    :cond_1f
    const-string v5, "Ljava/lang/Runtime;"

    .line 101
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-interface {v3}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "exec"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    goto :goto_4

    :cond_20
    const-string v5, "Ljava/lang/Thread;"

    .line 106
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "start"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_4

    :goto_5
    return v1

    :cond_21
    const/4 v1, 0x1

    return v1

    :sswitch_data_0
    .sparse-switch
        -0x18ad15bc -> :sswitch_3
        -0x3ba3db2 -> :sswitch_2
        0x47fedf69 -> :sswitch_1
        0x6e7dda7f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7eb5bf50 -> :sswitch_e
        -0x564b833d -> :sswitch_d
        -0x24c4a56f -> :sswitch_c
        -0x18ad15bc -> :sswitch_b
        -0x3ba3db2 -> :sswitch_a
        0x3a58077 -> :sswitch_9
        0x711fe21 -> :sswitch_8
        0x27f7fff5 -> :sswitch_7
        0x47fedf69 -> :sswitch_6
        0x5cd96296 -> :sswitch_5
        0x6e7dda7f -> :sswitch_4
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ()Z
    .locals 2

    .line 119
    iget-object v0, p0, Ll/ᩳۡᩳ;->ۖ:Ll/᩵ۢᩳ;

    invoke-virtual {v0}, Ll/᩵ۢᩳ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܽۚ;

    .line 120
    invoke-interface {v0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ljava/lang/"

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "Ljavax/crypto/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Ljava/io/ByteArrayOutputStream;"

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
