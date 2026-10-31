.class public Ll/᩵۬;
.super Ljava/lang/Object;
.source "P5Z7"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    .line 222
    invoke-static {p1}, Ll/֡۬;->֫(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 p4, 0x0

    if-nez p1, :cond_0

    return-object p4

    .line 227
    :cond_0
    :try_start_0
    invoke-static {p1, p2, p3}, Ll/֡۬;->֫(Ljava/io/File;Landroid/content/res/Resources;I)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    .line 237
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4

    .line 230
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 238
    throw p2

    .line 237
    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4
.end method

.method public ֫(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    .locals 1

    .line 118
    invoke-static {p1}, Ll/֡۬;->֫(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 123
    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Ll/֡۬;->֫(Ljava/io/File;Ljava/io/InputStream;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    .line 133
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0

    .line 126
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 134
    throw p2

    .line 133
    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0
.end method

.method public ֫(Landroid/content/Context;Ll/ۢۗ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(Landroid/content/Context;[Ll/ܿۤ;I)Landroid/graphics/Typeface;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(I[Ll/ܿۤ;)Ll/ܿۤ;
    .locals 9

    .line 103
    new-instance v0, Ll/ۘ۬;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_0

    const/16 v1, 0x190

    goto :goto_0

    :cond_0
    const/16 v1, 0x2bc

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 71
    :goto_1
    array-length v2, p2

    const/4 v3, 0x0

    const v4, 0x7fffffff

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v2, :cond_5

    aget-object v6, p2, v5

    .line 72
    invoke-interface {v0, v6}, Ll/ᩴ۬;->ۧ(Ljava/lang/Object;)I

    move-result v7

    sub-int/2addr v7, v1

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    mul-int/lit8 v7, v7, 0x2

    .line 73
    invoke-interface {v0, v6}, Ll/ᩴ۬;->֫(Ljava/lang/Object;)Z

    move-result v8

    if-ne v8, p1, :cond_2

    const/4 v8, 0x0

    goto :goto_3

    :cond_2
    const/4 v8, 0x1

    :goto_3
    add-int/2addr v7, v8

    if-eqz v3, :cond_3

    if-le v4, v7, :cond_4

    :cond_3
    move-object v3, v6

    move v4, v7

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    return-object v3
.end method
