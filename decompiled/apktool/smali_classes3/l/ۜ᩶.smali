.class public final Ll/ۜ᩶;
.super Ll/ۡ᩶;
.source "N5WY"


# instance fields
.field public ۧ:Ljava/lang/CharSequence;


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$BigTextStyle"

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 3536
    invoke-static {p1}, Ll/᩷᩶;->ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩶;->ۧ:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ֫(Ll/ܿ᩶;)V
    .locals 1

    .line 3554
    check-cast p1, Ll/۠᩶;

    invoke-virtual {p1}, Ll/۠᩶;->֫()Landroid/app/Notification$Builder;

    move-result-object p1

    .line 3555
    new-instance v0, Landroid/app/Notification$BigTextStyle;

    invoke-direct {v0, p1}, Landroid/app/Notification$BigTextStyle;-><init>(Landroid/app/Notification$Builder;)V

    const/4 p1, 0x0

    .line 3557
    invoke-virtual {v0, p1}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    .line 3558
    iget-object v0, p0, Ll/ۜ᩶;->ۧ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    return-void
.end method
