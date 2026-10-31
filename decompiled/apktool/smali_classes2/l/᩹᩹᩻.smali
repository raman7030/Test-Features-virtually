.class public Ll/᩹᩹᩻;
.super Ll/᩹ܶۢ;
.source "P1ZZ"


# static fields
.field public static final synthetic ۚ֫:I


# instance fields
.field public ֡֫:Ll/᩸᩶᩻;

.field public ۘ֫:J

.field public ᩴ֫:Ll/ᩳܰۡ;

.field public ᩵֫:Ll/ᩳܰۡ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 121
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    const-wide/16 v0, 0x0

    .line 125
    iput-wide v0, p0, Ll/᩹᩹᩻;->ۘ֫:J

    return-void
.end method

.method public static ֫(Ljava/util/Collection;Ll/ܶܶܽ;)J
    .locals 4

    .line 317
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 318
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_0

    .line 319
    invoke-static {v2, p1}, Ll/᩸ܶܽ;->֫(Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)J

    move-result-wide v2

    add-long/2addr v0, v2

    goto :goto_0

    :cond_1
    return-wide v0
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 345
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 346
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 347
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 349
    :cond_0
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 350
    invoke-static {p1}, Ll/ۘ۠ۢ;->֫([Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 351
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "tarZipPath"

    .line 134
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a23

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 129
    sget-object v0, Ll/᩻ܶۢ;->֫:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 19

    move-object/from16 v1, p0

    const-string v0, "srcZipPath"

    .line 146
    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "tarZipPath"

    .line 147
    invoke-virtual {v1, v2}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "targetPath"

    .line 148
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "update"

    .line 149
    invoke-virtual {v1, v4}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v4

    const-string v5, "ARG_PATHS"

    .line 141
    invoke-virtual {v1, v5}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 151
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->ۛ()Ll/ۨۧᩳ;

    move-result-object v6

    const-string v7, "keepApkSigBlock"

    .line 152
    invoke-virtual {v1, v7}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v7

    const/4 v8, 0x0

    new-array v9, v8, [Ljava/lang/String;

    .line 154
    invoke-static {v2, v9}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 155
    sget-object v9, Ll/ܽ֨ۢ;->۬:Ll/ܽ֨ۢ;

    invoke-static {v2, v9}, Ll/ᩳ֨ۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V

    .line 157
    new-instance v9, Ll/ᩳܰۡ;

    new-array v8, v8, [Ljava/lang/String;

    invoke-static {v0, v8}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-direct {v9, v0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v9, v1, Ll/᩹᩹᩻;->ᩴ֫:Ll/ᩳܰۡ;

    .line 158
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, v2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v0, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    const/4 v0, 0x1

    if-eqz v6, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 159
    :goto_0
    invoke-static {v2, v8}, Ll/᩹᩶᩻;->֫(Ll/ܶ᩵ܿ;Z)Ll/᩸᩶᩻;

    move-result-object v8

    iput-object v8, v1, Ll/᩹᩹᩻;->֡֫:Ll/᩸᩶᩻;

    .line 160
    invoke-virtual {v8}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v8

    .line 161
    iget-object v9, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v9}, Ll/ᩳܰۡ;->᩸()Z

    move-result v9

    if-nez v6, :cond_1

    if-eqz v7, :cond_1

    .line 162
    iget-object v7, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v7}, Ll/ᩳܰۡ;->ܶ()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 163
    iget-object v7, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v8, v7}, Ll/ۡܰۡ;->֫(Ll/ᩳܰۡ;)V

    :cond_1
    if-eqz v9, :cond_2

    .line 166
    invoke-virtual {v8}, Ll/ۡܰۡ;->ᩳ()V

    .line 168
    :cond_2
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 169
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 172
    iget-object v11, v1, Ll/᩹᩹᩻;->ᩴ֫:Ll/ᩳܰۡ;

    invoke-virtual {v11}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v11

    .line 173
    array-length v12, v5

    const/4 v13, 0x0

    :goto_1
    const-string v14, "/"

    if-ge v13, v12, :cond_6

    aget-object v15, v5, v13

    .line 174
    invoke-virtual {v15, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 175
    invoke-virtual {v0, v14}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_4

    .line 176
    iget-object v14, v1, Ll/᩹᩹᩻;->ᩴ֫:Ll/ᩳܰۡ;

    invoke-virtual {v14, v0}, Ll/ᩳܰۡ;->᩷(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    .line 0
    invoke-static {v3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    .line 177
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->᩶()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 178
    invoke-virtual {v0, v14}, Ll/ۗ᩺ۡ;->ۧ(Ljava/lang/String;)V

    .line 179
    invoke-interface {v7, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    move-object/from16 v17, v5

    move-object/from16 v16, v11

    goto :goto_4

    .line 181
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v14

    add-int/lit8 v14, v14, -0x2

    const/16 v15, 0x2f

    invoke-virtual {v0, v15, v14}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v14

    add-int/lit8 v14, v14, 0x1

    .line 182
    invoke-interface {v11}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_3

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v5

    move-object/from16 v5, v16

    check-cast v5, Ll/ۗ᩺ۡ;

    move-object/from16 v16, v11

    .line 183
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 0
    invoke-static {v3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    move-object/from16 v18, v0

    .line 184
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-virtual {v5, v0}, Ll/ۗ᩺ۡ;->ۧ(Ljava/lang/String;)V

    .line 186
    invoke-interface {v7, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_5
    move-object/from16 v18, v0

    :goto_3
    move-object/from16 v11, v16

    move-object/from16 v5, v17

    move-object/from16 v0, v18

    goto :goto_2

    :goto_4
    add-int/lit8 v13, v13, 0x1

    const/4 v0, 0x1

    move-object/from16 v11, v16

    move-object/from16 v5, v17

    goto/16 :goto_1

    .line 191
    :cond_6
    iget-object v0, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 192
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v10, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_7
    if-eqz v4, :cond_c

    const/4 v0, 0x1

    if-eq v4, v0, :cond_9

    const/4 v0, 0x2

    if-eq v4, v0, :cond_8

    goto/16 :goto_9

    .line 216
    :cond_8
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 217
    invoke-interface {v7, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 203
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 204
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩺ۡ;

    if-nez v4, :cond_a

    goto :goto_7

    .line 207
    :cond_a
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩺ۡ;

    .line 208
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v11

    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v4

    cmp-long v13, v11, v4

    if-lez v13, :cond_b

    .line 209
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v10, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 211
    :cond_b
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 198
    :cond_c
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 199
    invoke-interface {v10, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    .line 299
    :cond_d
    :goto_9
    new-instance v0, Ll/ܶܶܽ;

    invoke-direct {v0}, Ll/ܶܶܽ;-><init>()V

    if-nez v9, :cond_e

    goto :goto_d

    :cond_e
    const-string v3, "AndroidManifest.xml"

    .line 303
    invoke-virtual {v7, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    if-eqz v3, :cond_f

    .line 305
    iget-object v4, v1, Ll/᩹᩹᩻;->ᩴ֫:Ll/ᩳܰۡ;

    invoke-virtual {v4, v3}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v3

    .line 187
    :try_start_0
    invoke-static {v3}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object v4

    .line 188
    invoke-static {v4}, Ll/᩹ۨۡ;->ܳ(Ll/ܶۨۡ;)Z

    move-result v5

    iput-boolean v5, v0, Ll/ܶܶܽ;->ܽ:Z

    .line 189
    invoke-static {v4}, Ll/᩹ۨۡ;->ܿ(Ll/ܶۨۡ;)Z

    move-result v4

    iput-boolean v4, v0, Ll/ܶܶܽ;->ۧ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_b

    :catch_0
    const/4 v4, 0x0

    .line 191
    :try_start_1
    iput-boolean v4, v0, Ll/ܶܶܽ;->ܽ:Z

    .line 192
    iput-boolean v4, v0, Ll/ܶܶܽ;->ۧ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 307
    :goto_a
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    goto :goto_d

    .line 305
    :goto_b
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v2

    .line 309
    :cond_f
    iget-object v3, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-virtual {v0, v3}, Ll/ܶܶܽ;->֫(Ll/ᩳܰۡ;)V

    .line 223
    :goto_d
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-static {v3, v0}, Ll/᩹᩹᩻;->֫(Ljava/util/Collection;Ll/ܶܶܽ;)J

    move-result-wide v3

    .line 224
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-static {v5, v0}, Ll/᩹᩹᩻;->֫(Ljava/util/Collection;Ll/ܶܶܽ;)J

    move-result-wide v11

    add-long/2addr v3, v11

    .line 225
    new-instance v5, Ll/ܶ᩹᩻;

    invoke-direct {v5, v1, v3, v4}, Ll/ܶ᩹᩻;-><init>(Ll/᩹᩹᩻;J)V

    .line 239
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v11, ")"

    const-string v12, "("

    if-eqz v9, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۗ᩺ۡ;

    .line 240
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v13

    if-eqz v13, :cond_10

    .line 241
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 243
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const v15, 0x7f120032

    invoke-static {v15}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v12

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 244
    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 245
    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v11

    if-eqz v11, :cond_11

    .line 246
    invoke-virtual {v8, v9}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto :goto_e

    .line 248
    :cond_11
    iget-object v11, v1, Ll/᩹᩹᩻;->ᩴ֫:Ll/ᩳܰۡ;

    .line 330
    new-instance v12, Ll/᩸᩹᩻;

    invoke-direct {v12, v5}, Ll/᩸᩹᩻;-><init>(Ll/۠᩶᩻;)V

    invoke-static {v11, v8, v9, v0, v12}, Ll/᩸ܶܽ;->֫(Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/ۗ᩺ۡ;Ll/ܶܶܽ;Ll/֨᩸ܿ;)V

    .line 249
    iget-wide v11, v1, Ll/᩹᩹᩻;->ۘ֫:J

    invoke-static {v9, v0}, Ll/᩸ܶܽ;->֫(Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)J

    move-result-wide v15

    add-long/2addr v11, v15

    iput-wide v11, v1, Ll/᩹᩹᩻;->ۘ֫:J

    goto :goto_e

    .line 254
    :cond_12
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩺ۡ;

    .line 255
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_13

    .line 256
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 258
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const v13, 0x7f120ac0

    invoke-static {v13}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    invoke-interface {v10}, Ljava/util/Map;->size()I

    move-result v13

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 258
    invoke-virtual {v1, v9}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 260
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 261
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v9

    if-eqz v9, :cond_14

    .line 262
    invoke-virtual {v8, v7}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    move-object v9, v3

    move v13, v4

    goto :goto_10

    .line 264
    :cond_14
    iget-object v9, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    .line 330
    new-instance v13, Ll/᩸᩹᩻;

    invoke-direct {v13, v5}, Ll/᩸᩹᩻;-><init>(Ll/۠᩶᩻;)V

    invoke-static {v9, v8, v7, v0, v13}, Ll/᩸ܶܽ;->֫(Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/ۗ᩺ۡ;Ll/ܶܶܽ;Ll/֨᩸ܿ;)V

    move-object v9, v3

    move v13, v4

    .line 265
    iget-wide v3, v1, Ll/᩹᩹᩻;->ۘ֫:J

    invoke-static {v7, v0}, Ll/᩸ܶܽ;->֫(Ll/ۗ᩺ۡ;Ll/ܶܶܽ;)J

    move-result-wide v15

    add-long/2addr v3, v15

    iput-wide v3, v1, Ll/᩹᩹᩻;->ۘ֫:J

    :goto_10
    move-object v3, v9

    move v4, v13

    goto :goto_f

    .line 268
    :cond_15
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 269
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 270
    :cond_16
    iget-object v0, v1, Ll/᩹᩹᩻;->ᩴ֫:Ll/ᩳܰۡ;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    const/4 v0, 0x0

    .line 271
    iput-object v0, v1, Ll/᩹᩹᩻;->ᩴ֫:Ll/ᩳܰۡ;

    .line 272
    iget-object v3, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-static {v3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 273
    iput-object v0, v1, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    .line 276
    invoke-virtual {v8}, Ll/ۡܰۡ;->close()V

    if-eqz v6, :cond_17

    .line 278
    iget-object v0, v1, Ll/᩹᩹᩻;->֡֫:Ll/᩸᩶᩻;

    invoke-static {v0, v6, v1}, Ll/ۤۗܳ;->֫(Ll/᩸᩶᩻;Ll/ۨۧᩳ;Ll/ۘ۠ۢ;)V

    .line 280
    :cond_17
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 281
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 283
    :cond_18
    invoke-static {v2}, Ll/ᩴܶۡ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 284
    new-instance v0, Ll/ܿ᩵ܿ;

    invoke-direct {v0}, Ll/ܿ᩵ܿ;-><init>()V

    .line 285
    invoke-virtual {v0, v2}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 286
    iget-object v3, v1, Ll/᩹᩹᩻;->֡֫:Ll/᩸᩶᩻;

    new-instance v4, Ll/᩷ܰ᩷;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v1, v2}, Ll/᩷ܰ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/AutoCloseable;

    invoke-virtual {v3, v2, v4, v5}, Ll/᩸᩶᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;[Ljava/lang/AutoCloseable;)V

    .line 290
    invoke-virtual {v0, v2}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 292
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 358
    iget-object p1, p0, Ll/᩹᩹᩻;->֡֫:Ll/᩸᩶᩻;

    if-eqz p1, :cond_0

    .line 359
    invoke-virtual {p1}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object p1

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 360
    iget-object p1, p0, Ll/᩹᩹᩻;->֡֫:Ll/᩸᩶᩻;

    invoke-virtual {p1}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 362
    :cond_0
    iget-object p1, p0, Ll/᩹᩹᩻;->ᩴ֫:Ll/ᩳܰۡ;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 363
    iget-object p1, p0, Ll/᩹᩹᩻;->᩵֫:Ll/ᩳܰۡ;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 364
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 139
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 140
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
