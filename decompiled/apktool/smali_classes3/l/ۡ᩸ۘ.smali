.class public final Ll/ۡ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ۧ:Z

.field public static ܽ:Ll/ۡ᩸ۘ;


# instance fields
.field public ֫:Ll/ۖ᩸ۘ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()Ll/ۡ᩸ۘ;
    .locals 5

    .line 41
    sget-object v0, Ll/ۡ᩸ۘ;->ܽ:Ll/ۡ᩸ۘ;

    if-nez v0, :cond_1

    .line 43
    const-class v0, Ll/ۡ᩸ۘ;

    monitor-enter v0

    .line 45
    :try_start_0
    sget-object v1, Ll/ۡ᩸ۘ;->ܽ:Ll/ۡ᩸ۘ;

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Ll/ۡ᩸ۘ;

    invoke-direct {v1}, Ll/ۡ᩸ۘ;-><init>()V

    sput-object v1, Ll/ۡ᩸ۘ;->ܽ:Ll/ۡ᩸ۘ;

    .line 62
    new-instance v2, Ll/ۘ᩸ۘ;

    sget v3, Ll/ᩴ᩸ۘ;->ۧ:I

    sget-object v4, Ll/ᩴ᩸ۘ;->֫:Ljava/lang/String;

    invoke-direct {v2, v3}, Ll/ۘ᩸ۘ;-><init>(I)V

    .line 65
    new-instance v3, Ll/ۖ᩸ۘ;

    invoke-direct {v3, v2}, Ll/ۖ᩸ۘ;-><init>(Ll/ۘ᩸ۘ;)V

    iput-object v3, v1, Ll/ۡ᩸ۘ;->֫:Ll/ۖ᩸ۘ;

    const/4 v1, 0x1

    .line 49
    sput-boolean v1, Ll/ۡ᩸ۘ;->ۧ:Z

    .line 51
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 54
    :cond_1
    :goto_0
    sget-object v0, Ll/ۡ᩸ۘ;->ܽ:Ll/ۡ᩸ۘ;

    return-object v0
.end method

.method public static final ֫(Ljava/lang/Exception;)V
    .locals 4

    .line 144
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v0

    const/4 v1, 0x2

    const-string v2, "KEYSTORE"

    const-string v3, "Exception"

    invoke-virtual {v0, v1, v2, v3, p0}, Ll/ۡ᩸ۘ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 136
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Ll/ۡ᩸ۘ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 192
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, p0, p1, p2}, Ll/ۡ᩸ۘ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ۧ()V
    .locals 4

    .line 221
    const-class v0, Ll/ۡ᩸ۘ;

    monitor-enter v0

    .line 222
    :try_start_0
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v1

    .line 230
    iget-object v2, v1, Ll/ۡ᩸ۘ;->֫:Ll/ۖ᩸ۘ;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 231
    invoke-virtual {v2}, Ll/ۖ᩸ۘ;->ۧ()V

    .line 232
    iget-object v2, v1, Ll/ۡ᩸ۘ;->֫:Ll/ۖ᩸ۘ;

    invoke-virtual {v2}, Ll/ۖ᩸ۘ;->ܽ()V

    .line 233
    iput-object v3, v1, Ll/ۡ᩸ۘ;->֫:Ll/ۖ᩸ۘ;

    .line 223
    :cond_0
    sget-object v1, Ll/ۡ᩸ۘ;->ܽ:Ll/ۡ᩸ۘ;

    if-eqz v1, :cond_1

    .line 224
    sput-object v3, Ll/ۡ᩸ۘ;->ܽ:Ll/ۡ᩸ۘ;

    .line 226
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 184
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v0

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Ll/ۡ᩸ۘ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 128
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p0, p1, p2}, Ll/ۡ᩸ۘ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ܽ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 152
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Ll/ۡ᩸ۘ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ܿ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 168
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Ll/ۡ᩸ۘ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ᩳ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 120
    invoke-static {}, Ll/ۡ᩸ۘ;->֫()Ll/ۡ᩸ۘ;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Ll/ۡ᩸ۘ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 11

    .line 69
    sget-boolean v0, Ll/ۡ᩸ۘ;->ۧ:Z

    if-eqz v0, :cond_2

    .line 70
    invoke-static {}, Ll/᩺ۤۡ;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, " SDK_VERSION:3.5.18.lite"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    iget-object v1, p0, Ll/ۡ᩸ۘ;->֫:Ll/ۖ᩸ۘ;

    if-nez v1, :cond_1

    goto :goto_1

    .line 78
    :cond_1
    sget-object v2, Ll/᩵᩸ۘ;->ۙ:Ll/᩵᩸ۘ;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-string v7, "openSDK_LOG"

    const/4 v1, 0x0

    const/16 v10, 0x20

    move v3, v10

    move-object v8, v0

    move-object v9, v1

    invoke-virtual/range {v2 .. v9}, Ll/ܺ᩸ۘ;->֫(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    iget-object v2, p0, Ll/ۡ᩸ۘ;->֫:Ll/ۖ᩸ۘ;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-string v7, "openSDK_LOG"

    invoke-virtual/range {v2 .. v9}, Ll/ܺ᩸ۘ;->֫(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    .line 80
    sput-boolean v0, Ll/ۡ᩸ۘ;->ۧ:Z

    .line 84
    :cond_2
    :goto_0
    sget-object v1, Ll/᩵᩸ۘ;->ۙ:Ll/᩵᩸ۘ;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move v2, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-virtual/range {v1 .. v8}, Ll/ܺ᩸ۘ;->֫(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    sget-object v0, Ll/ᩴ᩸ۘ;->֫:Ljava/lang/String;

    and-int/lit8 v0, p1, 0x3c

    if-ne p1, v0, :cond_4

    .line 88
    iget-object v1, p0, Ll/ۡ᩸ۘ;->֫:Ll/ۖ᩸ۘ;

    if-nez v1, :cond_3

    :goto_1
    return-void

    .line 91
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move v2, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-virtual/range {v1 .. v8}, Ll/ܺ᩸ۘ;->֫(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-void
.end method
