.class public final synthetic Ll/᩵᩺ᩳ;
.super Ljava/lang/Object;
.source "G4ML"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩵᩺ᩳ;->᩸:I

    iput-object p2, p0, Ll/᩵᩺ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩵᩺ᩳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/᩵᩺ᩳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۙ֨ۘ;

    .line 12
    invoke-static {v1}, Ll/ۙ֨ۘ;->֫(Ll/ۙ֨ۘ;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Lbin/mt/plugin/api/util/AsyncTask;

    .line 18
    invoke-static {v1}, Lbin/mt/plugin/api/util/AsyncTask;->$r8$lambda$S4LNLbT6x8xqbc_isUtz5PdG91g(Lbin/mt/plugin/api/util/AsyncTask;)V

    return-void

    .line 21
    :pswitch_1
    check-cast v1, Ll/ᩴᩴ᩻;

    .line 24
    invoke-static {v1}, Ll/ᩴᩴ᩻;->֫(Ll/ᩴᩴ᩻;)V

    return-void

    .line 27
    :pswitch_2
    check-cast v1, Ll/ۗۡ֫;

    .line 30
    invoke-static {v1}, Ll/ۗۡ֫;->֫(Ll/ۗۡ֫;)V

    return-void

    .line 33
    :pswitch_3
    check-cast v1, Ll/ᩳ֫֫;

    .line 35
    sget v0, Ll/ᩳ֫֫;->᩶:I

    const/16 v0, 0x8

    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 0
    :pswitch_4
    check-cast v1, Landroid/view/View;

    .line 133
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "input_method"

    .line 134
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v2, 0x0

    .line 135
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void

    .line 0
    :pswitch_5
    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Ll/۬ܿ;->ۧ(Landroid/content/Context;)V

    return-void

    :pswitch_6
    check-cast v1, Ll/ܰ᩺ᩳ;

    invoke-virtual {v1}, Ll/ܰ᩺ᩳ;->ᩳ()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
