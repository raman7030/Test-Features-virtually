.class public final Ll/ۚۘ;
.super Ljava/lang/Object;
.source "N5JQ"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 1349
    new-instance v0, Ll/֨ۘ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/֨ۘ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    .line 1344
    new-instance v0, Ll/֨ۘ;

    invoke-direct {v0, p1, p2}, Ll/֨ۘ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1354
    new-array p1, p1, [Ll/֨ۘ;

    return-object p1
.end method
