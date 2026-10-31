.class public final Ll/֨֨ܿ;
.super Landroid/database/DataSetObserver;
.source "G135"


# instance fields
.field public final synthetic ֫:Ll/ܶ֨ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ֨ܿ;)V
    .locals 0

    .line 50
    iput-object p1, p0, Ll/֨֨ܿ;->֫:Ll/ܶ֨ܿ;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    .line 53
    iget-object v0, p0, Ll/֨֨ܿ;->֫:Ll/ܶ֨ܿ;

    invoke-static {v0}, Ll/ܶ֨ܿ;->ܽ(Ll/ܶ֨ܿ;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0}, Ll/ܶ֨ܿ;->֫(Ll/ܶ֨ܿ;)Ll/۠֨ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠֨ܿ;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
