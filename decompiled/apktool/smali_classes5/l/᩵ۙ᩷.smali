.class public Ll/᩵ۙ᩷;
.super Ll/ۘۙ᩷;
.source "P8VQ"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    .line 33
    new-instance p1, Ll/ܶ᩷ۘ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    new-instance p1, Ll/ܶ᩷ۘ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    new-instance p1, Ll/ܶ᩷ۘ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 33
    new-instance p1, Ll/ܶ᩷ۘ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۙ᩷;[Z)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 76
    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_1

    .line 77
    aget-boolean v2, p1, v0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    shl-int/2addr v2, v0

    or-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 81
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

    .line 82
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 6

    .line 63
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1203a7

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f1203a8

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/CharSequence;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    .line 66
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    and-int/lit8 v5, v1, 0x1

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-array v2, v2, [Z

    aput-boolean v5, v2, v4

    aput-boolean v1, v2, v0

    .line 71
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 72
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    new-instance p1, Ll/ᩴۙ᩷;

    invoke-direct {p1, v2}, Ll/ᩴۙ᩷;-><init>([Z)V

    .line 73
    invoke-virtual {v0, v3, v2, p1}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    new-instance p1, Ll/۟ۢܳ;

    const/4 v1, 0x3

    invoke-direct {p1, v1, p0, v2}, Ll/۟ۢܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x7f12070a

    .line 74
    invoke-virtual {v0, v1, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v1, 0x0

    .line 84
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 85
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
