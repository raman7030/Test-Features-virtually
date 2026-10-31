.class public final synthetic Ll/ۚۤ᩻;
.super Ljava/lang/Object;
.source "M6WW"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۠ۤ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۤ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۤ᩻;->᩸:Ll/۠ۤ᩻;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 336
    iget-object p1, p0, Ll/ۚۤ᩻;->᩸:Ll/۠ۤ᩻;

    iget-object v0, p1, Ll/۠ۤ᩻;->ᩳ:Ll/ܶۤ᩻;

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    if-lez p1, :cond_0

    .line 337
    invoke-static {v0}, Ll/ܶۤ᩻;->ᩳ(Ll/ܶۤ᩻;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt p1, v1, :cond_0

    invoke-static {v0}, Ll/ܶۤ᩻;->ᩳ(Ll/ܶۤ᩻;)Ljava/util/ArrayList;

    move-result-object v1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۢۜ;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;Ll/ܰۢۜ;Z)V

    :cond_0
    return-void
.end method
