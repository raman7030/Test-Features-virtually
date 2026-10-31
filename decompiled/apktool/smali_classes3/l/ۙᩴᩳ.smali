.class public final Ll/ۙᩴᩳ;
.super Ljava/lang/Object;
.source "Q6SD"

# interfaces
.implements Ll/᩷۬ᩳ;


# instance fields
.field public final ᩸:Ll/ۗܶᩳ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۗܶᩳ;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/ۙᩴᩳ;->᩸:Ll/ۗܶᩳ;

    .line 23
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    check-cast p1, Ll/ۙܶᩳ;

    .line 63
    iget-object p1, p1, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 23
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-static {p1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p1

    const-string v0, "file:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۙᩴᩳ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final identity()Ll/ۜ۬ᩳ;
    .locals 11

    const-string v0, ":"

    .line 27
    iget-object v1, p0, Ll/ۙᩴᩳ;->᩸:Ll/ۗܶᩳ;

    move-object v2, v1

    check-cast v2, Ll/ۙܶᩳ;

    .line 98
    iget-object v2, v2, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    .line 28
    instance-of v3, v2, Ll/ܺ֡ܿ;

    if-nez v3, :cond_0

    instance-of v3, v2, Ll/ۧ᩹ܿ;

    if-eqz v3, :cond_4

    .line 29
    move-object v3, v1

    check-cast v3, Ll/ۙܶᩳ;

    .line 63
    iget-object v3, v3, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    .line 29
    invoke-static {v3}, Ll/ܿ֡ܿ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 31
    :cond_0
    instance-of v3, v2, Ll/ۨᩴܿ;

    if-eqz v3, :cond_1

    check-cast v2, Ll/ۨᩴܿ;

    invoke-virtual {v2}, Ll/ۨᩴܿ;->᩶ۧ()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    check-cast v1, Ll/ۙܶᩳ;

    .line 63
    iget-object v1, v1, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    :try_start_0
    new-array v3, v2, [Ljava/lang/String;

    .line 34
    invoke-static {v1, v3}, Ll/ۜ۠ᩴ;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    const-string v4, "unix:dev,ino,size,mode,lastModifiedTime,ctime"

    new-array v2, v2, [Ll/ܳ۠ᩴ;

    invoke-static {v3, v4, v2}, Ll/ܿ۠ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/String;[Ll/ܳ۠ᩴ;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "mode"

    .line 35
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const v4, 0xf000

    and-int/2addr v3, v4

    const v4, 0x8000

    if-eq v3, v4, :cond_2

    new-instance v2, Ll/ۜ۬ᩳ;

    iget-object v6, p0, Ll/ۙᩴᩳ;->᩹:Ljava/lang/String;

    const-string v7, ""

    const-wide/16 v8, -0x1

    const/4 v10, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Ll/ۜ۬ᩳ;-><init>(Ljava/lang/String;Ljava/lang/String;JZ)V

    return-object v2

    .line 36
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dev"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "ino"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "lastModifiedTime"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "ctime"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 37
    new-instance v3, Ll/ۜ۬ᩳ;

    iget-object v6, p0, Ll/ۙᩴᩳ;->᩹:Ljava/lang/String;

    const-string v4, "size"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    const/4 v10, 0x1

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Ll/ۜ۬ᩳ;-><init>(Ljava/lang/String;Ljava/lang/String;JZ)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    .line 40
    :catch_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1b

    if-lt v2, v3, :cond_4

    .line 42
    :try_start_1
    invoke-static {v1}, Landroid/system/Os;->stat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object v1

    .line 43
    iget v2, v1, Landroid/system/StructStat;->st_mode:I

    invoke-static {v2}, Landroid/system/OsConstants;->S_ISREG(I)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v0, Ll/ۜ۬ᩳ;

    iget-object v4, p0, Ll/ۙᩴᩳ;->᩹:Ljava/lang/String;

    const-string v5, ""

    const-wide/16 v6, -0x1

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Ll/ۜ۬ᩳ;-><init>(Ljava/lang/String;Ljava/lang/String;JZ)V

    return-object v0

    .line 44
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, v1, Landroid/system/StructStat;->st_dev:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v1, Landroid/system/StructStat;->st_ino:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/᩶ᩴᩳ;->֫(Landroid/system/StructStat;)Landroid/system/StructTimespec;

    move-result-object v3

    invoke-static {v3}, Ll/ۛۙܽ;->֫(Landroid/system/StructTimespec;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/᩶ᩴᩳ;->֫(Landroid/system/StructStat;)Landroid/system/StructTimespec;

    move-result-object v3

    invoke-static {v3}, Ll/ܽ᩷ᩳ;->֫(Landroid/system/StructTimespec;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ᩳ᩷ᩳ;->֫(Landroid/system/StructStat;)Landroid/system/StructTimespec;

    move-result-object v3

    invoke-static {v3}, Ll/ۛۙܽ;->֫(Landroid/system/StructTimespec;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ᩳ᩷ᩳ;->֫(Landroid/system/StructStat;)Landroid/system/StructTimespec;

    move-result-object v0

    invoke-static {v0}, Ll/ܽ᩷ᩳ;->֫(Landroid/system/StructTimespec;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 46
    new-instance v0, Ll/ۜ۬ᩳ;

    iget-object v6, p0, Ll/ۙᩴᩳ;->᩹:Ljava/lang/String;

    iget-wide v8, v1, Landroid/system/StructStat;->st_size:J

    const/4 v10, 0x1

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Ll/ۜ۬ᩳ;-><init>(Ljava/lang/String;Ljava/lang/String;JZ)V
    :try_end_1
    .catch Landroid/system/ErrnoException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    .line 47
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Cannot stat text source"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 52
    :cond_4
    new-instance v0, Ll/ۜ۬ᩳ;

    const-wide/16 v6, -0x1

    const/4 v8, 0x0

    iget-object v4, p0, Ll/ۙᩴᩳ;->᩹:Ljava/lang/String;

    const-string v5, ""

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Ll/ۜ۬ᩳ;-><init>(Ljava/lang/String;Ljava/lang/String;JZ)V

    return-object v0
.end method

.method public final ֫()Ljava/io/InputStream;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۙᩴᩳ;->᩸:Ll/ۗܶᩳ;

    check-cast v0, Ll/ۙܶᩳ;

    .line 88
    iget-object v0, v0, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v0

    return-object v0
.end method
