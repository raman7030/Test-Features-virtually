.class public final Ll/۟۬ܺ;
.super Ll/ܳ۬ܺ;
.source "F4NW"


# instance fields
.field public final synthetic ۙ:Ll/֫۫ܺ;


# direct methods
.method public constructor <init>(Ll/֫۫ܺ;)V
    .locals 0

    .line 862
    iput-object p1, p0, Ll/۟۬ܺ;->ۙ:Ll/֫۫ܺ;

    invoke-direct {p0}, Ll/ܳ۬ܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 865
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    iget-object v1, p0, Ll/۟۬ܺ;->ۙ:Ll/֫۫ܺ;

    iget-object v1, v1, Ll/֫۫ܺ;->ۙ:Ll/ᩳ۫ܺ;

    .line 866
    invoke-static {v1}, Ll/ᩳ۫ܺ;->֫(Ll/ᩳ۫ܺ;)Ll/ۢۛܺ;

    move-result-object v2

    .line 305
    iget-object v2, v2, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    .line 866
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ll/ᩳ۫ܺ;->ۧ(Ll/ᩳ۫ܺ;)Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 876
    iget-object v0, p0, Ll/۟۬ܺ;->ۙ:Ll/֫۫ܺ;

    iget-object v0, v0, Ll/֫۫ܺ;->ۙ:Ll/ᩳ۫ܺ;

    invoke-virtual {v0}, Ll/ᩳ۫ܺ;->size()I

    move-result v0

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 885
    invoke-super {p0}, Ll/ܳ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
