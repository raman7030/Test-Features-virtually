.class public final Ll/ܳ᩹ۢ;
.super Ljava/lang/Object;
.source "27EO"


# static fields
.field public static final ֫:Ll/ܶ᩵ܿ;

.field public static ۧ:Ll/ۤۤ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 21
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "term_text_font_custom.dat"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    sput-object v0, Ll/ܳ᩹ۢ;->֫:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static ֫()Landroid/graphics/Typeface;
    .locals 8

    .line 34
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "term_text_font"

    const/4 v2, 0x0

    .line 70
    :try_start_0
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v3, 0x0

    .line 73
    :try_start_1
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 74
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 75
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4, v1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 78
    :catch_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 115
    sget-object v5, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v6, "term_text_font_custom_md5"

    const-string v7, ""

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 62
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    sget-object v5, Ll/ܳ᩹ۢ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 38
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_2

    :cond_1
    if-eqz v3, :cond_2

    .line 42
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v3

    :goto_2
    if-ne v2, v4, :cond_6

    .line 0
    const-class v0, Ll/ܳ᩹ۢ;

    monitor-enter v0

    .line 115
    :try_start_2
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "term_text_font_custom_md5"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 89
    sget-object v2, Ll/ܳ᩹ۢ;->ۧ:Ll/ۤۤ;

    if-eqz v2, :cond_3

    .line 90
    iget-object v3, v2, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_3

    .line 91
    monitor-exit v0

    goto :goto_4

    .line 93
    :cond_3
    :try_start_3
    invoke-static {}, Ll/ۙ᩸᩷;->ۖ()Landroid/graphics/Typeface;

    move-result-object v2

    .line 94
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    sget-object v3, Ll/ܳ᩹ۢ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v4, :cond_4

    .line 96
    :try_start_4
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 97
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eq v3, v4, :cond_5

    move-object v2, v3

    goto :goto_3

    :cond_4
    :try_start_5
    const-string v1, ""

    .line 84
    :catch_2
    :cond_5
    :goto_3
    new-instance v3, Ll/ۤۤ;

    invoke-direct {v3, v1, v2}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    sput-object v3, Ll/ܳ᩹ۢ;->ۧ:Ll/ۤۤ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 108
    monitor-exit v0

    move-object v2, v3

    .line 53
    :goto_4
    iget-object v0, v2, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Typeface;

    return-object v0

    :catchall_0
    move-exception v1

    .line 108
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1

    .line 55
    :cond_6
    invoke-static {}, Ll/ۙ᩸᩷;->ۖ()Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method
