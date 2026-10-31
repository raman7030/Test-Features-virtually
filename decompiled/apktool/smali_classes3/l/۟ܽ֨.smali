.class public final synthetic Ll/۟ܽ֨;
.super Ljava/lang/Object;
.source "I7DX"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 0
    iput p2, p0, Ll/۟ܽ֨;->᩸:I

    iput p1, p0, Ll/۟ܽ֨;->᩹:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/۟ܽ֨;->᩸:I

    .line 4
    iget v1, p0, Ll/۟ܽ֨;->᩹:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "wr.pool:size="

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 140
    :pswitch_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "MethodParametersAttr[%d]"

    .line 19
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
