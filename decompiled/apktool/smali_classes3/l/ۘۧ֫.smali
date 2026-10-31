.class public final Ll/ۘۧ֫;
.super Ll/ۖۧ֫;
.source "94XI"


# instance fields
.field public ֫:Landroid/app/Application;

.field public ۧ:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/app/Application;Landroid/net/Uri;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۘۧ֫;->֫:Landroid/app/Application;

    .line 41
    iput-object p2, p0, Ll/ۘۧ֫;->ۧ:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 8

    .line 75
    iget-object v1, p0, Ll/ۘۧ֫;->ۧ:Landroid/net/Uri;

    const-string v0, "_display_name"

    .line 152
    iget-object v2, p0, Ll/ۘۧ֫;->֫:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v6, 0x0

    .line 156
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v0, v2

    move-object v2, v3

    move-object v3, v7

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 157
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 158
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    check-cast v0, Landroid/database/Cursor;

    .line 198
    :try_start_2
    check-cast v0, Landroid/database/Cursor;

    invoke-static {v0}, Ll/᩶ۢᩴ;->֫(Landroid/database/Cursor;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    return-object v6

    :catch_0
    move-exception v0

    .line 200
    throw v0

    .line 166
    :cond_0
    check-cast v0, Landroid/database/Cursor;

    .line 198
    :try_start_3
    check-cast v0, Landroid/database/Cursor;

    invoke-static {v0}, Ll/᩶ۢᩴ;->֫(Landroid/database/Cursor;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    return-object v6

    :catch_1
    move-exception v0

    .line 200
    throw v0

    :catchall_0
    move-exception v1

    move-object v6, v0

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v1, v0

    move-object v0, v6

    .line 163
    :goto_0
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 166
    check-cast v0, Landroid/database/Cursor;

    if-eqz v0, :cond_1

    .line 198
    :try_start_5
    check-cast v0, Landroid/database/Cursor;

    invoke-static {v0}, Ll/᩶ۢᩴ;->֫(Landroid/database/Cursor;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_1

    :catch_4
    move-exception v0

    .line 200
    throw v0

    :catch_5
    :cond_1
    :goto_1
    return-object v6

    :goto_2
    move-object v0, v1

    .line 166
    :goto_3
    check-cast v6, Landroid/database/Cursor;

    if-eqz v6, :cond_2

    .line 198
    :try_start_6
    check-cast v6, Landroid/database/Cursor;

    invoke-static {v6}, Ll/᩶ۢᩴ;->֫(Landroid/database/Cursor;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    goto :goto_4

    :catch_6
    move-exception v0

    .line 200
    throw v0

    .line 167
    :catch_7
    :cond_2
    :goto_4
    throw v0
.end method
