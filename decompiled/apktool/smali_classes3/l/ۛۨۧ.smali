.class public Ll/ۛۨۧ;
.super Ll/۫ۨۧ;
.source "01O7"


# static fields
.field public static ᩷:Z = true


# virtual methods
.method public ֫(Landroid/view/View;I)V
    .locals 2

    .line 39
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    .line 40
    invoke-super {p0, p1, p2}, Ll/᩶ۨۧ;->֫(Landroid/view/View;I)V

    return-void

    .line 42
    :cond_0
    sget-boolean v0, Ll/ۛۨۧ;->᩷:Z

    if-eqz v0, :cond_1

    .line 46
    :try_start_0
    invoke-static {p1, p2}, Ll/ۤۨۧ;->֫(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 48
    sput-boolean p1, Ll/ۛۨۧ;->᩷:Z

    :cond_1
    return-void
.end method
