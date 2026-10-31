.class public final Ll/᩵۬ۧ;
.super Ljava/lang/Object;
.source "Y6A7"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 13295
    new-instance v0, Ll/֡۬ۧ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/֡۬ۧ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    .line 13290
    new-instance v0, Ll/֡۬ۧ;

    invoke-direct {v0, p1, p2}, Ll/֡۬ۧ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 13300
    new-array p1, p1, [Ll/֡۬ۧ;

    return-object p1
.end method
