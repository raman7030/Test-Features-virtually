.class public final Ll/۫᩻᩻;
.super Ljava/lang/Object;
.source "VAGS"


# static fields
.field public static final ֫:Ljava/util/ArrayList;

.field public static final ۧ:Ljava/util/ArrayList;

.field public static final ܽ:Ll/ۚۡ֫;

.field public static final ܿ:Ljava/util/List;

.field public static final ᩳ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x66

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    .line 46
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/۫᩻᩻;->ᩳ:Ljava/util/List;

    .line 47
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/۫᩻᩻;->ܽ:Ll/ۚۡ֫;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    .line 49
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/۫᩻᩻;->ܿ:Ljava/util/List;

    .line 350
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "config.init"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 351
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    goto :goto_3

    .line 355
    :cond_0
    :try_start_0
    new-instance v1, Ll/ۨۤۡ;

    new-instance v4, Ljava/io/File;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v4}, Ll/ۨۤۡ;-><init>(Ljava/io/File;)V

    const-string v4, "ftp_configs"

    .line 356
    invoke-virtual {v1, v4, v2}, Ll/ۨۤۡ;->֫(Ljava/lang/String;[B)[B

    move-result-object v4

    if-eqz v4, :cond_5

    .line 357
    array-length v5, v4

    if-nez v5, :cond_1

    goto :goto_2

    .line 359
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const-string v6, "ftp_configs_version"

    .line 360
    invoke-virtual {v1, v3, v6}, Ll/ۨۤۡ;->֫(BLjava/lang/String;)B

    move-result v1

    .line 361
    new-instance v6, Ll/۬ۜܽ;

    invoke-direct {v6, v4}, Ll/۬ۜܽ;-><init>([B)V

    .line 362
    invoke-virtual {v6}, Ll/۬ۜܽ;->readInt()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v7, 0x0

    :goto_0
    const/4 v8, 0x1

    if-ge v7, v4, :cond_4

    if-eqz v1, :cond_3

    if-ne v1, v8, :cond_2

    .line 370
    :try_start_1
    invoke-static {v6}, Ll/۟ۡ᩻;->֫(Ll/۬ۜܽ;)Ll/֫ܺ᩻;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 373
    :cond_2
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unsupported config ver "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 367
    :cond_3
    invoke-static {v6}, Ll/۟ۡ᩻;->ۧ(Ll/۬ۜܽ;)Ll/֫ܺ᩻;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 380
    :cond_4
    :try_start_2
    sget-object v1, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 383
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_4

    :catchall_0
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :goto_3
    const/4 v8, 0x0

    .line 89
    :goto_4
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "ns_data"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 93
    :try_start_3
    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1, v0}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Lbin/mt/json/JSONParseException; {:try_start_3 .. :try_end_3} :catch_0

    move-object v2, v1

    goto :goto_5

    :catch_0
    nop

    :cond_6
    :goto_5
    if-nez v2, :cond_7

    const/4 v0, 0x0

    goto :goto_6

    .line 114
    :cond_7
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    :goto_6
    if-ge v3, v0, :cond_9

    .line 116
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 118
    :try_start_4
    invoke-static {v1}, Ll/۫᩻᩻;->֫(Lbin/mt/json/JSONObject;)Ll/ۗ᩻᩻;

    move-result-object v1

    .line 99
    instance-of v4, v1, Ll/ۖۘ᩻;

    if-eqz v4, :cond_8

    check-cast v1, Ll/ۖۘ᩻;

    .line 100
    sget-object v4, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 102
    :cond_8
    sget-object v4, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_9
    if-eqz v8, :cond_a

    .line 106
    invoke-static {}, Ll/۫᩻᩻;->᩻()V

    :cond_a
    return-void

    :catchall_1
    move-exception v1

    .line 383
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 384
    throw v1
.end method

.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۗ᩻᩻;
    .locals 4

    const-string v0, "nct"

    .line 52
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 60
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 59
    :pswitch_0
    new-instance v0, Ll/ۖۘ᩻;

    invoke-direct {v0, p0}, Ll/ۖۘ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 58
    :pswitch_1
    new-instance v0, Ll/۬ۖ᩻;

    invoke-direct {v0, p0}, Ll/۬ۖ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 57
    :pswitch_2
    new-instance v0, Ll/᩻֡᩻;

    invoke-direct {v0, p0}, Ll/᩻֡᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 56
    :pswitch_3
    new-instance v0, Ll/ۚۚ᩻;

    invoke-direct {v0, p0}, Ll/ۚۚ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 55
    :pswitch_4
    new-instance v0, Ll/ܳᩴ᩻;

    invoke-direct {v0, p0}, Ll/ܳᩴ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 54
    :pswitch_5
    new-instance v0, Ll/ۜܺ᩻;

    invoke-direct {v0, p0}, Ll/ۜܺ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 53
    :pswitch_6
    new-instance v0, Ll/֫ܺ᩻;

    invoke-direct {v0, p0}, Ll/֫ܺ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۗ᩻᩻;
    .locals 3

    .line 174
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 177
    :cond_0
    sget-object v0, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩻᩻;

    .line 178
    invoke-virtual {v1}, Ll/ۗ᩻᩻;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫()V
    .locals 2

    .line 264
    invoke-static {}, Ll/۫᩻᩻;->᩻()V

    .line 265
    sget-object v0, Ll/۫᩻᩻;->ܽ:Ll/ۚۡ֫;

    sget-object v1, Ll/۫᩻᩻;->ᩳ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(I)V
    .locals 2

    .line 289
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 290
    :try_start_0
    sget-object v1, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 291
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    invoke-static {}, Ll/۫᩻᩻;->ܳ()V

    return-void

    :catchall_0
    move-exception p0

    .line 291
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(II)V
    .locals 2

    .line 272
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 273
    :try_start_0
    sget-object v1, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-static {p0, p1, v1}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 274
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    invoke-static {}, Ll/۫᩻᩻;->ܳ()V

    return-void

    :catchall_0
    move-exception p0

    .line 274
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 3

    .line 236
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 237
    :try_start_0
    sget-object v1, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 238
    sget-object v1, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 239
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩻᩻;

    .line 240
    instance-of v2, v1, Ll/ۖۘ᩻;

    if-eqz v2, :cond_0

    check-cast v1, Ll/ۖۘ᩻;

    .line 241
    sget-object v2, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 243
    :cond_0
    sget-object v2, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 246
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    invoke-static {}, Ll/۫᩻᩻;->᩻()V

    .line 248
    sget-object p0, Ll/۫᩻᩻;->ܽ:Ll/ۚۡ֫;

    sget-object v0, Ll/۫᩻᩻;->ᩳ:Ljava/util/List;

    invoke-virtual {p0, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    .line 246
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/֨ۡ֫;)V
    .locals 1

    .line 144
    sget-object v0, Ll/۫᩻᩻;->ܽ:Ll/ۚۡ֫;

    invoke-virtual {v0, p0}, Ll/֡ۡ֫;->֫(Ll/֨ۡ֫;)V

    return-void
.end method

.method public static ֫(Ll/֨ۡᩴ;)V
    .locals 7

    const-string v1, "Unexpected config count "

    .line 323
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 324
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    sget-object v3, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v2, v4, :cond_4

    .line 327
    new-instance v1, Ll/᩵᩷ᩴ;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 112
    invoke-direct {v1, v2}, Ll/᩵᩷ᩴ;-><init>(I)V

    .line 328
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩻᩻;

    .line 329
    iget v4, v3, Ll/ۗ᩻᩻;->᩶:I

    invoke-virtual {v1, v4, v3}, Ll/᩵᩷ᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 331
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    sget-object v3, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 332
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    .line 333
    invoke-interface {p0, v4}, Ll/֨ۡᩴ;->getInt(I)I

    move-result v5

    .line 334
    invoke-virtual {v1, v5}, Ll/᩵᩷ᩴ;->remove(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ᩻᩻;

    if-eqz v6, :cond_1

    .line 338
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 336
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown config id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 340
    :cond_2
    invoke-virtual {v1}, Ll/᩵᩷ᩴ;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 343
    sget-object p0, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 344
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 345
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    invoke-static {}, Ll/۫᩻᩻;->ܳ()V

    return-void

    .line 341
    :cond_3
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing config ids "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/᩵᩷ᩴ;->keySet()Ll/ۨۡᩴ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 325
    :cond_4
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception p0

    .line 345
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/֨ۡ֫;)V
    .locals 1

    .line 148
    sget-object v0, Ll/۫᩻᩻;->ܽ:Ll/ۚۡ֫;

    invoke-virtual {v0, p0, p1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public static ֫(Ll/ۗ᩻᩻;)V
    .locals 2

    .line 252
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 253
    :try_start_0
    instance-of v1, p0, Ll/ۖۘ᩻;

    if-eqz v1, :cond_0

    check-cast p0, Ll/ۖۘ᩻;

    .line 254
    sget-object v1, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 256
    :cond_0
    sget-object v1, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 259
    invoke-static {}, Ll/۫᩻᩻;->᩻()V

    .line 260
    sget-object p0, Ll/۫᩻᩻;->ܽ:Ll/ۚۡ֫;

    sget-object v0, Ll/۫᩻᩻;->ᩳ:Ljava/util/List;

    invoke-virtual {p0, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    .line 258
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۧ()I
    .locals 4

    .line 212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x64

    div-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    and-long/2addr v0, v2

    long-to-int v1, v0

    .line 220
    :goto_0
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 221
    :try_start_0
    sget-object v2, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩻᩻;

    .line 222
    iget v3, v3, Ll/ۗ᩻᩻;->᩶:I

    if-ne v3, v1, :cond_0

    .line 223
    monitor-exit v0

    goto :goto_1

    .line 226
    :cond_1
    sget-object v2, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩻᩻;

    .line 227
    iget v3, v3, Ll/ۗ᩻᩻;->᩶:I

    if-ne v3, v1, :cond_2

    .line 228
    monitor-exit v0

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 231
    :cond_3
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ۧ(Ll/ۗ᩻᩻;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 65
    invoke-virtual {p0}, Ll/ۗ᩻᩻;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 67
    const-class v1, Ll/֫ܺ᩻;

    const-string v2, "nct"

    if-ne p0, v1, :cond_0

    const/4 p0, 0x0

    .line 68
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0

    .line 69
    :cond_0
    const-class v1, Ll/ۜܺ᩻;

    if-ne p0, v1, :cond_1

    const/4 p0, 0x1

    .line 70
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0

    .line 71
    :cond_1
    const-class v1, Ll/ܳᩴ᩻;

    if-ne p0, v1, :cond_2

    const/4 p0, 0x2

    .line 72
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0

    .line 73
    :cond_2
    const-class v1, Ll/ۚۚ᩻;

    if-ne p0, v1, :cond_3

    const/4 p0, 0x3

    .line 74
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0

    .line 75
    :cond_3
    const-class v1, Ll/᩻֡᩻;

    if-ne p0, v1, :cond_4

    const/4 p0, 0x4

    .line 76
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0

    .line 77
    :cond_4
    const-class v1, Ll/۬ۖ᩻;

    if-ne p0, v1, :cond_5

    const/4 p0, 0x5

    .line 78
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0

    .line 79
    :cond_5
    const-class v1, Ll/ۖۘ᩻;

    if-ne p0, v1, :cond_6

    const/4 p0, 0x6

    .line 80
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0

    .line 82
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۖۘ᩻;
    .locals 3

    .line 200
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 203
    :cond_0
    sget-object v0, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۘ᩻;

    .line 204
    invoke-virtual {v1}, Ll/ۖۘ᩻;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(I)V
    .locals 2

    .line 296
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 297
    :try_start_0
    sget-object v1, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 298
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    invoke-static {}, Ll/۫᩻᩻;->ܳ()V

    return-void

    :catchall_0
    move-exception p0

    .line 298
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۧ(II)V
    .locals 2

    .line 279
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 280
    :try_start_0
    sget-object v1, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-static {p0, p1, v1}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 281
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    invoke-static {}, Ll/۫᩻᩻;->ܳ()V

    return-void

    :catchall_0
    move-exception p0

    .line 281
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ܳ()V
    .locals 4

    .line 306
    new-instance v0, Ll/۬᩻᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/۫᩻᩻;

    const-wide/16 v2, 0x1f4

    invoke-static {v0, v1, v2, v3}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method

.method public static ܽ()Ljava/util/List;
    .locals 1

    .line 152
    sget-object v0, Ll/۫᩻᩻;->ᩳ:Ljava/util/List;

    return-object v0
.end method

.method public static ܽ(I)Ll/ۗ᩻᩻;
    .locals 3

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    sget-object v0, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩻᩻;

    .line 165
    iget v2, v1, Ll/ۗ᩻᩻;->᩶:I

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܿ()Ljava/util/List;
    .locals 1

    .line 156
    sget-object v0, Ll/۫᩻᩻;->ܿ:Ljava/util/List;

    return-object v0
.end method

.method public static ᩳ()Lbin/mt/json/JSONArray;
    .locals 4

    .line 131
    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1}, Lbin/mt/json/JSONArray;-><init>()V

    .line 132
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 133
    :try_start_0
    sget-object v2, Ll/۫᩻᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩻᩻;

    .line 134
    invoke-static {v3}, Ll/۫᩻᩻;->ۧ(Ll/ۗ᩻᩻;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 136
    :cond_0
    sget-object v2, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۘ᩻;

    .line 137
    invoke-static {v3}, Ll/۫᩻᩻;->ۧ(Ll/ۗ᩻᩻;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 139
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ᩳ(I)Ll/ۖۘ᩻;
    .locals 3

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 190
    :cond_0
    sget-object v0, Ll/۫᩻᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۘ᩻;

    .line 191
    iget v2, v1, Ll/ۗ᩻᩻;->᩶:I

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static native declared-synchronized ᩻()V
.end method
