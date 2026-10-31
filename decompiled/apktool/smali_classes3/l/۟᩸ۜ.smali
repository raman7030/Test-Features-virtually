.class public final Ll/۟᩸ۜ;
.super Ll/᩶ۗۧ;
.source "O8UQ"


# instance fields
.field public final synthetic ֫:Ll/ᩳ᩹ۜ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩹ۜ;)V
    .locals 0

    .line 416
    iput-object p1, p0, Ll/۟᩸ۜ;->֫:Ll/ᩳ᩹ۜ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 431
    iget-object v0, p0, Ll/۟᩸ۜ;->֫:Ll/ᩳ᩹ۜ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 0

    .line 416
    check-cast p1, Ll/ܽ᩹ۜ;

    .line 426
    invoke-virtual {p1, p2}, Ll/ܽ᩹ۜ;->ۧ(I)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 2

    .line 421
    new-instance p2, Ll/ܽ᩹ۜ;

    const v0, 0x7f0d0139

    const/4 v1, 0x0

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 421
    iget-object v0, p0, Ll/۟᩸ۜ;->֫:Ll/ᩳ᩹ۜ;

    invoke-direct {p2, v0, p1}, Ll/ܽ᩹ۜ;-><init>(Ll/ᩳ᩹ۜ;Landroid/view/View;)V

    return-object p2
.end method
