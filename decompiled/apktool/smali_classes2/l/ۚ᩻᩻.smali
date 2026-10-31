.class public final synthetic Ll/ۚ᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۙ᩻᩻;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ᩻᩻;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩻᩻;->᩸:Ll/ۙ᩻᩻;

    iput-object p2, p0, Ll/ۚ᩻᩻;->᩹:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    const p1, 0x7f0d00dd

    .line 209
    iget-object v0, p0, Ll/ۚ᩻᩻;->᩹:Ll/ۗܺ᩷;

    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    .line 210
    new-instance v3, Ll/֡᩻᩻;

    const v1, 0x7f0a0409

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {v3, v1}, Ll/֡᩻᩻;-><init>(Landroid/view/View;)V

    .line 211
    new-instance v4, Ll/֡᩻᩻;

    const v1, 0x7f0a040a

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {v4, v1}, Ll/֡᩻᩻;-><init>(Landroid/view/View;)V

    .line 212
    new-instance v5, Ll/֡᩻᩻;

    const v1, 0x7f0a040b

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {v5, v1}, Ll/֡᩻᩻;-><init>(Landroid/view/View;)V

    .line 213
    new-instance v6, Ll/֡᩻᩻;

    const v1, 0x7f0a040c

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {v6, v1}, Ll/֡᩻᩻;-><init>(Landroid/view/View;)V

    .line 214
    new-instance v7, Ll/֡᩻᩻;

    const v1, 0x7f0a040d

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {v7, v1}, Ll/֡᩻᩻;-><init>(Landroid/view/View;)V

    .line 215
    iget-object v2, p0, Ll/ۚ᩻᩻;->᩸:Ll/ۙ᩻᩻;

    iget-boolean v1, v2, Ll/ۗ᩻᩻;->᩸:Z

    .line 284
    iget-object v8, v3, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    invoke-virtual {v8, v1}, Ll/ۗۘ;->setChecked(Z)V

    .line 216
    iget-boolean v1, v2, Ll/ۗ᩻᩻;->۫:Z

    .line 284
    iget-object v9, v4, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    invoke-virtual {v9, v1}, Ll/ۗۘ;->setChecked(Z)V

    .line 217
    iget-boolean v1, v2, Ll/ۗ᩻᩻;->ۨ:Z

    .line 284
    iget-object v9, v5, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    invoke-virtual {v9, v1}, Ll/ۗۘ;->setChecked(Z)V

    .line 218
    iget-object v1, v2, Ll/ۗ᩻᩻;->ۙ:Ljava/lang/String;

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v1, v10, v11

    const v1, 0x7f120470

    invoke-virtual {v0, v1, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 300
    iget-object v10, v6, Ll/֡᩻᩻;->ܽ:Landroid/widget/TextView;

    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    iget v1, v2, Ll/ۗ᩻᩻;->ۤ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v1, v9, v11

    const v1, 0x7f12052a

    invoke-virtual {v0, v1, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 300
    iget-object v9, v7, Ll/֡᩻᩻;->ܽ:Landroid/widget/TextView;

    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    new-instance v1, Ll/֨᩻᩻;

    invoke-direct {v1, v4, v5, v6, v7}, Ll/֨᩻᩻;-><init>(Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;)V

    .line 288
    invoke-virtual {v8, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 289
    invoke-virtual {v8}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v8, v9}, Ll/֨᩻᩻;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    .line 226
    new-instance v1, Ll/۠᩻᩻;

    invoke-direct {v1, v2, v6, v0}, Ll/۠᩻᩻;-><init>(Ll/ۙ᩻᩻;Ll/֡᩻᩻;Ll/ۗܺ᩷;)V

    .line 293
    iget-object v8, v6, Ll/֡᩻᩻;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {v8, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 294
    iget-object v1, v6, Ll/֡᩻᩻;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 295
    invoke-virtual {v8, v11}, Landroid/view/View;->setClickable(Z)V

    .line 234
    :cond_0
    new-instance v1, Ll/ܶ᩻᩻;

    invoke-direct {v1, v2, v7, v0}, Ll/ܶ᩻᩻;-><init>(Ll/ۙ᩻᩻;Ll/֡᩻᩻;Ll/ۗܺ᩷;)V

    .line 293
    iget-object v8, v7, Ll/֡᩻᩻;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {v8, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 294
    iget-object v1, v7, Ll/֡᩻᩻;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 295
    invoke-virtual {v8, v11}, Landroid/view/View;->setClickable(Z)V

    .line 242
    :cond_1
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance p1, Ll/᩸᩻᩻;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Ll/᩸᩻᩻;-><init>(Ll/ۙ᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;)V

    const v1, 0x7f12070a

    .line 243
    invoke-virtual {v0, v1, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v1, 0x0

    .line 255
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 256
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
