.class public final Ll/ۗۘ֫;
.super Ljava/lang/Object;
.source "N5WY"


# direct methods
.method public static ֫()Landroid/app/Notification$MediaStyle;
    .locals 1

    .line 565
    new-instance v0, Landroid/app/Notification$MediaStyle;

    invoke-direct {v0}, Landroid/app/Notification$MediaStyle;-><init>()V

    return-object v0
.end method

.method public static ֫(Landroid/app/Notification$MediaStyle;[ILl/ܳۧ;)Landroid/app/Notification$MediaStyle;
    .locals 0

    if-eqz p1, :cond_0

    .line 572
    invoke-static {p0, p1}, Ll/ۗۘ֫;->֫(Landroid/app/Notification$MediaStyle;[I)V

    :cond_0
    if-eqz p2, :cond_1

    .line 575
    invoke-virtual {p2}, Ll/ܳۧ;->ܽ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/session/MediaSession$Token;

    invoke-static {p0, p1}, Ll/ۗۘ֫;->֫(Landroid/app/Notification$MediaStyle;Landroid/media/session/MediaSession$Token;)V

    :cond_1
    return-object p0
.end method

.method public static ֫(Landroid/app/Notification$Builder;Landroid/app/Notification$MediaStyle;)V
    .locals 0

    .line 560
    invoke-virtual {p0, p1}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    return-void
.end method

.method public static ֫(Landroid/app/Notification$MediaStyle;Landroid/media/session/MediaSession$Token;)V
    .locals 0

    .line 587
    invoke-virtual {p0, p1}, Landroid/app/Notification$MediaStyle;->setMediaSession(Landroid/media/session/MediaSession$Token;)Landroid/app/Notification$MediaStyle;

    return-void
.end method

.method public static varargs ֫(Landroid/app/Notification$MediaStyle;[I)V
    .locals 0

    .line 582
    invoke-virtual {p0, p1}, Landroid/app/Notification$MediaStyle;->setShowActionsInCompactView([I)Landroid/app/Notification$MediaStyle;

    return-void
.end method
