.class public final synthetic Ll/ۚ᩺ܿ;
.super Ljava/lang/Object;
.source "44R4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/֡ۚۢ;

.field public final synthetic ᩶:Ll/ۜܰܿ;

.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:Landroid/widget/CheckBox;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/CheckBox;Ll/ۜܰܿ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩺ܿ;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/ۚ᩺ܿ;->᩹:Landroid/widget/CheckBox;

    iput-object p3, p0, Ll/ۚ᩺ܿ;->᩶:Ll/ۜܰܿ;

    iput-object p4, p0, Ll/ۚ᩺ܿ;->ۙ:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 44
    iget-object p1, p0, Ll/ۚ᩺ܿ;->᩸:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 45
    iget-object v0, p0, Ll/ۚ᩺ܿ;->᩹:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    :goto_0
    const/4 v1, 0x0

    .line 48
    :try_start_0
    invoke-static {p1, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_2

    .line 934
    iget-object v0, p0, Ll/ۚ᩺ܿ;->᩶:Ll/ۜܰܿ;

    iget-object v2, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->ᩳ()I

    move-result v2

    if-le p1, v2, :cond_1

    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v0, p1}, Ll/ۜܰܿ;->ۧ(I)V

    .line 58
    iget-object p1, p0, Ll/ۚ᩺ܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void

    :cond_2
    :goto_1
    const p1, 0x7f12030d

    .line 54
    invoke-static {p1, v1}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    return-void

    :catch_0
    const p1, 0x7f120b48

    .line 50
    invoke-static {p1, v1}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    return-void
.end method
