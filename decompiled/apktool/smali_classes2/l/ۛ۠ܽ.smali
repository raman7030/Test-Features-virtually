.class public final synthetic Ll/ۛ۠ܽ;
.super Ljava/lang/Object;
.source "097X"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/ܽۢܳ;

.field public final synthetic ᩶:Landroid/widget/CheckBox;

.field public final synthetic ᩸:Ll/۟ۜᩳ;

.field public final synthetic ᩹:Landroid/widget/CheckBox;


# direct methods
.method public synthetic constructor <init>(Ll/۟ۜᩳ;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/ܽۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ۠ܽ;->᩸:Ll/۟ۜᩳ;

    iput-object p2, p0, Ll/ۛ۠ܽ;->᩹:Landroid/widget/CheckBox;

    iput-object p3, p0, Ll/ۛ۠ܽ;->᩶:Landroid/widget/CheckBox;

    iput-object p4, p0, Ll/ۛ۠ܽ;->ۙ:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 340
    iget-object p1, p0, Ll/ۛ۠ܽ;->᩸:Ll/۟ۜᩳ;

    invoke-virtual {p1}, Ll/۟ۜᩳ;->֫()V

    .line 341
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p2}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p2

    const-string v0, "aciad"

    iget-object v1, p0, Ll/ۛ۠ܽ;->᩹:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    invoke-interface {p2, v0, v2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p2

    invoke-interface {p2}, Ll/۬ۤۡ;->apply()V

    .line 342
    iget-object p2, p0, Ll/ۛ۠ܽ;->᩶:Landroid/widget/CheckBox;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    sget v2, Ll/ܽ֨ᩳ;->᩶ۧ:I

    .line 1513
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "axml_id_2_name"

    .line 0
    invoke-static {v2, v3, v0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 343
    iget-object v0, p1, Ll/۟ۜᩳ;->֫:Ll/ܶ᩵ܿ;

    iget-object p1, p1, Ll/۟ۜᩳ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const v2, 0x7f1205b8

    const-string v3, "mtcr"

    .line 58
    iget-object v4, p0, Ll/ۛ۠ܽ;->ۙ:Ll/ܽۢܳ;

    invoke-static {v4, v2, v3}, Ll/᩻֡ܳ;->֫(Ll/ܽۢܳ;ILjava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 59
    sget v3, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v3, Ll/֨۠ۢ;

    const-class v4, Ll/ܰ۠ܽ;

    invoke-direct {v3, v4}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    const-string v4, "saveAsPath"

    .line 60
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "inputPath1"

    .line 61
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "inputPath2"

    .line 62
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "id2name"

    .line 63
    invoke-virtual {v3, p1, p2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    const-string p1, "ignoreAddOrDel"

    .line 64
    invoke-virtual {v3, p1, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 65
    invoke-virtual {v3}, Ll/֨۠ۢ;->֫()I

    return-void
.end method
