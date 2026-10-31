.class public final Ll/᩵۬ܺ;
.super Ll/᩺ۗܺ;
.source "Z3PG"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final transient ᩹:Ll/֡۬ܺ;


# direct methods
.method public constructor <init>(Ll/֡۬ܺ;)V
    .locals 0

    .line 808
    invoke-direct {p0}, Ll/᩺ۗܺ;-><init>()V

    .line 809
    iput-object p1, p0, Ll/᩵۬ܺ;->᩹:Ll/֡۬ܺ;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 814
    iget-object v0, p0, Ll/᩵۬ܺ;->᩹:Ll/֡۬ܺ;

    invoke-virtual {v0, p1}, Ll/֡۬ܺ;->֫(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 805
    invoke-virtual {p0}, Ll/᩵۬ܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 2

    .line 819
    iget-object v0, p0, Ll/᩵۬ܺ;->᩹:Ll/֡۬ܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    new-instance v1, Ll/ۖ۬ܺ;

    invoke-direct {v1, v0}, Ll/ۖ۬ܺ;-><init>(Ll/֡۬ܺ;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 833
    iget-object v0, p0, Ll/᩵۬ܺ;->᩹:Ll/֡۬ܺ;

    .line 575
    iget v0, v0, Ll/֡۬ܺ;->ۗ:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 847
    invoke-super {p0}, Ll/᩺ۗܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I[Ljava/lang/Object;)I
    .locals 2

    .line 825
    iget-object v0, p0, Ll/᩵۬ܺ;->᩹:Ll/֡۬ܺ;

    iget-object v0, v0, Ll/֡۬ܺ;->ۙ:Ll/ۢ۬ܺ;

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->values()Ll/᩺ۗܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۗܺ;

    .line 826
    invoke-virtual {v1, p1, p2}, Ll/᩺ۗܺ;->֫(I[Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    return p1
.end method
