.class public final synthetic Ll/ܿ᩶֨;
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

    iput-object p1, p0, Ll/ܿ᩶֨;->᩸:Ll/ۜ᩶֨;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 536
    iget-object v0, p0, Ll/ܿ᩶֨;->᩸:Ll/ۜ᩶֨;

    iget-object v1, v0, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    check-cast v1, Ll/ܳ֡۠;

    iget-object v1, v1, Ll/ܳ֡۠;->ۨ:Ll/ۖܶ۠;

    invoke-static {v1}, Ll/۟ۚ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v1

    .line 537
    invoke-static {v1}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v2

    iput-object v2, v0, Ll/ۜ᩶֨;->ᩳ֫:Ll/ܽ۫ᩴ;

    return-object v1
.end method
