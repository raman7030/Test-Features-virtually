.class public final synthetic Ll/᩶۬᩻;
.super Ljava/lang/Object;
.source "J6WT"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۙ۬᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ۬᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶۬᩻;->᩸:Ll/ۙ۬᩻;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 191
    iget-object p1, p0, Ll/᩶۬᩻;->᩸:Ll/ۙ۬᩻;

    iget-object v0, p1, Ll/ۙ۬᩻;->ܽ:Ll/ۗ۬᩻;

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    if-lez p1, :cond_0

    .line 192
    invoke-static {v0}, Ll/ۗ۬᩻;->ܳ(Ll/ۗ۬᩻;)Ll/᩵ۢۜ;

    move-result-object v1

    iget-object v1, v1, Ll/᩵ۢۜ;->ܽ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt p1, v1, :cond_0

    .line 193
    invoke-static {v0}, Ll/ۗ۬᩻;->ܳ(Ll/ۗ۬᩻;)Ll/᩵ۢۜ;

    move-result-object v1

    iget-object v1, v1, Ll/᩵ۢۜ;->ܽ:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴۢۜ;

    iget-object p1, p1, Ll/ᩴۢۜ;->ܽ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۗ۬᩻;->ܽ(Ll/ۗ۬᩻;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
