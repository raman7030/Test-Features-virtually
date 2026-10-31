.class public final Ll/۬۠ܿ;
.super Ll/ܶ᩵ܿ;
.source "WB05"

# interfaces
.implements Ll/᩸᩸ܿ;


# static fields
.field public static final ֫֫:Ll/ۡۤۡ;

.field public static ۟:Ljava/lang/String; = ""

.field public static final ۧ֫:Ll/ۚۡ֫;

.field public static final ܰ:Ljava/util/HashMap;

.field public static ܽ֫:Ljava/lang/String;

.field public static final ᩺:Ll/᩶۠ܿ;


# instance fields
.field public ۗ:Ll/ۜܶܿ;

.field public final ۛ:Ll/ᩳܶܿ;

.field public final ۤ:Ljava/lang/String;

.field public final ۨ:Ljava/lang/String;

.field public final ۫:Ll/ۙ۠ܿ;

.field public final ۬:Ljava/io/File;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 2
    new-instance v0, Ll/᩶۠ܿ;

    .line 757
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 767
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/۬۠ܿ;->ۧ֫:Ll/ۚۡ֫;

    const/16 v0, 0x7d0

    .line 768
    invoke-static {v0}, Ll/ۡۤۡ;->֫(I)Ll/ۡۤۡ;

    move-result-object v0

    sput-object v0, Ll/۬۠ܿ;->֫֫:Ll/ۡۤۡ;

    const-string v0, ""

    .line 769
    sput-object v0, Ll/۬۠ܿ;->ܽ֫:Ljava/lang/String;

    .line 775
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/۬۠ܿ;->ܰ:Ljava/util/HashMap;

    .line 778
    invoke-static {}, Ll/ܿ֡ܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۧܶܿ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 780
    :cond_0
    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "primary:\u200bAndroid"

    goto :goto_0

    :cond_1
    const-string v0, "primary:Android/"

    :goto_0
    const/4 v1, 0x0

    .line 782
    invoke-static {v0, v1}, Ll/ܳܶܿ;->֫(Ljava/lang/String;Z)Landroid/net/Uri;

    move-result-object v0

    .line 783
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 784
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    move-result-object v2

    const-string v3, "getPersistedUriPermissions(...)"

    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 785
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/UriPermission;

    .line 786
    invoke-virtual {v3}, Landroid/content/UriPermission;->isReadPermission()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Landroid/content/UriPermission;->isWritePermission()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 787
    invoke-virtual {v3}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    move-result-object v3

    .line 788
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 789
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x1

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "get(...)"

    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/String;

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "substring(...)"

    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 790
    sget-object v5, Ll/۬۠ܿ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v5, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "relativePath"

    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "treePrimaryPath"

    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    new-instance v5, Ll/ᩳܶܿ;

    .line 93
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    new-instance v0, Ljava/io/File;

    sget-object v1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/data/media/"

    const-string v3, "/"

    .line 0
    invoke-static {v2, v1, v3, p2}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 94
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 91
    :goto_0
    invoke-direct {v5, p1, v0, p2, p3}, Ll/ᩳܶܿ;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 87
    invoke-direct/range {v1 .. v6}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ᩳܶܿ;Ll/ۙ۠ܿ;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ۙ۠ܿ;)V
    .locals 7

    const-string v0, "file"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "relativePath"

    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "treePrimaryPath"

    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    new-instance v5, Ll/ᩳܶܿ;

    .line 123
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    new-instance v0, Ljava/io/File;

    sget-object v1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/data/media/"

    const-string v3, "/"

    .line 0
    invoke-static {v2, v1, v3, p2}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 124
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 121
    :goto_0
    invoke-direct {v5, p1, v0, p2, p3}, Ll/ᩳܶܿ;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    .line 117
    invoke-direct/range {v1 .. v6}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ᩳܶܿ;Ll/ۙ۠ܿ;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ᩳܶܿ;Ll/ۙ۠ܿ;)V
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "relativePath"

    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "treePrimaryPath"

    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0}, Ll/ܶ᩵ܿ;-><init>()V

    .line 39
    iput-object p1, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    .line 40
    iput-object p2, p0, Ll/۬۠ܿ;->ۤ:Ljava/lang/String;

    .line 41
    iput-object p3, p0, Ll/۬۠ܿ;->ۨ:Ljava/lang/String;

    .line 42
    iput-object p4, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    .line 43
    iput-object p5, p0, Ll/۬۠ܿ;->۫:Ll/ۙ۠ܿ;

    return-void
