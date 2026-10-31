.class public final Ll/۠֡᩷;
.super Ll/۬ۗܿ;
.source "C5P7"


# instance fields
.field public final synthetic ۟:Ll/ܶ֡᩷;


# direct methods
.method public constructor <init>(Ll/ܶ֡᩷;Ll/ܶ֡᩷;)V
    .locals 0

    .line 161
    iput-object p1, p0, Ll/۠֡᩷;->۟:Ll/ܶ֡᩷;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 6

    .line 165
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/۠֡᩷;->۟:Ll/ܶ֡᩷;

    if-eqz v1, :cond_0

    const v0, 0x7f120090

    .line 167
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 169
    :cond_0
    invoke-static {v2, v0}, Ll/ܶ֡᩷;->֫(Ll/ܶ֡᩷;Ljava/lang/String;)V

    .line 170
    invoke-static {v2}, Ll/ܶ֡᩷;->ۧ(Ll/ܶ֡᩷;)[Landroid/widget/TextView;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    .line 171
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 173
    :cond_1
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "font_viewer_displayed_text"

    invoke-static {v2}, Ll/ܶ֡᩷;->֫(Ll/ܶ֡᩷;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 174
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
