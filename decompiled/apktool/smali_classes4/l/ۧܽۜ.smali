.class public final synthetic Ll/ۧܽۜ;
.super Ljava/lang/Object;
.source "Q77G"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧܽۜ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 1

    .line 0
    iget v0, p0, Ll/ۧܽۜ;->᩸:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll/ۚۚ۠;

    invoke-static {p1}, Ll/۟ۚ۠;->ۢ(Ll/ۚۚ۠;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ll/֨᩻ܽ;

    invoke-interface {p1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
