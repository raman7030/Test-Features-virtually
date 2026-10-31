.class public final synthetic Ll/ۚۢ֡;
.super Ljava/lang/Object;
.source "M4LF"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۚۢ֡;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 2
    iget v0, p0, Ll/ۚۢ֡;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    return-object v0

    .line 0
    :pswitch_0
    new-instance v0, Ll/᩺ۖܽ;

    invoke-direct {v0}, Ll/᩺ۖܽ;-><init>()V

    return-object v0

    :pswitch_1
    const/16 v0, 0x2000

    new-array v0, v0, [C

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
