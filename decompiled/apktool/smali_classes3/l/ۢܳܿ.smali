.class public final synthetic Ll/ۢܳܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۘܳܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۘܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܳܿ;->᩸:Ll/ۘܳܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget-object p1, p0, Ll/ۢܳܿ;->᩸:Ll/ۘܳܿ;

    .line 861
    iget-object p1, p1, Ll/ۘܳܿ;->ᩳ:Ll/ۗۘ;

    invoke-virtual {p1}, Ll/ۗۘ;->toggle()V

    .line 862
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    sget v0, Ll/۠ܳܿ;->֫:I

    .line 280
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "tfugh"

    invoke-interface {v0, v1, p1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 281
    invoke-static {}, Ll/۠ܳܿ;->ᩳ()V

    return-void
.end method
