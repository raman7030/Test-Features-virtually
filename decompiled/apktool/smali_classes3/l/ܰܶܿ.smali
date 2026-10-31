.class public final synthetic Ll/ܰܶܿ;
.super Ljava/lang/Object;
.source "715Z"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܰܶܿ;->֫:I

    iput-object p2, p0, Ll/ܰܶܿ;->ۧ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 0
    iget v0, p0, Ll/ܰܶܿ;->֫:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ܰܶܿ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/۬᩹ܿ;

    iget-object v1, v0, Ll/۬᩹ܿ;->֫:Ll/᩵᩶ܿ;

    iget v2, v0, Ll/۬᩹ܿ;->ۧ:I

    iget v3, v0, Ll/۬᩹ܿ;->ܽ:I

    iget v4, v0, Ll/۬᩹ܿ;->ᩳ:I

    iget-object v0, v0, Ll/۬᩹ܿ;->ܿ:[B

    invoke-static {v1, v2, v3, v4, v0}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;III[B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll/ܰܶܿ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ܳ᩸ܿ;

    invoke-static {v0}, Ll/ܳ᩸ܿ;->᩻(Ll/ܳ᩸ܿ;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
