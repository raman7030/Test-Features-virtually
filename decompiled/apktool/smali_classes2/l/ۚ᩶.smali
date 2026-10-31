.class public final Ll/ۚ᩶;
.super Ljava/lang/Object;
.source "J5UB"


# direct methods
.method public static ֫(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;
    .locals 0

    .line 787
    invoke-virtual {p0, p1}, Landroid/app/Notification$Action$Builder;->setContextual(Z)Landroid/app/Notification$Action$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;
    .locals 0

    .line 799
    invoke-virtual {p0, p1}, Landroid/app/Notification$Builder;->setBubbleMetadata(Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/app/Notification$Builder;Ljava/lang/Object;)Landroid/app/Notification$Builder;
    .locals 0

    .line 793
    check-cast p1, Landroid/content/LocusId;

    invoke-virtual {p0, p1}, Landroid/app/Notification$Builder;->setLocusId(Landroid/content/LocusId;)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;
    .locals 0

    .line 805
    invoke-virtual {p0, p1}, Landroid/app/Notification$Builder;->setAllowSystemGeneratedContextualActions(Z)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method
