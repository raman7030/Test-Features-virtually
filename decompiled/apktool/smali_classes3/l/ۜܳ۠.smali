.class public final synthetic Ll/ۜܳ۠;
.super Ljava/lang/Object;
.source "K7QT"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۡܳ۠;


# direct methods
.method public synthetic constructor <init>(Ll/ۡܳ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜܳ۠;->᩸:Ll/ۡܳ۠;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 4
    iget-object v0, p0, Ll/ۜܳ۠;->᩸:Ll/ۡܳ۠;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0x3d

    .line 1571
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x0

    .line 1572
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 1573
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    add-int/lit8 v1, v1, 0x1

    .line 1574
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v1, p1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_0

    aget-object v6, p1, v5

    :try_start_0
    new-array v7, v2, [Ljava/lang/String;

    .line 1576
    invoke-static {v6, v7}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/nio/file/InvalidPathException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 1578
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid path: "

    .line 0
    invoke-static {v1, v6}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1578
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 1582
    :cond_0
    :try_start_1
    invoke-virtual {v0, v4, v3}, Ll/ۡܳ۠;->֫(Ljava/lang/Iterable;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    .line 1585
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot set path for module "

    .line 0
    invoke-static {v1, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1585
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
