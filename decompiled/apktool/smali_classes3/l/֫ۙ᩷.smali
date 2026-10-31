.class public abstract Ll/֫ۙ᩷;
.super Ll/ۗܺ᩷;
.source "S54T"


# static fields
.field public static final ܳۧ:Ljava/util/HashSet;

.field public static final synthetic ܿۧ:I


# instance fields
.field public final ᩳۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "bottom_toolbar_padding_type"

    const-string v1, "keep_in_editor_options"

    .line 25
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 201
    invoke-static {v1}, Ll/ܶۛܺ;->֫(I)Ljava/util/HashSet;

    move-result-object v1

    .line 202
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 25
    sput-object v1, Ll/֫ۙ᩷;->ܳۧ:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 34
    iput p1, p0, Ll/֫ۙ᩷;->ᩳۧ:I

    .line 35
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩵()V

    return-void
.end method

.method public static bridge synthetic ۨ()Ljava/util/HashSet;
    .locals 1

    .line 0
    sget-object v0, Ll/֫ۙ᩷;->ܳۧ:Ljava/util/HashSet;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 40
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f120949

    .line 41
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const v0, 0x7f0d0045

    .line 42
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const v0, 0x7f0a063a

    .line 43
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۢᩴ;

    iput-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 44
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 45
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 46
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v1, Ll/ܰ᩶᩷;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ܰ᩶᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    if-nez p1, :cond_1

    .line 48
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "layoutID"

    .line 49
    iget v1, p0, Ll/֫ۙ᩷;->ᩳۧ:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 53
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "scrollTo"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    :cond_0
    new-instance v0, Ll/۟᩶᩷;

    invoke-direct {v0}, Ll/۟᩶᩷;-><init>()V

    .line 58
    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->setArguments(Landroid/os/Bundle;)V

    .line 59
    invoke-virtual {p0}, Ll/֡᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۚۜ֫;->ۧ()Ll/ܽ᩷֫;

    move-result-object p1

    const v1, 0x7f0a0281

    const/4 v2, 0x0

    .line 349
    invoke-virtual {p1, v1, v0, v2}, Ll/ܽ᩷֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p1}, Ll/ܽ᩷֫;->ۧ()I

    :cond_1
    return-void
.end method

.method public ֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/۟᩶᩷;Ll/֫᩸ۧ;Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
