.class public final Ll/ۜۘܺ;
.super Ljava/lang/Object;
.source "2BFP"

# interfaces
.implements Ll/ܿۘܺ;


# instance fields
.field public final synthetic ֫:Ll/᩷ۘܺ;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 0

    .line 455
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۘܺ;->֫:Ll/᩷ۘܺ;

    return-void
.end method

.method private ֫(Ll/ܳۘܺ;)V
    .locals 5

    .line 479
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v0

    .line 480
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 483
    iget-object v3, p0, Ll/ۜۘܺ;->֫:Ll/᩷ۘܺ;

    invoke-static {v3}, Ll/᩷ۘܺ;->ۧ(Ll/᩷ۘܺ;)[Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    aget-object v3, v3, v4

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۖܺ;)V
    .locals 0

    .line 459
    invoke-direct {p0, p1}, Ll/ۜۘܺ;->֫(Ll/ܳۘܺ;)V

    return-void
.end method

.method public final ֫(Ll/ܰۖܺ;)V
    .locals 0

    .line 465
    invoke-direct {p0, p1}, Ll/ۜۘܺ;->֫(Ll/ܳۘܺ;)V

    return-void
.end method

.method public final ۧ(Ll/۫ۖܺ;)V
    .locals 0

    .line 471
    invoke-direct {p0, p1}, Ll/ۜۘܺ;->֫(Ll/ܳۘܺ;)V

    return-void
.end method
