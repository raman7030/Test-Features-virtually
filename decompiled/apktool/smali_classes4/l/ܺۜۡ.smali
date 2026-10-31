.class public abstract Ll/ܺۜۡ;
.super Ljava/lang/Object;
.source "98W2"


# instance fields
.field public final ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput p1, p0, Ll/ܺۜۡ;->֫:I

    return-void
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ܺۜۡ;
    .locals 2

    .line 56
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-eqz v0, :cond_0

    packed-switch v0, :pswitch_data_0

    .line 75
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown action: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 73
    :pswitch_0
    new-instance v0, Ll/ۡۜۡ;

    invoke-direct {v0, p0}, Ll/ۡۜۡ;-><init>(Ll/۬ۜܽ;)V

    return-object v0

    .line 71
    :pswitch_1
    new-instance p0, Ll/᩷ۜۡ;

    const/4 v0, 0x7

    .line 323
    invoke-direct {p0, v0}, Ll/ܺۜۡ;-><init>(I)V

    return-object p0

    .line 69
    :pswitch_2
    new-instance v0, Ll/۟᩻ۡ;

    invoke-direct {v0, p0}, Ll/۟᩻ۡ;-><init>(Ll/۬ۜܽ;)V

    return-object v0

    .line 67
    :pswitch_3
    new-instance v0, Ll/ܳۜۡ;

    invoke-direct {v0, p0}, Ll/ܳۜۡ;-><init>(Ll/۬ۜܽ;)V

    return-object v0

    .line 65
    :pswitch_4
    new-instance v0, Ll/ۜۜۡ;

    invoke-direct {v0, p0}, Ll/ۜۜۡ;-><init>(Ll/۬ۜܽ;)V

    return-object v0

    .line 63
    :pswitch_5
    new-instance v0, Ll/ۧۜۡ;

    invoke-direct {v0, p0}, Ll/ۧۜۡ;-><init>(Ll/۬ۜܽ;)V

    return-object v0

    .line 61
    :pswitch_6
    new-instance v0, Ll/᩻ۜۡ;

    invoke-direct {v0, p0}, Ll/᩻ۜۡ;-><init>(Ll/۬ۜܽ;)V

    return-object v0

    .line 59
    :cond_0
    sget-object p0, Ll/֫ۜۡ;->ۧ:Ll/֫ۜۡ;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 50
    iget v0, p0, Ll/ܺۜۡ;->֫:I

    return v0
.end method

.method public abstract ֫(Ll/ۗܺ᩷;)V
.end method
