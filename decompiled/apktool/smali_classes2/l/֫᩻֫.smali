.class public final Ll/֫᩻֫;
.super Ll/ܶ᩻֫;
.source "J4LB"


# instance fields
.field public final synthetic ֫:Ll/ۡ᩻֫;


# direct methods
.method public constructor <init>(Ll/ۡ᩻֫;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3037
    iput-object p1, p0, Ll/֫᩻֫;->֫:Ll/ۡ᩻֫;

    return-void
.end method


# virtual methods
.method public final ֫(I)Landroid/view/View;
    .locals 3

    .line 3041
    iget-object v0, p0, Ll/֫᩻֫;->֫:Ll/ۡ᩻֫;

    iget-object v1, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 3045
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 3042
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not have a view"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 3050
    iget-object v0, p0, Ll/֫᩻֫;->֫:Ll/ۡ᩻֫;

    iget-object v0, v0, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
