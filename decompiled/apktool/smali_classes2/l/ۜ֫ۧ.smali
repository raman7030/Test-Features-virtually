.class public final Ll/ۜ֫ۧ;
.super Ljava/lang/Object;
.source "D8R5"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 273
    new-instance v0, Ll/᩷֫ۧ;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, p1}, Ll/᩷֫ۧ;-><init>(I)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 278
    new-array p1, p1, [Ll/᩷֫ۧ;

    return-object p1
.end method
