.class public final Ll/᩸ۤ;
.super Ljava/lang/Object;
.source "F5I3"

# interfaces
.implements Ll/᩹ۤ;


# static fields
.field public static final ֫:Ll/᩸ۤ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 193
    new-instance v0, Ll/᩸ۤ;

    .line 190
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 193
    sput-object v0, Ll/᩸ۤ;->֫:Ll/᩸ۤ;

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/CharSequence;)I
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x2

    :goto_0
    if-ge v1, p1, :cond_2

    if-ne v2, v0, :cond_2

    .line 185
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v2

    sget-object v3, Ll/ۗۤ;->ܽ:Ll/ܶۤ;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-eq v2, v3, :cond_0

    if-eq v2, v0, :cond_0

    packed-switch v2, :pswitch_data_0

    const/4 v2, 0x2

    goto :goto_1

    :cond_0
    :pswitch_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :pswitch_1
    const/4 v2, 0x1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
