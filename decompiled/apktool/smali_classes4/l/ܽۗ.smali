.class public final Ll/ܽۗ;
.super Ljava/lang/Object;
.source "63RK"


# static fields
.field public static volatile ֫:Ljava/util/ArrayList;

.field public static volatile ۧ:Ll/ۧۗ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 4

    .line 497
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    .line 498
    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    .line 499
    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->getDynamicShortcuts()Ljava/util/List;

    move-result-object v0

    .line 500
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 501
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ShortcutInfo;

    .line 502
    new-instance v3, Ll/ܰۙ;

    invoke-direct {v3, p0, v2}, Ll/ܰۙ;-><init>(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;)V

    invoke-virtual {v3}, Ll/ܰۙ;->֫()Ll/۟ۙ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1

    .line 508
    :cond_1
    :try_start_0
    invoke-static {p0}, Ll/ܽۗ;->ᩳ(Landroid/content/Context;)Ll/ۧۗ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 513
    :catch_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 2

    .line 912
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-le v0, v1, :cond_0

    return-object p0

    .line 913
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 914
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۙ;

    .line 915
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 431
    invoke-static {}, Ll/ܿ᩺᩵;->֫()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۢۢ;->֫(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/pm/ShortcutManager;->reportShortcutUsed(Ljava/lang/String;)V

    .line 434
    :cond_0
    invoke-static {p0}, Ll/ܽۗ;->ܽ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۙ;

    .line 435
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/util/List;)V
    .locals 2

    .line 662
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 663
    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0, p1}, Landroid/content/pm/ShortcutManager;->removeDynamicShortcuts(Ljava/util/List;)V

    .line 666
    :cond_0
    invoke-static {p0}, Ll/ܽۗ;->ᩳ(Landroid/content/Context;)Ll/ۧۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    invoke-static {p0}, Ll/ܽۗ;->ܽ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨۙ;

    .line 668
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Landroid/content/Context;Ll/۟ۙ;)Z
    .locals 5

    .line 557
    iget-object v0, p1, Ll/۟ۙ;->ܳ:Ll/ۙ۬;

    if-nez v0, :cond_0

    goto :goto_0

    .line 560
    :cond_0
    iget v1, v0, Ll/ۙ۬;->ۢ:I

    const/4 v2, 0x1

    const/4 v3, 0x6

    if-eq v1, v3, :cond_1

    const/4 v4, 0x4

    if-eq v1, v4, :cond_1

    return v2

    .line 564
    :cond_1
    invoke-virtual {v0, p0}, Ll/ۙ۬;->֫(Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_0

    .line 568
    :cond_2
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p0

    if-nez p0, :cond_3

    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_3
    if-ne v1, v3, :cond_4

    .line 573
    invoke-static {p0}, Ll/ۙ۬;->֫(Landroid/graphics/Bitmap;)Ll/ۙ۬;

    move-result-object p0

    goto :goto_1

    .line 574
    :cond_4
    invoke-static {p0}, Ll/ۙ۬;->ۧ(Landroid/graphics/Bitmap;)Ll/ۙ۬;

    move-result-object p0

    :goto_1
    iput-object p0, p1, Ll/۟ۙ;->ܳ:Ll/ۙ۬;

    return v2
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/util/ArrayList;)Z
    .locals 2

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    invoke-static {p1}, Ll/ܽۗ;->֫(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    .line 469
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    .line 470
    new-instance v0, Ljava/util/ArrayList;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 471
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۙ;

    .line 472
    invoke-virtual {v1}, Ll/۟ۙ;->ᩳ()Landroid/content/pm/ShortcutInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 474
    :cond_0
    const-class p1, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p1, v0}, Landroid/content/pm/ShortcutManager;->setDynamicShortcuts(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p0, 0x0

    return p0

    .line 478
    :cond_1
    invoke-static {p0}, Ll/ܽۗ;->ᩳ(Landroid/content/Context;)Ll/ۧۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    invoke-static {p0}, Ll/ܽۗ;->ᩳ(Landroid/content/Context;)Ll/ۧۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    invoke-static {p0}, Ll/ܽۗ;->ܽ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨۙ;

    .line 482
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Landroid/content/Context;)I
    .locals 2

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 356
    invoke-static {}, Ll/ܿ᩺᩵;->֫()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۢۢ;->֫(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/pm/ShortcutManager;->getMaxShortcutCountPerActivity()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x5

    return p0
.end method

.method public static ۧ(Landroid/content/Context;Ll/۟ۙ;)Z
    .locals 11

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 760
    invoke-static {p0}, Ll/ܽۗ;->ۧ(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v3, 0x1d

    if-gt v0, v3, :cond_1

    .line 765
    invoke-static {p0, p1}, Ll/ܽۗ;->֫(Landroid/content/Context;Ll/۟ۙ;)Z

    :cond_1
    const/16 v3, 0x1e

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-lt v0, v3, :cond_2

    .line 768
    invoke-static {}, Ll/ܿ᩺᩵;->֫()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۢۢ;->֫(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    move-result-object v0

    .line 769
    invoke-virtual {p1}, Ll/۟ۙ;->ᩳ()Landroid/content/pm/ShortcutInfo;

    move-result-object v3

    .line 768
    invoke-virtual {v0, v3}, Landroid/content/pm/ShortcutManager;->pushDynamicShortcut(Landroid/content/pm/ShortcutInfo;)V

    goto :goto_2

    :cond_2
    const/16 v3, 0x19

    if-lt v0, v3, :cond_7

    .line 771
    invoke-static {}, Ll/ܿ᩺᩵;->֫()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۢۢ;->֫(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    move-result-object v0

    .line 772
    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->isRateLimitingActive()Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_0
    return v2

    .line 775
    :cond_3
    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->getDynamicShortcuts()Ljava/util/List;

    move-result-object v3

    .line 776
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-lt v7, v1, :cond_6

    .line 927
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v7, -0x1

    move-object v8, v4

    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/pm/ShortcutInfo;

    .line 928
    invoke-virtual {v9}, Landroid/content/pm/ShortcutInfo;->getRank()I

    move-result v10

    if-le v10, v7, :cond_4

    .line 929
    invoke-virtual {v9}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object v8

    .line 930
    invoke-virtual {v9}, Landroid/content/pm/ShortcutInfo;->getRank()I

    move-result v7

    goto :goto_1

    .line 778
    :cond_5
    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v3

    .line 777
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/pm/ShortcutManager;->removeDynamicShortcuts(Ljava/util/List;)V

    :cond_6
    new-array v3, v6, [Landroid/content/pm/ShortcutInfo;

    .line 780
    invoke-virtual {p1}, Ll/۟ۙ;->ᩳ()Landroid/content/pm/ShortcutInfo;

    move-result-object v7

    aput-object v7, v3, v2

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/pm/ShortcutManager;->addDynamicShortcuts(Ljava/util/List;)Z

    .line 782
    :cond_7
    :goto_2
    invoke-static {p0}, Ll/ܽۗ;->ᩳ(Landroid/content/Context;)Ll/ۧۗ;

    move-result-object v0

    .line 784
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 785
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v3, v1, :cond_a

    .line 806
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۙ;

    .line 338
    iget v3, v1, Ll/۟ۙ;->ۖ:I

    if-le v3, v5, :cond_8

    .line 226
    iget-object v4, v1, Ll/۟ۙ;->᩻:Ljava/lang/String;

    move v5, v3

    goto :goto_3

    .line 787
    :cond_9
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v0

    .line 786
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    :cond_a
    new-array v0, v6, [Ll/۟ۙ;

    aput-object p1, v0, v2

    .line 789
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 794
    invoke-static {p0}, Ll/ܽۗ;->ܽ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۙ;

    .line 795
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    .line 226
    :cond_b
    iget-object p1, p1, Ll/۟ۙ;->᩻:Ljava/lang/String;

    .line 797
    invoke-static {p0, p1}, Ll/ܽۗ;->֫(Landroid/content/Context;Ljava/lang/String;)V

    return v6

    :catchall_0
    move-exception v0

    .line 794
    invoke-static {p0}, Ll/ܽۗ;->ܽ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۙ;

    .line 795
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_5

    .line 226
    :cond_c
    iget-object p1, p1, Ll/۟ۙ;->᩻:Ljava/lang/String;

    .line 797
    invoke-static {p0, p1}, Ll/ܽۗ;->֫(Landroid/content/Context;Ljava/lang/String;)V

    .line 798
    throw v0

    .line 794
    :catch_0
    invoke-static {p0}, Ll/ܽۗ;->ܽ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۙ;

    .line 795
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_6

    .line 226
    :cond_d
    iget-object p1, p1, Ll/۟ۙ;->᩻:Ljava/lang/String;

    .line 797
    invoke-static {p0, p1}, Ll/ܽۗ;->֫(Landroid/content/Context;Ljava/lang/String;)V

    return v2
.end method

.method public static ۧ(Ll/ۗܺ᩷;Ljava/util/ArrayList;)Z
    .locals 3

    .line 532
    invoke-static {p1}, Ll/ܽۗ;->֫(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    .line 534
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-gt v0, v1, :cond_1

    .line 581
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 582
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۙ;

    .line 583
    invoke-static {p0, v1}, Ll/ܽۗ;->֫(Landroid/content/Context;Ll/۟ۙ;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 584
    move-object v2, p1

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 537
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_3

    .line 538
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 539
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۙ;

    .line 540
    invoke-virtual {v1}, Ll/۟ۙ;->ᩳ()Landroid/content/pm/ShortcutInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 542
    :cond_2
    const-class p1, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p1, v0}, Landroid/content/pm/ShortcutManager;->updateShortcuts(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_3

    const/4 p0, 0x0

    return p0

    .line 547
    :cond_3
    invoke-static {p0}, Ll/ܽۗ;->ᩳ(Landroid/content/Context;)Ll/ۧۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    invoke-static {p0}, Ll/ܽۗ;->ܽ(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨۙ;

    .line 549
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method public static ܳ(Landroid/content/Context;)Z
    .locals 4

    .line 153
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 154
    invoke-static {}, Ll/ܿ᩺᩵;->֫()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۢۢ;->֫(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/pm/ShortcutManager;->isRequestPinShortcutSupported()Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "com.android.launcher.permission.INSTALL_SHORTCUT"

    .line 157
    invoke-static {p0, v0}, Ll/֨ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    return v2

    .line 161
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.android.launcher.action.INSTALL_SHORTCUT"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 163
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 164
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    return v2
.end method

.method public static ܽ(Landroid/content/Context;)Ljava/util/List;
    .locals 8

    .line 866
    sget-object v0, Ll/ܽۗ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_4

    .line 867
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 869
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 870
    new-instance v2, Landroid/content/Intent;

    const-string v3, "androidx.core.content.pm.SHORTCUT_LISTENER"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 871
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/16 v3, 0x80

    .line 873
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    .line 876
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    .line 877
    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-nez v2, :cond_0

    goto :goto_0

    .line 881
    :cond_0
    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "androidx.core.content.pm.shortcut_listener_impl"

    .line 886
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 891
    :cond_2
    :try_start_0
    const-class v3, Ll/ܽۗ;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x0

    .line 892
    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getInstance"

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Class;

    .line 893
    const-class v7, Landroid/content/Context;

    aput-object v7, v6, v4

    invoke-virtual {v2, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p0, v3, v4

    const/4 v4, 0x0

    .line 895
    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۙ;

    .line 894
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 901
    :cond_3
    sget-object p0, Ll/ܽۗ;->֫:Ljava/util/ArrayList;

    if-nez p0, :cond_4

    .line 902
    sput-object v0, Ll/ܽۗ;->֫:Ljava/util/ArrayList;

    .line 905
    :cond_4
    sget-object p0, Ll/ܽۗ;->֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static ܽ(Landroid/content/Context;Ll/۟ۙ;)Z
    .locals 6

    .line 191
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    .line 197
    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ShortcutManager;

    .line 198
    invoke-virtual {p1}, Ll/۟ۙ;->ᩳ()Landroid/content/pm/ShortcutInfo;

    move-result-object p1

    .line 197
    invoke-virtual {p0, p1, v2}, Landroid/content/pm/ShortcutManager;->requestPinShortcut(Landroid/content/pm/ShortcutInfo;Landroid/content/IntentSender;)Z

    move-result p0

    return p0

    .line 201
    :cond_1
    invoke-static {p0}, Ll/ܽۗ;->ܳ(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p0, 0x0

    return p0

    .line 204
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.launcher.action.INSTALL_SHORTCUT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 195
    iget-object v1, p1, Ll/۟ۙ;->ۜ:[Landroid/content/Intent;

    array-length v3, v1

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    aget-object v1, v1, v3

    const-string v3, "android.intent.extra.shortcut.INTENT"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v1

    iget-object v3, p1, Ll/۟ۙ;->᩷:Ljava/lang/CharSequence;

    .line 196
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "android.intent.extra.shortcut.NAME"

    invoke-virtual {v1, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 197
    iget-object v1, p1, Ll/۟ۙ;->ܳ:Ll/ۙ۬;

    if-eqz v1, :cond_3

    .line 212
    iget-object p1, p1, Ll/۟ۙ;->ܽ:Landroid/content/Context;

    invoke-virtual {v1, v0, v2, p1}, Ll/ۙ۬;->֫(Landroid/content/Intent;Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

    .line 208
    :cond_3
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return v4
.end method

.method public static ܿ(Landroid/content/Context;)Ljava/util/List;
    .locals 2

    .line 282
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 283
    const-class v0, Landroid/content/pm/ShortcutManager;

    .line 284
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutManager;->getShortcuts(I)Ljava/util/List;

    move-result-object v0

    .line 285
    invoke-static {p0, v0}, Ll/۟ۙ;->֫(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    .line 287
    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ShortcutManager;

    .line 288
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 296
    invoke-virtual {v0}, Landroid/content/pm/ShortcutManager;->getPinnedShortcuts()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 298
    invoke-static {p0, v1}, Ll/۟ۙ;->֫(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    .line 307
    :cond_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0
.end method

.method public static ᩳ(Landroid/content/Context;)Ll/ۧۗ;
    .locals 6

    .line 844
    sget-object v0, Ll/ܽۗ;->ۧ:Ll/ۧۗ;

    if-nez v0, :cond_1

    .line 845
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 847
    :try_start_0
    const-class v0, Ll/ܽۗ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "androidx.sharetarget.ShortcutInfoCompatSaverImpl"

    const/4 v2, 0x0

    .line 848
    invoke-static {v1, v2, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    .line 850
    const-class v5, Landroid/content/Context;

    aput-object v5, v4, v2

    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p0, v1, v2

    const/4 p0, 0x0

    .line 851
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۧۗ;

    sput-object p0, Ll/ܽۗ;->ۧ:Ll/ۧۗ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 856
    :cond_0
    :goto_0
    sget-object p0, Ll/ܽۗ;->ۧ:Ll/ۧۗ;

    if-nez p0, :cond_1

    .line 858
    new-instance p0, Ll/֫ۗ;

    .line 55
    invoke-direct {p0}, Ll/ۧۗ;-><init>()V

    .line 858
    sput-object p0, Ll/ܽۗ;->ۧ:Ll/ۧۗ;

    .line 861
    :cond_1
    sget-object p0, Ll/ܽۗ;->ۧ:Ll/ۧۗ;

    return-object p0
.end method
