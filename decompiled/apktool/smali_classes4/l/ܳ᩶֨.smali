.class public final synthetic Ll/ܳ᩶֨;
.super Ljava/lang/Object;
.source "I7LP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۜ᩶֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۜ᩶֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩶֨;->᩸:Ll/ۜ᩶֨;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 546
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 547
    new-instance v1, Ll/᩻᩶֨;

    invoke-direct {v1, v0}, Ll/᩻᩶֨;-><init>(Ll/ᩴܶ۠;)V

    iget-object v2, p0, Ll/ܳ᩶֨;->᩸:Ll/ۜ᩶֨;

    iget-object v3, v2, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    check-cast v3, Ll/ܳ֡۠;

    iget-object v3, v3, Ll/ܳ֡۠;->۫:Ll/ۚۚ۠;

    .line 552
    invoke-virtual {v1, v3}, Ll/ܶ۫֨;->ۧ(Ll/ۚۚ۠;)V

    .line 553
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    .line 554
    invoke-static {v0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v1

    iput-object v1, v2, Ll/ۜ᩶֨;->ܿ֫:Ll/ܽ۫ᩴ;

    return-object v0
.end method
