.class public Ll/ܺۙ᩷;
.super Ll/ۘۙ᩷;
.source "Z11M"


# instance fields
.field public ۤ֫:Ll/ۛ᩵᩷;

.field public ۫֫:Ll/۬ۗܿ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-direct {p0}, Ll/ܺۙ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-direct {p0}, Ll/ܺۙ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-direct {p0}, Ll/ܺۙ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 41
    invoke-direct {p0}, Ll/ܺۙ᩷;->ۢ֫()V

    return-void
.end method

.method public static ֫(Ll/ܺۙ᩷;)V
    .locals 7

    .line 98
    iget-object v0, p0, Ll/ܺۙ᩷;->ۤ֫:Ll/ۛ᩵᩷;

    iget-object p0, p0, Ll/ܺۙ᩷;->۫֫:Ll/۬ۗܿ;

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const v2, 0x7f120a1b

    const/4 v4, 0x0

    .line 1630
    invoke-virtual/range {v0 .. v6}, Ll/ܶ᩵᩷;->֫(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܺۙ᩷;Ljava/lang/String;)V
    .locals 2

    .line 48
    iget-object v0, p0, Ll/ܺۙ᩷;->۫֫:Ll/۬ۗܿ;

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 0
    invoke-static {v1, v0, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 52
    :cond_0
    iget-object v0, p0, Ll/ܺۙ᩷;->۫֫:Ll/۬ۗܿ;

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 53
    iget-object p0, p0, Ll/ܺۙ᩷;->۫֫:Ll/۬ۗܿ;

    invoke-virtual {p0}, Ll/۬ۗܿ;->֡()V

    :cond_1
    return-void
.end method

.method private ۢ֫()V
    .locals 2

    .line 45
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    if-eqz v0, :cond_0

    .line 47
    new-instance v1, Ll/ᩳۜۢ;

    invoke-direct {v1, p0}, Ll/ᩳۜۢ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Ll/᩵֡᩷;->֫(Ll/ۗܺ᩷;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۙ᩷;->ۤ֫:Ll/ۛ᩵᩷;

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 3

    .line 61
    new-instance v0, Ll/ۡۙ᩷;

    invoke-direct {v0, p0, p1}, Ll/ۡۙ᩷;-><init>(Ll/ܺۙ᩷;Ll/ۗܺ᩷;)V

    .line 88
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ۧ(Ljava/lang/CharSequence;)V

    const/16 p1, 0x3e8

    .line 89
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ܳ(I)V

    .line 90
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/sdcard/MT2"

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x6

    .line 91
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 92
    invoke-virtual {v0}, Ll/۬ۗܿ;->֫()V

    .line 93
    invoke-virtual {v0}, Ll/۬ۗܿ;->֡()V

    iput-object v0, p0, Ll/ܺۙ᩷;->۫֫:Ll/۬ۗܿ;

    .line 95
    iget-object p1, p0, Ll/ܺۙ᩷;->ۤ֫:Ll/ۛ᩵᩷;

    if-eqz p1, :cond_0

    .line 96
    invoke-virtual {v0}, Ll/۬ۗܿ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    const/4 v0, 0x0

    .line 97
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 98
    new-instance v0, Ll/֫۫᩻;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/֫۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    :cond_0
    iget-object p1, p0, Ll/ܺۙ᩷;->۫֫:Ll/۬ۗܿ;

    const/4 v0, 0x1

    .line 205
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method
