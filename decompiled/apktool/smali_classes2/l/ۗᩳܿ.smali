.class public final synthetic Ll/ۗᩳܿ;
.super Ljava/lang/Object;
.source "J7R3"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Landroid/widget/Button;

.field public final synthetic ۙ:Ll/֡ܳܿ;

.field public final synthetic ۬:Ll/֡ۚۢ;

.field public final synthetic ᩶:Landroid/widget/FrameLayout;

.field public final synthetic ᩸:Ll/۫ᩳܿ;

.field public final synthetic ᩹:Landroid/widget/Spinner;


# direct methods
.method public synthetic constructor <init>(Ll/۫ᩳܿ;Landroid/widget/Spinner;Landroid/widget/FrameLayout;Ll/֡ܳܿ;Landroid/widget/Button;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗᩳܿ;->᩸:Ll/۫ᩳܿ;

    iput-object p2, p0, Ll/ۗᩳܿ;->᩹:Landroid/widget/Spinner;

    iput-object p3, p0, Ll/ۗᩳܿ;->᩶:Landroid/widget/FrameLayout;

    iput-object p4, p0, Ll/ۗᩳܿ;->ۙ:Ll/֡ܳܿ;

    iput-object p5, p0, Ll/ۗᩳܿ;->ۗ:Landroid/widget/Button;

    iput-object p6, p0, Ll/ۗᩳܿ;->۬:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 349
    iget-object p1, p0, Ll/ۗᩳܿ;->᩹:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    .line 350
    iget-object v0, p0, Ll/ۗᩳܿ;->᩸:Ll/۫ᩳܿ;

    iget-object v0, v0, Ll/۫ᩳܿ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛᩳܿ;

    .line 351
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "a"

    .line 352
    invoke-static {p1}, Ll/ۛᩳܿ;->ܽ(Ll/ۛᩳܿ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "b"

    .line 353
    invoke-static {p1}, Ll/ۛᩳܿ;->֫(Ll/ۛᩳܿ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const v1, 0x7f0a0442

    .line 354
    iget-object v2, p0, Ll/ۗᩳܿ;->᩶:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lbin/mt/plugin/api/ui/PluginView;

    if-eqz v2, :cond_1

    check-cast v1, Lbin/mt/plugin/api/ui/PluginView;

    .line 357
    :try_start_0
    invoke-virtual {p1}, Ll/ۛᩳܿ;->ܽ()Ll/ۤۤ;

    move-result-object v2

    iget-object v2, v2, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v2, Lbin/mt/plugin/api/editor/TextEditorFunction;

    invoke-interface {v1}, Lbin/mt/plugin/api/ui/PluginView;->getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Lbin/mt/plugin/api/editor/TextEditorFunction;->getOptionsData(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/json/JSONObject;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 363
    sget-object v2, Lbin/mt/plugin/api/editor/TextEditorFunction;->VALIDATION_FAILED:Lbin/mt/json/JSONObject;

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    if-eqz v1, :cond_1

    const-string v2, "c"

    .line 367
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 359
    invoke-virtual {p1}, Ll/ۛᩳܿ;->ܽ()Ll/ۤۤ;

    move-result-object p1

    iget-object p1, p1, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast p1, Ll/ܽܳ᩷;

    invoke-virtual {p1, v0}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 546
    iget-object v1, p0, Ll/ۗᩳܿ;->ۙ:Ll/֡ܳܿ;

    invoke-virtual {v1, v0, p1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 370
    :cond_1
    :goto_0
    new-instance v1, Ll/ۨᩳܿ;

    invoke-static {p1}, Ll/ۛᩳܿ;->ۧ(Ll/ۛᩳܿ;)Ll/ۤۤ;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Ll/ۨᩳܿ;-><init>(Lbin/mt/json/JSONObject;Ll/ۤۤ;)V

    const p1, 0x7f0a05cd

    .line 371
    iget-object v0, p0, Ll/ۗᩳܿ;->ۗ:Landroid/widget/Button;

    invoke-virtual {v0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const p1, 0x7f0a0397

    .line 372
    invoke-virtual {v0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v0, 0x0

    .line 373
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 374
    invoke-virtual {v1}, Ll/ۨᩳܿ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    iget-object p1, p0, Ll/ۗᩳܿ;->۬:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method
