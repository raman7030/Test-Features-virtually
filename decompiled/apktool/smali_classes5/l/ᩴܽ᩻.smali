.class public final Ll/ᩴܽ᩻;
.super Ll/ۙۤܳ;
.source "M7BP"


# instance fields
.field public final ֫֫:Ljava/lang/Object;

.field public ۛ:Ljava/lang/String;

.field public final ۟:Ll/۠᩵ۢ;

.field public ۤ:Z

.field public final ۧ֫:Ljava/lang/String;

.field public final ۨ:Z

.field public ۫:Z

.field public ۬:I

.field public ܰ:J

.field public ܽ֫:Z

.field public ᩺:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/۠᩵ۢ;Z)V
    .locals 4

    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, v0}, Ll/ۙۤܳ;-><init>(Z)V

    .line 24
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    .line 28
    invoke-static {}, Ll/᩹֡ܿ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "def_mov_recycle_bin"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 28
    :goto_0
    iput-boolean v3, p0, Ll/ᩴܽ᩻;->᩺:Z

    .line 29
    iput v0, p0, Ll/ᩴܽ᩻;->۬:I

    const-wide/16 v0, 0x1

    .line 31
    iput-wide v0, p0, Ll/ᩴܽ᩻;->ܰ:J

    const-string v0, ""

    .line 32
    iput-object v0, p0, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    .line 46
    iput-object p1, p0, Ll/ᩴܽ᩻;->ۧ֫:Ljava/lang/String;

    .line 47
    iput-object p2, p0, Ll/ᩴܽ᩻;->۟:Ll/۠᩵ۢ;

    .line 48
    iput-boolean p3, p0, Ll/ᩴܽ᩻;->ۨ:Z

    return-void
.end method

