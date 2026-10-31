.class public final synthetic Ll/֡۠ۢ;
.super Ljava/lang/Object;
.source "CAJ3"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡۠ۢ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    .line 2
    iget v0, p0, Ll/֡۠ۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 404
    new-array p1, p1, [Ljava/lang/CharSequence;

    return-object p1

    .line 402
    :pswitch_0
    new-array p1, p1, [Ljava/lang/String;

    return-object p1

    .line 294
    :pswitch_1
    new-array p1, p1, [Ljava/lang/String;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