.end method

.method public static final ֫(Ll/۬۠ܿ;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 576
    invoke-virtual {p0}, Ll/۬۠ܿ;->᩶ۧ()Ll/ۧ᩹ܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ֫(Ll/۬۠ܿ;Ll/ۜܶܿ;)V
    .locals 0

    .line 37
    iput-object p1, p0, Ll/۬۠ܿ;->ۗ:Ll/ۜܶܿ;

    return-void
.end method

.method public static final synthetic ۖ(Ljava/lang/String;)V
    .locals 0

    .line 37
    sput-object p0, Ll/۬۠ܿ;->۟:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic ۘ(Ljava/lang/String;)V
    .locals 0

    .line 37
    sput-object p0, Ll/۬۠ܿ;->ܽ֫:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic ۛۧ()Ljava/lang/String;
    .locals 1

    .line 37
    sget-object v0, Ll/۬۠ܿ;->ܽ֫:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic ۤۧ()Ll/ۚۡ֫;
    .locals 1

    .line 37
    sget-object v0, Ll/۬۠ܿ;->ۧ֫:Ll/ۚۡ֫;

    return-object v0
.end method

.method public static final synthetic ۧ(Ll/۬۠ܿ;)Ljava/io/File;
    .locals 0

    .line 37
    iget-object p0, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    return-object p0
.end method

.method private final ۨۧ()Ll/ۜܶܿ;
    .locals 3

    .line 59
    iget-object v0, p0, Ll/۬۠ܿ;->ۗ:Ll/ۜܶܿ;

    if-eqz v0, :cond_0

    return-object v0

    .line 61
    :cond_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۨ:Ljava/lang/String;

    invoke-static {v0}, Ll/᩶۠ܿ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_1
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string v2, "content"

    .line 65
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "com.android.externalstorage.documents"

    .line 66
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "tree"

    .line 67
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "primary:"

    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "document"

    .line 69
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/۬۠ܿ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 71
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    .line 72
    new-instance v1, Ll/ۜܶܿ;

    iget-object v2, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    invoke-direct {v1, v2, v0}, Ll/ۜܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;)V

    iput-object v1, p0, Ll/۬۠ܿ;->ۗ:Ll/ۜܶܿ;

    return-object v1
.end method

.method public static final synthetic ۬ۧ()Ll/ۡۤۡ;
    .locals 1

    .line 37
    sget-object v0, Ll/۬۠ܿ;->֫֫:Ll/ۡۤۡ;

    return-object v0
.end method

