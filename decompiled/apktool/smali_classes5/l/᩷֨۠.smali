.class public final Ll/᩷֨۠;
.super Ll/ܰᩴ֨;
.source "U410"


# instance fields
.field public final synthetic ᩹:Ll/ܺ֨۠;


# direct methods
.method public constructor <init>(Ll/ܺ֨۠;)V
    .locals 0

    .line 534
    iput-object p1, p0, Ll/᩷֨۠;->᩹:Ll/ܺ֨۠;

    invoke-direct {p0}, Ll/ܰᩴ֨;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 534
    check-cast p2, Ljava/util/Locale;

    .line 546
    iget-object v0, p0, Ll/᩷֨۠;->᩹:Ll/ܺ֨۠;

    invoke-static {v0}, Ll/ܺ֨۠;->֫(Ll/ܺ֨۠;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 547
    invoke-static {v0}, Ll/ܺ֨۠;->֫(Ll/ܺ֨۠;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܺ֨۠;->֫(Ll/ܺ֨۠;Ll/ۖܶ۠;)V

    .line 549
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܰᩴ֨;->֫(Ll/ܶۚ֨;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 538
    iget-object v0, p0, Ll/᩷֨۠;->᩹:Ll/ܺ֨۠;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܺ֨۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܶۚ֨;)Ljava/lang/String;
    .locals 2

    .line 542
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩷֨۠;->᩹:Ll/ܺ֨۠;

    invoke-static {v1}, Ll/ܺ֨۠;->֫(Ll/ܺ֨۠;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۖܶ۠;->indexOf(Ljava/lang/Object;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
