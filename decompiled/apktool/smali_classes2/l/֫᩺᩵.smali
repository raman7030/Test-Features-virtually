.class public abstract Ll/֫᩺᩵;
.super Ljava/lang/Object;
.source "Q7W7"


# instance fields
.field public final synthetic ֫:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫᩺᩵;->֫:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/۬ۛ֡;II)Ll/᩵۬֡;
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 59
    new-instance p0, Ll/ܶ᩵ۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const/4 p1, 0x0

    const-string v0, "Invalid reference type: %d"

    .line 46
    invoke-direct {p0, p1, v0, p2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    throw p0

    .line 55
    :pswitch_0
    new-instance p1, Ll/᩸ܰ֡;

    invoke-direct {p1, p0, p2}, Ll/᩸ܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object p1

    .line 57
    :pswitch_1
    new-instance p1, Ll/۠ܰ֡;

    invoke-direct {p1, p0, p2}, Ll/۠ܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object p1

    .line 53
    :pswitch_2
    new-instance p1, Ll/᩶ܰ֡;

    invoke-direct {p1, p0, p2}, Ll/᩶ܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object p1

    .line 49
    :pswitch_3
    invoke-virtual {p0, p2}, Ll/۬ۛ֡;->ܳ(I)Ll/ۗܰ֡;

    move-result-object p0

    return-object p0

    .line 51
    :pswitch_4
    invoke-virtual {p0, p2}, Ll/۬ۛ֡;->ܽ(I)Ll/ܶܰ֡;

    move-result-object p0

    return-object p0

    .line 47
    :pswitch_5
    new-instance p1, Ll/۫ܰ֡;

    invoke-direct {p1, p0, p2}, Ll/۫ܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object p1

    .line 45
    :pswitch_6
    new-instance p1, Ll/۬ܰ֡;

    invoke-direct {p1, p0, p2}, Ll/۬ܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/֫᩺᩵;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 70
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract ֫([BII)I
.end method

.method public abstract ֫(Ljava/lang/String;)Ll/۟۬ۘ;
.end method

.method public abstract ֫(Ll/ۗ᩶ۘ;Ll/۫۬ۘ;)V
.end method
