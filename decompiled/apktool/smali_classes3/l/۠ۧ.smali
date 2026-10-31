.class public final Ll/۠ۧ;
.super Ljava/lang/Object;
.source "25NL"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    .line 153
    new-instance v0, Ll/᩸ۧ;

    .line 140
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    sget v1, Ll/ۚۧ;->ܿ:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 38
    :cond_0
    sget-object v1, Ll/֨ۧ;->ۧ:Ljava/lang/String;

    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 39
    instance-of v2, v1, Ll/֨ۧ;

    if-eqz v2, :cond_1

    .line 40
    move-object p1, v1

    check-cast p1, Ll/֨ۧ;

    goto :goto_0

    .line 42
    :cond_1
    new-instance v1, Ll/֡ۧ;

    invoke-direct {v1, p1}, Ll/֡ۧ;-><init>(Landroid/os/IBinder;)V

    move-object p1, v1

    .line 145
    :goto_0
    iput-object p1, v0, Ll/᩸ۧ;->᩸:Ll/֨ۧ;

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 157
    new-array p1, p1, [Ll/᩸ۧ;

    return-object p1
.end method
