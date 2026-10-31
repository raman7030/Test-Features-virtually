.class public final Ll/᩷ܽܳ;
.super Ljava/lang/Object;
.source "P70I"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:J

.field public final ۙ:J

.field public final ۫:Ll/ۡᩳܳ;

.field public final ۬:Ll/ۜܽܳ;

.field public final ᩶:J

.field public final ᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩹:Ll/۫֫ܳ;


# direct methods
.method public constructor <init>(JJJLl/ۡᩳܳ;Ll/۫֫ܳ;Ll/ۜܽܳ;)V
    .locals 2

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/᩷ܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 179
    iput-wide p1, p0, Ll/᩷ܽܳ;->ۗ:J

    .line 180
    iput-wide p3, p0, Ll/᩷ܽܳ;->᩶:J

    .line 181
    iput-wide p5, p0, Ll/᩷ܽܳ;->ۙ:J

    .line 182
    iput-object p7, p0, Ll/᩷ܽܳ;->۫:Ll/ۡᩳܳ;

    .line 183
    iput-object p8, p0, Ll/᩷ܽܳ;->᩹:Ll/۫֫ܳ;

    .line 184
    iput-object p9, p0, Ll/᩷ܽܳ;->۬:Ll/ۜܽܳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 225
    iget-object v2, p0, Ll/᩷ܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Ll/᩷ܽܳ;->۬:Ll/ۜܽܳ;

    invoke-virtual {v0}, Ll/ۜܽܳ;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩻۟ܿ;)Ll/ۢܽܳ;
    .locals 13

    .line 231
    iget-object v0, p0, Ll/᩷ܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const-string v2, "HexRange VersionHandle is not active"

    if-eqz v1, :cond_4

    .line 195
    invoke-static {p1}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p1

    .line 196
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x0

    .line 201
    :try_start_0
    new-instance v12, Ll/ۢܽܳ;

    iget-wide v4, p0, Ll/᩷ܽܳ;->ۗ:J

    iget-wide v6, p0, Ll/᩷ܽܳ;->᩶:J

    iget-wide v8, p0, Ll/᩷ܽܳ;->ۙ:J

    iget-object v10, p0, Ll/᩷ܽܳ;->۫:Ll/ۡᩳܳ;

    iget-object v11, p0, Ll/᩷ܽܳ;->᩹:Ll/۫֫ܳ;

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, Ll/ۢܽܳ;-><init>(JJJLl/ۡᩳܳ;Ll/۫֫ܳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3

    .line 202
    :try_start_1
    invoke-virtual {v12}, Ll/ۢܽܳ;->ܽ()V

    .line 231
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_0

    return-object v12

    .line 205
    :cond_0
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 232
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    move-object v1, v12

    goto :goto_1

    :catch_3
    move-exception p1

    goto :goto_1

    :catch_4
    move-exception p1

    goto :goto_1

    :catch_5
    move-exception p1

    :goto_1
    if-eqz v1, :cond_2

    .line 213
    :try_start_2
    invoke-virtual {v1}, Ll/ۢܽܳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6

    goto :goto_2

    :catch_6
    move-exception v0

    .line 215
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 218
    :cond_2
    :goto_2
    throw p1

    .line 197
    :cond_3
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 232
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
