.class public final Ll/ܰܳۧ;
.super Ljava/lang/Object;
.source "Z8VY"

# interfaces
.implements Ll/ܿۜۧ;


# instance fields
.field public final synthetic ۧ:Ll/ܿ᩻ۧ;


# direct methods
.method public constructor <init>(Ll/ܿ᩻ۧ;)V
    .locals 0

    .line 885
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰܳۧ;->ۧ:Ll/ܿ᩻ۧ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 889
    iget-object v0, p0, Ll/ܰܳۧ;->ۧ:Ll/ܿ᩻ۧ;

    invoke-static {v0}, Ll/ܿ᩻ۧ;->ᩳ(Ll/ܿ᩻ۧ;)Ll/۟ۗ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 891
    invoke-interface {v0}, Ll/۟ۗ֫;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۜ֡֫;)V
    .locals 0

    return-void
.end method

.method public final ܳ()V
    .locals 3

    .line 904
    iget-object v0, p0, Ll/ܰܳۧ;->ۧ:Ll/ܿ᩻ۧ;

    invoke-static {v0}, Ll/ܿ᩻ۧ;->֫(Ll/ܿ᩻ۧ;)Landroid/view/Surface;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 905
    invoke-virtual {v0, v1, v2}, Ll/ܿ᩻ۧ;->֫(II)V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 897
    iget-object v0, p0, Ll/ܰܳۧ;->ۧ:Ll/ܿ᩻ۧ;

    invoke-static {v0}, Ll/ܿ᩻ۧ;->֫(Ll/ܿ᩻ۧ;)Landroid/view/Surface;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 898
    invoke-static {v0}, Ll/ܿ᩻ۧ;->ۧ(Ll/ܿ᩻ۧ;)V

    :cond_0
    return-void
.end method
