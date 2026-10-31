.class public final Ll/᩷ܿ;
.super Ljava/lang/Object;
.source "I67T"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ۖܿ;

.field public final synthetic ᩸:Ll/ۢܿ;

.field public final synthetic ᩹:Ll/ۘܿ;


# direct methods
.method public constructor <init>(Ll/ۢܿ;Ll/ۖܿ;Ll/ۘܿ;)V
    .locals 0

    .line 1075
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܿ;->᩸:Ll/ۢܿ;

    iput-object p2, p0, Ll/᩷ܿ;->᩶:Ll/ۖܿ;

    iput-object p3, p0, Ll/᩷ܿ;->᩹:Ll/ۘܿ;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1078
    iget-object p1, p0, Ll/᩷ܿ;->᩸:Ll/ۢܿ;

    iget-object p2, p1, Ll/ۢܿ;->ᩳ:[Z

    iget-object p4, p0, Ll/᩷ܿ;->᩶:Ll/ۖܿ;

    if-eqz p2, :cond_0

    .line 1079
    invoke-virtual {p4, p3}, Landroid/widget/AbsListView;->isItemChecked(I)Z

    move-result p5

    aput-boolean p5, p2, p3

    .line 1081
    :cond_0
    iget-object p1, p1, Ll/ۢܿ;->᩶:Landroid/content/DialogInterface$OnMultiChoiceClickListener;

    iget-object p2, p0, Ll/᩷ܿ;->᩹:Ll/ۘܿ;

    iget-object p2, p2, Ll/ۘܿ;->۠:Ll/᩵ܿ;

    .line 1082
    invoke-virtual {p4, p3}, Landroid/widget/AbsListView;->isItemChecked(I)Z

    move-result p4

    .line 1081
    invoke-interface {p1, p2, p3, p4}, Landroid/content/DialogInterface$OnMultiChoiceClickListener;->onClick(Landroid/content/DialogInterface;IZ)V

    return-void
.end method
