.class public final Ll/֫᩺ۡ;
.super Ljava/lang/Object;
.source "64YZ"


# instance fields
.field public final ֫:Ll/۫ܽܽ;

.field public final ۧ:Ljava/util/HashMap;

.field public ܳ:Ljava/util/Map;

.field public final ܽ:Ll/ܿᩳܽ;

.field public ܿ:Ll/᩷ۘܽ;

.field public ᩳ:Ll/ܿ᩺ۡ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/۫ܽܽ;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֫᩺ۡ;->ۧ:Ljava/util/HashMap;

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Ll/֫᩺ۡ;->᩻:Z

    .line 57
    iput-object p1, p0, Ll/֫᩺ۡ;->֫:Ll/۫ܽܽ;

    .line 58
    invoke-virtual {p1}, Ll/۫ܽܽ;->ۧ()Ll/ܿᩳܽ;

    move-result-object p1

    iput-object p1, p0, Ll/֫᩺ۡ;->ܽ:Ll/ܿᩳܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 24

    move-object/from16 v0, p0

    .line 72
    invoke-static/range {p1 .. p1}, Ll/᩷ۘܽ;->֫(Ljava/lang/CharSequence;)Ll/᩷ۘܽ;

    move-result-object v1

    iput-object v1, v0, Ll/֫᩺ۡ;->ܿ:Ll/᩷ۘܽ;

    .line 73
    new-instance v2, Ll/ܿ᩺ۡ;

    invoke-direct {v2}, Ll/ܿ᩺ۡ;-><init>()V

    iput-object v2, v0, Ll/֫᩺ۡ;->ᩳ:Ll/ܿ᩺ۡ;

    const/4 v3, 0x0

    .line 74
    :goto_0
    invoke-virtual {v1}, Ll/᩷ۘܽ;->֫()I

    move-result v4

    if-ge v3, v4, :cond_44

    .line 75
    new-instance v4, Ll/᩻᩺ۡ;

    invoke-direct {v4}, Ll/᩻᩺ۡ;-><init>()V

    .line 76
    invoke-virtual {v1, v3}, Ll/᩷ۘܽ;->ᩳ(I)I

    move-result v5

    if-eqz v5, :cond_43

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eq v5, v9, :cond_3

    if-eq v5, v8, :cond_1

    if-eq v5, v7, :cond_43

    if-eq v5, v6, :cond_0

    goto :goto_1

    .line 127
    :cond_0
    invoke-virtual {v1, v3}, Ll/᩷ۘܽ;->ܽ(I)Ll/ۜۘܽ;

    move-result-object v5

    .line 128
    invoke-virtual {v5}, Ll/ۜۘܽ;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v6

    iput-object v6, v4, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    .line 129
    invoke-virtual {v5, v4}, Ll/ۜۘܽ;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 117
    :cond_1
    invoke-virtual {v1, v3}, Ll/᩷ۘܽ;->֫(I)Ll/ܳۘܽ;

    move-result-object v5

    .line 118
    invoke-virtual {v5}, Ll/ܳۘܽ;->ܿ()Ljava/lang/String;

    move-result-object v6

    .line 119
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 120
    invoke-virtual {v2, v6}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v6

    iput-object v6, v4, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    .line 122
    :cond_2
    invoke-virtual {v5}, Ll/ܳۘܽ;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v6

    iput-object v6, v4, Ll/᩻᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    .line 123
    invoke-virtual {v5, v4}, Ll/ܳۘܽ;->֫(Ljava/lang/Object;)V

    :goto_1
    move-object v6, v2

    goto/16 :goto_1a

    .line 85
    :cond_3
    invoke-virtual {v1, v3}, Ll/᩷ۘܽ;->֫(I)Ll/ܳۘܽ;

    move-result-object v5

    .line 86
    invoke-virtual {v5}, Ll/ܳۘܽ;->ܿ()Ljava/lang/String;

    move-result-object v6

    .line 87
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 88
    invoke-virtual {v2, v6}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v6

    iput-object v6, v4, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    .line 90
    :cond_4
    invoke-virtual {v5}, Ll/ܳۘܽ;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v6

    iput-object v6, v4, Ll/᩻᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    .line 91
    invoke-virtual {v5, v4}, Ll/ܳۘܽ;->֫(Ljava/lang/Object;)V

    .line 92
    invoke-virtual {v5}, Ll/ܳۘܽ;->֫()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_42

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܿۘܽ;

    .line 138
    iget-object v7, v0, Ll/֫᩺ۡ;->ᩳ:Ll/ܿ᩺ۡ;

    .line 139
    new-instance v8, Ll/ܳ᩺ۡ;

    invoke-direct {v8}, Ll/ܳ᩺ۡ;-><init>()V

    .line 141
    invoke-virtual {v6}, Ll/ܿۘܽ;->ܽ()Ljava/lang/String;

    move-result-object v10

    .line 142
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_5

    .line 143
    invoke-virtual {v7, v10}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v7

    iput-object v7, v8, Ll/ܳ᩺ۡ;->ܽ:Ll/ᩳ᩺ۡ;

    .line 146
    :cond_5
    invoke-virtual {v6}, Ll/ܿۘܽ;->֫()Ljava/lang/String;

    move-result-object v7

    .line 147
    invoke-virtual {v6}, Ll/ܿۘܽ;->ܽ()Ljava/lang/String;

    move-result-object v10

    .line 149
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_8

    const-string v11, ":"

    .line 0
    invoke-static {v10, v11, v7}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 151
    iget-object v12, v0, Ll/֫᩺ۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v12, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܽᩳܽ;

    if-nez v13, :cond_7

    .line 153
    iget-object v13, v0, Ll/֫᩺ۡ;->ܽ:Ll/ܿᩳܽ;

    iget-object v14, v0, Ll/֫᩺ۡ;->ܳ:Ljava/util/Map;

    invoke-virtual {v13, v10, v7, v14}, Ll/ܿᩳܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll/ܽᩳܽ;

    move-result-object v13

    if-eqz v13, :cond_6

    .line 157
    invoke-virtual {v12, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 155
    :cond_6
    new-instance v1, Ll/֫ۘܽ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown attr "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ll/ܿۘܽ;->ۧ()Ll/ܽۘܽ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ܽۘܽ;)V

    throw v1

    .line 159
    :cond_7
    :goto_3
    iget-object v10, v0, Ll/֫᩺ۡ;->ᩳ:Ll/ܿ᩺ۡ;

    iget v11, v13, Ll/ܽᩳܽ;->֫:I

    invoke-virtual {v10, v11, v7}, Ll/ܿ᩺ۡ;->֫(ILjava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v7

    iput-object v7, v8, Ll/ܳ᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    goto/16 :goto_7

    .line 161
    :cond_8
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    const-string v10, "coreApp"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_4

    :cond_9
    const/4 v10, 0x5

    goto :goto_5

    :sswitch_1
    const-string v10, "style"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    goto :goto_4

    :cond_a
    const/4 v10, 0x4

    goto :goto_5

    :sswitch_2
    const-string v10, "package"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    goto :goto_4

    :cond_b
    const/4 v10, 0x3

    goto :goto_5

    :sswitch_3
    const-string v10, "layout"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_4

    :cond_c
    const/4 v10, 0x2

    goto :goto_5

    :sswitch_4
    const-string v10, "platformBuildVersionName"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    goto :goto_4

    :cond_d
    const/4 v10, 0x1

    goto :goto_5

    :sswitch_5
    const-string v10, "platformBuildVersionCode"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    goto :goto_4

    :cond_e
    const/4 v10, 0x0

    goto :goto_5

    :goto_4
    const/4 v10, -0x1

    :goto_5
    packed-switch v10, :pswitch_data_0

    const v10, 0xffff

    const v11, 0x7fffffff

    .line 181
    invoke-static {v10, v11, v7}, Ll/ܽᩳܽ;->֫(IILjava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v10

    goto :goto_6

    .line 172
    :pswitch_0
    sget-object v10, Ll/ܽᩳܽ;->ܳ:Ll/ܽᩳܽ;

    goto :goto_6

    .line 163
    :pswitch_1
    sget-object v10, Ll/ܽᩳܽ;->ۡ:Ll/ܽᩳܽ;

    goto :goto_6

    .line 169
    :pswitch_2
    sget-object v10, Ll/ܽᩳܽ;->ۜ:Ll/ܽᩳܽ;

    goto :goto_6

    .line 166
    :pswitch_3
    sget-object v10, Ll/ܽᩳܽ;->᩻:Ll/ܽᩳܽ;

    goto :goto_6

    .line 178
    :pswitch_4
    sget-object v10, Ll/ܽᩳܽ;->ۢ:Ll/ܽᩳܽ;

    goto :goto_6

    .line 175
    :pswitch_5
    sget-object v10, Ll/ܽᩳܽ;->᩷:Ll/ܽᩳܽ;

    :goto_6
    move-object v13, v10

    .line 184
    iget-object v10, v0, Ll/֫᩺ۡ;->ᩳ:Ll/ܿ᩺ۡ;

    invoke-virtual {v10, v7}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v7

    iput-object v7, v8, Ll/ܳ᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    .line 192
    :goto_7
    new-instance v7, Ll/ۜ᩺ۡ;

    invoke-direct {v7}, Ll/ۜ᩺ۡ;-><init>()V

    iput-object v7, v8, Ll/ܳ᩺ۡ;->ᩳ:Ll/ۜ᩺ۡ;

    .line 193
    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v10

    const-string v11, "###"

    .line 194
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_f

    .line 195
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v11, v9}, Ljava/io/PrintStream;->println(I)V

    :cond_f
    const-string v11, "@"

    .line 493
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    const-string v12, "Resource not found: "

    .line 197
    iget-object v14, v0, Ll/֫᩺ۡ;->֫:Ll/۫ܽܽ;

    const-string v15, "\""

    move-object/from16 p1, v4

    const-string v4, "=\""

    if-eqz v11, :cond_13

    .line 198
    iput v9, v7, Ll/ۜ᩺ۡ;->ܿ:I

    .line 199
    invoke-virtual {v10, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 200
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    const/16 v11, 0x8

    if-ne v10, v11, :cond_10

    invoke-static {v9}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_10

    .line 201
    invoke-static {v9}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto :goto_8

    :cond_10
    const-string v10, "null"

    .line 203
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    const/4 v4, 0x0

    .line 204
    iput v4, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto :goto_8

    .line 206
    :cond_11
    invoke-virtual {v14, v9}, Ll/۫ܽܽ;->ۧ(Ljava/lang/String;)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_12

    .line 210
    iput v9, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto :goto_8

    .line 208
    :cond_12
    new-instance v1, Ll/֫ۘܽ;

    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v3

    .line 0
    invoke-static {v12, v2, v4, v3, v15}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 208
    invoke-virtual {v6}, Ll/ܿۘܽ;->᩻()Ll/ܽۘܽ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ܽۘܽ;)V

    throw v1

    :cond_13
    const-string v9, "?"

    .line 524
    invoke-virtual {v10, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_16

    const/4 v9, 0x2

    .line 216
    iput v9, v7, Ll/ۜ᩺ۡ;->ܿ:I

    const/4 v9, 0x1

    .line 217
    invoke-virtual {v10, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 218
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    const/16 v11, 0x8

    if-ne v10, v11, :cond_14

    invoke-static {v9}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_14

    .line 219
    invoke-static {v9}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v4

    iput v4, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto :goto_8

    .line 221
    :cond_14
    invoke-virtual {v14, v9}, Ll/۫ܽܽ;->ۧ(Ljava/lang/String;)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_15

    .line 225
    iput v9, v7, Ll/ۜ᩺ۡ;->ܽ:I

    :goto_8
    move-object/from16 v19, v1

    move-object/from16 v17, v2

    :goto_9
    move/from16 v22, v3

    goto/16 :goto_19

    .line 223
    :cond_15
    new-instance v1, Ll/֫ۘܽ;

    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v3

    .line 0
    invoke-static {v12, v2, v4, v3, v15}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 223
    invoke-virtual {v6}, Ll/ܿۘܽ;->᩻()Ll/ܽۘܽ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ܽۘܽ;)V

    throw v1

    .line 229
    :cond_16
    iget v9, v13, Ll/ܽᩳܽ;->ᩳ:I

    iget-object v11, v13, Ll/ܽᩳܽ;->ܿ:[Ll/ܳᩳܽ;

    const/high16 v12, 0x10000

    and-int/2addr v12, v9

    if-eqz v12, :cond_1c

    .line 230
    array-length v12, v11

    const/4 v14, 0x0

    :goto_a
    if-ge v14, v12, :cond_18

    move/from16 v16, v12

    aget-object v12, v11, v14

    move-object/from16 v17, v2

    .line 231
    iget-object v2, v12, Ll/ܳᩳܽ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 232
    iget v2, v12, Ll/ܳᩳܽ;->ۧ:I

    iput v2, v7, Ll/ۜ᩺ۡ;->ܽ:I

    .line 233
    iget v2, v12, Ll/ܳᩳܽ;->ܽ:I

    iput v2, v7, Ll/ۜ᩺ۡ;->ܿ:I

    :goto_b
    move-object/from16 v19, v1

    goto :goto_9

    :cond_17
    add-int/lit8 v14, v14, 0x1

    move/from16 v12, v16

    move-object/from16 v2, v17

    goto :goto_a

    :cond_18
    move-object/from16 v17, v2

    .line 237
    invoke-static {v10}, Ll/ۢ᩺ۡ;->ᩳ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1a

    .line 238
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 239
    array-length v12, v11

    const/4 v14, 0x0

    :goto_c
    if-ge v14, v12, :cond_1a

    move/from16 v16, v12

    aget-object v12, v11, v14

    .line 240
    iget v12, v12, Ll/ܳᩳܽ;->ۧ:I

    if-ne v12, v2, :cond_19

    const/16 v4, 0x10

    .line 241
    iput v4, v7, Ll/ۜ᩺ۡ;->ܿ:I

    .line 242
    iput v2, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto :goto_b

    :cond_19
    add-int/lit8 v14, v14, 0x1

    move/from16 v12, v16

    goto :goto_c

    .line 247
    :cond_1a
    invoke-static {v10}, Ll/ۢ᩺ۡ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1d

    const/4 v2, 0x2

    .line 248
    invoke-virtual {v10, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v2

    .line 249
    array-length v12, v11

    const/4 v14, 0x0

    :goto_d
    if-ge v14, v12, :cond_1d

    move/from16 v16, v12

    aget-object v12, v11, v14

    .line 250
    iget v12, v12, Ll/ܳᩳܽ;->ۧ:I

    if-ne v12, v2, :cond_1b

    const/16 v4, 0x10

    .line 251
    iput v4, v7, Ll/ۜ᩺ۡ;->ܿ:I

    .line 252
    iput v2, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto :goto_b

    :cond_1b
    add-int/lit8 v14, v14, 0x1

    move/from16 v12, v16

    goto :goto_d

    :cond_1c
    move-object/from16 v17, v2

    :cond_1d
    const/high16 v2, 0x20000

    and-int/2addr v2, v9

    if-eqz v2, :cond_25

    const/16 v2, 0x11

    .line 259
    iput v2, v7, Ll/ۜ᩺ۡ;->ܿ:I

    const-string v2, "\\|"

    .line 263
    invoke-virtual {v10, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 265
    array-length v12, v2

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    :goto_e
    if-ge v14, v12, :cond_22

    aget-object v19, v2, v14

    move/from16 v20, v12

    .line 266
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v19, v1

    .line 268
    array-length v1, v11

    const/16 v21, 0x0

    move/from16 v22, v3

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v1, :cond_1f

    move/from16 v21, v1

    aget-object v1, v11, v3

    move-object/from16 v23, v11

    .line 269
    iget-object v11, v1, Ll/ܳᩳܽ;->֫:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1e

    .line 270
    iget v1, v1, Ll/ܳᩳܽ;->ۧ:I

    or-int v16, v16, v1

    const/4 v1, 0x1

    const/16 v18, 0x1

    goto :goto_10

    :cond_1e
    add-int/lit8 v3, v3, 0x1

    move/from16 v1, v21

    move-object/from16 v11, v23

    goto :goto_f

    :cond_1f
    move-object/from16 v23, v11

    const/4 v1, 0x0

    :goto_10
    if-nez v1, :cond_20

    .line 276
    array-length v3, v2

    const/4 v11, 0x1

    if-le v3, v11, :cond_20

    invoke-static {v12}, Ll/ۢ᩺ۡ;->ۧ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_20

    const/4 v1, 0x2

    .line 277
    invoke-virtual {v12, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v1

    or-int v1, v16, v1

    const/4 v3, 0x1

    const/4 v11, 0x1

    move/from16 v16, v1

    const/4 v1, 0x1

    const/16 v18, 0x1

    :cond_20
    if-nez v1, :cond_21

    const/4 v1, 0x1

    goto :goto_11

    :cond_21
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, v19

    move/from16 v12, v20

    move/from16 v3, v22

    move-object/from16 v11, v23

    goto :goto_e

    :cond_22
    move-object/from16 v19, v1

    move/from16 v22, v3

    const/4 v1, 0x0

    :goto_11
    move/from16 v2, v16

    if-nez v1, :cond_23

    if-eqz v18, :cond_23

    .line 288
    iput v2, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto/16 :goto_19

    :cond_23
    if-nez v18, :cond_24

    .line 291
    invoke-static {v10}, Ll/ۢ᩺ۡ;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_24

    .line 292
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto/16 :goto_19

    :cond_24
    if-nez v18, :cond_26

    .line 295
    invoke-static {v10}, Ll/ۢ᩺ۡ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_26

    const/4 v1, 0x2

    .line 296
    invoke-virtual {v10, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v1

    iput v1, v7, Ll/ۜ᩺ۡ;->ܽ:I

    goto/16 :goto_19

    :cond_25
    move-object/from16 v19, v1

    move/from16 v22, v3

    :cond_26
    and-int/lit8 v1, v9, 0x10

    if-eqz v1, :cond_2c

    const-string v1, "#"

    .line 300
    invoke-virtual {v10, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2c

    .line 302
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_28

    invoke-virtual {v10, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_27

    goto :goto_12

    :cond_27
    const/4 v1, 0x0

    goto :goto_13

    .line 303
    :cond_28
    :goto_12
    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Color value invalid: "

    .line 0
    invoke-static {v3, v1, v4, v2, v15}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 304
    :goto_13
    invoke-static {v10, v7}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z

    move-result v2

    if-nez v2, :cond_29

    .line 306
    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: "

    .line 0
    invoke-static {v3, v1, v4, v2, v15}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_29
    if-nez v1, :cond_2a

    goto/16 :goto_19

    :cond_2a
    and-int/lit8 v2, v9, 0x2

    if-eqz v2, :cond_2b

    goto :goto_14

    .line 312
    :cond_2b
    new-instance v2, Ll/֫ۘܽ;

    invoke-virtual {v6}, Ll/ܿۘܽ;->᩻()Ll/ܽۘܽ;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ܽۘܽ;)V

    throw v2

    :cond_2c
    :goto_14
    and-int/lit8 v1, v9, 0x4

    if-eqz v1, :cond_2d

    .line 315
    invoke-static {v10, v7}, Ll/ۢ᩺ۡ;->ܽ(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z

    move-result v1

    if-eqz v1, :cond_2d

    goto/16 :goto_19

    :cond_2d
    and-int/lit8 v1, v9, 0x20

    if-nez v1, :cond_2e

    and-int/lit8 v2, v9, 0x40

    if-nez v2, :cond_2e

    and-int/lit16 v2, v9, 0x80

    if-eqz v2, :cond_35

    .line 320
    :cond_2e
    invoke-static {v10, v7}, Ll/ۢ᩺ۡ;->ۧ(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z

    move-result v2

    if-eqz v2, :cond_35

    and-int/lit8 v2, v9, 0x2

    if-eqz v2, :cond_2f

    .line 322
    invoke-static {v7}, Ll/ۢ᩺ۡ;->֫(Ll/ۜ᩺ۡ;)Z

    move-result v3

    if-eqz v3, :cond_35

    .line 323
    :cond_2f
    iget v3, v7, Ll/ۜ᩺ۡ;->ܿ:I

    const/4 v11, 0x4

    if-ne v3, v11, :cond_31

    if-nez v1, :cond_31

    if-eqz v2, :cond_30

    goto :goto_15

    .line 325
    :cond_30
    new-instance v1, Ll/֫ۘܽ;

    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Float value is not allowed here: "

    .line 0
    invoke-static {v5, v2, v4, v3, v15}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 325
    invoke-virtual {v6}, Ll/ܿۘܽ;->᩻()Ll/ܽۘܽ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ܽۘܽ;)V

    throw v1

    :cond_31
    const/4 v1, 0x6

    if-ne v3, v1, :cond_33

    and-int/lit16 v1, v9, 0x80

    if-nez v1, :cond_33

    if-eqz v2, :cond_32

    goto :goto_15

    .line 328
    :cond_32
    new-instance v1, Ll/֫ۘܽ;

    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Fraction value is not allowed here: "

    .line 0
    invoke-static {v5, v2, v4, v3, v15}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 328
    invoke-virtual {v6}, Ll/ܿۘܽ;->᩻()Ll/ܽۘܽ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ܽۘܽ;)V

    throw v1

    :cond_33
    const/4 v1, 0x5

    if-ne v3, v1, :cond_40

    and-int/lit8 v1, v9, 0x40

    if-nez v1, :cond_40

    if-eqz v2, :cond_34

    goto :goto_15

    .line 331
    :cond_34
    new-instance v1, Ll/֫ۘܽ;

    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Dimension value is not allowed here: "

    .line 0
    invoke-static {v5, v2, v4, v3, v15}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 331
    invoke-virtual {v6}, Ll/ܿۘܽ;->᩻()Ll/ܽۘܽ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ܽۘܽ;)V

    throw v1

    :cond_35
    :goto_15
    and-int/lit8 v1, v9, 0x8

    if-eqz v1, :cond_37

    const-string v1, "true"

    .line 337
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x12

    if-eqz v1, :cond_36

    const/4 v1, -0x1

    .line 338
    iput v1, v7, Ll/ۜ᩺ۡ;->ܽ:I

    .line 339
    iput v2, v7, Ll/ۜ᩺ۡ;->ܿ:I

    goto/16 :goto_19

    :cond_36
    const-string v1, "false"

    .line 341
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_37

    const/4 v1, 0x0

    .line 342
    iput v1, v7, Ll/ۜ᩺ۡ;->ܽ:I

    .line 343
    iput v2, v7, Ll/ۜ᩺ۡ;->ܿ:I

    goto/16 :goto_19

    :cond_37
    const-string v1, "<"

    .line 347
    invoke-virtual {v10, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_38

    const-string v1, ">"

    invoke-virtual {v10, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_38

    const-string v1, "<0x([0-9a-f]{1,8}), type 0x([0-9a-f]{2})>"

    .line 348
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v10}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 349
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_38

    const/4 v2, 0x1

    .line 350
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v2

    iput v2, v7, Ll/ۜ᩺ۡ;->ܽ:I

    const/4 v2, 0x2

    .line 351
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v1

    iput v1, v7, Ll/ۜ᩺ۡ;->ܿ:I

    goto :goto_19

    :cond_38
    and-int/lit8 v1, v9, 0x2

    if-eqz v1, :cond_41

    const/4 v1, 0x3

    .line 356
    iput v1, v7, Ll/ۜ᩺ۡ;->ܿ:I

    .line 357
    iget-object v1, v0, Ll/֫᩺ۡ;->ᩳ:Ll/ܿ᩺ۡ;

    const/16 v2, 0x5c

    .line 364
    invoke-virtual {v10, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_39

    goto :goto_18

    .line 367
    :cond_39
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v7, 0xa

    add-int/2addr v4, v7

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v4, 0x0

    .line 368
    :goto_16
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v4, v9, :cond_3f

    .line 369
    invoke-virtual {v10, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v2, :cond_3d

    add-int/lit8 v4, v4, 0x1

    .line 371
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v4, v9, :cond_3e

    .line 372
    invoke-virtual {v10, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v9, v2, :cond_3c

    const/16 v11, 0x6e

    if-eq v9, v11, :cond_3b

    const/16 v11, 0x74

    if-eq v9, v11, :cond_3a

    .line 384
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_17

    :cond_3a
    const/16 v9, 0x9

    .line 378
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_17

    .line 375
    :cond_3b
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_17

    .line 381
    :cond_3c
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_17

    .line 389
    :cond_3d
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3e
    :goto_17
    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    .line 392
    :cond_3f
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 357
    :goto_18
    invoke-virtual {v1, v10}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v1

    iput-object v1, v8, Ll/ܳ᩺ۡ;->ܿ:Ll/ᩳ᩺ۡ;

    .line 187
    :cond_40
    :goto_19
    iput-object v13, v8, Ll/ܳ᩺ۡ;->֫:Ll/ܽᩳܽ;

    .line 188
    invoke-virtual {v6, v8}, Ll/ܿۘܽ;->֫(Ljava/lang/Object;)V

    const/4 v9, 0x1

    move-object/from16 v4, p1

    move-object/from16 v2, v17

    move-object/from16 v1, v19

    move/from16 v3, v22

    goto/16 :goto_2

    .line 360
    :cond_41
    new-instance v1, Ll/֫ۘܽ;

    invoke-virtual {v6}, Ll/ܿۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ll/ܿۘܽ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13}, Ll/ܽᩳܽ;->ۧ()Ljava/lang/String;

    move-result-object v5

    const-string v7, "Error: "

    const-string v8, "\" ["

    .line 0
    invoke-static {v7, v2, v4, v3, v8}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-static {v2, v5, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 360
    invoke-virtual {v6}, Ll/ܿۘܽ;->᩻()Ll/ܽۘܽ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ܽۘܽ;)V

    throw v1

    :cond_42
    move-object/from16 v19, v1

    move-object/from16 v17, v2

    move/from16 v22, v3

    .line 95
    invoke-virtual {v5}, Ll/ܳۘܽ;->֫()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/۟ۨۡ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    move-object/from16 v6, v17

    move-object/from16 v1, v19

    goto :goto_1a

    :cond_43
    move-object/from16 v17, v2

    .line 79
    invoke-virtual {v1, v3}, Ll/᩷ۘܽ;->ۧ(I)Ll/᩻ۘܽ;

    move-result-object v2

    .line 80
    invoke-virtual {v2}, Ll/᩻ۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v17

    invoke-virtual {v6, v5}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v5

    iput-object v5, v4, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    .line 81
    invoke-virtual {v2}, Ll/᩻ۘܽ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object v5

    iput-object v5, v4, Ll/᩻᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    .line 82
    invoke-virtual {v2, v4}, Ll/᩻ۘܽ;->֫(Ljava/lang/Object;)V

    :goto_1a
    add-int/lit8 v3, v3, 0x1

    move-object v2, v6

    goto/16 :goto_0

    :cond_44
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x61c955d6 -> :sswitch_5
        -0x61c48938 -> :sswitch_4
        -0x422504d6 -> :sswitch_3
        -0x301acbba -> :sswitch_2
        0x68b1db1 -> :sswitch_1
        0x38e83a02 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ljava/util/Map;)V
    .locals 0

    .line 67
    iput-object p1, p0, Ll/֫᩺ۡ;->ܳ:Ljava/util/Map;

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 13

    .line 396
    iget-object v0, p0, Ll/֫᩺ۡ;->ܿ:Ll/᩷ۘܽ;

    const/4 v1, 0x3

    .line 398
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(S)V

    const/16 v2, 0x8

    .line 399
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->֫(S)V

    .line 400
    invoke-virtual {p1}, Ll/ۤۜܽ;->getPosition()J

    move-result-wide v3

    const/4 v5, 0x4

    .line 330
    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->skipBytes(I)V

    .line 403
    iget-object v6, p0, Ll/֫᩺ۡ;->ᩳ:Ll/ܿ᩺ۡ;

    iget-boolean v7, p0, Ll/֫᩺ۡ;->᩻:Z

    invoke-virtual {v6, v7}, Ll/ܿ᩺ۡ;->֫(Z)Ll/۬ܿܽ;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 209
    invoke-virtual {v6, p1, v8, v7}, Ll/۬ܿܽ;->֫(Ll/ۙۜܽ;ZLl/᩵ۛۡ;)V

    .line 404
    iget-object v6, p0, Ll/֫᩺ۡ;->ᩳ:Ll/ܿ᩺ۡ;

    invoke-virtual {v6}, Ll/ܿ᩺ۡ;->֫()[I

    move-result-object v6

    .line 405
    array-length v7, v6

    if-lez v7, :cond_0

    const/16 v7, 0x180

    .line 406
    invoke-virtual {p1, v7}, Ll/ۤۜܽ;->ۡ(I)V

    .line 407
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 408
    array-length v7, v6

    mul-int/lit8 v7, v7, 0x4

    add-int/2addr v7, v2

    invoke-virtual {p1, v7}, Ll/ۤۜܽ;->writeInt(I)V

    .line 409
    invoke-virtual {p1, v6}, Ll/ۤۜܽ;->֫([I)V

    :cond_0
    const/4 v6, 0x0

    .line 412
    :goto_0
    invoke-virtual {v0}, Ll/᩷ۘܽ;->֫()I

    move-result v7

    if-ge v6, v7, :cond_10

    .line 414
    invoke-virtual {v0, v6}, Ll/᩷ۘܽ;->ᩳ(I)I

    move-result v7

    const/16 v9, 0x18

    const/4 v10, -0x1

    if-eqz v7, :cond_e

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eq v7, v12, :cond_5

    if-eq v7, v11, :cond_3

    if-eq v7, v1, :cond_2

    if-eq v7, v5, :cond_1

    goto/16 :goto_9

    .line 449
    :cond_1
    invoke-virtual {v0, v6}, Ll/᩷ۘܽ;->ܽ(I)Ll/ۜۘܽ;

    move-result-object v5

    .line 450
    invoke-virtual {v5}, Ll/ۜۘܽ;->ۧ()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻᩺ۡ;

    const v9, 0x100104

    .line 451
    invoke-virtual {p1, v9}, Ll/ۤۜܽ;->writeInt(I)V

    const/16 v9, 0x1c

    .line 452
    invoke-virtual {p1, v9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 453
    invoke-virtual {v5}, Ll/ۜۘܽ;->֫()I

    move-result v5

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 454
    invoke-virtual {p1, v10}, Ll/ۤۜܽ;->writeInt(I)V

    .line 455
    iget-object v5, v7, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    invoke-virtual {v5}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v5

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 456
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 457
    invoke-virtual {p1, v8}, Ll/ۤۜܽ;->writeInt(I)V

    goto/16 :goto_9

    .line 439
    :cond_2
    invoke-virtual {v0, v6}, Ll/᩷ۘܽ;->ۧ(I)Ll/᩻ۘܽ;

    move-result-object v2

    .line 440
    invoke-virtual {v2}, Ll/᩻ۘܽ;->ܽ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻᩺ۡ;

    const v7, 0x100101

    .line 441
    invoke-virtual {p1, v7}, Ll/ۤۜܽ;->writeInt(I)V

    .line 442
    invoke-virtual {p1, v9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 443
    invoke-virtual {v2}, Ll/᩻ۘܽ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 444
    invoke-virtual {p1, v10}, Ll/ۤۜܽ;->writeInt(I)V

    .line 445
    iget-object v2, v5, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    invoke-virtual {v2}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 446
    iget-object v2, v5, Ll/᩻᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    invoke-virtual {v2}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    goto/16 :goto_9

    .line 429
    :cond_3
    invoke-virtual {v0, v6}, Ll/᩷ۘܽ;->֫(I)Ll/ܳۘܽ;

    move-result-object v2

    .line 430
    invoke-virtual {v2}, Ll/ܳۘܽ;->ᩳ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻᩺ۡ;

    const v7, 0x100103

    .line 431
    invoke-virtual {p1, v7}, Ll/ۤۜܽ;->writeInt(I)V

    .line 432
    invoke-virtual {p1, v9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 433
    invoke-virtual {v2}, Ll/ܳۘܽ;->ۧ()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 434
    invoke-virtual {p1, v10}, Ll/ۤۜܽ;->writeInt(I)V

    .line 435
    iget-object v2, v5, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    if-nez v2, :cond_4

    goto :goto_1

    .line 525
    :cond_4
    invoke-virtual {v2}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v10

    .line 435
    :goto_1
    invoke-virtual {p1, v10}, Ll/ۤۜܽ;->writeInt(I)V

    .line 436
    iget-object v2, v5, Ll/᩻᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    invoke-virtual {v2}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    goto/16 :goto_9

    .line 426
    :cond_5
    invoke-virtual {v0, v6}, Ll/᩷ۘܽ;->֫(I)Ll/ܳۘܽ;

    move-result-object v2

    .line 468
    invoke-virtual {v2}, Ll/ܳۘܽ;->ᩳ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻᩺ۡ;

    .line 469
    invoke-virtual {v2}, Ll/ܳۘܽ;->֫()Ljava/util/List;

    move-result-object v7

    const v8, 0x100102

    .line 471
    invoke-virtual {p1, v8}, Ll/ۤۜܽ;->writeInt(I)V

    .line 473
    move-object v8, v7

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    mul-int/lit8 v11, v8, 0x14

    add-int/lit8 v11, v11, 0x24

    .line 474
    invoke-virtual {p1, v11}, Ll/ۤۜܽ;->writeInt(I)V

    .line 475
    invoke-virtual {v2}, Ll/ܳۘܽ;->ۧ()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 477
    invoke-virtual {p1, v10}, Ll/ۤۜܽ;->writeInt(I)V

    .line 478
    iget-object v2, v5, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    if-nez v2, :cond_6

    const/4 v2, -0x1

    goto :goto_2

    .line 525
    :cond_6
    invoke-virtual {v2}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v2

    .line 478
    :goto_2
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 479
    iget-object v2, v5, Ll/᩻᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    invoke-virtual {v2}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    const/16 v2, 0x14

    .line 481
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 482
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    if-nez v8, :cond_7

    const-wide/16 v7, 0x0

    .line 485
    invoke-virtual {p1, v7, v8}, Ll/ۤۜܽ;->ۧ(J)V

    goto/16 :goto_9

    :cond_7
    int-to-short v2, v8

    .line 488
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->֫(S)V

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    .line 491
    :goto_3
    move-object v11, v7

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v2, v12, :cond_b

    .line 492
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܿۘܽ;

    .line 493
    invoke-virtual {v11}, Ll/ܿۘܽ;->֫()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    const-string v12, "style"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    goto :goto_4

    :cond_8
    const/4 v11, 0x2

    goto :goto_5

    :sswitch_1
    const-string v12, "class"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    goto :goto_4

    :cond_9
    const/4 v11, 0x1

    goto :goto_5

    :sswitch_2
    const-string v12, "id"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    goto :goto_4

    :cond_a
    const/4 v11, 0x0

    goto :goto_5

    :goto_4
    const/4 v11, -0x1

    :goto_5
    packed-switch v11, :pswitch_data_0

    goto :goto_6

    :pswitch_0
    add-int/lit8 v10, v2, 0x1

    int-to-short v10, v10

    goto :goto_6

    :pswitch_1
    add-int/lit8 v8, v2, 0x1

    int-to-short v8, v8

    goto :goto_6

    :pswitch_2
    add-int/lit8 v5, v2, 0x1

    int-to-short v5, v5

    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 505
    :cond_b
    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->֫(S)V

    .line 506
    invoke-virtual {p1, v8}, Ll/ۤۜܽ;->֫(S)V

    .line 507
    invoke-virtual {p1, v10}, Ll/ۤۜܽ;->֫(S)V

    const/4 v2, 0x0

    .line 508
    :goto_7
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_f

    .line 509
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿۘܽ;

    .line 510
    invoke-virtual {v5}, Ll/ܿۘܽ;->ܿ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳ᩺ۡ;

    .line 511
    iget-object v7, v5, Ll/ܳ᩺ۡ;->ܽ:Ll/ᩳ᩺ۡ;

    if-nez v7, :cond_c

    const/4 v7, -0x1

    goto :goto_8

    .line 525
    :cond_c
    invoke-virtual {v7}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v7

    .line 511
    :goto_8
    invoke-virtual {p1, v7}, Ll/ۤۜܽ;->writeInt(I)V

    .line 512
    iget-object v7, v5, Ll/ܳ᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    invoke-virtual {v7}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v7

    invoke-virtual {p1, v7}, Ll/ۤۜܽ;->writeInt(I)V

    .line 513
    iget-object v7, v5, Ll/ܳ᩺ۡ;->ᩳ:Ll/ۜ᩺ۡ;

    .line 514
    iget v8, v7, Ll/ۜ᩺ۡ;->ܿ:I

    if-ne v8, v1, :cond_d

    .line 515
    iget-object v5, v5, Ll/ܳ᩺ۡ;->ܿ:Ll/ᩳ᩺ۡ;

    invoke-virtual {v5}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v5

    iput v5, v7, Ll/ۜ᩺ۡ;->ܽ:I

    iput v5, v7, Ll/ۜ᩺ۡ;->ᩳ:I

    .line 517
    :cond_d
    iget v5, v7, Ll/ۜ᩺ۡ;->ᩳ:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 518
    iget v5, v7, Ll/ۜ᩺ۡ;->ܿ:I

    shl-int/2addr v5, v9

    or-int/lit8 v5, v5, 0x8

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 519
    iget v5, v7, Ll/ۜ᩺ۡ;->ܽ:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 416
    :cond_e
    invoke-virtual {v0, v6}, Ll/᩷ۘܽ;->ۧ(I)Ll/᩻ۘܽ;

    move-result-object v2

    .line 417
    invoke-virtual {v2}, Ll/᩻ۘܽ;->ܽ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻᩺ۡ;

    const v7, 0x100100

    .line 418
    invoke-virtual {p1, v7}, Ll/ۤۜܽ;->writeInt(I)V

    .line 419
    invoke-virtual {p1, v9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 420
    invoke-virtual {v2}, Ll/᩻ۘܽ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 421
    invoke-virtual {p1, v10}, Ll/ۤۜܽ;->writeInt(I)V

    .line 422
    iget-object v2, v5, Ll/᩻᩺ۡ;->֫:Ll/ᩳ᩺ۡ;

    invoke-virtual {v2}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 423
    iget-object v2, v5, Ll/᩻᩺ۡ;->ۧ:Ll/ᩳ᩺ۡ;

    invoke-virtual {v2}, Ll/ᩳ᩺ۡ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    :cond_f
    :goto_9
    add-int/lit8 v6, v6, 0x1

    const/16 v2, 0x8

    const/4 v5, 0x4

    const/4 v8, 0x0

    goto/16 :goto_0

    .line 461
    :cond_10
    invoke-virtual {p1}, Ll/ۤۜܽ;->getPosition()J

    move-result-wide v0

    .line 462
    invoke-virtual {p1, v3, v4}, Ll/ۤۜܽ;->seek(J)V

    sub-long v2, v0, v3

    const-wide/16 v4, 0x4

    add-long/2addr v2, v4

    long-to-int v3, v2

    .line 463
    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 464
    invoke-virtual {p1, v0, v1}, Ll/ۤۜܽ;->seek(J)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xd1b -> :sswitch_2
        0x5a5a978 -> :sswitch_1
        0x68b1db1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Z)V
    .locals 0

    .line 62
    iput-boolean p1, p0, Ll/֫᩺ۡ;->᩻:Z

    return-void
.end method
