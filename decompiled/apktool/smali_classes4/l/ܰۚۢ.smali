.class public abstract Ll/ܰۚۢ;
.super Landroid/os/Binder;
.source "F993"

# interfaces
.implements Ll/۟ۚۢ;


# static fields
.field public static final synthetic ܿ:I


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const-string v0, "bin.mt.shell.IShizukuCommand"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 60
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_1

    .line 63
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_1
    if-eq p1, v1, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const v0, 0xffff9b

    if-eq p1, v0, :cond_2

    .line 96
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    .line 73
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    .line 71
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 84
    :cond_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 86
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    .line 88
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    .line 89
    move-object v0, p0

    check-cast v0, Ll/ܺ֨ۢ;

    invoke-virtual {v0, p2, p1, p4}, Ll/ܺ֨ۢ;->֫(ILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 90
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 193
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 194
    invoke-virtual {p1, p3, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 64
    :cond_4
    invoke-static {}, Landroid/system/Os;->getuid()I

    move-result p1

    .line 77
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 78
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    return v1
.end method
