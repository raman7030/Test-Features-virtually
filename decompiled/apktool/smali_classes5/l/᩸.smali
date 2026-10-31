.class public Ll/᩸;
.super Ll/᩸ۧ;
.source "95XT"


# virtual methods
.method public final ֫(ILandroid/os/Bundle;)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 1056
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1058
    :try_start_0
    invoke-virtual {p2}, Landroid/os/BaseBundle;->isEmpty()Z
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p2, v0

    :cond_0
    :goto_0
    if-nez p1, :cond_2

    if-eqz p2, :cond_2

    const-string p1, "search_results"

    .line 2328
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2332
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    .line 2341
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2335
    new-instance p2, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2336
    array-length v1, p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 2337
    check-cast v3, Ll/ܶ;

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 2339
    :cond_1
    throw v0

    .line 2329
    :cond_2
    throw v0
.end method
