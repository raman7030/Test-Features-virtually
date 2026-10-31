.class public final Ll/᩻۫ۖ;
.super Ll/ۚ۬ۖ;
.source "M9GT"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ۗ:Ll/ۚ۬ۖ;

.field public ۙ:Z

.field public ᩶:Ll/ܰۛۡ;

.field public ᩹:[B


# direct methods
.method public constructor <init>(Ll/ۨ۬ۖ;Ll/ۚ۬ۖ;Z)V
    .locals 1

    if-eqz p3, :cond_0

    .line 170
    sget-object v0, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    invoke-virtual {p1, v0}, Ll/ۨ۬ۖ;->֫(Ll/֡۬ۖ;)Ll/ۨ۬ۖ;

    move-result-object p1

    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p2}, Ll/ۚ۬ۖ;->ۧ()Ll/ۨ۬ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ۬ۖ;->֫()Ll/֡۬ۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨ۬ۖ;->֫(Ll/֡۬ۖ;)Ll/ۨ۬ۖ;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Ll/ۚ۬ۖ;-><init>(Ll/ۨ۬ۖ;)V

    .line 38
    iput-object p2, p0, Ll/᩻۫ۖ;->ۗ:Ll/ۚ۬ۖ;

    .line 39
    iput-boolean p3, p0, Ll/᩻۫ۖ;->ۙ:Z

    const/4 p1, 0x0

    .line 40
    iput-object p1, p0, Ll/᩻۫ۖ;->᩹:[B

    return-void
.end method

.method public constructor <init>(Ll/ۨ۬ۖ;[BLl/ܰۛۡ;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Ll/ۚ۬ۖ;-><init>(Ll/ۨ۬ۖ;)V

    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Ll/᩻۫ۖ;->ۙ:Z

    .line 49
    iput-object p2, p0, Ll/᩻۫ۖ;->᩹:[B

    .line 50
    iput-object p3, p0, Ll/᩻۫ۖ;->᩶:Ll/ܰۛۡ;

    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Ll/᩻۫ۖ;->ۗ:Ll/ۚ۬ۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻۫ۖ;[B)V
    .locals 0

    .line 28
    iput-object p1, p0, Ll/᩻۫ۖ;->᩹:[B

    return-void
.end method

.method public static synthetic ֫(Ll/᩻۫ۖ;)[B
    .locals 0

    .line 28
    iget-object p0, p0, Ll/᩻۫ۖ;->᩹:[B

    return-object p0
.end method

.method public static synthetic ۧ(Ll/᩻۫ۖ;)Ll/ۚ۬ۖ;
    .locals 0

    .line 28
    iget-object p0, p0, Ll/᩻۫ۖ;->ۗ:Ll/ۚ۬ۖ;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/᩻۫ۖ;)Z
    .locals 0

    .line 28
    iget-boolean p0, p0, Ll/᩻۫ۖ;->ۙ:Z

    return p0
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 60
    invoke-virtual {p0}, Ll/᩻۫ۖ;->ᩳ()Ll/ۚ۬ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 73
    sget-object v0, Ll/ۨ۬ۖ;->ۡ:Ll/ۨ۬ۖ;

    invoke-virtual {p0, v0}, Ll/᩻۫ۖ;->֫(Ll/ۨ۬ۖ;)Ll/ۚ۬ۖ;

    move-result-object v0

    check-cast v0, Ll/֫۫ۖ;

    invoke-virtual {v0}, Ll/֫۫ۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ASN1TaggedObject["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    iget-object v1, p0, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    iget-object v1, p0, Ll/᩻۫ۖ;->ۗ:Ll/ۚ۬ۖ;

    if-eqz v1, :cond_0

    const-string v2, ","

    .line 152
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, ",<unknown>"

    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "]"

    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۨ۬ۖ;)Ll/ۚ۬ۖ;
    .locals 3

    .line 138
    iget-object v0, p0, Ll/᩻۫ۖ;->ۗ:Ll/ۚ۬ۖ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۚ۬ۖ;->ۧ()Ll/ۨ۬ۖ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۨ۬ۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    .line 140
    iget-object v0, p0, Ll/᩻۫ۖ;->᩹:[B

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Ll/᩻۫ۖ;->᩶:Ll/ܰۛۡ;

    invoke-virtual {p1, v0}, Ll/ۨ۬ۖ;->֫(Ll/ܰۛۡ;)Ll/ۘ۬ۖ;

    move-result-object v0

    iget-object v1, p0, Ll/᩻۫ۖ;->᩹:[B

    invoke-virtual {v0, p1, v1}, Ll/ۘ۬ۖ;->֫(Ll/ۨ۬ۖ;[B)Ll/ۚ۬ۖ;

    move-result-object p1

    return-object p1

    .line 143
    :cond_1
    new-instance v0, Ll/ۖ۬ۖ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Unable to parse the implicit Tagged Object with %s, it is explicit"

    invoke-direct {v0, p1, v1}, Ll/ۖ۬ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method

.method public final ܿ()I
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    invoke-virtual {v0}, Ll/ۨ۬ۖ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ᩳ()Ll/ۚ۬ۖ;
    .locals 5

    .line 125
    iget-object v0, p0, Ll/᩻۫ۖ;->ۗ:Ll/ۚ۬ۖ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 128
    :try_start_0
    new-instance v1, Ll/ۡ۬ۖ;

    iget-object v2, p0, Ll/᩻۫ۖ;->᩶:Ll/ܰۛۡ;

    iget-object v3, p0, Ll/᩻۫ۖ;->᩹:[B

    invoke-direct {v1, v2, v3}, Ll/ۡ۬ۖ;-><init>(Ll/ܰۛۡ;[B)V
    :try_end_0
    .catch Ll/ۖ۬ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    :try_start_1
    invoke-virtual {v1}, Ll/ۡ۬ۖ;->readObject()Ll/ۚ۬ۖ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ll/ۖ۬ۖ; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catchall_0
    move-exception v2

    .line 128
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catch Ll/ۖ۬ۖ; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v1

    .line 133
    new-instance v2, Ll/ۖ۬ۖ;

    const-string v3, "Could not parse the inputstream"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-direct {v2, v1, v3, v0}, Ll/ۖ۬ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :catch_1
    move-exception v1

    .line 131
    new-instance v2, Ll/ۖ۬ۖ;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    aput-object v4, v3, v0

    const-string v0, "Unable to parse the explicit Tagged Object with %s, it might be implicit"

    invoke-direct {v2, v1, v0, v3}, Ll/ۖ۬ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2
.end method
