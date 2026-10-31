.class public Ll/۬᩶᩷;
.super Ll/ۘۙ᩷;
.source "K6KF"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    new-instance p2, Ll/ۜ᩸ܽ;

    invoke-direct {p2, p1}, Ll/ۜ᩸ܽ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method private ֫(Ll/ۗܺ᩷;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 48
    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p3, 0x2

    if-ne p4, p3, :cond_0

    .line 59
    new-instance p3, Ll/ۗ᩶᩷;

    invoke-direct {p3, p0, p1}, Ll/ۗ᩶᩷;-><init>(Ll/۬᩶᩷;Ll/ۗܺ᩷;)V

    const p4, 0x7f120054

    .line 71
    invoke-virtual {p3, p4}, Ll/۬ۗܿ;->ۡ(I)V

    const p4, 0x7f120058

    .line 72
    invoke-virtual {p3, p4}, Ll/۬ۗܿ;->ۜ(I)V

    const p4, 0x7f12072e

    .line 73
    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    const p1, 0x80001

    .line 74
    invoke-virtual {p3, p1}, Ll/۬ۗܿ;->ܿ(I)V

    .line 75
    invoke-virtual {p3, p2}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {p3}, Ll/۬ۗܿ;->֫()V

    const/4 p1, 0x1

    .line 205
    invoke-virtual {p3, p1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    :cond_0
    if-nez p4, :cond_1

    const-string p1, ""

    goto :goto_0

    :cond_1
    const-string p1, "com.android.vending"

    .line 52
    :goto_0
    invoke-static {p1}, Ll/ۨ֡ܿ;->ۧ(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    return-void
.end method

.method public static synthetic ֫(Ll/۬᩶᩷;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    return-void
.end method

.method public static synthetic ֫(Ll/۬᩶᩷;Ll/ۗܺ᩷;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/۬᩶᩷;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 5

    .line 21
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "ais"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120aa3

    .line 41
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120055

    .line 42
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f12021d

    .line 43
    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "com.android.vending"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    .line 45
    :goto_0
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    const v4, 0x7f120054

    invoke-virtual {v3, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    const v4, 0x7f0d0077

    .line 46
    invoke-virtual {v3, v4}, Ll/᩵ۚۢ;->ܽ(I)V

    new-instance v4, Ll/ۙ᩶᩷;

    invoke-direct {v4, p0, p1, v0}, Ll/ۙ᩶᩷;-><init>(Ll/۬᩶᩷;Ll/ۗܺ᩷;Ljava/lang/String;)V

    .line 47
    invoke-virtual {v3, v1, v2, v4}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 55
    invoke-virtual {v3, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
