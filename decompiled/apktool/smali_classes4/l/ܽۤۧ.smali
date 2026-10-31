.class public final Ll/ܽۤۧ;
.super Ljava/lang/Object;
.source "U6BG"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1723
    new-instance v0, Ll/ᩳۤۧ;

    invoke-direct {v0, p1}, Ll/ᩳۤۧ;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 1718
    new-instance p2, Ll/ᩳۤۧ;

    invoke-direct {p2, p1}, Ll/ᩳۤۧ;-><init>(Landroid/os/Parcel;)V

    return-object p2
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1728
    new-array p1, p1, [Ll/ᩳۤۧ;

    return-object p1
.end method
