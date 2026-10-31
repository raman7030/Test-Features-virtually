.class public final Ll/᩷ۨۘ;
.super Ljava/lang/Object;
.source "H8ZV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۢۨۘ;

.field public final synthetic ᩹:Ll/ܿۨۘ;


# direct methods
.method public constructor <init>(Ll/ۢۨۘ;Ll/ܿۨۘ;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۨۘ;->᩸:Ll/ۢۨۘ;

    iput-object p2, p0, Ll/᩷ۨۘ;->᩹:Ll/ܿۨۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 85
    iget-object v0, p0, Ll/᩷ۨۘ;->᩸:Ll/ۢۨۘ;

    const-string v1, "No scheme is found: "

    const-string v2, "No scheme-handler is found: "

    const-string v3, "No media-decoder is found: "

    iget-object v4, p0, Ll/᩷ۨۘ;->᩹:Ll/ܿۨۘ;

    invoke-virtual {v4}, Ll/ܿۨۘ;->֫()Ljava/lang/String;

    move-result-object v5

    .line 87
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    const/4 v7, 0x0

    .line 93
    :try_start_0
    invoke-virtual {v6}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 95
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_3

    .line 100
    invoke-static {v0}, Ll/ۢۨۘ;->ܿ(Ll/ۢۨۘ;)Ljava/util/Map;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ۨۘ;

    if-eqz v1, :cond_2

    .line 104
    invoke-virtual {v1, v5}, Ll/۫ۨۘ;->֫(Ljava/lang/String;)Ll/֨ۨۘ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    :try_start_1
    invoke-static {v0}, Ll/ۢۨۘ;->ܽ(Ll/ۢۨۘ;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Ll/֨ۨۘ;->֫()Ljava/lang/String;

    move-result-object v6

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۨۘ;

    if-nez v2, :cond_0

    .line 116
    invoke-static {v0}, Ll/ۢۨۘ;->֫(Ll/ۢۨۘ;)Ll/۬ۨۘ;

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    .line 120
    invoke-virtual {v1}, Ll/֨ۨۘ;->ۧ()Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/۬ۨۘ;->֫(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    :try_start_2
    invoke-virtual {v1}, Ll/֨ۨۘ;->ۧ()Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    :catchall_0
    nop

    goto :goto_0

    .line 123
    :cond_1
    :try_start_3
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    .line 127
    :try_start_4
    invoke-virtual {v1}, Ll/֨ۨۘ;->ۧ()Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 131
    :catch_1
    :try_start_5
    throw v2

    .line 137
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 96
    :cond_3
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    if-eqz v7, :cond_5

    .line 153
    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 156
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 17
    :cond_4
    new-instance v1, Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    const/4 v5, 0x0

    invoke-direct {v1, v5, v5, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 21
    invoke-virtual {v7, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 161
    :cond_5
    invoke-static {v0}, Ll/ۢۨۘ;->ۧ(Ll/ۢۨۘ;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ll/ۜۨۘ;

    invoke-direct {v1, p0, v7}, Ll/ۜۨۘ;-><init>(Ll/᩷ۨۘ;Landroid/graphics/drawable/Drawable;)V

    .line 175
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 161
    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method
