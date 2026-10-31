.class public final Ll/ܽۙ;
.super Ljava/lang/Object;
.source "P5TS"


# direct methods
.method public static ֫(Ljava/lang/Object;)I
    .locals 0

    .line 687
    check-cast p0, Landroid/app/RemoteInput;

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getEditChoicesBeforeSending()I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/app/RemoteInput$Builder;I)Landroid/app/RemoteInput$Builder;
    .locals 0

    .line 693
    invoke-virtual {p0, p1}, Landroid/app/RemoteInput$Builder;->setEditChoicesBeforeSending(I)Landroid/app/RemoteInput$Builder;

    move-result-object p0

    return-object p0
.end method
