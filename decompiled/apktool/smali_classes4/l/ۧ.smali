.class public abstract Ll/ۧ;
.super Landroid/os/Binder;
.source "43G9"

# interfaces
.implements Ll/ܽ;


# direct methods
.method public static ֫(Landroid/os/IBinder;)Ll/ܽ;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 51
    :cond_0
    sget-object v0, Ll/ܽ;->֫:Ljava/lang/String;

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 52
    instance-of v1, v0, Ll/ܽ;

    if-eqz v1, :cond_1

    .line 53
    check-cast v0, Ll/ܽ;

    return-object v0

    .line 55
    :cond_1
    new-instance v0, Ll/֫;

    invoke-direct {v0, p0}, Ll/֫;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
