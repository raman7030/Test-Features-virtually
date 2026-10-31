.class public abstract Lbin/mt/plugin/api/drawable/VectorDrawableLoader;
.super Ljava/lang/Object;
.source "VectorDrawableLoader.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromSvg(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 72
    :try_start_0
    invoke-interface {p0, p1}, Lbin/mt/plugin/api/PluginContext;->getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Lbin/mt/plugin/api/drawable/VectorParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    :try_start_1
    invoke-static {p0}, Lbin/mt/plugin/api/drawable/VectorDrawableLoader;->fromSvg(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_0

    .line 74
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Lbin/mt/plugin/api/drawable/VectorParseException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_1

    .line 72
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
    :try_end_4
    .catch Lbin/mt/plugin/api/drawable/VectorParseException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 77
    new-instance p1, Lbin/mt/plugin/api/drawable/VectorParseException;

    invoke-direct {p1, p0}, Lbin/mt/plugin/api/drawable/VectorParseException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 75
    throw p0
.end method

.method public static fromSvg(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 57
    const-class v0, Ll/۬ܳ᩷;

    invoke-static {v0}, Lbin/mt/plugin/api/util/ServiceLoader;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ܳ᩷;

    invoke-interface {v0, p0}, Ll/۬ܳ᩷;->fromSvg(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static fromVectorXml(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 37
    :try_start_0
    invoke-interface {p0, p1}, Lbin/mt/plugin/api/PluginContext;->getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Lbin/mt/plugin/api/drawable/VectorParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :try_start_1
    invoke-static {p0}, Lbin/mt/plugin/api/drawable/VectorDrawableLoader;->fromVectorXml(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_0

    .line 39
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Lbin/mt/plugin/api/drawable/VectorParseException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_1

    .line 37
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
    :try_end_4
    .catch Lbin/mt/plugin/api/drawable/VectorParseException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 42
    new-instance p1, Lbin/mt/plugin/api/drawable/VectorParseException;

    invoke-direct {p1, p0}, Lbin/mt/plugin/api/drawable/VectorParseException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 40
    throw p0
.end method

.method public static fromVectorXml(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 25
    const-class v0, Ll/۬ܳ᩷;

    invoke-static {v0}, Lbin/mt/plugin/api/util/ServiceLoader;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ܳ᩷;

    invoke-interface {v0, p0}, Ll/۬ܳ᩷;->fromVectorXml(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method
