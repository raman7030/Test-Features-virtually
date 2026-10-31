.class public final Ll/֫᩶֨;
.super Ll/ܽۗ֨;
.source "I7LP"


# instance fields
.field public final synthetic ۜ:Ll/֡᩶֨;

.field public final synthetic ᩻:Ll/ۚ᩶֨;


# direct methods
.method public constructor <init>(Ll/ۚ᩶֨;Ll/ۢۗ֨;Ll/֡᩶֨;)V
    .locals 0

    .line 220
    iput-object p1, p0, Ll/֫᩶֨;->᩻:Ll/ۚ᩶֨;

    iput-object p3, p0, Ll/֫᩶֨;->ۜ:Ll/֡᩶֨;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    iget-object p1, p2, Ll/ۢۗ֨;->ۖ:Ll/ܶ۬֨;

    iget-object p1, p1, Ll/ܶ۬֨;->ᩳ:Ll/ۘ۬֨;

    invoke-direct {p0, p2, p1}, Ll/ܽۗ֨;-><init>(Ll/ۢۗ֨;Ll/ۘ۬֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;)Z
    .locals 3

    .line 735
    iget p1, p1, Ll/ۚۚ۠;->᩸:I

    .line 736
    iget-object v0, p0, Ll/֫᩶֨;->᩻:Ll/ۚ᩶֨;

    invoke-static {v0}, Ll/ۚ᩶֨;->ᩳ(Ll/ۚ᩶֨;)Ll/᩹ܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v0

    .line 746
    iget-object v1, p0, Ll/֫᩶֨;->ۜ:Ll/֡᩶֨;

    iget v2, v1, Ll/֡᩶֨;->֫:I

    if-ne p1, v2, :cond_0

    iget-object p1, v1, Ll/֡᩶֨;->ۧ:Ll/ܳ۠۠;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
