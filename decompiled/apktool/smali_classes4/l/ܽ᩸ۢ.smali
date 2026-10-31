.class public final synthetic Ll/ܽ᩸ۢ;
.super Ljava/lang/Object;
.source "Y9AZ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Runnable;

.field public final synthetic ᩸:Z

.field public final synthetic ᩹:Ll/ۖ᩸ۢ;


# direct methods
.method public synthetic constructor <init>(ZLl/ۖ᩸ۢ;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/ܽ᩸ۢ;->᩸:Z

    iput-object p2, p0, Ll/ܽ᩸ۢ;->᩹:Ll/ۖ᩸ۢ;

    iput-object p3, p0, Ll/ܽ᩸ۢ;->᩶:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 114
    iget-boolean p1, p0, Ll/ܽ᩸ۢ;->᩸:Z

    if-nez p1, :cond_0

    const p1, 0x7f120a3a

    .line 115
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(I)V

    .line 116
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "term_ex_skip"

    iget-object v0, p0, Ll/ܽ᩸ۢ;->᩹:Ll/ۖ᩸ۢ;

    iget v0, v0, Ll/ۖ᩸ۢ;->ᩳ:I

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 118
    :cond_0
    iget-object p1, p0, Ll/ܽ᩸ۢ;->᩶:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
