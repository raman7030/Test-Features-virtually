.class public final synthetic Ll/ۖ۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:[Ljava/lang/String;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:[I


# direct methods
.method public synthetic constructor <init>(Ll/᩸۫ܿ;Ll/ۗܺ᩷;[I[Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۖ۫ܿ;->᩸:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۖ۫ܿ;->᩹:[I

    iput-object p4, p0, Ll/ۖ۫ܿ;->᩶:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 2
    iget-object p1, p0, Ll/ۖ۫ܿ;->᩸:Ll/ۗܺ᩷;

    .line 148
    iget-object v0, p0, Ll/ۖ۫ܿ;->᩹:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    iget-object v2, p0, Ll/ۖ۫ܿ;->᩶:[Ljava/lang/String;

    aget-object v1, v2, v1

    if-nez v0, :cond_0

    .line 781
    invoke-static {}, Ll/֫ۚۢ;->ۜ()Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/۠ۘۢ;->ᩳ()Z

    move-result v2

    .line 306
    :goto_0
    invoke-static {v0, v1, v2}, Ll/᩸۫ܿ;->֫(ILjava/lang/String;Z)Z

    move-result v0

    const v2, 0x7f120848

    if-nez v0, :cond_1

    .line 307
    invoke-static {v2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_1
    const v0, 0x7f0d00e9

    .line 311
    :try_start_0
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v3, 0x7f0a046f

    .line 312
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f0a0471

    .line 313
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/high16 v5, 0x435c0000    # 220.0f

    .line 314
    invoke-static {v5}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v5

    invoke-static {v5, v1}, Ll/᩸۫ܿ;->֫(ILjava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 315
    invoke-static {v4, v1}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 316
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const p1, 0x7f120847

    .line 317
    invoke-virtual {v1, p1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 318
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 319
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 320
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;
    :try_end_0
    .catch Ll/ۢ۠ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 322
    :catch_0
    invoke-static {v2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method
