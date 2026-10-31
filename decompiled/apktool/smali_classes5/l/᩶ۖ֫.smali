.class public final Ll/᩶ۖ֫;
.super Ll/ܳۘ֫;
.source "X6AW"


# instance fields
.field public final synthetic ܿ:Ll/᩸ۧ;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ll/᩸ۧ;)V
    .locals 0

    .line 1818
    iput-object p2, p0, Ll/᩶ۖ֫;->ܿ:Ll/᩸ۧ;

    invoke-direct {p0, p1}, Ll/ܳۘ֫;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ᩳ()V
    .locals 4

    .line 1821
    invoke-virtual {p0}, Ll/ܳۘ֫;->֫()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    iget-object v2, p0, Ll/᩶ۖ֫;->ܿ:Ll/᩸ۧ;

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    .line 1822
    invoke-virtual {v2, v0, v1}, Ll/᩸ۧ;->ۧ(ILandroid/os/Bundle;)V

    return-void

    .line 1825
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v3, "media_item"

    .line 1826
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const/4 v1, 0x0

    .line 1827
    invoke-virtual {v2, v1, v0}, Ll/᩸ۧ;->ۧ(ILandroid/os/Bundle;)V

    return-void
.end method
