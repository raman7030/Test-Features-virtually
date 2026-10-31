.class public final Ll/ܶ᩻ܿ;
.super Ll/᩶ۗۧ;
.source "A7IB"


# instance fields
.field public final synthetic ֫:Ll/ۛ᩻ܿ;


# direct methods
.method public constructor <init>(Ll/ۛ᩻ܿ;)V
    .locals 0

    .line 136
    iput-object p1, p0, Ll/ܶ᩻ܿ;->֫:Ll/ۛ᩻ܿ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ܶ᩻ܿ;->֫:Ll/ۛ᩻ܿ;

    invoke-static {v0}, Ll/ۛ᩻ܿ;->ۧ(Ll/ۛ᩻ܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ܶ᩻ܿ;->֫:Ll/ۛ᩻ܿ;

    invoke-static {v0}, Ll/ۛ᩻ܿ;->ۧ(Ll/ۛ᩻ܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶᩻ܿ;

    invoke-virtual {p1}, Ll/᩶᩻ܿ;->ܽ()I

    move-result p1

    return p1
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 1

    .line 136
    check-cast p1, Ll/ۤ᩻ܿ;

    .line 163
    iget-object v0, p0, Ll/ܶ᩻ܿ;->֫:Ll/ۛ᩻ܿ;

    invoke-static {v0}, Ll/ۛ᩻ܿ;->ۧ(Ll/ۛ᩻ܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩶᩻ܿ;

    invoke-virtual {p1, p2}, Ll/ۤ᩻ܿ;->֫(Ll/᩶᩻ܿ;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 2

    const/4 v0, 0x1

    .line 151
    iget-object v1, p0, Ll/ܶ᩻ܿ;->֫:Ll/ۛ᩻ܿ;

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 155
    new-instance p2, Ll/۫᩻ܿ;

    invoke-direct {p2, v1, p1}, Ll/۫᩻ܿ;-><init>(Ll/ۛ᩻ܿ;Landroid/view/ViewGroup;)V

    return-object p2

    .line 158
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 153
    :cond_1
    new-instance p2, Ll/᩹᩻ܿ;

    invoke-direct {p2, v1, p1}, Ll/᩹᩻ܿ;-><init>(Ll/ۛ᩻ܿ;Landroid/view/ViewGroup;)V

    return-object p2
.end method
