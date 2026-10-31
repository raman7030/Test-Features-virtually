.class public final Ll/ܳ᩺ܺ;
.super Ll/֨᩶ܺ;
.source "D3VQ"


# instance fields
.field public final ᩶:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ll/᩻᩺ܺ;)V
    .locals 1

    .line 582
    invoke-direct {p0}, Ll/֨᩶ܺ;-><init>()V

    .line 583
    invoke-static {}, Ll/᩻᩺ܺ;->ܽ()Ll/ۗܶܺ;

    move-result-object v0

    iget-object p1, p1, Ll/᩻᩺ܺ;->֫:Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Ll/ۗܶܺ;->֫(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩺ܺ;->᩶:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 587
    iget-object v0, p0, Ll/ܳ᩺ܺ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 588
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 590
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-object v1

    .line 594
    :cond_1
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    const/4 v0, 0x0

    return-object v0
.end method
