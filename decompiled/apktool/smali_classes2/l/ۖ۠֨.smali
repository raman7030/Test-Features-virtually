.class public final synthetic Ll/ۖ۠֨;
.super Ljava/lang/Object;
.source "X43L"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ܰۖ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ܰۖ֨;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ۖ۠֨;->᩸:I

    iput-object p1, p0, Ll/ۖ۠֨;->᩹:Ll/ܰۖ֨;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/ۖ۠֨;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۖ۠֨;->᩹:Ll/ܰۖ֨;

    .line 9
    check-cast v0, Ll/۠֡֨;

    .line 12
    invoke-virtual {v0}, Ll/۠֡֨;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Ll/ۖ۠֨;->᩹:Ll/ܰۖ֨;

    .line 18
    check-cast v0, Ll/ۙ֨֨;

    .line 3093
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

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
