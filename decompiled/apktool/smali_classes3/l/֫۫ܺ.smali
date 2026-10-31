.class public final Ll/֫۫ܺ;
.super Ll/ܺ۬ܺ;
.source "F4NW"


# instance fields
.field public final synthetic ۙ:Ll/ᩳ۫ܺ;


# direct methods
.method public constructor <init>(Ll/ᩳ۫ܺ;)V
    .locals 0

    .line 854
    iput-object p1, p0, Ll/֫۫ܺ;->ۙ:Ll/ᩳ۫ܺ;

    .line 80
    invoke-direct {p0}, Ll/ۛ۬ܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 854
    invoke-virtual {p0}, Ll/֫۫ܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 2

    .line 857
    invoke-virtual {p0}, Ll/ۛ۬ܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 901
    invoke-super {p0}, Ll/ܺ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/ᩳ۫ܺ;
    .locals 1

    .line 892
    iget-object v0, p0, Ll/֫۫ܺ;->ۙ:Ll/ᩳ۫ܺ;

    return-object v0
.end method

.method public final ᩻()Ll/ܳ۬ܺ;
    .locals 1

    .line 862
    new-instance v0, Ll/۟۬ܺ;

    invoke-direct {v0, p0}, Ll/۟۬ܺ;-><init>(Ll/֫۫ܺ;)V

    return-object v0
.end method
