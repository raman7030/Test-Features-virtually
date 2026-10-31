.class public final Ll/ۖۜ֫;
.super Ljava/lang/Object;
.source "O5NM"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 3543
    new-instance v0, Ll/ۘۜ֫;

    .line 3523
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3524
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۘۜ֫;->᩹:Ljava/lang/String;

    .line 3525
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Ll/ۘۜ֫;->᩸:I

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 3548
    new-array p1, p1, [Ll/ۘۜ֫;

    return-object p1
.end method
