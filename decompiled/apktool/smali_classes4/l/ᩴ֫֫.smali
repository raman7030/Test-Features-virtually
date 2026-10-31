.class public final Ll/ᩴ֫֫;
.super Ljava/lang/Object;
.source "E6AF"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 2481
    new-instance v0, Ll/᩵֫֫;

    .line 2459
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 2460
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Ll/᩵֫֫;->᩸:I

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2486
    new-array p1, p1, [Ll/᩵֫֫;

    return-object p1
.end method
