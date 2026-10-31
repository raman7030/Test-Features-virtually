.class public final Ll/ۧ۫֫;
.super Ljava/lang/Object;
.source "H8RW"


# direct methods
.method public static ֫(Landroid/media/AudioManager;Ll/ᩳᩴ֫;)Ll/ᩳ۫֫;
    .locals 7

    .line 653
    invoke-virtual {p1}, Ll/ᩳᩴ֫;->֫()Ll/ܽᩴ֫;

    move-result-object p1

    iget-object p1, p1, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    .line 652
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getDirectProfilesForAttributes(Landroid/media/AudioAttributes;)Ljava/util/List;

    move-result-object p0

    .line 654
    new-instance p1, Ll/ᩳ۫֫;

    .line 404
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x2

    .line 406
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    const/16 v3, 0xc

    filled-new-array {v3}, [I

    move-result-object v3

    invoke-static {v3}, Ll/۬᩺ܺ;->֫([I)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 407
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 408
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/AudioProfile;

    .line 409
    invoke-virtual {v3}, Landroid/media/AudioProfile;->getEncapsulationType()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    goto :goto_1

    .line 414
    :cond_0
    invoke-virtual {v3}, Landroid/media/AudioProfile;->getFormat()I

    move-result v4

    .line 415
    invoke-static {v4}, Ll/ۘ֨֫;->ۜ(I)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Ll/ᩳ۫֫;->ܽ:Ll/ۢ۬ܺ;

    .line 416
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 419
    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 420
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    invoke-virtual {v3}, Landroid/media/AudioProfile;->getChannelMasks()[I

    move-result-object v3

    invoke-static {v3}, Ll/۬᩺ܺ;->֫([I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 424
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Ljava/util/HashSet;

    invoke-virtual {v3}, Landroid/media/AudioProfile;->getChannelMasks()[I

    move-result-object v3

    invoke-static {v3}, Ll/۬᩺ܺ;->֫([I)Ljava/util/List;

    move-result-object v3

    invoke-direct {v5, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 423
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 428
    :cond_3
    sget p0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance p0, Ll/֫۬ܺ;

    invoke-direct {p0}, Ll/֫۬ܺ;-><init>()V

    .line 429
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 430
    new-instance v3, Ll/ܽ۫֫;

    .line 431
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-direct {v3, v4, v2}, Ll/ܽ۫֫;-><init>(ILjava/util/Set;)V

    .line 430
    invoke-virtual {p0, v3}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_2

    .line 433
    :cond_4
    invoke-virtual {p0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    .line 654
    invoke-direct {p1, v1, p0}, Ll/ᩳ۫֫;-><init>(ILjava/util/List;)V

    return-object p1
.end method

.method public static ۧ(Landroid/media/AudioManager;Ll/ᩳᩴ֫;)Ll/ۢ۫֫;
    .locals 1

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    invoke-virtual {p1}, Ll/ᩳᩴ֫;->֫()Ll/ܽᩴ֫;

    move-result-object p1

    iget-object p1, p1, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    .line 662
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->getAudioDevicesForAttributes(Landroid/media/AudioAttributes;)Ljava/util/List;

    move-result-object p0

    .line 664
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 670
    :cond_0
    new-instance p1, Ll/ۢ۫֫;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ll/ܽ᩷ᩳ;->֫(Ljava/lang/Object;)Landroid/media/AudioDeviceInfo;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/ۢ۫֫;-><init>(Landroid/media/AudioDeviceInfo;)V

    return-object p1
.end method
