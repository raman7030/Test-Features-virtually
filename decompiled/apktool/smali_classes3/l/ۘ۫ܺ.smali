.class public final Ll/ۘ۫ܺ;
.super Ll/֨᩶ܺ;
.source "I5ZF"


# instance fields
.field public final synthetic ۙ:Ljava/util/Iterator;

.field public final synthetic ᩶:Ll/ᩴܶܺ;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Ll/ᩴܶܺ;)V
    .locals 0

    .line 670
    iput-object p1, p0, Ll/ۘ۫ܺ;->ۙ:Ljava/util/Iterator;

    iput-object p2, p0, Ll/ۘ۫ܺ;->᩶:Ll/ᩴܶܺ;

    invoke-direct {p0}, Ll/֨᩶ܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 673
    :cond_0
    iget-object v0, p0, Ll/ۘ۫ܺ;->ۙ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 674
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 675
    iget-object v1, p0, Ll/ۘ۫ܺ;->᩶:Ll/ᩴܶܺ;

    invoke-interface {v1, v0}, Ll/ᩴܶܺ;->apply(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 679
    :cond_1
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    const/4 v0, 0x0

    return-object v0
.end method
