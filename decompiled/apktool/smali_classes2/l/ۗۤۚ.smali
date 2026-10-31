.class public final synthetic Ll/ۗۤۚ;
.super Ljava/lang/Object;
.source "K3OA"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗۤۚ;->᩸:I

    iput-object p2, p0, Ll/ۗۤۚ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/ۗۤۚ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۗۤۚ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ܳܰۚ;

    .line 352
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "token="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll/ܳܰۚ;->ۧ:Ll/᩻ܰۚ;

    iget-object v0, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    iget-object v0, v0, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۗۤۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    .line 291
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\tcell from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, Ll/ۜۨۚ;->᩸:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
