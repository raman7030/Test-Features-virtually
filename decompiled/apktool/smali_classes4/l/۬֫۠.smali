.class public final Ll/۬֫۠;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ll/֡ۧ۠;


# instance fields
.field public final synthetic ֫:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;)V
    .locals 0

    .line 2628
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬֫۠;->֫:Ll/᩹ܽ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֡֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;
    .locals 4

    .line 2635
    new-instance v0, Ll/֡ܽ۠;

    sget-object v1, Ll/ܰ۬֨;->᩶:Ll/ܰ۬֨;

    iget-object v2, p0, Ll/۬֫۠;->֫:Ll/᩹ܽ۠;

    iget-object v3, v2, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    iget-object v3, v3, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    .line 2642
    iget-object v2, v2, Ll/᩹ܽ۠;->ᩴ:Ll/۫۫֨;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v2, v1, p1, v3}, Ll/ۗ۫֨;-><init>(Ll/۫۫֨;Ll/ܰ۬֨;Ll/ۛ֡֨;Ll/ܽܽ۠;)V

    .line 2635
    invoke-virtual {p2, v0}, Ll/ۖܶ۠;->֫(Ljava/util/function/Function;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Z
    .locals 0

    .line 2630
    invoke-virtual {p1}, Ll/ۙ֨֨;->᩻֫()Z

    move-result p1

    if-nez p1, :cond_1

    .line 2631
    invoke-static {p2}, Ll/ۙ֨֨;->ܽ(Ll/ۖܶ۠;)Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    .line 2632
    invoke-static {p3}, Ll/ۙ֨֨;->ܽ(Ll/ۖܶ۠;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
