.class public final synthetic Ll/᩹ܿ֨;
.super Ljava/lang/Object;
.source "L7ER"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۢܽ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۢܽ֨;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩹ܿ֨;->᩸:I

    iput-object p1, p0, Ll/᩹ܿ֨;->᩹:Ll/ۢܽ֨;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 2
    iget v0, p0, Ll/᩹ܿ֨;->᩸:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Ll/᩹ܿ֨;->᩹:Ll/ۢܽ֨;

    packed-switch v0, :pswitch_data_0

    .line 11
    check-cast v3, Ll/ۨ֫֨;

    .line 79
    iget v0, v3, Ll/ۨ֫֨;->ۗ֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const-string v0, "#%d;"

    .line 19
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    check-cast v3, Ll/۬ܿ֨;

    .line 337
    iget v0, v3, Ll/۬ܿ֨;->֡ۧ:I

    .line 338
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v4, v3, Ll/۬ܿ֨;->ۖۧ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v3, v3, Ll/۬ܿ֨;->ܺۧ:[I

    invoke-static {v3}, Ll/ᩴۗۚ;->֫([I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v1

    aput-object v4, v5, v2

    const/4 v0, 0x2

    aput-object v3, v5, v0

    const-string v0, " append_frame=%d offset=%d numlock=%s"

    .line 19
    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
