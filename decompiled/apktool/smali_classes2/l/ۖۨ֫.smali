.class public final Ll/ۖۨ֫;
.super Ljava/lang/Object;
.source "N7MO"

# interfaces
.implements Ll/᩹ۨ֫;


# static fields
.field public static final ܽ:[I


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ۜᩴۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 60
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۖۨ֫;->ܽ:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x8
        0xd
        0xb
        0x2
        0x0
        0x1
        0x7
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    new-instance v0, Ll/ۤۘۧ;

    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object v0, p0, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, -0x1

    const/4 v2, 0x7

    if-ge v0, v2, :cond_1

    .line 167
    sget-object v2, Ll/ۖۨ֫;->ܽ:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-eq v0, v1, :cond_3

    .line 220
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 223
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤۘۧ;)Ll/ۖۨ֫;
    .locals 0

    .line 172
    iput-object p1, p0, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    return-object p0
.end method

.method public final ֫(Z)Ll/ۖۨ֫;
    .locals 0

    .line 180
    iput-boolean p1, p0, Ll/ۖۨ֫;->֫:Z

    return-object p0
.end method

.method public final ֫(Ll/۠ᩴ֫;)Ll/۠ᩴ֫;
    .locals 3

    .line 203
    iget-boolean v0, p0, Ll/ۖۨ֫;->֫:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    invoke-interface {v0, p1}, Ll/ۜᩴۧ;->֫(Ll/۠ᩴ֫;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    invoke-virtual {p1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v0

    iget-object v1, p1, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    const-string v2, "application/x-media3-cues"

    .line 206
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    .line 207
    invoke-interface {v2, p1}, Ll/ۜᩴۧ;->ۧ(Ll/۠ᩴ֫;)I

    move-result v2

    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ܳ(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    const-string p1, " "

    .line 210
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 208
    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    const-wide v1, 0x7fffffffffffffffL

    .line 211
    invoke-virtual {v0, v1, v2}, Ll/֨ᩴ֫;->֫(J)V

    .line 212
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final ֫(Landroid/net/Uri;Ll/۠ᩴ֫;Ljava/util/List;Ll/ۢ֨֫;Ljava/util/Map;Ll/ܺ᩷ۧ;)Ll/ۡۨ֫;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v8, p4

    .line 117
    iget-object v2, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v2}, Ll/᩶ۗ֡;->֫(Ljava/lang/String;)I

    move-result v9

    const-string v2, "Content-Type"

    move-object/from16 v3, p5

    .line 190
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 192
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 193
    :goto_1
    invoke-static {v2}, Ll/᩶ۗ֡;->֫(Ljava/lang/String;)I

    move-result v10

    .line 121
    invoke-static/range {p1 .. p1}, Ll/᩶ۗ֡;->֫(Landroid/net/Uri;)I

    move-result v11

    .line 124
    new-instance v12, Ljava/util/ArrayList;

    const/4 v2, 0x7

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 126
    invoke-static {v12, v9}, Ll/ۖۨ֫;->֫(Ljava/util/ArrayList;I)V

    .line 127
    invoke-static {v12, v10}, Ll/ۖۨ֫;->֫(Ljava/util/ArrayList;I)V

    .line 128
    invoke-static {v12, v11}, Ll/ۖۨ֫;->֫(Ljava/util/ArrayList;I)V

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_2

    .line 129
    sget-object v4, Ll/ۖۨ֫;->ܽ:[I

    aget v4, v4, v3

    .line 130
    invoke-static {v12, v4}, Ll/ۖۨ֫;->֫(Ljava/util/ArrayList;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 135
    :cond_2
    invoke-virtual/range {p6 .. p6}, Ll/ܺ᩷ۧ;->ۧ()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v14, v4

    const/4 v13, 0x0

    .line 136
    :goto_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v13, v3, :cond_18

    .line 137
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v15

    const/16 v3, 0xb

    if-eqz v15, :cond_14

    const/4 v4, 0x1

    if-eq v15, v4, :cond_13

    const/4 v4, 0x2

    if-eq v15, v4, :cond_12

    if-eq v15, v2, :cond_11

    const/16 v2, 0x8

    .line 234
    sget-object v4, Ll/ۜᩴۧ;->֫:Ll/ۜᩴۧ;

    if-eq v15, v2, :cond_a

    if-eq v15, v3, :cond_4

    const/16 v2, 0xd

    if-eq v15, v2, :cond_3

    const/4 v2, 0x0

    goto/16 :goto_d

    .line 236
    :cond_3
    new-instance v2, Ll/ۢ᩺֫;

    iget-object v3, v0, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    iget-object v4, v1, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    iget-boolean v5, v1, Ll/ۖۨ֫;->֫:Z

    invoke-direct {v2, v3, v8, v4, v5}, Ll/ۢ᩺֫;-><init>(Ljava/lang/String;Ll/ۢ֨֫;Ll/ۜᩴۧ;Z)V

    goto/16 :goto_d

    .line 258
    :cond_4
    iget-object v2, v1, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    iget-boolean v3, v1, Ll/ۖۨ֫;->֫:Z

    if-eqz p3, :cond_5

    const/16 v5, 0x30

    move-object/from16 v6, p3

    goto :goto_4

    .line 290
    :cond_5
    new-instance v5, Ll/֨ᩴ֫;

    invoke-direct {v5}, Ll/֨ᩴ֫;-><init>()V

    const-string v6, "application/cea-608"

    .line 292
    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v5

    .line 291
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v6, 0x10

    move-object v6, v5

    const/16 v5, 0x10

    .line 296
    :goto_4
    iget-object v7, v0, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    .line 297
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_8

    move-object/from16 v16, v2

    const-string v2, "audio/mp4a-latm"

    .line 344
    invoke-static {v7, v2}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    goto :goto_5

    :cond_6
    or-int/lit8 v5, v5, 0x2

    :goto_5
    const-string v2, "video/avc"

    invoke-static {v7, v2}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    goto :goto_6

    :cond_7
    or-int/lit8 v5, v5, 0x4

    goto :goto_6

    :cond_8
    move-object/from16 v16, v2

    :goto_6
    if-nez v3, :cond_9

    move-object/from16 v16, v4

    :cond_9
    xor-int/lit8 v4, v3, 0x1

    .line 313
    new-instance v17, Ll/ܺۚۧ;

    new-instance v7, Ll/᩷֡ۧ;

    invoke-direct {v7, v5, v6}, Ll/᩷֡ۧ;-><init>(ILjava/util/List;)V

    const/4 v3, 0x2

    move-object/from16 v2, v17

    move-object/from16 v5, v16

    move-object/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Ll/ܺۚۧ;-><init>(IILl/ۜᩴۧ;Ll/ۢ֨֫;Ll/᩷֡ۧ;)V

    goto :goto_d

    .line 250
    :cond_a
    iget-object v2, v1, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    iget-boolean v3, v1, Ll/ۖۨ֫;->֫:Z

    .line 351
    iget-object v5, v0, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    if-nez v5, :cond_b

    goto :goto_8

    :cond_b
    const/4 v6, 0x0

    .line 355
    :goto_7
    invoke-virtual {v5}, Ll/᩻᩵֫;->֫()I

    move-result v7

    if-ge v6, v7, :cond_d

    .line 356
    invoke-virtual {v5, v6}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v7

    .line 357
    instance-of v0, v7, Ll/᩻᩺֫;

    if-eqz v0, :cond_c

    .line 358
    check-cast v7, Ll/᩻᩺֫;

    iget-object v0, v7, Ll/᩻᩺֫;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_c
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p2

    goto :goto_7

    :cond_d
    :goto_8
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_e

    const/4 v0, 0x4

    goto :goto_a

    :cond_e
    const/4 v0, 0x0

    :goto_a
    if-nez v3, :cond_f

    or-int/lit8 v0, v0, 0x20

    goto :goto_b

    :cond_f
    move-object v4, v2

    .line 340
    :goto_b
    new-instance v2, Ll/۬ۖۧ;

    if-eqz p3, :cond_10

    move-object/from16 v3, p3

    goto :goto_c

    .line 345
    :cond_10
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v3

    :goto_c
    invoke-direct {v2, v4, v0, v8, v3}, Ll/۬ۖۧ;-><init>(Ll/ۜᩴۧ;ILl/ۢ֨֫;Ljava/util/List;)V

    goto :goto_d

    .line 248
    :cond_11
    new-instance v0, Ll/ܿۖۧ;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v4, v2, v3}, Ll/ܿۖۧ;-><init>(IJ)V

    goto :goto_e

    :cond_12
    const/4 v0, 0x0

    .line 242
    new-instance v2, Ll/᩻֡ۧ;

    .line 124
    invoke-direct {v2, v0}, Ll/᩻֡ۧ;-><init>(I)V

    :goto_d
    move-object v3, v2

    goto :goto_f

    .line 246
    :cond_13
    new-instance v0, Ll/ܿ֡ۧ;

    invoke-direct {v0}, Ll/ܿ֡ۧ;-><init>()V

    goto :goto_e

    .line 244
    :cond_14
    new-instance v0, Ll/ܽ֡ۧ;

    invoke-direct {v0}, Ll/ܽ֡ۧ;-><init>()V

    :goto_e
    move-object v3, v0

    .line 155
    :goto_f
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v2, p6

    .line 368
    :try_start_0
    invoke-interface {v3, v2}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 372
    invoke-virtual/range {p6 .. p6}, Ll/ܺ᩷ۧ;->ۧ()V

    goto :goto_10

    :catchall_0
    move-exception v0

    move-object v3, v0

    invoke-virtual/range {p6 .. p6}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 373
    throw v3

    .line 372
    :catch_0
    invoke-virtual/range {p6 .. p6}, Ll/ܺ᩷ۧ;->ۧ()V

    const/4 v0, 0x0

    :goto_10
    if-eqz v0, :cond_15

    .line 142
    new-instance v0, Ll/ۡۨ֫;

    iget-object v6, v1, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    iget-boolean v7, v1, Ll/ۖۨ֫;->֫:Z

    move-object v2, v0

    move-object/from16 v4, p2

    move-object/from16 v5, p4

    invoke-direct/range {v2 .. v7}, Ll/ۡۨ֫;-><init>(Ll/֨᩷ۧ;Ll/۠ᩴ֫;Ll/ۢ֨֫;Ll/ۜᩴۧ;Z)V

    goto :goto_11

    :cond_15
    if-nez v14, :cond_17

    if-eq v15, v9, :cond_16

    if-eq v15, v10, :cond_16

    if-eq v15, v11, :cond_16

    const/16 v0, 0xb

    if-ne v15, v0, :cond_17

    :cond_16
    move-object v14, v3

    :cond_17
    add-int/lit8 v13, v13, 0x1

    const/4 v0, 0x7

    move-object/from16 v0, p2

    const/4 v2, 0x7

    goto/16 :goto_3

    .line 160
    :cond_18
    new-instance v0, Ll/ۡۨ֫;

    .line 155
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    iget-object v6, v1, Ll/ۖۨ֫;->ۧ:Ll/ۜᩴۧ;

    iget-boolean v7, v1, Ll/ۖۨ֫;->֫:Z

    move-object v2, v0

    move-object v3, v14

    move-object/from16 v4, p2

    move-object/from16 v5, p4

    invoke-direct/range {v2 .. v7}, Ll/ۡۨ֫;-><init>(Ll/֨᩷ۧ;Ll/۠ᩴ֫;Ll/ۢ֨֫;Ll/ۜᩴۧ;Z)V

    :goto_11
    return-object v0
.end method
