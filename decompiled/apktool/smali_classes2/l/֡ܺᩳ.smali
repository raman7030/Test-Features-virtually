.class public abstract Ll/֡ܺᩳ;
.super Landroid/os/Binder;
.source "67BH"

# interfaces
.implements Ll/ۚܺᩳ;


# static fields
.field public static final synthetic ܿ:I


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const-string v0, "bin.mt.dstr.ipc.IJavaHookProbeAidlInterface"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 59
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_1

    .line 62
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_1
    if-eq p1, v1, :cond_7

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    .line 89
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 83
    :cond_2
    move-object p1, p0

    check-cast p1, Ll/᩸ܺᩳ;

    invoke-virtual {p1}, Ll/᩸ܺᩳ;->exit()V

    .line 84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 76
    :cond_3
    move-object p1, p0

    check-cast p1, Ll/᩸ܺᩳ;

    .line 45
    iget-object p1, p1, Ll/᩸ܺᩳ;->ܳ:Ll/᩹ܺᩳ;

    invoke-static {p1}, Ll/᩹ܺᩳ;->֫(Ll/᩹ܺᩳ;)Ljava/lang/Throwable;

    move-result-object p2

    const/4 p4, 0x0

    if-nez p2, :cond_4

    goto :goto_0

    .line 48
    :cond_4
    invoke-static {p1}, Ll/᩹ܺᩳ;->֫(Ll/᩹ܺᩳ;)Ljava/lang/Throwable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 49
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 50
    :cond_5
    invoke-static {p1}, Ll/᩹ܺᩳ;->֫(Ll/᩹ܺᩳ;)Ljava/lang/Throwable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p2

    .line 52
    :cond_6
    invoke-static {p1}, Ll/᩹ܺᩳ;->֫(Ll/᩹ܺᩳ;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    .line 53
    invoke-static {p1, p4}, Ll/᩹ܺᩳ;->֫(Ll/᩹ܺᩳ;Ljava/lang/Throwable;)V

    .line 54
    filled-new-array {p2, v0}, [Ljava/lang/String;

    move-result-object p4

    .line 77
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 78
    invoke-virtual {p3, p4}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return v1

    .line 69
    :cond_7
    move-object p1, p0

    check-cast p1, Ll/᩸ܺᩳ;

    invoke-virtual {p1}, Ll/᩸ܺᩳ;->ۡ()Z

    move-result p1

    .line 70
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 71
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1
.end method
