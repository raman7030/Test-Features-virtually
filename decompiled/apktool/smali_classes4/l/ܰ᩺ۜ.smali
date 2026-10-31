.class public final Ll/ܰ᩺ۜ;
.super Ll/᩺ۨۜ;
.source "K6MS"


# instance fields
.field public final synthetic ֫:Ll/ܳ᩸ܿ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩳ:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ᩸ܿ;Landroid/net/Uri;)V
    .locals 0

    .line 78
    iput-object p1, p0, Ll/ܰ᩺ۜ;->ۧ:Ljava/lang/String;

    iput-object p2, p0, Ll/ܰ᩺ۜ;->ܽ:Ljava/lang/String;

    iput-object p3, p0, Ll/ܰ᩺ۜ;->֫:Ll/ܳ᩸ܿ;

    iput-object p4, p0, Ll/ܰ᩺ۜ;->ᩳ:Landroid/net/Uri;

    invoke-direct {p0}, Ll/᩺ۨۜ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۘ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ܰ᩺ۜ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ljava/io/InputStream;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܰ᩺ۜ;->֫:Ll/ܳ᩸ܿ;

    invoke-virtual {v0}, Ll/ܳ᩸ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()Ll/ۨۨۜ;
    .locals 9

    .line 88
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Ll/ܰ᩺ۜ;->ᩳ:Landroid/net/Uri;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v1, -0x1

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_1

    .line 90
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "_size"

    .line 91
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    const-string v6, "last_modified"

    .line 92
    invoke-interface {v0, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    if-ltz v5, :cond_0

    .line 93
    invoke-interface {v0, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_0
    if-ltz v6, :cond_1

    .line 94
    invoke-interface {v0, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    :cond_1
    move-wide v6, v3

    move-wide v4, v1

    .line 96
    new-instance v1, Ll/ۨۨۜ;

    iget-object v3, p0, Ll/ܰ᩺ۜ;->ۧ:Ljava/lang/String;

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ll/ۨۨۜ;-><init>(Ljava/lang/String;JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    .line 97
    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    return-object v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    .line 88
    :try_start_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 98
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Could not query image content metadata"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ܰ᩺ۜ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
