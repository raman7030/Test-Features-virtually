.class public final Ll/ᩴۘᩳ;
.super Ljava/lang/Object;
.source "I6TG"


# instance fields
.field public final ֫:[B

.field public final ۧ:[B

.field public final ܽ:Ll/᩵ۘᩳ;

.field public final ܿ:Ll/ۛܰᩳ;

.field public final ᩳ:Ll/᩺ܶᩳ;


# direct methods
.method public constructor <init>(Ll/ۘۘᩳ;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {p1}, Ll/ۘۘᩳ;->ܽ(Ll/ۘۘᩳ;)Ll/᩵ۘᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۘᩳ;->ܽ:Ll/᩵ۘᩳ;

    invoke-static {p1}, Ll/ۘۘᩳ;->ܿ(Ll/ۘۘᩳ;)Ll/ۤܰᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤܰᩳ;->finish()Ll/ۛܰᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۘᩳ;->ܿ:Ll/ۛܰᩳ;

    .line 30
    invoke-static {p1}, Ll/ۘۘᩳ;->ᩳ(Ll/ۘۘᩳ;)Ll/ۛۘᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۘᩳ;->֫()Ll/᩺ܶᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۘᩳ;->ᩳ:Ll/᩺ܶᩳ;

    .line 31
    invoke-static {p1}, Ll/ۘۘᩳ;->ۧ(Ll/ۘۘᩳ;)[B

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۘᩳ;->ۧ:[B

    invoke-static {p1}, Ll/ۘۘᩳ;->֫(Ll/ۘۘᩳ;)[B

    move-result-object p1

    iput-object p1, p0, Ll/ᩴۘᩳ;->֫:[B

    return-void
.end method

.method public static synthetic ֫(Ll/ۖ᩶ᩳ;Ll/֨۬ᩳ;Ll/۫᩹ᩳ;Ll/۫᩶ᩳ;)Ll/ᩴۘᩳ;
    .locals 1

    const/high16 v0, 0x800000

    .line 36
    invoke-virtual {p0}, Ll/ۖ᩶ᩳ;->֫()Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-static {p2, p3, p0, p1, v0}, Ll/ᩴۘᩳ;->֫(Ll/۫᩹ᩳ;Ll/۫᩶ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)Ll/ᩴۘᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫᩹ᩳ;Ll/۫᩶ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)Ll/ᩴۘᩳ;
    .locals 5

    .line 50
    invoke-virtual {p1}, Ll/۫᩶ᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    if-ltz p4, :cond_0

    invoke-virtual {p1}, Ll/۫᩶ᩳ;->ᩳ()J

    move-result-wide v0

    int-to-long v2, p4

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 53
    new-instance v0, Ll/ۘۘᩳ;

    invoke-direct {v0, p0, p4}, Ll/ۘۘᩳ;-><init>(Ll/۫᩹ᩳ;I)V

    .line 54
    :try_start_0
    invoke-virtual {p1, p2, p3}, Ll/۫᩶ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {p1}, Ll/۫᩶ᩳ;->ᩳ()J

    move-result-wide p1

    invoke-static {p0, p1, p2, p3, v0}, Ll/ܿ᩶ᩳ;->֫(Ljava/io/InputStream;JLl/֨۬ᩳ;Ll/ᩳ᩶ᩳ;)V

    .line 55
    invoke-virtual {v0}, Ll/ۘۘᩳ;->֫()V

    .line 56
    new-instance p0, Ll/ᩴۘᩳ;

    invoke-direct {p0, v0}, Ll/ᩴۘᩳ;-><init>(Ll/ۘۘᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    invoke-virtual {v0}, Ll/ۘۘᩳ;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 53
    :try_start_1
    invoke-virtual {v0}, Ll/ۘۘᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0

    .line 51
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Migration app state is missing or exceeds limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܿ۬ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)Ll/ᩴۘᩳ;
    .locals 4

    move-object v0, p0

    .line 41
    monitor-enter v0

    .line 42
    :try_start_0
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->֫()[B

    move-result-object v1

    invoke-static {v1}, Ll/۫᩶ᩳ;->ۧ([B)Ll/۫᩶ᩳ;

    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ll/۫᩶ᩳ;->ܽ()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->ܳ()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 44
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->᩻()Ll/۫᩹ᩳ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-static {p0, v1, p1, p2, p3}, Ll/ᩴۘᩳ;->֫(Ll/۫᩹ᩳ;Ll/۫᩶ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)Ll/ᩴۘᩳ;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->close()V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 43
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Migration app identity does not match"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_2
    move-exception p0

    .line 45
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p0
.end method
