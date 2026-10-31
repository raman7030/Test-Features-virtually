.class public final Ll/ܽۧ;
.super Ljava/lang/Object;
.source "U6BF"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 2329
    new-instance v0, Ll/ᩳۧ;

    .line 2321
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2322
    sget-object v1, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/ResultReceiver;

    iput-object p1, v0, Ll/ᩳۧ;->᩸:Landroid/os/ResultReceiver;

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2334
    new-array p1, p1, [Ll/ᩳۧ;

    return-object p1
.end method