.method public static final synthetic ܽ(Ll/۬۠ܿ;)Ljava/lang/String;
    .locals 0

    .line 37
    iget-object p0, p0, Ll/۬۠ܿ;->ۤ:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 2

    .line 179
    iget-object v0, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getParent()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡֫()Z
    .locals 2

    .line 271
    iget-object v0, p0, Ll/۬۠ܿ;->۫:Ll/ۙ۠ܿ;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 276
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->֡֫()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 278
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final ֨()Z
    .locals 1

    .line 77
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֨֫()Z
    .locals 1

    .line 259
    iget-object v0, p0, Ll/۬۠ܿ;->۫:Ll/ۙ۠ܿ;

    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {v0}, Ll/ۙ۠ܿ;->ܽ()Z

    move-result v0

    return v0

    .line 263
    :cond_0
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->֨֫()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 266
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->֨֫()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ֨ۧ()Z
    .locals 2

    const/4 v0, 0x1

    .line 319
    :try_start_0
    sget-object v1, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    iget-object v1, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v1}, Ll/ᩳܶܿ;->֨ۧ()Z
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 322
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 8

    .line 142
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    instance-of v1, v0, Ll/ܽܶܿ;

    if-eqz v1, :cond_0

    return-object p0

    .line 145
    :cond_0
    new-instance v1, Ll/۬۠ܿ;

    invoke-virtual {v0}, Ll/ᩳܶܿ;->֫()Ll/ܽܶܿ;

    move-result-object v6

    iget-object v7, p0, Ll/۬۠ܿ;->۫:Ll/ۙ۠ܿ;

    iget-object v3, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    iget-object v4, p0, Ll/۬۠ܿ;->ۤ:Ljava/lang/String;

    iget-object v5, p0, Ll/۬۠ܿ;->ۨ:Ljava/lang/String;

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ᩳܶܿ;Ll/ۙ۠ܿ;)V

    return-object v1
.end method

.method public final ֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;
    .locals 1

    .line 356
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0, p1}, Ll/ᩳܶܿ;->֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;

    move-result-object p1
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    nop

    .line 358
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;

    move-result-object p1

    goto :goto_0

    .line 359
    :cond_0
    invoke-super {p0, p1}, Ll/ܶ᩵ܿ;->֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final ֫(J)Z
    .locals 4

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-gez v3, :cond_0

    return v2

    .line 310
    :cond_0
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0, p1, p2}, Ll/ۧ᩹ܿ;->֫(J)Z

    move-result p1
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 313
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Ll/ۜܶܿ;->֫(J)Z

    move-result v2

    :cond_1
    move p1, v2

    :goto_0
    return p1
.end method

