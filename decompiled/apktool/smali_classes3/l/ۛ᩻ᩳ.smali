.class public final Ll/ۛ᩻ᩳ;
.super Ll/᩺᩶ܽ;
.source "K5R1"


# instance fields
.field public ۜ:I

.field public final synthetic ۢ:Ll/ۜۜᩳ;

.field public ᩷:Ll/ۗܿܽ;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۜۜᩳ;Ll/ۜۜᩳ;)V
    .locals 0

    .line 918
    iput-object p1, p0, Ll/ۛ᩻ᩳ;->ۢ:Ll/ۜۜᩳ;

    invoke-direct {p0, p2}, Ll/᩺᩶ܽ;-><init>(Ll/ۗܺ᩷;)V

    .line 920
    iget-object p1, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object p1, p1, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-virtual {p1}, Ll/۬ܿܽ;->size()I

    move-result p1

    iput p1, p0, Ll/ۛ᩻ᩳ;->ۜ:I

    const/4 p1, 0x0

    .line 921
    iput p1, p0, Ll/ۛ᩻ᩳ;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 925
    iget v0, p0, Ll/ۛ᩻ᩳ;->᩻:I

    iget v1, p0, Ll/ۛ᩻ᩳ;->ۜ:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 927
    :cond_0
    iget-object v1, p0, Ll/ۛ᩻ᩳ;->ۢ:Ll/ۜۜᩳ;

    iget-object v1, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v1, v1, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۛ᩻ᩳ;->᩻:I

    invoke-virtual {v1, v0}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ᩻ᩳ;->᩷:Ll/ۗܿܽ;

    .line 928
    invoke-virtual {v0}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    if-lez p1, :cond_0

    .line 940
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object p1, p0, Ll/ۛ᩻ᩳ;->ۢ:Ll/ۜۜᩳ;

    const v1, 0x7f120897

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 941
    iget-object p1, p1, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {p1}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void

    :cond_0
    const p1, 0x7f120a62

    .line 943
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 933
    iget-object v0, p0, Ll/ۛ᩻ᩳ;->᩷:Ll/ۗܿܽ;

    invoke-virtual {v0, p1}, Ll/ۗܿܽ;->ۧ(Ljava/lang/String;)V

    .line 934
    iget-object p1, p0, Ll/ۛ᩻ᩳ;->ۢ:Ll/ۜۜᩳ;

    iget-object p1, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ll/᩻ۜᩳ;->᩺:Z

    return-void
.end method
