.class public final synthetic Ll/᩵᩷᩻;
.super Ljava/lang/Object;
.source "BAH0"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/֡᩷᩻;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩷᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩷᩻;->֫:Ll/֡᩷᩻;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ᩳ۠ܳ;

    .line 188
    invoke-virtual {p1}, Ll/ᩳ۠ܳ;->ᩳ()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 189
    new-instance v0, Ll/ܳ᩷᩻;

    iget-object v1, p0, Ll/᩵᩷᩻;->֫:Ll/֡᩷᩻;

    invoke-direct {v0, v1}, Ll/ܳ᩷᩻;-><init>(Ll/֡᩷᩻;)V

    .line 190
    invoke-virtual {p1}, Ll/ᩳ۠ܳ;->ᩳ()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    invoke-virtual {p1}, Ll/ᩳ۠ܳ;->ܽ()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
