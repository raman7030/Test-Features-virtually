.class public final Ll/ܽۢ;
.super Ljava/lang/Object;
.source "P55W"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 615
    new-instance v0, Ll/ᩳۢ;

    .line 597
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 598
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Ll/ᩳۢ;->᩸:I

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 620
    new-array p1, p1, [Ll/ᩳۢ;

    return-object p1
.end method
