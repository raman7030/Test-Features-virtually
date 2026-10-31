.class public abstract Ll/ۚۧ;
.super Landroid/os/Binder;
.source "05LV"

# interfaces
.implements Ll/֨ۧ;


# static fields
.field public static final synthetic ܿ:I


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    .line 51
    sget-object v0, Ll/֨ۧ;->ۧ:Ljava/lang/String;

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 52
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_1

    .line 55
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_1
    if-eq p1, v1, :cond_2

    .line 71
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 63
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 65
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 115
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-eqz p4, :cond_3

    .line 116
    invoke-interface {p3, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    .line 65
    :goto_0
    check-cast p2, Landroid/os/Bundle;

    .line 66
    move-object p3, p0

    check-cast p3, Ll/ܶۧ;

    invoke-virtual {p3, p1, p2}, Ll/ܶۧ;->֫(ILandroid/os/Bundle;)V

    return v1
.end method
