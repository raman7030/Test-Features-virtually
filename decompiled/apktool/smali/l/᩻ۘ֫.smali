.class public final Ll/᩻ۘ֫;
.super Ljava/lang/Object;
.source "X6AW"


# instance fields
.field public ֫:Landroid/service/media/MediaBrowserService$Result;


# direct methods
.method public constructor <init>(Landroid/service/media/MediaBrowserService$Result;)V
    .locals 0

    .line 1203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1204
    iput-object p1, p0, Ll/᩻ۘ֫;->֫:Landroid/service/media/MediaBrowserService$Result;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 5

    .line 1208
    instance-of v0, p1, Ljava/util/List;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/᩻ۘ֫;->֫:Landroid/service/media/MediaBrowserService$Result;

    if-eqz v0, :cond_1

    .line 1209
    check-cast p1, Ljava/util/List;

    .line 1229
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1230
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcel;

    .line 1231
    invoke-virtual {v3, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1232
    sget-object v4, Landroid/media/browse/MediaBrowser$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v3}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/browse/MediaBrowser$MediaItem;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1233
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    goto :goto_0

    .line 1209
    :cond_0
    invoke-virtual {v2, v0}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    return-void

    .line 1210
    :cond_1
    instance-of v0, p1, Landroid/os/Parcel;

    if-eqz v0, :cond_2

    .line 1211
    check-cast p1, Landroid/os/Parcel;

    .line 1212
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1213
    sget-object v0, Landroid/media/browse/MediaBrowser$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    .line 1214
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_2
    const/4 p1, 0x0

    .line 1217
    invoke-virtual {v2, p1}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    return-void
.end method
