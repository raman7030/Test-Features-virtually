.class public final Ll/᩷ܶܿ;
.super Ljava/lang/Object;
.source "N4Y9"


# static fields
.field public static ֫:Ll/ۘ᩸ܿ;


# direct methods
.method public static ֫(Lbin/mt/plus/Main;Ljava/lang/String;)V
    .locals 1

    .line 86
    invoke-static {}, Ll/ۢܶܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    invoke-static {p1}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    invoke-static {p1}, Ll/ۢܶܿ;->֫(Ll/ۘ᩸ܿ;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_1

    .line 93
    sput-object p1, Ll/᩷ܶܿ;->֫:Ll/ۘ᩸ܿ;

    .line 94
    iget-object p1, p1, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    invoke-static {p0, p1}, Ll/᩷ܶܿ;->֫(Ll/۬ܺ᩷;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/۬ܺ᩷;)V
    .locals 1

    .line 150
    sget-object v0, Ll/᩷ܶܿ;->֫:Ll/ۘ᩸ܿ;

    iget-object v0, v0, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    invoke-static {p0, v0}, Ll/᩷ܶܿ;->֫(Ll/۬ܺ᩷;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/۬ܺ᩷;Landroid/net/Uri;)V
    .locals 5

    .line 128
    invoke-static {}, Ll/ۢܶܿ;->֫()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 129
    sget-object v0, Ll/᩷ܶܿ;->֫:Ll/ۘ᩸ܿ;

    if-nez v0, :cond_0

    return-void

    .line 131
    :cond_0
    iget-object v0, v0, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    .line 139
    invoke-static {p1}, Ll/ܳܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, ":"

    const/4 v3, 0x0

    if-nez v0, :cond_1

    goto :goto_0

    .line 142
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    goto :goto_0

    .line 144
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v3, 0x1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 145
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_3

    .line 134
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 135
    invoke-static {}, Ll/ۢܶܿ;->ۧ()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Ll/᩷ܶܿ;->֫:Ll/ۘ᩸ܿ;

    iget-object v1, v1, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ll/ܳܶܿ;->ۧ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 137
    invoke-interface {p0, p1}, Ll/۬ܺ᩷;->֫(Ljava/lang/Throwable;)V

    return-void

    .line 141
    :cond_3
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const p1, 0x7f1209e4

    goto :goto_1

    :cond_4
    const p1, 0x7f1209e5

    .line 146
    :goto_1
    invoke-interface {p0}, Ll/۬ܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120307

    .line 147
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 148
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance p1, Ll/ۤ۫᩷;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v1}, Ll/ۤ۫᩷;-><init>(Ll/۬ܺ᩷;I)V

    const p0, 0x7f120a99

    .line 149
    invoke-virtual {v0, p0, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 p1, 0x0

    .line 151
    invoke-virtual {v0, p0, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 152
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static ֫(Ll/۬ܺ᩷;Ljava/lang/String;)V
    .locals 4

    .line 100
    invoke-interface {p0}, Ll/۬ܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120491

    .line 101
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    sget-object v1, Ll/᩷ܶܿ;->֫:Ll/ۘ᩸ܿ;

    iget-object v1, v1, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const v1, 0x7f1209e6

    .line 102
    invoke-static {v1, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/۫۫᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p1, p0}, Ll/۫۫᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p0, 0x7f12070a

    .line 103
    invoke-virtual {v0, p0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 p1, 0x0

    .line 123
    invoke-virtual {v0, p0, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 124
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
