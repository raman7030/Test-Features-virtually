.class public final Ll/᩹ۡ;
.super Ljava/lang/Object;
.source "N5WL"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 665
    new-instance v0, Ll/᩶ۡ;

    .line 651
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 652
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Ll/᩶ۡ;->᩸:Z

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 670
    new-array p1, p1, [Ll/᩶ۡ;

    return-object p1
.end method
