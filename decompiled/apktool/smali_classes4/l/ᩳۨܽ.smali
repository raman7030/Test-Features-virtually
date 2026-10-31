.class public final Ll/ᩳۨܽ;
.super Ljava/lang/Object;
.source "H5BW"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗۘ;

.field public final synthetic ᩹:Ll/ۗۘ;


# direct methods
.method public constructor <init>(Ll/ۗۘ;Ll/ۗۘ;)V
    .locals 0

    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۨܽ;->᩹:Ll/ۗۘ;

    iput-object p2, p0, Ll/ᩳۨܽ;->᩸:Ll/ۗۘ;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 393
    invoke-static {}, Ll/۠ۧᩳ;->values()[Ll/۠ۧᩳ;

    move-result-object p1

    aget-object p1, p1, p3

    iget-boolean p1, p1, Ll/۠ۧᩳ;->᩸:Z

    const/16 p2, 0x8

    iget-object p3, p0, Ll/ᩳۨܽ;->᩸:Ll/ۗۘ;

    const/4 p4, 0x0

    iget-object p5, p0, Ll/ᩳۨܽ;->᩹:Ll/ۗۘ;

    if-eqz p1, :cond_0

    .line 394
    invoke-virtual {p5, p4}, Landroid/view/View;->setVisibility(I)V

    if-eqz p3, :cond_1

    .line 396
    invoke-virtual {p3, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 399
    :cond_0
    invoke-virtual {p5, p2}, Landroid/view/View;->setVisibility(I)V

    if-eqz p3, :cond_1

    .line 401
    invoke-virtual {p3, p4}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
