.class public final Ll/֨۟ۧ;
.super Ljava/lang/Object;
.source "J71Y"


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 538
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 539
    iput-object p1, p0, Ll/֨۟ۧ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/net/Uri;)Landroid/webkit/WebResourceResponse;
    .locals 6

    .line 555
    iget-object v0, p0, Ll/֨۟ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۟ۧ;

    .line 556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Ll/ۚ۟ۧ;->ܽ:Ljava/lang/String;

    .line 441
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    const-string v5, "http"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 445
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    const-string v5, "https"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    .line 448
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v1, Ll/ۚ۟ۧ;->֫:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    .line 451
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 454
    :cond_3
    iget-object v2, v1, Ll/ۚ۟ۧ;->ۧ:Ll/֡۟ۧ;

    :goto_1
    if-nez v2, :cond_4

    goto :goto_0

    .line 559
    :cond_4
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    .line 465
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 560
    invoke-interface {v2, p1}, Ll/֡۟ۧ;->֫(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v2
.end method
