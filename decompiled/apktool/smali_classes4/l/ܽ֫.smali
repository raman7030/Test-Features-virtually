.class public final Ll/ܽ֫;
.super Ljava/lang/Object;
.source "757I"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 140
    new-instance v0, Ll/ܿ֫;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-direct {v0, p1, v1}, Ll/ܿ֫;-><init>(FI)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 145
    new-array p1, p1, [Ll/ܿ֫;

    return-object p1
.end method
