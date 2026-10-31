.class public Ll/ۤۗ᩷;
.super Ll/ۘۙ᩷;
.source "V6YU"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫֫()V

    .line 25
    new-instance p1, Ll/ۙܶ᩷;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0}, Ll/ۙܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۤۗ᩷;[Z)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 56
    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_1

    .line 57
    aget-boolean v2, p1, v0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    shl-int/2addr v2, v0

    or-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 62
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 8

    .line 44
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/۠᩸᩷;->֫(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x3

    new-array v4, v2, [Z

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    const/4 v6, 0x1

    shl-int v7, v6, v5

    and-int/2addr v7, v1

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    .line 48
    :goto_1
    aput-boolean v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 51
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/۬ۗ᩷;

    invoke-direct {v1, v4}, Ll/۬ۗ᩷;-><init>([Z)V

    .line 52
    invoke-virtual {p1, v0, v4, v1}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    const v0, 0x7f0d00fa

    .line 53
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ܽ(I)V

    new-instance v0, Ll/۫ۗ᩷;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, v4}, Ll/۫ۗ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x7f12070a

    .line 54
    invoke-virtual {p1, v1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 64
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 65
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    const v0, 0x7f0a0130

    .line 66
    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V

    return-void
.end method
