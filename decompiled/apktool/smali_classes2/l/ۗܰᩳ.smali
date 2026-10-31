.class public final Ll/ۗܰᩳ;
.super Ljava/lang/Object;
.source "O6SW"


# instance fields
.field public final ֫:Ljava/lang/Byte;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Byte;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p1, p0, Ll/ۗܰᩳ;->ܿ:Z

    iput-boolean p2, p0, Ll/ۗܰᩳ;->ᩳ:Z

    .line 17
    iput-object p3, p0, Ll/ۗܰᩳ;->ܽ:Ljava/lang/String;

    iput-object p4, p0, Ll/ۗܰᩳ;->ۧ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۗܰᩳ;->֫:Ljava/lang/Byte;

    return-void
.end method

.method public static ֫(Ljava/io/ByteArrayInputStream;JI)Ll/ۗܰᩳ;
    .locals 9

    .line 22
    invoke-static {p1, p2, p0}, Ll/᩻᩶ᩳ;->֫(JLjava/io/InputStream;)Ll/᩻᩶ᩳ;

    move-result-object p0

    if-ltz p3, :cond_2

    int-to-long v0, p3

    cmp-long v2, p1, v0

    if-gtz v2, :cond_2

    .line 24
    :try_start_0
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v4

    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v5

    .line 25
    invoke-virtual {p0, p3}, Ll/᩻᩶ᩳ;->ܽ(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, p3}, Ll/᩻᩶ᩳ;->ܽ(I)Ljava/lang/String;

    move-result-object v7

    .line 27
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->ܽ()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-eqz p3, :cond_1

    .line 28
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->ܽ()J

    move-result-wide p1

    const-wide/16 v0, 0x3

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->ۛۧ()I

    move-result p1

    const/16 p2, 0x7272

    if-ne p1, p2, :cond_0

    .line 29
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readByte()I

    move-result p1

    int-to-byte p1, p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid legacy search parameter trailer"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    move-object v8, p1

    .line 31
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->ᩳ()V

    .line 32
    new-instance p1, Ll/ۗܰᩳ;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Ll/ۗܰᩳ;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Byte;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->close()V

    return-object p1

    .line 23
    :cond_2
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy search exceeds app state limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 22
    :try_start_2
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ۗܰᩳ;
    .locals 9

    .line 38
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v2

    .line 39
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v4

    .line 41
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v5

    const-wide/16 v7, 0x3

    cmp-long v0, v5, v7

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ll/۬ۜܽ;->ᩳ()I

    move-result v0

    const/16 v5, 0x7272

    if-ne v0, v5, :cond_0

    const/4 v0, 0x2

    .line 42
    invoke-virtual {p0, v0}, Ll/۬ۜܽ;->skipBytes(I)V

    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    move-object v5, p0

    .line 44
    new-instance p0, Ll/ۗܰᩳ;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ۗܰᩳ;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Byte;)V

    return-object p0
.end method
