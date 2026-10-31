.class public Ll/֨ۚܳ;
.super Ll/ۛܶۢ;
.source "Z72R"

# interfaces
.implements Ll/ۗ᩵ܳ;


# static fields
.field public static final ᩴ֫:Ll/֫ۤᩴ;

.field public static final ᩵֫:Ljava/util/concurrent/Semaphore;


# instance fields
.field public volatile ۖ֫:Ljava/lang/String;

.field public volatile ۘ֫:J

.field public final ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 87
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    sput-object v0, Ll/֨ۚܳ;->᩵֫:Ljava/util/concurrent/Semaphore;

    .line 88
    invoke-static {}, Ll/ۧۤᩴ;->newKeySet()Ll/֫ۤᩴ;

    move-result-object v0

    sput-object v0, Ll/֨ۚܳ;->ᩴ֫:Ll/֫ۤᩴ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 86
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    .line 90
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/֨ۚܳ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private ۤ֫()V
    .locals 5

    .line 210
    iget-wide v0, p0, Ll/֨ۚܳ;->ۘ֫:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 212
    iput-wide v2, p0, Ll/֨ۚܳ;->ۘ֫:J

    .line 213
    invoke-static {v0, v1}, Ll/ܽ᩷ܳ;->֫(J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    .line 172
    iget-object v0, p0, Ll/֨ۚܳ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 173
    invoke-super {p0}, Ll/ۘ۠ۢ;->cancel()V

    return-void
.end method

.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ܿ۠ۢ;Z)V
    .locals 0

    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/֨ۚܳ;->ۖ֫:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "archiveName"

    .line 102
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 96
    sget-object v0, Ll/᩻ܶۢ;->ۚ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 10

    const-string v0, "sourceTempLease"

    .line 117
    :try_start_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۨ()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 118
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۖ(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ۚܳ;->ۘ֫:J

    .line 120
    :cond_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֫֫()Ll/ܰܺܳ;

    move-result-object v0

    .line 121
    invoke-static {v0}, Ll/ܿ֡ܳ;->ܿ(Ll/ܰܺܳ;)Ljava/lang/String;

    move-result-object v1

    .line 122
    sget-object v2, Ll/֨ۚܳ;->ᩴ֫:Ll/֫ۤᩴ;

    invoke-virtual {v2, v1}, Ll/֫ۤᩴ;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const v0, 0x7f1200dc

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 198
    iput-object v0, p0, Ll/֨ۚܳ;->ۖ֫:Ljava/lang/String;

    .line 199
    invoke-static {v0}, Ll/ܿ۠ۢ;->֫(Ljava/lang/String;)Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 165
    invoke-direct {p0}, Ll/֨ۚܳ;->ۤ֫()V

    return-object v0

    :cond_1
    const/4 v3, 0x0

    .line 128
    :try_start_1
    sget-object v4, Ll/֨ۚܳ;->᩵֫:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v4}, Ljava/util/concurrent/Semaphore;->tryAcquire()Z

    move-result v3

    if-nez v3, :cond_3

    const v0, 0x7f1200db

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 198
    iput-object v0, p0, Ll/֨ۚܳ;->ۖ֫:Ljava/lang/String;

    .line 199
    invoke-static {v0}, Ll/ܿ۠ۢ;->֫(Ljava/lang/String;)Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_2

    .line 160
    :try_start_2
    invoke-virtual {v4}, Ljava/util/concurrent/Semaphore;->release()V

    .line 162
    :cond_2
    invoke-virtual {v2, v1}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 165
    invoke-direct {p0}, Ll/֨ۚܳ;->ۤ֫()V

    return-object v0

    :cond_3
    const v5, 0x7f1200df

    .line 134
    :try_start_3
    invoke-static {v0}, Ll/ܿ֡ܳ;->ۧ(Ll/ܰܺܳ;)Ll/֫֡ܳ;

    move-result-object v6
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 139
    :try_start_4
    invoke-static {v0, p0}, Ll/ܿ֡ܳ;->֫(Ll/ܰܺܳ;Ll/֨ۚܳ;)Ll/ۛ᩵ܳ;

    move-result-object v7

    .line 141
    invoke-virtual {v7}, Ll/ۛ᩵ܳ;->ᩳ()Ll/ۧ֡ܳ;

    move-result-object v8

    sget-object v9, Ll/ۧ֡ܳ;->᩹:Ll/ۧ֡ܳ;

    if-eq v8, v9, :cond_f

    invoke-virtual {p0}, Ll/֨ۚܳ;->۫֫()Z

    move-result v8

    if-eqz v8, :cond_4

    goto/16 :goto_4

    .line 145
    :cond_4
    invoke-virtual {v6, v0}, Ll/֫֡ܳ;->֫(Ll/ܰܺܳ;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 651
    invoke-static {v5}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 198
    iput-object v0, p0, Ll/֨ۚܳ;->ۖ֫:Ljava/lang/String;

    .line 199
    invoke-static {v0}, Ll/ܿ۠ۢ;->֫(Ljava/lang/String;)Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v3, :cond_5

    .line 160
    :try_start_5
    invoke-virtual {v4}, Ljava/util/concurrent/Semaphore;->release()V

    .line 162
    :cond_5
    invoke-virtual {v2, v1}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 165
    invoke-direct {p0}, Ll/֨ۚܳ;->ۤ֫()V

    return-object v0

    .line 148
    :cond_6
    :try_start_6
    sget-object v0, Ll/ۚۚܳ;->֫:[I

    invoke-virtual {v7}, Ll/ۛ᩵ܳ;->ᩳ()Ll/ۧ֡ܳ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v0, v0, v5

    const/4 v5, 0x1

    if-eq v0, v5, :cond_d

    const/4 v5, 0x2

    if-eq v0, v5, :cond_c

    const/4 v5, 0x3

    if-eq v0, v5, :cond_a

    const/4 v5, 0x4

    if-eq v0, v5, :cond_9

    const/4 v5, 0x5

    if-ne v0, v5, :cond_8

    .line 155
    invoke-virtual {v7}, Ll/ۛ᩵ܳ;->ܽ()Ljava/lang/Exception;

    move-result-object v0

    if-nez v0, :cond_7

    .line 156
    new-instance v0, Ljava/io/IOException;

    const-string v5, "Archive test failed"

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    invoke-virtual {v7}, Ll/ۛ᩵ܳ;->ܽ()Ljava/lang/Exception;

    move-result-object v0

    .line 204
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Ll/֨ۚܳ;->ۖ֫:Ljava/lang/String;

    .line 205
    invoke-static {v0}, Ll/ܿ۠ۢ;->֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;

    move-result-object v0

    goto :goto_3

    .line 148
    :cond_8
    new-instance v0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {v0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw v0

    :cond_9
    const v0, 0x7f1200e1

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 198
    iput-object v0, p0, Ll/֨ۚܳ;->ۖ֫:Ljava/lang/String;

    .line 199
    :goto_1
    invoke-static {v0}, Ll/ܿ۠ۢ;->֫(Ljava/lang/String;)Ll/ܿ۠ۢ;

    move-result-object v0

    goto :goto_3

    .line 151
    :cond_a
    invoke-virtual {v7}, Ll/ۛ᩵ܳ;->֫()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    const v0, 0x7f1200dd

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 153
    :cond_b
    invoke-virtual {v7}, Ll/ۛ᩵ܳ;->֫()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v5, 0x7f1200de

    .line 655
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 198
    :goto_2
    iput-object v0, p0, Ll/֨ۚܳ;->ۖ֫:Ljava/lang/String;

    goto :goto_1

    .line 150
    :cond_c
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    goto :goto_3

    .line 149
    :cond_d
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_3
    if-eqz v3, :cond_e

    .line 160
    :try_start_7
    invoke-virtual {v4}, Ljava/util/concurrent/Semaphore;->release()V

    .line 162
    :cond_e
    invoke-virtual {v2, v1}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 165
    invoke-direct {p0}, Ll/֨ۚܳ;->ۤ֫()V

    return-object v0

    .line 142
    :cond_f
    :goto_4
    :try_start_8
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz v3, :cond_10

    .line 160
    :try_start_9
    invoke-virtual {v4}, Ljava/util/concurrent/Semaphore;->release()V

    .line 162
    :cond_10
    invoke-virtual {v2, v1}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 165
    invoke-direct {p0}, Ll/֨ۚܳ;->ۤ֫()V

    return-object v0

    .line 651
    :catch_0
    :try_start_a
    invoke-static {v5}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 198
    iput-object v0, p0, Ll/֨ۚܳ;->ۖ֫:Ljava/lang/String;

    .line 199
    invoke-static {v0}, Ll/ܿ۠ۢ;->֫(Ljava/lang/String;)Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz v3, :cond_11

    .line 160
    :try_start_b
    sget-object v2, Ll/֨ۚܳ;->᩵֫:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    .line 162
    :cond_11
    sget-object v2, Ll/֨ۚܳ;->ᩴ֫:Ll/֫ۤᩴ;

    invoke-virtual {v2, v1}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 165
    invoke-direct {p0}, Ll/֨ۚܳ;->ۤ֫()V

    return-object v0

    :catchall_0
    move-exception v0

    if-eqz v3, :cond_12

    .line 160
    :try_start_c
    sget-object v2, Ll/֨ۚܳ;->᩵֫:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    .line 162
    :cond_12
    sget-object v2, Ll/֨ۚܳ;->ᩴ֫:Ll/֫ۤᩴ;

    invoke-virtual {v2, v1}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z

    .line 163
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    :catchall_1
    move-exception v0

    .line 165
    invoke-direct {p0}, Ll/֨ۚܳ;->ۤ֫()V

    .line 166
    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 228
    invoke-direct {p0}, Ll/֨ۚܳ;->ۤ֫()V

    .line 229
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f1200e0

    .line 230
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method

.method public final ۫֫()Z
    .locals 1

    .line 178
    iget-object v0, p0, Ll/֨ۚܳ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f1200da

    .line 107
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const v0, 0x7f1200e2

    .line 108
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܿ(I)V

    const/4 v0, 0x0

    .line 109
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method
