.class public final synthetic Ll/᩸֫᩻;
.super Ljava/lang/Object;
.source "65FC"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/֫ۧ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/֫ۧ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸֫᩻;->֫:Ll/֫ۧ᩻;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/۟֨ܳ;

    .line 242
    invoke-virtual {p1}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ᩹ۡ;->ۧ(Landroid/widget/TextView;)V

    .line 243
    invoke-virtual {p1}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object p1

    new-instance v0, Ll/ۡ᩷ᩳ;

    const/4 v1, 0x2

    iget-object v2, p0, Ll/᩸֫᩻;->֫:Ll/֫ۧ᩻;

    invoke-direct {v0, v1, v2}, Ll/ۡ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
