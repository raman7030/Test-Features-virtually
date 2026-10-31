.class public final synthetic Ll/ܿܰۚ;
.super Ljava/lang/Object;
.source "T7ET"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ܳܰۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ܳܰۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܰۚ;->᩸:Ll/ܳܰۚ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 655
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "token="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿܰۚ;->᩸:Ll/ܳܰۚ;

    iget-object v1, v1, Ll/ܳܰۚ;->ۧ:Ll/᩻ܰۚ;

    iget-object v1, v1, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    iget-object v1, v1, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
