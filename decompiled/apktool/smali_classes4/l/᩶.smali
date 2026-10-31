.class public final Ll/᩶;
.super Ljava/lang/Object;
.source "95XT"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2080
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2081
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩶;->֫:Ljava/util/ArrayList;

    .line 2082
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩶;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x0

    .line 2098
    :goto_0
    iget-object v1, p0, Ll/᩶;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 2099
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-static {v1, p1}, Ll/ۨܺܺ;->֫(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2100
    iget-object p1, p0, Ll/᩶;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
