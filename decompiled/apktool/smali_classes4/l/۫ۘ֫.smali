.class public final Ll/۫ۘ֫;
.super Ll/ۡ᩶;
.source "N5WY"


# instance fields
.field public ۧ:[I

.field public ܽ:Ll/ܳۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2697
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 139
    iput-object v0, p0, Ll/۫ۘ֫;->ۧ:[I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳۧ;)V
    .locals 0

    .line 171
    iput-object p1, p0, Ll/۫ۘ֫;->ܽ:Ll/ܳۧ;

    return-void
.end method

.method public final ֫(Ll/ܿ᩶;)V
    .locals 4

    .line 252
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 253
    invoke-interface {p1}, Ll/ܿ᩶;->֫()Landroid/app/Notification$Builder;

    move-result-object p1

    .line 255
    invoke-static {}, Ll/ۗۘ֫;->֫()Landroid/app/Notification$MediaStyle;

    move-result-object v0

    const/4 v1, 0x0

    .line 256
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    .line 254
    invoke-static {v0, v3, v1, v3, v2}, Ll/۬ۘ֫;->֫(Landroid/app/Notification$MediaStyle;Ljava/lang/CharSequence;ILandroid/app/PendingIntent;Ljava/lang/Boolean;)Landroid/app/Notification$MediaStyle;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۘ֫;->ۧ:[I

    iget-object v2, p0, Ll/۫ۘ֫;->ܽ:Ll/ܳۧ;

    invoke-static {v0, v1, v2}, Ll/ۗۘ֫;->֫(Landroid/app/Notification$MediaStyle;[ILl/ܳۧ;)Landroid/app/Notification$MediaStyle;

    move-result-object v0

    .line 253
    invoke-static {p1, v0}, Ll/ۗۘ֫;->֫(Landroid/app/Notification$Builder;Landroid/app/Notification$MediaStyle;)V

    return-void

    .line 259
    :cond_0
    invoke-interface {p1}, Ll/ܿ᩶;->֫()Landroid/app/Notification$Builder;

    move-result-object p1

    .line 260
    invoke-static {}, Ll/ۗۘ֫;->֫()Landroid/app/Notification$MediaStyle;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۘ֫;->ۧ:[I

    iget-object v2, p0, Ll/۫ۘ֫;->ܽ:Ll/ܳۧ;

    invoke-static {v0, v1, v2}, Ll/ۗۘ֫;->֫(Landroid/app/Notification$MediaStyle;[ILl/ܳۧ;)Landroid/app/Notification$MediaStyle;

    move-result-object v0

    .line 259
    invoke-static {p1, v0}, Ll/ۗۘ֫;->֫(Landroid/app/Notification$Builder;Landroid/app/Notification$MediaStyle;)V

    return-void
.end method

.method public final varargs ֫([I)V
    .locals 0

    .line 162
    iput-object p1, p0, Ll/۫ۘ֫;->ۧ:[I

    return-void
.end method
