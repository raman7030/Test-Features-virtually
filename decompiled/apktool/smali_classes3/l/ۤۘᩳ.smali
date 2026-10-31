.class public final Ll/ۤۘᩳ;
.super Ljava/lang/Object;
.source "06TX"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/۬ۘᩳ;

.field public final ۙ:Ll/᩷۠ᩴ;

.field public final ۤ:Ljava/lang/String;

.field public final ۫:Ll/ۖ᩶ᩳ;

.field public final ۬:Ll/ᩴۘᩳ;

.field public ᩶:Z

.field public final ᩸:[B

.field public final ᩹:Ll/᩷۠ᩴ;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ljava/lang/String;Ll/ۖ᩶ᩳ;[BLl/ᩴۘᩳ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ۤۘᩳ;->᩹:Ll/᩷۠ᩴ;

    iput-object p2, p0, Ll/ۤۘᩳ;->ۤ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۤۘᩳ;->۫:Ll/ۖ᩶ᩳ;

    invoke-virtual {p3}, Ll/ۖ᩶ᩳ;->֫()Ll/᩷۠ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ۤۘᩳ;->ۙ:Ll/᩷۠ᩴ;

    .line 43
    iput-object p5, p0, Ll/ۤۘᩳ;->۬:Ll/ᩴۘᩳ;

    sget-object p1, Ll/۫ۘᩳ;->֫:Ll/۬ۘᩳ;

    iput-object p1, p0, Ll/ۤۘᩳ;->ۗ:Ll/۬ۘᩳ;

    invoke-virtual {p3}, Ll/ۖ᩶ᩳ;->ܽ()Ljava/util/UUID;

    move-result-object p1

    invoke-static {p1, p4}, Ll/ۤۘᩳ;->֫(Ljava/util/UUID;[B)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۤۘᩳ;->᩸:[B

    return-void
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/lang/String;I)Ljava/io/InputStream;
    .locals 1

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ".dat"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    .line 171
    invoke-static {p0}, Ll/ۤۘᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    const/4 p1, 0x1

    new-array p1, p1, [Ll/᩻۠ᩴ;

    sget-object p2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v0, 0x0

    aput-object p2, p1, v0

    invoke-static {p0, p1}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ll/֨۬ᩳ;)Ll/ۤۘᩳ;
    .locals 6

    .line 52
    invoke-static {p1, p0}, Ll/ۤۘᩳ;->ۧ(Ljava/lang/String;Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p0

    .line 54
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v1

    .line 56
    sget-object v0, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x1

    new-array v3, v2, [Ll/ܳ۠ᩴ;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v3}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "app-adopted"

    .line 58
    invoke-interface {p0, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    new-array v5, v2, [Ll/ܳ۠ᩴ;

    aput-object v0, v5, v4

    invoke-static {v3, v5}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "current"

    .line 59
    invoke-interface {p0, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    new-array v2, v2, [Ll/ܳ۠ᩴ;

    aput-object v0, v2, v4

    invoke-static {v3, v2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Adopted app migration has no recovery entry"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 62
    :cond_1
    :goto_0
    invoke-static {p1}, Ll/ۤۘᩳ;->֫(Ljava/lang/String;)[B

    move-result-object v4

    .line 63
    new-instance v0, Ll/᩸ۘᩳ;

    invoke-direct {v0, p0, v1, p1, p2}, Ll/᩸ۘᩳ;-><init>(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;Ljava/lang/String;Ll/֨۬ᩳ;)V

    invoke-static {p0, v4, p2, v0}, Ll/ᩴ᩶ᩳ;->֫(Ll/᩷۠ᩴ;[BLl/֨۬ᩳ;Ll/᩸ۘᩳ;)Ll/ۖ᩶ᩳ;

    move-result-object p0

    .line 36
    :try_start_0
    new-instance v0, Ll/᩻᩵ᩳ;

    invoke-direct {v0, p0, p2}, Ll/᩻᩵ᩳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ll/ۖ᩶ᩳ;->֫(Ll/᩻᩵ᩳ;)Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Ll/ᩴۘᩳ;

    .line 76
    new-instance p2, Ll/ۤۘᩳ;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Ll/ۤۘᩳ;-><init>(Ll/᩷۠ᩴ;Ljava/lang/String;Ll/ۖ᩶ᩳ;[BLl/ᩴۘᩳ;)V

    .line 77
    invoke-virtual {p2}, Ll/ۤۘᩳ;->ܽ()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    .line 80
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Ll/ۖ᩶ᩳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_2

    :catch_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 81
    :goto_2
    throw p1

    .line 56
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Legacy state root is not a directory"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ֫(Ljava/lang/String;Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    const-string v0, ".tat"

    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-static {p0}, Ll/ۤۘᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    return-object p0
.end method

.method public static ֫(Ll/ۤۘᩳ;)V
    .locals 11

    .line 113
    iget-object v0, p0, Ll/ۤۘᩳ;->۬:Ll/ᩴۘᩳ;

    iget-object v1, p0, Ll/ۤۘᩳ;->ۤ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۤۘᩳ;->᩹:Ll/᩷۠ᩴ;

    .line 125
    iget-object v3, p0, Ll/ۤۘᩳ;->ۗ:Ll/۬ۘᩳ;

    iget-object v4, p0, Ll/ۤۘᩳ;->ۙ:Ll/᩷۠ᩴ;

    const-string v5, "app-adopted"

    invoke-interface {v4, v5}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v5

    const-string v6, "app-adopted.tmp"

    invoke-interface {v4, v6}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v6

    .line 126
    invoke-virtual {p0}, Ll/ۤۘᩳ;->ܽ()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_0

    .line 127
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Ll/ۗۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    goto :goto_0

    .line 130
    :cond_0
    invoke-virtual {v3, v6}, Ll/۬ۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 131
    iget-object v7, p0, Ll/ۤۘᩳ;->᩸:[B

    invoke-static {v6, v7}, Ll/ۗۘᩳ;->֫(Ll/᩷۠ᩴ;[B)V

    const/4 v7, 0x2

    new-array v7, v7, [Ll/᩺֨ᩴ;

    .line 207
    sget-object v9, Ll/ۖ۠ᩴ;->ATOMIC_MOVE:Ll/ۖ۠ᩴ;

    aput-object v9, v7, v8

    sget-object v9, Ll/ۖ۠ᩴ;->REPLACE_EXISTING:Ll/ۖ۠ᩴ;

    const/4 v10, 0x1

    aput-object v9, v7, v10

    invoke-static {v6, v5, v7}, Ll/ܿ۠ᩴ;->move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)Ll/᩷۠ᩴ;

    .line 133
    invoke-virtual {p0}, Ll/ۤۘᩳ;->ܽ()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 135
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    sget-object p0, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {p0, v4}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 114
    iget-object v4, v0, Ll/ᩴۘᩳ;->ܽ:Ll/᩵ۘᩳ;

    invoke-virtual {v4}, Ll/᩵ۘᩳ;->ۧ()Z

    move-result v4

    const-string v5, ".dat"

    if-eqz v4, :cond_1

    .line 115
    :goto_1
    iget-object v4, v0, Ll/ᩴۘᩳ;->ܽ:Ll/᩵ۘᩳ;

    invoke-virtual {v4}, Ll/᩵ۘᩳ;->ᩳ()I

    move-result v4

    if-ge v8, v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "-"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/۬ۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    const-string v0, ".tat"

    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/۬ۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 118
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/۬ۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    const-string v0, ".lit"

    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/۬ۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 212
    invoke-interface {p0, v2}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    return-void

    .line 133
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "App migration adoption record was not published"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۤۘᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    return-void
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/util/UUID;)V
    .locals 3

    const-string v0, "app-adopted"

    .line 140
    invoke-interface {p0, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 141
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    invoke-static {p1}, Ll/ۤۘᩳ;->֫(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p2, p1}, Ll/ۤۘᩳ;->֫(Ljava/util/UUID;[B)[B

    move-result-object p1

    const/16 p2, 0x40

    invoke-static {p0, p2}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;I)[B

    move-result-object p0

    invoke-static {p1, p0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid app migration adoption record"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;Ljava/lang/String;Ll/֨۬ᩳ;Ll/ۘ᩶ᩳ;)V
    .locals 15

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "legacy.scratch"

    move-object v3, p0

    .line 65
    invoke-interface {p0, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ll/ܳ۠ᩴ;

    .line 215
    sget-object v5, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v4}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v2}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    invoke-static {v2}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V

    :cond_0
    const-string v4, ".lit"

    .line 67
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v4

    const/high16 v5, 0x800000

    invoke-static {v4, v5}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;I)[B

    move-result-object v4

    .line 33
    array-length v7, v4

    if-gt v7, v5, :cond_2

    .line 34
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v7

    .line 36
    :try_start_0
    array-length v8, v4

    invoke-virtual {v7, v4, v6, v8}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v7, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 37
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v8, v7}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    .line 38
    invoke-virtual {v7}, Landroid/os/Parcel;->dataPosition()I

    move-result v9

    array-length v4, v4

    if-ne v9, v4, :cond_1

    .line 39
    invoke-static {v5, v8}, Ll/᩵ۘᩳ;->֫(ILandroid/os/Bundle;)Ll/᩵ۘᩳ;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 41
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    const-string v7, ".dat"

    .line 68
    invoke-virtual {v1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v7}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v7

    .line 171
    invoke-static {v7}, Ll/ۤۘᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    new-array v3, v3, [Ll/᩻۠ᩴ;

    sget-object v8, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v8, v3, v6

    invoke-static {v7, v3}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object v3

    int-to-long v6, v5

    move-object/from16 v8, p3

    .line 68
    invoke-static {v3, v2, v8, v6, v7}, Ll/ۡ᩶ᩳ;->֫(Ljava/io/InputStream;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;J)Ll/ۡ᩶ᩳ;

    move-result-object v2

    .line 69
    :try_start_1
    new-instance v10, Ll/᩶ۘᩳ;

    invoke-direct {v10, v1, v0}, Ll/᩶ۘᩳ;-><init>(Ljava/lang/String;Ll/᩷۠ᩴ;)V

    .line 70
    invoke-virtual {v4}, Ll/᩵ۘᩳ;->ᩳ()I

    move-result v11

    invoke-virtual {v4}, Ll/᩵ۘᩳ;->֫()I

    move-result v12

    new-instance v13, Ll/ۙۘᩳ;

    invoke-direct {v13, v1, v0}, Ll/ۙۘᩳ;-><init>(Ljava/lang/String;Ll/᩷۠ᩴ;)V

    .line 71
    invoke-virtual {v4, v5}, Ll/᩵ۘᩳ;->֫(I)[B

    move-result-object v14

    move-object/from16 v8, p4

    move-object v9, v2

    .line 69
    invoke-virtual/range {v8 .. v14}, Ll/ۘ᩶ᩳ;->֫(Ll/ۡ᩶ᩳ;Ll/᩶ۘᩳ;IILl/ۙۘᩳ;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    invoke-virtual {v2}, Ll/ۡ᩶ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 68
    :try_start_2
    invoke-virtual {v2}, Ll/ۡ᩶ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    .line 38
    :cond_1
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing legacy fragment config bytes"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 40
    :try_start_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid legacy fragment parcel"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 41
    :goto_1
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    throw v0

    .line 33
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy fragment config exceeds limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 4

    .line 148
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    const-string v1, "MT editable2 legacy state v1:"

    .line 150
    invoke-static {v0, v1}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 152
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v3, v2

    invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update(B)V

    ushr-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update(B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 153
    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/UUID;[B)[B
    .locals 3

    .line 157
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, 0x4d324141    # 1.86913808E8f

    .line 158
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 159
    invoke-virtual {p0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 160
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->write([B)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 161
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v1

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v2

    invoke-virtual {p1, v1, p0, v2}, Ljava/util/zip/CRC32;->update([BII)V

    invoke-virtual {p1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p0

    long-to-int p1, p0

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 162
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;I)[B
    .locals 4

    .line 175
    invoke-static {p0}, Ll/ۤۘᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    invoke-static {p0}, Ll/ܿ۠ᩴ;->size(Ll/᩷۠ᩴ;)J

    move-result-wide v0

    int-to-long v2, p1

    cmp-long p1, v0, v2

    if-gtz p1, :cond_4

    long-to-int p1, v0

    .line 177
    new-array v0, p1, [B

    .line 171
    invoke-static {p0}, Ll/ۤۘᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ll/᩻۠ᩴ;

    sget-object v2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v1}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object p0

    :goto_0
    if-ge v3, p1, :cond_1

    sub-int v1, p1, v3

    .line 181
    :try_start_0
    invoke-virtual {p0, v0, v3, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-lez v1, :cond_0

    add-int/2addr v3, v1

    goto :goto_0

    .line 182
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Legacy state file was truncated"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 185
    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    .line 186
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v0

    .line 185
    :cond_2
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Legacy state file changed during reading"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_3

    .line 178
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw p1

    .line 176
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Legacy state file exceeds limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    .line 88
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ".."

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x2f

    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    const/16 v0, 0x5c

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    .line 92
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object p1

    const-string v0, ".e2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    return-object p0

    .line 90
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid legacy state name"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/᩷۠ᩴ;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 166
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Legacy state path is not a regular file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 193
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۘᩳ;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 194
    :try_start_1
    iget-object v2, p0, Ll/ۤۘᩳ;->۫:Ll/ۖ᩶ᩳ;

    invoke-virtual {v2}, Ll/ۖ᩶ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iput-boolean v1, p0, Ll/ۤۘᩳ;->᩶:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 195
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 194
    :try_start_3
    iput-boolean v1, p0, Ll/ۤۘᩳ;->᩶:Z

    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ֫()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 190
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۘᩳ;->᩶:Z

    if-nez v1, :cond_0

    .line 112
    iget-object v1, p0, Ll/ۤۘᩳ;->۫:Ll/ۖ᩶ᩳ;

    new-instance v2, Ll/᩹ۘᩳ;

    invoke-direct {v2, p0}, Ll/᩹ۘᩳ;-><init>(Ll/ۤۘᩳ;)V

    invoke-virtual {v1, v2}, Ll/ۖ᩶ᩳ;->֫(Ll/᩹ۘᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    monitor-exit v0

    return-void

    .line 190
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "App migration is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 122
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()Z
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 190
    :try_start_0
    iget-boolean v1, p0, Ll/ۤۘᩳ;->᩶:Z

    if-nez v1, :cond_2

    .line 100
    iget-object v1, p0, Ll/ۤۘᩳ;->ۙ:Ll/᩷۠ᩴ;

    const-string v2, "app-adopted"

    invoke-interface {v1, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ll/ܳ۠ᩴ;

    .line 101
    sget-object v4, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v3}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    monitor-exit v0

    return v5

    .line 102
    :cond_0
    :try_start_1
    iget-object v3, p0, Ll/ۤۘᩳ;->᩸:[B

    array-length v4, v3

    invoke-static {v1, v4}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;I)[B

    move-result-object v1

    invoke-static {v3, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_1

    .line 103
    monitor-exit v0

    return v2

    .line 102
    :cond_1
    :try_start_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid app migration adoption record"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 190
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "App migration is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 103
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
