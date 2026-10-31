.class public final synthetic Ll/֡۟ۚ;
.super Ljava/lang/Object;
.source "97DW"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۚ۟ۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ۟ۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡۟ۚ;->᩸:Ll/ۚ۟ۚ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "  writeLookupSwitch: pc="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֡۟ۚ;->᩸:Ll/ۚ۟ۚ;

    iget v2, v1, Ll/ۚ۟ۚ;->ۜ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " pad="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v1, Ll/ۚ۟ۚ;->᩻:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " deflabel="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/ۚ۟ۚ;->֫:Ll/ۜۨۚ;

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
