.class public final Ll/֫۫֫;
.super Ljava/lang/Object;
.source "H8RW"


# direct methods
.method public static ֫(IILl/ᩳᩴ֫;)I
    .locals 3

    const/16 v0, 0xa

    :goto_0
    if-lez v0, :cond_2

    .line 625
    invoke-static {v0}, Ll/ۘ֨֫;->ۧ(I)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 629
    :cond_0
    new-instance v2, Landroid/media/AudioFormat$Builder;

    invoke-direct {v2}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 631
    invoke-virtual {v2, p0}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v2

    .line 632
    invoke-virtual {v2, p1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v2

    .line 633
    invoke-virtual {v2, v1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v1

    .line 634
    invoke-virtual {v1}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v1

    .line 636
    invoke-virtual {p2}, Ll/ᩳᩴ֫;->֫()Ll/ܽᩴ֫;

    move-result-object v2

    iget-object v2, v2, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    .line 635
    invoke-static {v1, v2}, Landroid/media/AudioTrack;->isDirectPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/ᩳᩴ֫;)Ll/ܳ۬ܺ;
    .locals 6

    .line 596
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    .line 597
    sget-object v1, Ll/ᩳ۫֫;->ܽ:Ll/ۢ۬ܺ;

    invoke-virtual {v1}, Ll/ۢ۬ܺ;->keySet()Ll/ۛ۬ܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 598
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v3}, Ll/ۘ֨֫;->֫(I)I

    move-result v5

    if-ge v4, v5, :cond_1

    goto :goto_0

    .line 602
    :cond_1
    new-instance v4, Landroid/media/AudioFormat$Builder;

    invoke-direct {v4}, Landroid/media/AudioFormat$Builder;-><init>()V

    const/16 v5, 0xc

    .line 604
    invoke-virtual {v4, v5}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v4

    .line 605
    invoke-virtual {v4, v3}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v3

    const v4, 0xbb80

    .line 606
    invoke-virtual {v3, v4}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v3

    .line 607
    invoke-virtual {v3}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v3

    .line 608
    invoke-virtual {p0}, Ll/ᩳᩴ֫;->֫()Ll/ܽᩴ֫;

    move-result-object v4

    iget-object v4, v4, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    .line 602
    invoke-static {v3, v4}, Landroid/media/AudioTrack;->isDirectPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 609
    invoke-virtual {v0, v2}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const/4 p0, 0x2

    .line 612
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 613
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method
