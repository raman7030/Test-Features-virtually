.class public final Ll/ۗۘۧ;
.super Ljava/lang/Object;
.source "78L3"


# direct methods
.method public static ֫(JLjava/util/List;)[B
    .locals 2

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 87
    check-cast v1, Ll/᩶֡֫;

    invoke-virtual {v1}, Ll/᩶֡֫;->ۧ()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 41
    :cond_0
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v1, "c"

    .line 42
    invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "d"

    .line 43
    invoke-virtual {p2, v0, p0, p1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 44
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p0

    .line 45
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 46
    invoke-virtual {p0}, Landroid/os/Parcel;->marshall()[B

    move-result-object p1

    .line 47
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    return-object p1
.end method
