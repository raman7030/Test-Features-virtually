.class public final Ll/ۨᩴۜ;
.super Ljava/lang/Object;
.source "D6WI"

# interfaces
.implements Ll/ۢۖۜ;


# instance fields
.field public final synthetic ᩸:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ۨᩴۜ;->᩸:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    .line 55
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    return-void
.end method

.method public final ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    .locals 5

    .line 50
    iget-wide v0, p1, Ll/ܶۖۜ;->ܽ:J

    iget-wide v2, p0, Ll/ۨᩴۜ;->᩸:J

    cmp-long v4, v2, v0

    if-gtz v4, :cond_3

    .line 51
    invoke-virtual {p1}, Ll/ܶۖۜ;->֫()Ljava/io/InputStream;

    move-result-object p1

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 52
    :goto_0
    :try_start_0
    invoke-static {p1, p2, v2, v3, v0}, Ll/᩸ܺۜ;->֫(Ljava/io/InputStream;Ljava/io/BufferedOutputStream;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 53
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_2

    .line 51
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p2

    :cond_3
    const-string p1, "Truncation cannot extend the file."

    .line 50
    invoke-static {p1, v0, v1, v2, v3}, Ll/ۛᩴۜ;->֫(Ljava/lang/String;JJ)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method
