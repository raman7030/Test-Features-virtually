.class public final synthetic Ll/ᩴۙܽ;
.super Ljava/lang/Object;
.source "28VT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩸ۙܽ;

.field public final synthetic ᩹:Ll/۬ܿᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ۙܽ;Ll/۬ܿᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۙܽ;->᩸:Ll/᩸ۙܽ;

    iput-object p2, p0, Ll/ᩴۙܽ;->᩹:Ll/۬ܿᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 493
    iget-object v0, p0, Ll/ᩴۙܽ;->᩸:Ll/᩸ۙܽ;

    iget-object v5, v0, Ll/᩸ۙܽ;->᩹:Ll/᩹ۙܽ;

    new-instance v7, Ll/֨ۙܽ;

    invoke-direct {v7, v0}, Ll/֨ۙܽ;-><init>(Ll/᩸ۙܽ;)V

    const v0, 0x7f0d00be

    .line 267
    invoke-virtual {v5, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 268
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f120a0e

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a0479

    .line 270
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    const v2, 0x7f0a047a

    .line 271
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    const v3, 0x7f0a047b

    .line 272
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RadioButton;

    const/4 v4, 0x3

    new-array v6, v4, [Landroid/widget/RadioButton;

    const/4 v8, 0x0

    aput-object v1, v6, v8

    const/4 v1, 0x1

    aput-object v2, v6, v1

    const/4 v2, 0x2

    aput-object v3, v6, v2

    .line 274
    aget-object v3, v6, v8

    const v9, 0x7f12047f

    invoke-static {v9}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 275
    aget-object v1, v6, v1

    const v3, 0x7f120481

    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 276
    aget-object v1, v6, v2

    const v2, 0x7f120483

    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const v1, 0x7f0a017c

    .line 277
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/EditText;

    const v1, 0x7f0a05ef

    .line 278
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 279
    new-instance v2, Ll/ۚۤܿ;

    invoke-direct {v2, v6, v9, v1}, Ll/ۚۤܿ;-><init>([Landroid/widget/RadioButton;Landroid/widget/EditText;Landroid/widget/TextView;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v4, :cond_0

    .line 286
    aget-object v3, v6, v1

    .line 287
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 289
    :cond_0
    invoke-virtual {v5}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    .line 290
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    const/4 v3, 0x0

    .line 291
    invoke-virtual {v1, v0, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 292
    invoke-virtual {v1, v0, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 293
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v4

    .line 295
    iget-object v0, p0, Ll/ᩴۙܽ;->᩹:Ll/۬ܿᩳ;

    instance-of v1, v0, Ll/᩹ܿᩳ;

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    goto :goto_2

    .line 297
    :cond_1
    instance-of v1, v0, Ll/᩶ܿᩳ;

    if-eqz v1, :cond_2

    const v1, 0x7f120af3

    .line 299
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setHint(I)V

    const/4 v1, 0x1

    const/4 v3, 0x1

    goto :goto_2

    .line 300
    :cond_2
    instance-of v1, v0, Ll/ۙܿᩳ;

    if-nez v1, :cond_4

    instance-of v1, v0, Ll/۫ܿᩳ;

    if-eqz v1, :cond_3

    goto :goto_1

    .line 303
    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_4
    :goto_1
    const/4 v1, 0x2

    const/4 v3, 0x2

    .line 305
    :goto_2
    aget-object v1, v6, v3

    invoke-virtual {v2, v1}, Ll/ۚۤܿ;->onClick(Landroid/view/View;)V

    .line 306
    invoke-virtual {v4}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v10

    new-instance v11, Ll/֨ۤܿ;

    move-object v1, v11

    move-object v2, v6

    move-object v6, v0

    move-object v8, v9

    invoke-direct/range {v1 .. v8}, Ll/֨ۤܿ;-><init>([Landroid/widget/RadioButton;ILl/֡ۚۢ;Ll/ۗܺ᩷;Ll/۬ܿᩳ;Ll/֨ۙܽ;Landroid/widget/EditText;)V

    invoke-virtual {v10, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
