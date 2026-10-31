.class public final synthetic Ll/۫᩵ᩳ;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ll/᩸ۜ᩵;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫᩵ᩳ;->᩸:I

    iput-object p2, p0, Ll/۫᩵ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/۫᩵ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/۫᩵ᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩻۬ᩳ;

    .line 11
    check-cast p1, Ljava/lang/Long;

    .line 14
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, Ll/᩻۬ᩳ;->ۧ(J)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    .line 22
    :pswitch_0
    iget-object v0, p0, Ll/۫᩵ᩳ;->᩹:Ljava/lang/Object;

    .line 24
    check-cast v0, Ll/ۨ᩵ᩳ;

    .line 26
    check-cast p1, Ljava/lang/Void;

    .line 535
    invoke-virtual {v0}, Ll/ۨ᩵ᩳ;->ۧ()Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
