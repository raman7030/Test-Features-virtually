.class public final Ll/ۢ۟ۧ;
.super Ljava/lang/Object;
.source "F1OQ"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    .line 423
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    .line 424
    new-instance v0, Ll/ۡ۟ۧ;

    invoke-direct {v0, p1, v2}, Ll/ۡ۟ۧ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 425
    :cond_0
    new-instance v0, Ll/ۡ۟ۧ;

    .line 397
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 407
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/ۡ۟ۧ;->᩶:I

    .line 408
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/ۡ۟ۧ;->᩹:I

    .line 409
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, v0, Ll/ۡ۟ۧ;->᩸:Landroid/os/Parcelable;

    return-object v0
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 2

    .line 423
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 424
    new-instance v0, Ll/ۡ۟ۧ;

    invoke-direct {v0, p1, p2}, Ll/ۡ۟ۧ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 425
    :cond_0
    new-instance p2, Ll/ۡ۟ۧ;

    .line 397
    invoke-direct {p2, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 407
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p2, Ll/ۡ۟ۧ;->᩶:I

    .line 408
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p2, Ll/ۡ۟ۧ;->᩹:I

    const/4 v0, 0x0

    .line 409
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, p2, Ll/ۡ۟ۧ;->᩸:Landroid/os/Parcelable;

    return-object p2
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 435
    new-array p1, p1, [Ll/ۡ۟ۧ;

    return-object p1
.end method
