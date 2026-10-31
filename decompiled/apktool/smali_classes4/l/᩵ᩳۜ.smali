.class public final Ll/᩵ᩳۜ;
.super Ljava/lang/Object;
.source "Z75Z"


# instance fields
.field public volatile ֫:Ljava/lang/ref/SoftReference;

.field public final ۧ:Ljava/lang/Object;

.field public final ܽ:Ll/ܶ᩵ܿ;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:J


# direct methods
.method public constructor <init>(JLl/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩵ᩳۜ;->ۧ:Ljava/lang/Object;

    if-eqz p4, :cond_3

    .line 45
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    .line 48
    :goto_0
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 49
    invoke-virtual {p4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Character;->digit(CI)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_3

    .line 30
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 33
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-nez v2, :cond_1

    .line 36
    iput-object p3, p0, Ll/᩵ᩳۜ;->ܽ:Ll/ܶ᩵ܿ;

    .line 37
    iput-object p4, p0, Ll/᩵ᩳۜ;->ܿ:Ljava/lang/String;

    .line 38
    iput-wide p1, p0, Ll/᩵ᩳۜ;->ᩳ:J

    return-void

    .line 34
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Resource table metadata length mismatch"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 31
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Resource table is unavailable"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid resource table metadata"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()[B
    .locals 3

    .line 90
    :try_start_0
    iget-object v0, p0, Ll/᩵ᩳۜ;->ܿ:Ljava/lang/String;

    invoke-static {v0}, Ll/ܳۤۡ;->ܽ(Ljava/lang/String;)[B

    move-result-object v0

    .line 91
    array-length v1, v0

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    return-object v0

    .line 92
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid SHA-256 length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v0, "RESOURCE_TABLE_PARSE_FAILED"

    const-string v1, "Resource table metadata is invalid."

    .line 96
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public final ۧ()Ll/᩺᩻ܽ;
    .locals 3

    .line 60
    iget-object v0, p0, Ll/᩵ᩳۜ;->֫:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Ll/᩵ᩳۜ;->֫:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺᩻ܽ;

    if-eqz v0, :cond_0

    return-object v0

    .line 66
    :cond_0
    iget-object v0, p0, Ll/᩵ᩳۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 67
    :try_start_0
    iget-object v1, p0, Ll/᩵ᩳۜ;->֫:Ljava/lang/ref/SoftReference;

    if-eqz v1, :cond_1

    .line 68
    iget-object v1, p0, Ll/᩵ᩳۜ;->֫:Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺᩻ܽ;

    if-eqz v1, :cond_1

    .line 70
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    .line 74
    :cond_1
    :try_start_1
    new-instance v1, Ll/᩺᩻ܽ;

    iget-object v2, p0, Ll/᩵ᩳۜ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-direct {v1, v2}, Ll/᩺᩻ܽ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1}, Ll/᩺᩻ܽ;->ۜ()V

    .line 75
    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Ll/᩵ᩳۜ;->֫:Ljava/lang/ref/SoftReference;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    :try_start_2
    monitor-exit v0

    return-object v1

    :catch_0
    move-exception v1

    .line 79
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    const-string v1, "Failed to parse resources.arsc"

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "RESOURCE_TABLE_PARSE_FAILED"

    .line 80
    invoke-static {v2, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    throw v1

    :catchall_0
    move-exception v1

    .line 82
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ܽ()J
    .locals 2

    .line 105
    iget-wide v0, p0, Ll/᩵ᩳۜ;->ᩳ:J

    return-wide v0
.end method
