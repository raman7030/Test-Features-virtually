.class public final Ll/ۜܿ;
.super Ljava/lang/Object;
.source "I67T"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۢܿ;

.field public final synthetic ᩹:Ll/ۘܿ;


# direct methods
.method public constructor <init>(Ll/ۢܿ;Ll/ۘܿ;)V
    .locals 0

    .line 1065
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜܿ;->᩸:Ll/ۢܿ;

    iput-object p2, p0, Ll/ۜܿ;->᩹:Ll/ۘܿ;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1068
    iget-object p1, p0, Ll/ۜܿ;->᩸:Ll/ۢܿ;

    iget-object p2, p1, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    iget-object p4, p0, Ll/ۜܿ;->᩹:Ll/ۘܿ;

    iget-object p5, p4, Ll/ۘܿ;->۠:Ll/᩵ܿ;

    invoke-interface {p2, p5, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 1069
    iget-boolean p1, p1, Ll/ۢܿ;->ۖ:Z

    if-nez p1, :cond_0

    .line 1070
    iget-object p1, p4, Ll/ۘܿ;->۠:Ll/᩵ܿ;

    invoke-virtual {p1}, Ll/۠ܳ;->dismiss()V

    :cond_0
    return-void
.end method
