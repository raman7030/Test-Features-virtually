.class public final Ll/ۢܶܿ;
.super Ljava/lang/Object;
.source "N4Y9"


# static fields
.field public static final ֫:Z

.field public static ۧ:Ljava/util/HashSet;

.field public static ܽ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 25
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/ۢܶܿ;->֫:Z

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۢܶܿ;->ܽ:Ljava/util/HashMap;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Ll/ۢܶܿ;->ۧ:Ljava/util/HashSet;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘ᩸ܿ;)Landroid/net/Uri;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢܶܿ;->ۧ(Ll/ۘ᩸ܿ;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫()Ljava/util/HashSet;
    .locals 1

    .line 0
    sget-object v0, Ll/ۢܶܿ;->ۧ:Ljava/util/HashSet;

    return-object v0
.end method

.method public static ֫(Ljava/io/File;)Ll/ܶ᩵ܿ;
    .locals 9

    .line 37
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {v0}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 42
    :cond_0
    invoke-static {}, Ll/ۢܶܿ;->ܽ()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_a

    .line 43
    invoke-static {v1}, Ll/ۢܶܿ;->ۧ(Ll/ۘ᩸ܿ;)Landroid/net/Uri;

    move-result-object v3

    if-nez v3, :cond_1

    return-object v2

    .line 47
    :cond_1
    iget-object v1, v1, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 48
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v2, v5, :cond_2

    .line 49
    new-instance v0, Ll/ۜܶܿ;

    invoke-direct {v0, p0, v3}, Ll/ۜܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;)V

    return-object v0

    .line 51
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 52
    new-instance v1, Ll/ۜܶܿ;

    .line 149
    invoke-static {v3}, Ll/ܳܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_9

    const-string v6, "/"

    .line 154
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 155
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_3
    move-object v7, v0

    .line 157
    :goto_0
    invoke-virtual {v7, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 0
    invoke-static {v2, v4, v7}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 160
    :cond_4
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    .line 163
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    .line 164
    new-instance v4, Landroid/net/Uri$Builder;

    invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V

    .line 165
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v4

    .line 166
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    const-string v4, "tree"

    .line 167
    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    .line 168
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    const-string v4, "document"

    .line 169
    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    .line 171
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v8, 0x2

    if-ne v4, v8, :cond_5

    .line 172
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    const/4 v4, 0x3

    .line 174
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 176
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    .line 178
    :cond_6
    invoke-virtual {v0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 179
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    .line 0
    :cond_7
    invoke-static {v0, v6, v7}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 183
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    .line 52
    invoke-direct {v1, p0, v0}, Ll/ۜܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;)V

    return-object v1

    .line 161
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid Child name: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 151
    :cond_9
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid tree uri: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 54
    :cond_a
    new-instance v0, Ll/ۧ᩹ܿ;

    .line 48
    invoke-direct {v0, p0, v4}, Ll/ۧ᩹ܿ;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public static ۧ(Ll/ۘ᩸ܿ;)Landroid/net/Uri;
    .locals 12

    .line 62
    iget-object v0, p0, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 63
    sget-object v1, Ll/ۢܶܿ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    if-nez v2, :cond_4

    .line 65
    iget-object p0, p0, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x1

    invoke-static {p0, v2}, Ll/ܳܶܿ;->֫(Ljava/lang/String;Z)Landroid/net/Uri;

    move-result-object p0

    .line 66
    sget-object v3, Ll/ۢܶܿ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    return-object v5

    .line 27
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    const/4 v4, 0x0

    .line 28
    :try_start_0
    invoke-static {p0}, Ll/ܳܶܿ;->ۧ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v7

    const-string v8, "document_id"

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v6 .. v11}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v6, :cond_1

    .line 29
    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lez v7, :cond_1

    goto :goto_1

    :catchall_0
    move-exception v2

    .line 28
    :try_start_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v6

    :try_start_3
    invoke-virtual {v2, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v6, :cond_2

    .line 30
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_2
    move v4, v2

    goto :goto_2

    :catchall_2
    nop

    :goto_2
    if-nez v4, :cond_3

    .line 71
    invoke-virtual {v3, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object v5

    .line 74
    :cond_3
    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_4
    return-object v2
.end method

.method public static bridge synthetic ۧ()Ljava/util/HashMap;
    .locals 1

    .line 0
    sget-object v0, Ll/ۢܶܿ;->ܽ:Ljava/util/HashMap;

    return-object v0
.end method

.method public static ܽ()Z
    .locals 4

    .line 30
    sget-boolean v0, Ll/ۢܶܿ;->֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 33
    :cond_0
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-ge v2, v3, :cond_1

    const/4 v1, 0x1

    :cond_1
    const-string v2, "use_external_storage_api"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
