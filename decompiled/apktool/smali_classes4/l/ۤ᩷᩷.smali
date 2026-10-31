.class public final Ll/ۤ᩷᩷;
.super Ll/ۢ᩷᩷;
.source "97PO"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;


# instance fields
.field public ֡:I

.field public ۘ:Z

.field public ۚ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

.field public ᩴ:I

.field public ᩵:I


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V
    .locals 1

    .line 22
    invoke-direct {p0, p1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    const/4 p1, 0x0

    .line 16
    iput p1, p0, Ll/ۤ᩷᩷;->᩵:I

    .line 17
    iput p1, p0, Ll/ۤ᩷᩷;->֡:I

    const/16 v0, 0x64

    .line 18
    iput v0, p0, Ll/ۤ᩷᩷;->ᩴ:I

    .line 19
    iput-boolean p1, p0, Ll/ۤ᩷᩷;->ۘ:Z

    .line 23
    sget-object p1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    iput-object p1, p0, Ll/ۤ᩷᩷;->ۚ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    .line 24
    iget-object p1, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    return-void
.end method


# virtual methods
.method public final alpha(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 331
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ᩷᩷;->ۧ:Ljava/lang/Float;

    return-object p0
.end method

.method public final background(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 293
    iput-object p1, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final enable(Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 325
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ᩷᩷;->ܿ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܺ:Ljava/lang/Object;

    return-object v0
.end method

.method public final height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    return-object p0
.end method

.method public final indeterminate(Z)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;
    .locals 0

    .line 62
    iput-boolean p1, p0, Ll/ۤ᩷᩷;->ۘ:Z

    return-object p0
.end method

.method public final layoutGravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    return-object p0
.end method

.method public final layoutWeight(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    return-object p0
.end method

.method public final marginBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 273
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    return-object p0
.end method

.method public final marginLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 255
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    return-object p0
.end method

.method public final marginRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 267
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    return-object p0
.end method

.method public final marginTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 261
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    return-object p0
.end method

.method public final maxProgress(I)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;
    .locals 0

    .line 56
    iput p1, p0, Ll/ۤ᩷᩷;->ᩴ:I

    return-object p0
.end method

.method public final onClick(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 313
    iput-object p1, p0, Ll/ۢ᩷᩷;->ᩳ:Lbin/mt/plugin/api/ui/PluginView$OnClickListener;

    return-object p0
.end method

.method public final onLongClick(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 319
    iput-object p1, p0, Ll/ۢ᩷᩷;->᩻:Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;

    return-object p0
.end method

.method public final padding(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-object p0
.end method

.method public final padding(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-object p0
.end method

.method public final paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    return-object p0
.end method

.method public final paddingLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 199
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->left:I

    return-object p0
.end method

.method public final paddingRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->right:I

    return-object p0
.end method

.method public final paddingTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->top:I

    return-object p0
.end method

.method public final progress(I)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;
    .locals 0

    .line 44
    iput p1, p0, Ll/ۤ᩷᩷;->᩵:I

    return-object p0
.end method

.method public final requestFocus()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 337
    iput-boolean v0, p0, Ll/ۢ᩷᩷;->ۡ:Z

    return-object p0
.end method

.method public final secondaryProgress(I)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;
    .locals 0

    .line 50
    iput p1, p0, Ll/ۤ᩷᩷;->֡:I

    return-object p0
.end method

.method public final style(Lbin/mt/plugin/api/ui/PluginProgressBar$Style;)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;
    .locals 4

    .line 29
    iput-object p1, p0, Ll/ۤ᩷᩷;->ۚ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    .line 30
    sget-object v0, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    const/4 v1, -0x1

    const/4 v2, -0x2

    iget-object v3, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    if-ne p1, v0, :cond_0

    .line 31
    iget p1, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-ne p1, v2, :cond_1

    .line 32
    iput v1, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    return-object p0

    .line 35
    :cond_0
    iget p1, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-ne p1, v1, :cond_1

    .line 36
    iput v2, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    :cond_1
    return-object p0
.end method

.method public final tag(Ljava/lang/Object;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 145
    iput-object p1, p0, Ll/ۢ᩷᩷;->ܺ:Ljava/lang/Object;

    return-object p0
.end method

.method public final width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    return-object p0
.end method

.method public final ֫(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .line 73
    sget-object v0, Ll/۫᩷᩷;->֫:[I

    iget-object v1, p0, Ll/ۤ᩷᩷;->ۚ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const v0, 0x101007a

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p1

    :cond_1
    const v0, 0x1010079

    goto :goto_0

    :cond_2
    const v0, 0x1010077

    goto :goto_0

    :cond_3
    const v0, 0x1010078

    .line 79
    :goto_0
    new-instance v1, Landroid/widget/ProgressBar;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-object v1
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;
    .locals 2

    .line 68
    new-instance v0, Ll/ܶۜ᩷;

    iget-object v1, p0, Ll/ۤ᩷᩷;->ۚ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    invoke-direct {v0, p1, p2, v1}, Ll/ܶۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Lbin/mt/plugin/api/ui/PluginProgressBar$Style;)V

    return-object v0
.end method

.method public final ֫(Ll/۟ۜ᩷;)V
    .locals 2

    .line 14
    check-cast p1, Ll/ܶۜ᩷;

    .line 84
    invoke-super {p0, p1}, Ll/ۢ᩷᩷;->֫(Ll/۟ۜ᩷;)V

    .line 85
    iget-object v0, p0, Ll/ۤ᩷᩷;->ۚ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    if-ne v0, v1, :cond_0

    .line 86
    iget v0, p0, Ll/ۤ᩷᩷;->ᩴ:I

    invoke-virtual {p1, v0}, Ll/ܶۜ᩷;->setMaxProgress(I)V

    .line 87
    iget v0, p0, Ll/ۤ᩷᩷;->᩵:I

    invoke-virtual {p1, v0}, Ll/ܶۜ᩷;->setProgress(I)V

    .line 88
    iget v0, p0, Ll/ۤ᩷᩷;->֡:I

    invoke-virtual {p1, v0}, Ll/ܶۜ᩷;->setSecondaryProgress(I)V

    .line 89
    iget-boolean v0, p0, Ll/ۤ᩷᩷;->ۘ:Z

    invoke-virtual {p1, v0}, Ll/ܶۜ᩷;->setIndeterminate(Z)V

    :cond_0
    return-void
.end method
