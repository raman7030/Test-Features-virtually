.class public final synthetic Ll/ۖܳۢ;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/ۗܺ᩷;

.field public final synthetic ۙ:Landroid/widget/EditText;

.field public final synthetic ۛ:Z

.field public final synthetic ۤ:Ljava/util/ArrayList;

.field public final synthetic ۫:Ljava/lang/String;

.field public final synthetic ۬:Landroid/widget/Spinner;

.field public final synthetic ᩶:Landroid/widget/RadioButton;

.field public final synthetic ᩸:Ll/۟ܳۢ;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܳۢ;Ll/֡ۚۢ;Landroid/widget/RadioButton;Landroid/widget/EditText;Ll/ۗܺ᩷;Landroid/widget/Spinner;Ljava/lang/String;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܳۢ;->᩸:Ll/۟ܳۢ;

    iput-object p2, p0, Ll/ۖܳۢ;->᩹:Ll/֡ۚۢ;

    iput-object p3, p0, Ll/ۖܳۢ;->᩶:Landroid/widget/RadioButton;

    iput-object p4, p0, Ll/ۖܳۢ;->ۙ:Landroid/widget/EditText;

    iput-object p5, p0, Ll/ۖܳۢ;->ۗ:Ll/ۗܺ᩷;

    iput-object p6, p0, Ll/ۖܳۢ;->۬:Landroid/widget/Spinner;

    iput-object p7, p0, Ll/ۖܳۢ;->۫:Ljava/lang/String;

    iput-object p8, p0, Ll/ۖܳۢ;->ۤ:Ljava/util/ArrayList;

    iput-boolean p9, p0, Ll/ۖܳۢ;->ۛ:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1046
    iget-object p1, p0, Ll/ۖܳۢ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 1048
    iget-object p1, p0, Ll/ۖܳۢ;->᩶:Landroid/widget/RadioButton;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, ""

    :cond_0
    :goto_0
    move-object v6, p1

    goto :goto_1

    .line 1051
    :cond_1
    iget-object p1, p0, Ll/ۖܳۢ;->ۙ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x2e

    const/16 v1, 0x2f

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    const-string v0, "/"

    .line 1052
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    .line 1053
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 1054
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1055
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 1058
    :goto_1
    new-instance p1, Ll/ۨܳۢ;

    iget-object v1, p0, Ll/ۖܳۢ;->᩸:Ll/۟ܳۢ;

    iget-object v2, p0, Ll/ۖܳۢ;->ۗ:Ll/ۗܺ᩷;

    iget-object v3, p0, Ll/ۖܳۢ;->۬:Landroid/widget/Spinner;

    iget-object v4, p0, Ll/ۖܳۢ;->۫:Ljava/lang/String;

    iget-object v5, p0, Ll/ۖܳۢ;->ۤ:Ljava/util/ArrayList;

    iget-boolean v7, p0, Ll/ۖܳۢ;->ۛ:Z

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Ll/ۨܳۢ;-><init>(Ll/۟ܳۢ;Ll/ۗܺ᩷;Landroid/widget/Spinner;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Z)V

    .line 1137
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
