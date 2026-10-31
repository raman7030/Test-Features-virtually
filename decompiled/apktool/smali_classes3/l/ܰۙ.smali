.class public final Ll/ܰۙ;
.super Ljava/lang/Object;
.source "L3XU"


# instance fields
.field public final ֫:Ll/۟ۙ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;)V
    .locals 7

    .line 596
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 597
    new-instance v0, Ll/۟ۙ;

    invoke-direct {v0}, Ll/۟ۙ;-><init>()V

    iput-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    .line 598
    iput-object p1, v0, Ll/۟ۙ;->ܽ:Landroid/content/Context;

    .line 599
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/۟ۙ;->᩻:Ljava/lang/String;

    .line 600
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getPackage()Ljava/lang/String;

    .line 601
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getIntents()[Landroid/content/Intent;

    move-result-object p1

    .line 602
    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/Intent;

    iput-object p1, v0, Ll/۟ۙ;->ۜ:[Landroid/content/Intent;

    .line 603
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getActivity()Landroid/content/ComponentName;

    move-result-object p1

    iput-object p1, v0, Ll/۟ۙ;->֫:Landroid/content/ComponentName;

    .line 604
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getShortLabel()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/۟ۙ;->᩷:Ljava/lang/CharSequence;

    .line 605
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getLongLabel()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/۟ۙ;->ۡ:Ljava/lang/CharSequence;

    .line 606
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getDisabledMessage()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/۟ۙ;->ᩳ:Ljava/lang/CharSequence;

    .line 607
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt p1, v1, :cond_0

    .line 608
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getDisabledReason()I

    goto :goto_0

    .line 610
    :cond_0
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isEnabled()Z

    .line 614
    :goto_0
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getCategories()Ljava/util/Set;

    move-result-object p1

    iput-object p1, v0, Ll/۟ۙ;->ۧ:Ljava/util/Set;

    .line 615
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-string v2, "extraPersonCount"

    .line 355
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    .line 359
    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 360
    new-array v3, v2, [Ll/ܰ᩶;

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_3

    .line 362
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "extraPerson_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v6, v4, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 363
    invoke-virtual {p1, v5}, Landroid/os/PersistableBundle;->getPersistableBundle(Ljava/lang/String;)Landroid/os/PersistableBundle;

    move-result-object v5

    .line 362
    invoke-static {v5}, Ll/ܰ᩶;->֫(Landroid/os/PersistableBundle;)Ll/ܰ᩶;

    move-result-object v5

    aput-object v5, v3, v4

    move v4, v6

    goto :goto_1

    :cond_2
    :goto_2
    move-object v3, v1

    .line 615
    :cond_3
    iput-object v3, v0, Ll/۟ۙ;->ܺ:[Ll/ܰ᩶;

    .line 616
    iget-object p1, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getUserHandle()Landroid/os/UserHandle;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    iget-object p1, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getLastChangedTimestamp()J

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p1, v0, :cond_4

    .line 619
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isCached()Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    :cond_4
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isDynamic()Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isPinned()Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isDeclaredInManifest()Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isImmutable()Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isEnabled()Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->hasKeyFieldsOnly()Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    const/16 v2, 0x1d

    if-lt p1, v2, :cond_6

    .line 500
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getLocusId()Landroid/content/LocusId;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    .line 501
    :cond_5
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getLocusId()Landroid/content/LocusId;

    move-result-object p1

    invoke-static {p1}, Ll/ۙۙ;->֫(Landroid/content/LocusId;)Ll/ۙۙ;

    move-result-object v1

    goto :goto_3

    .line 503
    :cond_6
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    const-string v2, "extraLocusId"

    .line 531
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_3

    .line 532
    :cond_8
    new-instance v1, Ll/ۙۙ;

    invoke-direct {v1, p1}, Ll/ۙۙ;-><init>(Ljava/lang/String;)V

    .line 627
    :goto_3
    iput-object v1, v0, Ll/۟ۙ;->ۢ:Ll/ۙۙ;

    .line 628
    iget-object p1, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getRank()I

    move-result v0

    iput v0, p1, Ll/۟ۙ;->ۖ:I

    .line 629
    iget-object p1, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p2

    iput-object p2, p1, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 546
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 547
    new-instance v0, Ll/۟ۙ;

    invoke-direct {v0}, Ll/۟ۙ;-><init>()V

    iput-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    .line 548
    iput-object p1, v0, Ll/۟ۙ;->ܽ:Landroid/content/Context;

    .line 549
    iput-object p2, v0, Ll/۟ۙ;->᩻:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/۟ۙ;)V
    .locals 3

    .line 555
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 556
    new-instance v0, Ll/۟ۙ;

    invoke-direct {v0}, Ll/۟ۙ;-><init>()V

    iput-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    .line 557
    iget-object v1, p1, Ll/۟ۙ;->ܽ:Landroid/content/Context;

    iput-object v1, v0, Ll/۟ۙ;->ܽ:Landroid/content/Context;

    .line 558
    iget-object v1, p1, Ll/۟ۙ;->᩻:Ljava/lang/String;

    iput-object v1, v0, Ll/۟ۙ;->᩻:Ljava/lang/String;

    .line 560
    iget-object v1, p1, Ll/۟ۙ;->ۜ:[Landroid/content/Intent;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/Intent;

    iput-object v1, v0, Ll/۟ۙ;->ۜ:[Landroid/content/Intent;

    .line 561
    iget-object v1, p1, Ll/۟ۙ;->֫:Landroid/content/ComponentName;

    iput-object v1, v0, Ll/۟ۙ;->֫:Landroid/content/ComponentName;

    .line 562
    iget-object v1, p1, Ll/۟ۙ;->᩷:Ljava/lang/CharSequence;

    iput-object v1, v0, Ll/۟ۙ;->᩷:Ljava/lang/CharSequence;

    .line 563
    iget-object v1, p1, Ll/۟ۙ;->ۡ:Ljava/lang/CharSequence;

    iput-object v1, v0, Ll/۟ۙ;->ۡ:Ljava/lang/CharSequence;

    .line 564
    iget-object v1, p1, Ll/۟ۙ;->ᩳ:Ljava/lang/CharSequence;

    iput-object v1, v0, Ll/۟ۙ;->ᩳ:Ljava/lang/CharSequence;

    .line 566
    iget-object v1, p1, Ll/۟ۙ;->ܳ:Ll/ۙ۬;

    iput-object v1, v0, Ll/۟ۙ;->ܳ:Ll/ۙ۬;

    .line 576
    iget-object v1, p1, Ll/۟ۙ;->ۢ:Ll/ۙۙ;

    iput-object v1, v0, Ll/۟ۙ;->ۢ:Ll/ۙۙ;

    .line 579
    iget v1, p1, Ll/۟ۙ;->ۖ:I

    iput v1, v0, Ll/۟ۙ;->ۖ:I

    .line 580
    iget-object v1, p1, Ll/۟ۙ;->ܺ:[Ll/ܰ᩶;

    if-eqz v1, :cond_0

    .line 581
    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ܰ᩶;

    iput-object v1, v0, Ll/۟ۙ;->ܺ:[Ll/ܰ᩶;

    .line 583
    :cond_0
    iget-object v1, p1, Ll/۟ۙ;->ۧ:Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 584
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p1, Ll/۟ۙ;->ۧ:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Ll/۟ۙ;->ۧ:Ljava/util/Set;

    .line 586
    :cond_1
    iget-object p1, p1, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    if-eqz p1, :cond_2

    .line 587
    iput-object p1, v0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()Ll/۟ۙ;
    .locals 2

    .line 957
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    iget-object v1, v0, Ll/۟ۙ;->᩷:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 960
    iget-object v1, v0, Ll/۟ۙ;->ۜ:[Landroid/content/Intent;

    if-eqz v1, :cond_0

    array-length v1, v1

    if-eqz v1, :cond_0

    return-object v0

    .line 961
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Shortcut must have an intent"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 958
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Shortcut must have a non-empty label"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Landroid/content/Intent;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/content/Intent;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 695
    iget-object p1, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    iput-object v0, p1, Ll/۟ۙ;->ۜ:[Landroid/content/Intent;

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 643
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    iput-object p1, v0, Ll/۟ۙ;->᩷:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ֫(Ll/ۙ۬;)V
    .locals 1

    .line 704
    iget-object v0, p0, Ll/ܰۙ;->֫:Ll/۟ۙ;

    iput-object p1, v0, Ll/۟ۙ;->ܳ:Ll/ۙ۬;

    return-void
.end method
