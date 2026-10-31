.class public final Ll/ܿۧ;
.super Ljava/lang/Object;
.source "U6BF"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    .line 2117
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    .line 2121
    new-instance v1, Ll/ܳۧ;

    .line 1930
    invoke-direct {v1, p1, v0}, Ll/ܳۧ;-><init>(Ljava/lang/Object;Ll/ۖ֫;)V

    return-object v1
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2126
    new-array p1, p1, [Ll/ܳۧ;

    return-object p1
.end method