.method public final ֫֫()Ljava/lang/String;
    .locals 2

    .line 138
    iget-object v0, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAbsolutePath(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۗ()Z
    .locals 1

    .line 150
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۗ()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 153
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->ۗ()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۗۧ()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/۬۠ܿ;->ۨ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Z
    .locals 1

    .line 159
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۙ()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 162
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->ۙ()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۚ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۛ֫()J
    .locals 2

    .line 295
    iget-object v0, p0, Ll/۬۠ܿ;->۫:Ll/ۙ۠ܿ;

    if-eqz v0, :cond_0

    .line 296
    invoke-virtual {v0}, Ll/ۙ۠ܿ;->֫()J

    move-result-wide v0

    return-wide v0

    .line 300
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۛ֫()J

    move-result-wide v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    nop

    .line 302
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->ۛ֫()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public final ۜ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 2

    const-string v0, "mode"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 532
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0, p1}, Ll/ۧ᩹ܿ;->ۜ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    nop

    .line 534
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ܳ᩸ܿ;->ۜ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Permission denied: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜۧ()Ljava/nio/channels/FileChannel;
    .locals 3

    .line 510
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۜۧ()Ljava/nio/channels/FileChannel;

    move-result-object v0

    .line 508
    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    nop

    .line 512
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳ᩸ܿ;->ۜۧ()Ljava/nio/channels/FileChannel;

    const/4 v0, 0x0

    throw v0

    .line 513
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Permission denied: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۠()Z
    .locals 1

    .line 338
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ᩳܶܿ;->۠()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 340
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳ᩸ܿ;->۠()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۠֫()Z
    .locals 1

    .line 247
    iget-object v0, p0, Ll/۬۠ܿ;->۫:Ll/ۙ۠ܿ;

    if-eqz v0, :cond_0

    .line 248
    invoke-virtual {v0}, Ll/ۙ۠ܿ;->ܽ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    .line 251
    :cond_0
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->۠֫()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 254
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->۠֫()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۢۧ()Ljava/io/InputStream;
    .locals 3

    .line 490
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    nop

    .line 493
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳ᩸ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Permission denied: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 239
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۤ()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 242
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->ۤ()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۧ(Z)Ljava/util/List;
    .locals 11

    .line 372
    iget-object v0, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    const-string v1, "/"

    const-string v2, "Android/obb"

    const-string v3, "Android/data"

    iget-object v4, p0, Ll/۬۠ܿ;->ۤ:Ljava/lang/String;

    .line 374
    :try_start_0
    iget-object v5, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v5, p1}, Ll/ۧ᩹ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v5

    .line 375
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x22

    if-lt v6, v7, :cond_1

    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v6

    invoke-interface {v6}, Ll/֡᩶ܿ;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 376
    invoke-static {v4, v3}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-static {v4, v2}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 381
    :cond_0
    invoke-static {v5}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v6

    new-instance v7, Ll/ܶ۠ܿ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Ll/ۨۧ֨;

    invoke-direct {v8, v7}, Ll/ۨۧ֨;-><init>(Ll/ܶ۠ܿ;)V

    invoke-interface {v6, v8}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v6

    invoke-static {}, Ll/᩺ۨᩴ;->toSet()Ll/ۨۨᩴ;

    move-result-object v7

    invoke-interface {v6, v7}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Set;

    .line 382
    invoke-static {v6, v4}, Ll/֨۠ܿ;->֫(Ljava/util/Set;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 383
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 384
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 386
    new-instance v9, Ll/۬۠ܿ;

    .line 387
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v0, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 386
    invoke-direct {v9, v10, v8, v8}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v5}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v5

    .line 397
    :catch_0
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x21

    if-lt v5, v6, :cond_7

    .line 400
    invoke-static {v4, v3}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-ne v5, v6, :cond_2

    .line 402
    invoke-static {p0}, Ll/᩵۠ܿ;->֫(Ll/۬۠ܿ;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_1

    .line 404
    :cond_2
    invoke-static {p0}, Ll/ۚ۠ܿ;->֫(Ll/۬۠ܿ;)Ljava/util/ArrayList;

    move-result-object p1

    .line 405
    :goto_1
    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۬۠ܿ;->۟:Ljava/lang/String;

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 406
    invoke-static {v4}, Ll/᩶۠ܿ;->֫(Ljava/lang/String;)V

    :cond_3
    return-object p1

    .line 409
    :cond_4
    invoke-static {v4, v2}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-ne v5, v6, :cond_5

    .line 411
    invoke-static {p0}, Ll/᩵۠ܿ;->ۧ(Ll/۬۠ܿ;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_2

    .line 413
    :cond_5
    invoke-static {p0}, Ll/ۚ۠ܿ;->ۧ(Ll/۬۠ܿ;)Ljava/util/ArrayList;

    move-result-object p1

    .line 414
    :goto_2
    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۬۠ܿ;->۟:Ljava/lang/String;

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 415
    invoke-static {v4}, Ll/᩶۠ܿ;->֫(Ljava/lang/String;)V

    :cond_6
    return-object p1

    .line 420
    :cond_7
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v2

    .line 421
    iget-object v3, p0, Ll/۬۠ܿ;->ۨ:Ljava/lang/String;

    if-nez v2, :cond_9

    .line 422
    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ll/۬۠ܿ;->۟:Ljava/lang/String;

    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 423
    invoke-static {v3}, Ll/᩶۠ܿ;->֫(Ljava/lang/String;)V

    .line 425
    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto/16 :goto_7

    .line 427
    :cond_9
    invoke-virtual {v2, p1}, Ll/ۡ᩸ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p1

    .line 1586
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1}, Ll/֫ܶ᩵;->֫(Ljava/lang/Iterable;)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1661
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 1662
    check-cast v5, Ll/ܶ᩵ܿ;

    .line 428
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 429
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 0
    invoke-static {v4, v1, v6}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 431
    new-instance v8, Ll/۬۠ܿ;

    invoke-direct {v8, v7, v6, v3}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    check-cast v5, Ll/ۜܶܿ;

    iput-object v5, v8, Ll/۬۠ܿ;->ۗ:Ll/ۜܶܿ;

    .line 1662
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    const-string p1, "<this>"

    .line 0
    invoke-static {v2, p1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1343
    instance-of p1, v2, Ljava/util/Collection;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_d

    .line 1344
    move-object p1, v2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    if-eqz v3, :cond_11

    if-eq v3, v1, :cond_b

    .line 1366
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p1, v0

    goto :goto_7

    .line 1346
    :cond_b
    instance-of v1, v2, Ljava/util/List;

    if-eqz v1, :cond_c

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_c
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    :goto_4
    invoke-static {p1}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_7

    :cond_d
    if-eqz p1, :cond_e

    .line 1358
    check-cast v2, Ljava/util/Collection;

    .line 1366
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_6

    .line 1359
    :cond_e
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const-string v3, "<this>"

    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1326
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 1327
    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 309
    :cond_f
    :goto_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_11

    if-eq v2, v1, :cond_10

    goto :goto_7

    .line 311
    :cond_10
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_7

    .line 434
    :cond_11
    sget-object p1, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    :goto_7
    return-object p1
.end method

.method public final ۧ()Ll/۬۠ܿ;
    .locals 0

    return-object p0
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 2

    const-string v0, "tar"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    :try_start_0
    instance-of v0, p1, Ll/۬۠ܿ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ll/۬۠ܿ;

    iget-object v0, v0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 225
    :goto_0
    iget-object v1, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v1, v0}, Ll/ۧ᩹ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 227
    :catch_0
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 229
    instance-of v1, p1, Ll/۬۠ܿ;

    if-eqz v1, :cond_1

    .line 230
    move-object v1, p1

    check-cast v1, Ll/۬۠ܿ;

    invoke-direct {v1}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object p1, v1

    .line 232
    :cond_1
    invoke-virtual {v0, p1}, Ll/ۡ᩸ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final ۫()Z
    .locals 1

    .line 214
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->۫()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 217
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 313
    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->۬()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۬()Z
    .locals 1

    .line 196
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->۬()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 199
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->۬()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ܰ֫()Ljava/util/List;
    .locals 6

    const-string v0, "Android/obb"

    const-string v1, "Android/data"

    .line 440
    iget-object v2, p0, Ll/۬۠ܿ;->ۤ:Ljava/lang/String;

    .line 442
    :try_start_0
    iget-object v3, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v3}, Ll/ۧ᩹ܿ;->ܰ֫()Ljava/util/List;

    move-result-object v3

    .line 443
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x22

    if-lt v4, v5, :cond_1

    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v4

    invoke-interface {v4}, Ll/֡᩶ܿ;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 444
    invoke-static {v2, v1}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v2, v0}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 449
    :cond_0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 450
    invoke-static {v4, v2}, Ll/֨۠ܿ;->֫(Ljava/util/Set;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 451
    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-static {v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    .line 456
    :catch_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v3, v4, :cond_7

    .line 457
    invoke-static {v2, v1}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 458
    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۬۠ܿ;->۟:Ljava/lang/String;

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 459
    invoke-static {v2}, Ll/᩶۠ܿ;->֫(Ljava/lang/String;)V

    :cond_2
    if-ne v3, v4, :cond_3

    .line 462
    invoke-static {}, Ll/᩵۠ܿ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    .line 464
    :cond_3
    invoke-static {}, Ll/ۚ۠ܿ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    return-object v0

    .line 465
    :cond_4
    invoke-static {v2, v0}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 466
    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۬۠ܿ;->۟:Ljava/lang/String;

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 467
    invoke-static {v2}, Ll/᩶۠ܿ;->֫(Ljava/lang/String;)V

    :cond_5
    if-ne v3, v4, :cond_6

    .line 470
    invoke-static {}, Ll/᩵۠ܿ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_1

    .line 472
    :cond_6
    invoke-static {}, Ll/ۚ۠ܿ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    :goto_1
    return-object v0

    .line 475
    :cond_7
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-nez v0, :cond_9

    .line 477
    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۬۠ܿ;->۟:Ljava/lang/String;

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 478
    iget-object v0, p0, Ll/۬۠ܿ;->ۨ:Ljava/lang/String;

    invoke-static {v0}, Ll/᩶۠ܿ;->֫(Ljava/lang/String;)V

    .line 480
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2

    .line 482
    :cond_9
    invoke-virtual {v0}, Ll/ܳ᩸ܿ;->ܰ֫()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    :goto_2
    return-object v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 81
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܺ֫()Ljava/lang/String;
    .locals 2

    .line 183
    iget-object v0, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPath(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܽ(Z)Ljava/io/OutputStream;
    .locals 2

    .line 501
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0, p1}, Ll/ۧ᩹ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p1
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    nop

    .line 503
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۡ᩸ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Permission denied: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ֫()Landroid/net/Uri;
    .locals 2

    .line 548
    invoke-virtual {p0}, Ll/۬۠ܿ;->᩵֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 551
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "getContentUri(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 549
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 328
    :try_start_0
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ᩳܶܿ;->ᩴ()Z

    move-result v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 331
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳ᩸ܿ;->ᩴ()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ᩵֫()Z
    .locals 2

    .line 539
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    .line 540
    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 544
    :cond_0
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final ᩶ۧ()Ll/ۧ᩹ܿ;
    .locals 1

    .line 563
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    .line 564
    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 568
    :cond_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)Ll/ۖۖܽ;
    .locals 2

    .line 521
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0, p1}, Ll/ۧ᩹ܿ;->᩷(Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p1
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    nop

    .line 523
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۡ᩸ܿ;->᩷(Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1

    .line 524
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Permission denied: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩹()Ll/ۤ᩵ܿ;
    .locals 2

    .line 576
    invoke-virtual {p0}, Ll/۬۠ܿ;->᩶ۧ()Ll/ۧ᩹ܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    .line 170
    invoke-super {p0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    return-object v0

    .line 171
    :cond_1
    new-instance v1, Ll/᩸۠ܿ;

    invoke-direct {v1, p0, v0}, Ll/᩸۠ܿ;-><init>(Ll/۬۠ܿ;Ll/ܶ᩵ܿ;)V

    return-object v1
.end method

.method public final ᩺()Ll/ܶ᩵ܿ;
    .locals 5

    .line 134
    new-instance v0, Ll/۬۠ܿ;

    iget-object v1, p0, Ll/۬۠ܿ;->۬:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v1

    const-string v2, "getAbsoluteFile(...)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Ll/۬۠ܿ;->ۨ:Ljava/lang/String;

    iget-object v3, p0, Ll/۬۠ܿ;->۫:Ll/ۙ۠ܿ;

    iget-object v4, p0, Ll/۬۠ܿ;->ۤ:Ljava/lang/String;

    invoke-direct {v0, v1, v4, v2, v3}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ۙ۠ܿ;)V

    return-object v0
.end method

.method public final ᩺֫()J
    .locals 2

    .line 283
    iget-object v0, p0, Ll/۬۠ܿ;->۫:Ll/ۙ۠ܿ;

    if-eqz v0, :cond_0

    .line 284
    invoke-virtual {v0}, Ll/ۙ۠ܿ;->ۧ()J

    move-result-wide v0

    return-wide v0

    .line 288
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/۬۠ܿ;->ۛ:Ll/ᩳܶܿ;

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->᩺֫()J

    move-result-wide v0
    :try_end_0
    .catch Ll/ܿܶܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    nop

    .line 290
    invoke-direct {p0}, Ll/۬۠ܿ;->ۨۧ()Ll/ۜܶܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۡ᩸ܿ;->᩺֫()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method
