.class public final Ll/ۛ۫ۡ;
.super Ljava/lang/Object;
.source "HB5A"


# direct methods
.method public static ֫(IILjava/util/List;)V
    .locals 1

    const/4 v0, 0x1

    if-gt p0, p1, :cond_0

    add-int/2addr p1, v0

    .line 12
    invoke-interface {p2, p0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    const/4 p1, -0x1

    invoke-static {p0, p1}, Ljava/util/Collections;->rotate(Ljava/util/List;I)V

    return-void

    :cond_0
    add-int/2addr p0, v0

    .line 14
    invoke-interface {p2, p1, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v0}, Ljava/util/Collections;->rotate(Ljava/util/List;I)V

    return-void
.end method

.method public static ֫(Ljava/util/List;Ljava/util/function/Predicate;)V
    .locals 0

    .line 19
    invoke-static {p0, p1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void
.end method
