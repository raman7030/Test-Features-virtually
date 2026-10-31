.class public final Ll/᩺ۜ֫;
.super Ljava/lang/Object;
.source "J62A"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 118
    new-instance v0, Ll/ܰۜ֫;

    .line 96
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/ܰۜ֫;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 123
    new-array p1, p1, [Ll/ܰۜ֫;

    return-object p1
.end method
