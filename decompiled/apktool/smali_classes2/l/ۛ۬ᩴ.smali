.class public final synthetic Ll/ۛ۬ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static synthetic sort(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 1

    instance-of v0, p0, Ll/ۨ۬ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۨ۬ᩴ;

    invoke-interface {p0, p1}, Ll/ۨ۬ᩴ;->sort(Ljava/util/Comparator;)V

    return-void

    :cond_0
    invoke-static {p0, p1}, Ll/ۤ۬ᩴ;->$default$sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public static synthetic spliterator(Ljava/util/List;)Ll/ܶ۫ᩴ;
    .locals 1

    instance-of v0, p0, Ll/ۨ۬ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۨ۬ᩴ;

    invoke-interface {p0}, Ll/ۨ۬ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Ll/ۤ۬ᩴ;->$default$spliterator(Ljava/util/List;)Ll/ܶ۫ᩴ;

    move-result-object p0

    return-object p0
.end method
