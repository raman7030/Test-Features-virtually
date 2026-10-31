.class public final synthetic Ll/۠᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/view/View;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ܳۙܳ;

.field public final synthetic ᩹:[Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Ll/ܳۙܳ;[Ljava/lang/CharSequence;Ll/֡ۚۢ;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩶ܳ;->᩸:Ll/ܳۙܳ;

    iput-object p2, p0, Ll/۠᩶ܳ;->᩹:[Ljava/lang/CharSequence;

    iput-object p3, p0, Ll/۠᩶ܳ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/۠᩶ܳ;->ۙ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 0

    .line 0
    iget-object p1, p0, Ll/۠᩶ܳ;->᩶:Ll/֡ۚۢ;

    iget-object p2, p0, Ll/۠᩶ܳ;->ۙ:Landroid/view/View;

    iget-object p4, p0, Ll/۠᩶ܳ;->᩸:Ll/ܳۙܳ;

    iget-object p5, p0, Ll/۠᩶ܳ;->᩹:[Ljava/lang/CharSequence;

    invoke-static {p4, p5, p1, p2, p3}, Ll/ܳۙܳ;->֫(Ll/ܳۙܳ;[Ljava/lang/CharSequence;Ll/֡ۚۢ;Landroid/view/View;I)V

    const/4 p1, 0x1

    return p1
.end method
