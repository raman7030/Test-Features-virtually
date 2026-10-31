.class public final Ll/ܺ֫;
.super Ljava/lang/Object;
.source "04ZB"


# direct methods
.method public static ֫(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;
    .locals 1

    .line 1587
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1588
    invoke-interface {p1, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/os/Parcel;Landroid/os/Parcelable;I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 1596
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1597
    invoke-interface {p1, p0, p2}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 1599
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
