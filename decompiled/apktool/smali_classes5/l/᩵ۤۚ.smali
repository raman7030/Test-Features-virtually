.class public final synthetic Ll/᩵ۤۚ;
.super Ljava/lang/Object;
.source "K3OA"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۜۗۚ;

.field public final synthetic ᩹:Ll/ܶۛۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜۗۚ;Ll/ܶۛۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۤۚ;->᩸:Ll/ۜۗۚ;

    iput-object p2, p0, Ll/᩵ۤۚ;->᩹:Ll/ܶۛۚ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FIXED Left:ConstPool["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵ۤۚ;->᩸:Ll/ۜۗۚ;

    iget-object v2, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ܺۤۚ;

    iget v2, v2, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩵ۤۚ;->᩹:Ll/ܶۛۚ;

    iget-object v2, v2, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v2}, Ll/ۧۤۚ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    iget-object v1, v1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
