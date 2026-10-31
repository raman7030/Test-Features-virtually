.class public final Ll/۟᩻ۡ;
.super Ll/ܺۜۡ;
.source "98W2"


# instance fields
.field public ۧ:I


# direct methods
.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 1

    const/4 v0, 0x6

    .line 265
    invoke-direct {p0, v0}, Ll/ܺۜۡ;-><init>(I)V

    .line 266
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/۟᩻ۡ;->ۧ:I

    return-void
.end method

.method public static ֫(Ll/۟᩻ۡ;Ll/ۗܺ᩷;Landroid/widget/PopupWindow;Landroid/view/View;)V
    .locals 3

    .line 279
    invoke-virtual {p3}, Landroid/view/View;->getId()I

    move-result p3

    iget p0, p0, Ll/۟᩻ۡ;->ۧ:I

    sget-object v0, Ll/ۜ᩻ۡ;->֫:Ll/ۚۡ֫;

    const-string v0, "activity"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 30
    sput-object v0, Ll/᩹ᩴۡ;->ܽ:Ljava/lang/Runnable;

    const v1, 0x7f0a0399

    if-ne p3, v1, :cond_0

    .line 280
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 281
    sget-object p2, Ll/ۜ᩻ۡ;->֫:Ll/ۚۡ֫;

    invoke-virtual {p2, v0}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    .line 282
    invoke-virtual {p2, p1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;)V

    .line 283
    new-instance p3, Ll/ܰ᩻ۡ;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, p1, p3}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 289
    sget-object p2, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    .line 34
    new-instance p2, Ll/ܳ᩻ۡ;

    invoke-direct {p2, p1, p0}, Ll/ܳ᩻ۡ;-><init>(Ll/ۗܺ᩷;I)V

    .line 84
    invoke-virtual {p2}, Ll/۟ܶۡ;->᩻()V

    return-void

    :cond_0
    const v1, 0x7f0a039c

    if-ne p3, v1, :cond_3

    .line 88
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p3

    sget-object v1, Ll/᩹ᩴۡ;->֫:Ll/ۚۡ֫;

    invoke-static {}, Ll/᩹ᩴۡ;->ۧ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p3, v1, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object p3

    .line 89
    invoke-interface {p3}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->isWXAppInstalled()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p3}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->getWXAppSupportAPI()I

    move-result v1

    const v2, 0x22000001

    if-ge v1, v2, :cond_1

    goto :goto_0

    .line 280
    :cond_1
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 281
    sget-object p2, Ll/ۜ᩻ۡ;->֫:Ll/ۚۡ֫;

    invoke-virtual {p2, v0}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    .line 282
    invoke-virtual {p2, p1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;)V

    .line 283
    new-instance v0, Ll/ܰ᩻ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, p1, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 289
    sget-object p2, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    .line 94
    invoke-static {}, Ll/᩹ᩴۡ;->ۧ()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 95
    new-instance p2, Ll/᩻᩻ۡ;

    invoke-direct {p2, p1, p0, p3}, Ll/᩻᩻ۡ;-><init>(Ll/ۗܺ᩷;ILcom/tencent/mm/opensdk/openapi/IWXAPI;)V

    .line 130
    invoke-virtual {p2}, Ll/۟ܶۡ;->᩻()V

    return-void

    :cond_2
    :goto_0
    const-string p0, "\u8bf7\u5b89\u88c5\u6700\u65b0\u7248\u672c\u7684\u5fae\u4fe1\u5ba2\u6237\u7aef"

    .line 90
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    .line 133
    :cond_3
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 5

    .line 271
    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f120757

    .line 272
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 273
    new-instance v0, Ll/֡֡ۡ;

    invoke-direct {v0, p1}, Ll/֡֡ۡ;-><init>(Ll/ۗܺ᩷;)V

    return-void

    .line 276
    :cond_0
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0d016e

    .line 277
    invoke-virtual {p1, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    .line 278
    new-instance v2, Ll/ۨ᩻ۡ;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v0, v3}, Ll/ۨ᩻ۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, 0x7f0a0399

    .line 292
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f0a039c

    .line 293
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a039b

    .line 294
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 296
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 297
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    const v3, 0x3f333333    # 0.7f

    .line 298
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->alpha:F

    const/4 v3, 0x2

    .line 299
    invoke-virtual {p1, v3}, Landroid/view/Window;->addFlags(I)V

    .line 300
    invoke-virtual {p1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    const/4 v2, -0x1

    .line 302
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    const/4 v2, -0x2

    .line 303
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    const/4 v2, 0x1

    .line 304
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 305
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 306
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 307
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    const v1, 0x7f130188

    .line 308
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 309
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x51

    invoke-virtual {v0, v1, v2, v4, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 311
    new-instance v1, Ll/᩺᩻ۡ;

    invoke-direct {v1, p1}, Ll/᩺᩻ۡ;-><init>(Landroid/view/Window;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method
