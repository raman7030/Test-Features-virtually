.class public final Ll/᩷ܺۜ;
.super Ljava/lang/Object;
.source "46W4"

# interfaces
.implements Ll/ܿܺۜ;


# instance fields
.field public final synthetic ֫:Ll/ۖܺۜ;

.field public final synthetic ۧ:Ll/ۨۘܽ;

.field public final synthetic ܳ:Ljava/util/LinkedHashMap;

.field public final synthetic ܽ:Lbin/mt/json/JSONArray;

.field public final synthetic ܿ:Ll/ۡܺۜ;

.field public final synthetic ᩳ:Ll/ۨۘܽ;


# direct methods
.method public constructor <init>(Ll/ۖܺۜ;Ll/ۨۘܽ;Ll/ۡܺۜ;Ljava/util/LinkedHashMap;Lbin/mt/json/JSONArray;Ll/ۨۘܽ;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܺۜ;->֫:Ll/ۖܺۜ;

    iput-object p2, p0, Ll/᩷ܺۜ;->ᩳ:Ll/ۨۘܽ;

    iput-object p3, p0, Ll/᩷ܺۜ;->ܿ:Ll/ۡܺۜ;

    iput-object p4, p0, Ll/᩷ܺۜ;->ܳ:Ljava/util/LinkedHashMap;

    iput-object p5, p0, Ll/᩷ܺۜ;->ܽ:Lbin/mt/json/JSONArray;

    iput-object p6, p0, Ll/᩷ܺۜ;->ۧ:Ll/ۨۘܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫᩵ܿ;)Z
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "file_unreadable"

    .line 61
    invoke-virtual/range {p1 .. p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    const/4 v5, 0x0

    if-eq v3, v4, :cond_0

    goto/16 :goto_1

    .line 64
    :cond_0
    iget-object v3, v1, Ll/᩷ܺۜ;->ܽ:Lbin/mt/json/JSONArray;

    iget-object v6, v1, Ll/᩷ܺۜ;->ܳ:Ljava/util/LinkedHashMap;

    iget-object v7, v1, Ll/᩷ܺۜ;->ܿ:Ll/ۡܺۜ;

    iget-object v8, v1, Ll/᩷ܺۜ;->ᩳ:Ll/ۨۘܽ;

    if-eqz v8, :cond_3

    .line 65
    invoke-virtual/range {p1 .. p1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v8

    .line 66
    invoke-static {v7}, Ll/ۡܺۜ;->ᩳ(Ll/ۡܺۜ;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v8}, Ll/۫ۘܽ;->matches()Z

    move-result v9

    goto :goto_0

    :cond_1
    invoke-virtual {v8}, Ll/۫ۘܽ;->find()Z

    move-result v9

    .line 67
    :goto_0
    invoke-static {}, Ll/ۖܺۜ;->֫()V

    if-nez v9, :cond_3

    .line 70
    invoke-virtual {v8}, Ll/۫ۘܽ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v8}, Ll/۫ۘܽ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_2
    const-string v0, "name_match_failed"

    .line 71
    invoke-static {v6, v0}, Ll/ۖܺۜ;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 72
    invoke-static {v3, v2, v0}, Ll/ۖܺۜ;->֫(Lbin/mt/json/JSONArray;Ll/۫᩵ܿ;Ljava/lang/String;)V

    return v5

    .line 77
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v8

    .line 78
    invoke-virtual/range {p1 .. p1}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v10

    .line 79
    invoke-static {v7}, Ll/ۡܺۜ;->ۜ(Ll/ۡܺۜ;)J

    move-result-wide v12

    const-wide/16 v14, 0x0

    const-wide/16 v16, -0x1

    cmp-long v18, v12, v16

    if-nez v18, :cond_4

    invoke-static {v7}, Ll/ۡܺۜ;->ܳ(Ll/ۡܺۜ;)J

    move-result-wide v12

    cmp-long v18, v12, v16

    if-eqz v18, :cond_5

    :cond_4
    cmp-long v12, v8, v14

    if-ltz v12, :cond_13

    :cond_5
    invoke-static {v7}, Ll/ۡܺۜ;->᩻(Ll/ۡܺۜ;)Ljava/lang/Long;

    move-result-object v12

    if-nez v12, :cond_6

    invoke-static {v7}, Ll/ۡܺۜ;->ܿ(Ll/ۡܺۜ;)Ljava/lang/Long;

    move-result-object v12

    if-eqz v12, :cond_7

    :cond_6
    cmp-long v12, v10, v14

    if-gtz v12, :cond_7

    goto/16 :goto_5

    .line 85
    :cond_7
    invoke-static {v7}, Ll/ۡܺۜ;->ۜ(Ll/ۡܺۜ;)J

    move-result-wide v12

    cmp-long v14, v12, v16

    if-eqz v14, :cond_8

    invoke-static {v7}, Ll/ۡܺۜ;->ۜ(Ll/ۡܺۜ;)J

    move-result-wide v12

    cmp-long v14, v8, v12

    if-ltz v14, :cond_b

    :cond_8
    invoke-static {v7}, Ll/ۡܺۜ;->ܳ(Ll/ۡܺۜ;)J

    move-result-wide v12

    cmp-long v14, v12, v16

    if-eqz v14, :cond_9

    invoke-static {v7}, Ll/ۡܺۜ;->ܳ(Ll/ۡܺۜ;)J

    move-result-wide v12

    cmp-long v14, v8, v12

    if-gez v14, :cond_b

    :cond_9
    invoke-static {v7}, Ll/ۡܺۜ;->᩻(Ll/ۡܺۜ;)Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-static {v7}, Ll/ۡܺۜ;->᩻(Ll/ۡܺۜ;)Ljava/lang/Long;

    move-result-object v8

    .line 87
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v12, v10, v8

    if-ltz v12, :cond_b

    :cond_a
    invoke-static {v7}, Ll/ۡܺۜ;->ܿ(Ll/ۡܺۜ;)Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_c

    invoke-static {v7}, Ll/ۡܺۜ;->ܿ(Ll/ۡܺۜ;)Ljava/lang/Long;

    move-result-object v7

    .line 88
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v9, v10, v7

    if-ltz v9, :cond_c

    :cond_b
    :goto_1
    return v5

    .line 91
    :cond_c
    iget-object v7, v1, Ll/᩷ܺۜ;->ۧ:Ll/ۨۘܽ;

    if-nez v7, :cond_d

    const/4 v0, 0x1

    return v0

    .line 97
    :cond_d
    :try_start_0
    iget-object v8, v1, Ll/᩷ܺۜ;->֫:Ll/ۖܺۜ;

    invoke-static {v8}, Ll/ۖܺۜ;->֫(Ll/ۖܺۜ;)Ll/ᩳۖۜ;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v8
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_3

    .line 103
    invoke-virtual {v8}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v9

    if-eq v9, v4, :cond_e

    .line 104
    invoke-static {v6, v0}, Ll/ۖܺۜ;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 105
    invoke-static {v3, v2, v0}, Ll/ۖܺۜ;->֫(Lbin/mt/json/JSONArray;Ll/۫᩵ܿ;Ljava/lang/String;)V

    return v5

    .line 108
    :cond_e
    :try_start_1
    invoke-virtual {v8}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 109
    :try_start_2
    invoke-static {v4, v7}, Ll/ۖܺۜ;->֫(Ljava/io/InputStream;Ll/ۨۘܽ;)Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_f

    .line 110
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    :cond_f
    return v0

    :catchall_0
    move-exception v0

    move-object v7, v0

    if-eqz v4, :cond_10

    .line 108
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v4, v0

    :try_start_5
    invoke-virtual {v7, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_10
    :goto_2
    throw v7
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    .line 112
    :goto_3
    invoke-static {}, Ll/ۖܺۜ;->֫()V

    const-string v4, "content_search_failed"

    .line 113
    invoke-static {v6, v4}, Ll/ۖܺۜ;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 114
    instance-of v6, v0, Ljava/nio/charset/CharacterCodingException;

    if-eqz v6, :cond_11

    const-string v4, "invalid_encoding"

    goto :goto_4

    .line 115
    :cond_11
    instance-of v0, v0, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_12

    const-string v4, "read_timeout"

    .line 114
    :cond_12
    :goto_4
    invoke-static {v3, v2, v4}, Ll/ۖܺۜ;->֫(Lbin/mt/json/JSONArray;Ll/۫᩵ܿ;Ljava/lang/String;)V

    return v5

    .line 99
    :catch_3
    invoke-static {v6, v0}, Ll/ۖܺۜ;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 100
    invoke-static {v3, v2, v0}, Ll/ۖܺۜ;->֫(Lbin/mt/json/JSONArray;Ll/۫᩵ܿ;Ljava/lang/String;)V

    return v5

    :cond_13
    :goto_5
    const-string v0, "metadata_unavailable"

    .line 81
    invoke-static {v6, v0}, Ll/ۖܺۜ;->֫(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 82
    invoke-static {v3, v2, v0}, Ll/ۖܺۜ;->֫(Lbin/mt/json/JSONArray;Ll/۫᩵ܿ;Ljava/lang/String;)V

    return v5
.end method