.method public static ܺ(Ljava/lang/String;)I
    .locals 1

    const-string v0, "replace"

    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "skip"

    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const-string v0, "keep_both"

    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I
    .locals 0

    if-eqz p5, :cond_0

    const/4 p1, 0x1

    return p1

    .line 172
    :cond_0
    invoke-virtual {p0}, Ll/ᩴܽ᩻;->᩵()Z

    move-result p5

    if-eqz p5, :cond_1

    .line 173
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ᩴܽ᩻;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    .line 175
    :cond_1
    invoke-virtual {p0}, Ll/ᩴܽ᩻;->۬()I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V
    .locals 12

    move-object v9, p0

    .line 130
    iget-object v0, v9, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    move-object v11, v0

    monitor-enter v11

    .line 132
    :try_start_0
    iget-boolean v0, v9, Ll/ᩴܽ᩻;->ۤ:Z

    if-eqz v0, :cond_0

    .line 133
    monitor-exit v11

    return-void

    .line 135
    :cond_0
    iget-boolean v0, v9, Ll/ᩴܽ᩻;->ۨ:Z

    if-nez v0, :cond_4

    .line 138
    iget-boolean v0, v9, Ll/ᩴܽ᩻;->۫:Z

    if-eqz v0, :cond_1

    .line 139
    monitor-exit v11

    return-void

    .line 141
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v9, Ll/ᩴܽ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-c"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, v9, Ll/ᩴܽ᩻;->ܰ:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, v9, Ll/ᩴܽ᩻;->ܰ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v9, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    const/4 v10, 0x1

    .line 142
    iput-boolean v10, v9, Ll/ᩴܽ᩻;->ܽ֫:Z

    .line 144
    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 145
    iget-object v1, v9, Ll/ᩴܽ᩻;->۟:Ll/۠᩵ۢ;

    iget-object v2, v9, Ll/ᩴܽ᩻;->ۧ֫:Ljava/lang/String;

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p0

    move/from16 v8, p4

    invoke-virtual/range {v1 .. v8}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Ll/ᩴܽ᩻;Z)Z

    move-result v1

    if-nez v1, :cond_2

    .line 146
    invoke-virtual {p0, v0}, Ll/ᩴܽ᩻;->ܽ(Ljava/lang/String;)V

    return-void

    .line 149
    :cond_2
    iget-object v1, v9, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    move-object v11, v1

    monitor-enter v11

    .line 150
    :goto_0
    :try_start_1
    iget-boolean v1, v9, Ll/ᩴܽ᩻;->ܽ֫:Z

    if-eqz v1, :cond_3

    iget-boolean v1, v9, Ll/ᩴܽ᩻;->ۤ:Z

    if-nez v1, :cond_3

    iget-object v1, v9, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_3

    .line 152
    :try_start_2
    iget-object v1, v9, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 154
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 155
    iput-boolean v10, v9, Ll/ᩴܽ᩻;->ۤ:Z

    const/4 v1, 0x0

    .line 156
    iput-boolean v1, v9, Ll/ᩴܽ᩻;->ܽ֫:Z

    const-string v1, ""

    .line 157
    iput-object v1, v9, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    goto :goto_0

    .line 160
    :cond_3
    monitor-exit v11

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 136
    :cond_4
    :try_start_4
    new-instance v0, Ljava/lang/RuntimeException;

    const v1, 0x7f1203a1

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    .line 144
    monitor-exit v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;ZZ)Z
    .locals 3

    .line 200
    invoke-static {p2}, Ll/ᩴܽ᩻;->ܺ(Ljava/lang/String;)I

    move-result p2

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    return v1

    .line 204
    :cond_0
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 205
    :try_start_0
    iget-boolean v2, p0, Ll/ᩴܽ᩻;->ܽ֫:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    invoke-static {v2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    .line 208
    :cond_1
    iput p2, p0, Ll/ᩴܽ᩻;->۬:I

    .line 209
    iput-boolean p3, p0, Ll/ᩴܽ᩻;->۫:Z

    const/4 p1, 0x1

    if-nez p2, :cond_2

    if-eqz p4, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 210
    :goto_0
    iput-boolean p2, p0, Ll/ᩴܽ᩻;->᩺:Z

    .line 211
    iput-boolean v1, p0, Ll/ᩴܽ᩻;->ܽ֫:Z

    const-string p2, ""

    .line 212
    iput-object p2, p0, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    .line 213
    iget-object p2, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 214
    monitor-exit v0

    return p1

    .line 206
    :cond_3
    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    .line 215
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Z)Z
    .locals 0

    if-nez p1, :cond_0

    .line 103
    iget-boolean p1, p0, Ll/ᩴܽ᩻;->ۨ:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ll/ᩴܽ᩻;->᩵()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 2

    .line 237
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 238
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴܽ᩻;->᩺:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 239
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۬()I
    .locals 2

    .line 266
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 267
    :try_start_0
    iget v1, p0, Ll/ᩴܽ᩻;->۬:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 268
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܶ()Z
    .locals 2

    .line 111
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 112
    :try_start_0
    iget v1, p0, Ll/ᩴܽ᩻;->۬:I

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ᩴܽ᩻;->᩺:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 113
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    .line 222
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 223
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 224
    monitor-exit v0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 226
    iput-boolean p1, p0, Ll/ᩴܽ᩻;->ۤ:Z

    const/4 p1, 0x0

    .line 227
    iput-boolean p1, p0, Ll/ᩴܽ᩻;->ܽ֫:Z

    const-string p1, ""

    .line 228
    iput-object p1, p0, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    .line 229
    iget-object p1, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 230
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 3

    .line 182
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 183
    :try_start_0
    iget v1, p0, Ll/ᩴܽ᩻;->۬:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, "skip"

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    const-string v1, "keep_both"

    goto :goto_0

    :cond_1
    const-string v1, "replace"

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 184
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܿ֫()V
    .locals 2

    .line 85
    iget-object v1, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    move-object v0, v1

    monitor-enter v0

    .line 87
    :try_start_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final ᩵()Z
    .locals 2

    .line 95
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 96
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴܽ᩻;->۫:Z

    xor-int/lit8 v1, v1, 0x1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 97
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩷(Ljava/lang/String;)Z
    .locals 2

    .line 191
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 192
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴܽ᩻;->ܽ֫:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ᩴܽ᩻;->ۛ:Ljava/lang/String;

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 193
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ᩻()Z
    .locals 2

    .line 256
    iget-object v0, p0, Ll/ᩴܽ᩻;->֫֫:Ljava/lang/Object;

    monitor-enter v0

    .line 257
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴܽ᩻;->ۤ:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 258
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
