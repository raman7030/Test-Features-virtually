.class public final Ll/۫۠֫;
.super Ljava/lang/Object;
.source "J8OH"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:Ll/ܺ۠֫;

.field public ۜ:Ll/ۘܶ֫;

.field public ۡ:Ll/֨ܶ֫;

.field public final ۢ:Ljava/util/ArrayList;

.field public final ۧ:Ll/᩸۠֫;

.field public ܳ:Ll/᩸۠֫;

.field public ܽ:Ll/֡۠֫;

.field public ܿ:Ll/ۚ۠֫;

.field public final ᩳ:Landroid/content/Context;

.field public ᩷:Ll/᩸۠֫;

.field public ᩻:Ll/ܽܶ֫;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/᩸۠֫;)V
    .locals 0

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 226
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/۫۠֫;->ᩳ:Landroid/content/Context;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    iput-object p2, p0, Ll/۫۠֫;->ۧ:Ll/᩸۠֫;

    .line 228
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۫۠֫;->ۢ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(Ll/᩸۠֫;)V
    .locals 3

    const/4 v0, 0x0

    .line 380
    :goto_0
    iget-object v1, p0, Ll/۫۠֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 381
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܶ֫;

    invoke-interface {p1, v1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩸۠֫;Ll/֡ܶ֫;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 388
    invoke-interface {p0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 300
    iget-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 302
    :try_start_0
    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    iput-object v1, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    .line 305
    throw v0

    :cond_0
    return-void
.end method

.method public final read([BII)I
    .locals 1

    .line 281
    iget-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 6

    .line 249
    iget-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 251
    iget-object v0, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 252
    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 472
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    .line 473
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    iget-object v5, p0, Ll/۫۠֫;->ᩳ:Landroid/content/Context;

    if-nez v4, :cond_f

    const-string v4, "file"

    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v0, "asset"

    .line 259
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 326
    iget-object v0, p0, Ll/۫۠֫;->֫:Ll/ܺ۠֫;

    if-nez v0, :cond_2

    .line 327
    new-instance v0, Ll/ܺ۠֫;

    invoke-direct {v0, v5}, Ll/ܺ۠֫;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/۫۠֫;->֫:Ll/ܺ۠֫;

    .line 328
    invoke-direct {p0, v0}, Ll/۫۠֫;->֫(Ll/᩸۠֫;)V

    .line 330
    :cond_2
    iget-object v0, p0, Ll/۫۠֫;->֫:Ll/ܺ۠֫;

    .line 260
    iput-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    goto/16 :goto_4

    :cond_3
    const-string v0, "content"

    .line 261
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 334
    iget-object v0, p0, Ll/۫۠֫;->ܽ:Ll/֡۠֫;

    if-nez v0, :cond_4

    .line 335
    new-instance v0, Ll/֡۠֫;

    invoke-direct {v0, v5}, Ll/֡۠֫;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/۫۠֫;->ܽ:Ll/֡۠֫;

    .line 336
    invoke-direct {p0, v0}, Ll/۫۠֫;->֫(Ll/᩸۠֫;)V

    .line 338
    :cond_4
    iget-object v0, p0, Ll/۫۠֫;->ܽ:Ll/֡۠֫;

    .line 262
    iput-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    goto/16 :goto_4

    :cond_5
    const-string v0, "rtmp"

    .line 263
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, Ll/۫۠֫;->ۧ:Ll/᩸۠֫;

    if-eqz v0, :cond_7

    .line 342
    iget-object v0, p0, Ll/۫۠֫;->᩷:Ll/᩸۠֫;

    if-nez v0, :cond_6

    :try_start_0
    const-string v0, "androidx.media3.datasource.rtmp.RtmpDataSource"

    .line 345
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 346
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۠֫;

    iput-object v0, p0, Ll/۫۠֫;->᩷:Ll/᩸۠֫;

    .line 348
    invoke-direct {p0, v0}, Ll/۫۠֫;->֫(Ll/᩸۠֫;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 354
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error instantiating RTMP extension"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    const-string v0, "Attempting to play RTMP stream without depending on the RTMP extension"

    .line 351
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 356
    :goto_1
    iget-object v0, p0, Ll/۫۠֫;->᩷:Ll/᩸۠֫;

    if-nez v0, :cond_6

    .line 357
    iput-object v3, p0, Ll/۫۠֫;->᩷:Ll/᩸۠֫;

    .line 360
    :cond_6
    iget-object v0, p0, Ll/۫۠֫;->᩷:Ll/᩸۠֫;

    .line 264
    iput-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    goto/16 :goto_4

    :cond_7
    const-string v0, "udp"

    .line 265
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 310
    iget-object v0, p0, Ll/۫۠֫;->ۡ:Ll/֨ܶ֫;

    if-nez v0, :cond_8

    .line 311
    new-instance v0, Ll/֨ܶ֫;

    invoke-direct {v0}, Ll/֨ܶ֫;-><init>()V

    iput-object v0, p0, Ll/۫۠֫;->ۡ:Ll/֨ܶ֫;

    .line 312
    invoke-direct {p0, v0}, Ll/۫۠֫;->֫(Ll/᩸۠֫;)V

    .line 314
    :cond_8
    iget-object v0, p0, Ll/۫۠֫;->ۡ:Ll/֨ܶ֫;

    .line 266
    iput-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    goto/16 :goto_4

    :cond_9
    const-string v0, "data"

    .line 267
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 364
    iget-object v0, p0, Ll/۫۠֫;->ܿ:Ll/ۚ۠֫;

    if-nez v0, :cond_a

    .line 365
    new-instance v0, Ll/ۚ۠֫;

    .line 46
    invoke-direct {v0, v1}, Ll/ۖ۠֫;-><init>(Z)V

    .line 365
    iput-object v0, p0, Ll/۫۠֫;->ܿ:Ll/ۚ۠֫;

    .line 366
    invoke-direct {p0, v0}, Ll/۫۠֫;->֫(Ll/᩸۠֫;)V

    .line 368
    :cond_a
    iget-object v0, p0, Ll/۫۠֫;->ܿ:Ll/ۚ۠֫;

    .line 268
    iput-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    goto :goto_4

    :cond_b
    const-string v0, "rawresource"

    .line 269
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "android.resource"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_2

    .line 272
    :cond_c
    iput-object v3, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    goto :goto_4

    .line 372
    :cond_d
    :goto_2
    iget-object v0, p0, Ll/۫۠֫;->ۜ:Ll/ۘܶ֫;

    if-nez v0, :cond_e

    .line 373
    new-instance v0, Ll/ۘܶ֫;

    invoke-direct {v0, v5}, Ll/ۘܶ֫;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/۫۠֫;->ۜ:Ll/ۘܶ֫;

    .line 374
    invoke-direct {p0, v0}, Ll/۫۠֫;->֫(Ll/᩸۠֫;)V

    .line 376
    :cond_e
    iget-object v0, p0, Ll/۫۠֫;->ۜ:Ll/ۘܶ֫;

    .line 270
    iput-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    goto :goto_4

    .line 253
    :cond_f
    :goto_3
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    const-string v2, "/android_asset/"

    .line 254
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 326
    iget-object v0, p0, Ll/۫۠֫;->֫:Ll/ܺ۠֫;

    if-nez v0, :cond_10

    .line 327
    new-instance v0, Ll/ܺ۠֫;

    invoke-direct {v0, v5}, Ll/ܺ۠֫;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/۫۠֫;->֫:Ll/ܺ۠֫;

    .line 328
    invoke-direct {p0, v0}, Ll/۫۠֫;->֫(Ll/᩸۠֫;)V

    .line 330
    :cond_10
    iget-object v0, p0, Ll/۫۠֫;->֫:Ll/ܺ۠֫;

    .line 255
    iput-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    goto :goto_4

    .line 318
    :cond_11
    iget-object v0, p0, Ll/۫۠֫;->᩻:Ll/ܽܶ֫;

    if-nez v0, :cond_12

    .line 319
    new-instance v0, Ll/ܽܶ֫;

    .line 105
    invoke-direct {v0, v1}, Ll/ۖ۠֫;-><init>(Z)V

    .line 319
    iput-object v0, p0, Ll/۫۠֫;->᩻:Ll/ܽܶ֫;

    .line 320
    invoke-direct {p0, v0}, Ll/۫۠֫;->֫(Ll/᩸۠֫;)V

    .line 322
    :cond_12
    iget-object v0, p0, Ll/۫۠֫;->᩻:Ll/ܽܶ֫;

    .line 257
    iput-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    .line 275
    :goto_4
    iget-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 294
    iget-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    iget-object v0, p0, Ll/۫۠֫;->ۧ:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    .line 236
    iget-object v0, p0, Ll/۫۠֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    iget-object v0, p0, Ll/۫۠֫;->᩻:Ll/ܽܶ֫;

    invoke-static {v0, p1}, Ll/۫۠֫;->֫(Ll/᩸۠֫;Ll/֡ܶ֫;)V

    .line 238
    iget-object v0, p0, Ll/۫۠֫;->֫:Ll/ܺ۠֫;

    invoke-static {v0, p1}, Ll/۫۠֫;->֫(Ll/᩸۠֫;Ll/֡ܶ֫;)V

    .line 239
    iget-object v0, p0, Ll/۫۠֫;->ܽ:Ll/֡۠֫;

    invoke-static {v0, p1}, Ll/۫۠֫;->֫(Ll/᩸۠֫;Ll/֡ܶ֫;)V

    .line 240
    iget-object v0, p0, Ll/۫۠֫;->᩷:Ll/᩸۠֫;

    invoke-static {v0, p1}, Ll/۫۠֫;->֫(Ll/᩸۠֫;Ll/֡ܶ֫;)V

    .line 241
    iget-object v0, p0, Ll/۫۠֫;->ۡ:Ll/֨ܶ֫;

    invoke-static {v0, p1}, Ll/۫۠֫;->֫(Ll/᩸۠֫;Ll/֡ܶ֫;)V

    .line 242
    iget-object v0, p0, Ll/۫۠֫;->ܿ:Ll/ۚ۠֫;

    invoke-static {v0, p1}, Ll/۫۠֫;->֫(Ll/᩸۠֫;Ll/֡ܶ֫;)V

    .line 243
    iget-object v0, p0, Ll/۫۠֫;->ۜ:Ll/ۘܶ֫;

    invoke-static {v0, p1}, Ll/۫۠֫;->֫(Ll/᩸۠֫;Ll/֡ܶ֫;)V

    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 288
    iget-object v0, p0, Ll/۫۠֫;->ܳ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
