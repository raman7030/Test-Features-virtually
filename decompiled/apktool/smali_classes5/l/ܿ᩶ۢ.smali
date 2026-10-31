.class public final Ll/ܿ᩶ۢ;
.super Ll/ۖ᩹ۢ;
.source "M1TZ"


# instance fields
.field public ֡:Ljava/lang/String;

.field public final ۖ:Ll/ۨܶۢ;

.field public ۘ:F

.field public final ۚ:Z

.field public final ۜ:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field public ۡ:I

.field public final ۢ:Ljava/lang/String;

.field public final ۧ:Ll/ۚۡ֫;

.field public ܳ:Ll/ܿ᩹ۢ;

.field public ܺ:I

.field public final ܽ:[Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/ᩴ᩶ۢ;

.field public final ᩴ:[B

.field public final ᩵:Ljava/util/concurrent/CountDownLatch;

.field public final ᩷:Ll/ۨܶۢ;

.field public final ᩻:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZLl/ᩴ᩶ۢ;)V
    .locals 2

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 116
    new-instance v0, Ll/ۨܶۢ;

    invoke-direct {v0}, Ll/ۨܶۢ;-><init>()V

    iput-object v0, p0, Ll/ܿ᩶ۢ;->᩷:Ll/ۨܶۢ;

    .line 121
    new-instance v0, Ll/ۨܶۢ;

    invoke-direct {v0}, Ll/ۨܶۢ;-><init>()V

    iput-object v0, p0, Ll/ܿ᩶ۢ;->ۖ:Ll/ۨܶۢ;

    const/4 v0, 0x5

    new-array v0, v0, [B

    .line 125
    iput-object v0, p0, Ll/ܿ᩶ۢ;->ᩴ:[B

    .line 127
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ll/ܿ᩶ۢ;->᩵:Ljava/util/concurrent/CountDownLatch;

    .line 133
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/ܿ᩶ۢ;->ۧ:Ll/ۚۡ֫;

    .line 180
    new-instance v0, Ll/ܰ᩹ۢ;

    .line 181
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ܰ᩹ۢ;-><init>(Ll/ܿ᩶ۢ;Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ܿ᩶ۢ;->ۜ:Landroid/os/Handler;

    .line 211
    iput-object p6, p0, Ll/ܿ᩶ۢ;->ᩳ:Ll/ᩴ᩶ۢ;

    .line 213
    iput-object p1, p0, Ll/ܿ᩶ۢ;->ۢ:Ljava/lang/String;

    .line 214
    iput-object p2, p0, Ll/ܿ᩶ۢ;->ܿ:Ljava/lang/String;

    .line 215
    iput-object p3, p0, Ll/ܿ᩶ۢ;->ܽ:[Ljava/lang/String;

    .line 216
    iput-object p4, p0, Ll/ܿ᩶ۢ;->᩻:[Ljava/lang/String;

    .line 217
    iput-boolean p5, p0, Ll/ܿ᩶ۢ;->ۚ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿ᩶ۢ;)Ll/ܽ᩶ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩶ۢ;->ᩳ:Ll/ᩴ᩶ۢ;

    return-object p0
.end method

.method public static ۜ(Ll/ܿ᩶ۢ;)V
    .locals 4

    .line 400
    :try_start_0
    iget-object v0, p0, Ll/ܿ᩶ۢ;->᩵:Ljava/util/concurrent/CountDownLatch;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-object v0, p0

    .line 405
    monitor-enter v0

    const/4 v1, -0x1

    .line 406
    :try_start_1
    iput v1, p0, Ll/ܿ᩶ۢ;->ۡ:I

    .line 408
    iget-object v1, p0, Ll/ܿ᩶ۢ;->ۧ:Ll/ۚۡ֫;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 409
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 412
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ۖ:Ll/ۨܶۢ;

    invoke-virtual {v0}, Ll/ۨܶۢ;->֫()V

    .line 413
    iget-object v0, p0, Ll/ܿ᩶ۢ;->᩷:Ll/ۨܶۢ;

    invoke-virtual {v0}, Ll/ۨܶۢ;->֫()V

    .line 414
    iget p0, p0, Ll/ܿ᩶ۢ;->ܺ:I

    invoke-static {p0}, Lbin/mt/term/Exec;->close(I)V

    return-void

    :catchall_0
    move-exception p0

    .line 409
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ۧ(Ll/ܿ᩶ۢ;)Ll/ܿ᩹ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩶ۢ;->ܳ:Ll/ܿ᩹ۢ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܿ᩶ۢ;)Ll/ۨܶۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩶ۢ;->ۖ:Ll/ۨܶۢ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܿ᩶ۢ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩶ۢ;->ۜ:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܿ᩶ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿ᩶ۢ;->ۡ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܿ᩶ۢ;)Ll/ۨܶۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩶ۢ;->᩷:Ll/ۨܶۢ;

    return-object p0
.end method

.method public static ᩷(Ll/ܿ᩶ۢ;)V
    .locals 0

    .line 360
    iget-object p0, p0, Ll/ܿ᩶ۢ;->ᩳ:Ll/ᩴ᩶ۢ;

    invoke-virtual {p0}, Ll/ᩴ᩶ۢ;->ܽ()V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܿ᩶ۢ;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩶ۢ;->᩵:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method


# virtual methods
.method public final ֫(F)V
    .locals 0

    .line 457
    iput p1, p0, Ll/ܿ᩶ۢ;->ۘ:F

    return-void
.end method

.method public final ֫(IFI)V
    .locals 5

    .line 228
    iput p2, p0, Ll/ܿ᩶ۢ;->ۘ:F

    .line 229
    iget-object p2, p0, Ll/ܿ᩶ۢ;->ܳ:Ll/ܿ᩹ۢ;

    if-nez p2, :cond_0

    .line 251
    new-instance p2, Ll/ܿ᩹ۢ;

    invoke-direct {p2, p0, p1, p3}, Ll/ܿ᩹ۢ;-><init>(Ll/ܿ᩶ۢ;II)V

    iput-object p2, p0, Ll/ܿ᩶ۢ;->ܳ:Ll/ܿ᩹ۢ;

    const/4 p2, 0x1

    new-array v0, p2, [I

    .line 254
    iget-object v1, p0, Ll/ܿ᩶ۢ;->ܽ:[Ljava/lang/String;

    iget-object v2, p0, Ll/ܿ᩶ۢ;->᩻:[Ljava/lang/String;

    iget-object v3, p0, Ll/ܿ᩶ۢ;->ۢ:Ljava/lang/String;

    iget-object v4, p0, Ll/ܿ᩶ۢ;->ܿ:Ljava/lang/String;

    invoke-static {v3, v4, v1, v2, v0}, Lbin/mt/term/Exec;->createSubprocess(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[I)I

    move-result v1

    iput v1, p0, Ll/ܿ᩶ۢ;->ܺ:I

    const/4 v2, 0x0

    .line 255
    aget v0, v0, v2

    iput v0, p0, Ll/ܿ᩶ۢ;->ۡ:I

    .line 256
    invoke-static {v1, p3, p1}, Lbin/mt/term/Exec;->setPtyWindowSize(III)V

    .line 257
    invoke-virtual {p0}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p3, p0, Ll/ܿ᩶ۢ;->ۧ:Ll/ۚۡ֫;

    invoke-virtual {p3, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 259
    iget p1, p0, Ll/ܿ᩶ۢ;->ܺ:I

    .line 89
    const-class p3, Ljava/io/FileDescriptor;

    new-instance v0, Ljava/io/FileDescriptor;

    invoke-direct {v0}, Ljava/io/FileDescriptor;-><init>()V

    :try_start_0
    const-string v1, "descriptor"

    .line 93
    invoke-virtual {p3, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    :try_start_1
    const-string v1, "fd"

    .line 96
    invoke-virtual {p3, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p3

    .line 98
    :goto_0
    invoke-virtual {p3, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 261
    :catch_1
    new-instance p1, Ll/۟᩹ۢ;

    invoke-direct {p1, p0, v0}, Ll/۟᩹ۢ;-><init>(Ll/ܿ᩶ۢ;Ljava/io/FileDescriptor;)V

    .line 278
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 280
    new-instance p1, Ll/֫᩶ۢ;

    invoke-direct {p1, p0, v0}, Ll/֫᩶ۢ;-><init>(Ll/ܿ᩶ۢ;Ljava/io/FileDescriptor;)V

    .line 294
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 296
    new-instance p1, Ll/ۧ᩶ۢ;

    invoke-direct {p1, p0}, Ll/ۧ᩶ۢ;-><init>(Ll/ܿ᩶ۢ;)V

    .line 302
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    .line 232
    :cond_0
    iget p2, p0, Ll/ܿ᩶ۢ;->ܺ:I

    invoke-static {p2, p3, p1}, Lbin/mt/term/Exec;->setPtyWindowSize(III)V

    .line 233
    iget-object p2, p0, Ll/ܿ᩶ۢ;->ܳ:Ll/ܿ᩹ۢ;

    invoke-virtual {p2, p1, p3}, Ll/ܿ᩹ۢ;->֫(II)V

    return-void
.end method

.method public final ֫(IZ)V
    .locals 4

    const v0, 0x10ffff

    if-gt p1, v0, :cond_5

    const v0, 0xd800

    if-lt p1, v0, :cond_0

    const v0, 0xdfff

    if-le p1, v0, :cond_5

    :cond_0
    const/4 v0, 0x0

    .line 323
    iget-object v1, p0, Ll/ܿ᩶ۢ;->ᩴ:[B

    if-eqz p2, :cond_1

    const/16 p2, 0x1b

    aput-byte p2, v1, v0

    const/4 v0, 0x1

    :cond_1
    const/16 p2, 0x7f

    if-gt p1, p2, :cond_2

    add-int/lit8 p2, v0, 0x1

    int-to-byte p1, p1

    .line 326
    aput-byte p1, v1, v0

    goto :goto_1

    :cond_2
    const/16 p2, 0x7ff

    if-gt p1, p2, :cond_3

    add-int/lit8 p2, v0, 0x1

    shr-int/lit8 v2, p1, 0x6

    or-int/lit16 v2, v2, 0xc0

    int-to-byte v2, v2

    .line 329
    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x2

    and-int/lit8 p1, p1, 0x3f

    or-int/lit16 p1, p1, 0x80

    int-to-byte p1, p1

    .line 331
    aput-byte p1, v1, p2

    :goto_0
    move p2, v0

    goto :goto_1

    :cond_3
    const p2, 0xffff

    if-gt p1, p2, :cond_4

    add-int/lit8 p2, v0, 0x1

    shr-int/lit8 v2, p1, 0xc

    or-int/lit16 v2, v2, 0xe0

    int-to-byte v2, v2

    .line 334
    aput-byte v2, v1, v0

    add-int/lit8 v2, v0, 0x2

    shr-int/lit8 v3, p1, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    .line 336
    aput-byte v3, v1, p2

    add-int/lit8 p2, v0, 0x3

    and-int/lit8 p1, p1, 0x3f

    or-int/lit16 p1, p1, 0x80

    int-to-byte p1, p1

    .line 338
    aput-byte p1, v1, v2

    goto :goto_1

    :cond_4
    add-int/lit8 p2, v0, 0x1

    shr-int/lit8 v2, p1, 0x12

    or-int/lit16 v2, v2, 0xf0

    int-to-byte v2, v2

    .line 341
    aput-byte v2, v1, v0

    add-int/lit8 v2, v0, 0x2

    shr-int/lit8 v3, p1, 0xc

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    .line 343
    aput-byte v3, v1, p2

    add-int/lit8 p2, v0, 0x3

    shr-int/lit8 v3, p1, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    .line 345
    aput-byte v3, v1, v2

    add-int/lit8 v0, v0, 0x4

    and-int/lit8 p1, p1, 0x3f

    or-int/lit16 p1, p1, 0x80

    int-to-byte p1, p1

    .line 347
    aput-byte p1, v1, p2

    goto :goto_0

    .line 349
    :goto_1
    invoke-virtual {p0, p2, v1}, Ll/ܿ᩶ۢ;->֫(I[B)V

    return-void

    .line 319
    :cond_5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid code point: "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 319
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(I[B)V
    .locals 1

    .line 310
    iget v0, p0, Ll/ܿ᩶ۢ;->ۡ:I

    if-lez v0, :cond_0

    iget-object v0, p0, Ll/ܿ᩶ۢ;->ۖ:Ll/ۨܶۢ;

    invoke-virtual {v0, p1, p2}, Ll/ۨܶۢ;->֫(I[B)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 435
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ᩳ:Ll/ᩴ᩶ۢ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩶ۢ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ۖ()Z
    .locals 1

    .line 177
    iget-boolean v0, p0, Ll/ܿ᩶ۢ;->ۚ:Z

    return v0
.end method

.method public final ۜ()Ll/ۚۡ֫;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ۧ:Ll/ۚۡ֫;

    return-object v0
.end method

.method public final ۡ()F
    .locals 1

    .line 453
    iget v0, p0, Ll/ܿ᩶ۢ;->ۘ:F

    return v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 3

    .line 170
    iget-boolean v0, p0, Ll/ܿ᩶ۢ;->ۚ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 171
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const p1, 0x7f120a51

    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    return-void

    .line 173
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const p1, 0x7f120a4c

    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 375
    invoke-virtual {p0}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 376
    iget v0, p0, Ll/ܿ᩶ۢ;->ۡ:I

    invoke-static {v0}, Lbin/mt/term/Exec;->killAll(I)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized ܺ()Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 423
    :try_start_0
    iget v1, p0, Ll/ܿ᩶ۢ;->ۡ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ()V
    .locals 1

    .line 440
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ᩳ:Ll/ᩴ᩶ۢ;

    invoke-virtual {v0}, Ll/ᩴ᩶ۢ;->֫()V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 419
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ᩳ:Ll/ᩴ᩶ۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 445
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ᩳ:Ll/ᩴ᩶ۢ;

    invoke-virtual {v0}, Ll/ᩴ᩶ۢ;->ۧ()V

    return-void
.end method

.method public final ᩷()Ll/ܽ᩶ۢ;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ᩳ:Ll/ᩴ᩶ۢ;

    return-object v0
.end method

.method public final ᩻()Ll/ܿ᩹ۢ;
    .locals 1

    .line 353
    iget-object v0, p0, Ll/ܿ᩶ۢ;->ܳ:Ll/ܿ᩹ۢ;

    return-object v0
.end method
