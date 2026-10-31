.class public final synthetic Ll/᩵۫ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static $default$forEachRemaining(Ll/֡۫ᩴ;Ljava/util/function/LongConsumer;)V
    .locals 1

    .line 724
    :cond_0
    invoke-interface {p0, p1}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public static bridge synthetic $default$trySplit(Ll/֡۫ᩴ;)Ll/֨۫ᩴ;
    .locals 0

    .line 714
    invoke-interface {p0}, Ll/֡۫ᩴ;->trySplit()Ll/֡۫ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic $default$trySplit(Ll/֡۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 0

    .line 714
    invoke-interface {p0}, Ll/֡۫ᩴ;->trySplit()Ll/֡۫ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ll/֡۫ᩴ;Ljava/util/function/Consumer;)V
    .locals 2

    .line 762
    instance-of v0, p1, Ljava/util/function/LongConsumer;

    if-eqz v0, :cond_0

    .line 763
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ll/֡۫ᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void

    .line 766
    :cond_0
    sget-boolean v0, Ll/ܺۨᩴ;->a:Z

    if-nez v0, :cond_1

    .line 769
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ܿۨᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܿۨᩴ;-><init>(Ljava/util/function/Consumer;I)V

    invoke-interface {p0, v0}, Ll/֡۫ᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void

    .line 767
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)"

    invoke-static {p0, p1}, Ll/ܺۨᩴ;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static b(Ll/֡۫ᩴ;Ljava/util/function/Consumer;)Z
    .locals 2

    .line 739
    instance-of v0, p1, Ljava/util/function/LongConsumer;

    if-eqz v0, :cond_0

    .line 740
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result p0

    return p0

    .line 743
    :cond_0
    sget-boolean v0, Ll/ܺۨᩴ;->a:Z

    if-nez v0, :cond_1

    .line 746
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ܿۨᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܿۨᩴ;-><init>(Ljava/util/function/Consumer;I)V

    invoke-interface {p0, v0}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result p0

    return p0

    .line 744
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)"

    invoke-static {p0, p1}, Ll/ܺۨᩴ;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method
