.class public final Ll/֨ᩳ;
.super Ljava/lang/Object;
.source "TB8W"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 4

    const-string v0, "inParcel"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    new-instance v0, Ll/۠ᩳ;

    .line 54
    const-class v1, Landroid/content/IntentSender;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v1, Landroid/content/IntentSender;

    .line 55
    const-class v2, Landroid/content/Intent;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 53
    invoke-direct {v0, v1, v2, v3, p1}, Ll/۠ᩳ;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 172
    new-array p1, p1, [Ll/۠ᩳ;

    return-object p1
.end method
