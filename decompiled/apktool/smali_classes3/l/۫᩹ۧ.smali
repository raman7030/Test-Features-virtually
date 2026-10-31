.class public final Ll/۫᩹ۧ;
.super Ljava/lang/Object;
.source "D9OF"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public ۜ:[Ll/ۤ᩹ۧ;

.field public final ۧ:Landroid/content/res/AssetManager;

.field public final ܳ:Ll/ۧ᩶ۧ;

.field public final ܽ:Ljava/io/File;

.field public ܿ:Z

.field public final ᩳ:[B

.field public ᩷:[B

.field public final ᩻:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Ll/ۧ᩶ۧ;Ljava/lang/String;Ljava/io/File;)V
    .locals 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 80
    iput-boolean v0, p0, Ll/۫᩹ۧ;->ܿ:Z

    .line 103
    iput-object p1, p0, Ll/۫᩹ۧ;->ۧ:Landroid/content/res/AssetManager;

    .line 104
    iput-object p2, p0, Ll/۫᩹ۧ;->᩻:Ljava/util/concurrent/Executor;

    .line 105
    iput-object p3, p0, Ll/۫᩹ۧ;->ܳ:Ll/ۧ᩶ۧ;

    .line 106
    iput-object p4, p0, Ll/۫᩹ۧ;->֫:Ljava/lang/String;

    .line 109
    iput-object p5, p0, Ll/۫᩹ۧ;->ܽ:Ljava/io/File;

    .line 378
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    const/4 p3, 0x0

    if-lt p1, p2, :cond_1

    const/16 p2, 0x22

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 402
    :pswitch_0
    sget-object p3, Ll/ᩴ᩶ۧ;->᩻:[B

    goto :goto_0

    .line 396
    :pswitch_1
    sget-object p3, Ll/ᩴ᩶ۧ;->ܳ:[B

    goto :goto_0

    .line 391
    :pswitch_2
    sget-object p3, Ll/ᩴ᩶ۧ;->ܿ:[B

    goto :goto_0

    .line 389
    :pswitch_3
    sget-object p3, Ll/ᩴ᩶ۧ;->ᩳ:[B

    goto :goto_0

    .line 386
    :pswitch_4
    sget-object p3, Ll/ᩴ᩶ۧ;->ܽ:[B

    .line 110
    :cond_1
    :goto_0
    iput-object p3, p0, Ll/۫᩹ۧ;->ᩳ:[B

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ֫(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 205
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    .line 206
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 208
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "compressed"

    .line 209
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(ILjava/io/Serializable;)V
    .locals 1

    .line 87
    new-instance v0, Ll/۬᩹ۧ;

    invoke-direct {v0, p0, p1, p2}, Ll/۬᩹ۧ;-><init>(Ll/۫᩹ۧ;ILjava/lang/Object;)V

    iget-object p1, p0, Ll/۫᩹ۧ;->᩻:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/۫᩹ۧ;ILjava/lang/Object;)V
    .locals 0

    .line 87
    iget-object p0, p0, Ll/۫᩹ۧ;->ܳ:Ll/ۧ᩶ۧ;

    invoke-interface {p0, p1, p2}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 5

    .line 118
    iget-object v0, p0, Ll/۫᩹ۧ;->ᩳ:[B

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 119
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x3

    invoke-direct {p0, v2, v0}, Ll/۫᩹ۧ;->֫(ILjava/io/Serializable;)V

    return v1

    .line 129
    :cond_0
    iget-object v0, p0, Ll/۫᩹ۧ;->ܽ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    if-eqz v2, :cond_1

    .line 130
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_2

    .line 131
    invoke-direct {p0, v4, v3}, Ll/۫᩹ۧ;->֫(ILjava/io/Serializable;)V

    return v1

    .line 136
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    const/4 v0, 0x1

    .line 146
    iput-boolean v0, p0, Ll/۫᩹ۧ;->ܿ:Z

    return v0

    .line 140
    :catch_0
    invoke-direct {p0, v4, v3}, Ll/۫᩹ۧ;->֫(ILjava/io/Serializable;)V

    return v1
.end method

.method public final ۧ()Ll/۫᩹ۧ;
    .locals 12

    .line 174
    iget-object v0, p0, Ll/۫᩹ۧ;->ۧ:Landroid/content/res/AssetManager;

    iget-object v1, p0, Ll/۫᩹ۧ;->ܳ:Ll/ۧ᩶ۧ;

    .line 151
    iget-boolean v2, p0, Ll/۫᩹ۧ;->ܿ:Z

    if-eqz v2, :cond_9

    .line 175
    iget-object v2, p0, Ll/۫᩹ۧ;->ᩳ:[B

    if-nez v2, :cond_0

    goto/16 :goto_a

    :cond_0
    const/4 v3, 0x7

    const/4 v4, 0x0

    :try_start_0
    const-string v5, "dexopt/baseline.prof"

    .line 225
    invoke-direct {p0, v0, v5}, Ll/۫᩹ۧ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v5
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v5

    .line 229
    invoke-interface {v1, v3, v5}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v5

    const/4 v6, 0x6

    .line 227
    invoke-interface {v1, v6, v5}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    :goto_0
    move-object v5, v4

    :goto_1
    const-string v6, "Invalid magic"

    const/4 v7, 0x4

    const/16 v8, 0x8

    if-eqz v5, :cond_2

    .line 243
    :try_start_1
    sget-object v9, Ll/ۢ᩶ۧ;->֫:[B

    .line 70
    invoke-static {v5, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v10

    .line 71
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 76
    invoke-static {v5, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v9

    .line 244
    iget-object v10, p0, Ll/۫᩹ۧ;->֫:Ljava/lang/String;

    invoke-static {v5, v9, v10}, Ll/ۢ᩶ۧ;->֫(Ljava/io/FileInputStream;[BLjava/lang/String;)[Ll/ۤ᩹ۧ;

    move-result-object v9
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 251
    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    move-exception v5

    .line 253
    invoke-interface {v1, v3, v5}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    goto :goto_4

    .line 196
    :cond_1
    :try_start_3
    new-instance v9, Ljava/lang/IllegalStateException;

    invoke-direct {v9, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    throw v9
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v9

    .line 248
    :try_start_4
    invoke-interface {v1, v8, v9}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    goto :goto_2

    :catch_4
    move-exception v9

    .line 246
    invoke-interface {v1, v3, v9}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 251
    :goto_2
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_3

    :catch_5
    move-exception v5

    .line 253
    invoke-interface {v1, v3, v5}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    :goto_3
    move-object v9, v4

    .line 181
    :goto_4
    iput-object v9, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;

    goto :goto_7

    .line 251
    :goto_5
    :try_start_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v2

    .line 253
    invoke-interface {v1, v3, v2}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    .line 255
    :goto_6
    throw v0

    .line 183
    :cond_2
    :goto_7
    iget-object v5, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;

    if-eqz v5, :cond_8

    .line 411
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x18

    if-lt v9, v10, :cond_8

    const/16 v11, 0x22

    if-le v9, v11, :cond_3

    goto :goto_a

    :cond_3
    if-eq v9, v10, :cond_4

    const/16 v10, 0x19

    if-eq v9, v10, :cond_4

    packed-switch v9, :pswitch_data_0

    goto :goto_a

    :cond_4
    :pswitch_0
    :try_start_7
    const-string v9, "dexopt/baseline.profm"

    .line 268
    invoke-direct {p0, v0, v9}, Ll/۫᩹ۧ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_7

    if-eqz v0, :cond_6

    .line 270
    :try_start_8
    sget-object v9, Ll/ۢ᩶ۧ;->ۧ:[B

    .line 70
    invoke-static {v0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v10

    .line 71
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 76
    invoke-static {v0, v7}, Ll/ۛ᩹ۧ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v6

    .line 271
    invoke-static {v0, v6, v2, v5}, Ll/ۢ᩶ۧ;->֫(Ljava/io/FileInputStream;[B[B[Ll/ۤ᩹ۧ;)[Ll/ۤ᩹ۧ;

    move-result-object v2

    iput-object v2, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 279
    :try_start_9
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_7

    move-object v4, p0

    goto :goto_9

    .line 196
    :cond_5
    :try_start_a
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catchall_1
    move-exception v2

    .line 268
    :try_start_b
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception v0

    :try_start_c
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v2

    :cond_6
    if-eqz v0, :cond_7

    .line 279
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/FileNotFoundException; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_7

    goto :goto_9

    :catch_7
    move-exception v0

    .line 285
    iput-object v4, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;

    .line 286
    invoke-interface {v1, v8, v0}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    goto :goto_9

    :catch_8
    move-exception v0

    .line 283
    invoke-interface {v1, v3, v0}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    goto :goto_9

    :catch_9
    move-exception v0

    const/16 v2, 0x9

    .line 280
    invoke-interface {v1, v2, v0}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    :cond_7
    :goto_9
    if-eqz v4, :cond_8

    return-object v4

    :cond_8
    :goto_a
    return-object p0

    .line 152
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1f
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ܽ()V
    .locals 6

    .line 311
    iget-object v0, p0, Ll/۫᩹ۧ;->ܳ:Ll/ۧ᩶ۧ;

    iget-object v1, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;

    if-eqz v1, :cond_3

    .line 313
    iget-object v2, p0, Ll/۫᩹ۧ;->ᩳ:[B

    if-nez v2, :cond_0

    goto :goto_2

    .line 151
    :cond_0
    iget-boolean v3, p0, Ll/۫᩹ۧ;->ܿ:Z

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    .line 317
    :try_start_0
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    :try_start_1
    sget-object v5, Ll/ۢ᩶ۧ;->֫:[B

    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    .line 81
    invoke-virtual {v4, v2}, Ljava/io/OutputStream;->write([B)V

    .line 319
    invoke-static {v4, v2, v1}, Ll/ۢ᩶ۧ;->֫(Ljava/io/ByteArrayOutputStream;[B[Ll/ۤ᩹ۧ;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x5

    .line 326
    invoke-interface {v0, v1, v3}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    .line 330
    iput-object v3, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 335
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    .line 334
    :cond_1
    :try_start_3
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    iput-object v1, p0, Ll/۫᩹ۧ;->᩷:[B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 335
    :try_start_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 317
    :try_start_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v1

    const/16 v2, 0x8

    .line 338
    invoke-interface {v0, v2, v1}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v1

    const/4 v2, 0x7

    .line 336
    invoke-interface {v0, v2, v1}, Ll/ۧ᩶ۧ;->֫(ILjava/lang/Object;)V

    .line 340
    :goto_1
    iput-object v3, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;

    return-void

    .line 152
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    return-void
.end method

.method public final ᩳ()Z
    .locals 6

    .line 353
    iget-object v0, p0, Ll/۫᩹ۧ;->᩷:[B

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_4

    .line 151
    :cond_0
    iget-boolean v2, p0, Ll/۫᩹ۧ;->ܿ:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    .line 359
    :try_start_0
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 360
    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v4, p0, Ll/۫᩹ۧ;->ܽ:Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v4, 0x200

    :try_start_2
    new-array v4, v4, [B

    .line 190
    :goto_0
    invoke-virtual {v3, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_1

    .line 191
    invoke-virtual {v0, v4, v1, v5}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    .line 363
    invoke-direct {p0, v4, v2}, Ll/۫᩹ۧ;->֫(ILjava/io/Serializable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 365
    :try_start_3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 370
    iput-object v2, p0, Ll/۫᩹ۧ;->᩷:[B

    .line 371
    iput-object v2, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;

    return v4

    :catchall_0
    move-exception v4

    .line 358
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v3

    :try_start_8
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    goto :goto_5

    :catch_0
    move-exception v0

    const/4 v3, 0x7

    .line 368
    :try_start_9
    invoke-direct {p0, v3, v0}, Ll/۫᩹ۧ;->֫(ILjava/io/Serializable;)V

    goto :goto_3

    :catch_1
    move-exception v0

    const/4 v3, 0x6

    .line 366
    invoke-direct {p0, v3, v0}, Ll/۫᩹ۧ;->֫(ILjava/io/Serializable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 370
    :goto_3
    iput-object v2, p0, Ll/۫᩹ۧ;->᩷:[B

    .line 371
    iput-object v2, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;

    :goto_4
    return v1

    .line 370
    :goto_5
    iput-object v2, p0, Ll/۫᩹ۧ;->᩷:[B

    .line 371
    iput-object v2, p0, Ll/۫᩹ۧ;->ۜ:[Ll/ۤ᩹ۧ;

    .line 372
    throw v0

    .line 152
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
