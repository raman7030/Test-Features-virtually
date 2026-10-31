.class public final synthetic Ll/ܶۤۚ;
.super Ljava/lang/Object;
.source "K3OA"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۗۛۚ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۗۛۚ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۤۚ;->᩸:Ll/ۗۛۚ;

    iput p2, p0, Ll/ܶۤۚ;->᩹:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/ܺۤۚ;

    .line 288
    invoke-virtual {p1}, Ll/ܺۤۚ;->ܽ()I

    move-result v0

    if-nez v0, :cond_1

    .line 289
    iget v0, p1, Ll/ۜۨۚ;->᩸:I

    iget v1, p0, Ll/ܶۤۚ;->᩹:I

    if-le v0, v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 290
    iput v0, p1, Ll/ۜۨۚ;->᩸:I

    .line 291
    iget-object v0, p0, Ll/ܶۤۚ;->᩸:Ll/ۗۛۚ;

    iget-object v0, v0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    new-instance v1, Ll/ۗۤۚ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ll/ۗۤۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    :cond_0
    const/4 v0, 0x2

    .line 293
    invoke-virtual {p1, v0}, Ll/ܺۤۚ;->֫(I)V

    :cond_1
    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
