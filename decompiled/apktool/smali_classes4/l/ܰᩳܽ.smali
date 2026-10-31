.class public final synthetic Ll/ܰᩳܽ;
.super Ljava/lang/Object;
.source "J63D"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܰᩳܽ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ܰᩳܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 431
    new-array p1, p1, [Ll/ۡ֫ۚ;

    return-object p1

    .line 215
    :pswitch_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "#%08x"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 29
    :pswitch_1
    new-array p1, p1, [Ll/᩸᩻ܽ;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
