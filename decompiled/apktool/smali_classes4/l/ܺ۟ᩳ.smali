.class public final synthetic Ll/ܺ۟ᩳ;
.super Ljava/lang/Object;
.source "66R4"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺ۟ᩳ;->᩸:I

    iput-object p2, p0, Ll/ܺ۟ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 2
    iget v0, p0, Ll/ܺ۟ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܺ۟ᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩷۠ᩴ;

    .line 697
    new-instance v1, Ll/ۗ᩹ᩳ;

    invoke-static {}, Ll/ۜ֡ᩳ;->֫()Ll/֨۬ᩳ;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Ll/ۗ᩹ᩳ;-><init>(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)V

    return-object v1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܺ۟ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/֡۟ᩳ;

    invoke-static {v0}, Ll/֡۟ᩳ;->֫(Ll/֡۟ᩳ;)Ll/ܽ۬ᩳ;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
