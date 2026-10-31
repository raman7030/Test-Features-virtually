.class public final Ll/ᩴ᩶֨;
.super Ll/۬۫֨;
.source "I7LP"


# instance fields
.field public final synthetic ۧ:Ll/᩵᩶֨;

.field public final synthetic ܽ:Ll/ᩴܶ۠;


# direct methods
.method public constructor <init>(Ll/᩵᩶֨;Ll/ᩴܶ۠;)V
    .locals 0

    .line 494
    iput-object p1, p0, Ll/ᩴ᩶֨;->ۧ:Ll/᩵᩶֨;

    iput-object p2, p0, Ll/ᩴ᩶֨;->ܽ:Ll/ᩴܶ۠;

    invoke-direct {p0}, Ll/۬۫֨;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖۚ۠;)V
    .locals 2

    .line 497
    iget-object v0, p1, Ll/ۖۚ۠;->ۗ:Ll/ۚۚ۠;

    iget-object v1, p0, Ll/ᩴ᩶֨;->ۧ:Ll/᩵᩶֨;

    iget-object v1, v1, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    if-ne v0, v1, :cond_0

    .line 498
    iget-object v0, p0, Ll/ᩴ᩶֨;->ܽ:Ll/ᩴܶ۠;

    .line 227
    invoke-virtual {v0, p1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 226
    :cond_0
    iget-object p1, p1, Ll/ۖۚ۠;->۬:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ܶ۫֨;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method
