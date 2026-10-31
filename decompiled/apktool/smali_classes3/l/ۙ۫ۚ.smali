.class public final synthetic Ll/ۙ۫ۚ;
.super Ljava/lang/Object;
.source "FBFP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩶:Ll/ܺۤۚ;

.field public final synthetic ᩸:Ll/ܺۤۚ;

.field public final synthetic ᩹:Ll/ܺۤۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۤۚ;Ll/ܺۤۚ;Ll/ܺۤۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۫ۚ;->᩸:Ll/ܺۤۚ;

    iput-object p2, p0, Ll/ۙ۫ۚ;->᩹:Ll/ܺۤۚ;

    iput-object p3, p0, Ll/ۙ۫ۚ;->᩶:Ll/ܺۤۚ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 331
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "addInnerClass (with indexes: Name ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۙ۫ۚ;->᩸:Ll/ܺۤۚ;

    invoke-virtual {v1}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "), Inner ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    iget-object v1, p0, Ll/ۙ۫ۚ;->᩹:Ll/ܺۤۚ;

    invoke-virtual {v1}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "), Outer ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ۫ۚ;->᩶:Ll/ܺۤۚ;

    invoke-virtual {v1}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
