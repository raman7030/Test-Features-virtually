.class public final Ll/ۗۛۧ;
.super Ljava/lang/Object;
.source "G5Y2"


# direct methods
.method public static ֫(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 1

    if-nez p1, :cond_0

    .line 2618
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 2620
    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2621
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object p1
.end method

.method public static ۧ(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    if-eqz p1, :cond_0

    .line 2633
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 2634
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    return-object p1
.end method
