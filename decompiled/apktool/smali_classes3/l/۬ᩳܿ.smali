.class public final Ll/۬ᩳܿ;
.super Ljava/lang/Object;
.source "J7R3"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ۗ:Lbin/mt/json/JSONObject;

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:Landroid/widget/FrameLayout;

.field public final synthetic ᩸:Ll/۫ᩳܿ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۫ᩳܿ;Landroid/widget/FrameLayout;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONObject;)V
    .locals 0

    .line 306
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ᩳܿ;->᩸:Ll/۫ᩳܿ;

    iput-object p2, p0, Ll/۬ᩳܿ;->᩶:Landroid/widget/FrameLayout;

    iput-object p3, p0, Ll/۬ᩳܿ;->ۙ:Ljava/lang/String;

    iput-object p4, p0, Ll/۬ᩳܿ;->᩹:Ljava/lang/String;

    iput-object p5, p0, Ll/۬ᩳܿ;->ۗ:Lbin/mt/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    .line 309
    iget-object p1, p0, Ll/۬ᩳܿ;->᩶:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    const p2, 0x7f0a0442

    const/4 p4, 0x0

    .line 310
    invoke-virtual {p1, p2, p4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 311
    iget-object p5, p0, Ll/۬ᩳܿ;->᩸:Ll/۫ᩳܿ;

    iget-object v0, p5, Ll/۫ᩳܿ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۛᩳܿ;

    .line 312
    invoke-virtual {p3}, Ll/ۛᩳܿ;->ܽ()Ll/ۤۤ;

    move-result-object v0

    .line 313
    new-instance v1, Ll/ᩳۢ᩷;

    iget-object v2, v0, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v2, Ll/ܽܳ᩷;

    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v2

    iget-object p5, p5, Ll/۫ᩳܿ;->᩻:Ll/֡ܳܿ;

    invoke-direct {v1, v2, p5}, Ll/ᩳۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/ۗܺ᩷;)V

    .line 314
    iget-object v2, p0, Ll/۬ᩳܿ;->ۙ:Ljava/lang/String;

    iget-object v3, p0, Ll/۬ᩳܿ;->᩹:Ljava/lang/String;

    invoke-virtual {p3, v2, v3}, Ll/ۛᩳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Ll/۬ᩳܿ;->ۗ:Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_0
    move-object p3, p4

    .line 316
    :goto_0
    :try_start_0
    iget-object v2, v0, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v2, Lbin/mt/plugin/api/editor/TextEditorFunction;

    invoke-interface {v2, v1, p3}, Lbin/mt/plugin/api/editor/TextEditorFunction;->buildOptionsView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/json/JSONObject;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 318
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 319
    check-cast p3, Ll/۟ۜ᩷;

    invoke-virtual {p3}, Ll/۟ۜ᩷;->֫()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 322
    iget-object p2, v0, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast p2, Ll/ܽܳ᩷;

    invoke-virtual {p2, p1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    .line 546
    invoke-virtual {p5, p1, p4}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 2

    .line 329
    iget-object p1, p0, Ll/۬ᩳܿ;->᩶:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    const v0, 0x7f0a0442

    const/4 v1, 0x0

    .line 330
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
