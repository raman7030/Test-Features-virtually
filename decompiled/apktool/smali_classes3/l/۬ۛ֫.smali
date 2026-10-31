.class public final Ll/۬ۛ֫;
.super Ljava/lang/Object;
.source "H8MF"


# direct methods
.method public static ֫(Ljava/lang/Throwable;)Z
    .locals 2

    .line 126
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    instance-of v0, p0, Ljava/lang/NoSuchMethodError;

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 129
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Landroid/media/NotProvisionedException;.<init>("

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/᩸۠֫;Ljava/lang/String;[BLjava/util/Map;)[B
    .locals 8

    .line 162
    new-instance v0, Ll/ᩴܶ֫;

    invoke-direct {v0, p0}, Ll/ᩴܶ֫;-><init>(Ll/᩸۠֫;)V

    .line 164
    new-instance p0, Ll/ۙ۠֫;

    invoke-direct {p0}, Ll/ۙ۠֫;-><init>()V

    .line 166
    invoke-virtual {p0, p1}, Ll/ۙ۠֫;->ۧ(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p0, p3}, Ll/ۙ۠֫;->֫(Ljava/util/Map;)V

    const/4 p1, 0x2

    .line 168
    invoke-virtual {p0, p1}, Ll/ۙ۠֫;->ۧ(I)V

    .line 169
    invoke-virtual {p0, p2}, Ll/ۙ۠֫;->֫([B)V

    const/4 p1, 0x1

    .line 170
    invoke-virtual {p0, p1}, Ll/ۙ۠֫;->֫(I)V

    .line 171
    invoke-virtual {p0}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v2

    const/4 p0, 0x0

    const/4 p1, 0x0

    move-object p2, v2

    .line 175
    :goto_0
    :try_start_0
    new-instance p3, Ll/᩶۠֫;

    invoke-direct {p3, v0, p2}, Ll/᩶۠֫;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 177
    :try_start_1
    invoke-static {p3}, Ll/ᩳ᩺ܺ;->֫(Ljava/io/InputStream;)[B

    move-result-object p0
    :try_end_1
    .catch Ll/᩻ܶ֫; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    :try_start_2
    invoke-static {p3}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 204
    :try_start_3
    iget v3, v1, Ll/᩻ܶ֫;->۬:I

    const/16 v4, 0x133

    const/4 v5, 0x0

    if-eq v3, v4, :cond_0

    const/16 v4, 0x134

    if-ne v3, v4, :cond_1

    :cond_0
    const/4 v3, 0x5

    if-ge p1, v3, :cond_1

    .line 210
    iget-object v3, v1, Ll/᩻ܶ֫;->ۙ:Ljava/util/Map;

    if-eqz v3, :cond_1

    const-string v4, "Location"

    .line 212
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_1

    .line 213
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    .line 214
    invoke-interface {v3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    :cond_1
    if-eqz v5, :cond_2

    add-int/lit8 p1, p1, 0x1

    .line 184
    invoke-virtual {p2}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object p2

    invoke-virtual {p2, v5}, Ll/ۙ۠֫;->ۧ(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    :try_start_4
    invoke-static {p3}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 181
    :cond_2
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 186
    :goto_1
    :try_start_6
    invoke-static {p3}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    .line 187
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :catch_1
    move-exception p0

    move-object v7, p0

    .line 190
    new-instance p0, Ll/ۜۨ֫;

    .line 192
    invoke-virtual {v0}, Ll/ᩴܶ֫;->᩻()Landroid/net/Uri;

    move-result-object v3

    .line 193
    invoke-virtual {v0}, Ll/ᩴܶ֫;->֫()Ljava/util/Map;

    move-result-object v4

    .line 194
    invoke-virtual {v0}, Ll/ᩴܶ֫;->ܳ()J

    move-result-wide v5

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/ۜۨ֫;-><init>(Ll/ۗ۠֫;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Exception;)V

    throw p0
.end method

.method public static ۧ(Ljava/lang/Throwable;)Z
    .locals 2

    .line 137
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    instance-of v0, p0, Ljava/lang/NoSuchMethodError;

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Landroid/media/ResourceBusyException;.<init>("

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
